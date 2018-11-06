package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> eachVisit = new ArrayList<>();

        for (String cpdomain : cpdomains) {
            String[] split = cpdomain.split(" ");
            String[] domain = split[1].split("\\.");
            fillMap(domain, Integer.valueOf(split[0]), map);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            eachVisit.add(entry.getValue() + " " + entry.getKey());
        }

        return eachVisit;

    }

    private void fillMap(String[] domain, int count, Map<String, Integer> map) {
        String currDomain = "";

        for(int i = domain.length - 1; i >= 0; i--) {

            if(currDomain.length() == 0) {
                currDomain = domain[i];
            } else {
                currDomain = domain[i] + "." + currDomain;
            }

            if(map.containsKey(currDomain)) {
                map.put(currDomain, map.get(currDomain) + count);
            } else {
                map.put(currDomain, count);
            }
        }
    }

    public static void main(String[] args) {
        Leetcode_811 leet = new Leetcode_811();

        String[] cpDomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        leet.subdomainVisits(cpDomains);
    }
}
