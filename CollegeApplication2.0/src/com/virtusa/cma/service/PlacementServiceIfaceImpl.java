package com.virtusa.cma.service;

import com.virtusa.cma.dao.PlacementDAOIface;
import com.virtusa.cma.dao.PlacementDAOIfaceImpl;
import com.virtusa.cma.entity.Placement;

public class PlacementServiceIfaceImpl implements PlacementServiceIface {

	PlacementDAOIface pl;
	public  PlacementServiceIfaceImpl() {
		pl=new PlacementDAOIfaceImpl();
	}
	
	@Override
	public String insertPlacement(Placement p) {
		return pl.insertPlacement(p);
	}

	@Override
	public String updatePlacement(Placement p) {
		return pl.updatePlacement(p);
	}

	@Override
	public Placement[] showPlacement() {
		return pl.showPlacement();
	}

	@Override
	public Placement showParticularPlacement(String companyname) {

		return pl.showParticularPlacement(companyname);
	}

	@Override
	public String deletePlacement(String companyname) {

		return pl.deletePlacement(companyname);
	}

}
