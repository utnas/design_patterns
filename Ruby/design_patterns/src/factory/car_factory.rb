class CarFactory
  def make_car(model)
    case model
      when 'Fiesta'
        return FordFiesta.new('Fiesta')
      when 'Focus'
        return FordFocus.new('Focus')
      else
        #do no thing
    end
  end
end