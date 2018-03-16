

//refer this video for more clarification:
// https://www.youtube.com/watch?v=lwwIZuwYmNI&list=PLqq-6Pq4lTTa9YGfyhyW2CqdtW9RtY-I3&index=21
public class MethodReferenceExample {

	public static void main(String[] args) {
		
		//Thread t = new Thread(() -> printMessage());
		Thread t = new Thread(MethodReferenceExample::printMessage); // <CLASSNAME>::<METHODNAME>
		t.start();
	}
	
	public static void printMessage(){
		System.out.println("Hello");
	}

}
