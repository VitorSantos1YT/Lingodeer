package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaht implements zzaei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f9986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzaii f9987b = new zzaii();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zzaii f9988c = new zzaii();

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaei
    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("returnSecureToken", true);
        zzaii zzaiiVar = this.f9988c;
        if (!zzaiiVar.f10009a.isEmpty()) {
            List list = zzaiiVar.f10009a;
            JSONArray jSONArray = new JSONArray();
            for (int i11 = 0; i11 < list.size(); i11++) {
                jSONArray.put(list.get(i11));
            }
            jSONObject.put("deleteProvider", jSONArray);
        }
        List list2 = this.f9987b.f10009a;
        int size = list2.size();
        int[] iArr = new int[size];
        for (int i12 = 0; i12 < list2.size(); i12++) {
            String str = (String) list2.get(i12);
            str.getClass();
            int i13 = 2;
            switch (str) {
                case "DISPLAY_NAME":
                    break;
                case "EMAIL":
                    i13 = 1;
                    break;
                case "PHOTO_URL":
                    i13 = 4;
                    break;
                case "PASSWORD":
                    i13 = 5;
                    break;
                default:
                    i13 = 0;
                    break;
            }
            iArr[i12] = i13;
        }
        if (size > 0) {
            JSONArray jSONArray2 = new JSONArray();
            for (int i14 = 0; i14 < size; i14++) {
                jSONArray2.put(iArr[i14]);
            }
            jSONObject.put("deleteAttribute", jSONArray2);
        }
        String str2 = this.f9986a;
        if (str2 != null) {
            jSONObject.put("idToken", str2);
        }
        return jSONObject.toString();
    }
}
