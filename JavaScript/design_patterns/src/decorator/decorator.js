var computer_module = require('./computer');

exports.Decorator = function Decorator() {
    'use strict';

    this.memory = (function memory(computer) {
        if (computer instanceof computer_module.Computer) {
            var cost = computer.getCost();
            computer.getCost = function () {
                return cost + 75;
            }
        }
    });

    this.hardDrive = (function hardDrive(computer) {
        if (computer instanceof computer_module.Computer) {
            var cost = computer.getCost();
            computer.getCost = function () {
                return cost + 250;
            }
        }
    });
};