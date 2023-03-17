package com.example.hustlers;

public class Appointment {
    private  String uid;
    private String docId;
    private boolean isVerified;


    public void setRegId(String regId) {
        this.regId = regId;
    }

    private String regId;
    private long token;
    public Appointment(String uid, String docId, boolean isVerified, long token, String regId) {
        this.uid = uid;
        this.docId = docId;
        this.isVerified = isVerified;
        this.token = token;
        this.regId = regId;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    public String getRegId(){
        return regId;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "uid='" + uid + '\'' +
                ", docId='" + docId + '\'' +
                ", isVerified=" + isVerified +
                ", regId='" + regId + '\'' +
                ", token=" + token +
                '}';
    }
}
