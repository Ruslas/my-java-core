package repeat.repeat2;

import java.time.LocalDateTime;

public class ConnectionPhone {
    private String callerNumber;
    private String receiverNumber;
    private LocalDateTime startTime;
    private LocalDateTime finishTime;

    public ConnectionPhone() {
    }

    public ConnectionPhone(String callerNumber, String receiverNumber) {
        this.callerNumber = callerNumber;
        this.receiverNumber = receiverNumber;
        this.startTime = LocalDateTime.now();
    }

    public String getCallerNumber() {
        return callerNumber;
    }

    public void setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime() {
        this.startTime = LocalDateTime.now();
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime() {
        this.finishTime = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConnectionPhone that = (ConnectionPhone) o;

        if (callerNumber != null ? !callerNumber.equals(that.callerNumber) : that.callerNumber != null) return false;
        if (receiverNumber != null ? !receiverNumber.equals(that.receiverNumber) : that.receiverNumber != null)
            return false;
        if (startTime != null ? !startTime.equals(that.startTime) : that.startTime != null) return false;
        return finishTime != null ? finishTime.equals(that.finishTime) : that.finishTime == null;
    }

    @Override
    public int hashCode() {
        int result = callerNumber != null ? callerNumber.hashCode() : 0;
        result = 31 * result + (receiverNumber != null ? receiverNumber.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (finishTime != null ? finishTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ConnectionPhone{" +
                "callerNumber='" + callerNumber + '\'' +
                ", receiverNumber='" + receiverNumber + '\'' +
                ", startTime=" + startTime +
                ", finishTime=" + finishTime +
                '}';
    }
}
