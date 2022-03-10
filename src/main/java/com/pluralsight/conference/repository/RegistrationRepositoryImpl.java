package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Registration;
import com.pluralsight.conference.model.RegistrationReport;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class RegistrationRepositoryImpl implements RegistrationRepositoryy {

    @PersistenceContext
    private EntityManager em;


    @Override
    public Registration save(Registration registration) {
        em.persist(registration);
        return registration;
    }

    @Override
    public List<Registration> findAll() {
        // JPQL query language that works with Java objects
        List<Registration> registrations = em.createQuery("Select r from Registration r").getResultList();

        return registrations;
    }

    @Override
    public List<RegistrationReport> findAllReports() {
        String jpql = "Select new com.pluralsight.conference.model.RegistrationReport " +
                "(r.name, c.name, c.description) " +
                " from Registration r, Course  c " +
                " where r.id = c.registration.id ";
        List<RegistrationReport> registrationReports = em.createQuery(jpql).getResultList();
        return registrationReports;
    }
}
