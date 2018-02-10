package com.indiepopcorn.gradu.Models;

import java.util.List;

/**
 * Created by a1p4ca on 2018-02-11.
 */

public class StatModel
{
        private int caps;
        private List<DiplomaModel> diplomas;

        public StatModel() { }

        public int getCaps() {
                return caps;
        }

        public void setCaps(int caps) {
                this.caps = caps;
        }

        public List<DiplomaModel> getDiplomas() {
                return diplomas;
        }

        public void setDiplomas(List<DiplomaModel> diplomas) {
                this.diplomas = diplomas;
        }
}
