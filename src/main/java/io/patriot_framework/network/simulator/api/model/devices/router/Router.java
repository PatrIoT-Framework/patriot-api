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

package io.patriot_framework.network.simulator.api.model.devices.router;

import io.patriot_framework.network.simulator.api.model.devices.Device;

import java.util.List;

public interface Router extends Device {
    /**
     * Returns physical network interfaces of router.
     * @return list of connected interfaces
     */
    List<NetworkInterface> getInterfaces();
    void setNetworkInterfaces(List<NetworkInterface> networkInterfaces);


    /**
     * Returns if this router is last step to internet in current LAN.
     * @return true if router is on border, false otherwise
     */
    Boolean isCorner();

}
