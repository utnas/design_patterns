require 'rspec'
require '../src/sales'
require '../src/visitable'

describe 'Visit zero guest' do
  it 'should have visited equals to zero' do
    sale = Sales.new 'James'
    expect(sale.get_visited.size == 0)
  end
end

describe 'Visit a guest' do
  it 'should have visited list has one visit planned' do
    sale = Sales.new 'Ryan'
    sale.visit(Visitable::Guest.new('Rails Of Mount'))
    expect(sale.get_visited).to include('Rails Of Mount')
  end

end