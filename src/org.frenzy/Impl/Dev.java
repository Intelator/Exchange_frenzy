package org.frenzy.Impl;


import org.frenzy.Department;

/**
 * Created by artem.grechishnikov on 02.06.2015.
 */

public class Dev extends Department {

    @Override
    private int countDaysToFinish () {
        int days = (quantityOfTasksInProcess/quantityOfUnits)/2;
        return days;
    }
}
