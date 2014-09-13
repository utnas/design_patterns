var code_module = require('../../src/facade/code');
var observer_module = require('../../src/facade/user');

var assert = require('assert');

describe('Code facade tests', function () {
    'use strict';

    it('should increase the size of Code', function () {
        var myCode = new code_module.Code();

        assert.equal(myCode.getSize(), 0);
        myCode.increaseSize();
        assert.equal(myCode.getSize(), 1);
    });

    it('should add a new observer', function () {
        var code = new code_module.Code();
        var observer = new observer_module.User('Dooley');

        assert.equal(code.getObservers().length, 0);
        code.addObserver(observer);
        assert.equal(code.getObservers().length, 1);
    });

    it('should remove a observer', function () {
        var code = new code_module.Code();
        var observer = new observer_module.User('Dooley');

        assert.equal(code.getObservers().length, 0);
        code.addObserver(observer);
        assert.equal(code.getObservers().length, 1);
        code.removeObserver(observer);
        assert.equal(code.getObservers().length, 0);
    });

    it('should notify all observers', function () {
        var code = new code_module.Code();
        var dooley = new observer_module.User('Dooley');
        var lucy = new observer_module.User('Lucy');
        var christel = new observer_module.User('Christel');

        code.addObserver(dooley);
        code.addObserver(lucy);
        code.addObserver(christel);
        code.notifyAll();

        assert.equal(dooley.getLastNotification(), 'A new notification was received');
        assert.equal(lucy.getLastNotification(), 'A new notification was received');
        assert.equal(christel.getLastNotification(), 'A new notification was received');
    });
});


