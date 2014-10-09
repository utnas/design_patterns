exports.Car = function (options) {
    'use strict';
    var _options = {};

    if (options !== undefined) {
        _options.model = options.model;
        _options.version = options.version;
        _options.year = options.year;
    }

    this.getOptions = function () {
        return _options;
    };
};