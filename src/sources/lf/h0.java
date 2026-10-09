package lf;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f40029a = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f40030b = ns.o.L("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting", "protected_mode_rules", "auto_log_app_events_default", "auto_log_app_events_enabled", hh.p0.o(new StringBuilder("app_events_config.os_version("), Build.VERSION.RELEASE, ')'));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ConcurrentHashMap f40031c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f40032d = new AtomicReference(g0.NOT_LOADED);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ConcurrentLinkedQueue f40033e = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f40034f;

    public static JSONObject a() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f40030b);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        String str = re.y.f49225j;
        re.y yVarB = re.v.B(null, "app", null);
        yVarB.f49236i = true;
        yVarB.f49231d = bundle;
        JSONObject jSONObject = yVarB.c().f49126d;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static final e0 b(String str) {
        return (e0) f40031c.get(str);
    }

    public static final HashMap c() {
        JSONObject jSONObject;
        String string = re.s.a().getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0).getString(String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{re.s.b()}, 1)), null);
        if (!j1.y(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException unused) {
                re.s sVar = re.s.f49201a;
                jSONObject = null;
            }
            if (jSONObject != null) {
                return h(jSONObject);
            }
        }
        return null;
    }

    public static final void d() {
        Context contextA = re.s.a();
        String strB = re.s.b();
        boolean zY = j1.y(strB);
        h0 h0Var = f40029a;
        AtomicReference atomicReference = f40032d;
        if (zY) {
            atomicReference.set(g0.ERROR);
            h0Var.j();
            return;
        }
        if (f40031c.containsKey(strB)) {
            atomicReference.set(g0.SUCCESS);
            h0Var.j();
            return;
        }
        g0 g0Var = g0.NOT_LOADED;
        g0 g0Var2 = g0.LOADING;
        while (!atomicReference.compareAndSet(g0Var, g0Var2)) {
            if (atomicReference.get() != g0Var) {
                g0 g0Var3 = g0.ERROR;
                g0 g0Var4 = g0.LOADING;
                while (!atomicReference.compareAndSet(g0Var3, g0Var4)) {
                    if (atomicReference.get() != g0Var3) {
                        h0Var.j();
                        return;
                    }
                }
                break;
            }
        }
        re.s.d().execute(new b0(contextA, String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{strB}, 1)), strB));
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0158  */
    public static e0 e(JSONObject jSONObject, String applicationId) {
        r rVar;
        String strOptString;
        JSONArray jSONArray;
        Long lValueOf;
        JSONArray jSONArrayOptJSONArray;
        int[] iArr;
        String str;
        EnumSet enumSet;
        d0 d0Var;
        int i11;
        kotlin.jvm.internal.m.f(applicationId, "applicationId");
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("android_sdk_error_categories");
        String str2 = "name";
        d0 d0Var2 = null;
        if (jSONArrayOptJSONArray2 == null) {
            rVar = null;
        } else {
            int length = jSONArrayOptJSONArray2.length();
            HashMap mapS = null;
            HashMap mapS2 = null;
            HashMap mapS3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            int i12 = 0;
            while (i12 < length) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(i12);
                if (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) {
                    jSONArray = jSONArrayOptJSONArray2;
                } else {
                    jSONArray = jSONArrayOptJSONArray2;
                    if (strOptString.equalsIgnoreCase("other")) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapS = tw.c.s(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("transient")) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapS2 = tw.c.s(jSONObjectOptJSONObject);
                    } else if (strOptString.equalsIgnoreCase("login_recoverable")) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapS3 = tw.c.s(jSONObjectOptJSONObject);
                    }
                }
                i12++;
                jSONArrayOptJSONArray2 = jSONArray;
            }
            rVar = new r(mapS, mapS2, mapS3, strOptString2, strOptString3, strOptString4);
        }
        if (rVar == null) {
            rVar = r.f40109d.m();
        }
        r rVar2 = rVar;
        int iOptInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z11 = (iOptInt & 8) != 0;
        boolean z12 = (iOptInt & 16) != 0;
        boolean z13 = (iOptInt & 32) != 0;
        JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("auto_event_mapping_android");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("app_events_config");
        boolean zOptBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String strOptString5 = jSONObject.optString("gdpv4_nux_content", BuildConfig.VERSION_NAME);
        kotlin.jvm.internal.m.e(strOptString5, "settingsJSON.optString(A…_SETTING_NUX_CONTENT, \"\")");
        boolean zOptBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int iOptInt2 = jSONObject.optInt("app_events_session_timeout", 60);
        e1 e1Var = f1.Companion;
        long jOptLong = jSONObject.optLong("seamless_login");
        e1Var.getClass();
        EnumSet result = EnumSet.noneOf(f1.class);
        for (f1 f1Var : f1.ALL) {
            if ((f1Var.b() & jOptLong) != 0) {
                result.add(f1Var);
            }
        }
        kotlin.jvm.internal.m.e(result, "result");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("android_dialog_configs");
        HashMap map = new HashMap();
        if (jSONObjectOptJSONObject3 != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("data")) != null) {
            int length2 = jSONArrayOptJSONArray.length();
            int i13 = 0;
            while (i13 < length2) {
                JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i13);
                kotlin.jvm.internal.m.e(jSONObjectOptJSONObject4, "dialogConfigData.optJSONObject(i)");
                String dialogNameWithFeature = jSONObjectOptJSONObject4.optString(str2);
                if (j1.y(dialogNameWithFeature)) {
                    str2 = str2;
                    d0Var = d0Var2;
                    str = strOptString5;
                    enumSet = result;
                } else {
                    kotlin.jvm.internal.m.e(dialogNameWithFeature, "dialogNameWithFeature");
                    List listW0 = oz.q.W0(dialogNameWithFeature, new String[]{"|"}, 0, 6);
                    if (listW0.size() != 2) {
                        str2 = str2;
                        str = strOptString5;
                        enumSet = result;
                        d0Var = null;
                    } else {
                        String str3 = (String) ry.m.q0(listW0);
                        String str4 = (String) ry.m.z0(listW0);
                        if (j1.y(str3) || j1.y(str4)) {
                            str2 = str2;
                            str = strOptString5;
                            enumSet = result;
                            d0Var = null;
                        } else {
                            String strOptString6 = jSONObjectOptJSONObject4.optString("url");
                            if (!j1.y(strOptString6)) {
                                Uri.parse(strOptString6);
                            }
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject4.optJSONArray("versions");
                            if (jSONArrayOptJSONArray4 != null) {
                                int length3 = jSONArrayOptJSONArray4.length();
                                iArr = new int[length3];
                                int i14 = 0;
                                while (i14 < length3) {
                                    String str5 = strOptString5;
                                    EnumSet enumSet2 = result;
                                    int iOptInt3 = jSONArrayOptJSONArray4.optInt(i14, -1);
                                    if (iOptInt3 == -1) {
                                        String versionString = jSONArrayOptJSONArray4.optString(i14);
                                        if (!j1.y(versionString)) {
                                            try {
                                                kotlin.jvm.internal.m.e(versionString, "versionString");
                                                i11 = Integer.parseInt(versionString);
                                            } catch (NumberFormatException unused) {
                                                re.s sVar = re.s.f49201a;
                                                i11 = -1;
                                            }
                                            iOptInt3 = i11;
                                        }
                                    }
                                    iArr[i14] = iOptInt3;
                                    i14++;
                                    strOptString5 = str5;
                                    result = enumSet2;
                                }
                            } else {
                                iArr = null;
                            }
                            str = strOptString5;
                            enumSet = result;
                            d0Var = new d0(str3, str4, iArr);
                        }
                    }
                }
                if (d0Var != null) {
                    String str6 = d0Var.f39990a;
                    Map map2 = (Map) map.get(str6);
                    if (map2 == null) {
                        map2 = new HashMap();
                        map.put(str6, map2);
                    }
                    map2.put(d0Var.f39991b, d0Var);
                }
                i13++;
                str2 = str2;
                strOptString5 = str;
                result = enumSet;
                d0Var2 = null;
            }
        }
        String str7 = strOptString5;
        EnumSet enumSet3 = result;
        String strOptString7 = jSONObject.optString("smart_login_bookmark_icon_url");
        kotlin.jvm.internal.m.e(strOptString7, "settingsJSON.optString(S…_LOGIN_BOOKMARK_ICON_URL)");
        String strOptString8 = jSONObject.optString("smart_login_menu_icon_url");
        kotlin.jvm.internal.m.e(strOptString8, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String strOptString9 = jSONObject.optString("sdk_update_message");
        kotlin.jvm.internal.m.e(strOptString9, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        String strOptString10 = jSONObject.optString("aam_rules");
        String strOptString11 = jSONObject.optString("suggested_events_setting");
        String strOptString12 = jSONObject.optString("restrictive_data_filter_params");
        JSONArray jSONArrayI = i(jSONObject.optJSONObject("protected_mode_rules"), "standard_params");
        JSONArray jSONArrayI2 = i(jSONObject.optJSONObject("protected_mode_rules"), "maca_rules");
        HashMap mapH = h(jSONObject);
        JSONArray jSONArrayI3 = i(jSONObject.optJSONObject("protected_mode_rules"), "blocklist_events");
        JSONArray jSONArrayI4 = i(jSONObject.optJSONObject("protected_mode_rules"), "redacted_events");
        JSONArray jSONArrayI5 = i(jSONObject.optJSONObject("protected_mode_rules"), "sensitive_params");
        JSONArray jSONArrayI6 = i(jSONObject.optJSONObject("protected_mode_rules"), "standard_params_schema");
        JSONArray jSONArrayI7 = i(jSONObject.optJSONObject("protected_mode_rules"), "standard_params_blocked");
        ArrayList arrayListF = f(jSONObjectOptJSONObject2, "fb_currency");
        ArrayList arrayListF2 = f(jSONObjectOptJSONObject2, "_valueToSum");
        ArrayList arrayListG = g(jSONObjectOptJSONObject2, false);
        ArrayList arrayListG2 = g(jSONObjectOptJSONObject2, true);
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("app_events_config");
        if (jSONObjectOptJSONObject5 != null) {
            try {
                lValueOf = Long.valueOf(jSONObjectOptJSONObject5.optLong("iap_manual_and_auto_log_dedup_window_millis"));
            } catch (Exception unused2) {
                lValueOf = null;
            }
        } else {
            lValueOf = null;
        }
        e0 e0Var = new e0(zOptBoolean, str7, zOptBoolean2, iOptInt2, enumSet3, map, z11, rVar2, strOptString7, strOptString8, z12, z13, jSONArrayOptJSONArray3, strOptString9, strOptString10, strOptString11, strOptString12, jSONArrayI, jSONArrayI2, mapH, jSONArrayI3, jSONArrayI4, jSONArrayI5, jSONArrayI6, jSONArrayI7, arrayListF, arrayListF2, arrayListG, arrayListG2, lValueOf);
        f40031c.put(applicationId, e0Var);
        return e0Var;
    }

    public static ArrayList f(JSONObject jSONObject, String str) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray != null) {
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                if (kotlin.jvm.internal.m.a(jSONObject2.getString("key"), "prod_keys")) {
                    JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                    int length2 = jSONArray2.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                        if (kotlin.jvm.internal.m.a(jSONObject3.getString("key"), str)) {
                            JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                            ArrayList arrayList = new ArrayList();
                            int length3 = jSONArray3.length();
                            for (int i13 = 0; i13 < length3; i13++) {
                                arrayList.add(jSONArray3.getJSONObject(i13).getString("value"));
                            }
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.addAll(arrayList);
                            return arrayList2;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static ArrayList g(JSONObject jSONObject, boolean z11) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            try {
                jSONArray = jSONObject.getJSONArray("iap_manual_and_auto_log_dedup_keys");
            } catch (Exception unused) {
            }
        } else {
            jSONArray = null;
        }
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < length; i11++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
            String string = jSONObject2.getString("key");
            if ((!kotlin.jvm.internal.m.a(string, "prod_keys") || !z11) && (!kotlin.jvm.internal.m.a(string, "test_keys") || z11)) {
                JSONArray jSONArray2 = jSONObject2.getJSONArray("value");
                int length2 = jSONArray2.length();
                for (int i12 = 0; i12 < length2; i12++) {
                    JSONObject jSONObject3 = jSONArray2.getJSONObject(i12);
                    String string2 = jSONObject3.getString("key");
                    if (!kotlin.jvm.internal.m.a(string2, "_valueToSum") && !kotlin.jvm.internal.m.a(string2, "fb_currency")) {
                        JSONArray jSONArray3 = jSONObject3.getJSONArray("value");
                        ArrayList arrayList2 = new ArrayList();
                        int length3 = jSONArray3.length();
                        for (int i13 = 0; i13 < length3; i13++) {
                            try {
                                arrayList2.add(jSONArray3.getJSONObject(i13).getString("value"));
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(new qy.l(string2, arrayList2));
                    }
                }
            }
        }
        return arrayList;
    }

    public static HashMap h(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (!jSONObject.isNull("auto_log_app_events_default")) {
            try {
                map.put("auto_log_app_events_default", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_default")));
            } catch (JSONException unused) {
                re.s sVar = re.s.f49201a;
            }
        }
        if (!jSONObject.isNull("auto_log_app_events_enabled")) {
            try {
                map.put("auto_log_app_events_enabled", Boolean.valueOf(jSONObject.getBoolean("auto_log_app_events_enabled")));
            } catch (JSONException unused2) {
                re.s sVar2 = re.s.f49201a;
            }
        }
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    public static JSONArray i(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONArray(str);
        }
        return null;
    }

    public static final e0 k(String applicationId, boolean z11) {
        kotlin.jvm.internal.m.f(applicationId, "applicationId");
        if (!z11) {
            ConcurrentHashMap concurrentHashMap = f40031c;
            if (concurrentHashMap.containsKey(applicationId)) {
                return (e0) concurrentHashMap.get(applicationId);
            }
        }
        e0 e0VarE = e(a(), applicationId);
        if (applicationId.equals(re.s.b())) {
            f40032d.set(g0.SUCCESS);
            f40029a.j();
        }
        return e0VarE;
    }

    public final synchronized void j() {
        g0 g0Var = (g0) f40032d.get();
        if (g0.NOT_LOADED != g0Var && g0.LOADING != g0Var) {
            e0 e0Var = (e0) f40031c.get(re.s.b());
            Handler handler = new Handler(Looper.getMainLooper());
            if (g0.ERROR == g0Var) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f40033e;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    } else {
                        handler.post(new f0((se.o) concurrentLinkedQueue.poll()));
                    }
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f40033e;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    } else {
                        handler.post(new f0((se.o) concurrentLinkedQueue2.poll(), e0Var));
                    }
                }
            }
        }
    }
}
