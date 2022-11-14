package com.marketingapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entities.Lead;
import com.marketingapp.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;
	
	
    public void saveLead(Lead lead) {
		leadRepo.save(lead);

	}
    public List<Lead> getLeads(){
    	List<Lead> leads = leadRepo.findAll();
    	return leads;
    }
    @Override
	public List<Lead> listAll() {
		List<Lead> leads = leadRepo.findAll();
		return leads;
	}
    public void deleteLead(long id) {
    	leadRepo.deleteById(id);
    }


}
