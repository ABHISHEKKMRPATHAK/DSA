package New;

public class ReportCard{
    String subject;
    int Standard;
    static  String schoolName ="Mt Egmont School"; 
    public ReportCard(){
        System.out.println("In Class");
    }
    public static void main(String[] args) { 
    StudentInfo Student1 = new StudentInfo();
    Student1.setRollNumber(901);
    Student1.setStudentName("Rakesh");
    String name =Student1.getStudentName();
    int  roll = Student1.getRollNumber();
    System.out.println(name+":"+roll);
}
}