package repeat.repeat2;

import java.util.Set;

public class TelephoneStation {
    private Set<String> telephoneNumbers;

    public TelephoneStation() {
    }

    public TelephoneStation(Set<String> telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }

    public Set<String> getTelephoneNumbers() {
        return telephoneNumbers;
    }

    public void setTelephoneNumbers(Set<String> telephoneNumbers) {
        this.telephoneNumbers = telephoneNumbers;
    }

    public boolean addNewTelephone(String telephoneNumber) {
        return telephoneNumbers.add(telephoneNumber);
    }

    public boolean removeTelephone(String telephoneNumber) {
        return telephoneNumbers.remove(telephoneNumber);
    }

    public boolean containsTelephone(String telephoneNumber) {
        return telephoneNumbers.contains(telephoneNumber);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TelephoneStation that = (TelephoneStation) o;

        return telephoneNumbers != null ? telephoneNumbers.equals(that.telephoneNumbers) : that.telephoneNumbers == null;
    }

    @Override
    public int hashCode() {
        return telephoneNumbers != null ? telephoneNumbers.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "TelephoneStation{" +
                "telephoneNumbers=" + telephoneNumbers +
                '}';
    }
}
