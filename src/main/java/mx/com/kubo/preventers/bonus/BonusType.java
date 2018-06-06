package mx.com.kubo.preventers.bonus;

public enum BonusType {
    REGULAR("REGULAR"), PREMIUM("PREMIUM");
    String type;

    BonusType(String type) {
        this.type = type;
    }
}
