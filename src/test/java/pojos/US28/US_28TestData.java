package pojos.US28;

import java.util.HashMap;
import java.util.Map;

public class US_28TestData {
    public Map<String, Object> exxpectedDataWhitMissingKeys(Integer id, String name){

        Map<String, Object> expectedData = new HashMap<>();

        if (id != null){
            expectedData.put("id",id);
        }
        if (name != null){
            expectedData.put("name",name);
        }

        return expectedData;
    }
}
