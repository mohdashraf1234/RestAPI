package com.jpa.test.service;


import java.util.List;
import java.util.Optional;

import com.jpa.test.entities.Course;


public interface CourseService {
    List<Course> getCourses();
    Optional<Course> getCourse(Long courseId);
    Course addCourse(Course course);
    void deleteCourse(Long courseId);
    Course updateCourse(Course course);
}
