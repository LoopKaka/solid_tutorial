const IWorker = require("./IWorker");

class Robot extends IWorker {
    work() {
        console.log("Robot is working");
    }

    feed() {
        throw new Error("Unimplemented method 'feed'");
    }
}

module.exports = Robot;
