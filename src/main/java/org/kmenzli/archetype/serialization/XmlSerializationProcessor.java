package org.kmenzli.archetype.serialization;

import com.strategicgains.hyperexpress.domain.Link;
import com.strategicgains.hyperexpress.domain.LinkableCollection;
import org.kmenzli.archetype.domain.Sample;
import com.strategicgains.restexpress.serialization.xml.DefaultXmlProcessor;

public class XmlSerializationProcessor
extends DefaultXmlProcessor
{
	public XmlSerializationProcessor()
    {
	    super();
	    alias("sample", Sample.class);
		alias("link", Link.class);
		alias("collection", LinkableCollection.class);
//		alias("element_name", Element.class);
//		alias("element_name", Element.class);
//		alias("element_name", Element.class);
//		alias("element_name", Element.class);
		registerConverter(new XstreamObjectIdConverter());
    }
}
