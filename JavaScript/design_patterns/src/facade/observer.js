var Observable = require('./observable').Observable;

exports.Observer = function (userName) {
    'use strict';
    var name = userName,
        lastNotification = "";

    this.update = function (observable) {
        if (observable instanceof Observable) {
            observable.increaseSize();
            observable.addObserver(name);
            observable.triggerChange();
        }
    };

    this.addNotification = function (notification) {
        lastNotification = notification;
    };


    this.getLastNotification = function () {
        return lastNotification;
    };
};