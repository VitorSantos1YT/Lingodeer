package com.google.firebase.auth.internal;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.p002firebaseauthapi.zzzx;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import y.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f17970a = new Logger("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            Object objC = jSONArray.get(i11);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map b(String str) {
        Preconditions.d(str);
        List listC = com.google.android.gms.internal.p002firebaseauthapi.zzt.b('.').c(str);
        if (listC.size() < 2) {
            f17970a.b("Invalid idToken ".concat(str), new Object[0]);
            return new HashMap();
        }
        String str2 = (String) listC.get(1);
        e eVarD = d(new String(str2 == null ? null : Base64.decode(str2, 11), StandardCharsets.UTF_8));
        return eVarD == null ? new HashMap() : eVarD;
    }

    public static e c(JSONObject jSONObject) throws JSONException {
        e eVar = new e(0);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            eVar.put(next, objC);
        }
        return eVar;
    }

    public static e d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e8) {
            throw new zzzx(e8);
        }
    }
}
