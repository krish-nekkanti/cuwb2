package com.radian.cuwb.rest.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-06-08T20:59:06.195+04:00[Asia/Muscat]")
public class User   {
  @JsonProperty("tran_ref")
  private String tranRef = null;

  @JsonProperty("userDescription")
  private String userDescription = null;

  @JsonProperty("companyId")
  private String companyId = "Radian";

  @JsonProperty("defaultCompanyId")
  private String defaultCompanyId = "Radian";

  @JsonProperty("authorizatoinLevel")
  private BigDecimal authorizatoinLevel = null;

  @JsonProperty("multiLogin")
  private Object multiLogin = null;

  @JsonProperty("language")
  private String language = "ENGLISH";

  /**
   * Active Status
   */
  public enum ActiveStatusEnum {
    T("T"),
    
    F("F");

    private String value;

    ActiveStatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ActiveStatusEnum fromValue(String text) {
      for (ActiveStatusEnum b : ActiveStatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("activeStatus")
  private ActiveStatusEnum activeStatus = ActiveStatusEnum.T;

  @JsonProperty("effectiveDate")
  private String effectiveDate = "System Date";

  @JsonProperty("expiryDate")
  private String expiryDate = "System Date + 100 Years";

  @JsonProperty("emailId")
  private String emailId = null;

  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  @JsonProperty("tokenId")
  private String tokenId = null;

  @JsonProperty("authorizationPref")
  private String authorizationPref = null;

  public User tranRef(String tranRef) {
    this.tranRef = tranRef;
    return this;
  }

  /**
   * User Id*
   * @return tranRef
  **/
  @ApiModelProperty(required = true, value = "User Id*")
      @NotNull

    public String getTranRef() {
    return tranRef;
  }

  public void setTranRef(String tranRef) {
    this.tranRef = tranRef;
  }

  public User userDescription(String userDescription) {
    this.userDescription = userDescription;
    return this;
  }

  /**
   * User Description*
   * @return userDescription
  **/
  @ApiModelProperty(value = "User Description*")
  
    public String getUserDescription() {
    return userDescription;
  }

  public void setUserDescription(String userDescription) {
    this.userDescription = userDescription;
  }

  public User companyId(String companyId) {
    this.companyId = companyId;
    return this;
  }

  /**
   * Company Id*
   * @return companyId
  **/
  @ApiModelProperty(value = "Company Id*")
  
    public String getCompanyId() {
    return companyId;
  }

  public void setCompanyId(String companyId) {
    this.companyId = companyId;
  }

  public User defaultCompanyId(String defaultCompanyId) {
    this.defaultCompanyId = defaultCompanyId;
    return this;
  }

  /**
   * Default Company Id
   * @return defaultCompanyId
  **/
  @ApiModelProperty(value = "Default Company Id")
  
    public String getDefaultCompanyId() {
    return defaultCompanyId;
  }

  public void setDefaultCompanyId(String defaultCompanyId) {
    this.defaultCompanyId = defaultCompanyId;
  }

  public User authorizatoinLevel(BigDecimal authorizatoinLevel) {
    this.authorizatoinLevel = authorizatoinLevel;
    return this;
  }

  /**
   * Authorization Level
   * minimum: 1
   * maximum: 8
   * @return authorizatoinLevel
  **/
  @ApiModelProperty(value = "Authorization Level")
  
    @Valid
  @DecimalMin("1") @DecimalMax("8")   public BigDecimal getAuthorizatoinLevel() {
    return authorizatoinLevel;
  }

  public void setAuthorizatoinLevel(BigDecimal authorizatoinLevel) {
    this.authorizatoinLevel = authorizatoinLevel;
  }

  public User multiLogin(Object multiLogin) {
    this.multiLogin = multiLogin;
    return this;
  }

  /**
   * Multi Login
   * @return multiLogin
  **/
  @ApiModelProperty(value = "Multi Login")
  
    public Object getMultiLogin() {
    return multiLogin;
  }

  public void setMultiLogin(Object multiLogin) {
    this.multiLogin = multiLogin;
  }

  public User language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Language
   * @return language
  **/
  @ApiModelProperty(value = "Language")
  
    public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public User activeStatus(ActiveStatusEnum activeStatus) {
    this.activeStatus = activeStatus;
    return this;
  }

  /**
   * Active Status
   * @return activeStatus
  **/
  @ApiModelProperty(value = "Active Status")
  
    public ActiveStatusEnum getActiveStatus() {
    return activeStatus;
  }

  public void setActiveStatus(ActiveStatusEnum activeStatus) {
    this.activeStatus = activeStatus;
  }

  public User effectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
    return this;
  }

  /**
   * Effective Date
   * @return effectiveDate
  **/
  @ApiModelProperty(example = "2020-12-21", value = "Effective Date")
  
    public String getEffectiveDate() {
    return effectiveDate;
  }

  public void setEffectiveDate(String effectiveDate) {
    this.effectiveDate = effectiveDate;
  }

  public User expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

  /**
   * Expiry Date
   * @return expiryDate
  **/
  @ApiModelProperty(example = "2022-12-21", value = "Expiry Date")
  
    public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public User emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

  /**
   * Company Email Id
   * @return emailId
  **/
  @ApiModelProperty(value = "Company Email Id")
  
    public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public User mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

  /**
   * Company Mobile Number
   * @return mobileNumber
  **/
  @ApiModelProperty(value = "Company Mobile Number")
  
    public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public User tokenId(String tokenId) {
    this.tokenId = tokenId;
    return this;
  }

  /**
   * Token Id Value
   * @return tokenId
  **/
  @ApiModelProperty(value = "Token Id Value")
  
    public String getTokenId() {
    return tokenId;
  }

  public void setTokenId(String tokenId) {
    this.tokenId = tokenId;
  }

  public User authorizationPref(String authorizationPref) {
    this.authorizationPref = authorizationPref;
    return this;
  }

  /**
   * Authorization Preference(OTP/Hard Token/Soft Token)*
   * @return authorizationPref
  **/
  @ApiModelProperty(value = "Authorization Preference(OTP/Hard Token/Soft Token)*")
  
    public String getAuthorizationPref() {
    return authorizationPref;
  }

  public void setAuthorizationPref(String authorizationPref) {
    this.authorizationPref = authorizationPref;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.tranRef, user.tranRef) &&
        Objects.equals(this.userDescription, user.userDescription) &&
        Objects.equals(this.companyId, user.companyId) &&
        Objects.equals(this.defaultCompanyId, user.defaultCompanyId) &&
        Objects.equals(this.authorizatoinLevel, user.authorizatoinLevel) &&
        Objects.equals(this.multiLogin, user.multiLogin) &&
        Objects.equals(this.language, user.language) &&
        Objects.equals(this.activeStatus, user.activeStatus) &&
        Objects.equals(this.effectiveDate, user.effectiveDate) &&
        Objects.equals(this.expiryDate, user.expiryDate) &&
        Objects.equals(this.emailId, user.emailId) &&
        Objects.equals(this.mobileNumber, user.mobileNumber) &&
        Objects.equals(this.tokenId, user.tokenId) &&
        Objects.equals(this.authorizationPref, user.authorizationPref);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tranRef, userDescription, companyId, defaultCompanyId, authorizatoinLevel, multiLogin, language, activeStatus, effectiveDate, expiryDate, emailId, mobileNumber, tokenId, authorizationPref);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    tranRef: ").append(toIndentedString(tranRef)).append("\n");
    sb.append("    userDescription: ").append(toIndentedString(userDescription)).append("\n");
    sb.append("    companyId: ").append(toIndentedString(companyId)).append("\n");
    sb.append("    defaultCompanyId: ").append(toIndentedString(defaultCompanyId)).append("\n");
    sb.append("    authorizatoinLevel: ").append(toIndentedString(authorizatoinLevel)).append("\n");
    sb.append("    multiLogin: ").append(toIndentedString(multiLogin)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
    sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    tokenId: ").append(toIndentedString(tokenId)).append("\n");
    sb.append("    authorizationPref: ").append(toIndentedString(authorizationPref)).append("\n");
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
