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
import org.wso2.am.integration.clients.store.api.v1.dto.RatingDTO;

/**
 * RatingListDTO
 */

public class RatingListDTO {
  @SerializedName("avgRating")
  private String avgRating = null;

  @SerializedName("userRating")
  private Integer userRating = null;

  @SerializedName("count")
  private Integer count = null;

  @SerializedName("list")
  private List<RatingDTO> list = null;

  @SerializedName("pagination")
  private PaginationDTO pagination = null;

  public RatingListDTO avgRating(String avgRating) {
    this.avgRating = avgRating;
    return this;
  }

   /**
   * Average Rating of the API 
   * @return avgRating
  **/
  @ApiModelProperty(value = "Average Rating of the API ")
  public String getAvgRating() {
    return avgRating;
  }

  public void setAvgRating(String avgRating) {
    this.avgRating = avgRating;
  }

  public RatingListDTO userRating(Integer userRating) {
    this.userRating = userRating;
    return this;
  }

   /**
   * Rating given by the user 
   * @return userRating
  **/
  @ApiModelProperty(value = "Rating given by the user ")
  public Integer getUserRating() {
    return userRating;
  }

  public void setUserRating(Integer userRating) {
    this.userRating = userRating;
  }

  public RatingListDTO count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of Subscriber Ratings returned. 
   * @return count
  **/
  @ApiModelProperty(example = "1", value = "Number of Subscriber Ratings returned. ")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public RatingListDTO list(List<RatingDTO> list) {
    this.list = list;
    return this;
  }

  public RatingListDTO addListItem(RatingDTO listItem) {
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
  public List<RatingDTO> getList() {
    return list;
  }

  public void setList(List<RatingDTO> list) {
    this.list = list;
  }

  public RatingListDTO pagination(PaginationDTO pagination) {
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
    RatingListDTO ratingList = (RatingListDTO) o;
    return Objects.equals(this.avgRating, ratingList.avgRating) &&
        Objects.equals(this.userRating, ratingList.userRating) &&
        Objects.equals(this.count, ratingList.count) &&
        Objects.equals(this.list, ratingList.list) &&
        Objects.equals(this.pagination, ratingList.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(avgRating, userRating, count, list, pagination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingListDTO {\n");
    
    sb.append("    avgRating: ").append(toIndentedString(avgRating)).append("\n");
    sb.append("    userRating: ").append(toIndentedString(userRating)).append("\n");
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

