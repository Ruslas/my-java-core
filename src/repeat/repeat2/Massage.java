package repeat.repeat2;

import java.time.LocalDateTime;

public class Massage {
    private String senderNumber;
    private String receiverNumber;
    private LocalDateTime sendTime;
    private String massageText;

    public Massage(String senderNumber, String receiverNumber, String massageText) {
        this.senderNumber = senderNumber;
        this.receiverNumber = receiverNumber;
        this.sendTime = LocalDateTime.now();
        this.massageText = massageText;
    }

    public String getMassageText() {
        return massageText;
    }

    public void setMassageText(String massageText) {
        this.massageText = massageText;
    }

    public String getSenderNumber() {
        return senderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        this.senderNumber = senderNumber;
    }

    public String getReceiverNumber() {
        return receiverNumber;
    }

    public void setReceiverNumber(String receiverNumber) {
        this.receiverNumber = receiverNumber;
    }

    public LocalDateTime getSendTime() {
        return sendTime;
    }

    public void setSendTime(LocalDateTime sendTime) {
        this.sendTime = sendTime;
    }
}
