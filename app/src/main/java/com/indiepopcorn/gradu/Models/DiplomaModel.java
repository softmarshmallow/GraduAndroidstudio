package com.indiepopcorn.gradu.Models;

/**
 * Created by a1p4ca on 2/11/18.
 */

public class DiplomaModel
{
        private String name;
        private String photoUrl;
        private String date;

        public DiplomaModel(String name, String photoUrl, String date) {
                this.name = name;
                this.photoUrl = photoUrl;
                this.date = date;
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

        public String getDate() {
                return date;
        }

        public void setDate(String date) {
                this.date = date;
        }
}
