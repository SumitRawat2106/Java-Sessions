package InterfaceConcept;

public class FortisHospital implements USMedical, UKMedical,IndiaMedical {

	//USMedical
	@Override
	public void orthopedicServices() {
		System.out.println("FortisHospital implements orthopedicServices ");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FortisHospital implements dentalServices ");
		
	}

	@Override
	public void nueroServices() {
		System.out.println("FortisHospital implements nueroServices ");
		
	}

	@Override
	public void ambulanceServices() {
		System.out.println("FortisHospital implements ambulanceServices ");
		
	}

	
	//UKMedical
	@Override
	public void phsioServices() {
		System.out.println("FortisHospital implements phsioServices ");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FortisHospital implements ENTServices ");
		
	}

	@Override
	public void pediatricServices() {
		System.out.println("FortisHospital implements pediatricServices ");
		
	}
	
	//IndiaMedical

	@Override
	public void emergencyServices() {
		System.out.println("FortisHospital implements pediatricServices ");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FortisHospital implements cardioServices ");
		
	}

	@Override
	public void OPTServices() {
		System.out.println("FortisHospital implements OPTServices ");
		
	}
	
	
	//Non overridden methods
	public void medicalInsurance() {
		
		System.out.println("FortisHospital has medicalInsurance ");
		
	}
	
    public void pathologyServices() {
    	System.out.println("FortisHospital has pathologyServices ");
	}
	
	
	
	
	
	

}
