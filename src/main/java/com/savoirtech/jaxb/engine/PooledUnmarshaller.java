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
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import javax.xml.bind.Unmarshaller;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLStreamReader;
import javax.xml.transform.Source;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

import org.apache.commons.pool.ObjectPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PooledUnmarshaller {
    
    private static final Logger LOG = LoggerFactory.getLogger(PooledUnmarshaller.class);

    private ObjectPool pool;

    public PooledUnmarshaller(ObjectPool pool) {
        this.pool = pool;
    }

    public Object unmarshal(File file) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(file);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public Object unmarshal(InputStream inputStream) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(inputStream);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public Object unmarshal(Reader reader) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(reader);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public Object unmarshal(URL url) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(url);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public Object unmarshal(InputSource inputSource) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(inputSource);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public Object unmarshal(Node node) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(node);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public <T> javax.xml.bind.JAXBElement<T> unmarshal(Node node, Class<T> tClass) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(node, tClass);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public Object unmarshal(Source source) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(source);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public <T> javax.xml.bind.JAXBElement<T> unmarshal(Source source, Class<T> tClass) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(source, tClass);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public Object unmarshal(XMLStreamReader xmlStreamReader) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(xmlStreamReader);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public <T> javax.xml.bind.JAXBElement<T> unmarshal(XMLStreamReader xmlStreamReader, Class<T> tClass) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(xmlStreamReader, tClass);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public Object unmarshal(XMLEventReader xmlEventReader) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(xmlEventReader);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }

    public <T> javax.xml.bind.JAXBElement<T> unmarshal(XMLEventReader xmlEventReader, Class<T> tClass) {
        Unmarshaller unMarshaller = null;
        try {
            unMarshaller = (Unmarshaller) (pool.borrowObject());
            return unMarshaller.unmarshal(xmlEventReader, tClass);
        } catch (Exception e) {
            LOG.error("Could not marshal code ", e);
        } finally {
            try {
                if (null != unMarshaller) {
                    pool.returnObject(unMarshaller);
                }
            } catch (Exception e) {
                // ignored
            }
        }
        return null;
    }
}
