/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Notification {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("customerioConfiguration")
    public CustomerioNotificationConfiguration customerioConfiguration;

    public Notification withCustomerioConfiguration(CustomerioNotificationConfiguration customerioConfiguration) {
        this.customerioConfiguration = customerioConfiguration;
        return this;
    }
    
    @JsonProperty("notificationType")
    public NotificationType notificationType;

    public Notification withNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
        return this;
    }
    
    @JsonProperty("sendOnFailure")
    public Boolean sendOnFailure;

    public Notification withSendOnFailure(Boolean sendOnFailure) {
        this.sendOnFailure = sendOnFailure;
        return this;
    }
    
    @JsonProperty("sendOnSuccess")
    public Boolean sendOnSuccess;

    public Notification withSendOnSuccess(Boolean sendOnSuccess) {
        this.sendOnSuccess = sendOnSuccess;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("slackConfiguration")
    public SlackNotificationConfiguration slackConfiguration;

    public Notification withSlackConfiguration(SlackNotificationConfiguration slackConfiguration) {
        this.slackConfiguration = slackConfiguration;
        return this;
    }
    
    public Notification(@JsonProperty("notificationType") NotificationType notificationType, @JsonProperty("sendOnFailure") Boolean sendOnFailure, @JsonProperty("sendOnSuccess") Boolean sendOnSuccess) {
        this.notificationType = notificationType;
        this.sendOnFailure = sendOnFailure;
        this.sendOnSuccess = sendOnSuccess;
  }
}
