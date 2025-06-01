class CheesePizza extends Pizza {
    public CheesePizza() {
        super("Medium", "Regular", "Cheese");
    }

    @Override
    public void handleComplaint(String complaint) {
        if (complaint.equals("too much cheese")) {
            System.out.println("Handling complaint: Too much cheese");
        } else {
            super.handleComplaint(complaint);
        }
    }
}