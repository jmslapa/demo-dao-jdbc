package application;

import java.util.Date;
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
		
		System.out.println("\n                 TEST 4 : INSERTION (seller)");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted. New id: " + newSeller.getId());
		
		System.out.println("\n                 TEST 4 : UPDATE (seller)");
		s = sellerDao.findById(1);
		s.setName("Parker");
		sellerDao.update(s);
		System.out.println("Updated.");
	}

}
