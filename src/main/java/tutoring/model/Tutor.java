package tutoring.model;

// A tutor is a student who teaches sessions.
public class Tutor extends User {

    public Tutor(int id, String name, String email, String passwordHash) {
        super(id, name, email, passwordHash);
    }

    @Override
    public String getRole() {
        return "Tutor";
    }
}
