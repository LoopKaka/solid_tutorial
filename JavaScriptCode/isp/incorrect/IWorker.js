class IWorker {
    work() {
        throw new Error("work() must be implemented");
    }

    feed() {
        throw new Error("feed() must be implemented");
    }
}

module.exports = IWorker;
