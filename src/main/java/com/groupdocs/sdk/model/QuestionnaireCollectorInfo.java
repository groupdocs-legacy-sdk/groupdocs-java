package com.groupdocs.sdk.model;

import java.util.*;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class QuestionnaireCollectorInfo {
  private String guid = null;
  private Double id = null;
  private String status = null;
  private Integer resolved_exectuions = null;
  private Double questionnaire_id = null;
  private List<String> emails = new ArrayList<String>();
  private String type = null;
  private Long modified = null;
  public String getGuid() {
    return guid;
  }
  public void setGuid(String guid) {
    this.guid = guid;
  }

  public Double getId() {
    return id;
  }
  public void setId(Double id) {
    this.id = id;
  }

  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  public Integer getResolved_exectuions() {
    return resolved_exectuions;
  }
  public void setResolved_exectuions(Integer resolved_exectuions) {
    this.resolved_exectuions = resolved_exectuions;
  }

  public Double getQuestionnaire_id() {
    return questionnaire_id;
  }
  public void setQuestionnaire_id(Double questionnaire_id) {
    this.questionnaire_id = questionnaire_id;
  }

  public List<String> getEmails() {
    return emails;
  }
  public void setEmails(List<String> emails) {
    this.emails = emails;
  }

  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  public Long getModified() {
    return modified;
  }
  public void setModified(Long modified) {
    this.modified = modified;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QuestionnaireCollectorInfo {\n");
    sb.append("  guid: ").append(guid).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  resolved_exectuions: ").append(resolved_exectuions).append("\n");
    sb.append("  questionnaire_id: ").append(questionnaire_id).append("\n");
    sb.append("  emails: ").append(emails).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  modified: ").append(modified).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
