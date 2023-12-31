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
 * Reference to the CustomResourceDefinition that defines this trait kind.
 */
@ApiModel(description = "Reference to the CustomResourceDefinition that defines this trait kind.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1beta1WorkflowStepDefinitionSpecDefinitionRef {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public V1beta1WorkflowStepDefinitionSpecDefinitionRef name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referenced CustomResourceDefinition.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the referenced CustomResourceDefinition.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta1WorkflowStepDefinitionSpecDefinitionRef version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Version indicate which version should be used if CRD has multiple versions by default it will use the first one if not specified
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Version indicate which version should be used if CRD has multiple versions by default it will use the first one if not specified")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkflowStepDefinitionSpecDefinitionRef v1beta1WorkflowStepDefinitionSpecDefinitionRef = (V1beta1WorkflowStepDefinitionSpecDefinitionRef) o;
    return Objects.equals(this.name, v1beta1WorkflowStepDefinitionSpecDefinitionRef.name) &&
        Objects.equals(this.version, v1beta1WorkflowStepDefinitionSpecDefinitionRef.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkflowStepDefinitionSpecDefinitionRef {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

