package dave.dev.documentmanagement.service;

import dave.dev.documentmanagement.model.Document;

import java.util.List;

public interface DocumentService {
    List<Document> getAllDocuments();
    Document getDocumentById(Long id);
    Document createDocument(Document document);
    void deleteDocument(Long id);
}
