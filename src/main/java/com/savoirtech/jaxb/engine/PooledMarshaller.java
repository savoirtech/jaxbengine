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

import java.io.File;
import java.io.OutputStream;
import java.io.Writer;
import javax.xml.bind.Marshaller;
import javax.xml.stream.XMLEventWriter;
import javax.xml.stream.XMLStreamWriter;
import javax.xml.transform.Result;
import org.w3c.dom.Node;
import org.xml.sax.ContentHandler;

import org.apache.commons.pool.ObjectPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PooledMarshaller {
    private static final Logger LOG = LoggerFactory.getLogger(PooledMarshaller.class);
    private ObjectPool pool;

    public PooledMarshaller(ObjectPool pool) {
        this.pool = pool;
    }

    public void marshal(Object o, OutputStream os) {

        Marshaller marshaller = null;
        try {
            marshaller = (Marshaller) (pool.borrowObject());
            marshaller.marshal(o, os);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != marshaller) {
                    pool.returnObject(marshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }

    public void marshal(Object o, Result res) {

        Marshaller marshaller = null;
        try {
            marshaller = (Marshaller) (pool.borrowObject());
            marshaller.marshal(o, res);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != marshaller) {
                    pool.returnObject(marshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }

    public void marshal(Object o, File file) {

        Marshaller marshaller = null;
        try {
            marshaller = (Marshaller) (pool.borrowObject());
            marshaller.marshal(o, file);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != marshaller) {
                    pool.returnObject(marshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }

    public void marshal(Object o, Writer writer) {

        Marshaller marshaller = null;
        try {
            marshaller = (Marshaller) (pool.borrowObject());
            marshaller.marshal(o, writer);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != marshaller) {
                    pool.returnObject(marshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }

    public void marshal(Object o, ContentHandler contentHandler) {

        Marshaller marshaller = null;
        try {
            marshaller = (Marshaller) (pool.borrowObject());
            marshaller.marshal(o, contentHandler);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != marshaller) {
                    pool.returnObject(marshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }

    public void marshal(Object o, Node node) {

        Marshaller marshaller = null;
        try {
            marshaller = (Marshaller) (pool.borrowObject());
            marshaller.marshal(o, node);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != marshaller) {
                    pool.returnObject(marshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }

    public void marshal(Object o, XMLStreamWriter xmlStreamWriter) {

        Marshaller marshaller = null;
        try {
            marshaller = (Marshaller) (pool.borrowObject());
            marshaller.marshal(o, xmlStreamWriter);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != marshaller) {
                    pool.returnObject(marshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }

    public void marshal(Object o, XMLEventWriter xmlEventWriter) {

        Marshaller marshaller = null;
        try {
            marshaller = (Marshaller) (pool.borrowObject());
            marshaller.marshal(o, xmlEventWriter);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != marshaller) {
                    pool.returnObject(marshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
    }
}
