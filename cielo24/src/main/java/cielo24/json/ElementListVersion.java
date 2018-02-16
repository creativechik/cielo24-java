package cielo24.json;

import java.time.LocalDateTime;

import com.google.gson.annotations.SerializedName;


public class ElementListVersion extends JsonBase {
    
    @SerializedName("version")
    public LocalDateTime version;
    @SerializedName("iwp_name")
    public String iwp_name;
}