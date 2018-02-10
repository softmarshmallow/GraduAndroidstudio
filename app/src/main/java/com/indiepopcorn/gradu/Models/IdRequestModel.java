package com.indiepopcorn.gradu.Models;

/**
 * Created by a1p4ca on 2018-02-11.
 */

public class IdRequestModel
{
        private int schoolId;
        private int goalId;

        public IdRequestModel(int schoolId, int goalId) {
                this.schoolId = schoolId;
                this.goalId = goalId;
        }

        public int getSchoolId() {
                return schoolId;
        }

        public void setSchoolId(int schoolId) {
                this.schoolId = schoolId;
        }

        public int getGoalId() {
                return goalId;
        }

        public void setGoalId(int goalId) {
                this.goalId = goalId;
        }
}
