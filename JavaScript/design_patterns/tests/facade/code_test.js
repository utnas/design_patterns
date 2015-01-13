var Code = require('../../src/facade/code').Code,
    User = require('../../src/facade/user').User,
    assert = require('assert');

describe('Code facade tests', function () {
    'use strict';

    it('should increase the size of Code', function () {
        var myCode = new Code();

        assert.equal(myCode.getSize(), 0);
        myCode.increaseSize();
        assert.equal(myCode.getSize(), 1);
    });

    it('should add a new observer', function () {
        var code = new Code();
        var observer = new User('Dooley');

        assert.equal(code.getObservers().length, 0);
        code.addObserver(observer);
        assert.equal(code.getObservers().length, 1);
    });

    it('should remove a observer', function () {
        var code = new Code();
        var observer = new User('Dooley');

        assert.equal(code.getObservers().length, 0);
        code.addObserver(observer);
        assert.equal(code.getObservers().length, 1);
        code.removeObserver(observer);
        assert.equal(code.getObservers().length, 0);
    });

    it('should notify all observers', function () {
        var code = new Code();
        var dooley = new User('Dooley');
        var lucy = new User('Lucy');
        var christel = new User('Christel');

        code.addObserver(dooley);
        code.addObserver(lucy);
        code.addObserver(christel);
        code.notifyAll();

        assert.equal(dooley.getLastNotification(), 'A new notification was received');
        assert.equal(lucy.getLastNotification(), 'A new notification was received');
        assert.equal(christel.getLastNotification(), 'A new notification was received');
    });
});


