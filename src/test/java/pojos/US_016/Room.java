package pojos.US_016;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Room {
    /*
           {
           "createdBy": "string",
           "createdDate": "2022-08-06T15:12:18.833Z",
           "description": "string",
           "id": 0,
           "price": 0,
           "roomNumber": 0,
           "roomType": "TWIN",
           "status": true
         }
    */
    private String createdBy;
    private String createdDate;
    private String description;
    private  Integer id;
    private  Integer price;
    private  Integer roomNumber;
    private  String roomType;
    private Boolean status;

    public Room() {
    }

    public Room(String createdBy, String createdDate, String description, Integer id, Integer price, Integer roomNumber, String roomType, Boolean status) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.description = description;
        this.id = id;
        this.price = price;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.status = status;
    }

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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getRoomNumber() {
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
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Room{" +
                "createdBy='" + createdBy + '\'' +
                ", createdDate='" + createdDate + '\'' +
                ", description='" + description + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", roomNumber=" + roomNumber +
                ", roomType='" + roomType + '\'' +
                ", status=" + status +
                '}';
    }
}