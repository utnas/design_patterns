var CarInterface = require('./car_interface');

var Car = function (options) {
    var _options = {};
    if (options !== undefined) {
        _options.model = options.model;
        _options.version = options.version;
        _options.year = options.year;
    }
};

Car = Object.create(CarInterface);

Car.prototype.getOptions = function () {
    return this._options;
};

module.exports = Car;