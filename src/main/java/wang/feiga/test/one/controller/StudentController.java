package wang.feiga.test.one.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import wang.feiga.test.one.entity.Student;
import wang.feiga.test.one.service.IStudentService;

@Controller
@RequestMapping("/stu")
public class StudentController {

	@Autowired
	private IStudentService studentservice;

	/**
	 * 根据id查询
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("/stusele")
	public String Stusele(HttpServletRequest request, Model model) {
		int id = Integer.parseInt(request.getParameter("id"));
		Student stu = this.studentservice.selectStudentById(id);
		model.addAttribute("stu", stu);
		return "student";
	}

	/**
	 * 插入
	 * 
	 * @param request
	 * @param model
	 * @return
	 */
	public String Stuinsert(HttpServletRequest request, Model model) {
		
		return null;
	}
}
