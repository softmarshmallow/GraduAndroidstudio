package com.indiepopcorn.gradu.Models;

/**
 * Created by a1p4ca on 2/11/18.
 */

public class GoalModel
{
        private String name;
        private String description;
        private int caps;
        private boolean done;

        public GoalModel() { }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getDescription() {
                return description;
        }

        public void setDescription(String description) {
                this.description = description;
        }

        public int getCaps() {
                return caps;
        }

        public void setCaps(int caps) {
                this.caps = caps;
        }

        public boolean isDone() {
                return done;
        }

        public void setDone(boolean done) {
                this.done = done;
        }
}
