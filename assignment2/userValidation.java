package assignment2;
// Custom exception class for invalid credentials
class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

public class userValidation {
    // Method to validate username and password
    public static void validateCredentials(String username, String password) throws InvalidCredentialsException {
        String correctPassword = "securePassword"; // Predefined correct password

        if (username.length() < 6) {
            throw new InvalidCredentialsException("Username must be at least 6 characters long.");
        }

        if (!password.equals(correctPassword)) {
            throw new InvalidCredentialsException("Password does not match.");
        }
    }

    public static void main(String[] args) {
        String username = "user"; // Example username
        String password = "wrongPassword"; // Example password

        try {
            validateCredentials(username, password);
            System.out.println("Login successful!");
        } catch (InvalidCredentialsException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
