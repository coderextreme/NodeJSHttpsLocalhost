# NodeJSHttpsLocalhost
A Node.JS https server @ localhost

Usage:

```
git clone https://github.com/coderextreme/NodeJSHttpsLocalhost
cd NodeJSHttpsLocalhost
npm install
openssl req -nodes -new -x509 -keyout server.key -out server.cert
npm run start
```
go to https://localhost:3000/index.html in your web browser

The X3dom example doesn't work yet.  Help is welcome.

When setting up keys, be sure to use localhost for Common Name.
