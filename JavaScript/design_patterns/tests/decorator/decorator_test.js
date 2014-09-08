var computer = require('../../src/decorator/computer');
var decorator_module = require('../../src/decorator/decorator');

var assert = require('assert');

describe('Factory tests', function () {
    'use strict';

    describe('Decorate the computer', function () {
        it('should return the cost of the computer', function () {
            var macBook = new computer.Computer('MacBook Pro', 990, 13);
            assert.equal(macBook.getCost(), '990');
            assert.equal(macBook.getModel(), 'MacBook Pro');
            assert.equal(macBook.getSize(), '13');
        });
    });

    describe('Decorator off a computer', function () {
        it('should decorate computer with memory and hard drive price', function () {
            var macBook = new computer.Computer('MacBook Pro', 990, 13);
            var decorator = new decorator_module.Decorator();
            assert.equal(macBook.getCost(), 990);
            decorator.memory(macBook);
            assert.equal(macBook.getCost(), 1065);
            decorator.hardDrive(macBook);
            assert.equal(macBook.getCost(), 1315)
        });
    });
});