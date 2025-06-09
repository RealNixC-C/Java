package sec03.exam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductStorage {

	// Product가 저장될 List 컬렉션
	private List<Product> list = new ArrayList<Product>();
	private Scanner scanner = new Scanner(System.in); // 키보드 입력 Scanner 생성
	private int counter; // 상품을 등록할 때 pno 값을 자동으로 부여하기 위해 사용
	
	public void showMenu() {
		while (true) {
			System.out.println("----------------------");
			System.out.println("1.등록 | 2. 목록 | 3. 종료");
			System.out.println("----------------------");
			
			System.out.print("선택: " );
			String selectNo = scanner.nextLine();
			switch (selectNo) {
			case "1":
				// Product 등록
				resgisterProduct();
				break;
			case "2":
				// 등록된 모든 Product 정보 보기
				showProduct();
				break;
			case "3":
				System.out.println("프로그램 종료");
				return;
			}
		}
	}
	public void resgisterProduct() {

		try { // NumberFormatException발생 우려 예외 처리
			Product product = new Product();
			
			product.setPno(++counter);
			System.out.print("상품명: ");
			product.setName(scanner.nextLine());
			
			System.out.print("가격: ");
			product.setPrice(Integer.parseInt(scanner.nextLine()));
			
			System.out.print("재고: ");
			product.setStock(Integer.parseInt(scanner.nextLine()));
			
			list.add(product);
		} catch (Exception e) {
			System.out.println("등록 에러: " + e.getMessage());
		}
	}
	
	public void showProduct() {
		for (Product p : list) {
//			System.out.println(product);
			System.out.println(p.getPno() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getStock());
		}
	}
	
	
	
	
	
	
	
}
