var Computer = require('./computer').Computer;

exports.Decorator = function () {
    'use strict';

    this.memory = function memory(computer) {
        if (computer instanceof Computer) {
            var cost = computer.getCost();
            computer.getCost = function () {
                return cost + 75;
            }
        }
    };

    this.hardDrive = function hardDrive(computer) {
        if (computer instanceof Computer) {
            var cost = computer.getCost();
            computer.getCost = function () {
                return cost + 250;
            }
        }
    };
};