package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("                 TEST 1 : FIND BY Id (seller)");
		Seller s = sellerDao.findById(3);
		System.out.println(s);		
		
		System.out.println("\n                 TEST 2 : FIND BY Department (seller)");
		Department department = new Department(2, "Electrônics");
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller s2 : list)
			System.out.println(s2);		
		
		System.out.println("\n                 TEST 3 : FIND ALL (seller)");
		list = sellerDao.findAll();
		for(Seller s2 : list)
			System.out.println(s2);
	}

}
