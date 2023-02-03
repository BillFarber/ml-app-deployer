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
package com.marklogic.appdeployer.scaffold;

import com.marklogic.appdeployer.ConfigDir;
import com.marklogic.mgmt.api.Resource;

import java.io.File;

/**
 * Interface for objects that can write a Resource object to the appropriate directory within the given ConfigDir.
 */
public interface ResourceWriter {

	File writeResourceAsJson(Resource r, ConfigDir configDir);

	/**
	 * This isn't well-supported yet because most Resource subclasses don't yet have JAXB annotations on them.
	 *
	 * @param r
	 * @param configDir
	 * @return
	 */
	File writeResourceAsXml(Resource r, ConfigDir configDir);

}
