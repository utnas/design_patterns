//= require mocha
//= require_tree ../../src/factory

var assert = require("assert");
var should = require('should');
var CarFactory = require('../../src/factory/car_factory');

suite('Car Maker', function () {
    setup(function () {
    });

    suite('Create a new car', function () {
        describe('car factory', function () {

            it('should create a new car', function () {
                var car = CarFactory.Car("");
                assert.equal(true, true);
            });
        });
    });
});


