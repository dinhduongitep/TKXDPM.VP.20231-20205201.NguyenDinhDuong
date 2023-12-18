package com.hust.itep.aims.entity.shipping;
//import org.example.DistanceCalculator;

public class DeliveryInfo {
    private String name;
    private String phone;
    private String province;
    private String address;
    private String shippingInstructions;
//    private DistanceCalculator distanceCalculator;

    public DeliveryInfo (){
    }

    public DeliveryInfo(String name, String phone, String province, String address, String shippingInstructions) {
        this.name = name;
        this.phone = phone;
        this.province = province;
        this.address = address;
        this.shippingInstructions = shippingInstructions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getShippingInstructions() {
        return shippingInstructions;
    }

    public void setShippingInstructions(String shippingInstructions) {
        this.shippingInstructions = shippingInstructions;
    }

//    public int calculateShippingFee(Order order) {
//        int distance = distanceCalculator.calculateDistance(address, province);
//        return (int) (distance * 1.2);
//    }

}
