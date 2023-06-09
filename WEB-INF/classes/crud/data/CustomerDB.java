/*
Compile:
javac -cp . crud/data/*.java

Packages are used to organize classes into similar groupings and/or functionality
*/

package crud.data;

import java.sql.*;
import java.util.ArrayList;

import crud.business.Customer;

public class CustomerDB {

    //insert method (pass customer object to parameter customer)
    public static int insert(Customer customer) {
        ConnectionPool pool = ConnectionPool.getInstance();     //create ConnectionPool object pool
        Connection connection = pool.getConnection();   //establish database connection
        PreparedStatement ps = null;

        //unfortunately, JDBC doesn't make it easy to use named paraments (:name) instead of indices (?)

        String query
            = "INSERT INTO customer (cus_fname, cus_lname, cus_street, cus_city, cus_state, cus_zip, cus_phone,cus_email, cus_balance, cus_total_sales, cus_notes) "
            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, customer.getFname());
            ps.setString(2, customer.getLname());
            ps.setString(3, customer.getStreet());
            ps.setString(4, customer.getCity());
            ps.setString(5, customer.getState());
            ps.setString(6, customer.getZip());
            ps.setString(7, customer.getPhone());
            ps.setString(8, customer.getEmail());
            ps.setString(9, customer.getBalance());
            ps.setString(10, customer.getTotalSales());
            ps.setString(11, customer.getNotes());

            return ps.executeUpdate();
        }//end try

        catch (SQLException e) {
            System.out.println(e);
            return 0;
        }//end catch

        finally {
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }//end finally
    }//end insert method

    //update method (pass customer object to parameter customer)
	public static int update (Customer customer)
	{
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		PreparedStatement ps = null;

		//Include a *space* after SET keyword in next line below
		String query = "UPDATE customer SET "
			+ "cus_fname = ?, "
			+ "cus_lname = ?, "
			+ "cus_street = ?, "
			+ "cus_city = ?, "
			+ "cus_state = ?, "
			+ "cus_zip = ?, "
			+ "cus_phone = ?, "
			+ "cus_email = ?, "
			+ "cus_balance = ?, "
			+ "cus_total_sales = ?, "
			+ "cus_notes = ?"
			+ " WHERE cus_id = ?";

	try 
		{
		ps = connection.prepareStatement(query);
		ps.setString(1, customer.getFname());
		ps.setString(2, customer.getLname());
		ps.setString(3, customer.getStreet());
		ps.setString(4, customer.getCity());
		ps.setString(5, customer.getState());
		ps.setString(6, customer.getZip());
		ps.setString(7, customer.getPhone());
		ps.setString(8, customer.getEmail());
		ps.setString(9, customer.getBalance());
		ps.setString(10, customer.getTotalSales());
		ps.setString(11, customer.getNotes());
		ps.setString(12, customer.getId());
		return ps.executeUpdate();

	}//end try 

	catch (SQLException e) 
	{
		System.out.println(e);
		return 0;
	}//end catch

	finally 
	{
		DBUtil.closePreparedStatement(ps);
		pool.freeConnection(connection);
	}//end of finally


	}//end of method update 

	//delete method (pass customer object to parameter customer)
	public static int delete(Customer customer)
	{
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		PreparedStatement ps = null;

		String query = "DELETE FROM customer WHERE cus_id = ?";
		try 
		{
			ps = connection.prepareStatement(query);
			ps.setString(1, customer.getId());

			return ps.executeUpdate();
		}//end try 

		catch (SQLException e)
		{
			System.out.println(e);
			return 0;

		}//end catch

		finally
		{
			DBUtil.closePreparedStatement(ps);
			pool.freeConnection(connection);
		}



	}//end delete method 

	//select customer method
	public static Customer selectCustomer(String id) {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String query = "SELECT * FROM customer WHERE cus_id = ?";

		try 
		{
			ps = connection.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();
			Customer customer = null;

			if (rs.next())
			{
				customer = new Customer();
				customer.setId(id);
				customer.setFname(rs.getString("cus_fname"));
				customer.setLname(rs.getString("cus_lname"));
				customer.setStreet(rs.getString("cus_street"));
				customer.setCity(rs.getString("cus_city"));
				customer.setState(rs.getString("cus_state"));
				customer.setZip(rs.getString("cus_zip"));
				customer.setPhone(rs.getString("cus_phone"));
				customer.setEmail(rs.getString("cus_email"));
				customer.setBalance(rs.getString("cus_balance"));
				customer.setTotalSales(rs.getString("cus_total_sales"));
				customer.setNotes(rs.getString("cus_notes"));



			}//end if 
			return customer;
		}//end try 

		catch (SQLException e)
		{
			System.out.println(e);
			return null;

		}//end catch

		finally 
		{
			DBUtil.closeResultSet(rs);
			DBUtil.closePreparedStatement(ps);
			pool.freeConnection(connection);

		}//end finally 

	}//end selectCustomer METHOD 

	//retrieve all customers method using arrayList
	public static ArrayList<Customer> selectCustomers()
	{
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String query = "SELECT * FROM customer";
		try
		{
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			ArrayList<Customer> customers = new ArrayList<Customer>();
			while (rs.next())
			{
				Customer customer = new Customer();
				customer.setId(rs.getString("cus_id"));
				customer.setFname(rs.getString("cus_fname"));
				customer.setLname(rs.getString("cus_lname"));
				customer.setStreet(rs.getString("cus_street"));
				customer.setCity(rs.getString("cus_city"));
				customer.setState(rs.getString("cus_state"));
				customer.setZip(rs.getString("cus_zip"));
				customer.setPhone(rs.getString("cus_phone"));
				customer.setEmail(rs.getString("cus_email"));
				customer.setBalance(rs.getString("cus_balance"));
				customer.setTotalSales(rs.getString("cus_total_sales"));
				customer.setNotes(rs.getString("cus_notes"));
				customers.add(customer);





			}//end while loop 
			return customers;
		}//end try 

		catch (SQLException e)
		{
			System.out.println(e);
			return null;

		}//end catch

		finally 
		{
			DBUtil.closeResultSet(rs);
			DBUtil.closePreparedStatement(ps);
			pool.freeConnection(connection);

		}//end finally 

	}//end of arraylist method 

	//emailexists method

	public static boolean emailExists(String email)
	{

		ConnectionPool pool = ConnectionPool.getInstance();
		Connection connection = pool.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;

		String query = "SELECT cus_email FROM where customer WHERE cus_email = ?";
		try
		{
			ps = connection.prepareStatement(query);
			ps.setString(1, email);
			rs = ps.executeQuery();
			return rs.next();
		}//end of try 

		catch (SQLException e)
		{
			System.out.println(e);
			return false;
		}//end of catch

		finally 
		{
			DBUtil.closeResultSet(rs);
			DBUtil.closePreparedStatement(ps);
			pool.freeConnection(connection);
		}//end of finally

	}//end of emailexists method 




}//end class