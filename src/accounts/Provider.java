package accounts;

public class Provider {
    private String providerName;
    private int providerNumber;
    private String address;
    private String city;
    private String state;
    private int zipCode;
  //private List<ProviderService> servicesProvided;
    private int numberOfConsultations;
    private int totalFees;

    public Provider(String providerName, int providerNumber, String address, String city, String state, int zipCode){
        this.providerName = providerName;
        this.providerNumber = providerNumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
       // this.servicesProvided = new ArrayList<ProviderService>();
        this.numberOfConsultations = 0;
        this.totalFees = 0;
    }

    public String getName() {
        return providerName;
    }

    public int getNumber() {
        return providerNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public int getNumberOfConsultations() {
        return numberOfConsultations;
    }

 /*   public List<ProviderService> getServicesProvided() {
        return servicesProvided;
    }
*/
    //Update Provider Info
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public void setProviderNumber(int providerNumber) {
        this.providerNumber = providerNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

/*    public void setServicesProvided(List<ProviderService> servicesProvided) {
        this.servicesProvided = servicesProvided;
    }
*/
}
