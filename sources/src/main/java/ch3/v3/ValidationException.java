package ch3.v3;

public class ValidationException extends RuntimeException {
    private AddEmployeeToOfferingValidator.ValidationResult validationResult;

    public ValidationException(AddEmployeeToOfferingValidator.ValidationResult validation) {
        this.validationResult = validation;
    }
}
