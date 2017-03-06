/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int105.model;

/**
 *
 * @author Jirapong Rungsawang
 */
public class Address {
    private String houseNo;
    private String addrDesc;

    public Address(String houseNo, String addrDesc) {
        this.houseNo = houseNo;
        this.addrDesc = addrDesc;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddrDesc() {
        return addrDesc;
    }

    public void setAddrDesc(String addrDesc) {
        this.addrDesc = addrDesc;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if(obj != null && obj instanceof Address) {
            Address addr = (Address) obj;
            if (houseNo.equalsIgnoreCase(addr.houseNo) && addrDesc.equalsIgnoreCase(addr.addrDesc)) {
                return true;
            }
        }
        return result;
    }

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", addrDesc=" + addrDesc + "]";
	}

}
