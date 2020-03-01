package lab9;

import java.sql.*;
import java.util.ArrayList;

public class MobileStore {
    public static void main (String[]args){

       //step1
       try{
           Class.forName("org.sqlite.JDBC");
           System.out.println("Driver load successfully.");

       } catch (ClassNotFoundException e){
           e.printStackTrace();
       }
//step2
        String SQCONN ="jdbc:sqlite:StudioEX.sqlite";
       try {
           Connection conn = DriverManager.getConnection(SQCONN);
           if (conn == null){
              System.out.println("Connected not to database.");
           }else {
               System.out.println("Connected to database.");
           }

           //step3
           Statement stmt =conn.createStatement();
           String sql="select * from Mobilex";
           ResultSet rs = stmt.executeQuery(sql);
           if (rs == null){
              System.out.println("Could not foud any data.");
           }else {
               System.out.println("Mobile data from any data.");
               ArrayList<Mobile> std = new ArrayList<Mobile>();

               while (rs.next()){
//                   System.out.println(rs.getInt(1));
//                   System.out.println(rs.getString(2));
//                   System.out.println(rs.getString(3));
//                   System.out.println(rs.getDouble(4));
//                   System.out.println(rs.getString(5));

                   Mobile s= new Mobile(rs.getInt(1),
                   rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
                   std.add(s);

               }//while
               DisplayObject(std);

           }

       } catch (SQLException e) {
           e.printStackTrace();
       }


    }

    private static void DisplayObject(ArrayList<Mobile> std) {

        for (Mobile s:std){
            System.out.println(s.toString());
        }
    }
}
