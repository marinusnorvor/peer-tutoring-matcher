package tutoring.model;

public class OneToOneSession extends Session{
    public OneToOneSession(int id,String status,Tutor tutor,Subject subject,TimeSlot slot){
        super(id,status,tutor,subject,slot); }

    @Override
    public int maxParticipants(){
        return 1; }

    @Override
    public boolean validate(){
        return true; }

    @Override
    public int durationMinutes(){
        return 60; } }