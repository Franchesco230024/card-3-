public class Card {
    private String number;
    private Type type;

    public Card(String number, Type type) {
        this.number = number;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public Type getType() {
        return type;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setType(Type type) {
        this.type = type;
    }
}

