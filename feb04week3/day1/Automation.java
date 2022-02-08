package feb04week3.day1;

public class Automation extends MultiLanguage implements Language,TestTool
{

	public void java() {
		System.out.println("Welcome to Java");
		
	}

	public void Selenium() {
		System.out.println("Welcome to Selenium");
		
	} 
public static void main(String[] args) {
	Automation auto=new Automation();
	auto.python();
	auto.ruby();
	auto.java();
	auto.Selenium();
}



}



