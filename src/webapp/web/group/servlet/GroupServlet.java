package webapp.web.group.servlet;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import webapp.web.group.GroupQuestionsDTO;
import webapp.web.group.GroupsCTRL;

@RestController
public class GroupServlet {

	@RequestMapping("/general-discussion")
	public ModelAndView getAllQuestions() {
		try {
			System.out.println("Get all questions");
			ArrayList<GroupQuestionsDTO> dto = GroupsCTRL.getQuestions();
			if (!dto.toString().equals(
					"[groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }]"))
				return new ModelAndView("index", "dto", dto);
			else
				return new ModelAndView("error");
		} catch (Exception e) {
			return new ModelAndView("error");
		}
	}

	@RequestMapping("/general-discussion/{url}")
	public ModelAndView getQuestionsWithSingleURL(@PathVariable("url") String url) {

		try {
			if (!GroupsCTRL.getQuestionsByTags(url).toString().equals(
					"[groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }]")) {
				System.out.println("Get all questions with tag-name : " + url);
				ArrayList<GroupQuestionsDTO> dto = GroupsCTRL.getQuestionsByTags(url);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionByDescription(url).toString().equals(
					"groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }")) {
				System.out.println("Get all questions with question-description : " + url);
				GroupQuestionsDTO dto = GroupsCTRL.getQuestionByDescription(url);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionsByDegreeName(url).toString().equals(
					"[groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }]")) {
				System.out.println("Get all questions with degree-name : " + url);
				ArrayList<GroupQuestionsDTO> dto = GroupsCTRL.getQuestionsByDegreeName(url);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionsByProgramName(url).toString().equals(
					"[groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }]")) {
				System.out.println("Get all questions with program-name : " + url);
				ArrayList<GroupQuestionsDTO> dto = GroupsCTRL.getQuestionsByProgramName(url);
				return new ModelAndView("index", "dto", dto);
			} else
				return new ModelAndView("error");

		} catch (Exception e) {
			return new ModelAndView("error");
		}

	}

	@RequestMapping("/general-discussion/{first}/{second}")
	public ModelAndView getQuestionsWithTwoURL(@PathVariable("first") String first,
			@PathVariable("second") String second) {
		try {
			if (!GroupsCTRL.getQuestionByDegreeNameAndDescription(first, second).toString().equals(
					"groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }")) {
				System.out
						.println("Get all questions with degree-name : " + first + " question-description : " + second);
				GroupQuestionsDTO dto = GroupsCTRL.getQuestionByDegreeNameAndDescription(first, second);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionsByDegreeNameAndProgramName(first, second).toString().equals(
					"[groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }]")) {
				System.out.println("Get all questions with degree-name : " + first + " program-name : " + second);
				ArrayList<GroupQuestionsDTO> dto = GroupsCTRL.getQuestionsByDegreeNameAndProgramName(first, second);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionsByProgramNameAndTags(first, second).toString().equals(
					"[groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }]")) {
				System.out.println("Get all questions with program-name : " + first + " tag-name : " + second);
				ArrayList<GroupQuestionsDTO> dto = GroupsCTRL.getQuestionsByProgramNameAndTags(first, second);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionByDescriptionAndTags(first, second).toString().equals(
					"groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }")) {
				System.out.println("Get all questions with question-description : " + first + " tag-name : " + second);
				GroupQuestionsDTO dto = GroupsCTRL.getQuestionByDescriptionAndTags(first, second);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionByProgramNameAndDescription(first, second).toString().equals(
					"groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }")) {
				System.out.println(
						"Get all questions with program-name : " + first + " question-description : " + second);
				GroupQuestionsDTO dto = GroupsCTRL.getQuestionByProgramNameAndDescription(first, second);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionsByDegreeNameAndTags(first, second).toString().equals(
					"[groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }]")) {
				System.out.println("Get all questions with degree-name : " + first + " tag-name : " + second);
				ArrayList<GroupQuestionsDTO> dto = GroupsCTRL.getQuestionsByDegreeNameAndTags(first, second);
				return new ModelAndView("index", "dto", dto);
			} else
				return new ModelAndView("error");
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error");
		}

	}

	@RequestMapping("/general-discussion/{first}/{second}/{third}")
	public ModelAndView getQuestionsWithThreeURL(@PathVariable("first") String first,
			@PathVariable("second") String second, @PathVariable("third") String third) {
		try {
			if (!GroupsCTRL.getQuestionByDegreeNameAndProgramNameAndDescription(first, second, third).toString().equals(
					"groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }")) {
				System.out.println("Get all questions with degree-name : " + first + " program-name : " + second
						+ " question-description : " + third);
				GroupQuestionsDTO dto = GroupsCTRL.getQuestionByDegreeNameAndProgramNameAndDescription(first, second,
						third);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionByDegreeNameAndTagAndDescription(first, second, third).toString().equals(
					"groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }")) {
				System.out.println("Get all questions with degree-name : " + first + " tag-name : " + second
						+ " question-description : " + third);
				GroupQuestionsDTO dto = GroupsCTRL.getQuestionByDegreeNameAndTagAndDescription(first, second, third);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionByProgramNameAndTagAndDescription(first, second, third).toString().equals(
					"groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }")) {
				System.out.println("Get all questions with program-name : " + first + " tag-name : " + second
						+ " quesstion-description : " + third);
				GroupQuestionsDTO dto = GroupsCTRL.getQuestionByProgramNameAndTagAndDescription(first, second, third);
				return new ModelAndView("index", "dto", dto);
			} else if (!GroupsCTRL.getQuestionsByDegreeNameAndProgramNameAndTags(first, second, third).toString()
					.equals("[groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }]")) {
				System.out.println("Get all questions with degree-name : " + first + " program-name : " + second
						+ " tags : " + third);
				ArrayList<GroupQuestionsDTO> dto = GroupsCTRL.getQuestionsByDegreeNameAndProgramNameAndTags(first, second,
						third);
				return new ModelAndView("index", "dto", dto);
			} else
				return new ModelAndView("error");
		} catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("error");
		}
	}

	@RequestMapping("/general-discussion/{first}/{second}/{third}/{fourth}")
	public ModelAndView getQuestionsWithFourURL(@PathVariable("first") String first,
			@PathVariable("second") String second, @PathVariable("third") String third,
			@PathVariable("fourth") String fourth) {
		try {
			if (!GroupsCTRL.getQuestionByDegreeNameAndProgramNameAndTagAndDescription(first, second, third, fourth)
					.toString()
					.equals("groupQuestionsDTO{questionId=0, groupId=0, description= , postBy=0, postOn= , tags= , author= }")) {
				System.out.println("Get all questions with degree-name : " + first + " program-name : " + second
						+ " tag-name : " + third + " question-description : " + fourth);
				GroupQuestionsDTO dto = GroupsCTRL.getQuestionByDegreeNameAndProgramNameAndTagAndDescription(first,
						second, third, fourth);
				return new ModelAndView("index", "dto", dto);
			} else
				return new ModelAndView("error");
		} catch (Exception e) {

			e.printStackTrace();
			return new ModelAndView("error");
		}
	}

}