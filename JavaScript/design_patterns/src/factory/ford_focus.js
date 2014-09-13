var car_module = require('./car');

exports.FordFocus = function (options) {
    'use strict';
    return new car_module.Car(options);
};