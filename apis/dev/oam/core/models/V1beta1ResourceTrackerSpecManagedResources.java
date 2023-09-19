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
 * ManagedResource define the resource to be managed by ResourceTracker
 */
@ApiModel(description = "ManagedResource define the resource to be managed by ResourceTracker")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-09-19T04:50:27.278Z[Etc/UTC]")
public class V1beta1ResourceTrackerSpecManagedResources {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_CLUSTER = "cluster";
  @SerializedName(SERIALIZED_NAME_CLUSTER)
  private String cluster;

  public static final String SERIALIZED_NAME_COMPONENT = "component";
  @SerializedName(SERIALIZED_NAME_COMPONENT)
  private String component;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private String creator;

  public static final String SERIALIZED_NAME_DELETED = "deleted";
  @SerializedName(SERIALIZED_NAME_DELETED)
  private Boolean deleted;

  public static final String SERIALIZED_NAME_FIELD_PATH = "fieldPath";
  @SerializedName(SERIALIZED_NAME_FIELD_PATH)
  private String fieldPath;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_RAW = "raw";
  @SerializedName(SERIALIZED_NAME_RAW)
  private Object raw;

  public static final String SERIALIZED_NAME_RESOURCE_VERSION = "resourceVersion";
  @SerializedName(SERIALIZED_NAME_RESOURCE_VERSION)
  private String resourceVersion;

  public static final String SERIALIZED_NAME_SKIP_G_C = "skipGC";
  @SerializedName(SERIALIZED_NAME_SKIP_G_C)
  private Boolean skipGC;

  public static final String SERIALIZED_NAME_TRAIT = "trait";
  @SerializedName(SERIALIZED_NAME_TRAIT)
  private String trait;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;


  public V1beta1ResourceTrackerSpecManagedResources apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * API version of the referent.
   * @return apiVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "API version of the referent.")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public V1beta1ResourceTrackerSpecManagedResources cluster(String cluster) {
    
    this.cluster = cluster;
    return this;
  }

   /**
   * Get cluster
   * @return cluster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCluster() {
    return cluster;
  }


  public void setCluster(String cluster) {
    this.cluster = cluster;
  }


  public V1beta1ResourceTrackerSpecManagedResources component(String component) {
    
    this.component = component;
    return this;
  }

   /**
   * Get component
   * @return component
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getComponent() {
    return component;
  }


  public void setComponent(String component) {
    this.component = component;
  }


  public V1beta1ResourceTrackerSpecManagedResources creator(String creator) {
    
    this.creator = creator;
    return this;
  }

   /**
   * Get creator
   * @return creator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCreator() {
    return creator;
  }


  public void setCreator(String creator) {
    this.creator = creator;
  }


  public V1beta1ResourceTrackerSpecManagedResources deleted(Boolean deleted) {
    
    this.deleted = deleted;
    return this;
  }

   /**
   * Deleted marks the resource to be deleted
   * @return deleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Deleted marks the resource to be deleted")

  public Boolean getDeleted() {
    return deleted;
  }


  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  public V1beta1ResourceTrackerSpecManagedResources fieldPath(String fieldPath) {
    
    this.fieldPath = fieldPath;
    return this;
  }

   /**
   * If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: \&quot;spec.containers{name}\&quot; (where \&quot;name\&quot; refers to the name of the container that triggered the event) or if no container name is specified \&quot;spec.containers[2]\&quot; (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object. TODO: this design is not final and this field is subject to change in the future.
   * @return fieldPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If referring to a piece of an object instead of an entire object, this string should contain a valid JSON/Go field access statement, such as desiredState.manifest.containers[2]. For example, if the object reference is to a container within a pod, this would take on a value like: \"spec.containers{name}\" (where \"name\" refers to the name of the container that triggered the event) or if no container name is specified \"spec.containers[2]\" (container with index 2 in this pod). This syntax is chosen only to have some well-defined way of referencing a part of an object. TODO: this design is not final and this field is subject to change in the future.")

  public String getFieldPath() {
    return fieldPath;
  }


  public void setFieldPath(String fieldPath) {
    this.fieldPath = fieldPath;
  }


  public V1beta1ResourceTrackerSpecManagedResources kind(String kind) {
    
    this.kind = kind;
    return this;
  }

   /**
   * Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Kind of the referent. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public V1beta1ResourceTrackerSpecManagedResources name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1beta1ResourceTrackerSpecManagedResources namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Namespace of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/namespaces/")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public V1beta1ResourceTrackerSpecManagedResources raw(Object raw) {
    
    this.raw = raw;
    return this;
  }

   /**
   * Get raw
   * @return raw
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getRaw() {
    return raw;
  }


  public void setRaw(Object raw) {
    this.raw = raw;
  }


  public V1beta1ResourceTrackerSpecManagedResources resourceVersion(String resourceVersion) {
    
    this.resourceVersion = resourceVersion;
    return this;
  }

   /**
   * Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency
   * @return resourceVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specific resourceVersion to which this reference is made, if any. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#concurrency-control-and-consistency")

  public String getResourceVersion() {
    return resourceVersion;
  }


  public void setResourceVersion(String resourceVersion) {
    this.resourceVersion = resourceVersion;
  }


  public V1beta1ResourceTrackerSpecManagedResources skipGC(Boolean skipGC) {
    
    this.skipGC = skipGC;
    return this;
  }

   /**
   * SkipGC marks the resource to skip gc
   * @return skipGC
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SkipGC marks the resource to skip gc")

  public Boolean getSkipGC() {
    return skipGC;
  }


  public void setSkipGC(Boolean skipGC) {
    this.skipGC = skipGC;
  }


  public V1beta1ResourceTrackerSpecManagedResources trait(String trait) {
    
    this.trait = trait;
    return this;
  }

   /**
   * Get trait
   * @return trait
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTrait() {
    return trait;
  }


  public void setTrait(String trait) {
    this.trait = trait;
  }


  public V1beta1ResourceTrackerSpecManagedResources uid(String uid) {
    
    this.uid = uid;
    return this;
  }

   /**
   * UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids
   * @return uid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UID of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#uids")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1ResourceTrackerSpecManagedResources v1beta1ResourceTrackerSpecManagedResources = (V1beta1ResourceTrackerSpecManagedResources) o;
    return Objects.equals(this.apiVersion, v1beta1ResourceTrackerSpecManagedResources.apiVersion) &&
        Objects.equals(this.cluster, v1beta1ResourceTrackerSpecManagedResources.cluster) &&
        Objects.equals(this.component, v1beta1ResourceTrackerSpecManagedResources.component) &&
        Objects.equals(this.creator, v1beta1ResourceTrackerSpecManagedResources.creator) &&
        Objects.equals(this.deleted, v1beta1ResourceTrackerSpecManagedResources.deleted) &&
        Objects.equals(this.fieldPath, v1beta1ResourceTrackerSpecManagedResources.fieldPath) &&
        Objects.equals(this.kind, v1beta1ResourceTrackerSpecManagedResources.kind) &&
        Objects.equals(this.name, v1beta1ResourceTrackerSpecManagedResources.name) &&
        Objects.equals(this.namespace, v1beta1ResourceTrackerSpecManagedResources.namespace) &&
        Objects.equals(this.raw, v1beta1ResourceTrackerSpecManagedResources.raw) &&
        Objects.equals(this.resourceVersion, v1beta1ResourceTrackerSpecManagedResources.resourceVersion) &&
        Objects.equals(this.skipGC, v1beta1ResourceTrackerSpecManagedResources.skipGC) &&
        Objects.equals(this.trait, v1beta1ResourceTrackerSpecManagedResources.trait) &&
        Objects.equals(this.uid, v1beta1ResourceTrackerSpecManagedResources.uid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, cluster, component, creator, deleted, fieldPath, kind, name, namespace, raw, resourceVersion, skipGC, trait, uid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1ResourceTrackerSpecManagedResources {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("    fieldPath: ").append(toIndentedString(fieldPath)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
    sb.append("    resourceVersion: ").append(toIndentedString(resourceVersion)).append("\n");
    sb.append("    skipGC: ").append(toIndentedString(skipGC)).append("\n");
    sb.append("    trait: ").append(toIndentedString(trait)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
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
