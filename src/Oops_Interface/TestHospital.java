package Oops_Interface;

public class TestHospital {

	public static void main(String[] args) {
		Fortis_Hospital fh= new Fortis_Hospital();
		
		fh.physioservices();
		fh.cardioservices();
		fh.orthoservices();
		fh.emergencyservices();
	}

}
