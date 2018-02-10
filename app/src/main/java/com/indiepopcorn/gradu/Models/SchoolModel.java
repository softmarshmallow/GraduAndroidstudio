package com.indiepopcorn.gradu.Models;

import java.util.List;
import java.util.Map;

/**
 * Created by a1p4ca on 2/11/18.
 */

public class SchoolModel
{
        private String name;
        private String tag;
        private String photoUrl;
        private int totalCaps;
        private int totalGoals;
        private int doneGoals;
        private int subscribers;
        private int graduates;
        private Map<String, GoalModel> goals;
        private DiplomaModel diploma;

        public SchoolModel(String name, String tag, String photoUrl, int totalCaps, int totalGoals, int doneGoals, int subscribers, int graduates, Map<String, GoalModel> goals, DiplomaModel diploma) {
                this.name = name;
                this.tag = tag;
                this.photoUrl = photoUrl;
                this.totalCaps = totalCaps;
                this.totalGoals = totalGoals;
                this.doneGoals = doneGoals;
                this.subscribers = subscribers;
                this.graduates = graduates;
                this.goals = goals;
                this.diploma = diploma;
        }

        public String[] getTags() {
                return tag.split(" ");
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getPhotoUrl() {
                return photoUrl;
        }

        public void setPhotoUrl(String photoUrl) {
                this.photoUrl = photoUrl;
        }

        public int getTotalCaps() {
                return totalCaps;
        }

        public void setTotalCaps(int totalCaps) {
                this.totalCaps = totalCaps;
        }

        public int getTotalGoals() {
                return totalGoals;
        }

        public void setTotalGoals(int totalGoals) {
                this.totalGoals = totalGoals;
        }

        public int getDoneGoals() {
                return doneGoals;
        }

        public void setDoneGoals(int doneGoals) {
                this.doneGoals = doneGoals;
        }

        public int getSubscribers() {
                return subscribers;
        }

        public void setSubscribers(int subscribers) {
                this.subscribers = subscribers;
        }

        public int getGraduates() {
                return graduates;
        }

        public void setGraduates(int graduates) {
                this.graduates = graduates;
        }

        public Map<String, GoalModel> getGoals() {
                return goals;
        }

        public void setGoals(Map<String, GoalModel> goals) {
                this.goals = goals;
        }

        public DiplomaModel getDiploma() {
                return diploma;
        }
}
