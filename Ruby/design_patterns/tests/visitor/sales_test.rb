require 'test/unit'
require '../src/visitable'
require '../src/sales'

class SalesTest < Test::Unit::TestCase

  def test_should_fail
    sale = Sales.new 'Jay'
    sale.visit(Visitable::Guest.new('Art Italy'))
    assert_not_equal(sale.get_visited, 'Art Italia')
  end

  def test_should_
    sale = Sales.new 'Jay'

    to_be_visited = create_guests('Art Italy', 'My Home sweet', 'Our Solutions')

    to_be_visited.each do |subject|
      sale.visit(subject)
    end

    assert_includes(sale.get_visited, 'Art Italy')
    assert_includes(sale.get_visited, 'My Home sweet')
    assert_includes(sale.get_visited, 'Our Solutions')
  end

  private
  def create_guests(value1, value2, value3)
    result = Array.new
    result.push(Visitable::Guest.new(value1))
    result.push(Visitable::Guest.new(value2))
    result.push(Visitable::Guest.new(value3))
    result
  end
end