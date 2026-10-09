package com.google.firebase.appcheck.internal.util;

import android.text.TextUtils;
import android.util.Base64;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.internal.Preconditions;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class TokenParser {
    public static Map a(String str) {
        Preconditions.d(str);
        String[] strArrSplit = str.split("\\.", -1);
        if (strArrSplit.length < 2) {
            return Collections.EMPTY_MAP;
        }
        try {
            String str2 = new String(Base64.decode(strArrSplit[1], 11), Constants.ENCODING);
            Map mapC = null;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    if (jSONObject != JSONObject.NULL) {
                        mapC = c(jSONObject);
                    }
                } catch (Exception e8) {
                    e8.toString();
                    mapC = Collections.EMPTY_MAP;
                }
            }
            return mapC == null ? Collections.EMPTY_MAP : mapC;
        } catch (UnsupportedEncodingException e10) {
            e10.toString();
            return Collections.EMPTY_MAP;
        }
    }

    public static ArrayList b(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            Object objC = jSONArray.get(i11);
            if (objC instanceof JSONArray) {
                objC = b((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static e c(JSONObject jSONObject) throws JSONException {
        e eVar = new e(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = b((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            } else if (objC.equals(JSONObject.NULL)) {
                objC = null;
            }
            eVar.put(next, objC);
        }
        return eVar;
    }
}
