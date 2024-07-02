package application;
import java.sql.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;
public class Program {

	public static void main(String[] args) {
		
		/*Department obj = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(0), 3000.0, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		*/
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller Seller = sellerDao.findById(3);
		System.out.println(Seller);
		
		

	}
}
