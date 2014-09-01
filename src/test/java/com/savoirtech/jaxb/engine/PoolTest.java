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

import java.io.StringWriter;
import java.util.concurrent.CountDownLatch;
import javax.xml.bind.JAXBException;
import junit.framework.TestCase;

import com.savoirtech.jaxb.engine.JaxbEngineProvider;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PoolTest extends TestCase {

    private static final Logger LOG = LoggerFactory.getLogger(PoolTest.class);
    private JaxbEngineProvider provider;
    private CountDownLatch latch = new CountDownLatch(50);

    @Before
    public void setUp() {
       //provider = new JaxbEngineProvider("com.savoirtech.common.messages");
    }

    @Test
    public void testMarshallingAndUnmarshalling() throws JAXBException {

        StringWriter sw = new StringWriter();

        //provider.marshal(item, sw);
        //System.out.print(sw.toString());

        //Reader reader = new StringReader(sw.toString());

        //assertTrue(provider.unmarshal(reader) != null);

        //reader = new StringReader(sw.toString());

        //assertTrue(provider.unmarshal(reader) instanceof AvailabilityChange);
    }
}
