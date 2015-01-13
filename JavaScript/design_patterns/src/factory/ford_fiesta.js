var Car = require('./car').Car;

exports.FordFiesta = (function (options) {
    'use strict';

    return new Car(options);
});
