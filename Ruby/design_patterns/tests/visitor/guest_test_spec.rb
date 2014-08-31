require 'rspec'
require '../src/sales'
require '../src/visitable'

describe 'Visitation list' do

  it 'should have visitation list none empty' do
    book = Array.new

    book.push(Visitable::Guest.new('Guest 1'))
    book.push(Visitable::Guest.new('Guest 2'))
    book.push(Visitable::Guest.new('Guest 3'))

    morison = Sales.new('Morison')

    book.each do |guest|
      guest.accept(morison)
    end

    expect(morison.get_visited.size).to eq(3)
  end
end