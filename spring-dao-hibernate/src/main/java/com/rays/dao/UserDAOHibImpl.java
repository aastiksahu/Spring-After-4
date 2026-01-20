package com.rays.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.rays.dto.UserDTO;

@Repository
public class UserDAOHibImpl implements UserDAOInt {

	@Autowired
	private SessionFactory sessionFactory = null;

	public long add(UserDTO dto) {
		Session session = sessionFactory.getCurrentSession();
		long pk = (long) session.save(dto);
		return pk;
	}

	@Override
	public void update(UserDTO dto) {
		sessionFactory.getCurrentSession().update(dto);
	}

	@Override
	public void delete(long pk) {
		Session session = sessionFactory.getCurrentSession();
		UserDTO dto = findByPk(pk);
		session.delete(dto);
	}

	@Override
	public UserDTO findByPk(long pk) {
		Session session = sessionFactory.getCurrentSession();
		UserDTO dto = session.get(UserDTO.class, pk);
		return dto;
	}

	@Override
	public UserDTO findByLogin(String login) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(UserDTO.class);
		
		criteria.add(Restrictions.eq("login", login));
		
		List list = criteria.list();
		
		UserDTO dto = null;
		
		if (list.size() == 1) {
			dto = (UserDTO) list.get(0);
		}
		
		return dto;
	}

	@Override
	public UserDTO authenticate(String login, String password) {
		
		Session session = sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(UserDTO.class);
		
		
		return null;
	}

	@Override
	public List<UserDTO> search(UserDTO dto, int pageNo, int pageSize) {
		
		List<UserDTO> list = null;
		
		Session session = sessionFactory.getCurrentSession();
		
		Criteria criteria = session.createCriteria(UserDTO.class);
		
		if (dto != null) {
			if (dto.getFirstName() != null && dto.getFirstName().length() > 0) {
				criteria.add(Restrictions.like("firstName", dto.getFirstName() + "%"));
			}
		}
		
		if (pageSize > 0) {
			pageNo = (pageNo -1) *pageSize;
			criteria.setFirstResult(pageNo);
			criteria.setMaxResults(pageSize);
		}
		
		list = criteria.list();
		
		return list;
	}

}
