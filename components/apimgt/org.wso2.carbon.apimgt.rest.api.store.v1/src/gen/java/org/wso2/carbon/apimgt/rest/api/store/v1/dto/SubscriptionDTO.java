package org.wso2.carbon.apimgt.rest.api.store.v1.dto;

import org.wso2.carbon.apimgt.rest.api.store.v1.dto.APIInfoDTO;
import org.wso2.carbon.apimgt.rest.api.store.v1.dto.ApplicationInfoDTO;

import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.NotNull;





@ApiModel(description = "")
public class SubscriptionDTO  {
  
  
  
  private String subscriptionId = null;
  
  @NotNull
  private String applicationId = null;
  
  @NotNull
  private String apiIdentifier = null;
  
  
  private APIInfoDTO apiInfo = null;
  
  
  private ApplicationInfoDTO applicationInfo = null;
  
  @NotNull
  private String tier = null;
  
  public enum StatusEnum {
     BLOCKED,  PROD_ONLY_BLOCKED,  UNBLOCKED,  ON_HOLD,  REJECTED, 
  };
  
  private StatusEnum status = null;

  
  /**
   * The UUID of the subscription
   **/
  @ApiModelProperty(value = "The UUID of the subscription")
  @JsonProperty("subscriptionId")
  public String getSubscriptionId() {
    return subscriptionId;
  }
  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  
  /**
   * The UUID of the application
   **/
  @ApiModelProperty(required = true, value = "The UUID of the application")
  @JsonProperty("applicationId")
  public String getApplicationId() {
    return applicationId;
  }
  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  
  /**
   * The unique identifier of the API.
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the API.")
  @JsonProperty("apiIdentifier")
  public String getApiIdentifier() {
    return apiIdentifier;
  }
  public void setApiIdentifier(String apiIdentifier) {
    this.apiIdentifier = apiIdentifier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("apiInfo")
  public APIInfoDTO getApiInfo() {
    return apiInfo;
  }
  public void setApiInfo(APIInfoDTO apiInfo) {
    this.apiInfo = apiInfo;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("applicationInfo")
  public ApplicationInfoDTO getApplicationInfo() {
    return applicationInfo;
  }
  public void setApplicationInfo(ApplicationInfoDTO applicationInfo) {
    this.applicationInfo = applicationInfo;
  }

  
  /**
   **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("tier")
  public String getTier() {
    return tier;
  }
  public void setTier(String tier) {
    this.tier = tier;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDTO {\n");
    
    sb.append("  subscriptionId: ").append(subscriptionId).append("\n");
    sb.append("  applicationId: ").append(applicationId).append("\n");
    sb.append("  apiIdentifier: ").append(apiIdentifier).append("\n");
    sb.append("  apiInfo: ").append(apiInfo).append("\n");
    sb.append("  applicationInfo: ").append(applicationInfo).append("\n");
    sb.append("  tier: ").append(tier).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}