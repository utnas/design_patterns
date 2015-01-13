var assert = require('assert'),
    Person = require('../../../src/mixin/sub_classing/person');

describe('Mixin pattern - Person', function () {
    'use strict';

    it('should create person', function () {
        var clark = new Person('Clark', 'Kent');
        assert.equal(clark.firstName, 'Clark');
        assert.equal(clark.lastName, 'Kent');
        assert.equal(clark.gender, 'male');
    });
});