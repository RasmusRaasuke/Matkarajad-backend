package ee.taltech.iti03022024backend.controller;


import ee.taltech.iti03022024backend.dto.CommentDto;
import ee.taltech.iti03022024backend.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/comments")
public class CommentController {
    private final CommentService service;

    @PostMapping()
    public ResponseEntity<CommentDto> createComment(@RequestBody CommentDto dto) {
        return service.createComment(dto);
    }

    @GetMapping()
    public ResponseEntity<List<CommentDto>> getByCommentsByCampingRoute(@RequestParam("id") Long id) {
        return service.getCommentsByCampingRoute(id);
    }
}