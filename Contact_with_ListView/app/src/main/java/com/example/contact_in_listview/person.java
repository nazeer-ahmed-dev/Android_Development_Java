package com.example.contact_in_listview;

public class person {
    String Name;
    String email;
    String phone_no;
    int photo;

    public person(String name , String email, String phone_no,int photo)
    {
        this.Name = name;
        this.email = email;
        this.phone_no = phone_no;
        this.photo = photo;

    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
