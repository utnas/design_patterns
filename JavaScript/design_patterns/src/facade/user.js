var Observer = require('./observer');

exports.User = function () {
    'use strict';
    return new Observer.Observer();
};