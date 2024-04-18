package com.pluralsight;

public class CellPhone {

        private long serialNumber;
        private String model;
        private String carrier;
        private String phoneNumber;
        private String owner;

        public CellPhone()  {
            serialNumber = 0;
            model = "";
            carrier = "";
            phoneNumber = "";
            owner = "";
        }

        public long getSerialNumber() {
            return this.serialNumber;
        }

        public String getModel() {
            return this.model;
        }

        public String getCarrier() {
            return this.carrier;
        }

        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public String getOwner() {
            return this.owner;
        }

        public void setSerialNumber(long serialNumber) {
            this.serialNumber = serialNumber;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setCarrier(String carrier) {
            this.carrier = carrier;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setOwner(String owner) {
            this.owner = owner;
        }

        public void dial(String phoneNumber) {
            System.out.println(owner + " phone is calling" +phoneNumber);
        }

}
