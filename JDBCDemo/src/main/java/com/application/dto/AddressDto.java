package main.java.com.application.dto;

public class AddressDto {

    private Integer addressId;

    private String  addressHouseNo;

    private String  addressStreet;

    private String  addressArea;

    private String  addressTaluk;

    private String  addressDistrict;

    private String  addressState;

    private String  addressCountry;

    private String  addressPincode;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressHouseNo() {
        return addressHouseNo;
    }

    public void setAddressHouseNo(String addressHouseNo) {
        this.addressHouseNo = addressHouseNo;
    }

    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    public String getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }

    public String getAddressTaluk() {
        return addressTaluk;
    }

    public void setAddressTaluk(String addressTaluk) {
        this.addressTaluk = addressTaluk;
    }

    public String getAddressDistrict() {
        return addressDistrict;
    }

    public void setAddressDistrict(String addressDistrict) {
        this.addressDistrict = addressDistrict;
    }

    public String getAddressState() {
        return addressState;
    }

    public void setAddressState(String addressState) {
        this.addressState = addressState;
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }

    public String getAddressPincode() {
        return addressPincode;
    }

    public void setAddressPincode(String addressPincode) {
        this.addressPincode = addressPincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", addressHouseNo='" + addressHouseNo + '\'' +
                ", addressStreet='" + addressStreet + '\'' +
                ", addressArea='" + addressArea + '\'' +
                ", addressTaluk='" + addressTaluk + '\'' +
                ", addressDistrict='" + addressDistrict + '\'' +
                ", addressState='" + addressState + '\'' +
                ", addressCountry='" + addressCountry + '\'' +
                ", addressPincode='" + addressPincode + '\'' +
                '}';
    }
}
