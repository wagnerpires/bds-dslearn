package com.devsuperior.dslearn.resources;

import com.devsuperior.dslearn.dto.NotificationDTO;
import com.devsuperior.dslearn.dto.UserDTO;
import com.devsuperior.dslearn.entities.Notification;
import com.devsuperior.dslearn.services.NotificationService;
import com.devsuperior.dslearn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/notifications")
public class NotificationResource {
    @Autowired
    private NotificationService service;

    @GetMapping
    public ResponseEntity<Page<NotificationDTO>> notificationsForCurrentUser(
            @RequestParam(name = "unreadOnly", defaultValue = "false") Boolean unreadOnly,
            Pageable pageable) {
        Page<NotificationDTO> page = service.notificationForCurrentUser(unreadOnly, pageable);
        return ResponseEntity.ok().body(page);
    }
}
