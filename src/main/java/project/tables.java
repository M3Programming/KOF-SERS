package project;

import java.sql.*;
import javax.swing.JOptionPane;

public class tables {
    public static void main(String [] args) {
        Connection con = null;
        Statement st = null; 
        try {
            con = ConnectionProvider.getCon();
            st = con.createStatement();
          // st.executeUpdate("CREATE TABLE complete(username varchar(200), address VARCHAR(200), email varchar(200), password varchar(50), status varchar(200))");
          // st.executeUpdate("create table equipmentss(equipmentNo varchar(10), equipmentType varchar(200), area varchar(200), price int, status varchar(20))");
           st.executeUpdate("create table customersss(id int, name varchar(200), mobileNo varchar(20), address varchar(200), gender varchar(50), email varchar(200), idProof varchar(200), checkIn varchar(50), equipmentType varchar(200), area varchar(200), equipmentNo varchar(10), pricePerHour  int(10), numberOfHoursPlay int(10), remainingTime int (10), totalAmount varchar(200), checkOut varchar(50))");
           JOptionPane.showMessageDialog(null, "Table Created Successfully");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                if (con != null) con.close();
                if (st != null) st.close();
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }   
}
