package src.services;

import src.models.Certificate;
import java.util.*;

public class CertificateService {

    private List<Certificate> certificates = new ArrayList<>();

    public void issueCertificate(String studentName, String courseTitle) {
        certificates.add(new Certificate(studentName, courseTitle));
    }

    public int totalCertificates() {
        return certificates.size();
    }
}
