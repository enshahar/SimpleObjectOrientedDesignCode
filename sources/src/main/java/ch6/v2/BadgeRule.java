package ch6.v2;

public interface BadgeRule {
    boolean give(Employee employee);
    Badge badgeToGive();
}
