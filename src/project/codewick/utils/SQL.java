package project.codewick.utils;

        import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
    public boolean insertValue(String database,String table,String[] columns) {
        Connection c = connect();
        try {
            Statement s = c.createStatement();
            s.execute("insert into " + table + " values"+columns.toString().replace("{","(").replace("}",")")+";");

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
}
