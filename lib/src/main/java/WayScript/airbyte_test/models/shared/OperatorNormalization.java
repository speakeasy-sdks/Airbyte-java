/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OperatorNormalization {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("option")
    public OperatorNormalizationOption option;

    public OperatorNormalization withOption(OperatorNormalizationOption option) {
        this.option = option;
        return this;
    }
    
    public OperatorNormalization(){}
}
