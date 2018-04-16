package webapp.web.group;

import java.sql.SQLException;

public class TestDAO {

    public static String result = "";
    double start,end;
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        System.out.println("\"**************Testing Results For Task3*********************\"");
        double start,end;
        GroupsDAO g = new GroupsDAO();
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 1");
        String result = g.getQuestionsByUniversityName("Demo University").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
         start = System.currentTimeMillis();
        System.out.println("---------------Test 2");
         result = g.getQuestionByUniversityNameAndDescription("Demo University","This is new Brand New Question").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
       start = System.currentTimeMillis();
        System.out.println("---------------Test 3");
         result = g.getQuestionsByUniversityNameAndTags("Demo University","Documents" ).toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 4");
         result = g.getQuestionByUniversityNameAndDescriptionAndTags("Demo University","This is new Brand New Question","University").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 5");
         result = g.getQuestionsByUniversityNameAndDegreeName("Demo University", "masters").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 6");
         result = g.getQuestionByUniversityNameAndDegreeNameAndDescription("Demo University","masters","This is another question?").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 7");
       result = g.getQuestionsByUniversityNameAndDegreeNameAndTags("Demo University","masters","hostel").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 8");
         result = g.getQuestionByUniversityNameAndDegreeNameAndTagAndDescription("Demo University","masters","hostel","This is another question?").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 9");
         result = g.getQuestionsByUniversityNameAndProgramName("Demo University", "cse").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 10");
         result = g.getQuestionsByUniversityNameAndProgramNameAndTags("Demo University", "cse", "Expenses").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 11");
         result = g.getQuestionByUniversityNameAndProgramNameAndDescription("Demo University", "cse","dname=1 pname=1 desc").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 12");
         result = g.getQuestionByUniversityNameAndProgramNameAndTagAndDescription("Demo University", "cse","Expenses","dname=1 pname=1 desc").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 13");
         result = g.getQuestionsByUniversityNameAndDegreeNameAndProgramName("Demo University", "masters", "cse").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 14");
         result = g.getQuestionsByUniversityNameAndDegreeNameAndProgramNameAndTags("Demo University", "masters", "cse", "University").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 15");
         result = g.getQuestionByUniversityNameAndDegreeNameAndProgramNameAndDescription("Demo University", "masters", "cse", "This new Qestion on Web testing").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 16");
         result = g.getQuestionByUniversityNameAndDegreeNameAndProgramNameAndTagAndDescription("Demo University", "masters", "cse","Application","This new Qestion on Web testing").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);

        System.out.println("**************Testing Results For Task2*********************");
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 1");
        result = g.getQuestionByDescriptionAndTags("derer","Process").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
         start = System.currentTimeMillis();
        System.out.println("---------------Test 2");
         result = g.getQuestionByDescription("HELLO").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
       start = System.currentTimeMillis();
        System.out.println("---------------Test 3");
         result = g.getQuestionsByTags("Financial").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 4");
         result = g.getQuestions().toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 5");
         result = g.getQuestionsByDegreeName("Btech").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 6");
         result = g.getQuestionByDegreeNameAndDescription("Btech","ABC").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 7");
       result = g.getQuestionsByDegreeNameAndTags("masters","University").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 8");
         result = g.getQuestionByDegreeNameAndTagAndDescription("masters","University", "ddsds").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 9");
         result = g.getQuestionsByProgramName("cse").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 10");
         result = g.getQuestionsByProgramNameAndTags("cse","Expenses").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 11");
         result = g.getQuestionByProgramNameAndDescription("cse", "sadnkasld").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 12");
         result = g.getQuestionByProgramNameAndTagAndDescription("cse","Expenses", "sadnkasld").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 13");
         result = g.getQuestionsByDegreeNameAndProgramName("Btech","cse").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 14");
         result = g.getQuestionsByDegreeNameAndProgramNameAndTags("Btech","cse","University").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 15");
         result = g.getQuestionByDegreeNameAndProgramNameAndDescription("Btech","cse","lk3").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 16");
         result = g.getQuestionByDegreeNameAndProgramNameAndTagAndDescription("Btech","cse","University","lk3").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        System.out.println("Done Testing ");
                
        
        
       
    }
    
    
}