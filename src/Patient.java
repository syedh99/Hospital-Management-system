class Patient extends Person
{
    private int patientID;
    private Date dateAdmitted,dateDismissed;
    private Doctor physicianName;

    Patient(String firstName,String lastName,int patientID,Date dateAdmitted,Date dateDismissed,Doctor physicianName)
    {
        super(firstName,lastName);
        this.patientID = patientID;
        this.dateAdmitted = dateAdmitted;
        this.dateDismissed = dateDismissed;
        this.physicianName = physicianName;
    }

    public Patient(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public String toString()
    {
        return "Patient: " + super.toString() + "\nAttending Physician: " + physicianName + "\nAdmit Date: "
                + dateAdmitted +"\nDate dismissed: "+dateDismissed;
    }
}
