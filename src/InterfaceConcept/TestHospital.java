package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		fh.ambulanceServices();
		fh.cardioServices();
		fh.dentalServices();
		fh.emergencyServices();
		fh.ENTServices();
		fh.medicalInsurance();
		fh.nueroServices();
		fh.OPTServices();
		fh.orthopedicServices();
		fh.pathologyServices();
		fh.pediatricServices();
		fh.phsioServices();
		fh.Services_911();
		
		
		
		//Top casting
		USMedical um = new FortisHospital();
		um.ambulanceServices();
		um.dentalServices();
		um.nueroServices();
		um.orthopedicServices();
		um.Services_911();
		USMedical.billing();
		System.out.println(USMedical.min_fee);
		
		
	
	}

}
