defmodule Secrets do
  @spec secret_add(number :: number) :: (number -> number)
  def secret_add(secret) do
    fn param -> param + secret end
  end

  @spec secret_subtract(number :: number) :: (number -> number)
  def secret_subtract(secret) do
    fn param -> param - secret end
  end

  @spec secret_multiply(number :: number) :: (number -> number)
  def secret_multiply(secret) do
    fn param -> param * secret end
  end

  @spec secret_divide(number :: number) :: (number -> number)
  def secret_divide(secret) do
    fn param -> div(param, secret) end
  end

  @spec secret_and(number :: number) :: (number -> number)
  def secret_and(secret) do
    fn param -> Bitwise.band(param, secret) end
  end

  @spec secret_xor(number :: number) :: (number -> number)
  def secret_xor(secret) do
    fn param -> Bitwise.bxor(param, secret) end
  end

  @spec secret_combine((number -> number), (number -> number)) :: (number -> number)
  def secret_combine(secret_function1, secret_function2) do
    fn param -> secret_function2.(secret_function1.(param)) end
  end
end
