class Observer

  def commit(observable)
    observable.increment_length
    observable.add_modifier(@name)
    observable.trigger_notification
  end

  def receive_notification(message)
    @last_notification = message
  end

  def get_notification
    @last_notification
  end
end