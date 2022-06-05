package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Login;

import com.example.demo.repo.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository lrepo;

	@Override
	public Login login(Login l) {
		// TODO Auto-generated method stub
		return lrepo.save(l);
	}

}
