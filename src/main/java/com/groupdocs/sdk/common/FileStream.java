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
package com.groupdocs.sdk.common;

import java.io.InputStream;
import java.text.ParseException;

import javax.ws.rs.core.MultivaluedMap;

import com.sun.jersey.core.header.ContentDisposition;

public class FileStream {

	private InputStream inputStream;
	private String fileName;
	private long size;
	
	
	public FileStream(InputStream inputStream) {
		this(inputStream, null);
	}

	public FileStream(InputStream inputStream, MultivaluedMap<String, String> headers) {
		this.inputStream = inputStream;
		try {
			// http://www.ietf.org/rfc/rfc2183.txt
			ContentDisposition cd = new ContentDisposition(headers.getFirst("Content-Disposition"));
			fileName = cd.getFileName();
			size = cd.getSize();
		} catch (ParseException e) {
		}
	}

	public InputStream getInputStream() {
		return inputStream;
	}
	
	public void setInputStream(InputStream inputStream) {
		this.inputStream = inputStream;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		this.size = size;
	}

}
