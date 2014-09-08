exports.Computer = function Computer(model, basicPrice, size) {
    'use strict';

    var _model = model;
    var _cost = basicPrice;
    var _screenSize = size;

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