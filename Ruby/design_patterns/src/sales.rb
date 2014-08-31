require '../src/visitable'
class Sales

  include Visitable

  def initialize(name)
    @name = name
    @visited = Array.new
  end

  def visit(subject)
    @visited.push subject.get_name
  end

  public
  def get_name
    @name
  end

  def get_visited
    @visited
  end
end