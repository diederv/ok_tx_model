package com.okit.client.ticket;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

public class CalendarGsonAdapter extends TypeAdapter<Calendar> {
	
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");		

    @Override
    public void write(JsonWriter out, Calendar src) throws IOException {
        if (src == null) {
            out.nullValue();
            return;
        }         
        out.value(format.format(src.getTime()));
    }

    @Override
    public Calendar read(JsonReader in) throws IOException {
        throw new IllegalStateException("Gson Calendar reader not implemented");
    }
    
}
