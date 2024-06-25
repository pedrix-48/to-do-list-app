package main;
import Project.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.*;

public class InsertData extends SQL {

    public InsertData() {
        super.setInsertQueries("insert into app (lista) values (?)");
    }

    public void Insert(String lista){
        try {
           Connection con = ConnectionProvider.getCon();
           PreparedStatement ps = con.prepareStatement(getInsertQueries());
           ps.setString(1, lista);
           ps.executeUpdate();
           JOptionPane.showMessageDialog(null, "AUMENTA LISTA SUSESU!!!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void Insert(JTextField text) {
     
    }
}
