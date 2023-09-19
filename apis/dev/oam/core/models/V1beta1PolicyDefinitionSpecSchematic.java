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
import dev.oam.core.models.V1beta1WorkflowStepDefinitionSpecSchematicCue;
import dev.oam.core.models.V1beta1WorkflowStepDefinitionSpecSchematicTerraform;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Schematic defines the data format and template of the encapsulation of the policy definition. Only CUE schematic is supported for now.
 */
@ApiModel(description = "Schematic defines the data format and template of the encapsulation of the policy definition. Only CUE schematic is supported for now.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1beta1PolicyDefinitionSpecSchematic {
  public static final String SERIALIZED_NAME_CUE = "cue";
  @SerializedName(SERIALIZED_NAME_CUE)
  private V1beta1WorkflowStepDefinitionSpecSchematicCue cue;

  public static final String SERIALIZED_NAME_TERRAFORM = "terraform";
  @SerializedName(SERIALIZED_NAME_TERRAFORM)
  private V1beta1WorkflowStepDefinitionSpecSchematicTerraform terraform;


  public V1beta1PolicyDefinitionSpecSchematic cue(V1beta1WorkflowStepDefinitionSpecSchematicCue cue) {
    
    this.cue = cue;
    return this;
  }

   /**
   * Get cue
   * @return cue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkflowStepDefinitionSpecSchematicCue getCue() {
    return cue;
  }


  public void setCue(V1beta1WorkflowStepDefinitionSpecSchematicCue cue) {
    this.cue = cue;
  }


  public V1beta1PolicyDefinitionSpecSchematic terraform(V1beta1WorkflowStepDefinitionSpecSchematicTerraform terraform) {
    
    this.terraform = terraform;
    return this;
  }

   /**
   * Get terraform
   * @return terraform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1beta1WorkflowStepDefinitionSpecSchematicTerraform getTerraform() {
    return terraform;
  }


  public void setTerraform(V1beta1WorkflowStepDefinitionSpecSchematicTerraform terraform) {
    this.terraform = terraform;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1PolicyDefinitionSpecSchematic v1beta1PolicyDefinitionSpecSchematic = (V1beta1PolicyDefinitionSpecSchematic) o;
    return Objects.equals(this.cue, v1beta1PolicyDefinitionSpecSchematic.cue) &&
        Objects.equals(this.terraform, v1beta1PolicyDefinitionSpecSchematic.terraform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cue, terraform);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1PolicyDefinitionSpecSchematic {\n");
    sb.append("    cue: ").append(toIndentedString(cue)).append("\n");
    sb.append("    terraform: ").append(toIndentedString(terraform)).append("\n");
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

