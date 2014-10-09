var Observer = require('./observer').Observer;

exports.Observable = function () {
    'use strict';

    var size = 0;
    var observers = [];
    var modifiers = {};

    this.addObserver = function addObserver(observer) {
        if (observer instanceof Observer) {
            observers.push(observer);
        }
        return observers;
    };

    this.removeObserver = function removeObserver(observer) {
        if (observer instanceof Observer) {
            var index = observers.indexOf(observer);
            if (index > -1) {
                observers.splice(index);
            }
        }
    };

    this.increaseSize = function () {
        size++;
    };

    this.notifyAll = function notifyAll() {
        var index = 0,
            value = '';

        for (index; index < observers.length; index++) {
            value = observers[index];
            if (value instanceof  Observer) {
                value.addNotification('A new notification was received');
            }
        }
    };

    this.triggerChange = function () {
        notifyAll();
    };

    this.getSize = function gerSize() {
        return size;
    };

    this.getObservers = function () {
        return observers;
    };

    this.getModifiers = function () {
        return modifiers;
    };
};