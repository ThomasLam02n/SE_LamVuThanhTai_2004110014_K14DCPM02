package buoi7;

import java.util.ArrayList;
import java.util.List;

public class Seat {
    private String row;
    private Integer column;

    private static StoredFileSeat seats = new StoredFileSeat("seats.json");

    

    public Seat(String row, Integer column) {
        this.row = row;
        this.column = column;
    }

    public Seat(){}

    public static List<Object> seatValid(String row, Integer column){
        List<Object> list = new ArrayList<>();
        int index = 0;
        int index2 = 0;
        index = seats.searchRow("row", row);
        index2 = seats.searchColumn("column", column);

        if(index != -1 && index2 != -1){
            list.add(false);
            list.add("[BOOKING SEAT FAIL] the seat are booked already by someone !");
            return list;
        }
        if(index == 1){
            list.add(true);
            list.add("[THE SEAT ARE BOOKED] the seat has been booked !");
        }
        return list;
    }

    public static void bookingSeat(String row, Integer column){
        List<Object> listcheck;
        listcheck = seatValid(row, column);

        if(!(boolean) listcheck.get(0)){
            System.out.println(listcheck.get(1));
        }else{
            seats.update(row, column);
            seats.write();
            System.out.println(listcheck.get(1));
        }
    }

    public String getRow() {
        return row;
    }

    public Integer getColumn() {
        return column;
    }
}
