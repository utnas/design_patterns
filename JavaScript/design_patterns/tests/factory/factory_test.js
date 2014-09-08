var carFactory = require('../../src/factory/car_factory');
var car = require('../../src/factory/car');

var assert = require('assert');

describe('Factory pattern', function () {
    'use strict';

    describe('Get options of a car_module', function () {
        it('should return options of a car_module when the value is present', function () {
            var ford = new car.Car({'model': 'Focus', 'version': '90-TDI'});
            assert.equal(ford.getOptions().model, 'Focus');
            assert.equal(ford.getOptions().version, '90-TDI');
        });
        it('should return undefined if no option provided', function () {
            var ford = new car.Car('');
            assert.equal(ford.getOptions().model, undefined);
            assert.equal(ford.getOptions().version, undefined);
        });
    });

    describe('Car factory make a car ford with model fiesta', function () {
        it('should make a ford fiesta_module', function () {
            var factory = new carFactory.Factory();
            var fiesta = factory.makeCar('FIESTA');
            assert.equal(fiesta.getOptions().model, 'Fiesta');
            assert.equal(fiesta.getOptions().version, '90-TDI');
        });

        it('should make a car ford with model focus', function () {
            var factory = new carFactory.Factory();
            var focus = factory.makeCar('FOCUS');
            assert.equal(focus.getOptions().model, 'Focus');
            assert.equal(focus.getOptions().version, '230-TDI');
        });
    });

});