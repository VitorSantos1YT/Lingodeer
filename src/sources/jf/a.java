package jf;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import okhttp3.internal.platform.ZjS.OYAvlbfUyD;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import oz.q;
import qy.l;
import re.s;
import re.v;
import re.y;
import ry.x;
import we.h;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f36309a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Object f36310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Object f36311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Object f36312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static JSONObject f36313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f36314f;

    public static final boolean a(String str, String str2) {
        HashSet hashSet = f.f36329e;
        b bVar = b.f36315a;
        String str3 = null;
        if (!qf.a.b(b.class)) {
            try {
                LinkedHashMap linkedHashMap = b.f36316b;
                if (linkedHashMap.containsKey(str)) {
                    str3 = (String) linkedHashMap.get(str);
                }
            } catch (Throwable th2) {
                qf.a.a(b.class, th2);
            }
        }
        if (str3 == null) {
            return false;
        }
        if (!str3.equals("other")) {
            try {
                s.d().execute(new b2.c(24, str3, str2));
            } catch (Exception unused) {
            }
        }
        return true;
    }

    public static void b(View hostView, View view, String str) {
        HashSet hashSet;
        Field declaredField;
        Field declaredField2;
        Object obj;
        m.f(hostView, "hostView");
        int iHashCode = hostView.hashCode();
        HashSet hashSet2 = f.f36329e;
        HashSet hashSet3 = null;
        if (qf.a.b(f.class)) {
            hashSet = null;
        } else {
            try {
                hashSet = f.f36329e;
            } catch (Throwable th2) {
                qf.a.a(f.class, th2);
                hashSet = null;
            }
        }
        if (hashSet.contains(Integer.valueOf(iHashCode))) {
            return;
        }
        f fVar = new f(hostView, view, str);
        if (!qf.a.b(h.class)) {
            try {
                try {
                    declaredField = Class.forName("android.view.View").getDeclaredField("mListenerInfo");
                    try {
                        declaredField2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        declaredField2 = null;
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    declaredField = null;
                }
                if (declaredField == null || declaredField2 == null) {
                    hostView.setOnClickListener(fVar);
                } else {
                    declaredField.setAccessible(true);
                    declaredField2.setAccessible(true);
                    try {
                        declaredField.setAccessible(true);
                        obj = declaredField.get(hostView);
                    } catch (IllegalAccessException unused3) {
                        obj = null;
                    }
                    if (obj == null) {
                        hostView.setOnClickListener(fVar);
                    } else {
                        declaredField2.set(obj, fVar);
                    }
                }
            } catch (Exception unused4) {
            } catch (Throwable th3) {
                qf.a.a(h.class, th3);
            }
        }
        if (!qf.a.b(f.class)) {
            try {
                hashSet3 = f.f36329e;
            } catch (Throwable th4) {
                qf.a.a(f.class, th4);
            }
        }
        hashSet3.add(Integer.valueOf(iHashCode));
    }

    public static final float[] c(JSONObject jSONObject, String str) {
        if (!qf.a.b(a.class)) {
            try {
                if (f36314f) {
                    float[] fArr = new float[30];
                    for (int i11 = 0; i11 < 30; i11++) {
                        fArr[i11] = 0.0f;
                    }
                    try {
                        String lowerCase = str.toLowerCase();
                        m.e(lowerCase, "this as java.lang.String).toLowerCase()");
                        JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                        String screenName = jSONObject.optString("screenname");
                        JSONArray jSONArray = new JSONArray();
                        a aVar = f36309a;
                        aVar.k(jSONObject2, jSONArray);
                        aVar.n(fArr, aVar.i(jSONObject2));
                        JSONObject jSONObjectD = aVar.d(jSONObject2);
                        if (jSONObjectD != null) {
                            m.e(screenName, "screenName");
                            String string = jSONObject2.toString();
                            m.e(string, "viewTree.toString()");
                            aVar.n(fArr, aVar.h(jSONObjectD, jSONArray, screenName, string, lowerCase));
                            return fArr;
                        }
                    } catch (JSONException unused) {
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(a.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final String e(String buttonText, String activityName, String str) {
        if (qf.a.b(a.class)) {
            return null;
        }
        try {
            m.f(buttonText, "buttonText");
            m.f(activityName, "activityName");
            String lowerCase = (str + " | " + activityName + ", " + buttonText).toLowerCase();
            m.e(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            qf.a.a(a.class, th2);
            return null;
        }
    }

    public static final void f(File file) {
        if (qf.a.b(a.class)) {
            return;
        }
        try {
            try {
                f36313e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f36313e = new JSONObject(new String(bArr, oz.a.f46133a));
                f36310b = x.Y(new l("ENGLISH", "1"), new l("GERMAN", "2"), new l("SPANISH", "3"), new l("JAPANESE", "4"));
                f36311c = x.Y(new l("VIEW_CONTENT", "0"), new l("SEARCH", "1"), new l("ADD_TO_CART", "2"), new l("ADD_TO_WISHLIST", "3"), new l("INITIATE_CHECKOUT", "4"), new l("ADD_PAYMENT_INFO", "5"), new l("PURCHASE", "6"), new l("LEAD", "7"), new l("COMPLETE_REGISTRATION", "8"));
                f36312d = x.Y(new l("BUTTON_TEXT", "1"), new l("PAGE_TITLE", "2"), new l("RESOLVED_DOCUMENT_LINK", "3"), new l("BUTTON_ID", "4"));
                f36314f = true;
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            qf.a.a(a.class, th2);
        }
    }

    public static void j(String event, String str, float[] fArr) {
        boolean zContains;
        boolean zContains2;
        d dVar = d.f36321a;
        if (qf.a.b(d.class)) {
            zContains = false;
        } else {
            try {
                m.f(event, "event");
                zContains = d.f36323c.contains(event);
            } catch (Throwable th2) {
                qf.a.a(d.class, th2);
                zContains = false;
            }
        }
        if (zContains) {
            se.m mVar = new se.m(s.a(), (String) null);
            if (qf.a.b(mVar)) {
                return;
            }
            try {
                Bundle bundle = new Bundle();
                bundle.putString("_is_suggested_event", "1");
                bundle.putString("_button_text", str);
                mVar.d(event, bundle);
                return;
            } catch (Throwable th3) {
                qf.a.a(mVar, th3);
                return;
            }
        }
        if (qf.a.b(d.class)) {
            zContains2 = false;
        } else {
            try {
                m.f(event, "event");
                zContains2 = d.f36324d.contains(event);
            } catch (Throwable th4) {
                qf.a.a(d.class, th4);
                zContains2 = false;
            }
        }
        if (zContains2) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putString("event_name", event);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float f5 : fArr) {
                    sb2.append(f5);
                    sb2.append(",");
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str);
                bundle2.putString("metadata", jSONObject.toString());
                String str2 = y.f49225j;
                y yVarC = v.C(null, String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{s.b()}, 1)), null, null);
                yVarC.f49231d = bundle2;
                yVarC.c();
            } catch (JSONException unused) {
            }
        }
    }

    public JSONObject d(JSONObject jSONObject) {
        if (!qf.a.b(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return jSONObject;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i11);
                        m.e(jSONObject2, "children.getJSONObject(i)");
                        JSONObject jSONObjectD = d(jSONObject2);
                        if (jSONObjectD != null) {
                            return jSONObjectD;
                        }
                    }
                }
            } catch (JSONException unused) {
            } catch (Throwable th2) {
                qf.a.a(this, th2);
            }
        }
        return null;
    }

    public boolean g(String[] strArr, String[] strArr2) {
        if (!qf.a.b(this)) {
            try {
                for (String str : strArr) {
                    for (String str2 : strArr2) {
                        if (q.v0(str2, str, false)) {
                            return true;
                        }
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00df  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x010c  */
    /* JADX WARN: Code duplicated, block: B:59:0x010e  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:63:0x011d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:75:0x0146  */
    /* JADX WARN: Code duplicated, block: B:78:0x0153  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:82:0x0160  */
    /* JADX WARN: Code duplicated, block: B:83:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x016d  */
    public float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float[] fArr;
        float f5;
        String str4;
        String string;
        String string2;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f21;
        float f22;
        float f23;
        float[] fArr2 = null;
        if (qf.a.b(this)) {
            return null;
        }
        try {
            float[] fArr3 = new float[30];
            int i11 = 0;
            while (true) {
                f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                if (i11 >= 30) {
                    break;
                }
                fArr3[i11] = 0.0f;
                i11++;
                qf.a.a(this, th);
                return fArr;
            }
            int length = jSONArray.length();
            boolean z11 = true;
            fArr3[3] = length > 1 ? length - 1.0f : 0.0f;
            try {
                int length2 = jSONArray.length();
                int i12 = 0;
                while (i12 < length2) {
                    fArr = fArr2;
                    try {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i12);
                            boolean z12 = z11;
                            m.e(jSONObject2, "siblings.getJSONObject(i)");
                            if (!qf.a.b(this)) {
                                try {
                                    if (((jSONObject2.optInt("classtypebitmask") & 1) << 5) > 0) {
                                        fArr3[9] = fArr3[9] + 1.0f;
                                    }
                                } catch (Throwable th2) {
                                    qf.a.a(this, th2);
                                }
                            }
                            i12++;
                            fArr2 = fArr;
                            z11 = z12;
                        } catch (JSONException unused) {
                            fArr3[13] = -1.0f;
                            fArr3[14] = -1.0f;
                            str4 = str + '|' + str3;
                            StringBuilder sb2 = new StringBuilder();
                            StringBuilder sb3 = new StringBuilder();
                            o(jSONObject, sb3, sb2);
                            string = sb2.toString();
                            m.e(string, "hintSB.toString()");
                            string2 = sb3.toString();
                            m.e(string2, "textSB.toString()");
                            if (m("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                                f11 = 1.0f;
                            } else {
                                f11 = 0.0f;
                            }
                            fArr3[15] = f11;
                            if (m("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            fArr3[16] = f12;
                            if (m("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                                f13 = 1.0f;
                            } else {
                                f13 = 0.0f;
                            }
                            fArr3[17] = f13;
                            if (q.v0(str2, "password", false)) {
                                f14 = 1.0f;
                            } else {
                                f14 = 0.0f;
                            }
                            fArr3[18] = f14;
                            if (l("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                                f15 = 1.0f;
                            } else {
                                f15 = 0.0f;
                            }
                            fArr3[19] = f15;
                            if (l("(?i)(sign in)|login|signIn", str2)) {
                                f16 = 1.0f;
                            } else {
                                f16 = 0.0f;
                            }
                            fArr3[20] = f16;
                            if (l("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                                f17 = 1.0f;
                            } else {
                                f17 = 0.0f;
                            }
                            fArr3[21] = f17;
                            if (m("PURCHASE", "BUTTON_TEXT", string2)) {
                                f18 = 1.0f;
                            } else {
                                f18 = 0.0f;
                            }
                            fArr3[22] = f18;
                            if (m("PURCHASE", "PAGE_TITLE", str4)) {
                                f19 = 1.0f;
                            } else {
                                f19 = 0.0f;
                            }
                            fArr3[24] = f19;
                            if (l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                                f21 = 1.0f;
                            } else {
                                f21 = 0.0f;
                            }
                            fArr3[25] = f21;
                            if (l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                                f22 = 1.0f;
                            } else {
                                f22 = 0.0f;
                            }
                            fArr3[27] = f22;
                            if (m("LEAD", "BUTTON_TEXT", string2)) {
                                f23 = 1.0f;
                            } else {
                                f23 = 0.0f;
                            }
                            fArr3[28] = f23;
                            if (m("LEAD", "PAGE_TITLE", str4)) {
                                f5 = 1.0f;
                            }
                            fArr3[29] = f5;
                            return fArr3;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (JSONException unused2) {
            }
            fArr = fArr2;
            fArr3[13] = -1.0f;
            fArr3[14] = -1.0f;
            str4 = str + '|' + str3;
            StringBuilder sb4 = new StringBuilder();
            StringBuilder sb5 = new StringBuilder();
            o(jSONObject, sb5, sb4);
            string = sb4.toString();
            m.e(string, "hintSB.toString()");
            string2 = sb5.toString();
            m.e(string2, "textSB.toString()");
            if (m("COMPLETE_REGISTRATION", "BUTTON_TEXT", string2)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr3[15] = f11;
            if (m("COMPLETE_REGISTRATION", "PAGE_TITLE", str4)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr3[16] = f12;
            if (m("COMPLETE_REGISTRATION", "BUTTON_ID", string)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr3[17] = f13;
            if (q.v0(str2, "password", false)) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            fArr3[18] = f14;
            if (l("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str2)) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            fArr3[19] = f15;
            if (l("(?i)(sign in)|login|signIn", str2)) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            fArr3[20] = f16;
            if (l("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str2)) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            fArr3[21] = f17;
            if (m("PURCHASE", "BUTTON_TEXT", string2)) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            fArr3[22] = f18;
            if (m("PURCHASE", "PAGE_TITLE", str4)) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            fArr3[24] = f19;
            if (l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", string2)) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            fArr3[25] = f21;
            if (l("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str4)) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            fArr3[27] = f22;
            if (m("LEAD", "BUTTON_TEXT", string2)) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            fArr3[28] = f23;
            if (m("LEAD", "PAGE_TITLE", str4)) {
                f5 = 1.0f;
            }
            fArr3[29] = f5;
            return fArr3;
        } catch (Throwable th4) {
            th = th4;
            fArr = null;
        }
    }

    public boolean k(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z11;
        if (!qf.a.b(this)) {
            try {
                if (jSONObject.optBoolean("is_interacted")) {
                    return true;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        z11 = false;
                        break;
                    }
                    if (jSONArrayOptJSONArray.getJSONObject(i11).optBoolean("is_interacted")) {
                        z11 = true;
                        break;
                    }
                    i11++;
                }
                boolean z12 = z11;
                JSONArray jSONArray2 = new JSONArray();
                if (z11) {
                    int length2 = jSONArrayOptJSONArray.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        jSONArray.put(jSONArrayOptJSONArray.getJSONObject(i12));
                    }
                    return z12;
                }
                int length3 = jSONArrayOptJSONArray.length();
                for (int i13 = 0; i13 < length3; i13++) {
                    JSONObject child = jSONArrayOptJSONArray.getJSONObject(i13);
                    m.e(child, "child");
                    if (k(child, jSONArray)) {
                        jSONArray2.put(child);
                        z12 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
                return z12;
            } catch (JSONException unused) {
            } catch (Throwable th2) {
                qf.a.a(this, th2);
            }
        }
        return false;
    }

    public boolean l(String str, String str2) {
        if (qf.a.b(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public boolean m(String str, String str2, String str3) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        if (!qf.a.b(this)) {
            try {
                JSONObject jSONObject = f36313e;
                String strOptString = null;
                if (jSONObject == null) {
                    m.n("rules");
                    throw null;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("rulesForLanguage");
                if (jSONObjectOptJSONObject3 != null) {
                    ?? r9 = f36310b;
                    if (r9 == 0) {
                        m.n("languageInfo");
                        throw null;
                    }
                    JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject((String) r9.get("ENGLISH"));
                    if (jSONObjectOptJSONObject4 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject4.optJSONObject("rulesForEvent")) != null) {
                        ?? r11 = f36311c;
                        if (r11 == 0) {
                            m.n("eventInfo");
                            throw null;
                        }
                        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject((String) r11.get(str));
                        if (jSONObjectOptJSONObject5 != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject5.optJSONObject("positiveRules")) != null) {
                            ?? r12 = f36312d;
                            if (r12 == 0) {
                                m.n("textTypeInfo");
                                throw null;
                            }
                            strOptString = jSONObjectOptJSONObject2.optString((String) r12.get(str2));
                        }
                    }
                }
                if (strOptString != null) {
                    return l(strOptString, str3);
                }
            } catch (Throwable th2) {
                qf.a.a(this, th2);
                return false;
            }
        }
        return false;
    }

    public void n(float[] fArr, float[] fArr2) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            int length = fArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                fArr[i11] = fArr[i11] + fArr2[i11];
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }

    public float[] i(JSONObject jSONObject) {
        if (qf.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i11 = 0; i11 < 30; i11++) {
                fArr[i11] = 0.0f;
            }
            String strOptString = jSONObject.optString("text");
            m.e(strOptString, "node.optString(TEXT_KEY)");
            String lowerCase = strOptString.toLowerCase();
            m.e(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint");
            m.e(strOptString2, "node.optString(HINT_KEY)");
            String lowerCase2 = strOptString2.toLowerCase();
            m.e(lowerCase2, "this as java.lang.String).toLowerCase()");
            String strOptString3 = jSONObject.optString("classname");
            m.e(strOptString3, scqhIrGXy.DFqtLsTeVlx);
            String lowerCase3 = strOptString3.toLowerCase();
            m.e(lowerCase3, "this as java.lang.String).toLowerCase()");
            int iOptInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", "price", "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", "phone"}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (iOptInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (iOptInt == 2 || iOptInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (iOptInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (q.v0(lowerCase3, "checkbox", false)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{"complete", "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (q.v0(lowerCase3, "radio", false) && q.v0(lowerCase3, "button", false)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
                int length = jSONArrayOptJSONArray.length();
                for (int i12 = 0; i12 < length; i12++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i12);
                    m.e(jSONObject2, "childViews.getJSONObject(i)");
                    n(fArr, i(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            qf.a.a(this, th2);
            return null;
        }
    }

    public void o(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        if (qf.a.b(this)) {
            return;
        }
        try {
            String strOptString = jSONObject.optString("text", BuildConfig.VERSION_NAME);
            m.e(strOptString, OYAvlbfUyD.gBk);
            String lowerCase = strOptString.toLowerCase();
            m.e(lowerCase, "this as java.lang.String).toLowerCase()");
            String strOptString2 = jSONObject.optString("hint", BuildConfig.VERSION_NAME);
            m.e(strOptString2, "view.optString(HINT_KEY, \"\")");
            String lowerCase2 = strOptString2.toLowerCase();
            m.e(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase.length() > 0) {
                sb2.append(lowerCase);
                sb2.append(" ");
            }
            if (lowerCase2.length() > 0) {
                sb3.append(lowerCase2);
                sb3.append(" ");
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("childviews");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                try {
                    JSONObject currentChildView = jSONArrayOptJSONArray.getJSONObject(i11);
                    m.e(currentChildView, "currentChildView");
                    o(currentChildView, sb2, sb3);
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            qf.a.a(this, th2);
        }
    }
}
