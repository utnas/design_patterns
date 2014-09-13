exports.Observer = function Observer() {
    'use strict';

    var size = 0;
    var observers = {};
    var modifiers = {};

    this.update = function update(observable) {
    };

    this.addObserver = function addObserver(observer) {
        if (observer instanceof Observer) {
            observers.add(observer);
        }
        return observers;
    };

    this.removeObserver = function removeObserver(observer) {
        if (observer instanceof Observer) {
            var value;
            for (value in observers) {
                if (value === observer) {
                    return observers.delete(observer);
                }
            }
        }
    };

    this.getSize = function gerSize() {
        return size;
    };

    this.getObservers = function () {
        return observers;
    };

    this.modifiers = function () {
        return modifiers;
    };
};