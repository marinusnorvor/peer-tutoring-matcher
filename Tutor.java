public class Tutor extends User {

    // Constructor
    public Tutor(String id, String name, String email, String passwordHash) {
        super(id, name, email, passwordHash);
    }

    // Implementing the abstract method
    @Override
    public String getRole() {
        return "TUTOR";
    }
}
