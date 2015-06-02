/**
 * Created by artem.grechishnikov on 02.06.2015.
 */
public abstract class Department {
    private boolean isHappy;
    private boolean isFree;
    private int quantityOfTasksInProcess; // Measured in man-hour
    private int quantityOfUnits;

    protected void setHappiness (boolean isDepartmentHappy) {
        isHappy = isDepartmentHappy;
    }

    protected boolean getHappiness () {
        return isHappy;
    }

    protected void setBusyness (boolean isDepartmentFree) {
        isFree = isDepartmentFree;
    }

    protected boolean getBusyness () {
        return isFree;
    }

    protected void setTasksInProcess (int quantityOfTasks) {
        quantityOfTasksInProcess = quantityOfTasks;
    }

    protected int getTasksInProcess () {
        return quantityOfTasksInProcess;
    }

    protected void setUnits (int quantity) {
        quantityOfUnits = quantity;
    }

    protected int getUnits () {
        return quantityOfUnits;
    }
}
