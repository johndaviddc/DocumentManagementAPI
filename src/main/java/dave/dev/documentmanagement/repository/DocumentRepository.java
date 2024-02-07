package dave.dev.documentmanagement.repository;

import dave.dev.documentmanagement.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, Long> {
}
