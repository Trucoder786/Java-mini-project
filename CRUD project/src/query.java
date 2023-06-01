public class query {
    static String insert = "insert into student (RollNo,Name,Age) values (?,?,?)";
    static String update = "update  student set name = ? where rollNo = ?";
    static String delete = "delete from student where rollNo = ?";
    static String select = "Select * from student;";
}
