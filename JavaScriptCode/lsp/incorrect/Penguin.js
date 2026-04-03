const Bird = require("./Bird");

class Penguin extends Bird {
    fly() {
        throw new Error("Penguin can't 'fly'");
    }

    walk() {
        console.log("Penguin is walking");
    }
}

module.exports = Penguin;
