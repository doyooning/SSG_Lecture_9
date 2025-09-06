package java_basic_02.welcomeProject;

import java.util.Scanner;

public class Welcome {
    static Scanner sc = new Scanner(System.in);
    static boolean status = true;

    public static void main(String[] args) {

        // Guest 정보 입력
        System.out.print("당신의 이름을 입력하세요 : ");
        String userName = sc.nextLine();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = sc.nextLine();

        Guest guest = new Guest(userName, userMobile);
        Cart cart = new Cart();
        BookList bookList = new BookList();

        while (status) {
            menuIntroduction();
            System.out.print("메뉴 번호를 선택해주세요 ");
            int menuNum = Integer.parseInt(sc.nextLine());

            switch (menuNum) {
                case 1:
                    menuGuestInfo(guest);
                    break;
                case 2:
                    menuCartItemList(cart);
                    break;
                case 3:
                    menuCartClear(cart);
                    break;
                case 4:
                    System.out.println("바구니 항목 추가하기");
                    menuCartAddItem(bookList);
                    break;
                case 5:
                    System.out.println("장바구니의 항목 수량 줄이기");
                    menuCartRemoveItemCount();
                    break;
                case 6:
                    System.out.println("장바구니의 항목 삭제하기");
                    menuCartRemoveItem();
                    break;
                case 7:
                    System.out.println("영수증 표시하기");
                    menuCartBill();
                    break;
                case 8:
                    System.out.println("프로그램이 종료됩니다.");
                    menuExit();
                    break;
                default:
                    System.out.println("유효한 숫자를 입력해주세요.");
            }
        }
    }


    // 메뉴 정보 출력
    public static void menuIntroduction() {
        System.out.println("""
                *****************************************************************
                                Welcome to Shopping Mall
                                Welcome to Book Market!
                *****************************************************************
                1. 고객 정보 확인하기          5. 장바구니의 항목 수량 줄이기
                2. 장바구니 상품 목록 보기      6. 장바구니의 항목 삭제하기
                3. 장바구니 비우기             7. 영수증 표시하기
                4. 장바구니에 항목 추가하기     8. 종료
                """);
//        System.out.println("*****************************************************************");
//        System.out.println("                Welcome to Shopping Mall");
//        System.out.println("                Welcome to Book Market!");
//        System.out.println("*****************************************************************");
//        System.out.println("1. 고객 정보 확인하기       4. 바구니에 항목 추가하기");
//        System.out.println("2. 장바구니 상품 목록 보기   5. 장바구니의 항목 수량 줄이기 ");
//        System.out.println("3. 장바구니 비우기          6. 장바구니의 항목 삭제하기");
//        System.out.println("7. 영수증 표시하기          8. 종료");
//        System.out.println("*****************************************************************");
    }

    // 1. 고객 정보 확인하기
    public static void menuGuestInfo(Guest guest) {
        System.out.printf("현재 고객 정보 : %s\n", guest.userName);
        System.out.printf("이름 %s   연락처 %s\n", guest.userName, guest.userMobile);
    }

    // 2. 장바구니 상품 목록 보기
    public static void menuCartItemList(Cart cart) {
        if (cart.cartItems == null) {
            System.out.println("장바구니가 비었습니다.");
        } else {
            for (int i = 0; i < cart.cartItems.length; i++) {
                System.out.println(cart.cartItems[i]);
            }
        }
    }

    // 3. 장바구니 비우기
    public static void menuCartClear(Cart cart) {
        cart.cartItems = null;
        System.out.println("장바구니를 비웠습니다.");
    }

    // 4. 장바구니에 항목 추가하기
    public static void menuCartAddItem(BookList bookList) {
        for (int i = 0; i < BookList.NUM_BOOK; i++) {
            for (int j = 0; j < BookList.NUM_ITEM; j++) {
                System.out.print(bookList.book[i][j] + " | ");
            }
            System.out.println();
        }
        boolean quit = false;

        while (!quit) {
            boolean flag = false;
            System.out.print("장바구니에 추가할 도서의 ID를 입력하세요 : ");
            String inputID = sc.nextLine();
            int bookIndex = -1;

            for (int i = 0; i < BookList.NUM_BOOK; i++) {
                if (inputID.equals(bookList.book[i][0])) {
                    bookIndex = i;
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println(bookList.book[bookIndex][1] + " 도서를 장바구니에 추가하겠습니까? Y | N");
                String confirm = sc.nextLine();
                if (confirm.equalsIgnoreCase("Y")) {
                    // todo : 장바구니 추가 로직
                    System.out.println(inputID + " 도서가 장바구니에 추가되었습니다.");
                }
                quit = true;
            } else {
                System.out.println("다시 입력해 주세요.");
            }
        }

    }

    // 5. 장바구니의 항목 수량 줄이기
    public static void menuCartRemoveItemCount() {

    }

    // 6. 장바구니의 항목 삭제하기
    public static void menuCartRemoveItem() {

    }

    // 7. 영수증 표시하기
    public static void menuCartBill() {

    }

    // 8. 종료
    public static void menuExit() {
        status = false;
    }
}
