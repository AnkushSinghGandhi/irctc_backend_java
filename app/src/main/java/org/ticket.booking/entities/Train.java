package org.ticket.booking.entities;
import java.util.List;


public class Train {
    private String trainNo;
    private String trainId;
    private Map<String, Time> stationTimes;
    private List<List<Integer>> seats;
    private List<String> stations;
}
