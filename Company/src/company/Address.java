package company;
public class Address {
    private String number;
    private String street;
    private String province;
    private String zipCode;
    
    public Address(){
        
    }

    public Address(String number, String street, String province, String zipCode) {
        this.number = number;
        this.street = street;
        this.province = province;
        this.zipCode = zipCode;
    }

    public String getNumber() {
        return number;
    }

    public String getStreet() {
        return street;
    }

    public String getProvince() {
        return province;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public boolean equals(Object obj){
        boolean result = false;
        if(obj instanceof Address){
            Address addrPa = (Address)obj;
            if(number.equals(addrPa.number)&&
               street.equals(addrPa.street)&&
               province.equals(addrPa.province)&&
               zipCode.equals(addrPa.zipCode)){
                result = true;
            }
        }
        return result;
    }
    
    @Override
    public String toString() {
        
        return "Address{" + "number=" + number + ", street=" + street + ", province=" + province + ", zipCode=" + zipCode + '}';
    }
    
         
}
