package OOP.Interface.TelefonBeispiel;

public class SMS {
    private int empfaengerId;
    private String text;

    public SMS(int empfaengerId, String text) {
        this.empfaengerId = empfaengerId;
        this.text = text;
    }

    public int getEmpfaengerId() {
        return empfaengerId;
    }

    public String getText() {
        return text;
    }
}
