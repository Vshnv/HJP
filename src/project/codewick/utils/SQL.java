package project.codewick.utils;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.transform.Result;
import java.sql.*;

public enum SQL {
    utils;
    String username;
    String password;
    String database;
    private Connection connect(){
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/"+database+"?" +
                    "user="+username+"&password="+password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public void setup(String username,String password,String database){
        this.username = username;
        this.password = password;
        this.database = database;
    }
    public boolean insertValue(String table,String[] columns) {
        Connection c = connect();
        try {
            Statement s = c.createStatement();
            s.execute("insert into " + table + " values"+buildArgs(columns)+";");

        } catch (SQLException e) {
            e.printStackTrace();
            try {
                c.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            return false;
        }
        try {
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public boolean addPatient(String userID,String name,int age, char sex, String nationality , String DOB, String phone, String email,String address){
        String[] params ={userID,name,age+"",sex+"",nationality,DOB,phone,email,address};
        return insertValue("patients",params);
    }
    public boolean modify(String kname,String key,String column,String value){
        Connection c = connect();
        try{
            Statement s = c.createStatement();
            s.execute("update " + database + " set " + column+ " = "+ value + " where "+kname+" = " + key+";");

        }catch (SQLException e){
            e.printStackTrace();
            try {
                c.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
            return false;
        }
        try {
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    public void fillComboDoctors(JComboBox combo,String tablename){
        Connection c = connect();
        ComboBoxModel cbm = combo.getModel();
        cbm.setSelectedItem("Choose");
        try {
            Statement s = c.createStatement();
            ResultSet rs =s.executeQuery("select name from " + tablename + ";");
            while(rs.next()){
                combo.addItem(rs.getString(1));
            }
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public String getDoctorSpecialization(String name){
        Connection c = connect();
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select spec from doctors where name = \""+name+"\"");
            rs.next();
            return rs.getString(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }
    public void fillAppointmentTable(JTable table,String tablename,String key){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        for(int a = model.getRowCount()-1;a>=0;a--){
            model.removeRow(a);
        }
        Connection c = connect();
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select date, visited from " + tablename + " where userID = \"" + key +"\";");
            while (rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2)});
            }
            c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    //FOR LOGIN SYSTEM::

    public boolean containsUser(String key,String table){
        Connection c = connect();
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("Select userID from " + table + " where userID = \"" + key+"\";");
            rs.next();
            if(rs.getString(1).equals(key)){
                c.close();
                return true;
            }
            c.close();
            return false;
        } catch (SQLException e) {
            return false;
        }

    }

    public boolean passwordMatches(String username,String password,String table){
        Connection c = connect();
        try {
            Statement s = c.createStatement();
            ResultSet rs = s.executeQuery("select pass from " + table + " where userID = \""+username+"\"");
            rs.next();
            if(rs.getString(1).equals(password) ){
                c.close();
                return true;
            }
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }


    private String buildArgs(String[] params){
        StringBuilder s = new StringBuilder();
        s.append("(");
        for(String str:params){
            s.append("\""+str+"\"");
            s.append(",");
        }
        s.append("-");
        return s.toString().replace(",-",")");
    }
}
