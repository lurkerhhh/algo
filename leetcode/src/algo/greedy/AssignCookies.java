package algo.greedy;

import java.util.*;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int gi = g.length-1, si = s.length-1;
        int res = 0;
        while(gi>=0 && si>=0) {
            if(s[si] >= g[gi]) {
                res++;
                si--;
                gi--;
            }
            else {
                gi--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] g1 = {1,2,3};
        int[] s1 = {1,1};

        System.out.println((new AssignCookies()).findContentChildren(g1, s1));

        int[] g2 = {1,2};
        int[] s2 = {1,2,3};

        System.out.println((new AssignCookies()).findContentChildren(g2, s2));
    }
}
