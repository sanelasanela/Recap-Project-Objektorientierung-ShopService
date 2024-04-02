public enum OrderStatus {
    PROCESSING("processing"),
    IN_DELIVERY("in delivery"),
    COMPLETED("completed");

    private String status;

    OrderStatus(String status) {
        this.status = status;
    }
}
