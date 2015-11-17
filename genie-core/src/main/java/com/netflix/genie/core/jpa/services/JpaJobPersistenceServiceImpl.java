/*
 *
 *  Copyright 2015 Netflix, Inc.
 *
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */
package com.netflix.genie.core.jpa.services;

import com.netflix.genie.common.dto.Job;

import com.netflix.genie.common.exceptions.GenieException;
import com.netflix.genie.core.services.JobPersistenceService;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

/**
 * JPA implementation of the job persistence service.
 *
 * @author amsharma
 */
@Service
public class JpaJobPersistenceServiceImpl implements JobPersistenceService {
    /**
     * Get job information for given job id.
     *
     * @param id id of job to look up
     * @return the job
     * @throws GenieException if there is an error
     */
    @Override
    public Job getJob(
            @NotBlank(message = "No id entered. Unable to get job.")
            final String id
    ) throws GenieException {
        return null;
    }

    /**
     * Save the job object in the data store.
     *
     * @param job the Job object to save
     * @throws GenieException if there is an error
     */
    @Override
    public void saveJob(
            @NotNull(message = "Job is null so cannot be saved")
            final Job job
    ) throws GenieException {

    }
}