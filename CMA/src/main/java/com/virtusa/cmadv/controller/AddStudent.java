package com.virtusa.cmadv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.cmadv.entity.Student;
import com.virtusa.cmadv.service.StudentServiceIface;


@Controller
public class AddStudent {

	private static final Object Faculty = null;
	@Autowired
	StudentServiceIface studentServiceIface;
	
	@RequestMapping("/insert")
	public String taketoInsert(Model m) {
		System.out.println("cgfcfg");
		m.addAttribute("studentinfo",new Student());
		return "StudentReg";
	}
	
	@RequestMapping("/ins")
	public ModelAndView insertinfo(@ModelAttribute("studentinfo")Student student)
	{
	/*Faculty faculty=new Faculty();
	faculty.setEmpno(empno);
	faculty.setFirstname(firstname);
	faculty.setLastname(lastname);
	faculty.setDateOfBirth(dateOfBirth);
	faculty.setEmail(email);
	faculty.setMobileNumber(mobileNumber);
	faculty.setQualification(qualification);
	faculty.setDepartment(department);
	faculty.setExperience(experience);
	faculty.setGender(gender);
	faculty.setCity(city);
	faculty.setState(state);*/
	//ModelAndView m=new ModelAndView();
	//m.addAttribute("name","success");
	System.out.println("cgfcfg");

	if(studentServiceIface.insertStudent(student).equals("success"))
	{
	return new ModelAndView("viewpagess","name","success");
	}
	return null;

	}
	    
	@RequestMapping("/show")
	public ModelAndView showInfo() {
		ModelAndView modelAndView=new ModelAndView("showReg","studentinfo",new Student());
		return modelAndView;
	}
	@RequestMapping("/showall")
	public ModelAndView showStudent(@ModelAttribute("studentinfo") Student student,Model model)
	{ 
		//System.out.println(student.getStudentid());
		List<Student> l= studentServiceIface.showStudent(student);
		
	// System.out.println(student.getStudentid());
	 if(l.isEmpty()) {
	 return new ModelAndView("ShowStudent","msg","No Records Found"); 
	 }
	return new  ModelAndView("ShowStudent","stu",l);
	}
	
	
	@RequestMapping("/Studentupdate/{studid}")
	@ResponseBody
	public ModelAndView takeToReg1(@PathVariable("studid") String studentid) {
	//System.out.println(faculty.getCity()+" Controller");
	//Student student = new Student();
	System.out.println(studentid);
	//System.out.println(faculty.getDateOfBirth().getClass());
	Student student2=studentServiceIface.showDetail(studentid);

	return new ModelAndView("UpdateStudent","student",student2);
	}        
	@RequestMapping(value = "/Studentupdate/Update",method = RequestMethod.GET)
	public String update(@ModelAttribute("upd") Student student, Model m) {
	System.out.println("dsdasdd");
	System.out.println(student.getStudentid());
	String s=studentServiceIface.updateStudent(student);

	if(s==null) {
	//System.out.println(result.getAllErrors());
	m.addAttribute("updated","not updated");
	return "UpdateStudent";
	}else {
	m.addAttribute("updated","updated");
	return "successupdate";
	}
	}
}