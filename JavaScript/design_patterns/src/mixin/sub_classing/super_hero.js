var Person = require('./person');

module.exports = function SuperHero(first, last, power) {
    'use strict';

    Person.call(this, first, last);
    this.power = power;
};