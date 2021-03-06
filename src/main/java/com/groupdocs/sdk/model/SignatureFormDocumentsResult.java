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
import com.groupdocs.sdk.model.SignatureFormDocumentInfo;
/**
 * 
 * <p>
 * NOTE: This class is auto generated by the swagger code generator program. Do not edit the class manually.
 *
 */
public class SignatureFormDocumentsResult {
  private String formId = null;
  private List<SignatureFormDocumentInfo> documents = new ArrayList<SignatureFormDocumentInfo>();
  public String getFormId() {
    return formId;
  }
  public void setFormId(String formId) {
    this.formId = formId;
  }

  public List<SignatureFormDocumentInfo> getDocuments() {
    return documents;
  }
  public void setDocuments(List<SignatureFormDocumentInfo> documents) {
    this.documents = documents;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureFormDocumentsResult {\n");
    sb.append("  formId: ").append(formId).append("\n");
    sb.append("  documents: ").append(documents).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

