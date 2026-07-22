package AbstractionPackagesHandling.ExceptionHandling;

class InvalidCountryException extends Exception {

    public InvalidCountryException() {
        super();
    }

    public InvalidCountryException(String message) {
        super(message);
    }
}

public class UserRegistration {

    public static void registerUser(String userName, String userCountry)
            throws InvalidCountryException {

        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException(
                    "User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String[] args) {

        try {

            String userName = args[0];
            String userCountry = args[1];

            registerUser(userName, userCountry);

        } catch (InvalidCountryException e) {

            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Please enter Username and Country");
        }
    }
}
