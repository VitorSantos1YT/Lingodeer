package se;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.p3;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.c0;
import lf.y0;
import org.json.JSONException;
import org.json.JSONObject;
import re.d0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f51591f = new HashSet();
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f51592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JSONObject f51593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f51594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f51595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f51596e;

    /* JADX WARN: Code duplicated, block: B:104:0x01e3 A[Catch: all -> 0x01c5, Exception -> 0x01f5, TRY_LEAVE, TryCatch #1 {all -> 0x01c5, blocks: (B:78:0x0184, B:80:0x0188, B:83:0x018f, B:84:0x01a2, B:86:0x01a8, B:88:0x01b4, B:90:0x01be, B:95:0x01c7, B:99:0x01d1, B:100:0x01d5, B:101:0x01dc, B:102:0x01dd, B:104:0x01e3), top: B:167:0x0184 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x020f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0210 A[Catch: all -> 0x023e, TryCatch #8 {all -> 0x023e, blocks: (B:110:0x0205, B:113:0x0210, B:115:0x0227, B:117:0x0237, B:120:0x0240, B:122:0x0246, B:123:0x0253, B:125:0x0259, B:126:0x026f), top: B:178:0x0205 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x0227 A[Catch: all -> 0x023e, TryCatch #8 {all -> 0x023e, blocks: (B:110:0x0205, B:113:0x0210, B:115:0x0227, B:117:0x0237, B:120:0x0240, B:122:0x0246, B:123:0x0253, B:125:0x0259, B:126:0x026f), top: B:178:0x0205 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0259 A[Catch: all -> 0x023e, JSONException -> 0x027c, LOOP:6: B:123:0x0253->B:125:0x0259, LOOP_END, TryCatch #5 {JSONException -> 0x027c, blocks: (B:122:0x0246, B:123:0x0253, B:125:0x0259, B:126:0x026f), top: B:173:0x0246 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0295  */
    /* JADX WARN: Code duplicated, block: B:135:0x0296 A[Catch: all -> 0x02db, TryCatch #4 {all -> 0x02db, blocks: (B:132:0x028b, B:135:0x0296, B:137:0x02af, B:140:0x02c0, B:142:0x02c7, B:144:0x02d7), top: B:171:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:137:0x02af A[Catch: all -> 0x02db, TryCatch #4 {all -> 0x02db, blocks: (B:132:0x028b, B:135:0x0296, B:137:0x02af, B:140:0x02c0, B:142:0x02c7, B:144:0x02d7), top: B:171:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:142:0x02c7 A[Catch: all -> 0x02db, TryCatch #4 {all -> 0x02db, blocks: (B:132:0x028b, B:135:0x0296, B:137:0x02af, B:140:0x02c0, B:142:0x02c7, B:144:0x02d7), top: B:171:0x028b }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02ed A[LOOP:2: B:149:0x02e7->B:151:0x02ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:153:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:156:0x030c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0315  */
    /* JADX WARN: Code duplicated, block: B:160:0x031b  */
    /* JADX WARN: Code duplicated, block: B:167:0x0184 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x028b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0246 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x0205 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x00d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:200:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x0237 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:0x0225 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cb A[Catch: all -> 0x0105, TRY_LEAVE, TryCatch #2 {all -> 0x0105, blocks: (B:38:0x00c7, B:40:0x00cb, B:52:0x00ff, B:43:0x00d4, B:44:0x00e0, B:46:0x00e6, B:48:0x00f6), top: B:168:0x00c7, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00e6 A[Catch: all -> 0x00fe, TryCatch #9 {all -> 0x00fe, blocks: (B:43:0x00d4, B:44:0x00e0, B:46:0x00e6, B:48:0x00f6), top: B:179:0x00d4, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0107  */
    /* JADX WARN: Code duplicated, block: B:62:0x0126  */
    /* JADX WARN: Code duplicated, block: B:64:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0142  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a8 A[Catch: all -> 0x01c5, Exception -> 0x01f5, TryCatch #1 {all -> 0x01c5, blocks: (B:78:0x0184, B:80:0x0188, B:83:0x018f, B:84:0x01a2, B:86:0x01a8, B:88:0x01b4, B:90:0x01be, B:95:0x01c7, B:99:0x01d1, B:100:0x01d5, B:101:0x01dc, B:102:0x01dd, B:104:0x01e3), top: B:167:0x0184 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4 A[Catch: all -> 0x01c5, Exception -> 0x01f5, TryCatch #1 {all -> 0x01c5, blocks: (B:78:0x0184, B:80:0x0188, B:83:0x018f, B:84:0x01a2, B:86:0x01a8, B:88:0x01b4, B:90:0x01be, B:95:0x01c7, B:99:0x01d1, B:100:0x01d5, B:101:0x01dc, B:102:0x01dd, B:104:0x01e3), top: B:167:0x0184 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cf  */
    public f(String contextName, String eventName, Double d5, Bundle bundle, boolean z11, boolean z12, UUID uuid, t tVar) throws JSONException {
        JSONObject jSONObject;
        String str;
        boolean zContains;
        String eventName2;
        HashMap map;
        JSONObject jSONObject2;
        Object obj;
        String str2;
        df.c cVar;
        Map parameters;
        HashMap map2;
        ArrayList arrayList;
        int size;
        int i11;
        JSONObject jSONObject3;
        String str3;
        String strA;
        Map parameters2;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size2;
        int i12;
        xe.a aVar;
        int size3;
        int i13;
        String str4;
        Object obj2;
        df.g gVar;
        HashSet hashSet;
        kotlin.jvm.internal.m.f(contextName, "contextName");
        kotlin.jvm.internal.m.f(eventName, "eventName");
        this.f51594c = z11;
        this.f51595d = z12;
        this.f51596e = eventName;
        String str5 = null;
        if (tVar != null) {
            try {
                LinkedHashMap linkedHashMap = tVar.f51615a;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(ry.x.W(linkedHashMap.size()));
                for (Object obj3 : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(((u) ((Map.Entry) obj3).getKey()).a(), ((Map.Entry) obj3).getValue());
                }
                jSONObject = new JSONObject(ry.x.h0(linkedHashMap2));
            } catch (Exception unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        this.f51593b = jSONObject;
        ue.f.E(eventName);
        JSONObject jSONObject4 = new JSONObject();
        hf.b bVar = hf.b.f32196a;
        if (qf.a.b(hf.b.class)) {
            str = null;
        } else {
            try {
                if (hf.b.f32197b) {
                    hf.b bVar2 = hf.b.f32196a;
                    if (qf.a.b(bVar2)) {
                        zContains = false;
                    } else {
                        try {
                            zContains = hf.b.f32199d.contains(eventName);
                        } catch (Throwable th2) {
                            qf.a.a(bVar2, th2);
                            zContains = false;
                            if (zContains) {
                                str = "_removed_";
                            } else {
                                str = eventName;
                            }
                            if (kotlin.jvm.internal.m.a(str, eventName)) {
                                df.g gVar2 = df.g.f23404a;
                                if (!qf.a.b(df.g.class)) {
                                    try {
                                        if (df.g.f23405b) {
                                            gVar = df.g.f23404a;
                                            if (!qf.a.b(gVar)) {
                                                try {
                                                    for (String str6 : df.g.f23406c.keySet()) {
                                                        hashSet = (HashSet) df.g.f23406c.get(str6);
                                                        if (hashSet == null) {
                                                        }
                                                    }
                                                } catch (Throwable th3) {
                                                    qf.a.a(gVar, th3);
                                                }
                                            }
                                            if (str5 == null) {
                                                str5 = eventName;
                                            }
                                        } else {
                                            str5 = eventName;
                                        }
                                    } catch (Throwable th4) {
                                        qf.a.a(df.g.class, th4);
                                    }
                                }
                                str = str5;
                            }
                            jSONObject4.put("_eventName", str);
                            jSONObject4.put("_logTime", System.currentTimeMillis() / ((long) 1000));
                            jSONObject4.put("_ui", contextName);
                            if (uuid != null) {
                                jSONObject4.put("_session_id", uuid);
                            }
                            if (bundle != null) {
                                eventName2 = this.f51596e;
                                map = new HashMap();
                                while (r0.hasNext()) {
                                    kotlin.jvm.internal.m.e(key, "key");
                                    ue.f.E(key);
                                    obj2 = bundle.get(key);
                                    if (obj2 instanceof String) {
                                    }
                                    map.put(key, obj2.toString());
                                }
                                if (!qf.a.b(df.c.class)) {
                                    try {
                                        if (df.c.f23393b) {
                                            try {
                                                List<String> listA1 = ry.m.a1(map.keySet());
                                                jSONObject2 = new JSONObject();
                                                for (String str7 : listA1) {
                                                    obj = map.get(str7);
                                                    if (obj != null) {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                    str2 = (String) obj;
                                                    cVar = df.c.f23392a;
                                                    if (!cVar.a(str7)) {
                                                    }
                                                    map.remove(str7);
                                                    if (df.c.f23394c) {
                                                        str2 = BuildConfig.VERSION_NAME;
                                                    }
                                                    jSONObject2.put(str7, str2);
                                                }
                                                if (jSONObject2.length() != 0) {
                                                    String string = jSONObject2.toString();
                                                    kotlin.jvm.internal.m.e(string, "restrictiveParamJson.toString()");
                                                    map.put("_onDeviceParams", string);
                                                }
                                            } catch (Exception unused2) {
                                            }
                                        }
                                    } catch (Throwable th5) {
                                        qf.a.a(df.c.class, th5);
                                    }
                                }
                                parameters = c0.c(map);
                                hf.b bVar3 = hf.b.f32196a;
                                if (!qf.a.b(hf.b.class)) {
                                    try {
                                        kotlin.jvm.internal.m.f(parameters, "parameters");
                                        kotlin.jvm.internal.m.f(eventName2, "eventName");
                                        if (!hf.b.f32197b) {
                                            map2 = new HashMap();
                                            arrayList = new ArrayList(parameters.keySet());
                                            size = arrayList.size();
                                            i11 = 0;
                                            while (i11 < size) {
                                                Object obj4 = arrayList.get(i11);
                                                i11++;
                                                str3 = (String) obj4;
                                                strA = hf.b.f32196a.a(eventName2, str3);
                                                if (strA != null) {
                                                    map2.put(str3, strA);
                                                    parameters.remove(str3);
                                                }
                                            }
                                            if (!map2.isEmpty()) {
                                                try {
                                                    jSONObject3 = new JSONObject();
                                                    for (Map.Entry entry : map2.entrySet()) {
                                                        jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                                                    }
                                                    parameters.put("_restrictedParams", jSONObject3.toString());
                                                } catch (JSONException unused3) {
                                                }
                                            }
                                        }
                                    } catch (Throwable th6) {
                                        qf.a.a(hf.b.class, th6);
                                    }
                                }
                                parameters2 = c0.c(map);
                                xe.b bVar4 = xe.b.f56018a;
                                if (!qf.a.b(xe.b.class)) {
                                    try {
                                        kotlin.jvm.internal.m.f(parameters2, "parameters");
                                        kotlin.jvm.internal.m.f(eventName2, "eventName");
                                        if (!xe.b.f56019b) {
                                            arrayList2 = new ArrayList(parameters2.keySet());
                                            arrayList3 = new ArrayList(xe.b.f56020c);
                                            size2 = arrayList3.size();
                                            i12 = 0;
                                            while (i12 < size2) {
                                                Object obj5 = arrayList3.get(i12);
                                                i12++;
                                                aVar = (xe.a) obj5;
                                                if (!kotlin.jvm.internal.m.a(aVar.f56016a, eventName2)) {
                                                    size3 = arrayList2.size();
                                                    i13 = 0;
                                                    while (i13 < size3) {
                                                        Object obj6 = arrayList2.get(i13);
                                                        i13++;
                                                        str4 = (String) obj6;
                                                        if (aVar.f56017b.contains(str4)) {
                                                            parameters2.remove(str4);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th7) {
                                        qf.a.a(xe.b.class, th7);
                                    }
                                }
                                for (String str8 : map.keySet()) {
                                    jSONObject4.put(str8, map.get(str8));
                                }
                            }
                            if (d5 != null) {
                                jSONObject4.put("_valueToSum", d5.doubleValue());
                            }
                            if (this.f51595d) {
                                jSONObject4.put("_inBackground", "1");
                            }
                            if (this.f51594c) {
                                jSONObject4.put("_implicitlyLogged", "1");
                            } else {
                                p3 p3Var = y0.f40132d;
                                d0 d0Var = d0.APP_EVENTS;
                                String string2 = jSONObject4.toString();
                                kotlin.jvm.internal.m.e(string2, "eventObject.toString()");
                                p3.s(d0Var, "AppEvents", "Created app event '%s'", string2);
                            }
                            this.f51592a = jSONObject4;
                        }
                    }
                    if (zContains) {
                        str = "_removed_";
                    } else {
                        str = eventName;
                    }
                } else {
                    str = eventName;
                }
            } catch (Throwable th8) {
                qf.a.a(hf.b.class, th8);
                str = null;
            }
        }
        if (kotlin.jvm.internal.m.a(str, eventName)) {
            df.g gVar3 = df.g.f23404a;
            if (!qf.a.b(df.g.class)) {
                if (df.g.f23405b) {
                    gVar = df.g.f23404a;
                    if (!qf.a.b(gVar)) {
                        while (r0.hasNext()) {
                            hashSet = (HashSet) df.g.f23406c.get(str6);
                            if (hashSet == null && hashSet.contains(eventName)) {
                                str5 = str6;
                                break;
                            }
                        }
                    }
                    if (str5 == null) {
                        str5 = eventName;
                    }
                } else {
                    str5 = eventName;
                }
            }
            str = str5;
        }
        jSONObject4.put("_eventName", str);
        jSONObject4.put("_logTime", System.currentTimeMillis() / ((long) 1000));
        jSONObject4.put("_ui", contextName);
        if (uuid != null) {
            jSONObject4.put("_session_id", uuid);
        }
        if (bundle != null) {
            eventName2 = this.f51596e;
            map = new HashMap();
            for (String key : bundle.keySet()) {
                kotlin.jvm.internal.m.e(key, "key");
                ue.f.E(key);
                obj2 = bundle.get(key);
                if ((obj2 instanceof String) && !(obj2 instanceof Number)) {
                    throw new FacebookException(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj2, key}, 2)));
                }
                map.put(key, obj2.toString());
            }
            if (!qf.a.b(df.c.class)) {
                if (df.c.f23393b && !map.isEmpty()) {
                    List<String> listA2 = ry.m.a1(map.keySet());
                    jSONObject2 = new JSONObject();
                    while (r0.hasNext()) {
                        obj = map.get(str7);
                        if (obj != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        str2 = (String) obj;
                        cVar = df.c.f23392a;
                        if (!cVar.a(str7) || cVar.a(str2)) {
                            map.remove(str7);
                            if (df.c.f23394c) {
                                str2 = BuildConfig.VERSION_NAME;
                            }
                            jSONObject2.put(str7, str2);
                        }
                    }
                    if (jSONObject2.length() != 0) {
                        String string3 = jSONObject2.toString();
                        kotlin.jvm.internal.m.e(string3, "restrictiveParamJson.toString()");
                        map.put("_onDeviceParams", string3);
                    }
                }
            }
            parameters = c0.c(map);
            hf.b bVar5 = hf.b.f32196a;
            if (!qf.a.b(hf.b.class)) {
                kotlin.jvm.internal.m.f(parameters, "parameters");
                kotlin.jvm.internal.m.f(eventName2, "eventName");
                if (!hf.b.f32197b) {
                    map2 = new HashMap();
                    arrayList = new ArrayList(parameters.keySet());
                    size = arrayList.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj7 = arrayList.get(i11);
                        i11++;
                        str3 = (String) obj7;
                        strA = hf.b.f32196a.a(eventName2, str3);
                        if (strA != null) {
                            map2.put(str3, strA);
                            parameters.remove(str3);
                        }
                    }
                    if (!map2.isEmpty()) {
                        jSONObject3 = new JSONObject();
                        while (r4.hasNext()) {
                            jSONObject3.put((String) entry.getKey(), (String) entry.getValue());
                        }
                        parameters.put("_restrictedParams", jSONObject3.toString());
                    }
                }
            }
            parameters2 = c0.c(map);
            xe.b bVar6 = xe.b.f56018a;
            if (!qf.a.b(xe.b.class)) {
                kotlin.jvm.internal.m.f(parameters2, "parameters");
                kotlin.jvm.internal.m.f(eventName2, "eventName");
                if (!xe.b.f56019b) {
                    arrayList2 = new ArrayList(parameters2.keySet());
                    arrayList3 = new ArrayList(xe.b.f56020c);
                    size2 = arrayList3.size();
                    i12 = 0;
                    while (i12 < size2) {
                        Object obj8 = arrayList3.get(i12);
                        i12++;
                        aVar = (xe.a) obj8;
                        if (!kotlin.jvm.internal.m.a(aVar.f56016a, eventName2)) {
                            size3 = arrayList2.size();
                            i13 = 0;
                            while (i13 < size3) {
                                Object obj9 = arrayList2.get(i13);
                                i13++;
                                str4 = (String) obj9;
                                if (aVar.f56017b.contains(str4)) {
                                    parameters2.remove(str4);
                                }
                            }
                        }
                    }
                }
            }
            while (r0.hasNext()) {
                jSONObject4.put(str8, map.get(str8));
            }
        }
        if (d5 != null) {
            jSONObject4.put("_valueToSum", d5.doubleValue());
        }
        if (this.f51595d) {
            jSONObject4.put("_inBackground", "1");
        }
        if (this.f51594c) {
            jSONObject4.put("_implicitlyLogged", "1");
        } else {
            p3 p3Var2 = y0.f40132d;
            d0 d0Var2 = d0.APP_EVENTS;
            String string4 = jSONObject4.toString();
            kotlin.jvm.internal.m.e(string4, "eventObject.toString()");
            p3.s(d0Var2, "AppEvents", "Created app event '%s'", string4);
        }
        this.f51592a = jSONObject4;
    }

    private final Object writeReplace() {
        String string = this.f51592a.toString();
        kotlin.jvm.internal.m.e(string, "jsonObject.toString()");
        String string2 = this.f51593b.toString();
        kotlin.jvm.internal.m.e(string2, "operationalJsonObject.toString()");
        return new e(this.f51594c, this.f51595d, string, string2);
    }

    public final String toString() {
        JSONObject jSONObject = this.f51592a;
        return String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{jSONObject.optString("_eventName"), Boolean.valueOf(this.f51594c), jSONObject.toString()}, 3));
    }

    public f(boolean z11, boolean z12, String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.f51592a = jSONObject;
        this.f51593b = new JSONObject(str2);
        this.f51594c = z11;
        String strOptString = jSONObject.optString("_eventName");
        kotlin.jvm.internal.m.e(strOptString, "jsonObject.optString(Con…nts.EVENT_NAME_EVENT_KEY)");
        this.f51596e = strOptString;
        this.f51595d = z12;
    }
}
