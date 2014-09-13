var observer = require('./observable');

exports.Code = function Code() {
    'use strict';
    return new observer.Observable();
};