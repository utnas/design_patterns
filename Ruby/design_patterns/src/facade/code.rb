require '../../src/facade/observable'

class Code < Observable

  def get_last_modifier
    @modifiers.last
  end
end