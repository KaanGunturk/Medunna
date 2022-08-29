package pojos.US_016;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoomPost {

    private String createdBy;
    private String createdDate;
    private String description;
    private  int price;
    private  int roomNumber;
    private  String roomType;
    private boolean status;


    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public String getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

}
