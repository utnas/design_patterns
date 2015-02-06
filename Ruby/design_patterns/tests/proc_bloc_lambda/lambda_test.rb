require 'rspec'
require '../../src/proc_and_lambda/lambda'

describe 'using lambda' do

  it 'dsd' do
    test_lambda = TestLambda.new
    test_lambda.on_dit_merci_a_qui("bibi") { |name| puts "Merci #{name}" }

    test_lambda.on_dit_merci_a_qui("bibi") do |name|
      puts "Merci #{name}"
    end
  end

end