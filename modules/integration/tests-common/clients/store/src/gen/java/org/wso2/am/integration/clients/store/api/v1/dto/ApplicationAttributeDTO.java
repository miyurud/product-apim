/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

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
 * ApplicationAttributeDTO
 */

public class ApplicationAttributeDTO {
  @SerializedName("description")
  private String description = null;

  @SerializedName("required")
  private String required = null;

  @SerializedName("attribute")
  private String attribute = null;

  @SerializedName("hidden")
  private String hidden = null;

  public ApplicationAttributeDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * description of the application attribute
   * @return description
  **/
  @ApiModelProperty(example = "Sample description of the attribute", value = "description of the application attribute")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationAttributeDTO required(String required) {
    this.required = required;
    return this;
  }

   /**
   * whether this is a required attribute
   * @return required
  **/
  @ApiModelProperty(example = "false", value = "whether this is a required attribute")
  public String getRequired() {
    return required;
  }

  public void setRequired(String required) {
    this.required = required;
  }

  public ApplicationAttributeDTO attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }

   /**
   * the name of the attribute
   * @return attribute
  **/
  @ApiModelProperty(example = "External Reference Id", value = "the name of the attribute")
  public String getAttribute() {
    return attribute;
  }

  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }

  public ApplicationAttributeDTO hidden(String hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * whether this is a hidden attribute
   * @return hidden
  **/
  @ApiModelProperty(example = "false", value = "whether this is a hidden attribute")
  public String getHidden() {
    return hidden;
  }

  public void setHidden(String hidden) {
    this.hidden = hidden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationAttributeDTO applicationAttribute = (ApplicationAttributeDTO) o;
    return Objects.equals(this.description, applicationAttribute.description) &&
        Objects.equals(this.required, applicationAttribute.required) &&
        Objects.equals(this.attribute, applicationAttribute.attribute) &&
        Objects.equals(this.hidden, applicationAttribute.hidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, required, attribute, hidden);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationAttributeDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

