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
import java.util.ArrayList;
import java.util.List;
import org.wso2.am.integration.clients.store.api.v1.dto.ApplicationTokenDTO;

/**
 * ApplicationKeyDTO
 */

public class ApplicationKeyDTO {
  @SerializedName("consumerKey")
  private String consumerKey = null;

  @SerializedName("consumerSecret")
  private String consumerSecret = null;

  @SerializedName("supportedGrantTypes")
  private List<String> supportedGrantTypes = null;

  @SerializedName("callbackUrl")
  private String callbackUrl = null;

  @SerializedName("keyState")
  private String keyState = null;

  /**
   * Describes to which endpoint the key belongs
   */
  @JsonAdapter(KeyTypeEnum.Adapter.class)
  public enum KeyTypeEnum {
    PRODUCTION("PRODUCTION"),
    
    SANDBOX("SANDBOX");

    private String value;

    KeyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyTypeEnum fromValue(String text) {
      for (KeyTypeEnum b : KeyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<KeyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return KeyTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("keyType")
  private KeyTypeEnum keyType = null;

  @SerializedName("groupId")
  private String groupId = null;

  @SerializedName("token")
  private ApplicationTokenDTO token = null;

  public ApplicationKeyDTO consumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }

   /**
   * Consumer key of the application
   * @return consumerKey
  **/
  @ApiModelProperty(example = "vYDoc9s7IgAFdkSyNDaswBX7ejoa", value = "Consumer key of the application")
  public String getConsumerKey() {
    return consumerKey;
  }

  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }

  public ApplicationKeyDTO consumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
    return this;
  }

   /**
   * Consumer secret of the application
   * @return consumerSecret
  **/
  @ApiModelProperty(example = "TIDlOFkpzB7WjufO3OJUhy1fsvAa", value = "Consumer secret of the application")
  public String getConsumerSecret() {
    return consumerSecret;
  }

  public void setConsumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
  }

  public ApplicationKeyDTO supportedGrantTypes(List<String> supportedGrantTypes) {
    this.supportedGrantTypes = supportedGrantTypes;
    return this;
  }

  public ApplicationKeyDTO addSupportedGrantTypesItem(String supportedGrantTypesItem) {
    if (this.supportedGrantTypes == null) {
      this.supportedGrantTypes = new ArrayList<>();
    }
    this.supportedGrantTypes.add(supportedGrantTypesItem);
    return this;
  }

   /**
   * The grant types that are supported by the application
   * @return supportedGrantTypes
  **/
  @ApiModelProperty(example = "[\"client_credentials\",\"password\"]", value = "The grant types that are supported by the application")
  public List<String> getSupportedGrantTypes() {
    return supportedGrantTypes;
  }

  public void setSupportedGrantTypes(List<String> supportedGrantTypes) {
    this.supportedGrantTypes = supportedGrantTypes;
  }

  public ApplicationKeyDTO callbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
    return this;
  }

   /**
   * Callback URL
   * @return callbackUrl
  **/
  @ApiModelProperty(example = "http://sample.com/callback/url", value = "Callback URL")
  public String getCallbackUrl() {
    return callbackUrl;
  }

  public void setCallbackUrl(String callbackUrl) {
    this.callbackUrl = callbackUrl;
  }

  public ApplicationKeyDTO keyState(String keyState) {
    this.keyState = keyState;
    return this;
  }

   /**
   * Describes the state of the key generation.
   * @return keyState
  **/
  @ApiModelProperty(example = "APPROVED", value = "Describes the state of the key generation.")
  public String getKeyState() {
    return keyState;
  }

  public void setKeyState(String keyState) {
    this.keyState = keyState;
  }

  public ApplicationKeyDTO keyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
    return this;
  }

   /**
   * Describes to which endpoint the key belongs
   * @return keyType
  **/
  @ApiModelProperty(example = "PRODUCTION", value = "Describes to which endpoint the key belongs")
  public KeyTypeEnum getKeyType() {
    return keyType;
  }

  public void setKeyType(KeyTypeEnum keyType) {
    this.keyType = keyType;
  }

  public ApplicationKeyDTO groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Application group id (if any).
   * @return groupId
  **/
  @ApiModelProperty(example = "2", value = "Application group id (if any).")
  public String getGroupId() {
    return groupId;
  }

  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  public ApplicationKeyDTO token(ApplicationTokenDTO token) {
    this.token = token;
    return this;
  }

   /**
   * Get token
   * @return token
  **/
  @ApiModelProperty(value = "")
  public ApplicationTokenDTO getToken() {
    return token;
  }

  public void setToken(ApplicationTokenDTO token) {
    this.token = token;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyDTO applicationKey = (ApplicationKeyDTO) o;
    return Objects.equals(this.consumerKey, applicationKey.consumerKey) &&
        Objects.equals(this.consumerSecret, applicationKey.consumerSecret) &&
        Objects.equals(this.supportedGrantTypes, applicationKey.supportedGrantTypes) &&
        Objects.equals(this.callbackUrl, applicationKey.callbackUrl) &&
        Objects.equals(this.keyState, applicationKey.keyState) &&
        Objects.equals(this.keyType, applicationKey.keyType) &&
        Objects.equals(this.groupId, applicationKey.groupId) &&
        Objects.equals(this.token, applicationKey.token);
  }

  @Override
  public int hashCode() {
    return Objects.hash(consumerKey, consumerSecret, supportedGrantTypes, callbackUrl, keyState, keyType, groupId, token);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyDTO {\n");
    
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    consumerSecret: ").append(toIndentedString(consumerSecret)).append("\n");
    sb.append("    supportedGrantTypes: ").append(toIndentedString(supportedGrantTypes)).append("\n");
    sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
    sb.append("    keyState: ").append(toIndentedString(keyState)).append("\n");
    sb.append("    keyType: ").append(toIndentedString(keyType)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
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

