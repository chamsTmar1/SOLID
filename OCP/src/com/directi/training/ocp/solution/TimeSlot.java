package com.directi.training.ocp.solution;

import com.directi.training.ocp.exercise.ResourceType;

public class TimeSlot implements ISlot{

        @Override
        public int allocate()
        {
            int resourceId;

                    resourceId = findFreeTimeSlot();
                    markTimeSlotBusy(resourceId);

            return resourceId;
        }

        @Override
        public void free(int resourceId)
        {
            markTimeSlotFree(resourceId);
        }



        private void markTimeSlotFree(int resourceId)
        {
        }



        private void markTimeSlotBusy(int resourceId)
        {
        }

        private int findFreeTimeSlot()
        {
            return 0;
        }

}


