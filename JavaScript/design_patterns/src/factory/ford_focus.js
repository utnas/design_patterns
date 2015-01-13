var Car = require('./car').Car;

exports.FordFocus = (function (options) {
    'use strict';

    return new Car(options);
});