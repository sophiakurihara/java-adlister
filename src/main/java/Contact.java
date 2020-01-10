public class Contact {
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(){}

    public Contact(String firstName, String lastName, String phoneNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public Contact(long id, String firstName, String lastName,
                   String phoneNumber){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public long getId(){ return this.id; }
    public String getFirstName(){ return this.firstName; }
    public String getLastName(){ return this.lastName; }
    public String getPhoneNumber(){ return this.phoneNumber; };

    public void setId(long id){ this.id = id; }
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public void setLastName(String lastName){ this.lastName = lastName; }
    public void setPhoneNumber(String phoneNumber){ this.phoneNumber =
            phoneNumber; }

}
