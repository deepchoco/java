package com.varxyz.jv200.mod008;

/*
-대학의 모든 도서정보는 하나의 도서관(저장소)에 보관 및 등록된다고 가정한다.
-각 학과(학부)에서 구매한 책들은 모두 이 도서관 도서정보에 등록되어야 한다고 가정한다.
-책을 대출할 때 책의 고유번호(serial)를 통해 검색되어 대출된다고 가정한다.
-도서관에서 책을 보관할 수 있는 정보의 최대치는 100권이며 초과시 자동으로 이전 저장소 크기의 2배로 증가된다고 가정한다.
*/

public class Library {
	private static Library lib = new Library();
	//static은 값이변하지않는 고정된 객체이며 객체마다 추가로 객체변수를 만들지 않아도 되기때문에 메모리를 추가할당 하지 않는다.
	//private는 클래스 외부에서 접근 불가능
	
	private Library() {
		// 도서관을 한번만 생성할 수 있게 생성자에 private걸기
	}
	
	public static Library getLibrary() {//static메소드는 객체생성없이 클래스를통해 메서드를 호출가능
		return lib;
	}
	
	private static int listLeng = 100; //저장소내 책의 최대 개수
	private static String[][] bookList = new String[listLeng][2];//배열 선언과 초기화 동시에 2차원배열은 int[][] array 형식으로만 선언가능
	private static int bookIndex = 0;
	private String giveBook = "";
	
	
	public void addBook(Book book) {
		if (bookIndex >= listLeng) {//bookIndex(0)이 listLeng(100)이상일때
			listLeng *= 2;//listLeng(100) = listLeng(100) * 2 
			String[][] copy = bookList;//copy = String[200][2]
			bookList = new String[listLeng][2];//bookList = String[200][2], 생성자는 클래스와 이름이 같아야함으로 new String
			System.arraycopy(copy, 0, bookList, 0, copy.length);
			//원본, 원본소스의처음부터, 복사하려는대상, 어느부분부터 쓸것인지, 원본에서 복사본까지 얼마큼 읽어올지
		}
		bookList[bookIndex][0] = book.getBookName();//첫번째배열에 책이름
		bookList[bookIndex][1] = book.getSerial();//두번째배열에 시리얼
		bookIndex++;//bookIndex에 1더함
	}
	
	public String getBook(int serial) {
		for(int i = 0; i < bookList.length; i++) { //저장된 책의 인덱스 개수만큼 검사
			if (Integer.toString(serial).equals(bookList[i][1])) { //==은 주소값 equals는 내용자체를 비교
				giveBook = bookList[i][0];
			}
		}
		return giveBook; 
	}
	
}
