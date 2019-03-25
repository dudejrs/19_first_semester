
public class java_data_type {
    public static void main(String[] args) {
    	String string1 = "string";
    	System.out.println(string1);
    	
    	int radius = 10; double pi = 3.14;
    	float pi2 = 3.14f;// float type으로 강제 변환
    	final double PI = 3.14D;
    	System.out.println(radius*2*pi);
    	System.out.println(radius*2*pi2);
    	System.out.println(radius*2*PI);
    	
    	boolean Exit = false;
    	if( Exit == false ) {System.out.println("프로그램이 종료됩니다");}
    	else {System.out.println("사용중인 프로그램이 잇습니다");}
    	
    }
}
