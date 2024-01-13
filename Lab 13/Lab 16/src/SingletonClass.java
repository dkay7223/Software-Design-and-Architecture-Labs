
public class SingletonClass {
	private static SingletonClass instance = new SingletonClass();

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		if (instance == null) {
			 instance = new SingletonClass();
		}
		return instance;
	}

	public void showMessage() {
		// TODO Auto-generated method stub
		System.out.println("Mesage!");
	}
}
