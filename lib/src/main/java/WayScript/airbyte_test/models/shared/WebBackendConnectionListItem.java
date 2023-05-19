/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * WebBackendConnectionListItem - Information about a connection that shows up in the connection list view.
 */
public class WebBackendConnectionListItem {
    @JsonProperty("connectionId")
    public String connectionId;

    public WebBackendConnectionListItem withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @JsonProperty("destination")
    public DestinationSnippetRead destination;

    public WebBackendConnectionListItem withDestination(DestinationSnippetRead destination) {
        this.destination = destination;
        return this;
    }
    
    @JsonProperty("isSyncing")
    public Boolean isSyncing;

    public WebBackendConnectionListItem withIsSyncing(Boolean isSyncing) {
        this.isSyncing = isSyncing;
        return this;
    }
    
    /**
     * epoch time of the latest sync job. null if no sync job has taken place.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("latestSyncJobCreatedAt")
    public Long latestSyncJobCreatedAt;

    public WebBackendConnectionListItem withLatestSyncJobCreatedAt(Long latestSyncJobCreatedAt) {
        this.latestSyncJobCreatedAt = latestSyncJobCreatedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("latestSyncJobStatus")
    public JobStatus latestSyncJobStatus;

    public WebBackendConnectionListItem withLatestSyncJobStatus(JobStatus latestSyncJobStatus) {
        this.latestSyncJobStatus = latestSyncJobStatus;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public WebBackendConnectionListItem withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * schedule for when the the connection should run, per the schedule type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduleData")
    public ConnectionScheduleData scheduleData;

    public WebBackendConnectionListItem withScheduleData(ConnectionScheduleData scheduleData) {
        this.scheduleData = scheduleData;
        return this;
    }
    
    /**
     * determine how the schedule data should be interpreted
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduleType")
    public ConnectionScheduleType scheduleType;

    public WebBackendConnectionListItem withScheduleType(ConnectionScheduleType scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    
    @JsonProperty("schemaChange")
    public SchemaChange schemaChange;

    public WebBackendConnectionListItem withSchemaChange(SchemaChange schemaChange) {
        this.schemaChange = schemaChange;
        return this;
    }
    
    @JsonProperty("source")
    public SourceSnippetRead source;

    public WebBackendConnectionListItem withSource(SourceSnippetRead source) {
        this.source = source;
        return this;
    }
    
    /**
     * Active means that data is flowing through the connection. Inactive means it is not. Deprecated means the connection is off and cannot be re-activated. the schema field describes the elements of the schema that will be synced.
     */
    @JsonProperty("status")
    public ConnectionStatus status;

    public WebBackendConnectionListItem withStatus(ConnectionStatus status) {
        this.status = status;
        return this;
    }
    
    public WebBackendConnectionListItem(@JsonProperty("connectionId") String connectionId, @JsonProperty("destination") DestinationSnippetRead destination, @JsonProperty("isSyncing") Boolean isSyncing, @JsonProperty("name") String name, @JsonProperty("schemaChange") SchemaChange schemaChange, @JsonProperty("source") SourceSnippetRead source, @JsonProperty("status") ConnectionStatus status) {
        this.connectionId = connectionId;
        this.destination = destination;
        this.isSyncing = isSyncing;
        this.name = name;
        this.schemaChange = schemaChange;
        this.source = source;
        this.status = status;
  }
}
