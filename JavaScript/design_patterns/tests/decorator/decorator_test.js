var computer = require('../../src/decorator/computer');

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

});