package lab6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MidPriorityRequest implements Request {
    private String priority;
    private String expireDay;
    private String status;

    @Override
    public void setPriority() {
        this.priority = "Medium";
    }

    @Override
    public void setExpire() {
        this.expireDay = LocalDate.now().plusMonths(1).format(DateTimeFormatter.ISO_DATE);
    }

    @Override
    public void setStatus() {
        this.status = "Accepted";
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + expireDay);
        System.out.println("priority ," + priority + " Status: " + status + ", Expire Day: " + expireDay);
    }
}
