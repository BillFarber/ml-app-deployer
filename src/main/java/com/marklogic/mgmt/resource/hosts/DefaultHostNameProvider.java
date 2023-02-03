/*
 * Copyright (c) 2023 MarkLogic Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.marklogic.mgmt.resource.hosts;

import com.marklogic.mgmt.ManageClient;
import com.marklogic.mgmt.resource.groups.GroupManager;

import java.util.List;

public class DefaultHostNameProvider implements HostNameProvider {

	private ManageClient manageClient;

	public DefaultHostNameProvider(ManageClient manageClient) {
		this.manageClient = manageClient;
	}

	@Override
	public List<String> getHostNames() {
		return new HostManager(manageClient).getHostNames();
	}

	@Override
	public List<String> getGroupHostNames(String groupName) {
		return new GroupManager(manageClient).getHostNames(groupName);
	}
}
