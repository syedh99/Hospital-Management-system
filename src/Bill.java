class Bill
{
    private double medicineCharge;
    private double doctorFee;
    private double roomCharges;

    public Bill(double mCharge,double rCharges,double dFee)
    {
        medicineCharge = mCharge;
        roomCharges = rCharges;
        doctorFee = dFee;
    }

    public String toString()
    {
        return "\nPharmacy Charges: $"+medicineCharge+ "\nRoom Charges:     $" + roomCharges + "\nDoctor's Fees:    $" + doctorFee
                + "\n------------------------------" + "\nTotal Charges:    $" + (medicineCharge+roomCharges+doctorFee);
    }
}