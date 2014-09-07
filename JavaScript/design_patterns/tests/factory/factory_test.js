var CarFactory = require('../../src/factory/car_factory');

var assert = require("assert");

describe('Factory pattern', function () {

    describe('Get options of a car', function () {
        'use strict';
        it('should return options of a car when the value is present', function () {
            var ford = new CarFactory.Car({'model': 'Focus', 'version': '90-TDI'});
            assert.equal(ford.getOptions().model, 'Focus');
            assert.equal(ford.getOptions().version, '90-TDI');
        });
        it('Should return undefined if no options provided', function () {
            var ford = new CarFactory.Car('');
            assert.equal(ford.getOptions().model, undefined);
            assert.equal(ford.getOptions().version, undefined);
        });
    });

    describe('Car factory make a car', function () {
        "use strict";
        it('Make a ford fiesta', function () {
            var carFactory = new CarFactory.CarFactory();
            var fiesta = carFactory.makeCar('FIESTA');
            assert.equal(fiesta.getOptions().model, 'Fiesta');
            assert.equal(fiesta.getOptions().version, '90-TDI');
        });
    });
});