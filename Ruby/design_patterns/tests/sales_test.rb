require 'test/unit'
require '../src/guest'
require '../src/sales'

class SalesTest < Test::Unit::TestCase

  def test_should_fail
    sale = Sales.new 'Jay'
    sale.visit(Guest::Guested.new('Art Italy'))
    assert_not_equal(sale.get_visited, 'Art Italy')
  end
end