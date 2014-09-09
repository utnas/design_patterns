var computer = require('../../src/decorator/computer');
var decorator_module = require('../../src/decorator/decorator');

var assert = require('assert');

describe('Factory tests', function () {
    'use strict';

    describe('Decorate the computer', function () {
        it('should return the cost of the computer', function () {
            var macBook = instantiateComputer();
            assert.equal(macBook.getCost(), '990');
        });

        it('should return the model of the computer', function () {
            var macBook = instantiateComputer();
            assert.equal(macBook.getModel(), 'MacBook Pro');
        });

        it('should return the size of the computer', function () {
            var macBook = instantiateComputer();
            assert.equal(macBook.getSize(), '13');
        });
    });

    describe('Decorator of a computer', function () {

        it('should retrieve the basic price of the computer', function () {
            var macBook = instantiateComputer();
            assert.equal(macBook.getCost(), 990);
        });

        it('should decorate computer with the memory price', function () {
            var macBook = instantiateComputer();
            var decorator = new decorator_module.Decorator();
            decorator.memory(macBook);
            assert.equal(macBook.getCost(), 1065);
        });

        it('should add computer with the hard-drive price', function () {
            var macBook = instantiateComputer();
            var decorator = new decorator_module.Decorator();
            decorator.hardDrive(macBook);
            assert.equal(macBook.getCost(), 1240)
        });

        it('should decorate the computer with memory then hard-drive', function () {
            var macBook = instantiateComputer();
            var decorator = new decorator_module.Decorator();
            decorator.memory(macBook);
            decorator.hardDrive(macBook);
            assert.equal(macBook.getCost(), 1315)
        });

        it('should decorate the computer with hard-drive then memory', function () {
            var macBook = instantiateComputer();
            var decorator = new decorator_module.Decorator();
            decorator.hardDrive(macBook);
            decorator.memory(macBook);
            assert.equal(macBook.getCost(), 1315)
        });
    });
});

function instantiateComputer(model, price, size) {
    model = model || 'MacBook Pro';
    price = price || 990;
    size = size || 13;
    return new computer.Computer(model, price, size);
}