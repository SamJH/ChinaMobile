package com.oracle.dao;

import java.util.List;

import com.oracle.po.Users;

public interface LoginDao {

	public Users finduser(String username);
}
