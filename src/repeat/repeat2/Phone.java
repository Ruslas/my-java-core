package repeat.repeat2;

import java.util.Collection;

public class Phone {
    private String number;
    private int weight;
    private ConnectionPhone currentConnection;
    private TelephoneStation telephoneStation;
    private PhoneBook phoneBook;
    private boolean onColl;

    Phone(){
    }

    Phone (String number, int weight, TelephoneStation telephoneStation){
        this.number = number;
        this.weight = weight;
        this.telephoneStation = telephoneStation;
        this.onColl = false;
    }

    public boolean isOnColl() {
        return onColl;
    }

    public void setOnColl(boolean onColl) {
        this.onColl = onColl;
    }

    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(PhoneBook phoneBook) {
        this.phoneBook = phoneBook;
    }

    public ConnectionPhone getCurrentConnection() {
        return currentConnection;
    }

    public void setCurrentConnection(ConnectionPhone currentConnection) {
        this.currentConnection = currentConnection;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getNumber(){
        return number;
    }

    public void setNumber(String number){
        this.number = number;
    }

    public TelephoneStation getTelephoneStation() {
        return telephoneStation;
    }

    public void setTelephoneStation(TelephoneStation telephoneStation) {
        this.telephoneStation = telephoneStation;
    }

    public void addContact(Contact contact) {
        phoneBook.addContact(contact);
    }

    public void removeContact(String name) {
        phoneBook.removeContact(name);
    }

    public Contact getContact(String name) {
        return phoneBook.getContact(name);
    }

    public boolean containsContact(String number) {
       return phoneBook.containsContact(number);
    }

    public void addJournalRecord(ConnectionPhone connectionPhone) {
        phoneBook.addJournalRecord(connectionPhone);
    }

    public void removeJournalRecord(String number) {
        phoneBook.removeJournalRecord(number);
    }

    public void addMassage(Massage massage) {
       phoneBook.addMassage(massage);
    }

    public void removeMassage(String number) {
        phoneBook.removeMassage(number);
    }

    public void call(String number){
        if (telephoneStation.containsTelephone(number) && !onColl) {
            System.out.println("Соединение " + this.getNumber() + " c " + number + " установленно");
            ConnectionPhone connectionPhone = new ConnectionPhone(this.getNumber(), number);
            this.currentConnection = connectionPhone;
        } else if (onColl){
            System.out.println("Сначала завершите текущий вызов");
        } else {
            System.out.println("Набранный вами номер не существует");
        }
    }

    public void cancelCall(){
        if (onColl) {
            System.out.println("Соединение разорвано");
            this.currentConnection.setFinishTime();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (weight != phone.weight) return false;
        if (number != null ? !number.equals(phone.number) : phone.number != null) return false;
        if (currentConnection != null ? !currentConnection.equals(phone.currentConnection) : phone.currentConnection != null)
            return false;
        if (telephoneStation != null ? !telephoneStation.equals(phone.telephoneStation) : phone.telephoneStation != null)
            return false;
        return phoneBook != null ? phoneBook.equals(phone.phoneBook) : phone.phoneBook == null;
    }

    @Override
    public int hashCode() {
        int result = number != null ? number.hashCode() : 0;
        result = 31 * result + weight;
        result = 31 * result + (currentConnection != null ? currentConnection.hashCode() : 0);
        result = 31 * result + (telephoneStation != null ? telephoneStation.hashCode() : 0);
        result = 31 * result + (phoneBook != null ? phoneBook.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", weight=" + weight +
                ", currentConnection=" + currentConnection +
                ", telephoneStation=" + telephoneStation +
                ", phoneBook=" + phoneBook +
                '}';
    }
}
