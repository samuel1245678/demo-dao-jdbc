package application;
import java.sql.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById ====");
		Seller Seller = sellerDao.findById(3);
		System.out.println(Seller);
		
		

	}
}
