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

        List<RegistrationReport> registrationReports =
                        em.
                        createNamedQuery(Registration.REGISTRATION_REPORT).
                        getResultList();
        return registrationReports;
    }
}
