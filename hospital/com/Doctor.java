package hospital.com;

public class Doctor {
	private int doctId;
	private String doctName;
	private String specialisation;
	private Appointment appointment;
	public Doctor() {
		
	}
	
	public Doctor(int doctId, String doctName, String specialisation, Appointment appointment) {
		super();
		this.doctId = doctId;
		this.doctName = doctName;
		this.specialisation = specialisation;
		this.appointment = appointment;
	}

	public int getDoctId() {
		return doctId;
	}

	public void setDoctId(int doctId) {
		this.doctId = doctId;
	}

	public String getDoctName() {
		return doctName;
	}

	public void setDoctName(String doctName) {
		this.doctName = doctName;
	}

	public String getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}
	
	
	
	
}
