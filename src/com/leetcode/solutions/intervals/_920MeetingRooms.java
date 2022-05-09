package com.leetcode.solutions.intervals;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*
 * @created 06/05/2022
 * @project Leetcode
 * @author nihar
 */
public class _920MeetingRooms {
    public static boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort(Comparator.comparing(interval -> interval.start));
        for(int i = 0; i < intervals.size() -1 ; i++) {
            Interval i1 = intervals.get(i);
            Interval i2 = intervals.get(i+1);
            System.out.println("Comparing.."+ i1+" "+i2);
            if (i1.end > i2.start)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        //[(0,30),(5,10),(15,20)]
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(0,30));
        list.add(new Interval(35,45));
        list.add(new Interval(55,60));
        System.out.println(canAttendMeetings(list));
    }
}
