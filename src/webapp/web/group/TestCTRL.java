package webapp.web.group;


public class TestCTRL {
    public static String result = "";
    
    
    public static void main(String args[]){
        System.out.println("\"**************Testing Results For Task4*********************\"");
        double start,end;
        String result="";
        
//        result=GroupsCTRL.Parser("Native-_-Country");
        System.out.println(result);
//        result=GroupsCTRL.Parser("native-hello-world");
        System.out.println(result);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 1");
        result = GroupsCTRL.getQuestions().toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 2");
        result = GroupsCTRL.getQuestionByDescription("Hello-").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 3");
        result = GroupsCTRL.getQuestionsByTags("Financial-").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 4");
        result = GroupsCTRL.getQuestionByDescriptionAndTags("derer-","Process-").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 5");
        result = GroupsCTRL.getQuestionsByDegreeName("masters-").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 6");
        result = GroupsCTRL.getQuestionByDegreeNameAndDescription("masters-","hello-how-are-you-test-case").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 7");
        result = GroupsCTRL.getQuestionsByDegreeNameAndTags("masters-","native-_-country").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 8");
        result = GroupsCTRL.getQuestionByDegreeNameAndTagAndDescription("masters-","native-_-country","Hi-test-case-one").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
                
        start = System.currentTimeMillis();
        System.out.println("---------------Test 9");
         result = GroupsCTRL.getQuestionsByProgramName("cse").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 10");
         result = GroupsCTRL.getQuestionsByProgramNameAndTags("cse","Expenses").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 11");
         result = GroupsCTRL.getQuestionByProgramNameAndDescription("cse", "sadnkasld").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 12");
         result = GroupsCTRL.getQuestionByProgramNameAndTagAndDescription("cse","Expenses", "sadnkasld").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 13");
         result = GroupsCTRL.getQuestionsByDegreeNameAndProgramName("Btech","cse").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 14");
         result = GroupsCTRL.getQuestionsByDegreeNameAndProgramNameAndTags("Btech","cse","University").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 15");
         result = GroupsCTRL.getQuestionByDegreeNameAndProgramNameAndDescription("Btech","cse","lk3").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 16");
         result = GroupsCTRL.getQuestionByDegreeNameAndProgramNameAndTagAndDescription("Btech","cse","University","lk3").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);

        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 17");
        result = GroupsCTRL.getQuestionsByUniversityName("Demo-University").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
         start = System.currentTimeMillis();
        System.out.println("---------------Test 18");
         result = GroupsCTRL.getQuestionByUniversityNameAndDescription("Demo-University","This-is-new-Brand-New-Question").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
       start = System.currentTimeMillis();
        System.out.println("---------------Test 19");
         result = GroupsCTRL.getQuestionsByUniversityNameAndTags("Demo-University","Documents" ).toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 20");
         result = GroupsCTRL.getQuestionByUniversityNameAndDescriptionAndTags("Demo-University","This-is-new-Brand-New-Question","University").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 21");
         result = GroupsCTRL.getQuestionsByUniversityNameAndDegreeName("Demo-University", "masters").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 22");
         result = GroupsCTRL.getQuestionByUniversityNameAndDegreeNameAndDescription("Demo-University","masters","This-is-another-question?").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 23");
       result = GroupsCTRL.getQuestionsByUniversityNameAndDegreeNameAndTags("Demo-University","masters","hostel").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 24");
         result = GroupsCTRL.getQuestionByUniversityNameAndDegreeNameAndTagAndDescription("Demo-University","masters","hostel","This-is-another-question?").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 25");
         result = GroupsCTRL.getQuestionsByUniversityNameAndProgramName("Demo-University", "cse").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
      
        start = System.currentTimeMillis();
        System.out.println("---------------Test 26");
         result = GroupsCTRL.getQuestionsByUniversityNameAndProgramNameAndTags("Demo-University", "cse", "House").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
       
        start = System.currentTimeMillis();
        System.out.println("---------------Test 27");
         result = GroupsCTRL.getQuestionByUniversityNameAndProgramNameAndDescription("Demo-University", "cse","dname=1-pname=1-desc").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 28");
         result = GroupsCTRL.getQuestionByUniversityNameAndProgramNameAndTagAndDescription("Demo-University", "cse","Expenses","dname=1-pname=1-desc").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 29");
         result = GroupsCTRL.getQuestionsByUniversityNameAndDegreeNameAndProgramName("Demo-University", "masters", "cse").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 30");
         result = GroupsCTRL.getQuestionsByUniversityNameAndDegreeNameAndProgramNameAndTags("Demo-University", "masters", "cse", "University").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
       
        start = System.currentTimeMillis();
        System.out.println("---------------Test 31");
         result = GroupsCTRL.getQuestionByUniversityNameAndDegreeNameAndProgramNameAndDescription("Demo-University", "masters", "cse", "This-new-Qestion-on-Web-testing").toString();
        System.out.println(result);
         end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
       
        
        start = System.currentTimeMillis();
        System.out.println("---------------Test 32");
        result = GroupsCTRL.getQuestionByUniversityNameAndDegreeNameAndProgramNameAndTagAndDescription("punjab-technical-university","bachelor-of-science","computer-scienece","native-_-country","hello-hi-hi-hello-").toString();
        System.out.println(result);
        end = System.currentTimeMillis() - start;
        System.out.println((double)end/1000);
        
        System.out.println("Done Testing ");
        
    }
}
