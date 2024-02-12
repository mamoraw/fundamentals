package io.everyonecodes.java.community_exercises.carlos_classes_exercise1;

import java.util.List;

public class Contact {
    String name;
    String language;
    int timesCalled;
    int hoursSinceLastCall;
    boolean wasCallSuccessful;
    List<SalesRep> potentialSalesPeps;

    public Contact(String name, String language, int timesCalled, int hoursSinceLastCall, boolean wasCallSuccessful) {
        this.name = name;
        this.language = language;
        this.timesCalled = timesCalled;
        this.hoursSinceLastCall = hoursSinceLastCall;
        this.wasCallSuccessful = wasCallSuccessful;
    }
}
