require '../../src/facade/observer'

class User < Observer

  def initialize(name)
    @name = name
    @last_notification = ''
  end

  def get_name
    @name
  end
end