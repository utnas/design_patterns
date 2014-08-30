module Guest

  class Guested
    def initialize(name)
      @name = name
    end

    def accept(sales)
      sales.visit(self)
    end

    public
    def get_name
      @name
    end
  end
end