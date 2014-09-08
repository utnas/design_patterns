var computer = require('../../src/decorator/computer');
var decorator_module = require('../../src/decorator/decorator');

var assert = require('assert');

describe('Factory tests', function () {
    'use strict';

    describe('Decorate the computer', function () {
        var macBook = new computer.Computer('MacBook Pro', 990, 13);
        it('should return the cost of the computer', function () {
            assert.equal(macBook.getCost(), '990');
        });

        it('should return the model of the computer', function () {
            assert.equal(macBook.getModel(), 'MacBook Pro');
        });

        it('should return the size of the computer', function () {
            assert.equal(macBook.getSize(), '13');
        });
    });

    describe('Decorator off a computer', function () {
        var macBook = new computer.Computer('MacBook Pro', 990, 13);
        var decorator = new decorator_module.Decorator();

        it('should retrieve the basic price of the computer', function () {
            assert.equal(macBook.getCost(), 990);
        });

        it('should decorate computer with the memory price', function () {
            decorator.memory(macBook);
            assert.equal(macBook.getCost(), 1065);
        });
        it('should decorate computer with the hard drive price', function () {
            decorator.hardDrive(macBook);
            assert.equal(macBook.getCost(), 1315)
        });
    });
});