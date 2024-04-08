package form_dang_nhap;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import javax.swing.JOptionPane;

import database.MyConnection;

public class student {
    public void inserUpdeleteStudent(char operation,Integer id , String fname, String lname,String sex, String bdate, String phone, String address){

        Connection con=MyConnection.getConnection();
        PreparedStatement ps;

        if(operation=='i'){
            try {
                ps=con.prepareStatement("INSERT INTO student(first_name, last_name, sex, birthdate, phone, address) VALUES(?,?,?,?,?,?)");
                ps.setString(1, fname);
                ps.setString(2, lname);
                ps.setString(3, sex);
                ps.setString(4, bdate);
                ps.setString(5, phone);
                ps.setString(6, address);


                // ps.setString(4, bdate);
                
                if(ps.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null, "New Student added");
                }


            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }

    }

    public void inserUpdeleteStudent(char operation, Object id, String fname, String lname, String sex, Date bdate,
            String phone, String address) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'inserUpdeleteStudent'");
    }
}
