package Oops_Interface;

public class Fortis_Hospital implements Us_Medical ,Uk_Medical,Ind_Medical{

	//us
	@Override
	public void physioservices() {
		System.out.println("FH--physioservices");
		
	}

	@Override
	public void oncologyservices() {
		
		System.out.println("FH--oncologyservices");
	}

	@Override
	public void dentalservices() {
		
		System.out.println("FH--dentalservices");
	}

	@Override
	public void dermaservices() {
		
		System.out.println("FH--dermaservices");
	}
	
    //uk
	@Override
	public void pedioservices() {
		System.out.println("FH--pedioservices");
		
	}

	@Override
	public void cardioservices() {
		System.out.println("FH--cardioservices");
		
	}
	
	//Ind
	@Override
	public void nueroservices() {
		
		System.out.println("FH--nueroservices");	
	}

	@Override
	public void orthoservices() {
		
		System.out.println("FH--orthoservices");
	}

	@Override
	public void entservices() {
		System.out.println("FH--entservices");
		
	}

	//Individual
	@Override
	public void emergencyservices() {
		//by writing if else logic we can use this method for all the interfaces
		
		System.out.println("FH--Us_emergencyservices");
		System.out.println("FH--Uk_emergencyservices");
		System.out.println("FH--Ind_emergencyservices");
		
	}
	}


