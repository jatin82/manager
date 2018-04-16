package webapp.web.group;



public class GroupQuestionsDTO {

	private int questionId;
        private int groupId;
	private String description;
	private int postBy;
	private String postOn;
	private String tags;
	private String author="";

	public GroupQuestionsDTO(int questionId,int groupId, int postBy, String tags, String description, String postOn, String author) {
		super();
		this.questionId = questionId;
		this.description = description;
		this.postBy = postBy;
		this.postOn = postOn;
		this.tags = tags;
                this.groupId=groupId;
                this.author=author;
        }

	public void setAuthor(String author){
		this.author = author;
	}
	
	public String getAuthor(){
		return this.author;
	}
	
	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;;
	}

	public String getDescription() {
		return description;
	}

//	public void setDescription(String description) {
//		this.description = description;
//	}

	public int getPostBy() {
		return postBy;
	}

//	public void setPostBy(int postBy) {
//		this.postBy = postBy;
//	}

	public String getPostOn() {
		return postOn;
	}

//	public void setPostOn(String postOn) {
//		this.postOn = postOn;
//	}

	public String getTags() {
		return tags;
	}

//	public void setTags(String tags) {
//		this.tags = tags;
//	}

    @Override
    public String toString() {
        return "groupQuestionsDTO{" + "questionId=" + questionId + ", groupId=" + groupId + ", description=" + description + ", postBy=" + postBy + ", postOn=" + postOn + ", tags=" + tags + ", author=" + author + '}';
    }
        

}
