class Observable

  def initialize
    @length = 0
    @modifiers = Array.new
    @observers = Array.new
  end

  def increment_length
    @length = @length +1
  end

  def add_observer(name)
    @modifiers.push(name)
  end

  def trigger_notification
    notify_all
  end

  def add_modifier(name)
    @modifiers.push(name)
  end

  def notify_all
    @observers.each do |notifier|
      notifier.add_notification('A notification was sent')
    end
  end

  def get_length
    @length
  end
end