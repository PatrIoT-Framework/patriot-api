/*
 * Copyright 2019 Patriot project
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.patriot_framework.network.simulator.api.manager;

import io.patriot_framework.network.simulator.api.model.MainTopology;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

/**
 * Manager is used for managing topology (deploying, destroying).
 */
public class Manager {
    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    private Set<TopologyManager> topologyManagers = new HashSet<>();
    private MainTopology mainTopology;


    public void deployMainTopology(MainTopology mainTopology) {
        mainTopology
                .getTopologies()
                .forEach((topology, manager) -> manager.deployTopology(topology));
    }

    public void cleanUpMainTopology(MainTopology mainTopology) {
        mainTopology
                .getTopologies()
                .forEach((topology, manager) -> manager.cleanUp(topology));
    }


}