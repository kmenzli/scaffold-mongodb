package org.kmenzli.archetype.serialization;

import java.io.IOException;

import org.bson.types.ObjectId;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class ObjectIdDeserializer
extends JsonDeserializer<ObjectId>
{
	@Override
	public ObjectId deserialize(JsonParser json, DeserializationContext context)
	throws IOException, JsonProcessingException
	{
		return new ObjectId(json.getText());
	}
}
