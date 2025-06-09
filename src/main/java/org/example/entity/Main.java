package org.example.entity;

import java.util.*;

public class Main {

    public static List<Employee> findDuplicates(List<Employee> employees) {
        Set<Employee> seen = new HashSet<>();
        Set<Employee> duplicates = new LinkedHashSet<>();

        for (Employee emp : employees) {
            if (emp == null) continue;
            if (!seen.add(emp)) {
                duplicates.add(emp);
            }
        }
        return new ArrayList<>(duplicates);
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employees) {
        Map<Integer, Employee> uniqueMap = new LinkedHashMap<>();
        for (Employee emp : employees) {
            if (emp == null) continue;
            uniqueMap.put(emp.getId(), emp); // Aynı id varsa sonuncusu kalır
        }
        return uniqueMap;
    }

    public static List<Employee> removeDuplicates(List<Employee> employees) {
        Map<Employee, Integer> freqMap = new LinkedHashMap<>();

        for (Employee emp : employees) {
            if (emp == null) continue;
            freqMap.put(emp, freqMap.getOrDefault(emp, 0) + 1);
        }

        List<Employee> onlyUniques = new ArrayList<>();
        for (Map.Entry<Employee, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                onlyUniques.add(entry.getKey());
            }
        }

        return onlyUniques;
    }
}
