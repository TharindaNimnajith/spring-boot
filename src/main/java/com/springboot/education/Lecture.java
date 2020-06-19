package com.springboot.education;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Lecture {
    private int lectureId;
    private String lessonName;
    private String lessonDescription;
    private String subjectCode;
    private String lecturerId;
    private String locationCode;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public Lecture() {
        lectureId = 0;
        lessonName = "";
        lessonDescription = "";
        subjectCode = "";
        lecturerId = "";
        locationCode = "";
        date = LocalDate.now();
        startTime = LocalTime.now();
        endTime = LocalTime.now();
    }

    public Lecture(int lectureId, String lessonName, String lessonDescription, String subjectCode,
                   String lecturerId, String locationCode, LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.lectureId = lectureId;
        this.lessonName = lessonName;
        this.lessonDescription = lessonDescription;
        this.subjectCode = subjectCode;
        this.lecturerId = lecturerId;
        this.locationCode = locationCode;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getLectureId() {
        return lectureId;
    }

    public void setLectureId(int lectureId) {
        this.lectureId = lectureId;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonDescription() {
        return lessonDescription;
    }

    public void setLessonDescription(String lessonDescription) {
        this.lessonDescription = lessonDescription;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(String lecturerId) {
        this.lecturerId = lecturerId;
    }

    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
}
