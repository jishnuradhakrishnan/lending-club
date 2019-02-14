package com.lendingclub.repository;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CommonRepository {
	@Autowired
	private EntityManager entityManager;

	@Autowired
	protected DataSource dataSource;

	protected Session getSession() {
		return entityManager.unwrap(Session.class);
	}

}
