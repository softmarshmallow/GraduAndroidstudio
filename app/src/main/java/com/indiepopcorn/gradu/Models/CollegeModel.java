package com.indiepopcorn.gradu.Models;

import java.util.List;

/**
 * Created by softmarshmallow on 2/11/18.
 */

public class CollegeModel
{
        public String CollegeName;
        public String Uploader;
        public List<SubTaskModel> SubTasks;
        public String CoverPhotoUrl;
        public String RawTags;
        public String[] getTags(){
                return RawTags.split(" ");
        }
        
        public DiplomaModel DiplomaModel;
        public int RewardGraduationCapsCount;
}
