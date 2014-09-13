var observer = require('./observer');

exports.Code = function Code() {
    'use strict';
    return new observer.Observer();
};