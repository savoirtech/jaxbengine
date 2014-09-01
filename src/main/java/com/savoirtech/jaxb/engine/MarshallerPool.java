/*
 * Copyright (c) 2012-2014 Savoir Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.savoirtech.jaxb.engine;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.apache.commons.pool.BasePoolableObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MarshallerPool extends BasePoolableObjectFactory {

    private static final Logger LOG = LoggerFactory.getLogger(MarshallerPool.class);
    private JAXBContext context;

    public MarshallerPool(JAXBContext context) {
        this.context = context;
    }

    @Override
    public Object makeObject() throws Exception {
        LOG.debug("Creating a new marshaller");
        Marshaller marshaller = context.createMarshaller();
        marshaller.setEventHandler(new ValidationChecker());
        marshaller.setProperty("jaxb.encoding", "UTF-8");
        return marshaller;
    }
}
