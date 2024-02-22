package com.InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class ScenarioTestResults {

    public static void main(String[] args) {
        String[] input = {
                "scenario1-test1-pass", "scenario2-test1-fail", "scenario1-test2-fail",
                "scenario1-test3-pass", "scenario2-test2-fail", "scenario3-test1-pass",
                "scenario3-test2-pass", "scenario3-test3-pass"
        };

        Map<String, ScenarioResult> results = new HashMap<>();

        for (String testResult : input) {
            String[] parts = testResult.split("-");
            String scenario = parts[0];
            String result = parts[2];

            results.putIfAbsent(scenario, new ScenarioResult());
            ScenarioResult scenarioResult = results.get(scenario);

            if ("pass".equals(result)) {
                scenarioResult.incrementPasses();
            } else {
                scenarioResult.incrementFails();
            }
        }

        results.forEach((scenario, scenarioResult) -> {
            System.out.println(scenario + ": " + scenarioResult.getSuccessRate());
        });
    }

    static class ScenarioResult {
        private int passes = 0;
        private int fails = 0;

        public void incrementPasses() {
            passes++;
        }

        public void incrementFails() {
            fails++;
        }

        public String getSuccessRate() {
            int totalTests = passes + fails;
            return totalTests > 0 ? passes + "/" + totalTests : "No tests";
        }
    }

}
