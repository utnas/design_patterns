var car_module = require('./car');

exports.FordFiesta = function(options) {
    'use strict';
    return new car_module.Car(options);
};
