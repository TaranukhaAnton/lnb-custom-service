package com.igt.service;

import com.igt.model.dto.NotificationRequest;
import com.sun.xml.internal.bind.v2.runtime.MarshallerImpl;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.OutputStream;
import java.io.Writer;

@Service
public class XmlTransformerImpl implements  XmlTransformer {
    @Override
    public void transform(NotificationRequest request, OutputStream os) throws JAXBException {
        JAXBContext ctx = JAXBContext.newInstance(NotificationRequest.class);
        MarshallerImpl m = (MarshallerImpl)ctx.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        m.setProperty("jaxb.schemaLocation", "http://schemas.lonalo.local/BizTalk/2015/services/notification/notification.xsd");
        m.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);
        m.setProperty("com.sun.xml.internal.bind.xmlHeaders",
                "<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        m.marshal(request, System.out);
    }
}
