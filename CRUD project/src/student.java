public class student {
    int RollNo;
    String Name;
    int Age;

    public student(int RollNo, String Name, int Age){
        this.RollNo = RollNo;
        this.Name = Name;
        this.Age = Age;
    }
    public  int getRollNo(){
        return RollNo;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }

    @Override
    public String toString() {
        return "student{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                '}';
    }
}
