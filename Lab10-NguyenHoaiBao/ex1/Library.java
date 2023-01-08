package lab10.ex1;

import java.util.concurrent.TimeUnit;


public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        long longestrent = Long.MIN_VALUE;
        for (Rent i: rents
             ) {
            long timeDiff = Math.abs(i.end.getTime() - i.begin.getTime());
            long daysDiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
            longestrent = Math.max(longestrent,daysDiff);
        }
        for (Rent i: rents
             ) {
            long timeDiff = Math.abs(i.end.getTime() - i.begin.getTime());
            long daysDiff = TimeUnit.DAYS.convert(timeDiff,TimeUnit.MILLISECONDS);
            if(daysDiff == longestrent){
                return i;
            }
        }
        return null;

    }


}
