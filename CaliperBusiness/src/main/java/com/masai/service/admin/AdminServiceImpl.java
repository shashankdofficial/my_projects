package com.masai.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.masai.entities.Admin;
import com.masai.entities.Customer;
import com.masai.exceptions.UserDoesNotExist;
import com.masai.exceptions.UserNameAlreadyExist;
import com.masai.repository.AdminRepository;
import com.masai.repository.CustomerRepository;


@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminDao;
	
	@Autowired
	private CustomerRepository customerDao;
	
	@Override
	public ResponseEntity<Admin> insertAdmin(Admin admin) {
		Admin adm=adminDao.findByUsername(admin.getUsername());
		if(adm!=null) throw new UserNameAlreadyExist("Useername already Exist");
		adminDao.save(admin);
		ResponseEntity<Admin> re=new ResponseEntity<>(admin, HttpStatus.ACCEPTED);
		return re;
	}

	@Override
	public ResponseEntity<Admin> updateAdmin(Admin admin, String user, String pass) {
		Admin adm=adminDao.findByUsernameAndPassword(user, pass);
		
		if(adm==null) throw new UserDoesNotExist("Username or Password is wrong");
		
		if(admin.getUsername() != null) {
			Admin adm_new = adminDao.findByUsername(admin.getUsername());
			if(adm_new != null) throw new UserNameAlreadyExist("username already exist");
			adm.setUsername(admin.getUsername());
		}
		if(admin.getPassword() != null) adm.setPassword(admin.getPassword());
		if(admin.getEmail() != null) adm.setEmail(admin.getEmail());
		if(admin.getAddress() != null) adm.setAddress(admin.getAddress());
		if(admin.getMobile() != null) adm.setMobile(admin.getMobile());
		
		adminDao.save(adm);
		ResponseEntity<Admin> re = new ResponseEntity<>(adm,HttpStatus.OK);
		return re;
	}

	@Override
	public ResponseEntity<String> deleteAdmin(Admin admin) {
		Admin adm=adminDao.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		if(adm==null) throw new UserDoesNotExist("Username or Password is wrong");
		adminDao.delete(adm);
		ResponseEntity<String> re=new ResponseEntity<>("Admin with username : "+admin.getUsername()+" deleted",HttpStatus.OK);
		return re;
	}

	@Override
	public ResponseEntity<List<Customer>> getAllCustomer(Admin admin) {
		Admin adm=adminDao.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		
		if(adm==null) throw new UserDoesNotExist("Username or Password is wrong");
		
		List<Customer> allTrips= customerDao.findAll();
		ResponseEntity<List<Customer>> re=new ResponseEntity<>(allTrips,HttpStatus.OK);
		return re;
	}

}
