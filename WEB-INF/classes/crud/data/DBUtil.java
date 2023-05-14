package crud.data;

import java.sql.*;

//database connection cleanup: close statemnets, prepared statements and result sets
public class DBUtil {

    public static void closeStatment(Statement s){
        try {
            if (s != null) {
                s.close();
            }
        }//end try
        catch(SQLException e) {
            System.out.println(e);
        }//end catch
    }//end closeStatemnet

    public static void closePreparedStatement(Statement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        }//end try
        catch (SQLException e ) {
            System.out.println(e);
        }//ene catch
    }//end closePreparedStatemnet

    public static void closeResultSet(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        }//end try
        catch (SQLException e) {
            System.out.println(e);
        }//end catch
    }//end closeResultSet
}