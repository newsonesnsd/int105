package company;
public class Company {//Aggregate Object, Container Object
    private String compName;//Component Object 
    private Address compAddr[];//Component Object 
    private String job;//Component Object 

    public Company(){
    
    }        
    public Company(String compName, Address compAddr[]) {
        this.compName = compName;
        this.compAddr = compAddr;
    }

    public String getJob() {
        return job;
    }
    public String getCompName() {
        return compName;
    }
    public Address[] getCompAddr() {
        return compAddr;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public void setCompName(String compName) {
        this.compName = compName;
    }
    public void setCompAddr(Address[] compAddr) {
        this.compAddr = compAddr;
    }
    public void replaceAddress(Address oldAddr, Address newAddr){
        for(int i = 0;i<compAddr.length;i++){
            if(oldAddr.equals(compAddr[i])){
                compAddr[i]=newAddr;
            }
        }
    }
    
    public boolean equals(Object obj){
        boolean result = false;
        if(obj instanceof Company){
            Company comp = (Company)obj;
            if(compName.equals(comp.compName)){
                result = true;
            }
        }
        return result;
    }
  
    @Override
    public String toString() {
        System.out.println("compName=" + compName);
//        for (Address address : compAddr) {
//            System.out.println(address);
//        }
        for(int i = 0;i<compAddr.length;i++){
            System.out.println(compAddr[i]);
        }
        return "";
    }
}
