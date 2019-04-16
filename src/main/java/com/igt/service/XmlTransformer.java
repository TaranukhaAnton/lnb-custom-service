package com.igt.service;

import com.igt.model.dto.NotificationRequest;

import javax.xml.bind.JAXBException;
import java.io.OutputStream;

public interface XmlTransformer {

    void transform(NotificationRequest request, OutputStream os) throws JAXBException;
}
