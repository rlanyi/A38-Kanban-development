package com.codecool.a38.kanban.issue.model.graphQLResponse.projects.projectAllIssues;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Issues {

    @SerializedName("nodes")
    private List<NodesItem> nodes;

    public List<NodesItem> getNodes() {
        return nodes;
    }
}