package tutoring.model;

// The base class for every kind of tutoring session.
public abstract class Session {
    private int id;
    private String status;

    public Session(int id, String status) {
        this.id = id;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    // Each kind of session sets its own limit.
    public abstract int maxParticipants();
}