/**Copyright to customer-app by asif
All rights reserved.
*/
package image.store.test;

import java.util.Date;
import org.bson.types.Binary;
import org.springFramework.data.annotation.Id;
import org.springFramework.data.mongodb.core.mapping.Document;

@Document("CustomerDocuments")
public class UploadFile {
	@Id
	private String id;
	private String name;
	private Date createdTime;
	private Binary content;
	private String contentType;
	private long size;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Binary getContent() {
		return content;
	}
	public void setContent(Binary content) {
		this.content = content;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	

}
