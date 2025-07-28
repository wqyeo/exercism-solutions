defmodule Lasagna do
  def expected_minutes_in_oven() do
    40
  end

  def remaining_minutes_in_oven(minutes_passed) do
    expected_minutes_in_oven() - minutes_passed
  end

  def preparation_time_in_minutes(layers_added) do
    layers_added * 2
  end

  def total_time_in_minutes(layers_added, oven_time) do
    preparation_time_in_minutes(layers_added) + oven_time
  end

  def alarm() do
    "Ding!"
  end
end
