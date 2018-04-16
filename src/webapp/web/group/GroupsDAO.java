package webapp.web.group;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import webapp.db.connection.JDBCConnection;

public class GroupsDAO {

	Connection con = null; 
	PreparedStatement ps = null;
	ResultSet rs = null;
        
        public ArrayList<GroupQuestionsDTO> getQuestions() throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();                        
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS);                        
                        //System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
	public GroupQuestionsDTO getQuestionByDescription(String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTION_BY_DESCRIPTION);
			ps.setString(1,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}

	public ArrayList<GroupQuestionsDTO> getQuestionsByTags(String tag) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_TAGS);
			ps.setString(1,tag);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByDescriptionAndTags(String description,String tags) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                         GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTION_BY_DESCRIPTION_AND_TAGS);
			ps.setString(1,description);
			ps.setString(2,tags);
			rs = ps.executeQuery();
                        //System.out.println(ps.toString());
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
                        }
			return gr;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByDegreeName(String name) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_DEGREE_NAME );
			ps.setString(1,name);
                        //System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByDegreeNameAndDescription(String name,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_DEGREE_NAME_AND_DESCRIPTION);
			ps.setString(1,name);
                        ps.setString(2,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByDegreeNameAndTags(String name,String tag) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_DEGREE_NAME_AND_TAGS );
			ps.setString(1,name);
                        ps.setString(2,tag);
                        
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByDegreeNameAndTagAndDescription(String name,String tag,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_DEGREE_NAME_AND_TAGS_AND_DESCRIPTION );
			ps.setString(1,name);
                        ps.setString(2,tag);
                        ps.setString(3,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByProgramName(String name) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_PROGRAM_NAME );
			ps.setString(1,name);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByProgramNameAndTags(String name,String tag) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_PROGRAM_NAME_AND_TAGS);
			ps.setString(1,name);
                        ps.setString(2,tag);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByProgramNameAndDescription(String name,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_PROGRAM_NAME_AND_DESCRIPTION );
			ps.setString(1,name);
                        ps.setString(2,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByProgramNameAndTagAndDescription(String name,String tag,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_PROGRAM_NAME_AND_TAGS_AND_DESCRIPTION);
			ps.setString(1,name);
                        ps.setString(2,tag);
                        ps.setString(3,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByDegreeNameAndProgramName(String Dname,String Pname) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_DEGREE_NAME_AND_PROGRAM_NAME );
			ps.setString(1,Dname);
                        ps.setString(2,Pname);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByDegreeNameAndProgramNameAndTags(String Dname,String Pname, String tag) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_DEGREE_NAME_AND_PROGRAM_NAME_AND_TAGS);
			ps.setString(1,Dname);
                        ps.setString(2,Pname);
                        ps.setString(3,tag);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByDegreeNameAndProgramNameAndDescription(String Dname,String Pname,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_DEGREE_NAME_AND_PROGRAM_NAME_AND_DESCRIPTION);
			ps.setString(1,Dname);
                        ps.setString(2,Pname);
                        ps.setString(3,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}

        public GroupQuestionsDTO getQuestionByDegreeNameAndProgramNameAndTagAndDescription(String Dname,String Pname,String tag,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_DEGREE_NAME_AND_PROGRAM_NAME_AND_TAGS_AND_DESCRIPTIONS);
			ps.setString(1,Dname);
                        ps.setString(2,Pname);
                        ps.setString(3,tag);
                        ps.setString(4,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        /* */
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByUniversityName(String universityname) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();                        
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME);
                        ps.setString(1, universityname);
                        //System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}

	public GroupQuestionsDTO getQuestionByUniversityNameAndDescription(String universityname,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DESCRIPTION);
                        ps.setString(1,universityname);
			ps.setString(2,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}

	public ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndTags(String universityname,String tag) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_TAGS);
			ps.setString(1,universityname);
                        ps.setString(2,tag);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByUniversityNameAndDescriptionAndTags(String universityname,String description,String tags) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                         GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DESCRIPTION_AND_TAGS);
                        ps.setString(1,universityname);
			ps.setString(2,description);
			ps.setString(3,tags);
			rs = ps.executeQuery();
                        //System.out.println(ps.toString());
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
                        }
			return gr;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndDegreeName(String universityname,String dname) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DEGREE_NAME );
                        ps.setString(1,universityname);
			ps.setString(2,dname);
                        //System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByUniversityNameAndDegreeNameAndDescription(String universityname,String name,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DEGREE_NAME_AND_DESCRIPTION);
                        ps.setString(1,universityname);
			ps.setString(2,name);
                        ps.setString(3,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndDegreeNameAndTags(String universityname,String name,String tag) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DEGREE_NAME_AND_TAGS);
			ps.setString(1,universityname);
                        ps.setString(2,name);
                        ps.setString(3,tag);
                        
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByUniversityNameAndDegreeNameAndTagAndDescription(String universityname,String name,String tag,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DEGREE_NAME_AND_TAGS_AND_DESCRIPTION );
                        ps.setString(1,universityname);
			ps.setString(2,name);
                        ps.setString(3,tag);
                        ps.setString(4,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndProgramName(String universityname,String name) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_PROGRAM_NAME );
                        ps.setString(1,universityname);
			ps.setString(2,name);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndProgramNameAndTags(String universityname,String name,String tag) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_PROGRAM_NAME_AND_TAGS);
                        ps.setString(1,universityname);
			ps.setString(2,name);
                        ps.setString(3,tag);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByUniversityNameAndProgramNameAndDescription(String universityname,String name,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_PROGRAM_NAME_AND_DESCRIPTION );
			ps.setString(1,universityname);
                        ps.setString(2,name);
                        ps.setString(3,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByUniversityNameAndProgramNameAndTagAndDescription(String universityname, String name,String tag,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_PROGRAM_NAME_AND_TAGS_AND_DESCRIPTION);
                        ps.setString(1,universityname);
			ps.setString(2,name);
                        ps.setString(3,tag);
                        ps.setString(4,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndDegreeNameAndProgramName(String universityname,String Dname,String Pname) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DEGREE_NAME_AND_PROGRAM_NAME );
			ps.setString(1,universityname);
                        ps.setString(2,Dname);
                        ps.setString(3,Pname);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public ArrayList<GroupQuestionsDTO> getQuestionsByUniversityNameAndDegreeNameAndProgramNameAndTags(String universityname,String Dname,String Pname, String tag) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        ArrayList<GroupQuestionsDTO> questions = new ArrayList<GroupQuestionsDTO>();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DEGREE_NAME_AND_PROGRAM_NAME_AND_TAGS);
                        ps.setString(1,universityname);
			ps.setString(2,Dname);
                        ps.setString(3,Pname);
                        ps.setString(4,tag);
                      //  System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
                                questions.add(gr);
			}
			else {
				while(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
					questions.add(gr);
				}
			}
			return questions;	
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}
        
        public GroupQuestionsDTO getQuestionByUniversityNameAndDegreeNameAndProgramNameAndDescription(String universityname,String Dname,String Pname,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DEGREE_NAME_AND_PROGRAM_NAME_AND_DESCRIPTION);
			ps.setString(1,universityname);
                        ps.setString(2,Dname);
                        ps.setString(3,Pname);
                        ps.setString(4,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}

        public GroupQuestionsDTO getQuestionByUniversityNameAndDegreeNameAndProgramNameAndTagAndDescription(String universityname,String Dname,String Pname,String tag,String description) throws ClassNotFoundException, SQLException {
		try {
			con = JDBCConnection.getConnection();
                        GroupQuestionsDTO gr = null;
			ps = con.prepareStatement(GroupsSQL.READ_QUESTIONS_BY_UNIVERSITY_NAME_AND_DEGREE_NAME_AND_PROGRAM_NAME_AND_TAGS_AND_DESCRIPTION);
			ps.setString(1,universityname);
                        ps.setString(2,Dname);
                        ps.setString(3,Pname);
                        ps.setString(4,tag);
                        ps.setString(5,description);
                       // System.out.println(ps.toString());
			rs = ps.executeQuery();			
			if(!rs.isBeforeFirst()) {
				gr = new GroupQuestionsDTO(0,0,0," ", " ", " "," ");;
			}
			else {
				if(rs.next()) {
					gr = new GroupQuestionsDTO(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6),rs.getString(7));
				}
			}			
			return gr;			
		} finally {
			JDBCConnection.closeConnection(rs, ps, con);
		}
	}

}
