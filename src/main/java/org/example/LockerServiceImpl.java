package org.example;

public class LockerServiceImpl implements LockerService{

    @Override
    public String lockLocker() {
        int maxLockerValue = 0;
        int lockedId = 0;
        for (int i = 0; i < Locker.lockers.size() ; i++){
            for(int j = 0; j < Locker.lockers.get(i).size() ; j++) // find max value of a unlocked locker
            {
                if( (maxLockerValue < Locker.lockers.get(i).get(j).getLockerValue()) && !(Locker.lockers.get(i).get(j).isLocked())){
                    maxLockerValue = Locker.lockers.get(i).get(j).getLockerValue();
                }
            }
        }
        for (int i = 0; i < Locker.lockers.size() ; i++){
            if (Locker.isSwitcher()){
                for(int j = 0; j < Locker.lockers.get(i).size()/2 ; j++) //iterate throuh lockers from 0 to 29 index
                {
                    if( maxLockerValue == Locker.lockers.get(i).get(j).getLockerValue() && !(Locker.lockers.get(i).get(j).isLocked()))
                    {
                        lockedId = Locker.lockers.get(i).get(j).getLockerId();
                        Locker.lockers.get(i).get(j).setLocked(true);
                        Locker.setSwitcher(false);
                        break;
                    }
                }

            }
            else {
                for(int j = Locker.lockers.get(i).size()/2; j < Locker.lockers.get(i).size() ; j++) //iterate throuh lockers from 30 to 59 index
                {
                    if( maxLockerValue == Locker.lockers.get(i).get(j).getLockerValue() && !(Locker.lockers.get(i).get(j).isLocked()))
                    {
                        lockedId = Locker.lockers.get(i).get(j).getLockerId();
                        Locker.lockers.get(i).get(j).setLocked(true);
                        Locker.setSwitcher(true);
                        break;
                    }
                }

            }
        }

        return "Locked locker: " + lockedId;
    }

    @Override
    public void unlockLocker(Locker locker) {
        locker.setLocked(false);
    }

    @Override
    public void increaseLockerValue(int lockerId) {

    }

    @Override
    public void decreaseLockerValue(int lockerId) {

    }
}
