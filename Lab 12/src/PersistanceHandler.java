
public interface PersistanceHandler {
	abstract void connectDB();

	abstract void saveRecord(Product p);

	abstract void updateRecord();

	abstract void deleteRecord();

	abstract void readRecord();
}
