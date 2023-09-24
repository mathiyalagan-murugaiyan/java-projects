package java_jdbc;



import java.sql.*;
import java.util.Scanner;

public class Sql_jdbc {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url ="jdbc:mysql://localhost:3306/mathi";
		
		String userName="root";
		
		String password="root";

		Connection con = DriverManager.getConnection(url , userName, password);

		Statement stmt = con.createStatement();

		ResultSet rs;
		PreparedStatement st;

		String qry = "";
		int id, age, choice;
		String name, city;

		Scanner in = new Scanner(System.in);
		Scanner str = new Scanner(System.in);

		while (true) {

			System.out.println("SQL CURD OPERATION");
			System.out.println("1.  INSERT");
			System.out.println("2.  UPDATE");
			System.out.println("3.  DELETE");
			System.out.println("4.  SELECT ");
			System.out.println("5.  EXIT");
			System.out.println("Enter your choice");
			choice = in.nextInt();
			System.out.println("***************");
			switch (choice) {
			case 1:
				System.out.println("INSET NEW RECORD");

				System.out.println("Enter the name  :");
				name = str.nextLine();
				System.out.println("Enter the Age  :");
				age = in.nextInt();
				System.out.println("Enter the city  :");
				city = str.nextLine();

				qry = "insert into employee (NAME,AGE,CITY) values (?,?,?)";
				st = con.prepareStatement(qry);

				st.setString(1, name);
				st.setInt(2, age);
				st.setString(3, city);
				st.executeUpdate();
				System.out.println("Data insert succesfully");
				break;
			case 2:
				System.out.println("UPDATE DATA");

				System.out.println("Enter the id");
				id = in.nextInt();
				System.out.println("Enter the name");
				name = str.nextLine();
				System.out.println("Enter the age");
				age = in.nextInt();
				System.out.println("Enter the city");
				city = str.nextLine();

				qry = "update employee set NAME=?,AGE=?,CITY=? where ID=?";

				st = con.prepareStatement(qry);
				st.setString(1, name);
				st.setInt(2, age);
				st.setString(3, city);
				st.setInt(4, id);
				st.executeUpdate();
				System.out.println("Data update success");
				break;
			case 3:
				System.out.println("DELETE DATA");

				System.out.println("Enter the id");
				id = in.nextInt();

				qry = "delete from employee where id=?";
				st = con.prepareStatement(qry);
				st.setInt(1, id);
				st.executeUpdate();
				System.out.println("Data delete successfully");
				break;
			case 4:
				System.out.println("SELECT ALL RECORDS");

				qry = "select ID,NAME,AGE,CITY from employee";
				rs = stmt.executeQuery(qry);

				while (rs.next()) {

					id = rs.getInt("ID");
					name = rs.getString("NAME");
					age = rs.getInt("AGE");
					city = rs.getString("CITY");

					System.err.print(id + " | ");
					System.err.print(name + " | ");
					System.err.print(age + " | ");
					System.err.println(city + "  ");

				}
				break;
			case 5:
				System.out.println("THANK YOU");
				System.exit(0);
				break;
			default:
				System.out.println("INVALIDE SELECTION");
				break;

			}

			System.out.println("****************");
		}
	}

}