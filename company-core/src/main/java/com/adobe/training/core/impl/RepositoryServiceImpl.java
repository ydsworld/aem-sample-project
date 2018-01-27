package com.adobe.training.core.impl;

import com.adobe.training.core.RepositoryService;
import org.apache.felix.scr.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jcr.Repository;

/**
 * Created by Arun on 1/30/16.
 */

@Component(immediate = true, metatype = true, label = "Hello Bundle")
@Service(value = RepositoryService.class)
public class RepositoryServiceImpl implements RepositoryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RepositoryServiceImpl.class);

    @Reference
    private Repository repository;


    @Override
    public String getRepositoryName() {
        return repository.getDescriptor(Repository.REP_NAME_DESC);

    }

    @Activate
    protected void activate() {
        LOGGER.info("service activated"); }

    @Deactivate
    protected void deactivate() {
        LOGGER.info ("service deactivated"); }

}
