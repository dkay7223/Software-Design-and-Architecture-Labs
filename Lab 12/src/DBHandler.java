import java.sql.*;
import java.sql.Connection;


public class DBHandler implements PersistanceHandler {
	Connection con = null;

	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
			if (con == null) {
				System.out.println("DB connection failed");
			} else
				System.out.println("DB connection successful");

		} catch (Exception e) { 

		}
	}

	@Override
	public void saveRecord(Product p) {
		try {
		String sql ="INSERT INTO Product (name, category, ManufacturingYear, price, status, company,size,color) VALUES(?, ?, ?, ?,?, ?, ?, ?)";
		
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(1,p.name);
		statement.setString(2,p.category);
		statement.setInt(3,p.mfgYear);
		statement.setInt(4,p.price);
		statement.setString(5,p.status);
		statement.setString(6,p.company);
		statement.setString(7,p.size);
		statement.setString(8,p.color);
		int rowsInserted = statement.executeUpdate();
		if (rowsInserted >0) {
		System.out.println("A new user was inserted successfully!");
		}

	} catch (Exception e) { 

	}
	}

	@Override
	public void updateRecord() {
		String sql ="UPDATE product SET status=?, fullname=?, email=? WHERE username=?";
				
				try {
					PreparedStatement statement = con.prepareStatement(sql);
					statement.setString(1, "123456789");
					statement.setString(2, "William Henry Bill Gates");
					statement.setString(3, "bill.gates@microsoft.com");
					statement.setString(4, "bill");
					int rowsUpdated = statement.executeUpdate();
					if (rowsUpdated > 0) {
						System.out.println("An existing user was updated successfully!");
					} 
				} catch (Exception e) {
					// TODO: handle exception
				}
	}

	@Override
	public void deleteRecord() {
		try {
		String sql ="DELETE FROM product WHERE crockery=?";
		PreparedStatement statement = con.prepareStatement(sql);
		statement.setString(2,"crockery");
		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted >0) {
		System.out.println("A user was deleted successfully!");
		}
		}

		catch (SQLException e) {

			System.out.println("exception: " + e);
		}
	}

	@Override
	public void readRecord() {
		// TODO Auto-generated method stub
		Statement stmt;
		try {
			stmt = con.createStatement();
			String sql = "Select * from student where student_gender='Male'";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(
						"------------------------------------------------------------------------------------------------------------------------------------------------------");
				System.out.println(rs.getString(1) + "\t| " + rs.getString(2) + "\t|	" + rs.getInt(3) + "\t| "
						+ rs.getInt(4) + "\t|" + rs.getString(5) + "\t| " + rs.getString(6)+ "\t| "+ rs.getString(7) + "\t| " + rs.getString(8));
				System.out.println(
						"-----------------------------------------------------------------------------------------------------------	-------------------------------------------");
			}
			con.close();
		}

		catch (SQLException e) {

			System.out.println("exception: " + e);
		}
	}

}
