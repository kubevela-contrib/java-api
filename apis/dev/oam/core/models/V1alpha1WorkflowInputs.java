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

/**
 * V1alpha1WorkflowInputs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1alpha1WorkflowInputs {
  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_PARAMETER_KEY = "parameterKey";
  @SerializedName(SERIALIZED_NAME_PARAMETER_KEY)
  private String parameterKey;


  public V1alpha1WorkflowInputs from(String from) {
    
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(required = true, value = "")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    this.from = from;
  }


  public V1alpha1WorkflowInputs parameterKey(String parameterKey) {
    
    this.parameterKey = parameterKey;
    return this;
  }

   /**
   * Get parameterKey
   * @return parameterKey
  **/
  @ApiModelProperty(required = true, value = "")

  public String getParameterKey() {
    return parameterKey;
  }


  public void setParameterKey(String parameterKey) {
    this.parameterKey = parameterKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1WorkflowInputs v1alpha1WorkflowInputs = (V1alpha1WorkflowInputs) o;
    return Objects.equals(this.from, v1alpha1WorkflowInputs.from) &&
        Objects.equals(this.parameterKey, v1alpha1WorkflowInputs.parameterKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, parameterKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1WorkflowInputs {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    parameterKey: ").append(toIndentedString(parameterKey)).append("\n");
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

