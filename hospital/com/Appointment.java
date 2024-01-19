package hospital.com;

import java.util.Date;

public class Appointment {
	private int appId;
	private  Date appDate;
	private Patient patient;
	public Appointment() {
		
	}
	
	public Appointment(int appId, Date appDate, Patient patient) {
		super();
		this.appId = appId;
		this.appDate = appDate;
		this.patient = patient;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
}
