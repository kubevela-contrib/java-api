/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.oam.core.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * StepStatus record the base status of workflow step, which could be workflow step or subStep
 */
@ApiModel(description = "StepStatus record the base status of workflow step, which could be workflow step or subStep")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1beta1ApplicationStatusWorkflowSubSteps {
  public static final String SERIALIZED_NAME_FIRST_EXECUTE_TIME = "firstExecuteTime";
  @SerializedName(SERIALIZED_NAME_FIRST_EXECUTE_TIME)
  private OffsetDateTime firstExecuteTime;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_LAST_EXECUTE_TIME = "lastExecuteTime";
  @SerializedName(SERIALIZED_NAME_LAST_EXECUTE_TIME)
  private OffsetDateTime lastExecuteTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1beta1ApplicationStatusWorkflowSubSteps firstExecuteTime(OffsetDateTime firstExecuteTime) {
    
    this.firstExecuteTime = firstExecuteTime;
    return this;
  }

   /**
   * FirstExecuteTime is the first time this step execution.
   * @return firstExecuteTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FirstExecuteTime is the first time this step execution.")

  public OffsetDateTime getFirstExecuteTime() {
    return firstExecuteTime;
  }


  public void setFirstExecuteTime(OffsetDateTime firstExecuteTime) {
    this.firstExecuteTime = firstExecuteTime;
  }


  public V1beta1ApplicationStatusWorkflowSubSteps id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public V1beta1ApplicationStatusWorkflowSubSteps lastExecuteTime(OffsetDateTime lastExecuteTime) {
    
    this.lastExecuteTime = lastExecuteTime;
    return this;
  }

   /**
   * LastExecuteTime is the last time this step execution.
   * @return lastExecuteTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LastExecuteTime is the last time this step execution.")

  public OffsetDateTime getLastExecuteTime() {
    return lastExecuteTime;
  }


  public void setLastExecuteTime(OffsetDateTime lastExecuteTime) {
    this.lastExecuteTime = lastExecuteTime;
  }


  public V1beta1ApplicationStatusWorkflowSubSteps message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about why the workflowStep is in this state.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human readable message indicating details about why the workflowStep is in this state.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1beta1ApplicationStatusWorkflowSubSteps name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta1ApplicationStatusWorkflowSubSteps phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * WorkflowStepPhase describes the phase of a workflow step.
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "WorkflowStepPhase describes the phase of a workflow step.")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1beta1ApplicationStatusWorkflowSubSteps reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * A brief CamelCase message indicating details about why the workflowStep is in this state.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A brief CamelCase message indicating details about why the workflowStep is in this state.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public V1beta1ApplicationStatusWorkflowSubSteps type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ApplicationStatusWorkflowSubSteps v1beta1ApplicationStatusWorkflowSubSteps = (V1beta1ApplicationStatusWorkflowSubSteps) o;
    return Objects.equals(this.firstExecuteTime, v1beta1ApplicationStatusWorkflowSubSteps.firstExecuteTime) &&
        Objects.equals(this.id, v1beta1ApplicationStatusWorkflowSubSteps.id) &&
        Objects.equals(this.lastExecuteTime, v1beta1ApplicationStatusWorkflowSubSteps.lastExecuteTime) &&
        Objects.equals(this.message, v1beta1ApplicationStatusWorkflowSubSteps.message) &&
        Objects.equals(this.name, v1beta1ApplicationStatusWorkflowSubSteps.name) &&
        Objects.equals(this.phase, v1beta1ApplicationStatusWorkflowSubSteps.phase) &&
        Objects.equals(this.reason, v1beta1ApplicationStatusWorkflowSubSteps.reason) &&
        Objects.equals(this.type, v1beta1ApplicationStatusWorkflowSubSteps.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstExecuteTime, id, lastExecuteTime, message, name, phase, reason, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ApplicationStatusWorkflowSubSteps {\n");
    sb.append("    firstExecuteTime: ").append(toIndentedString(firstExecuteTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastExecuteTime: ").append(toIndentedString(lastExecuteTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
