package webapp.web.group;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GroupsCTRL {
    
    private static GroupsDAO g=new GroupsDAO();
    private static String Parser(String value){
        if(value.contains("_")){
            value=value.replaceAll("-","");
        }
        else{
        value=value.replace("-"," ");
        }
          return value;      
    }
    
    public static ArrayList<GroupQuestionsDTO> getQuestions(){
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestions();
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
    
    public static GroupQuestionsDTO getQuestionByDescription(String description){
        String des="";
        des=Parser(description);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByDescription(des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
    
    public static ArrayList<GroupQuestionsDTO> getQuestionsByTags(String tags){
        String tag="";
        tag=Parser(tags);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByTags(tag);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
    
    public static GroupQuestionsDTO getQuestionByDescriptionAndTags(String description,String tags){
        String des,tag="";
        des=Parser(description);
        tag=Parser(tags);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByDescriptionAndTags(des,tag);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
    
    public static ArrayList<GroupQuestionsDTO> getQuestionsByDegreeName(String dname){
        String degree="";
        degree=Parser(dname);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByDegreeName(degree);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
    
    public static GroupQuestionsDTO getQuestionByDegreeNameAndDescription(String dname,String description){
        String degree,des="";
        des=Parser(description);
        degree=Parser(dname);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByDegreeNameAndDescription(degree,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
    
    public static ArrayList<GroupQuestionsDTO> getQuestionsByDegreeNameAndTags(String dname,String tags){
        String degree,tag="";
        degree=Parser(dname);
        tag=Parser(tags);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByDegreeNameAndTags(degree,tag);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
    
    public static GroupQuestionsDTO getQuestionByDegreeNameAndTagAndDescription(String dname,String tags,String description){
        String degree,des,tag="";
        des=Parser(description);
        degree=Parser(dname);
        tag=Parser(tags);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByDegreeNameAndTagAndDescription(degree,tag,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
    
    public static ArrayList<GroupQuestionsDTO> getQuestionsByProgramName(String pname){
        String program="";
        program=Parser(pname);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByProgramName(program);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
    
            
            public static ArrayList<GroupQuestionsDTO> getQuestionsByProgramNameAndTags(String pname,String tag){
        String program,tags="";
        program=Parser(pname);
        tags=Parser(tag);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByProgramNameAndTags(program,tags);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
            
            public static GroupQuestionsDTO getQuestionByProgramNameAndDescription(String pname,String description){
        String program,des="";
        des=Parser(description);
        program=Parser(pname);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByProgramNameAndDescription(program,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
            
            public static GroupQuestionsDTO getQuestionByProgramNameAndTagAndDescription(String pname,String tag,String description){
        String program,des,tags="";
        des=Parser(description);
        tags=Parser(tag);
        program=Parser(pname);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByProgramNameAndTagAndDescription(program,tags,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
    
            public static ArrayList<GroupQuestionsDTO> getQuestionsByDegreeNameAndProgramName(String Dname,String Pname){
        String degree,program="";
        program=Parser(Pname);
        degree=Parser(Dname);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByDegreeNameAndProgramName(degree,program);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
    
            public static ArrayList<GroupQuestionsDTO> getQuestionsByDegreeNameAndProgramNameAndTags(String Dname,String Pname, String tag) {
        String degree,program,tags="";
        program=Parser(Pname);
        degree=Parser(Dname);
        tags=Parser(tag);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByDegreeNameAndProgramNameAndTags(degree,program,tags);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
            
            public static GroupQuestionsDTO getQuestionByDegreeNameAndProgramNameAndDescription(String dname,String pname,String des){
        String program,degree,description="";
        description=Parser(des);
        degree=Parser(dname);
        program=Parser(pname);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByDegreeNameAndProgramNameAndDescription(degree,program,description);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
            
            public static GroupQuestionsDTO getQuestionByDegreeNameAndProgramNameAndTagAndDescription(String dname,String pname,String tag,String description){
        String program,degree,tags,des="";
        des=Parser(description);
        degree=Parser(dname);
        tags=Parser(tag);
        program=Parser(pname);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByDegreeNameAndProgramNameAndTagAndDescription(degree,program,tags,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
    
    public static ArrayList<GroupQuestionsDTO> getQuestionsByUniversityName(String uname){
        String university="";
        university=Parser(uname);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByUniversityName(university);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
    
         public static GroupQuestionsDTO getQuestionByUniversityNameAndDescription(String uname,String description){
        String university,des="";
        des=Parser(description);
        university=Parser(uname);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByUniversityNameAndDescription(university,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
         
         public static ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndTags(String uname,String tags){
        String university,tag="";
        university=Parser(uname);
        tag=Parser(tags);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByUniversityNameAndTags(university,tag);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
         
         public static GroupQuestionsDTO getQuestionByUniversityNameAndDescriptionAndTags(String uname,String description,String tags){
        String university,des,tag="";
        des=Parser(description);
        university=Parser(uname);
        tag=Parser(tags);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByUniversityNameAndDescriptionAndTags(university,des,tag);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
    
         public static ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndDegreeName(String uname,String dname){
        String university,degree="";
        university=Parser(uname);
        degree=Parser(dname);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByUniversityNameAndDegreeName(university,degree);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
         
         public static GroupQuestionsDTO getQuestionByUniversityNameAndDegreeNameAndDescription(String uname,String dname,String description){
        String university,degree,des="";
        des=Parser(description);
        degree=Parser(dname);
        university=Parser(uname);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByUniversityNameAndDegreeNameAndDescription(university,degree,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
                return question;
         }
         
         
         public static ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndDegreeNameAndTags(String uname,String dname,String tag){
        String university,degree,tags="";
        university=Parser(uname);
        degree=Parser(dname);
        tags=Parser(tag);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByUniversityNameAndDegreeNameAndTags(university,degree,tags);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
         
          public static GroupQuestionsDTO getQuestionByUniversityNameAndDegreeNameAndTagAndDescription(String uname,String dname,String tags,String description){
        String university,degree,des,tag="";
        des=Parser(description);
        university=Parser(uname);
        degree=Parser(dname);
        tag=Parser(tags);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByUniversityNameAndDegreeNameAndTagAndDescription(university,degree,tag,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
         
          public static ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndProgramName(String uname,String pname){
        String university,program="";
        university=Parser(uname);
        program=Parser(pname);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByUniversityNameAndProgramName(university,program);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
          
         public static ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndProgramNameAndTags(String uname,String pname,String tag){
        String university,program,tags="";
        university=Parser(uname);
        program=Parser(pname);
        tags=Parser(tag);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByUniversityNameAndProgramNameAndTags(university,program,tags);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
         
          public static GroupQuestionsDTO getQuestionByUniversityNameAndProgramNameAndDescription(String uname,String pname,String description){
        String university,program,des="";
        des=Parser(description);
        university=Parser(uname);
        program=Parser(pname);
   
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByUniversityNameAndProgramNameAndDescription(university,program,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return question;
    }
        
          public static GroupQuestionsDTO getQuestionByUniversityNameAndProgramNameAndTagAndDescription(String uname,String pname,String tag,String description){
        String university,program,des,tags="";
        des=Parser(description);
        program=Parser(pname);
        university=Parser(uname);
        tags=Parser(tag);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByUniversityNameAndProgramNameAndTagAndDescription(university,program,tags,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
                return question;
         }
          
          public static ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndDegreeNameAndProgramName(String uname,String dname,String pname){
        String university,program,degree="";
        university=Parser(uname);
        degree=Parser(dname);
        program=Parser(pname);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByUniversityNameAndDegreeNameAndProgramName(university,degree,program);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
         
          public static ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndDegreeNameAndProgramNameAndTags(String uname,String dname,String pname,String tag){
        String university,program,degree,tags="";
        university=Parser(uname);
        program=Parser(pname);
        degree=Parser(dname);
        tags=Parser(tag);
	ArrayList<GroupQuestionsDTO> questlist = new ArrayList<GroupQuestionsDTO>();                        
		try{
                    questlist=g.getQuestionsByUniversityNameAndDegreeNameAndProgramNameAndTags(university,degree,program,tags);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        } 
                
        return questlist;
    }
        
          public static GroupQuestionsDTO getQuestionByUniversityNameAndDegreeNameAndProgramNameAndDescription(String uname,String dname,String pname,String description){
        String university,program,degree,des="";
        des=Parser(description);
        program=Parser(pname);
        university=Parser(uname);
        degree=Parser(dname);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByUniversityNameAndDegreeNameAndProgramNameAndDescription(university,degree,program,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
                return question;
         }
          
            public static GroupQuestionsDTO getQuestionByUniversityNameAndDegreeNameAndProgramNameAndTagAndDescription(String uname,String dname,String pname,String tags,String description){
        String university,program,degree,des,tag="";
        des=Parser(description);
        program=Parser(pname);
        university=Parser(uname);
        degree=Parser(dname);
        tag=Parser(tags);
        GroupQuestionsDTO question = null;
		try{
                    question=g.getQuestionByUniversityNameAndDegreeNameAndProgramNameAndTagAndDescription(university,degree,program,tag,des);
                    
                } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
                return question;
         }
            
}
