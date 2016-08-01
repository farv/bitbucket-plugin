package com.cloudbees.jenkins.plugins.cause.repository;

import com.cloudbees.jenkins.plugins.cause.BitbucketTriggerCause;
import com.cloudbees.jenkins.plugins.payload.BitbucketPayload;

import java.io.File;
import java.io.IOException;

/**
 * The {@link RepositoryCause} which represents a type of {@link BitbucketTriggerCause}
 * @since August 1, 2016
 * @version 2.0
 */
public class RepositoryCause extends BitbucketTriggerCause {
    public RepositoryCause(File pollingLog, BitbucketPayload bitbucketPayload) throws IOException {
        super(pollingLog, bitbucketPayload);
    }

    @Override
    public String getShortDescription() {
        String pusher = bitbucketPayload.getUser() != null ? bitbucketPayload.getUser() : "";
        return "Started by Bitbucket repository event by " + pusher;
    }
}
