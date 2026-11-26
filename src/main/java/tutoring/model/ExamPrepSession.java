package model;

import java.util.ArrayList;
import java.util.List;

public class ExamPrepSession extends Session{
    private String examDate="2026-12-10";
    private List<String> topics=new ArrayList<>();

    public ExamPrepSession(int id,String status,Tutor tutor,Subject subject,TimeSlot slot,String examDate,List<String> topics){
        super(id,status,tutor,subject,slot);
        this.examDate=examDate;
        if(topics!=null){ this.topics=topics; } }

    @Override
    public int maxParticipants(){
        return 10; }

    @Override
    public boolean validate(){
        return true; }

    @Override
    public int durationMinutes(){
        return 90; } }