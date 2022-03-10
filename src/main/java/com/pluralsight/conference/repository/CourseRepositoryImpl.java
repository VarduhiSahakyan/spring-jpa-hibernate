package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Course;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CourseRepositoryImpl implements CourseRepository {


    @PersistenceContext
    private EntityManager em;



    @Override
    public Course save(Course course) {
        em.persist(course);
        return course;
    }
}
