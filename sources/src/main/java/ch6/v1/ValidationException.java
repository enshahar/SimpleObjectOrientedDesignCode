package ch6.v1;

public class ValidationException extends RuntimeException {
    private AddEmployeeToOfferingValidator.ValidationResult validationResult;

    public ValidationException(AddEmployeeToOfferingValidator.ValidationResult validation) {
        this.validationResult = validation;
    }
}
