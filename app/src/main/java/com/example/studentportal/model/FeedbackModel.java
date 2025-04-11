package com.example.studentportal.model;

public class FeedbackModel {
    private String submittedDate;
    private String respondentRole;
    private String purpose;

    private String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getSubmittedDate() {
        return submittedDate;
    }

    public void setSubmittedDate(String submittedDate) {
        this.submittedDate = submittedDate;
    }

    public String getRespondentRole() {
        return respondentRole;
    }

    public void setRespondentRole(String respondentRole) {
        this.respondentRole = respondentRole;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    private int rating;
}
