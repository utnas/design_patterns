var car_module = require('./car');

exports.FordFiesta = function FordFiesta(options) {
    'use strict';
    return new car_module.Car(options);
};
