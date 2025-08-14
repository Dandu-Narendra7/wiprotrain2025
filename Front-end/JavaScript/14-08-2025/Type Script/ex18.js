var HttpStatusCode = /** @class */ (function () {
    function HttpStatusCode() {
    }
    HttpStatusCode.OK = 200;
    HttpStatusCode.NOT_FOUND = 404;
    HttpStatusCode.ACCESS_DENIED = 403;
    HttpStatusCode.INTERNAL_ERROR = 500;
    return HttpStatusCode;
}());
console.log(HttpStatusCode.OK);
console.log(HttpStatusCode.NOT_FOUND);
console.log(HttpStatusCode.ACCESS_DENIED);
console.log(HttpStatusCode.INTERNAL_ERROR);
