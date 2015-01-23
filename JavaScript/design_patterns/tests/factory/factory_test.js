var Factory = require('../../src/factory/car_factory').Factory,
    Car = require('../../src/factory/car'),
    assert = require('assert');

describe('Factory pattern', function () {

    describe('Get options of a car_module', function () {

        it('should return model of a car when the value is present', function () {
            var ford = instantiateCar();
            assert.equal(ford.getOptions().model, 'Focus');
        });

        it('should return version of a car when the value is present', function () {
            var ford = instantiateCar();
            assert.equal(ford.getOptions().version, '90-TDI');
        });
    });

    describe('Car factory make a car ford with model fiesta', function () {
        it('should return the model from a ford fiesta options', function () {
            var fiesta = instantiateFactory().makeCar('FIESTA');
            assert.equal(fiesta.getOptions().model, 'Fiesta');
        });

        it('should return the version from a ford fiesta options', function () {
            var fiesta = instantiateFactory().makeCar('FIESTA');
            assert.equal(fiesta.getOptions().version, '90-TDI');
        });

        it('should return the model of a car ford with model focus', function () {
            var focus = instantiateFactory().makeCar('FOCUS');
            assert.equal(focus.getOptions().model, 'Focus');
        });

        it('should return the version of a car ford with model focus', function () {
            var focus = instantiateFactory().makeCar('FOCUS');
            assert.equal(focus.getOptions().version, '230-TDI');
        });
    });

});

function instantiateCar(options) {
    var option = options || {'model': 'Focus', 'version': '90-TDI'};
    return new Car(option);
}

function instantiateFactory() {
    return new Factory();
}
