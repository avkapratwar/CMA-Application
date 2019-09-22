package com.virtusa.cma.controller;

import java.util.Date;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.cma.service.CourseServiceIface;
import com.virtusa.cma.service.FacultyServiceIface;
import com.virtusa.cma.entity.Courses;
import com.virtusa.cma.entity.Faculty;;



@Controller
public class AddFaculty {

	private static final Object Faculty = null;
	@Autowired
	FacultyServiceIface facultyServiceIface;
	
	@RequestMapping("/facultypart")
	public String fac(Model m)
	{
		return "Faculty";
	}
	@RequestMapping("/insert")
	public String taketoInsert(Model m) {
		System.out.println("cgfcfg");
		//m.addAttribute("facultyinfo",new Faculty());
		return "FacultyReg";
	}
	
	@RequestMapping("/ins")
	//public String InsertInfo(@RequestParam("empno") String empno,@RequestParam("firstname") String firstname,@RequestParam("lastname") String lastname,@RequestParam("dob") Date dateOfBirth,@RequestParam("email") String email,@RequestParam("mobilenumber") String mobileNumber,@RequestParam("qualification") String qualification,@RequestParam("ee") String experience,@RequestParam("department") String department,@RequestParam("gender") String gender,@RequestParam("city") String city,@RequestParam("state") String state,Model m)
	public ModelAndView insertinfo(@ModelAttribute("facultyinfo")Faculty faculty)
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
		if(facultyServiceIface.insertFaculty(faculty)!=null)
		{
			return new ModelAndView("Viewpage","name","success");
		}
		return null;
		
	}
	/*
	 * @RequestMapping("/show") public String taketoShow(Model m) {
	 * 
	 * return "showReg"; }
	 * 
	 * @RequestMapping("/sh") public ModelAndView Library(@ModelAttribute("myForm")
	 * Faculty faculty,Model m) { List l= facultyServiceIface.showFaculty(faculty);
	 * 
	 * System.out.println(faculty.getEmpno());
	 * 
	 * //System.out.println(f.getEmail()); if(l==null) { return new
	 * ModelAndView("ShowFaculty","msg","No Records Found"); } return new
	 * ModelAndView("ShowFaculty","fac",l); }
	 */
	
	@RequestMapping("/show")
	public ModelAndView showInfo() {
		ModelAndView modelAndView=new ModelAndView("showReg","facultyinfo",new Faculty());
		return modelAndView;
	}
	@RequestMapping("/showall")
	public ModelAndView showFaculty(@ModelAttribute("facultyinfo") Faculty faculty,Model model)
	{ 
		System.out.println(faculty.getEmpno());
		List<Faculty> l= facultyServiceIface.showFaculty(faculty);
		//System.out.println(l);
	 System.out.println(faculty.getEmpno());
	 if(l.isEmpty()) {
	 return new ModelAndView("ShowFaculty","msg","No Records Found"); 
	 }
	return new  ModelAndView("ShowFaculty","fac",l);
	}
	
	
	@RequestMapping("/Facultyupdate")
	public ModelAndView takeToReg1(Faculty faculty) {
		//System.out.println(faculty.getCity()+" Controller");
		return new ModelAndView("UpdateFaculty","fac",faculty);
	}
	@RequestMapping("/Update")
	public String update(@ModelAttribute("upd") Faculty faculty, Model m) {
		System.out.println("dsdasdd");
		String s=facultyServiceIface.updateFaculty(faculty);
		
		if(s==null) {
			//System.out.println(result.getAllErrors());
			m.addAttribute("updated","not updated");
			return "UpdateFaculty";
		}else {
			m.addAttribute("updated","updated");
			return "successupdate";
		}
	}
	
	
	
}
