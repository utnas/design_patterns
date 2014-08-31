require 'rspec'
require '../../src/factory/car'
require '../../src/factory/car_factory'
require '../../src/factory/ford_fiesta'
require '../../src/factory/ford_focus'

describe 'Make car with ford as model' do

  it 'should create a new Ford Fiesta' do
    factory = CarFactory.new
    ford = factory.make_car('Fiesta')

    expect(ford.get_name).to eq('Fiesta')
  end

  it 'should create a new Ford Fiesta' do
    factory = CarFactory.new
    ford = factory.make_car('Focus')

    expect(ford.get_name).to eq('Focus')
  end
end