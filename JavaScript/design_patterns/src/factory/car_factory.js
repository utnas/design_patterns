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

exports.FordFiesta = function FordFiesta(options) {
    'use strict';
    return new exports.Car(options);
};


exports.FordFocus = function FordFocus(options) {
    'use strict';
    return new exports.Car(options);
};

exports.CarFactory = function CarFactory() {
    'use strict';
    this.makeCar = (function makeCar(option) {
        switch (option) {
            case 'FIESTA':
                var fordFiesta = new exports.FordFiesta({'model': 'Fiesta', 'version': '90-TDI'});
                return fordFiesta;
            case 'FOCUS':
                var fordFocus = new exports.FordFocus({'model': 'Focus', 'version': '90-TDI'});
                return fordFocus;
            default:
                var car = new Car({'model': '', 'version': ''});
                return car;
        }
    });
};