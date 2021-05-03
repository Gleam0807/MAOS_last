package com.mcos.community.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mcos.community.domain.ReplyVO;
import com.mcos.community.service.ReplyService;

@RestController
@RequestMapping("/replies")
public class ReplyController {

	@Autowired
	private ReplyService service;
	
	//댓글 등록
	@RequestMapping(value = "", method=RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody ReplyVO replyVO){
		ResponseEntity<String> entity = null;
		try {
			service.createReply(replyVO);
			entity = new ResponseEntity<>("regSuccess", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	//댓글 목록
	@RequestMapping(value ="/all/{comid}", method=RequestMethod.GET)
	public ResponseEntity<List<ReplyVO>> list(@PathVariable("comid")int comid){
		ResponseEntity<List<ReplyVO>> entity = null;
		try {
			entity = new ResponseEntity<>(service.readReply(comid), HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	//댓글 수정
	@RequestMapping(value ="/{replyid}", method= {RequestMethod.PUT, RequestMethod.PATCH})
	public ResponseEntity<String> update(@PathVariable("replyid")int replyid, @RequestBody ReplyVO replyVO ){
		ResponseEntity<String> entity = null;
		try {
			replyVO.setReplyid(replyid);
			service.updateReply(replyVO);
			entity = new ResponseEntity<>("modSuccess", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}
	
	//댓글 삭제
	@RequestMapping(value = "/{replyid}", method=RequestMethod.DELETE)
	public ResponseEntity<String> delete(@PathVariable("replyid")int replyid){
		ResponseEntity<String> entity = null;
		try {
			service.deleteReply(replyid);
			entity = new ResponseEntity<>("delSuccess", HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
			entity = new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
		return entity;
	}

}
