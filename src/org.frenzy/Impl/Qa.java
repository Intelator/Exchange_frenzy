package org.frenzy.Impl;

import org.frenzy.Department;

/**
 * Created by artem.grechishnikov on 02.06.2015.
 */

public class Qa extends Department {

    @Override
    private int countDaysToFinish () {
        int days = quantityOfTasksInProcess/quantityOfUnits;
        return days;
    }
}
