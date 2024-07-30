/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders and manage their resources.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * The payload for the &#x60;getServiceJobs&#x60; operation.
 */
@ApiModel(description = "The payload for the `getServiceJobs` operation.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2024-01-30T15:25:55.891+08:00")
public class JobListing {
  @SerializedName("totalResultSize")
  private Integer totalResultSize = null;

  @SerializedName("nextPageToken")
  private String nextPageToken = null;

  @SerializedName("previousPageToken")
  private String previousPageToken = null;

  @SerializedName("jobs")
  private List<ServiceJob> jobs = null;

  public JobListing totalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
    return this;
  }

   /**
   * Total result size of the query result.
   * @return totalResultSize
  **/
  @ApiModelProperty(value = "Total result size of the query result.")
  public Integer getTotalResultSize() {
    return totalResultSize;
  }

  public void setTotalResultSize(Integer totalResultSize) {
    this.totalResultSize = totalResultSize;
  }

  public JobListing nextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * A generated string used to pass information to your next request. If &#x60;nextPageToken&#x60; is returned, pass the value of &#x60;nextPageToken&#x60; to the &#x60;pageToken&#x60; to get next results.
   * @return nextPageToken
  **/
  @ApiModelProperty(value = "A generated string used to pass information to your next request. If `nextPageToken` is returned, pass the value of `nextPageToken` to the `pageToken` to get next results.")
  public String getNextPageToken() {
    return nextPageToken;
  }

  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }

  public JobListing previousPageToken(String previousPageToken) {
    this.previousPageToken = previousPageToken;
    return this;
  }

   /**
   * A generated string used to pass information to your next request. If &#x60;previousPageToken&#x60; is returned, pass the value of &#x60;previousPageToken&#x60; to the &#x60;pageToken&#x60; to get previous page results.
   * @return previousPageToken
  **/
  @ApiModelProperty(value = "A generated string used to pass information to your next request. If `previousPageToken` is returned, pass the value of `previousPageToken` to the `pageToken` to get previous page results.")
  public String getPreviousPageToken() {
    return previousPageToken;
  }

  public void setPreviousPageToken(String previousPageToken) {
    this.previousPageToken = previousPageToken;
  }

  public JobListing jobs(List<ServiceJob> jobs) {
    this.jobs = jobs;
    return this;
  }

  public JobListing addJobsItem(ServiceJob jobsItem) {
    if (this.jobs == null) {
      this.jobs = new ArrayList<ServiceJob>();
    }
    this.jobs.add(jobsItem);
    return this;
  }

   /**
   * List of job details for the given input.
   * @return jobs
  **/
  @ApiModelProperty(value = "List of job details for the given input.")
  public List<ServiceJob> getJobs() {
    return jobs;
  }

  public void setJobs(List<ServiceJob> jobs) {
    this.jobs = jobs;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobListing jobListing = (JobListing) o;
    return Objects.equals(this.totalResultSize, jobListing.totalResultSize) &&
        Objects.equals(this.nextPageToken, jobListing.nextPageToken) &&
        Objects.equals(this.previousPageToken, jobListing.previousPageToken) &&
        Objects.equals(this.jobs, jobListing.jobs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResultSize, nextPageToken, previousPageToken, jobs);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobListing {\n");
    
    sb.append("    totalResultSize: ").append(toIndentedString(totalResultSize)).append("\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    previousPageToken: ").append(toIndentedString(previousPageToken)).append("\n");
    sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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

