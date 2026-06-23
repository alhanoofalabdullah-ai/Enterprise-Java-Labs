package src.services;

import java.util.*;

public class AttendanceService {

    private List<String> attendance =
            new ArrayList<>();

    public void recordAttendance(
            String employee) {

        attendance.add(employee);
    }

    public int totalAttendance() {
        return attendance.size();
    }
}
