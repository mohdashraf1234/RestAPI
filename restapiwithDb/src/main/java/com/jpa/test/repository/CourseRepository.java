package com.jpa.test.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpa.test.entities.Course;



@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
