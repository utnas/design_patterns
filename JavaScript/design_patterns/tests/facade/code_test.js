var code_module = require('../../src/facade/code');

var assert = require('assert');

describe('Code facade tests', function () {
    'use strict';

    it('should update the Code', function () {
        var myCode = new code_module.Code();

        assert.equal(myCode.getSize(), 0);
    });

});