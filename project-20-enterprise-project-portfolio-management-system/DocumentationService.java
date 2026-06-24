package src.services;

import src.models.ProjectDocument;
import java.util.ArrayList;
import java.util.List;

public class DocumentationService {

    private List<ProjectDocument> documents = new ArrayList<>();
    private int nextId = 1;

    public void registerDocument(String title, String owner) {
        documents.add(new ProjectDocument(nextId++, title, owner));
    }

    public int totalDocuments() {
        return documents.size();
    }
}
