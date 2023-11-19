package org.example;

public interface LockerService {
    public String lockLocker();
    public void unlockLocker(Locker locker);
    public void increaseLockerValue(int lockerId);
    public void decreaseLockerValue(int lockerId);


}
