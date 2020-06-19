package com.springboot.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LectureService {
    @Autowired
    private LectureRepository lectureRepository;

    public void addLecture(Lecture lecture) {
        lectureRepository.save(lecture);
    }

    public void deleteLecture(int lectureId) {
        lectureRepository.deleteById(lectureId);
    }

    public Lecture getLecture(int lectureId) {
        return lectureRepository.findById(lectureId).get();
    }

    public List<Lecture> getAllLectures() {
        return lectureRepository.findAll();
    }
}
