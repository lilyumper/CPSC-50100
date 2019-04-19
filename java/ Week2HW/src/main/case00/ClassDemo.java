package main.case00;

public class ClassDemo {

    public int publicField = 0;

    private String privateField = ""; 

    public void privateField(String value) { //set
        privateField=value; 
    }

    public String getPrivateField() { //get
        return privateField;  
    }

    public int addNumbers(int a, int b) {
        return a + b;
    } 
        
    public void printPublicField() {
        System.out.println("publicField = " +publicField);

        
    }

    public void printPrivateField() {
        System.out.println("privateFiled = " +privateField);
        
    }
}