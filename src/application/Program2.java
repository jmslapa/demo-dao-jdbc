package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("                 TEST 1 : FIND BY Id (department)");
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println("\n                 TEST 2 : FIND ALL (department)");
		List<Department> list = departmentDao.findAll();
		for(Department dep : list)
			System.out.println(dep);
		
		System.out.println("\n                 TEST 3 : INSERT (department)");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted. New Id: " + newDepartment.getId());
		
		System.out.println("\n                 TEST 4 : UPDATE (department)");
		newDepartment.setName("Sports");
		departmentDao.update(newDepartment);
		System.out.println("Updated.");
		
		in.nextLine();
		System.out.println("                 TEST 5 : DELETE (department)");
		departmentDao.deleteById(newDepartment.getId());		
		System.out.println("Deleted.");
		
		in.close();
	}

}
