class TestLambda

  def initialize

  end

  def on_dit_merci_a_qui(name)
    yield(name) if block_given?
  end

end