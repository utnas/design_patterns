require 'test/unit'
require '../../src/facade/code'
require '../../src/facade/user'

class UserTest < Test::Unit::TestCase

  def test_should_update_code
    user = User.new('Dooley')
    code = Code.new

    assert_equal(code.get_length, 0)
    user.commit(code)
    assert_equal(code.get_length, 1)
  end

  def test_should_have_notification
    user = User.new('Dooley')

    user.receive_notification('A new notification')
    assert_equal(user.get_notification, 'A new notification')
  end
end