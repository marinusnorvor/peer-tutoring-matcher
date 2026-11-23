package tutoring.model;

// A session with one tutor and one tutee.
public class OneToOneSession extends Session {

    public OneToOneSession(int id, String status) {
        super(id, status);
    }

    @Override
    public int maxParticipants() {
        return 1;
    }
}