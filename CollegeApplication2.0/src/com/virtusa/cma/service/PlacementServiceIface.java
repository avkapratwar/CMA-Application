package com.virtusa.cma.service;

import com.virtusa.cma.entity.Placement;

public interface PlacementServiceIface {
	String insertPlacement(Placement p);		
	String updatePlacement(Placement p);		
	Placement[] showPlacement();
	Placement showParticularPlacement(String companyname);
	String deletePlacement(String companyname);
}
