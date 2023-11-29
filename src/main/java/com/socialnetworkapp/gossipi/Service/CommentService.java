package com.socialnetworkapp.gossipi.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialnetworkapp.gossipi.Entity.Comments;
import com.socialnetworkapp.gossipi.Repository.CommentRepo;

@Service
public class CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Autowired
    UserService userService;
    
    public Comments submidCommentsToDB(Comments comments){
        return commentRepo.save(comments);
    }

    public ArrayList<Comments> getALlCommentsFromDB(String postId){
        ArrayList<Comments> commentsList = commentRepo.findAllByPostId(postId);
        for(int i = 0; i<commentsList.size(); i++){
            Comments commentsItem = commentsList.get(i);
            commentsItem.setUserName(userService.displayUserMetaData(commentsItem.getUserId()).getUserName());
        }
        return commentsList;
    }
}
