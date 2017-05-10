package com.yiibai.struts2;
import java.io.File;  
import java.io.FileInputStream;  
import java.io.FileOutputStream;  
import java.io.InputStream;  
import java.io.OutputStream;  
  
import org.apache.struts2.ServletActionContext;  
  
import com.opensymphony.xwork2.ActionSupport;  
  
public class UploadAction extends ActionSupport {  
    // username����������װ�û���  
    private String username;  
      
    // myFile����������װ�ϴ����ļ�  
    private File myFile;  
      
    // myFileContentType����������װ�ϴ��ļ�������  
    private String myFileContentType;  
  
    // myFileFileName����������װ�ϴ��ļ����ļ���  
    private String myFileFileName;  
    public String execute() throws Exception {  
  	  System.out.println("------");  
      //����myFile����һ���ļ�������  
      InputStream is = new FileInputStream(myFile);  
        
      // �����ϴ��ļ�Ŀ¼  
      String uploadPath = ServletActionContext.getServletContext()  
              .getRealPath("/");  
        
      // ����Ŀ���ļ�  
      File toFile = new File(uploadPath, this.getMyFileFileName());  
        
      // ����һ�������  
      OutputStream os = new FileOutputStream(toFile);  

      //���û���  
      byte[] buffer = new byte[1024];  

      int length = 0;  

      //��ȡmyFile�ļ������toFile�ļ���  
      while ((length = is.read(buffer)) > 0) {  
          os.write(buffer, 0, length);  
      }  
      System.out.println("�ϴ��û�"+username);  
      System.out.println("�ϴ��ļ���"+myFileFileName);  
      System.out.println("�ϴ��ļ�����"+myFileContentType);  
      //�ر�������  
      is.close();  
        
      //�ر������  
      os.close();  
        
      return SUCCESS;  
  }  
      
    //���usernameֵ  
    public String getUsername() {  
        return username;  
    }  
  
    //����usernameֵ  
    public void setUsername(String username) {  
        this.username = username;  
    }  
  
    //���myFileֵ  
    public File getMyFile() {  
        return myFile;  
    }  
  
    //����myFileֵ  
    public void setMyFile(File myFile) {  
        this.myFile = myFile;  
    }  
  
    //���myFileContentTypeֵ  
    public String getMyFileContentType() {  
        return myFileContentType;  
    }  
  
    //����myFileContentTypeֵ  
    public void setMyFileContentType(String myFileContentType) {  
        this.myFileContentType = myFileContentType;  
    }  
  
    //���myFileFileNameֵ  
    public String getMyFileFileName() {  
        return myFileFileName;  
    }  
  
    //����myFileFileNameֵ  
    public void setMyFileFileName(String myFileFileName) {  
        this.myFileFileName = myFileFileName;  
    }  
  

  
}  