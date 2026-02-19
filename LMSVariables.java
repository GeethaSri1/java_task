

public class LMSVariables {
    
    public static void main(String[] args) {
        // Student → ID, Name, Email, Password, Gender, Mobile Number etc 
        // define datatypes
        short studentID = 101;
        String studentName = "Ravi";
        String studentEmail = "ravi@gmail.com";
        String studentPassword = "pass@123$%^";
        char studentGender_1 = 'F';
        boolean isStudentMale = true;
        long studentMobileNumber = 9000090;

        // Car mahindra ;

        // String Concatenation means joing multiple strings, join strings with
        // other data types
        System.out.println("Student ID:" +studentID);
        System.out.println("Student Name:" +studentName +studentEmail);
        System.out.println("Student Gender: "+studentGender_1);
        System.out.println("Student Gender Male: "+isStudentMale);
        System.out.println("Student Mobile Number: "+studentMobileNumber);
    }
}
