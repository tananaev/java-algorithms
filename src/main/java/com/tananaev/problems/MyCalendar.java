package com.tananaev.problems;

import java.util.ArrayList;

public class MyCalendar {

    private class Event {
        int start;
        int end;
    }

    private ArrayList<Event> events = new ArrayList<>();

    public MyCalendar() {
    }

    public boolean book(int start, int end) {
        for (Event event : events) {
            if (start >= event.start && start < event.end) {
                return false;
            }
            if (end > event.start && end <= event.end) {
                return false;
            }
            if (start < event.start && end > event.end) {
                return false;
            }
        }
        Event event = new Event();
        event.start = start;
        event.end = end;
        events.add(event);
        return true;
    }

}
