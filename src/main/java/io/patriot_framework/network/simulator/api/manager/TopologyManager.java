/*
 * Copyright 2021 Patriot project
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


import io.patriot_framework.network.simulator.api.model.Topology;

/**
 * TopologyManager is an interface that defines common methods for each TopologyManager implementations (docker, kubernetes...)
 */
public interface TopologyManager {

    /**
     * Deploys the topology to simulation.
     *
     * @param topology Topology which will be deployed.
     */
    void deployTopology(Topology topology);

    /**
     * Cleans up the topology from the simulation.
     *
     * @param topology Topology which will be cleaned up.
     */
    void cleanUp(Topology topology);
}
