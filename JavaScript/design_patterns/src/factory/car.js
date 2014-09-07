exports.car = (function () {
    'use strict';

    function Car(options) {
        this.model = options.model;
        this.version = options.version;
        this.factoryYear = options.factoryYear;
    }
})();