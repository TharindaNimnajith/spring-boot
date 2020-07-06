package com.springboot.education;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class LectureController {
    @Autowired
    private LectureService lectureService;

    @PostMapping("/lectures")
    public void addLecture(@RequestBody Lecture lecture) {
        lectureService.addLecture(lecture);
    }

    @PutMapping("/lectures/{lectureId}")
    public ResponseEntity<?> updateLecture(@RequestBody Lecture lecture, @PathVariable int lectureId) {
        try {
            Lecture existingLecture = lectureService.getLecture(lectureId);
            if (existingLecture != null) {
                lectureService.addLecture(lecture);
                return new ResponseEntity<>(HttpStatus.OK);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (NoSuchElementException noSuchElementException) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/lectures/{lectureId}")
    public void deleteLecture(@PathVariable int lectureId) {
        lectureService.deleteLecture(lectureId);
    }

    @GetMapping("/lectures/{lectureId}")
    public Lecture getLecture(@PathVariable int lectureId) {
        return lectureService.getLecture(lectureId);
    }

    @GetMapping("/lectures")
    public List<Lecture> getAllLectures() {
        return lectureService.getAllLectures();
    }
}
