package phoneBook;

public class PhoneBook {

    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public PhoneBook(){

    }

    public PhoneBook(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;

    }

    public PhoneBook(String name, String phoneNumber, String email, String address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setPhoneNumber(String phoneNumber){
        this.name = name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }


    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){

        return this.address;
    }


}
