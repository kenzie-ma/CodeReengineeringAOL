public class Notifier {
    public void notifyCustomer(String notificationType) {
        System.out.println("Notifying customer for " + notificationType);
    }

    public void applyDiscount() {
        System.out.println("Applying discount for customer.");
    }

    public void applyLoyaltyPoints(boolean frequentCustomerDiscount) {
        System.out.println("Applying loyalty points for customer.");
    }
}
