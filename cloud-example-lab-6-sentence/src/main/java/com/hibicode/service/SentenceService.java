package com.hibicode.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hibicode.client.AdjectiveClient;
import com.hibicode.client.ArticleClient;
import com.hibicode.client.NounClient;
import com.hibicode.client.SubjectClient;
import com.hibicode.client.VerbClient;

@Service
public class SentenceService {

	@Autowired
	private VerbClient verbClient;
	
	@Autowired
	private SubjectClient subjectService;
	
	@Autowired
	private ArticleClient articleService;
	
	@Autowired
	private AdjectiveClient adjectiveService;
	
	@Autowired
	private NounClient nounService;

	public String buildSentence() {
		return String.format("%s %s %s %s %s.", subjectService.getWord(), verbClient.getWord(),
				articleService.getWord(), adjectiveService.getWord(), nounService.getWord());
	}

}
