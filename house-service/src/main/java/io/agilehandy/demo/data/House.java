package io.agilehandy.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class House {

    @Id
    private ObjectId id;
    private String street;
    private String city;
    private String zip;
    private String state;
    private Integer rooms;
    private Float baths;
    private Float price;
    private Float area;
    private Float lotsize;
    private int stories;

    public String getId() {
        return id.toString();
    }
    public void setId(String id) {
        this.id = new ObjectId(id);
    }
    
}
