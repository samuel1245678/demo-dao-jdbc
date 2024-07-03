package application;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

//import java.sql.Date;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
//import model.entities.Department;
import model.entities.Seller;
public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		//TESTE DO SELLER FINDBYID
		System.out.println("=== TEST 1: seller findById ====");
		Seller Seller = sellerDao.findById(3);
		System.out.println(Seller);
		
		//TESTE DO SELLER FINDBYDEPARTMENT
		System.out.println("\n=== TEST 2: seller findByDepartment ====");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		//TESTE DO SELLER FINDALL
		System.out.println("\n=== TEST 3: seller findAll ====");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		//TESTE DO SELLER INSERT
		System.out.println("\n=== TEST 4: seller insert ====");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, department);
		sellerDao.insert(newSeller);
		System.out.println("Insertd! New id = " + newSeller.getId());
		
		//TESTE DO SELLER UPDATE
		System.out.println("\n=== TEST 5: seller update ====");
		Seller = sellerDao.findById(1);
		Seller.setName("Martha Waine");
		sellerDao.update(Seller);
		System.out.println("Update completed");
		
		//TESTE DO SELLER DELETE
		System.out.println("\n=== TEST 6: seller delete ====");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Delete completed");
		
		sc.close();
		
	}
}
