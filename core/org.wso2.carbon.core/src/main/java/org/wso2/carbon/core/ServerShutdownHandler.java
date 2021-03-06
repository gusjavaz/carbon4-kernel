/*
 * Copyright 2004,2005 The Apache Software Foundation.
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
package org.wso2.carbon.core;

/**
 * Any specific things that need to be done before the server is shutdown should be handled by an
 * implementation of this interface. Please note that this interface is not intended for doing
 * cleaning up on bundle deactivation. That should be done within each respective bundle.
 *
 * Any pre-shutdown work that needs to be done, can be registered as an implementation of this
 * interface
 */
public interface ServerShutdownHandler {

    void invoke();
}
