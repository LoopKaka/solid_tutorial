const IWorker = require("./IWorker");

class SuperWorker extends IWorker {
    work() {
        console.log("SuperWorker is working");
    }

    feed() {
        console.log("SuperWorker is having food");
    }
}

module.exports = SuperWorker;
