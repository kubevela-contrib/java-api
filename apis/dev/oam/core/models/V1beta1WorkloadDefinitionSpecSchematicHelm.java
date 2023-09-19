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
 * A Helm represents resources used by a Helm module
 */
@ApiModel(description = "A Helm represents resources used by a Helm module")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1beta1WorkloadDefinitionSpecSchematicHelm {
  public static final String SERIALIZED_NAME_RELEASE = "release";
  @SerializedName(SERIALIZED_NAME_RELEASE)
  private Object release;

  public static final String SERIALIZED_NAME_REPOSITORY = "repository";
  @SerializedName(SERIALIZED_NAME_REPOSITORY)
  private Object repository;


  public V1beta1WorkloadDefinitionSpecSchematicHelm release(Object release) {
    
    this.release = release;
    return this;
  }

   /**
   * Release records a Helm release used by a Helm module workload.
   * @return release
  **/
  @ApiModelProperty(required = true, value = "Release records a Helm release used by a Helm module workload.")

  public Object getRelease() {
    return release;
  }


  public void setRelease(Object release) {
    this.release = release;
  }


  public V1beta1WorkloadDefinitionSpecSchematicHelm repository(Object repository) {
    
    this.repository = repository;
    return this;
  }

   /**
   * HelmRelease records a Helm repository used by a Helm module workload.
   * @return repository
  **/
  @ApiModelProperty(required = true, value = "HelmRelease records a Helm repository used by a Helm module workload.")

  public Object getRepository() {
    return repository;
  }


  public void setRepository(Object repository) {
    this.repository = repository;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkloadDefinitionSpecSchematicHelm v1beta1WorkloadDefinitionSpecSchematicHelm = (V1beta1WorkloadDefinitionSpecSchematicHelm) o;
    return Objects.equals(this.release, v1beta1WorkloadDefinitionSpecSchematicHelm.release) &&
        Objects.equals(this.repository, v1beta1WorkloadDefinitionSpecSchematicHelm.repository);
  }

  @Override
  public int hashCode() {
    return Objects.hash(release, repository);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkloadDefinitionSpecSchematicHelm {\n");
    sb.append("    release: ").append(toIndentedString(release)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
