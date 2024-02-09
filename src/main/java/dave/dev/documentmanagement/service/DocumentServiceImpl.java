package dave.dev.documentmanagement.service;

import dave.dev.documentmanagement.model.Document;
import dave.dev.documentmanagement.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }
}