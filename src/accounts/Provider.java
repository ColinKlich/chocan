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

    public Provider() {
    	this.providerName = null;
        this.providerNumber = -1;
        this.address = null;
        this.city = null;
        this.state = null;
        this.zipCode = -1;
        // this.servicesProvided = null;
        this.numberOfConsultations = -1;
        this.totalFees = -1;
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
    public void setProviderNumber(int providerNumber) {
    	this.providerNumber = providerNumber;
    }
    //Update Provider Info
   public void updateProviderInformation(String providerName, String address, String city, String state, int zipCode, int numberOfConsultations, int totalFees) {
	   this.providerName = providerName;
       this.address = address;
       this.city = city;
       this.state = state;
       this.zipCode = zipCode;
       this.numberOfConsultations = numberOfConsultations;
       this.totalFees = totalFees;
   }
   
   public void addFees(int fees) {
	   this.totalFees = this.totalFees + fees;
   }
   
   public void consultationComplete() {
	   this.numberOfConsultations = this.numberOfConsultations + 1;
   }

/*    public void setServicesProvided(List<ProviderService> servicesProvided) {
        this.servicesProvided = servicesProvided;
    }
*/
   public void deleteProvider(Provider providerDelete) {
	   providerDelete = new Provider();
	   providerDelete = null;
	  
   }
}
