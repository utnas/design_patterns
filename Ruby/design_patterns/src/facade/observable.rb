class Observable

  def initialize
    @length = 0
    @modifiers = Array.new
    @observers = Array.new
  end

  def increment_length
    @length = @length +1
  end

  def add_observer(observer)
    @observers.push(observer)
  end

  def remove_observer(observer)
    @observers.delete(observer)
  end

  def trigger_notification
    notify_all
  end

  def add_modifier(name)
    @modifiers.push(name)
  end

  def notify_all
    @observers.each do |observer|
      observer.receive_notification('A notification was sent')
    end
  end

  def get_observers
    @observers
  end

  def get_length
    @length
  end
end