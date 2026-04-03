const IWorker = require("./IWorker");

class Worker extends IWorker {
    work() {
        console.log("Worker is working");
    }

    feed() {
        console.log("Worker is having food");
    }
}

module.exports = Worker;
