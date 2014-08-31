require 'test/unit'
require '../src/visitable'
require '../src/sales'


class GuestTest < Test::Unit::TestCase

  def test_should_have_one_guest
    guest = Visitable::Guest.new('Guest 1')
    morison = Sales.new('Morison')
    guest.accept(morison)
    assert_equal(morison.get_visited.at(0), 'Guest 1')
  end
end