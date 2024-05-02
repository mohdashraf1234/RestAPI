package com.jpa.test.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.test.entities.Course;
import com.jpa.test.repository.CourseRepository;



@Service
public class CourseServiceImpl implements CourseService {
    
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourse(Long courseId) {
        return courseRepository.findById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public void deleteCourse(Long courseId) {
        courseRepository.deleteById(courseId);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }

	
}

