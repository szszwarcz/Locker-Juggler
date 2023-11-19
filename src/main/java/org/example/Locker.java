package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Locker {
    private int lockerId;
    private int baseValue;
    private int positionMultiplayer;
    private int positionHeight;
    private int lockerValue;
    private boolean isLocked;

    static List<List<Locker>> lockers = new ArrayList<>();
    static boolean switcher = true;


    public static boolean isSwitcher() {
        return switcher;
    }

    public static void setSwitcher(boolean switcher) {
        Locker.switcher = switcher;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getPositionHeight() {
        return positionHeight;
    }

    public void setPositionHeight(int positionHeight) {
        this.positionHeight = positionHeight;
    }

    public int getLockerValue() {
        return lockerValue;
    }

    public void setLockerValue(int lockerValue) {
        this.lockerValue = lockerValue;
    }

    public Locker(int lockerId, int baseValue, int possitionMultiplayer, int possitionHeight) {
        this.lockerId = lockerId;
        this.baseValue = baseValue;
        this.positionMultiplayer = possitionMultiplayer;
        this.positionHeight = possitionHeight;
        this.lockerValue = baseValue * possitionMultiplayer * possitionHeight;
        this.isLocked = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Locker locker = (Locker) o;
        return lockerId == locker.lockerId && baseValue == locker.baseValue && positionMultiplayer == locker.positionMultiplayer && positionHeight == locker.positionHeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockerId, baseValue, positionMultiplayer, positionHeight);
    }

    public void setLockerId(int lockerId) {
        this.lockerId = lockerId;
    }

    public void setBaseValue(int baseValue) {
        this.baseValue = baseValue;
    }

    public void setPositionMultiplayer(int positionMultiplayer) {
        this.positionMultiplayer = positionMultiplayer;
    }

    public int getLockerId() {
        return lockerId;
    }

    public int getBaseValue() {
        return baseValue;
    }

    public int getPositionMultiplayer() {
        return positionMultiplayer;
    }

}
