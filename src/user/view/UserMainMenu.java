package user.view;

import java.util.Scanner;

import main.controller.MainController;

public class UserMainMenu {

	// variable
	private Scanner keyboard;

	// constructor
	public UserMainMenu() {

		this.keyboard = new Scanner(System.in);

	}

	public void userMainMenu() {

		while(true){
			
			System.out.println("원하시는 메뉴를 선택하여 주십시오");
			System.out.println("1. 전체상품보기 || 2. 상품주문하기 || 3. 장바구니 확인 || 4. 결제내역 확인 || 5. 개인정보 변경 || 6. 로그아웃 하기");
			int selectedMenu = keyboard.nextInt();

			if(selectedMenu == 1){

				MainController.getProductController().requestProductlist();

			} else if(selectedMenu == 2){

				MainController.getOrderController().requestOrderProductView();

			} else if(selectedMenu == 3){

				MainController.getOrderController().requestOrderListView();

			} else if(selectedMenu == 4){

				System.out.println("결제내역 확인 모드 입니다");

			} else if(selectedMenu == 5){

				MainController.getUserController().requestUserUpdateInfo();
				
			} else if(selectedMenu == 6){
				
				MainController.getLoginController().requestLogout();
				
			} else {

				System.out.println("잘못 선택하셨습니다");

			}
		}
	}

}
