/**
 * The Policy class represents an insurance policy with details about the policyholder.
 */
public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyHolderFirstName;
    private String policyHolderLastName;
    private int policyHolderAge;
    private String smokingStatus;
    private double height;
    private double weight;

    /**
     * Constructs a Policy object with the given information.
     * @param policyNumber The policy number
     * @param providerName The name of the provider
     * @param policyHolderFirstName The policyholder's first name
     * @param policyHolderLastName The policyholder's last name
     * @param policyHolderAge The policyholder's age
     * @param smokingStatus The smoking status ("smoker" or "non-smoker")
     * @param height The height in inches
     * @param weight The weight in pounds
     */
    public Policy(int policyNumber, String providerName, String policyHolderFirstName, String policyHolderLastName,
                  int policyHolderAge, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolderFirstName = policyHolderFirstName;
        this.policyHolderLastName = policyHolderLastName;
        this.policyHolderAge = policyHolderAge;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    /** @return the policy number */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /** @return the provider name */
    public String getProviderName() {
        return providerName;
    }

    /** @return the policyholder's first name */
    public String getPolicyHolderFirstName() {
        return policyHolderFirstName;
    }

    /** @return the policyholder's last name */
    public String getPolicyHolderLastName() {
        return policyHolderLastName;
    }

    /** @return the policyholder's age */
    public int getPolicyHolderAge() {
        return policyHolderAge;
    }

    /** @return the smoking status */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /** @return the height in inches */
    public double getHeight() {
        return height;
    }

    /** @return the weight in pounds */
    public double getWeight() {
        return weight;
    }

    /**
     * Calculates and returns the Body Mass Index (BMI).
     * @return the BMI value
     */
    public double getBMI() {
        return (weight * 703) / (height * height);
    }

    /**
     * Calculates and returns the price of the policy.
     * @return the policy price
     */
    public double getPolicyPrice() {
        double basePrice = 500.0;
        if (policyHolderAge > 50) basePrice += 75.0;
        if (smokingStatus.equalsIgnoreCase("smoker")) basePrice += 100.0;
        if (getBMI() > 35) basePrice += (getBMI() - 35) * 20.0;
        return basePrice;
    }

    /**
     * Returns a string representation of the Policy object formatted for display.
     * @return formatted policy details
     */
    public String toString() {
        return String.format(
            "Policy Number: %d\n" +
            "Provider Name: %s\n\n" +
            "Policyholder's First Name: %s\n" +
            "Policyholder's Last Name: %s\n" +
            "Policyholder's Age: %d\n" +
            "Policyholder's Smoking Status (smoker/non-smoker): %s\n" +
            "Policyholder's Height: %.1f inches\n" +
            "Policyholder's Weight: %.1f pounds\n" +
            "Policyholder's BMI: %.2f\n" +
            "Policy Price: $%.2f\n",
            policyNumber, providerName, policyHolderFirstName, policyHolderLastName,
            policyHolderAge, smokingStatus, height, weight, getBMI(), getPolicyPrice()
        );
    }
}
