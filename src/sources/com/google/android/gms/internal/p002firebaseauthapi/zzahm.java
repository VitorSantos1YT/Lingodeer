package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.util.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzahm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9981a;

    public zzahm() {
        this.f9981a = new ArrayList();
    }

    public static zzahm a(JSONArray jSONArray) throws JSONException {
        zzahj zzahjVar;
        if (jSONArray == null || jSONArray.length() == 0) {
            return new zzahm(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i11);
            if (jSONObject == null) {
                zzahjVar = new zzahj();
            } else {
                String strA = Strings.a(jSONObject.optString("federatedId"));
                String strA2 = Strings.a(jSONObject.optString("displayName"));
                String strA3 = Strings.a(jSONObject.optString("photoUrl"));
                String strA4 = Strings.a(jSONObject.optString("providerId"));
                String strA5 = Strings.a(jSONObject.optString("phoneNumber"));
                String strA6 = Strings.a(jSONObject.optString("email"));
                zzahj zzahjVar2 = new zzahj();
                zzahjVar2.f9969a = strA;
                zzahjVar2.f9970b = strA2;
                zzahjVar2.f9971c = strA3;
                zzahjVar2.f9972d = strA4;
                zzahjVar2.f9973e = null;
                zzahjVar2.f9974f = strA5;
                zzahjVar2.f9975g = strA6;
                zzahjVar = zzahjVar2;
            }
            arrayList.add(zzahjVar);
        }
        return new zzahm(arrayList);
    }

    public zzahm(ArrayList arrayList) {
        if (!arrayList.isEmpty()) {
            this.f9981a = Collections.unmodifiableList(arrayList);
        } else {
            this.f9981a = Collections.EMPTY_LIST;
        }
    }
}
