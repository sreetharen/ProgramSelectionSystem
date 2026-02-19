package finalproject;
import java.util.ArrayList;
import java.util.List;

public class DefinedClass
{   // Method to map user qualifications to program requirements and recommend programs
     public static List<String> recommendPrograms(String qualification, double cgpa) 
     {
         List<String> recommendedPrograms = new ArrayList<>();

    // Mapping user qualifications to program requirements
    if (qualification.equals("(SPM/SPMV/O-LEVEL(PASS WITH 3 CREDITS INCLUDING - MATH)")) {
        recommendedPrograms.add("Diploma in Computer Science");
    } else if (qualification.equals("UEC(PASS WITH MINIMUM GRADE B IN 3 SUBJECT INCLUDING - MATH)")) {
        recommendedPrograms.add("Diploma in Computer Science");
    } else if (qualification.equals("SPM(PASS WITH 5 CREDITS)") ||
               qualification.equals("O-LEVEL(PASS WITH 5 CREDITS)") ||
               qualification.equals("UEC(PASS WITH GRADE B IN 4 SUBJECTS)")) {
        recommendedPrograms.add("Foundation in Computer Science");
    } else if (qualification.equals("STPM(PASS WITH MINIMUM GRADE C IN 1 SUBJECT)")) {
        recommendedPrograms.add("Diploma in Computer Science");
    } else if (qualification.equals("STPM(PASS WITH GRADE C(CGPA 2.00) IN ANY 2 SUBJECTS AND MATH SPM)")) {
        recommendedPrograms.add("Bachelor of Information Technology");
    } else if (qualification.equals("STPM(PASS WITH GRADE C(CGPA 2.00) IN ANY 2 SUBJECTS AND ADD MATH SPM C)") ||
               qualification.equals("STPM(PASS WITH GRADE C(CGPA 2.00) IN ANY 2 SUBJECTS + MATH SPM AND ONE OF THE SCIENCE/TECHNOLOGY/ENGINEERING SUBJECT IN SPM C)")) {
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("FOUNDATION IN INFORMATION TECHNOLOGY(PASS WITH MINIMUM CGPA 2.00 AND MATH(SPM) C)") ||
                qualification.equals("FOUNDATION IN COMPUTER SCIENCE(PASS WITH MINIMUM CGPA 2.00 AND MATH(SPM) C)")) {
        recommendedPrograms.add("Bachelor of Information Technology");
    } else if ((qualification.equals("FOUNDATION IN COMPUTER SCIENCE(PASS WITH MINIMUM CGPA 2.00 AND  ADD MATH IN SPM C)") ||
                qualification.equals("FOUNDATION IN COMPUTER SCIENCE(PASS WITH MINIMUM CGPA 2.00 AND MATH + SCIENCE/TECHNOLOGY/ENGINEERING SUBJECT IN SPM C)")) && cgpa >= 2.00) {
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("MATRICULATION (PASS WITH MINIMUM (CGPA 2.00) AND MATH SPM C)") && cgpa >= 2.00) {
        recommendedPrograms.add("Bachelor of Information Technology");
    } else if ((qualification.equals("MATRICULATION (PASS WITH MINIMUM (CGPA 2.00) AND ADD MATH IN SPM C)") ||
                qualification.equals("MATRICULATION (PASS WITH MINIMUM (CGPA 2.00) + MATH AND ONE OF THE SCIENCE/TECHNOLOGY/ENGINEERING SUBJECT IN SPM C)")) && cgpa >= 2.00) {
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("DIPLOMA IN COMPUTING(PASS WITH A MINIMUM CGPA OF 2.50)")){
        recommendedPrograms.add("Bachelor of Information Technology");
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("DIPLOMA COMPUTER SCIENCE(PASS WITH A MINIMUM CGPA OF 2.50)")){
        recommendedPrograms.add("Bachelor of Information Technology");
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("DIPLOMA SOFTWARE ENGINEERING(PASS WITH A MINIMUM CGPA OF 2.50)")){
        recommendedPrograms.add("Bachelor of Information Technology");
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("DIPLOMA INFORMATION SYSTEM(PASS WITH A MINIMUM CGPA OF 2.50)")){
        recommendedPrograms.add("Bachelor of Information Technology");
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("DIPLOMA KEMAHIRAN MALAYSIA(DKM) IN COMPUTING FIELDS(PASS WITH A MINIMUM CGPA OF 2.50)")){
        recommendedPrograms.add("Bachelor of Information Technology");
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("DIPLOMA LANJUTAN KEMAHIRAN MALAYSIA(DLKM) IN COMPUTING FIELDS(PASS WITH A MINIMUM CGPA OF 2.50)")){
        recommendedPrograms.add("Bachelor of Information Technology");
        recommendedPrograms.add("Bachelor of Computer Science");
    }else if (qualification.equals("DIPLOMA VOKASIONAL MALAYSIA(DVM) ON COMPUTING FIELDS(PASS WITH A MINIMUM CGPA OF 2.50)") && cgpa >= 2.50) {
        recommendedPrograms.add("Bachelor of Information Technology");
        recommendedPrograms.add("Bachelor of Computer Science");
    } else if (qualification.equals("DIPLOMA IN SCIENCE AND TECHNOLOGY(PASS WITH A MINIMUM CGPA OF 2.75)")) {
        recommendedPrograms.add("Bachelor of Information Technology");
        recommendedPrograms.add("Bachelor of Computer Science");
    } else {
        recommendedPrograms.add("No suitable program found.");
    }

    return recommendedPrograms;
}

    static List<String> recommendPrograms(StringBuilder qualifications, double cgpa) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
     
}


   


