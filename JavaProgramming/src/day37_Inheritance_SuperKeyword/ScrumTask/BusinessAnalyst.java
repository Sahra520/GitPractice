package day37_Inheritance_SuperKeyword.ScrumTask;

public class BusinessAnalyst extends Employee{//BA IS A Employee, BA IS A Person

    public BusinessAnalyst(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Business Analyst", id, salary, companyName);
    }

    public void analyze(){
        System.out.println(name + " is analyzing the documents");
    }





}
