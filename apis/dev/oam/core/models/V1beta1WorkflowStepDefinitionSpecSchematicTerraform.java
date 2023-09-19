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
import dev.oam.core.models.V1beta1WorkflowStepDefinitionSpecSchematicTerraformGitCredentialsSecretReference;
import dev.oam.core.models.V1beta1WorkflowStepDefinitionSpecSchematicTerraformProviderRef;
import dev.oam.core.models.V1beta1WorkflowStepDefinitionSpecSchematicTerraformWriteConnectionSecretToRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Terraform is the struct to describe cloud resources managed by Hashicorp Terraform
 */
@ApiModel(description = "Terraform is the struct to describe cloud resources managed by Hashicorp Terraform")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1beta1WorkflowStepDefinitionSpecSchematicTerraform {
  public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
  @SerializedName(SERIALIZED_NAME_CONFIGURATION)
  private String _configuration;

  public static final String SERIALIZED_NAME_CUSTOM_REGION = "customRegion";
  @SerializedName(SERIALIZED_NAME_CUSTOM_REGION)
  private String customRegion;

  public static final String SERIALIZED_NAME_DELETE_RESOURCE = "deleteResource";
  @SerializedName(SERIALIZED_NAME_DELETE_RESOURCE)
  private Boolean deleteResource;

  public static final String SERIALIZED_NAME_GIT_CREDENTIALS_SECRET_REFERENCE = "gitCredentialsSecretReference";
  @SerializedName(SERIALIZED_NAME_GIT_CREDENTIALS_SECRET_REFERENCE)
  private V1beta1WorkflowStepDefinitionSpecSchematicTerraformGitCredentialsSecretReference gitCredentialsSecretReference;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;

  public static final String SERIALIZED_NAME_PROVIDER_REF = "providerRef";
  @SerializedName(SERIALIZED_NAME_PROVIDER_REF)
  private V1beta1WorkflowStepDefinitionSpecSchematicTerraformProviderRef providerRef;

  /**
   * Type specifies which Terraform configuration it is, HCL or JSON syntax
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    HCL("hcl"),
    
    JSON("json"),
    
    REMOTE("remote");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_WRITE_CONNECTION_SECRET_TO_REF = "writeConnectionSecretToRef";
  @SerializedName(SERIALIZED_NAME_WRITE_CONNECTION_SECRET_TO_REF)
  private V1beta1WorkflowStepDefinitionSpecSchematicTerraformWriteConnectionSecretToRef writeConnectionSecretToRef;


  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform _configuration(String _configuration) {
    
    this._configuration = _configuration;
    return this;
  }

   /**
   * Configuration is Terraform Configuration
   * @return _configuration
  **/
  @ApiModelProperty(required = true, value = "Configuration is Terraform Configuration")

  public String getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(String _configuration) {
    this._configuration = _configuration;
  }


  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform customRegion(String customRegion) {
    
    this.customRegion = customRegion;
    return this;
  }

   /**
   * Region is cloud provider&#39;s region. It will override the region in the region field of ProviderReference
   * @return customRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region is cloud provider's region. It will override the region in the region field of ProviderReference")

  public String getCustomRegion() {
    return customRegion;
  }


  public void setCustomRegion(String customRegion) {
    this.customRegion = customRegion;
  }


  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform deleteResource(Boolean deleteResource) {
    
    this.deleteResource = deleteResource;
    return this;
  }

   /**
   * DeleteResource will determine whether provisioned cloud resources will be deleted when CR is deleted
   * @return deleteResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DeleteResource will determine whether provisioned cloud resources will be deleted when CR is deleted")

  public Boolean getDeleteResource() {
    return deleteResource;
  }


  public void setDeleteResource(Boolean deleteResource) {
    this.deleteResource = deleteResource;
  }


  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform gitCredentialsSecretReference(V1beta1WorkflowStepDefinitionSpecSchematicTerraformGitCredentialsSecretReference gitCredentialsSecretReference) {
    
    this.gitCredentialsSecretReference = gitCredentialsSecretReference;
    return this;
  }

   /**
   * Get gitCredentialsSecretReference
   * @return gitCredentialsSecretReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkflowStepDefinitionSpecSchematicTerraformGitCredentialsSecretReference getGitCredentialsSecretReference() {
    return gitCredentialsSecretReference;
  }


  public void setGitCredentialsSecretReference(V1beta1WorkflowStepDefinitionSpecSchematicTerraformGitCredentialsSecretReference gitCredentialsSecretReference) {
    this.gitCredentialsSecretReference = gitCredentialsSecretReference;
  }


  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Path is the sub-directory of remote git repository. It&#39;s valid when remote is set
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Path is the sub-directory of remote git repository. It's valid when remote is set")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform providerRef(V1beta1WorkflowStepDefinitionSpecSchematicTerraformProviderRef providerRef) {
    
    this.providerRef = providerRef;
    return this;
  }

   /**
   * Get providerRef
   * @return providerRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkflowStepDefinitionSpecSchematicTerraformProviderRef getProviderRef() {
    return providerRef;
  }


  public void setProviderRef(V1beta1WorkflowStepDefinitionSpecSchematicTerraformProviderRef providerRef) {
    this.providerRef = providerRef;
  }


  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type specifies which Terraform configuration it is, HCL or JSON syntax
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type specifies which Terraform configuration it is, HCL or JSON syntax")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform writeConnectionSecretToRef(V1beta1WorkflowStepDefinitionSpecSchematicTerraformWriteConnectionSecretToRef writeConnectionSecretToRef) {
    
    this.writeConnectionSecretToRef = writeConnectionSecretToRef;
    return this;
  }

   /**
   * Get writeConnectionSecretToRef
   * @return writeConnectionSecretToRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkflowStepDefinitionSpecSchematicTerraformWriteConnectionSecretToRef getWriteConnectionSecretToRef() {
    return writeConnectionSecretToRef;
  }


  public void setWriteConnectionSecretToRef(V1beta1WorkflowStepDefinitionSpecSchematicTerraformWriteConnectionSecretToRef writeConnectionSecretToRef) {
    this.writeConnectionSecretToRef = writeConnectionSecretToRef;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1WorkflowStepDefinitionSpecSchematicTerraform v1beta1WorkflowStepDefinitionSpecSchematicTerraform = (V1beta1WorkflowStepDefinitionSpecSchematicTerraform) o;
    return Objects.equals(this._configuration, v1beta1WorkflowStepDefinitionSpecSchematicTerraform._configuration) &&
        Objects.equals(this.customRegion, v1beta1WorkflowStepDefinitionSpecSchematicTerraform.customRegion) &&
        Objects.equals(this.deleteResource, v1beta1WorkflowStepDefinitionSpecSchematicTerraform.deleteResource) &&
        Objects.equals(this.gitCredentialsSecretReference, v1beta1WorkflowStepDefinitionSpecSchematicTerraform.gitCredentialsSecretReference) &&
        Objects.equals(this.path, v1beta1WorkflowStepDefinitionSpecSchematicTerraform.path) &&
        Objects.equals(this.providerRef, v1beta1WorkflowStepDefinitionSpecSchematicTerraform.providerRef) &&
        Objects.equals(this.type, v1beta1WorkflowStepDefinitionSpecSchematicTerraform.type) &&
        Objects.equals(this.writeConnectionSecretToRef, v1beta1WorkflowStepDefinitionSpecSchematicTerraform.writeConnectionSecretToRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_configuration, customRegion, deleteResource, gitCredentialsSecretReference, path, providerRef, type, writeConnectionSecretToRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1WorkflowStepDefinitionSpecSchematicTerraform {\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    customRegion: ").append(toIndentedString(customRegion)).append("\n");
    sb.append("    deleteResource: ").append(toIndentedString(deleteResource)).append("\n");
    sb.append("    gitCredentialsSecretReference: ").append(toIndentedString(gitCredentialsSecretReference)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    providerRef: ").append(toIndentedString(providerRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    writeConnectionSecretToRef: ").append(toIndentedString(writeConnectionSecretToRef)).append("\n");
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
