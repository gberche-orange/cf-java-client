/*
 * Copyright 2013-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.cloudfoundry.client.v3;

import org.cloudfoundry.AbstractIntegrationTest;
import org.cloudfoundry.client.CloudFoundryClient;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeoutException;

public final class IsolationSegmentsTest extends AbstractIntegrationTest {

    @Autowired
    private CloudFoundryClient cloudFoundryClient;

    //TODO: Await 1.10 test environment
    @Ignore("Await 1.10 test environment")
    @Test
    public void create() throws TimeoutException, InterruptedException {
        //
    }

    //TODO: Await 1.10 test environment
    @Ignore("Await 1.10 test environment")
    @Test
    public void delete() throws TimeoutException, InterruptedException {
        //
    }

    //TODO: Await 1.10 test environment
    @Ignore("Await 1.10 test environment")
    @Test
    public void get() throws TimeoutException, InterruptedException {
        //
    }

    //TODO: Await 1.10 test environment
    @Ignore("Await 1.10 test environment")
    @Test
    public void list() throws TimeoutException, InterruptedException {
        //
    }

    //TODO: Await 1.10 test environment
    @Ignore("Await 1.10 test environment")
    @Test
    public void listFilterById() throws TimeoutException, InterruptedException {
        //
    }

    //TODO: Await 1.10 test environment
    @Ignore("Await 1.10 test environment")
    @Test
    public void listFilterByName() throws TimeoutException, InterruptedException {
        //
    }

    //TODO: Await 1.10 test environment
    @Ignore("Await 1.10 test environment")
    @Test
    public void listFilterByOrganizationId() throws TimeoutException, InterruptedException {
        //
    }

    //TODO: Await 1.10 test environment
    @Ignore("Await 1.10 test environment")
    @Test
    public void update() throws TimeoutException, InterruptedException {
        //
    }

}