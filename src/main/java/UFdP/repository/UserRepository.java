package ufdp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    // Você pode adicionar consultas customizadas, se necessário
}