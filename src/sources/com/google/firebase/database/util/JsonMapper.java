package com.google.firebase.database.util;

import aj.uZCn.evRpcb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class JsonMapper {
    public static HashMap a(String str) throws IOException {
        try {
            return e(new JSONObject(str));
        } catch (JSONException e8) {
            throw new IOException(e8);
        }
    }

    public static void c(Object obj, JSONStringer jSONStringer) throws JSONException {
        if (obj instanceof Map) {
            jSONStringer.object();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                jSONStringer.key((String) entry.getKey());
                c(entry.getValue(), jSONStringer);
            }
            jSONStringer.endObject();
            return;
        }
        if (!(obj instanceof Collection)) {
            jSONStringer.value(obj);
            return;
        }
        jSONStringer.array();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            c(it.next(), jSONStringer);
        }
        jSONStringer.endArray();
    }

    public static Object d(Object obj) {
        if (obj instanceof JSONObject) {
            return e((JSONObject) obj);
        }
        if (!(obj instanceof JSONArray)) {
            if (obj.equals(JSONObject.NULL)) {
                return null;
            }
            return obj;
        }
        JSONArray jSONArray = (JSONArray) obj;
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(d(jSONArray.get(i11)));
        }
        return arrayList;
    }

    public static HashMap e(JSONObject jSONObject) {
        HashMap map = new HashMap(jSONObject.length());
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            map.put(next, d(jSONObject.get(next)));
        }
        return map;
    }

    public static String b(Object obj) throws IOException {
        if (obj == null) {
            return evRpcb.LwTILJexPGoU;
        }
        if (obj instanceof String) {
            return JSONObject.quote((String) obj);
        }
        if (obj instanceof Number) {
            try {
                return JSONObject.numberToString((Number) obj);
            } catch (JSONException e8) {
                throw new IOException("Could not serialize number", e8);
            }
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        try {
            JSONStringer jSONStringer = new JSONStringer();
            c(obj, jSONStringer);
            return jSONStringer.toString();
        } catch (JSONException e10) {
            throw new IOException("Failed to serialize JSON", e10);
        }
    }
}
