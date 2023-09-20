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
import dev.oam.core.models.V1beta1ApplicationRevisionSpecApplicationMetadata;
import dev.oam.core.models.V1beta1TraitDefinitionSpec;
import dev.oam.core.models.V1beta1TraitDefinitionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TraitDefinition records the snapshot of the created/modified TraitDefinition
 */
@ApiModel(description = "TraitDefinition records the snapshot of the created/modified TraitDefinition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1beta1DefinitionRevisionSpecTraitDefinition {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1beta1ApplicationRevisionSpecApplicationMetadata metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1beta1TraitDefinitionSpec spec;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private V1beta1TraitDefinitionStatus status;


  public V1beta1DefinitionRevisionSpecTraitDefinition apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1beta1DefinitionRevisionSpecTraitDefinition kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1beta1DefinitionRevisionSpecTraitDefinition metadata(V1beta1ApplicationRevisionSpecApplicationMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1ApplicationRevisionSpecApplicationMetadata getMetadata() {
    return metadata;
  }


  public void setMetadata(V1beta1ApplicationRevisionSpecApplicationMetadata metadata) {
    this.metadata = metadata;
  }


  public V1beta1DefinitionRevisionSpecTraitDefinition spec(V1beta1TraitDefinitionSpec spec) {
    
    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1TraitDefinitionSpec getSpec() {
    return spec;
  }


  public void setSpec(V1beta1TraitDefinitionSpec spec) {
    this.spec = spec;
  }


  public V1beta1DefinitionRevisionSpecTraitDefinition status(V1beta1TraitDefinitionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1TraitDefinitionStatus getStatus() {
    return status;
  }


  public void setStatus(V1beta1TraitDefinitionStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1DefinitionRevisionSpecTraitDefinition v1beta1DefinitionRevisionSpecTraitDefinition = (V1beta1DefinitionRevisionSpecTraitDefinition) o;
    return Objects.equals(this.apiVersion, v1beta1DefinitionRevisionSpecTraitDefinition.apiVersion) &&
        Objects.equals(this.kind, v1beta1DefinitionRevisionSpecTraitDefinition.kind) &&
        Objects.equals(this.metadata, v1beta1DefinitionRevisionSpecTraitDefinition.metadata) &&
        Objects.equals(this.spec, v1beta1DefinitionRevisionSpecTraitDefinition.spec) &&
        Objects.equals(this.status, v1beta1DefinitionRevisionSpecTraitDefinition.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, spec, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1DefinitionRevisionSpecTraitDefinition {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

