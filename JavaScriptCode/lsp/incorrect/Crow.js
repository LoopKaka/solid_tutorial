const Bird = require("./Bird");

class Crow extends Bird {
    fly() {
        console.log("Crow is flying");
    }

    walk() {
        console.log("Crow is wlaking");
    }
}

module.exports = Crow;
