
public class Main {
	public static void main(String[] args) {
		// SingletonClass s=new SingletonClass(); >>Will give an error
		SingletonClass s = SingletonClass.getInstance();
		s.showMessage();
	}
}
