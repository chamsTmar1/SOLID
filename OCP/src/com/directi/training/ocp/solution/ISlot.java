package com.directi.training.ocp.solution;

import com.directi.training.ocp.exercise.ResourceType;

public interface ISlot {
    static final int INVALID_RESOURCE_ID = -1;
    public int allocate();
    public void free(int resourceId);
}
