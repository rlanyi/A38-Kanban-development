package com.codecool.a38.kanban.issue.dao;

import com.codecool.a38.kanban.issue.model.Issue;
import com.codecool.a38.kanban.issue.repository.IssueRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class IssueDaoDB implements IssueDao {

    private IssueRepository issueRepository;

    @Override
    public List<Issue> getAll() {
        return issueRepository.findAll();
    }

    @Override
    public void save(Issue issue) {
        log.info("Save issue: " + issue);
        issueRepository.save(issue);
    }

}