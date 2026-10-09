package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class NotificationParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f20502a;

    public NotificationParams(Bundle bundle) {
        if (bundle == null) {
            throw new NullPointerException("data");
        }
        this.f20502a = new Bundle(bundle);
    }

    public static boolean j(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void l(String str) {
        if (str.startsWith("gcm.n.")) {
            str.substring(6);
        }
    }

    public final boolean a(String str) {
        String strH = h(str);
        return "1".equals(strH) || Boolean.parseBoolean(strH);
    }

    public final Integer b(String str) {
        String strH = h(str);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strH));
        } catch (NumberFormatException unused) {
            l(str);
            return null;
        }
    }

    public final JSONArray c(String str) {
        String strH = h(str);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        try {
            return new JSONArray(strH);
        } catch (JSONException unused) {
            l(str);
            return null;
        }
    }

    public final int[] d() {
        JSONArray jSONArrayC = c("gcm.n.light_settings");
        if (jSONArrayC == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayC.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayC.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayC.optInt(1);
            iArr[2] = jSONArrayC.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e8) {
            jSONArrayC.toString();
            e8.getMessage();
            return null;
        } catch (JSONException unused) {
            jSONArrayC.toString();
            return null;
        }
    }

    public final Object[] e(String str) {
        JSONArray jSONArrayC = c(str.concat("_loc_args"));
        if (jSONArrayC == null) {
            return null;
        }
        int length = jSONArrayC.length();
        String[] strArr = new String[length];
        for (int i11 = 0; i11 < length; i11++) {
            strArr[i11] = jSONArrayC.optString(i11);
        }
        return strArr;
    }

    public final String f(String str) {
        return h(str.concat("_loc_key"));
    }

    public final String g(Resources resources, String str, String str2) {
        String strH = h(str2);
        if (!TextUtils.isEmpty(strH)) {
            return strH;
        }
        String strF = f(str2);
        if (TextUtils.isEmpty(strF)) {
            return null;
        }
        int identifier = resources.getIdentifier(strF, "string", str);
        if (identifier == 0) {
            l(str2.concat("_loc_key"));
            return null;
        }
        Object[] objArrE = e(str2);
        if (objArrE == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrE);
        } catch (MissingFormatArgumentException unused) {
            l(str2);
            Arrays.toString(objArrE);
            return null;
        }
    }

    public final String h(String str) {
        Bundle bundle = this.f20502a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public final long[] i() {
        JSONArray jSONArrayC = c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            return null;
        }
        try {
            if (jSONArrayC.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayC.length();
            long[] jArr = new long[length];
            for (int i11 = 0; i11 < length; i11++) {
                jArr[i11] = jSONArrayC.optLong(i11);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            jSONArrayC.toString();
            return null;
        }
    }

    public final Bundle k() {
        Bundle bundle = this.f20502a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }
}
