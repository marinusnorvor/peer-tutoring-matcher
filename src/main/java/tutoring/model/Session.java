package tutoring.model;

import tutoring.exception.SessionFullException;

import java.util.ArrayList;
import java.util.List;

public abstract class Session{
    private int id;
    private String status;
    private Tutor tutor;
    private List<Tutee> tutees=new ArrayList<>();
    private Subject subject;
    private TimeSlot slot;

    public Session(int id,String status,Tutor tutor,Subject subject,TimeSlot slot){
        this.id=id;
        this.status=status;
        this.tutor=tutor;
        this.subject=subject;
        this.slot=slot;
        this.tutees=new ArrayList<>(); }

    public void addTutee(Tutee t1) throws SessionFullException{
        if(tutees.size()>=maxParticipants()){ throw new SessionFullException("Session is full"); }
        tutees.add(t1); }

    public void cancel(){
        this.status="CANCELLED"; }

    public abstract int maxParticipants();
    public abstract boolean validate();
    public abstract int durationMinutes(); }
