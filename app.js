var express = require('express');
var cors = require('cors');
var fs = require('fs');
var https = require('https');
var app = express();
var port = process.env.PORT || 3000;
var path = require('path');


app.use(express.static('/'));

function send(res, data, type, next) {
	sendNoNext(res, data, type);
	next();
}

function sendNoNext(res, data, type) {
	// console.error("Type", type);
	try {
		if (!type.startsWith("image/")) {
			res.header("Content-Type", type);
		}
	} catch (e) {
		console.error(e);
	}
	res.send(data);
}

function magic(path, type) {
    app.get(path, cors(), function(req, res, next) {
	var url = req._parsedUrl.pathname;
	try {
		while (url.startsWith("/")) {
			url = url.substr(1);
		}
		if (fs.existsSync(url)) {
			var data = fs.readFileSync(url);
			if (type.startsWith("image") || type.startsWith("audio") || type.startsWith("video")) {
				sendNoNext(res, data, type);
			} else {
				sendNoNext(res, data.toString(), type);
			}
		}
	} catch (e) {
		console.error(e);
		next();
	}
    });
}

magic("*.gif", "image/gif");
magic("*.ico", "image/x-icon");
magic("*.jpg", "image/jpeg");
magic("*.JPG", "image/jpeg");
magic("*.jpeg", "image/jpeg");
magic("*.png", "image/png");
magic("*.mpg", "video/mpeg");
magic("*.mp4", "video/mp4");
magic("*.ogv", "video/ogg");
magic("*.wav", "audio/wav");
magic("*.mp3", "audio/mpeg3");
magic("*.ply", "application/octet-stream");
magic("*.stl", "application/octet-stream");
magic("*.vs", "text/plain");//"x-shader/x-vertex");
magic("*.fs", "text/plain");//"x-shader/x-fragment");
magic("*.js", "text/javascript");
magic("*.mjs", "text/javascript");
magic("*.csv", "text/csv");
magic("*.xhtml", "application/xhtml+xml");
magic("*.html", "text/html");
magic("*.xslt", "text/xsl");
magic("*.css", "text/css");
magic("*.swf", "application/x-shockwave-flash");
magic("*.json", "text/json");
magic("*.x3d", "model/x3d+xml");
magic("*.x3d#*", "model/x3d+xml");
magic("*.x3d", "model/x3d+xml");
magic("*.wrl", "model/vrml");
magic("*.gltf", "text/json");
magic("*.glb", "application/octet-stream");
magic("*.xml", "text/xml");
magic("*.ttf", "font/ttf");

https.createServer({
  key: fs.readFileSync('server.key'),
  cert: fs.readFileSync('server.cert')
}, app)
.listen(3000, 'localhost', function () {
  console.log('Example app listening on port 3000! Go to https://localhost:3000/index.html')
})

