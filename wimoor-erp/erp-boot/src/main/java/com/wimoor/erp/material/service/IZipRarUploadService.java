package com.wimoor.erp.material.service;


import com.wimoor.common.user.UserInfo;
import java.util.List;
import org.springframework.web.multipart.MultipartFile;


public interface IZipRarUploadService {

    public List<String> uploadZipOrRar(UserInfo user, MultipartFile file, String ftype, String name);

    public String copyFolder(String oldPath, String newPath, String newFileName);
}
