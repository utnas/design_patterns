require '../../src/facade/observer'

class User < Observer

  def initialize(name)
    @name = name
  end

  def get_name
    @name
  end
end