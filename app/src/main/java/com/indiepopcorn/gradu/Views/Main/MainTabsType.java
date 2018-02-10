package com.indiepopcorn.gradu.Views.Main;

import java.util.HashMap;
import java.util.Map;

public enum MainTabsType
{
        Home(0),
        Search  (1),
        MyPage  (2),
        More (3),;

        int value;
        MainTabsType(int value) {
                this.value = value;
        }

        public int getValue() {
                return value;
        }
        
        
        public static Map<Integer, MainTabsType> MainTabsPositionMapping = new HashMap<Integer, MainTabsType>(){{
                put(0, MainTabsType.Home);
                put(1, MainTabsType.Search);
                put(2, MainTabsType.MyPage);
                put(3, MainTabsType.More);
        }};
}
