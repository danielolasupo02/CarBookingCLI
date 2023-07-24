package model;

public class Booking {
    private User userId;
    private Car car;

    public Booking(User userId, Car car) {
        this.userId = userId;
        this.car = car;
    }

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "userId=" + userId +
                ", car=" + car +
                '}';
    }
}
