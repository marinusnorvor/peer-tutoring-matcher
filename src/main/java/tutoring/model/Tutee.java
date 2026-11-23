package tutoring.model;

// A tutee is a student who books sessions.
public class Tutee extends User {

    public Tutee(int id, String name, String email, String passwordHash) {
        super(id, name, email, passwordHash);
    }

    @Override
    public String getRole() {
        return "Tutee";
    }
}
