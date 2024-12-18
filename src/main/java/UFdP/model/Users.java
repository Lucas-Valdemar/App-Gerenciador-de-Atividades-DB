package ufdp.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.getter;
import lombok.setter;

@Getter
@Setter
@Document(collection = "users") // Define a coleção no MongoDB
public class Users {

    @Id
    private String id; // O ID no MongoDB é geralmente uma String
    private String user;
    private String email;
    private String gender;
    private Object activities;
    private Object announces;

}