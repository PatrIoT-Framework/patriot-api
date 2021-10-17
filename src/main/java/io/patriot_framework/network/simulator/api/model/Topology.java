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

import io.patriot_framework.network.simulator.api.model.devices.Device;
import io.patriot_framework.network.simulator.api.model.network.Network;

import java.util.Collection;

/**
 * Interface representing the network topology of simulation.
 */
public interface Topology {

    /**
     * Getter for devices that are running inside the topology.
     * @return devices
     */
    Collection<Device> getDevices();

    /**
     * Setter for devices that are running inside the topology.
     */
    void setDevices(Collection<Device> devices);

    /**
     * Getter for networks that are part of the topology.
     * @return networks
     */
    Collection<Network> getNetworks();

    /**
     * Setter for networks that are part of the topology.
     */
    void setNetworks(Collection<Network> networks);

    /**
     * Adds single devices to the devices that are deployed inside the topology.
     * @param device device to add
     */
    void addDevice(Device device);

    /**
     * Adds single networks to the networks that are part of the topology.
     * @param network network to add
     */
    void addNetwork(Network network);
}
