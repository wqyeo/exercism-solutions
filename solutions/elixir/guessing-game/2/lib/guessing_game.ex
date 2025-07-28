defmodule GuessingGame do
  def compare(_secret_number, nil), do: "Make a guess"
  
  def compare(secret_number, guess) when secret_number == guess do
    "Correct"
  end

  def compare(secret_number, guess) when abs(secret_number - guess) == 1 do
    "So close"
  end

  def compare(secret_number, guess) when guess - secret_number > 0 do
    "Too high"
  end

  def compare(secret_number, guess) when guess - secret_number < 0 do
    "Too low"
  end

  def compare(_secret_number, _guess), do: "Make a guess"
  def compare(_), do: "Make a guess"
end