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

package io.patriot_framework.network.simulator.api.model;

import io.patriot_framework.network.simulator.api.manager.TopologyManager;

import java.util.Hashtable;

/**
 * Class representing main topology that consists of collection of topologies (with topology managers) deployed inside various environments (docker, kubernetes...)
 */
public class MainTopology {
    private Hashtable<Topology, TopologyManager> topologies;

    public Hashtable<Topology, TopologyManager> getTopologies() {
        return topologies;
    }

    public void setTopologies(Hashtable<Topology, TopologyManager> topologies) {
        this.topologies = topologies;
    }

    public void addTopology(Topology topology, TopologyManager manager) {
        topologies.put(topology, manager);
    }
}
