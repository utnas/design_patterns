exports.Car = function Car(options) {
    'use strict';
    var _options = {};

    if (options !== undefined) {
        _options.model = options.model;
        _options.version = options.version;
        _options.factoryYear = options.factoryYear;
    }

    this.getOptions = function () {
        return _options;
    };
};