var Car = require('./car').Car;
var Fiesta = require('./ford_fiesta').FordFiesta;
var Focus = require('./ford_focus').FordFocus;

exports.Factory = function () {
    'use strict';
    this.makeCar = function makeCar(option) {
        switch (option) {
            case 'FIESTA':
                var fordFiesta = new Fiesta({model: 'Fiesta', version: '90-TDI'});
                return fordFiesta;
            case 'FOCUS':
                var fordFocus = new Focus({model: 'Focus', version: '230-TDI'});
                return fordFocus;
            default:
                var car = new Car({model: '', version: ''});
                return car;
        }
    };
};