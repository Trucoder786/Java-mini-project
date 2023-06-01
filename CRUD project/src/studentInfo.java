import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class studentInfo {
    public static void insertStatement(student std){
        try{
            Connection con = connection.connectDb();
            String Query = query.insert;
            PreparedStatement pstmt = con.prepareStatement(Query);
            pstmt.setInt(1,std.getRollNo());
            pstmt.setString(2,std.getName());
            pstmt.setInt(3,std.getAge());
            pstmt.execute();
            pstmt.close();
        }catch(Exception e){
            System.out.println("Fail due to "+e);
        }
    }
    public static void updateStudent(student std){
        try{
            Connection conn = connection.connectDb();
            String Query = query.update;
            PreparedStatement pstmt = conn.prepareStatement(Query);
            pstmt.setString(1,std.getName());
            pstmt.setInt(2,std.getRollNo());
            pstmt.execute();
            pstmt.close();
        }catch(Exception e){
            System.out.println("Fail due to "+e);
        }
    }
    public static void deleteStudent(student std){
        try{
            Connection con = connection.connectDb();
            String Query = query.delete;
            PreparedStatement pstmt = con.prepareStatement(Query);
            pstmt.setInt(1,std.getRollNo());
            pstmt.execute();
            pstmt.close();
        }catch(Exception e){
            System.out.println("Fail due to "+e);
        }
    }
    public static ArrayList<student> readData(){
        ArrayList<student> stdList = new ArrayList<>();
        try{
            Connection con = connection.connectDb();
            String Query = query.select;
            PreparedStatement pstmt = con.prepareStatement(Query);
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
                student stdS = new student(rs.getInt(1),rs.getString(2),rs.getInt(3));
                stdList.add(stdS);
            }
        }catch(Exception e){
            System.out.println("Fail due  to  "+e);
        }
        return stdList;
    }
}
