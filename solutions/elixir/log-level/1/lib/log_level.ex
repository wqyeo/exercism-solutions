defmodule LogLevel do
  def to_label(level, legacy?) do
    cond do
      level == 0 && !legacy? -> :trace
      level == 0 && legacy? -> :unknown
      level == 1 -> :debug
      level == 2 -> :info
      level == 3 -> :warning
      level == 4 -> :error
      level == 5 && !legacy? -> :fatal
      level == 5 && legacy? -> :unknown
      true -> :unknown
    end
  end

  def alert_recipient(level, legacy?) do
    log_level = to_label(level, legacy?)
    cond do
      log_level == :error || log_level == :fatal -> :ops
      log_level == :unknown && legacy? -> :dev1
      log_level == :unknown -> :dev2
      true -> false
    end
  end
end
