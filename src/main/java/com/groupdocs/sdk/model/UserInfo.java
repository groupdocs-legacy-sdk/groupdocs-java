/**
 *  Copyright 2012 GroupDocs.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.RoleInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class UserInfo {
  private String nickname = null;
  private String firstname = null;
  private String lastname = null;
  private String pkey = null;
  private String pswd_salt = null;
  private String claimed_id = null;
  private String token = null;
  private Integer storage = null;
  private String photo = null;
  private Boolean active = null;
  private Boolean trial = null;
  private Boolean news_eanbled = null;
  private Boolean alerts_eanbled = null;
  private Boolean support_eanbled = null;
  private String support_email = null;
  private Boolean annotation_branded = null;
  private Boolean viewer_branded = null;
  private Long signedupOn = null;
  private Long signedinOn = null;
  private Integer signin_count = null;
  private List<RoleInfo> roles = new ArrayList<RoleInfo>();
  private Double id = null;
  private String guid = null;
  private String primary_email = null;
  public String getNickname() {
    return nickname;
  }
  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public String getFirstname() {
    return firstname;
  }
  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastname() {
    return lastname;
  }
  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public String getPkey() {
    return pkey;
  }
  public void setPkey(String pkey) {
    this.pkey = pkey;
  }

  public String getPswd_salt() {
    return pswd_salt;
  }
  public void setPswd_salt(String pswd_salt) {
    this.pswd_salt = pswd_salt;
  }

  public String getClaimed_id() {
    return claimed_id;
  }
  public void setClaimed_id(String claimed_id) {
    this.claimed_id = claimed_id;
  }

  public String getToken() {
    return token;
  }
  public void setToken(String token) {
    this.token = token;
  }

  public Integer getStorage() {
    return storage;
  }
  public void setStorage(Integer storage) {
    this.storage = storage;
  }

  public String getPhoto() {
    return photo;
  }
  public void setPhoto(String photo) {
    this.photo = photo;
  }

  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  public Boolean getTrial() {
    return trial;
  }
  public void setTrial(Boolean trial) {
    this.trial = trial;
  }

  public Boolean getNews_eanbled() {
    return news_eanbled;
  }
  public void setNews_eanbled(Boolean news_eanbled) {
    this.news_eanbled = news_eanbled;
  }

  public Boolean getAlerts_eanbled() {
    return alerts_eanbled;
  }
  public void setAlerts_eanbled(Boolean alerts_eanbled) {
    this.alerts_eanbled = alerts_eanbled;
  }

  public Boolean getSupport_eanbled() {
    return support_eanbled;
  }
  public void setSupport_eanbled(Boolean support_eanbled) {
    this.support_eanbled = support_eanbled;
  }

  public String getSupport_email() {
    return support_email;
  }
  public void setSupport_email(String support_email) {
    this.support_email = support_email;
  }

  public Boolean getAnnotation_branded() {
    return annotation_branded;
  }
  public void setAnnotation_branded(Boolean annotation_branded) {
    this.annotation_branded = annotation_branded;
  }

  public Boolean getViewer_branded() {
    return viewer_branded;
  }
  public void setViewer_branded(Boolean viewer_branded) {
    this.viewer_branded = viewer_branded;
  }

  public Long getSignedupOn() {
    return signedupOn;
  }
  public void setSignedupOn(Long signedupOn) {
    this.signedupOn = signedupOn;
  }

  public Long getSignedinOn() {
    return signedinOn;
  }
  public void setSignedinOn(Long signedinOn) {
    this.signedinOn = signedinOn;
  }

  public Integer getSignin_count() {
    return signin_count;
  }
  public void setSignin_count(Integer signin_count) {
    this.signin_count = signin_count;
  }

  public List<RoleInfo> getRoles() {
    return roles;
  }
  public void setRoles(List<RoleInfo> roles) {
    this.roles = roles;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  public String getPrimary_email() {
    return primary_email;
  }
  public void setPrimary_email(String primary_email) {
    this.primary_email = primary_email;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserInfo {\n");
    sb.append("  nickname: ").append(nickname).append("\n");
    sb.append("  firstname: ").append(firstname).append("\n");
    sb.append("  lastname: ").append(lastname).append("\n");
    sb.append("  pkey: ").append(pkey).append("\n");
    sb.append("  pswd_salt: ").append(pswd_salt).append("\n");
    sb.append("  claimed_id: ").append(claimed_id).append("\n");
    sb.append("  token: ").append(token).append("\n");
    sb.append("  storage: ").append(storage).append("\n");
    sb.append("  photo: ").append(photo).append("\n");
    sb.append("  active: ").append(active).append("\n");
    sb.append("  trial: ").append(trial).append("\n");
    sb.append("  news_eanbled: ").append(news_eanbled).append("\n");
    sb.append("  alerts_eanbled: ").append(alerts_eanbled).append("\n");
    sb.append("  support_eanbled: ").append(support_eanbled).append("\n");
    sb.append("  support_email: ").append(support_email).append("\n");
    sb.append("  annotation_branded: ").append(annotation_branded).append("\n");
    sb.append("  viewer_branded: ").append(viewer_branded).append("\n");
    sb.append("  signedupOn: ").append(signedupOn).append("\n");
    sb.append("  signedinOn: ").append(signedinOn).append("\n");
    sb.append("  signin_count: ").append(signin_count).append("\n");
    sb.append("  roles: ").append(roles).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("  primary_email: ").append(primary_email).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

