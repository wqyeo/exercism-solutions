class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }

        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }

        try {
            int operandResult;
            switch (operation) {
                case "+":
                    operandResult = operand1 + operand2;
                    return String.format("%d + %d = %d", operand1, operand2, operandResult);
                case "*":
                    operandResult = operand1 * operand2;
                    return String.format("%d * %d = %d", operand1, operand2, operandResult);
                case "/":
                    operandResult = operand1 / operand2;
                    return String.format("%d / %d = %d", operand1, operand2, operandResult);
                default:
                    String exceptionMessage = String.format("Operation '%s' does not exist", operation);
                    throw new IllegalOperationException(exceptionMessage);
            }
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }
}
