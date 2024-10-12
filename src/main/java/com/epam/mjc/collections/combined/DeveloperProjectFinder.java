package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> projectsOfTheDeveloper = new ArrayList<>();

        for (String project : projects.keySet()) {
            if (projects.get(project).contains(developer)) {
                projectsOfTheDeveloper.add(project);
            }
        }

        projectsOfTheDeveloper.sort((v1, v2) -> {
            if (v1.length() != v2.length()){
                return Integer.compare(v2.length(), v1.length());
            } else {
                return v2.compareTo(v1);
            }
        });

        return projectsOfTheDeveloper;
    }
}
