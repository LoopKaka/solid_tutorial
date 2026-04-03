const Bird = require("./Bird");

class Parrot extends Bird {
    fly() {
        console.log("Parrot is flying");
    }

    walk() {
        console.log("Parrot is walking");
    }
}

module.exports = Parrot;
