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
import org.wso2.am.integration.clients.store.api.v1.dto.PaginationDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.SubscriptionDTO;

/**
 * SubscriptionListDTO
 */

public class SubscriptionListDTO {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("list")
  private List<SubscriptionDTO> list = null;

  @SerializedName("pagination")
  private PaginationDTO pagination = null;

  public SubscriptionListDTO count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of Subscriptions returned. 
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "Number of Subscriptions returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SubscriptionListDTO list(List<SubscriptionDTO> list) {
    this.list = list;
    return this;
  }

  public SubscriptionListDTO addListItem(SubscriptionDTO listItem) {
    if (this.list == null) {
      this.list = new ArrayList<>();
    }
    this.list.add(listItem);
    return this;
  }

   /**
   * Get list
   * @return list
  **/
  @ApiModelProperty(value = "")
  public List<SubscriptionDTO> getList() {
    return list;
  }

  public void setList(List<SubscriptionDTO> list) {
    this.list = list;
  }

  public SubscriptionListDTO pagination(PaginationDTO pagination) {
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")
  public PaginationDTO getPagination() {
    return pagination;
  }

  public void setPagination(PaginationDTO pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionListDTO subscriptionList = (SubscriptionListDTO) o;
    return Objects.equals(this.count, subscriptionList.count) &&
        Objects.equals(this.list, subscriptionList.list) &&
        Objects.equals(this.pagination, subscriptionList.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, list, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionListDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    list: ").append(toIndentedString(list)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

