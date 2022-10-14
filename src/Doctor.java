class Doctor extends Person
{
    private String speciality;

    public Doctor(String firstName,String lastName,String speciality)
    {
        super(firstName,lastName); // sending arguments to base class constructor
        this.speciality = speciality;
    }

    public void SetSpeciality(String Speciality)
    {
        this.speciality = speciality;
    }

    public String getSpeciality()
    {
        return speciality;
    }

    public String toString()
    {
        return super.toString()+" "+speciality;
    }
}