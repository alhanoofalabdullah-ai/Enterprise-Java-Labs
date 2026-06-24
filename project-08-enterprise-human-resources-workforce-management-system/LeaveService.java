package src.services;

public class LeaveService {

    private int leaveRequests = 0;

    public void submitLeaveRequest(
            String employee) {

        leaveRequests++;
    }

    public int totalLeaveRequests() {
        return leaveRequests;
    }
}
