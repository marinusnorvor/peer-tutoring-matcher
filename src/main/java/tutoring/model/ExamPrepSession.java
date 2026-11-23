package tutoring.model;

// A session to prepare tutees for an exam.
public class ExamPrepSession extends Session {

    public ExamPrepSession(int id, String status) {
        super(id, status);
    }

    @Override
    public int maxParticipants() {
        return 10;
    }
}