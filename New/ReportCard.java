package New;

public class ReportCard{
    String subject;
    int Standard;
    static  String SchoolName = "DAV Public School";
    public void ReportCard(){
        System.out.print("In Class");
    }
    public static void main(String[] args) { 
        Class.forName("ReportCard"); 
     ReportCard card1= new ReportCard();
     System.out.println(card1.SchoolName);

}
}