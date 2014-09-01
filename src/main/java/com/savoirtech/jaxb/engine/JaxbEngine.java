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

public interface JaxbEngine {

    /**
     * @return a JAXBContext with all classes
     */
    public JAXBContext getContext();

    void marshal(Object o, javax.xml.transform.Result result) throws javax.xml.bind.JAXBException;

    void marshal(Object o, java.io.OutputStream outputStream) throws javax.xml.bind.JAXBException;

    void marshal(Object o, java.io.File file) throws javax.xml.bind.JAXBException;

    void marshal(Object o, java.io.Writer writer) throws javax.xml.bind.JAXBException;

    void marshal(Object o, org.xml.sax.ContentHandler contentHandler) throws javax.xml.bind.JAXBException;

    void marshal(Object o, org.w3c.dom.Node node) throws javax.xml.bind.JAXBException;

    void marshal(Object o, javax.xml.stream.XMLStreamWriter xmlStreamWriter) throws javax.xml.bind.JAXBException;

    void marshal(Object o, javax.xml.stream.XMLEventWriter xmlEventWriter) throws javax.xml.bind.JAXBException;

    //UnMarshalling stuff

    Object unmarshal(java.io.File file) throws javax.xml.bind.JAXBException;

    Object unmarshal(java.io.InputStream inputStream) throws javax.xml.bind.JAXBException;

    Object unmarshal(java.io.Reader reader) throws javax.xml.bind.JAXBException;

    Object unmarshal(java.net.URL url) throws javax.xml.bind.JAXBException;

    Object unmarshal(org.xml.sax.InputSource inputSource) throws javax.xml.bind.JAXBException;

    Object unmarshal(org.w3c.dom.Node node) throws javax.xml.bind.JAXBException;

    <T> javax.xml.bind.JAXBElement<T> unmarshal(org.w3c.dom.Node node, Class<T> tClass) throws javax.xml.bind.JAXBException;

    Object unmarshal(javax.xml.transform.Source source) throws javax.xml.bind.JAXBException;

    <T> javax.xml.bind.JAXBElement<T> unmarshal(javax.xml.transform.Source source, Class<T> tClass) throws javax.xml.bind.JAXBException;

    Object unmarshal(javax.xml.stream.XMLStreamReader xmlStreamReader) throws javax.xml.bind.JAXBException;

    <T> javax.xml.bind.JAXBElement<T> unmarshal(javax.xml.stream.XMLStreamReader xmlStreamReader, Class<T> tClass) throws javax.xml.bind.JAXBException;

    Object unmarshal(javax.xml.stream.XMLEventReader xmlEventReader) throws javax.xml.bind.JAXBException;

    <T> javax.xml.bind.JAXBElement<T> unmarshal(javax.xml.stream.XMLEventReader xmlEventReader, Class<T> tClass) throws javax.xml.bind.JAXBException;

    public Class[] getContextClasses();


}
