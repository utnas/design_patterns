class Sales

  include Guest

  def initialize(name)
    @name = name
  end

  def visit(subject)
    @visited = subject.get_name
  end

  public
  def get_name
    @name
  end

  def get_visited
    @visited
  end
end