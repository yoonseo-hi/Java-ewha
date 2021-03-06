
public class Film extends Production {
	Film(){} //default 생성자
	Film(String title, String director, String writer,int boxOfficeGross){
		super(title, director, writer);
		//자손클래스의 인스턴스를 생성하면 자손의 멤버와 조상의 멤버가 합쳐진 하나의 인스턴스가 생성됨
		//super() 호출하여 조상의 멤버들을 초기화함
		//Production(String title, String director, String writer) 라는 생성자 부르는것
		this.boxOfficeGross=boxOfficeGross;//boxOfficeGross
	}
	
	private int boxOfficeGross;
	
	public int getBoxOfficeGross() {
		return boxOfficeGross;
	}
	public void setBoxOfficeGross(int boxOfficeGross) {
		this.boxOfficeGross=boxOfficeGross;
	}
	
	public void display() {
		super.display();//Production클래스의 display()메서드 가져옴
		System.out.println("BoxOffice Gross: "+boxOfficeGross);//추가
	}
}
