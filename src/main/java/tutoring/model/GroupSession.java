package tutoring.model;

public class GroupSession extends Session{
    private int maxSize=5;

    public GroupSession(int id,String status,Tutor tutor,Subject subject,TimeSlot slot,int maxSize){
        super(id,status,tutor,subject,slot);
        this.maxSize=maxSize; }

    @Override
    public int maxParticipants(){
        return maxSize; }

    @Override
    public boolean validate(){
        return true; }

    @Override
    public int durationMinutes(){
        return 60; } }