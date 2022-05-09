package com.leetcode.solutions.intervals;


/*
 * @created 06/05/2022
 * @project Leetcode
 * @author nihar
 */
public class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Interval{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
