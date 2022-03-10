package com.fileuploaddownload.fileuploaddownload;

import com.fileuploaddownload.fileuploaddownload.property.FileStorageProperties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class FileuploaddownloadApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileuploaddownloadApplication.class, args);
	}

}
