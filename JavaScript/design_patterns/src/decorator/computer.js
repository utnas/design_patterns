exports.Computer = function (model, basicPrice, size) {
    'use strict';

    var _model = model,
        _cost = basicPrice,
        _screenSize = size;

    this.getCost = function () {
        return _cost;
    };

    this.getSize = function () {
        return _screenSize;
    };

    this.getModel = function () {
        return _model;
    };

};