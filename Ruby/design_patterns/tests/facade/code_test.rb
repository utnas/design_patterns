require 'test/unit'
require '../../src/facade/code'
require '../../src/facade/user'
require '../../tests/facade/test_helper'

class CodeTest < Test::Unit::TestCase

  include TestHelper

  def test_should_increment_length
    code = Code.new

    assert_equal(code.get_length, 0)
    code.increment_length
    code.increment_length
    assert_equal(code.get_length, 2)
  end

  def test_should_add_observer
    code = Code.new
    dooley = create_user('Dooley')
    code.add_observer(dooley)
    assert_includes(code.get_observers, dooley)
  end

  def test_should_notify_all
    code = Code.new
    dooley = create_user('Dooley')
    code.add_observer(dooley)
    lucy = create_user('Lucy')
    code.add_observer(lucy)

    assert_equal(dooley.get_notification, '')
    assert_equal(dooley.get_notification, '')

    code.notify_all

    assert_equal(dooley.get_notification, 'A notification was sent')
    assert_equal(lucy.get_notification, 'A notification was sent')
  end

  def test_should_remove_observer
    code = Code.new

    dooley = create_user('Dooley')
    code.add_observer(dooley)
    code.remove_observer(dooley)
    assert_not_include(code.get_observers, dooley)
  end

  def test_should_add_modifier
    code = Code.new
    code.add_modifier('Dooley')
    assert_equal(code.get_last_modifier, 'Dooley')
  end

end