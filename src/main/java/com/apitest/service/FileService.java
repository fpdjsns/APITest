package com.apitest.service;


import java.nio.file.Paths;
import java.sql.Timestamp;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

@Service
@Slf4j
public class FileService {

  private final Path fileStorageLocation;
  private final String URL = ""


  public FileService() {
    this.fileStorageLocation = Paths.get()
        .toAbsolutePath().normalize();

    try {
      Files.createDirectories(this.fileStorageLocation);
    } catch (Exception ex) {
      throw new FileStorageException(
          "Could not create the directory where the uploaded files will be stored.", ex);
    }
  }


  public String upload(MultipartFile file) {
    String fileName = StringUtils.cleanPath(file.getOriginalFilename());
    String timestamp = new Timestamp(new Date().getTime()).toString();
    try {
      Path targetLocation = this.fileStorageLocation.resolve(fileName);
      Files.copy(file.getInputStream(), targetLocation, StandardCopyOption.REPLACE_EXISTING);

      return fileName;
    } catch (IOException e) {
      log.error("file upload error!", e);
    }
  }

}