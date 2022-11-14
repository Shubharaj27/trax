package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.controller.dto.LeadData;
import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	@RequestMapping("/viewLeadPage")
	public String viewSaveLeadPage() {
		return "new_lead";
	}

	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute Lead lead, ModelMap model) {
			leadService.saveLead(lead);
			model.addAttribute("msg", "Lead is Saved");
			return "new_lead";
		}
	@RequestMapping("/listAll")
	public String listAll(ModelMap model) {
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads",leads);
		return "lead_search_result";
	}
	@RequestMapping("/delete")
	public String deleteOneLead(@RequestParam("id") long id,ModelMap model) {
		leadService.deleteLead(id);
		List<Lead> leads = leadService.getLeads();
		model.addAttribute("leads",leads);
		return "lead_search_result";
	}
}



