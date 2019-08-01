package repeat.repeat2;

import java.util.Collection;
import java.util.Map;

public class PhoneBook {
    private Map<String, Contact> directory;
    private Map<String, ConnectionPhone> journal;
    private Map<String, Massage> massages;
    private String ownNumber;

    public PhoneBook() {
    }

    public PhoneBook(Map<String, Contact> directory, Map<String, ConnectionPhone> journal, Map<String, Massage> massages, String ownNumber) {
        this.directory = directory;
        this.journal = journal;
        this.massages = massages;
        this.ownNumber = ownNumber;
    }

    public String getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(String ownNumber) {
        this.ownNumber = ownNumber;
    }

    public Map<String, Contact> getDirectory() {
        return directory;
    }

    public void setDirectory(Map<String, Contact> directory) {
        this.directory = directory;
    }

    public Map<String, ConnectionPhone> getJournal() {
        return journal;
    }

    public void setJournal(Map<String, ConnectionPhone> journal) {
        this.journal = journal;
    }

    public Map<String, Massage> getMassages() {
        return massages;
    }

    public void setMassages(Map<String, Massage> massages) {
        this.massages = massages;
    }

    public void addContact(Contact contact) {
        directory.put(contact.getName(), contact);
    }

    public void removeContact(String name) {
        directory.remove(name);
    }

    public Contact getContact(String name) {
        return directory.get(name);
    }

    public boolean containsContact(String number) {
        Collection<Contact> contacts = directory.values();
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(number)) {
                return true;
            }
        }
        return false;
    }

    public void addJournalRecord(ConnectionPhone connectionPhone) {
        if (connectionPhone.getCallerNumber().equals(ownNumber)) {
            journal.put(connectionPhone.getReceiverNumber(), connectionPhone);
        } else {
            journal.put(connectionPhone.getCallerNumber(), connectionPhone);
        }
    }

    public void removeJournalRecord(String number) {
        journal.remove(number);
    }

    public void addMassage(Massage massage) {
        if (massage.getReceiverNumber().equals(ownNumber)) {
            massages.put(massage.getSenderNumber(), massage);
        } else {
            massages.put(massage.getReceiverNumber(), massage);
        }
    }

    public void removeMassage(String number) {
        massages.remove(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhoneBook phoneBook = (PhoneBook) o;

        if (directory != null ? !directory.equals(phoneBook.directory) : phoneBook.directory != null) return false;
        if (journal != null ? !journal.equals(phoneBook.journal) : phoneBook.journal != null) return false;
        if (massages != null ? !massages.equals(phoneBook.massages) : phoneBook.massages != null) return false;
        return ownNumber != null ? ownNumber.equals(phoneBook.ownNumber) : phoneBook.ownNumber == null;
    }

    @Override
    public int hashCode() {
        int result = directory != null ? directory.hashCode() : 0;
        result = 31 * result + (journal != null ? journal.hashCode() : 0);
        result = 31 * result + (massages != null ? massages.hashCode() : 0);
        result = 31 * result + (ownNumber != null ? ownNumber.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "directory=" + directory +
                ", journal=" + journal +
                ", massages=" + massages +
                ", ownNumber='" + ownNumber + '\'' +
                '}';
    }
}
