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
import dev.oam.core.models.V1beta1WorkloadDefinitionSpecSchematicKubeParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Kube defines the encapsulation in raw Kubernetes resource format
 */
@ApiModel(description = "Kube defines the encapsulation in raw Kubernetes resource format")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1beta1WorkloadDefinitionSpecSchematicKube {
  public static final String SERIALIZED_NAME_PARAMETERS = "parameters";
  @SerializedName(SERIALIZED_NAME_PARAMETERS)
  private List<V1beta1WorkloadDefinitionSpecSchematicKubeParameters> parameters = null;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private Object template;


  public V1beta1WorkloadDefinitionSpecSchematicKube parameters(List<V1beta1WorkloadDefinitionSpecSchematicKubeParameters> parameters) {
    
    this.parameters = parameters;
    return this;
  }

  public V1beta1WorkloadDefinitionSpecSchematicKube addParametersItem(V1beta1WorkloadDefinitionSpecSchematicKubeParameters parametersItem) {
    if (this.parameters == null) {
      this.parameters = new ArrayList<>();
    }
    this.parameters.add(parametersItem);
    return this;
  }

   /**
   * Parameters defines configurable parameters
   * @return parameters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Parameters defines configurable parameters")

  public List<V1beta1WorkloadDefinitionSpecSchematicKubeParameters> getParameters() {
    return parameters;
  }


  public void setParameters(List<V1beta1WorkloadDefinitionSpecSchematicKubeParameters> parameters) {
    this.parameters = parameters;
  }


  public V1beta1WorkloadDefinitionSpecSchematicKube template(Object template) {
    
    this.template = template;
    return this;
  }

   /**
   * Template defines the raw Kubernetes resource
   * @return template
  **/
  @ApiModelProperty(required = true, value = "Template defines the raw Kubernetes resource")

  public Object getTemplate() {
    return template;
  }


  public void setTemplate(Object template) {
    this.template = template;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkloadDefinitionSpecSchematicKube v1beta1WorkloadDefinitionSpecSchematicKube = (V1beta1WorkloadDefinitionSpecSchematicKube) o;
    return Objects.equals(this.parameters, v1beta1WorkloadDefinitionSpecSchematicKube.parameters) &&
        Objects.equals(this.template, v1beta1WorkloadDefinitionSpecSchematicKube.template);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parameters, template);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkloadDefinitionSpecSchematicKube {\n");
    sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
