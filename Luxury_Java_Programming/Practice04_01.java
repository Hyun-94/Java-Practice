package Practice04;
class TV{
	private String name;
	private int year;
	private int inch;
	
	public TV(String name,int year,int inch) {
		this.name=name;
		this.year=year;
		this.inch=inch;
	}
	public void show() {
		System.out.print(name+"에서 만든 "+year+"년형 "+inch+"인치 "+"TV");
	}
	
}

public class Practice04_01 {

	public static void main(String[] args) {
		TV myTV=new TV("LG",2017,32); //LG에서 만든 2017년 32인치
		myTV.show();
		
	}

}
