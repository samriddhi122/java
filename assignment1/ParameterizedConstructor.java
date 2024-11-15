package assignment1;

class ParameterizedConstructor {
    private String message;

    public ParameterizedConstructor(String message) {
        this.message = message;
        System.out.println("Message: " + this.message);
    }

    public static void main(String[] args) {
        new ParameterizedConstructor("Hello from parameterized constructor!");
    }
}

