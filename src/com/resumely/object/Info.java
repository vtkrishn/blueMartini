package com.resumely.object;

public class Info {
    Address address;
    String phone;
    String email;
    public Info() {
        super();
    }

    public void setAddress(Info.Address address) {
        this.address = address;
    }

    public Info.Address getAddress() {
        return address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    class Address{
        String Address1;
        String Address2;
        String City;
        String State;
        String zipCode;
        String country;

        public void setAddress1(String Address1) {
            this.Address1 = Address1;
        }

        public String getAddress1() {
            return Address1;
        }

        public void setAddress2(String Address2) {
            this.Address2 = Address2;
        }

        public String getAddress2() {
            return Address2;
        }

        public void setCity(String City) {
            this.City = City;
        }

        public String getCity() {
            return City;
        }

        public void setState(String State) {
            this.State = State;
        }

        public String getState() {
            return State;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountry() {
            return country;
        }
    }
}
