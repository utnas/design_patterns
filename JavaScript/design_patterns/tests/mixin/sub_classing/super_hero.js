var assert = require('assert'),
    SuperHero = require('../../../src/mixin/sub_classing/super_hero');

describe('Mixin pattern - Super man', function () {
    'use strict';

    var superMan = new SuperHero('Clark', 'Kent', ['flight', 'heat-vision']);
    assert.equal(superMan.firstName, 'Clark');
    assert.equal(superMan.lastName, 'Kent');
    assert.equal(superMan.gender, 'male');
    assert.deepEqual(superMan.power, ['flight', 'heat-vision']);
});