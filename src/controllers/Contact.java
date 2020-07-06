package controllers;

import java.util.Date;
import java.util.Objects;

public class Contact {

    private int ID;
    private String name;
    private String phone;
    private String imageUrl;
    private String address;
    private String links;
    private boolean is_blocked;
    private Date createdAt;
    private Date updateAt;

    public Contact() {}

    public Contact(int ID, String name, String phone, String imageUrl, String address, String links, boolean is_blocked, Date createdAt, Date updateAt) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.address = address;
        this.links = links;
        this.is_blocked = is_blocked;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return ID == contact.ID &&
                is_blocked == contact.is_blocked &&
                Objects.equals(name, contact.name) &&
                Objects.equals(phone, contact.phone) &&
                Objects.equals(imageUrl, contact.imageUrl) &&
                Objects.equals(address, contact.address) &&
                Objects.equals(links, contact.links) &&
                Objects.equals(createdAt, contact.createdAt) &&
                Objects.equals(updateAt, contact.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, phone, imageUrl, address, links, is_blocked, createdAt, updateAt);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", address='" + address + '\'' +
                ", links='" + links + '\'' +
                ", is_blocked=" + is_blocked +
                ", createdAt=" + createdAt +
                ", updateAt=" + updateAt +
                '}';
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public boolean isIs_blocked() {
        return is_blocked;
    }

    public void setIs_blocked(boolean is_blocked) {
        this.is_blocked = is_blocked;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}
