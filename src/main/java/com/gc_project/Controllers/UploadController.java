package com.gc_project.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {

    @GetMapping("/upload")
    public String showUploadForm() {
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return "Please select a file to upload.";
        }

        try {
            // Simpan file ke lokasi tertentu (misalnya, folder 'uploads')
            String uploadDir = "./uploads/";
            File uploadPath = new File(uploadDir);
            if (!uploadPath.exists()) {
                uploadPath.mkdirs();
            }

            String filePath = uploadDir + file.getOriginalFilename();
            file.transferTo(new File(filePath));
            return "File uploaded successfully: " + filePath;
        } catch (IOException e) {
            return "Failed to upload file: " + e.getMessage();
        }
    }
}
