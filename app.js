// --- START OF FILE app.js (or app.mjs) ---

import express from 'express';
import favicon from 'serve-favicon';
import cors from 'cors';
import fs from 'fs';
import https from 'https';
import path from 'path';
import { fileURLToPath } from 'url';

// Recreate __dirname for ES modules
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

const app = express();
const port = process.env.PORT || 3000;

// Serve static files from the current directory first.
app.use(express.static(__dirname));
app.use(favicon(path.join(__dirname, 'favicon.ico')));

/**
 * Creates a route handler for a given file extension and MIME type.
 * @param {string} extension - The file extension (e.g., "gif", "js").
 * @param {string} mimeType - The MIME type (e.g., "image/gif").
 */
function createFileHandler(extension, mimeType) {
    // Use a regular expression to match any path ending with the given extension.
    const routePattern = new RegExp(`.*\\.${extension}$`);

    app.get(routePattern, cors(), (req, res, next) => {
        let filePath = req.path;

        if (filePath.startsWith('/')) {
            filePath = filePath.substring(1);
        }

        try {
            if (fs.existsSync(filePath)) {
                const data = fs.readFileSync(filePath);
                res.type(mimeType).send(data);
            } else {
                next();
            }
        } catch (err) {
            console.error(err);
            next(err);
        }
    });
}

// Register all the file handlers
createFileHandler("gif", "image/gif");
createFileHandler("ico", "image/x-icon");
createFileHandler("jpg", "image/jpeg");
createFileHandler("JPG", "image/jpeg");
createFileHandler("jpeg", "image/jpeg");
createFileHandler("png", "image/png");
createFileHandler("mpg", "video/mpeg");
createFileHandler("mp4", "video/mp4");
createFileHandler("ogv", "video/ogg");
createFileHandler("wav", "audio/wav");
createFileHandler("mp3", "audio/mpeg3");
createFileHandler("ply", "application/octet-stream");
createFileHandler("stl", "application/octet-stream");
createFileHandler("vs", "text/plain");
createFileHandler("fs", "text/plain");
createFileHandler("js", "text/javascript");
createFileHandler("mjs", "text/javascript");
createFileHandler("csv", "text/csv");
createFileHandler("xhtml", "application/xhtml+xml");
createFileHandler("html", "text/html");
createFileHandler("xslt", "text/xsl");
createFileHandler("css", "text/css");
createFileHandler("swf", "application/x-shockwave-flash");
createFileHandler("json", "text/json");
createFileHandler("x3d", "model/x3d+xml");
createFileHandler("wrl", "model/vrml");
createFileHandler("gltf", "text/json");
createFileHandler("glb", "application/octet-stream");
createFileHandler("xml", "text/xml");
createFileHandler("ttf", "font/ttf");

// HTTPS Server Setup
try {
    const options = {
        key: fs.readFileSync('server.key'),
        cert: fs.readFileSync('server.cert')
    };

    https.createServer(options, app)
        .listen(port, () => {
            console.log(`Example app listening on port ${port}! Go to https://localhost:${port}/index.html`);
        });
} catch (e) {
    console.error("Could not start HTTPS server. Do you have 'server.key' and 'server.cert' in the root directory?");
    console.error(e.message);
}
