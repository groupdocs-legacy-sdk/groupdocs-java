package com.groupdocs.sdk.model;

import java.util.*;
import com.groupdocs.sdk.model.SignatureTemplateRecipientInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureTemplateInfo {
  private Boolean ownerShouldSign = null;
  private List<SignatureTemplateRecipientInfo> recipients = new ArrayList<SignatureTemplateRecipientInfo>();
  private Double ownerId = null;
  private Double reminderTime = null;
  private String emailSubject = null;
  private String id = null;
  private Double stepExpireTime = null;
  private Double templateExpireTime = null;
  private String emailBody = null;
  private Boolean orderedSignature = null;
  private Double documentsCount = null;
  private String ownerGuid = null;
  private Double documentsPages = null;
  private String name = null;
  public Boolean getOwnerShouldSign() {
    return ownerShouldSign;
  }
  public void setOwnerShouldSign(Boolean ownerShouldSign) {
    this.ownerShouldSign = ownerShouldSign;
  }

  public List<SignatureTemplateRecipientInfo> getRecipients() {
    return recipients;
  }
  public void setRecipients(List<SignatureTemplateRecipientInfo> recipients) {
    this.recipients = recipients;
  }

  public Double getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(Double ownerId) {
    this.ownerId = ownerId;
  }

  public Double getReminderTime() {
    return reminderTime;
  }
  public void setReminderTime(Double reminderTime) {
    this.reminderTime = reminderTime;
  }

  public String getEmailSubject() {
    return emailSubject;
  }
  public void setEmailSubject(String emailSubject) {
    this.emailSubject = emailSubject;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  public Double getStepExpireTime() {
    return stepExpireTime;
  }
  public void setStepExpireTime(Double stepExpireTime) {
    this.stepExpireTime = stepExpireTime;
  }

  public Double getTemplateExpireTime() {
    return templateExpireTime;
  }
  public void setTemplateExpireTime(Double templateExpireTime) {
    this.templateExpireTime = templateExpireTime;
  }

  public String getEmailBody() {
    return emailBody;
  }
  public void setEmailBody(String emailBody) {
    this.emailBody = emailBody;
  }

  public Boolean getOrderedSignature() {
    return orderedSignature;
  }
  public void setOrderedSignature(Boolean orderedSignature) {
    this.orderedSignature = orderedSignature;
  }

  public Double getDocumentsCount() {
    return documentsCount;
  }
  public void setDocumentsCount(Double documentsCount) {
    this.documentsCount = documentsCount;
  }

  public String getOwnerGuid() {
    return ownerGuid;
  }
  public void setOwnerGuid(String ownerGuid) {
    this.ownerGuid = ownerGuid;
  }

  public Double getDocumentsPages() {
    return documentsPages;
  }
  public void setDocumentsPages(Double documentsPages) {
    this.documentsPages = documentsPages;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureTemplateInfo {\n");
    sb.append("  ownerShouldSign: ").append(ownerShouldSign).append("\n");
    sb.append("  recipients: ").append(recipients).append("\n");
    sb.append("  ownerId: ").append(ownerId).append("\n");
    sb.append("  reminderTime: ").append(reminderTime).append("\n");
    sb.append("  emailSubject: ").append(emailSubject).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  stepExpireTime: ").append(stepExpireTime).append("\n");
    sb.append("  templateExpireTime: ").append(templateExpireTime).append("\n");
    sb.append("  emailBody: ").append(emailBody).append("\n");
    sb.append("  orderedSignature: ").append(orderedSignature).append("\n");
    sb.append("  documentsCount: ").append(documentsCount).append("\n");
    sb.append("  ownerGuid: ").append(ownerGuid).append("\n");
    sb.append("  documentsPages: ").append(documentsPages).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
