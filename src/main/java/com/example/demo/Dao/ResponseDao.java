package com.example.demo.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Responses;

@Repository
public class ResponseDao {

	@PersistenceContext
    private EntityManager entityManager;
	
	public List getResponses() {
		Criteria criteria = entityManager.unwrap(Session.class).createCriteria(Responses.class);
		return criteria.list();
	}
	
}
