exports.Computer = function Computer(theModel, basicPrice, theSize) {
    'use strict';

    var model = theModel;
    var cost = basicPrice;
    var screenSize = theSize;

    this.getCost = function () {
        return cost;
    };

    this.getSize = function () {
        return screenSize;
    };

    this.getModel = function () {
        return model;
    };
};