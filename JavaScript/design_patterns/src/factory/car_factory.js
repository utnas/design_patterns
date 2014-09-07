var car_module = require('./car');
var fiesta_module = require('./ford_fiesta');
var focus_module = require('./ford_focus');

exports.Factory = function CarFactory() {
    'use strict';
    this.makeCar = (function makeCar(option) {
        switch (option) {
            case 'FIESTA':
                var fordFiesta = new fiesta_module.FordFiesta({model: 'Fiesta', version: '90-TDI'});
                return fordFiesta;
            case 'FOCUS':
                var fordFocus = new focus_module.FordFocus({model: 'Focus', version: '230-TDI'});
                return fordFocus;
            default:
                var car = new car_module.Car({model: '', version: ''});
                return car;
        }
    });
};