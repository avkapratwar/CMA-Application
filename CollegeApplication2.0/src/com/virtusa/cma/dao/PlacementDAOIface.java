package com.virtusa.cma.dao;

import com.virtusa.cma.entity.Placement;

public interface PlacementDAOIface {
	
	String insertPlacement(Placement p);		
	
	String updatePlacement(Placement p);		
	
	String deletePlacement(String companyname);
	
	Placement showParticularPlacement(String companyname);
	Placement[] showPlacement();
}
