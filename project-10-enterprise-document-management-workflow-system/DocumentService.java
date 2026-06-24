package src.services;

import src.models.Document;
import java.util.*;

public class DocumentService {

    private List<Document> documents = new ArrayList<>();
    private int nextId = 1;

    public void registerDocument(String title, String owner) {
        documents.add(new Document(nextId++, title, owner));
    }

    public Document findDocument(int id) {
        for (Document document : documents) {
            if (document.getId() == id) {
                return document;
            }
        }
        return null;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public int totalDocuments() {
        return documents.size();
    }
}
