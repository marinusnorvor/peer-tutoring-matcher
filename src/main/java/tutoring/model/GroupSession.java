package tutoring.model;

// A session with one tutor and a small group of tutees.
public class GroupSession extends Session {

    public GroupSession(int id, String status) {
        super(id, status);
    }

    @Override
    public int maxParticipants() {
        return 5;
    }
}