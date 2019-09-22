package com.virtusa.cmadv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.virtusa.cmadv.entity.Feedback;
import com.virtusa.cmadv.service.FeedbackServiceIface;

@Controller
public class FeedbackController {
	@Autowired
	FeedbackServiceIface feedbackServiceIface;
	@RequestMapping("/insertfeedback")
	public String taketoInsert1(Model m) {
		m.addAttribute("Feedback",new Feedback());
		return "FeedbackMain";
	}
	
	
	@RequestMapping(value="/addfeedback")

	public String InsertInfo1(Feedback feedback,Model m)
	{
		m.addAttribute("name","successfully inserted");
	    // request.getSession().setAttribute("name",events.getEventName());
		if(feedbackServiceIface.insertFeedbackService(feedback)!=null)
		{
	
			return "Viewpage";
		}
		return null;
		
	}
	
	@RequestMapping("/Showallfeedback")
	public ModelAndView ShowallFeedback() {
		List<Feedback> l=feedbackServiceIface.showAllService();
		String msg=null;
		if(l.isEmpty()) {
			msg="No records found";
			return new ModelAndView("Viewpage","msg",msg);
		}
		return new ModelAndView("ShowAllFeedback","list",l);
	
	}


}
