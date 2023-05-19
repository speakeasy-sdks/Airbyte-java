/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package WayScript.airbyte_test.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectionRead - Successful operation
 */
public class ConnectionRead {
    @JsonProperty("breakingChange")
    public Boolean breakingChange;

    public ConnectionRead withBreakingChange(Boolean breakingChange) {
        this.breakingChange = breakingChange;
        return this;
    }
    
    @JsonProperty("connectionId")
    public String connectionId;

    public ConnectionRead withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }
    
    @JsonProperty("destinationId")
    public String destinationId;

    public ConnectionRead withDestinationId(String destinationId) {
        this.destinationId = destinationId;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("geography")
    public Geography geography;

    public ConnectionRead withGeography(Geography geography) {
        this.geography = geography;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public ConnectionRead withName(String name) {
        this.name = name;
        return this;
    }
    
    /**
     * Method used for computing final namespace in destination
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceDefinition")
    public NamespaceDefinitionType namespaceDefinition;

    public ConnectionRead withNamespaceDefinition(NamespaceDefinitionType namespaceDefinition) {
        this.namespaceDefinition = namespaceDefinition;
        return this;
    }
    
    /**
     * Used when namespaceDefinition is 'customformat'. If blank then behaves like namespaceDefinition = 'destination'. If "${SOURCE_NAMESPACE}" then behaves like namespaceDefinition = 'source'.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("namespaceFormat")
    public String namespaceFormat;

    public ConnectionRead withNamespaceFormat(String namespaceFormat) {
        this.namespaceFormat = namespaceFormat;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("nonBreakingChangesPreference")
    public NonBreakingChangesPreference nonBreakingChangesPreference;

    public ConnectionRead withNonBreakingChangesPreference(NonBreakingChangesPreference nonBreakingChangesPreference) {
        this.nonBreakingChangesPreference = nonBreakingChangesPreference;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("notifySchemaChanges")
    public Boolean notifySchemaChanges;

    public ConnectionRead withNotifySchemaChanges(Boolean notifySchemaChanges) {
        this.notifySchemaChanges = notifySchemaChanges;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("operationIds")
    public String[] operationIds;

    public ConnectionRead withOperationIds(String[] operationIds) {
        this.operationIds = operationIds;
        return this;
    }
    
    /**
     * Prefix that will be prepended to the name of each stream when it is written to the destination.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("prefix")
    public String prefix;

    public ConnectionRead withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }
    
    /**
     * optional resource requirements to run workers (blank for unbounded allocations)
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("resourceRequirements")
    public ResourceRequirements resourceRequirements;

    public ConnectionRead withResourceRequirements(ResourceRequirements resourceRequirements) {
        this.resourceRequirements = resourceRequirements;
        return this;
    }
    
    /**
     * if null, then no schedule is set.
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("schedule")
    public ConnectionSchedule schedule;

    public ConnectionRead withSchedule(ConnectionSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
    
    /**
     * schedule for when the the connection should run, per the schedule type
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduleData")
    public ConnectionScheduleData scheduleData;

    public ConnectionRead withScheduleData(ConnectionScheduleData scheduleData) {
        this.scheduleData = scheduleData;
        return this;
    }
    
    /**
     * determine how the schedule data should be interpreted
     */
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("scheduleType")
    public ConnectionScheduleType scheduleType;

    public ConnectionRead withScheduleType(ConnectionScheduleType scheduleType) {
        this.scheduleType = scheduleType;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("sourceCatalogId")
    public String sourceCatalogId;

    public ConnectionRead withSourceCatalogId(String sourceCatalogId) {
        this.sourceCatalogId = sourceCatalogId;
        return this;
    }
    
    @JsonProperty("sourceId")
    public String sourceId;

    public ConnectionRead withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    
    /**
     * Active means that data is flowing through the connection. Inactive means it is not. Deprecated means the connection is off and cannot be re-activated. the schema field describes the elements of the schema that will be synced.
     */
    @JsonProperty("status")
    public ConnectionStatus status;

    public ConnectionRead withStatus(ConnectionStatus status) {
        this.status = status;
        return this;
    }
    
    /**
     * describes the available schema (catalog).
     */
    @JsonProperty("syncCatalog")
    public AirbyteCatalog syncCatalog;

    public ConnectionRead withSyncCatalog(AirbyteCatalog syncCatalog) {
        this.syncCatalog = syncCatalog;
        return this;
    }
    
    public ConnectionRead(@JsonProperty("breakingChange") Boolean breakingChange, @JsonProperty("connectionId") String connectionId, @JsonProperty("destinationId") String destinationId, @JsonProperty("name") String name, @JsonProperty("sourceId") String sourceId, @JsonProperty("status") ConnectionStatus status, @JsonProperty("syncCatalog") AirbyteCatalog syncCatalog) {
        this.breakingChange = breakingChange;
        this.connectionId = connectionId;
        this.destinationId = destinationId;
        this.name = name;
        this.sourceId = sourceId;
        this.status = status;
        this.syncCatalog = syncCatalog;
  }
}
