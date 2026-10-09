package df;

import android.os.Build;
import android.os.Bundle;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;
import lf.j1;
import mf.sOm.txBUGYhC;
import org.json.JSONArray;
import org.json.JSONObject;
import oz.q;
import oz.x;
import re.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f23396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static JSONArray f23397c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f23395a = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f23398d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    public static final void a(String event, Bundle params) {
        if (qf.a.b(d.class)) {
            return;
        }
        try {
            m.f(params, "params");
            m.f(event, "event");
            params.putString("event", event);
            StringBuilder sb2 = new StringBuilder();
            Locale locale = j1.f40051i;
            String language = locale != null ? locale.getLanguage() : null;
            String str = BuildConfig.VERSION_NAME;
            if (language == null) {
                language = BuildConfig.VERSION_NAME;
            }
            sb2.append(language);
            sb2.append('_');
            Locale locale2 = j1.f40051i;
            String country = locale2 != null ? locale2.getCountry() : null;
            if (country == null) {
                country = BuildConfig.VERSION_NAME;
            }
            sb2.append(country);
            params.putString("_locale", sb2.toString());
            String str2 = j1.f40050h;
            if (str2 == null) {
                str2 = BuildConfig.VERSION_NAME;
            }
            params.putString("_appVersion", str2);
            params.putString("_deviceOS", "ANDROID");
            params.putString("_platform", "mobile");
            String str3 = Build.MODEL;
            if (str3 == null) {
                str3 = BuildConfig.VERSION_NAME;
            }
            params.putString("_deviceModel", str3);
            params.putString("_nativeAppID", s.b());
            String str4 = j1.f40050h;
            if (str4 != null) {
                str = str4;
            }
            params.putString("_nativeAppShortVersion", str);
            params.putString("_timezone", j1.f40048f);
            params.putString("_carrier", j1.f40049g);
            params.putString("_deviceOSTypeName", "ANDROID");
            params.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            params.putLong("_remainingDiskGB", j1.f40046d);
        } catch (Throwable th2) {
            qf.a.a(d.class, th2);
        }
    }

    public static final String b(JSONObject jSONObject) {
        if (!qf.a.b(d.class)) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                if (itKeys.hasNext()) {
                    return itKeys.next();
                }
            } catch (Throwable th2) {
                qf.a.a(d.class, th2);
                return null;
            }
        }
        return null;
    }

    public static final String c(Bundle bundle) {
        String strOptString;
        if (qf.a.b(d.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = f23397c;
            if (jSONArray == null) {
                return "[]";
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = f23397c;
            m.d(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i11 = 0; i11 < length; i11++) {
                String strOptString2 = jSONArray2.optString(i11);
                if (strOptString2 != null) {
                    JSONObject jSONObject = new JSONObject(strOptString2);
                    long jOptLong = jSONObject.optLong("id");
                    if (jOptLong != 0 && (strOptString = jSONObject.optString("rule")) != null && d(strOptString, bundle)) {
                        arrayList.add(Long.valueOf(jOptLong));
                    }
                }
            }
            String string = new JSONArray((Collection) arrayList).toString();
            m.e(string, "JSONArray(res).toString()");
            return string;
        } catch (Throwable th2) {
            qf.a.a(d.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x007d  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e A[Catch: all -> 0x0049, TryCatch #0 {all -> 0x0049, blocks: (B:8:0x0011, B:11:0x001e, B:38:0x0079, B:41:0x007e, B:18:0x0036, B:21:0x003f, B:25:0x004b, B:27:0x0053, B:30:0x0058, B:32:0x005f, B:35:0x006e, B:36:0x0071, B:43:0x0083, B:46:0x0088, B:48:0x008f), top: B:54:0x0011 }] */
    public static final boolean d(String str, Bundle bundle) {
        JSONObject jSONObject;
        if (!qf.a.b(d.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String strB = b(jSONObject2);
                if (strB != null) {
                    Object obj = jSONObject2.get(strB);
                    int iHashCode = strB.hashCode();
                    if (iHashCode != 3555) {
                        if (iHashCode != 96727) {
                            if (iHashCode == 109267 && strB.equals("not")) {
                                return !d(obj.toString(), bundle);
                            }
                        } else if (strB.equals("and")) {
                            JSONArray jSONArray = (JSONArray) obj;
                            if (jSONArray != null) {
                                int length = jSONArray.length();
                                for (int i11 = 0; i11 < length; i11++) {
                                    if (d(jSONArray.get(i11).toString(), bundle)) {
                                    }
                                }
                                return true;
                            }
                        }
                        jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            return g(strB, jSONObject, bundle);
                        }
                    } else if (strB.equals("or")) {
                        JSONArray jSONArray2 = (JSONArray) obj;
                        if (jSONArray2 != null) {
                            int length2 = jSONArray2.length();
                            for (int i12 = 0; i12 < length2; i12++) {
                                if (d(jSONArray2.get(i12).toString(), bundle)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            return g(strB, jSONObject, bundle);
                        }
                    }
                }
            } catch (Throwable th2) {
                qf.a.a(d.class, th2);
            }
        }
        return false;
    }

    public static final void e(String event, Bundle bundle) {
        if (qf.a.b(d.class)) {
            return;
        }
        try {
            m.f(event, "event");
            if (!f23396b || bundle == null) {
                return;
            }
            try {
                a(event, bundle);
                bundle.putString("_audiencePropertyIds", c(bundle));
                bundle.putString("cs_maca", "1");
                f(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            qf.a.a(d.class, th2);
        }
    }

    public static final void f(Bundle params) {
        if (qf.a.b(d.class)) {
            return;
        }
        try {
            m.f(params, "params");
            String[] strArr = f23398d;
            for (int i11 = 0; i11 < 13; i11++) {
                params.remove(strArr[i11]);
            }
        } catch (Throwable th2) {
            qf.a.a(d.class, th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:101:0x01a4 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ae A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:109:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ca A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:112:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:115:0x01de  */
    /* JADX WARN: Code duplicated, block: B:116:0x01e0 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:121:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:122:0x01fc A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x0204  */
    /* JADX WARN: Code duplicated, block: B:126:0x0210 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0218  */
    /* JADX WARN: Code duplicated, block: B:131:0x022a  */
    /* JADX WARN: Code duplicated, block: B:132:0x022c A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0234  */
    /* JADX WARN: Code duplicated, block: B:136:0x0238  */
    /* JADX WARN: Code duplicated, block: B:137:0x023a A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x0240  */
    /* JADX WARN: Code duplicated, block: B:140:0x0242 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:142:0x0249 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x026d A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0275  */
    /* JADX WARN: Code duplicated, block: B:149:0x0279 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:150:0x027b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:155:0x028a A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:158:0x02ae A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:160:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:161:0x02b8 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:164:0x02d4 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:166:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:167:0x02de A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x02e8 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f2 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:174:0x02fc A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x031c A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:177:0x0324  */
    /* JADX WARN: Code duplicated, block: B:178:0x0325 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x032e A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:181:0x0336  */
    /* JADX WARN: Code duplicated, block: B:183:0x0339  */
    /* JADX WARN: Code duplicated, block: B:184:0x033a A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x0343 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x034b  */
    /* JADX WARN: Code duplicated, block: B:190:0x034f A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:191:0x0358 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:193:0x0360  */
    /* JADX WARN: Code duplicated, block: B:194:0x0361 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:204:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:205:? A[LOOP:0: B:141:0x0247->B:205:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x02ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:? A[LOOP:1: B:154:0x0288->B:208:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:234:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:264:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0080  */
    /* JADX WARN: Code duplicated, block: B:37:0x0082  */
    /* JADX WARN: Code duplicated, block: B:40:0x008a  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0094  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d1 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f5 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:64:0x0109 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0123 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x012b  */
    /* JADX WARN: Code duplicated, block: B:68:0x012d A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0135  */
    /* JADX WARN: Code duplicated, block: B:71:0x0137 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x013f  */
    /* JADX WARN: Code duplicated, block: B:74:0x0141 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0149  */
    /* JADX WARN: Code duplicated, block: B:77:0x014b A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0153  */
    /* JADX WARN: Code duplicated, block: B:80:0x0155 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0160 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0168  */
    /* JADX WARN: Code duplicated, block: B:86:0x016a A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x0172  */
    /* JADX WARN: Code duplicated, block: B:89:0x0174 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x017c  */
    /* JADX WARN: Code duplicated, block: B:92:0x017e A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0186  */
    /* JADX WARN: Code duplicated, block: B:95:0x0188 A[Catch: all -> 0x0061, TryCatch #0 {all -> 0x0061, blocks: (B:5:0x000b, B:8:0x0013, B:20:0x004a, B:23:0x0055, B:31:0x0069, B:38:0x0083, B:39:0x0087, B:41:0x008c, B:44:0x0096, B:45:0x00b0, B:48:0x00ba, B:51:0x00c7, B:137:0x023a, B:140:0x0242, B:142:0x0249, B:54:0x00d1, B:57:0x00db, B:58:0x00f5, B:150:0x027b, B:153:0x0283, B:155:0x028a, B:61:0x00ff, B:64:0x0109, B:65:0x0123, B:113:0x01d4, B:68:0x012d, B:107:0x01b8, B:71:0x0137, B:98:0x0192, B:74:0x0141, B:77:0x014b, B:129:0x021a, B:80:0x0155, B:83:0x0160, B:190:0x034f, B:86:0x016a, B:119:0x01ea, B:89:0x0174, B:92:0x017e, B:125:0x0206, B:95:0x0188, B:101:0x01a4, B:104:0x01ae, B:110:0x01ca, B:116:0x01e0, B:122:0x01fc, B:126:0x0210, B:132:0x022c, B:145:0x026d, B:158:0x02ae, B:161:0x02b8, B:164:0x02d4, B:167:0x02de, B:168:0x02e8, B:184:0x033a, B:171:0x02f2, B:174:0x02fc, B:175:0x031c, B:178:0x0325, B:179:0x032e, B:185:0x0343, B:191:0x0358, B:194:0x0361, B:34:0x007a, B:19:0x0046, B:14:0x002b, B:16:0x0037), top: B:200:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0190  */
    public static final boolean g(String str, JSONObject jSONObject, Bundle bundle) {
        ArrayList arrayList;
        Object obj;
        Object obj2;
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        int size;
        int i11;
        String lowerCase5;
        String lowerCase6;
        int size2;
        int i12;
        String lowerCase7;
        String lowerCase8;
        if (!qf.a.b(d.class)) {
            try {
                String strB = b(jSONObject);
                if (strB != null) {
                    String pattern = jSONObject.get(strB).toString();
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(strB);
                    if (qf.a.b(d.class) || jSONArrayOptJSONArray == null) {
                        arrayList = null;
                    } else {
                        try {
                            arrayList = new ArrayList();
                            int length = jSONArrayOptJSONArray.length();
                            for (int i13 = 0; i13 < length; i13++) {
                                arrayList.add(jSONArrayOptJSONArray.get(i13).toString());
                            }
                        } catch (Throwable th2) {
                            qf.a.a(d.class, th2);
                            arrayList = null;
                        }
                    }
                    if (strB.equals("exists")) {
                        return bundle != null && bundle.containsKey(str) == Boolean.parseBoolean(pattern);
                    }
                    if (bundle != null) {
                        String lowerCase9 = str.toLowerCase(Locale.ROOT);
                        m.e(lowerCase9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                        obj2 = bundle.get(lowerCase9);
                        if (obj2 == null) {
                            obj = bundle != null ? bundle.get(str) : null;
                            if (obj == null) {
                                obj2 = obj;
                                switch (strB.hashCode()) {
                                    case -1729128927:
                                        if (!strB.equals("i_not_contains")) {
                                            return false;
                                        }
                                        String string = obj2.toString();
                                        Locale locale = Locale.ROOT;
                                        lowerCase = string.toLowerCase(locale);
                                        m.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        lowerCase2 = pattern.toLowerCase(locale);
                                        m.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        if (q.v0(lowerCase, lowerCase2, false)) {
                                            return false;
                                        }
                                        return true;
                                    case -1179774633:
                                        if (!strB.equals("is_any")) {
                                            return false;
                                        }
                                        if (arrayList != null) {
                                            return arrayList.contains(obj2.toString());
                                        }
                                        break;
                                    case -1039699439:
                                        if (!strB.equals("not_in")) {
                                            return false;
                                        }
                                        if (arrayList == null) {
                                            return arrayList.contains(obj2.toString());
                                        }
                                        break;
                                        break;
                                    case -969266188:
                                        if (strB.equals("starts_with")) {
                                            return x.s0(obj2.toString(), pattern, false);
                                        }
                                        return false;
                                    case -966353971:
                                        if (!strB.equals("regex_match")) {
                                            return false;
                                        }
                                        m.f(pattern, "pattern");
                                        Pattern patternCompile = Pattern.compile(pattern);
                                        m.e(patternCompile, "compile(...)");
                                        String input = obj2.toString();
                                        m.f(input, "input");
                                        return patternCompile.matcher(input).matches();
                                    case -665609109:
                                        if (!strB.equals("is_not_any")) {
                                            return false;
                                        }
                                        if (arrayList == null) {
                                            return arrayList.contains(obj2.toString());
                                        }
                                        break;
                                        break;
                                    case -567445985:
                                        if (strB.equals("contains")) {
                                            return q.v0(obj2.toString(), pattern, false);
                                        }
                                        return false;
                                    case -327990090:
                                        if (!strB.equals("i_str_neq")) {
                                            return false;
                                        }
                                        String string2 = obj2.toString();
                                        Locale locale2 = Locale.ROOT;
                                        lowerCase3 = string2.toLowerCase(locale2);
                                        m.e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        lowerCase4 = pattern.toLowerCase(locale2);
                                        m.e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        if (lowerCase3.equals(lowerCase4)) {
                                            return false;
                                        }
                                        return true;
                                    case -159812115:
                                        if (!strB.equals("i_is_any")) {
                                            return false;
                                        }
                                        if (arrayList != null && !arrayList.isEmpty()) {
                                            size = arrayList.size();
                                            i11 = 0;
                                            while (i11 < size) {
                                                Object obj3 = arrayList.get(i11);
                                                i11++;
                                                Locale locale3 = Locale.ROOT;
                                                lowerCase5 = ((String) obj3).toLowerCase(locale3);
                                                m.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                lowerCase6 = obj2.toString().toLowerCase(locale3);
                                                m.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                if (lowerCase5.equals(lowerCase6)) {
                                                    return true;
                                                }
                                            }
                                            return false;
                                        }
                                        return false;
                                    case -92753547:
                                        if (!strB.equals("i_str_not_in")) {
                                            return false;
                                        }
                                        if (arrayList == null) {
                                            if (arrayList.isEmpty()) {
                                                size2 = arrayList.size();
                                                i12 = 0;
                                                while (i12 < size2) {
                                                    Object obj4 = arrayList.get(i12);
                                                    i12++;
                                                    Locale locale4 = Locale.ROOT;
                                                    lowerCase7 = ((String) obj4).toLowerCase(locale4);
                                                    m.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                    lowerCase8 = obj2.toString().toLowerCase(locale4);
                                                    m.e(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                    if (lowerCase7.equals(lowerCase8)) {
                                                        return false;
                                                    }
                                                }
                                            }
                                            return true;
                                        }
                                        break;
                                        break;
                                    case 60:
                                        if (!strB.equals("<")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) < Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 61:
                                        if (!strB.equals("=")) {
                                            return false;
                                        }
                                        return m.a(obj2.toString(), pattern);
                                    case 62:
                                        if (!strB.equals(">")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) > Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 1084:
                                        if (!strB.equals("!=")) {
                                            return false;
                                        }
                                        if (m.a(obj2.toString(), pattern)) {
                                            return false;
                                        }
                                        return true;
                                    case 1921:
                                        if (!strB.equals("<=")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 1952:
                                        if (!strB.equals("==")) {
                                            return false;
                                        }
                                        return m.a(obj2.toString(), pattern);
                                    case 1983:
                                        if (!strB.equals(">=")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 3244:
                                        if (!strB.equals("eq")) {
                                            return false;
                                        }
                                        return m.a(obj2.toString(), pattern);
                                    case 3294:
                                        if (!strB.equals("ge")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 3309:
                                        if (!strB.equals("gt")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) > Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 3365:
                                        if (!strB.equals("in")) {
                                            return false;
                                        }
                                        if (arrayList != null) {
                                            return arrayList.contains(obj2.toString());
                                        }
                                        break;
                                    case 3449:
                                        if (!strB.equals(txBUGYhC.PtaPOyPfSwYTkDd)) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 3464:
                                        if (!strB.equals("lt")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) < Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 3511:
                                        if (!strB.equals("ne")) {
                                            return false;
                                        }
                                        if (m.a(obj2.toString(), pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 102680:
                                        if (!strB.equals("gte")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 107485:
                                        if (!strB.equals("lte")) {
                                            return false;
                                        }
                                        if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 108954:
                                        if (!strB.equals("neq")) {
                                            return false;
                                        }
                                        if (m.a(obj2.toString(), pattern)) {
                                            return true;
                                        }
                                        return false;
                                    case 127966736:
                                        if (!strB.equals("i_str_eq")) {
                                            return false;
                                        }
                                        String string3 = obj2.toString();
                                        Locale locale5 = Locale.ROOT;
                                        String lowerCase10 = string3.toLowerCase(locale5);
                                        m.e(lowerCase10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        String lowerCase11 = pattern.toLowerCase(locale5);
                                        m.e(lowerCase11, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        return lowerCase10.equals(lowerCase11);
                                    case 127966857:
                                        if (!strB.equals("i_str_in")) {
                                            return false;
                                        }
                                        if (arrayList != null) {
                                            size = arrayList.size();
                                            i11 = 0;
                                            while (i11 < size) {
                                                Object obj5 = arrayList.get(i11);
                                                i11++;
                                                Locale locale6 = Locale.ROOT;
                                                lowerCase5 = ((String) obj5).toLowerCase(locale6);
                                                m.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                lowerCase6 = obj2.toString().toLowerCase(locale6);
                                                m.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                if (lowerCase5.equals(lowerCase6)) {
                                                    return true;
                                                }
                                            }
                                            return false;
                                        }
                                        break;
                                        break;
                                    case 363990325:
                                        if (!strB.equals("i_contains")) {
                                            return false;
                                        }
                                        String string4 = obj2.toString();
                                        Locale locale7 = Locale.ROOT;
                                        String lowerCase12 = string4.toLowerCase(locale7);
                                        m.e(lowerCase12, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        String lowerCase13 = pattern.toLowerCase(locale7);
                                        m.e(lowerCase13, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        return q.v0(lowerCase12, lowerCase13, false);
                                    case 1091487233:
                                        if (!strB.equals("i_is_not_any")) {
                                            return false;
                                        }
                                        if (arrayList == null) {
                                            if (arrayList.isEmpty()) {
                                                size2 = arrayList.size();
                                                i12 = 0;
                                                while (i12 < size2) {
                                                    Object obj6 = arrayList.get(i12);
                                                    i12++;
                                                    Locale locale8 = Locale.ROOT;
                                                    lowerCase7 = ((String) obj6).toLowerCase(locale8);
                                                    m.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                    lowerCase8 = obj2.toString().toLowerCase(locale8);
                                                    m.e(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                    if (lowerCase7.equals(lowerCase8)) {
                                                        return false;
                                                    }
                                                }
                                            }
                                            return true;
                                        }
                                        break;
                                        break;
                                    case 1918401035:
                                        if (strB.equals("not_contains") || q.v0(obj2.toString(), pattern, false)) {
                                        }
                                        return true;
                                    case 1961112862:
                                        if (!strB.equals("i_starts_with")) {
                                            return false;
                                        }
                                        String string5 = obj2.toString();
                                        Locale locale9 = Locale.ROOT;
                                        String lowerCase14 = string5.toLowerCase(locale9);
                                        m.e(lowerCase14, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        String lowerCase15 = pattern.toLowerCase(locale9);
                                        m.e(lowerCase15, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                        return x.s0(lowerCase14, lowerCase15, false);
                                    default:
                                        return false;
                                }
                            }
                        } else {
                            switch (strB.hashCode()) {
                                case -1729128927:
                                    if (!strB.equals("i_not_contains")) {
                                        return false;
                                    }
                                    String string6 = obj2.toString();
                                    Locale locale10 = Locale.ROOT;
                                    lowerCase = string6.toLowerCase(locale10);
                                    m.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    lowerCase2 = pattern.toLowerCase(locale10);
                                    m.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    if (q.v0(lowerCase, lowerCase2, false)) {
                                        return false;
                                    }
                                    return true;
                                case -1179774633:
                                    if (!strB.equals("is_any")) {
                                        return false;
                                    }
                                    if (arrayList != null) {
                                        return arrayList.contains(obj2.toString());
                                    }
                                    break;
                                case -1039699439:
                                    if (!strB.equals("not_in")) {
                                        return false;
                                    }
                                    if (arrayList == null) {
                                        return arrayList.contains(obj2.toString());
                                    }
                                    break;
                                    break;
                                case -969266188:
                                    if (strB.equals("starts_with")) {
                                        return false;
                                    }
                                    return x.s0(obj2.toString(), pattern, false);
                                case -966353971:
                                    if (!strB.equals("regex_match")) {
                                        return false;
                                    }
                                    m.f(pattern, "pattern");
                                    Pattern patternCompile2 = Pattern.compile(pattern);
                                    m.e(patternCompile2, "compile(...)");
                                    String input2 = obj2.toString();
                                    m.f(input2, "input");
                                    return patternCompile2.matcher(input2).matches();
                                case -665609109:
                                    if (!strB.equals("is_not_any")) {
                                        return false;
                                    }
                                    if (arrayList == null) {
                                        return arrayList.contains(obj2.toString());
                                    }
                                    break;
                                    break;
                                case -567445985:
                                    if (strB.equals("contains")) {
                                        return false;
                                    }
                                    return q.v0(obj2.toString(), pattern, false);
                                case -327990090:
                                    if (!strB.equals("i_str_neq")) {
                                        return false;
                                    }
                                    String string7 = obj2.toString();
                                    Locale locale11 = Locale.ROOT;
                                    lowerCase3 = string7.toLowerCase(locale11);
                                    m.e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    lowerCase4 = pattern.toLowerCase(locale11);
                                    m.e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    if (lowerCase3.equals(lowerCase4)) {
                                        return true;
                                    }
                                    return false;
                                case -159812115:
                                    if (!strB.equals("i_is_any")) {
                                        return false;
                                    }
                                    if (arrayList != null) {
                                        size = arrayList.size();
                                        i11 = 0;
                                        while (i11 < size) {
                                            Object obj7 = arrayList.get(i11);
                                            i11++;
                                            Locale locale12 = Locale.ROOT;
                                            lowerCase5 = ((String) obj7).toLowerCase(locale12);
                                            m.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            lowerCase6 = obj2.toString().toLowerCase(locale12);
                                            m.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            if (lowerCase5.equals(lowerCase6)) {
                                                return true;
                                            }
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                case -92753547:
                                    if (!strB.equals("i_str_not_in")) {
                                        return false;
                                    }
                                    if (arrayList == null) {
                                        if (arrayList.isEmpty()) {
                                            size2 = arrayList.size();
                                            i12 = 0;
                                            while (i12 < size2) {
                                                Object obj8 = arrayList.get(i12);
                                                i12++;
                                                Locale locale13 = Locale.ROOT;
                                                lowerCase7 = ((String) obj8).toLowerCase(locale13);
                                                m.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                lowerCase8 = obj2.toString().toLowerCase(locale13);
                                                m.e(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                if (lowerCase7.equals(lowerCase8)) {
                                                    return false;
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                    break;
                                    break;
                                case 60:
                                    if (!strB.equals("<")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) < Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 61:
                                    if (!strB.equals("=")) {
                                        return false;
                                    }
                                    return m.a(obj2.toString(), pattern);
                                case 62:
                                    if (!strB.equals(">")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) > Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 1084:
                                    if (!strB.equals("!=")) {
                                        return false;
                                    }
                                    if (m.a(obj2.toString(), pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 1921:
                                    if (!strB.equals("<=")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 1952:
                                    if (!strB.equals("==")) {
                                        return false;
                                    }
                                    return m.a(obj2.toString(), pattern);
                                case 1983:
                                    if (!strB.equals(">=")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3244:
                                    if (!strB.equals("eq")) {
                                        return false;
                                    }
                                    return m.a(obj2.toString(), pattern);
                                case 3294:
                                    if (!strB.equals("ge")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3309:
                                    if (!strB.equals("gt")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) > Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3365:
                                    if (!strB.equals("in")) {
                                        return false;
                                    }
                                    if (arrayList != null) {
                                        return arrayList.contains(obj2.toString());
                                    }
                                    break;
                                case 3449:
                                    if (!strB.equals(txBUGYhC.PtaPOyPfSwYTkDd)) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3464:
                                    if (!strB.equals("lt")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) < Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3511:
                                    if (!strB.equals("ne")) {
                                        return false;
                                    }
                                    if (m.a(obj2.toString(), pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 102680:
                                    if (!strB.equals("gte")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 107485:
                                    if (!strB.equals("lte")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 108954:
                                    if (!strB.equals("neq")) {
                                        return false;
                                    }
                                    if (m.a(obj2.toString(), pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 127966736:
                                    if (!strB.equals("i_str_eq")) {
                                        return false;
                                    }
                                    String string8 = obj2.toString();
                                    Locale locale14 = Locale.ROOT;
                                    String lowerCase16 = string8.toLowerCase(locale14);
                                    m.e(lowerCase16, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    String lowerCase17 = pattern.toLowerCase(locale14);
                                    m.e(lowerCase17, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    return lowerCase16.equals(lowerCase17);
                                case 127966857:
                                    if (!strB.equals("i_str_in")) {
                                        return false;
                                    }
                                    if (arrayList != null) {
                                        size = arrayList.size();
                                        i11 = 0;
                                        while (i11 < size) {
                                            Object obj9 = arrayList.get(i11);
                                            i11++;
                                            Locale locale15 = Locale.ROOT;
                                            lowerCase5 = ((String) obj9).toLowerCase(locale15);
                                            m.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            lowerCase6 = obj2.toString().toLowerCase(locale15);
                                            m.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            if (lowerCase5.equals(lowerCase6)) {
                                                return true;
                                            }
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                case 363990325:
                                    if (!strB.equals("i_contains")) {
                                        return false;
                                    }
                                    String string9 = obj2.toString();
                                    Locale locale16 = Locale.ROOT;
                                    String lowerCase18 = string9.toLowerCase(locale16);
                                    m.e(lowerCase18, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    String lowerCase19 = pattern.toLowerCase(locale16);
                                    m.e(lowerCase19, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    return q.v0(lowerCase18, lowerCase19, false);
                                case 1091487233:
                                    if (!strB.equals("i_is_not_any")) {
                                        return false;
                                    }
                                    if (arrayList == null) {
                                        if (arrayList.isEmpty()) {
                                            size2 = arrayList.size();
                                            i12 = 0;
                                            while (i12 < size2) {
                                                Object obj10 = arrayList.get(i12);
                                                i12++;
                                                Locale locale17 = Locale.ROOT;
                                                lowerCase7 = ((String) obj10).toLowerCase(locale17);
                                                m.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                lowerCase8 = obj2.toString().toLowerCase(locale17);
                                                m.e(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                if (lowerCase7.equals(lowerCase8)) {
                                                    return false;
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                    break;
                                    break;
                                case 1918401035:
                                    return strB.equals("not_contains") ? false : false;
                                case 1961112862:
                                    if (!strB.equals("i_starts_with")) {
                                        return false;
                                    }
                                    String string10 = obj2.toString();
                                    Locale locale18 = Locale.ROOT;
                                    String lowerCase110 = string10.toLowerCase(locale18);
                                    m.e(lowerCase110, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    String lowerCase111 = pattern.toLowerCase(locale18);
                                    m.e(lowerCase111, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    return x.s0(lowerCase110, lowerCase111, false);
                                default:
                                    return false;
                            }
                        }
                    } else {
                        if (bundle != null) {
                        }
                        if (obj == null) {
                            obj2 = obj;
                            switch (strB.hashCode()) {
                                case -1729128927:
                                    if (!strB.equals("i_not_contains")) {
                                        return false;
                                    }
                                    String string11 = obj2.toString();
                                    Locale locale19 = Locale.ROOT;
                                    lowerCase = string11.toLowerCase(locale19);
                                    m.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    lowerCase2 = pattern.toLowerCase(locale19);
                                    m.e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    if (q.v0(lowerCase, lowerCase2, false)) {
                                        return false;
                                    }
                                    return true;
                                case -1179774633:
                                    if (!strB.equals("is_any")) {
                                        return false;
                                    }
                                    if (arrayList != null) {
                                        return arrayList.contains(obj2.toString());
                                    }
                                    break;
                                case -1039699439:
                                    if (!strB.equals("not_in")) {
                                        return false;
                                    }
                                    if (arrayList == null) {
                                        return arrayList.contains(obj2.toString());
                                    }
                                    break;
                                    break;
                                case -969266188:
                                    if (strB.equals("starts_with")) {
                                        return false;
                                    }
                                    return x.s0(obj2.toString(), pattern, false);
                                case -966353971:
                                    if (!strB.equals("regex_match")) {
                                        return false;
                                    }
                                    m.f(pattern, "pattern");
                                    Pattern patternCompile3 = Pattern.compile(pattern);
                                    m.e(patternCompile3, "compile(...)");
                                    String input3 = obj2.toString();
                                    m.f(input3, "input");
                                    return patternCompile3.matcher(input3).matches();
                                case -665609109:
                                    if (!strB.equals("is_not_any")) {
                                        return false;
                                    }
                                    if (arrayList == null) {
                                        return arrayList.contains(obj2.toString());
                                    }
                                    break;
                                    break;
                                case -567445985:
                                    if (strB.equals("contains")) {
                                        return false;
                                    }
                                    return q.v0(obj2.toString(), pattern, false);
                                case -327990090:
                                    if (!strB.equals("i_str_neq")) {
                                        return false;
                                    }
                                    String string12 = obj2.toString();
                                    Locale locale110 = Locale.ROOT;
                                    lowerCase3 = string12.toLowerCase(locale110);
                                    m.e(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    lowerCase4 = pattern.toLowerCase(locale110);
                                    m.e(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    if (lowerCase3.equals(lowerCase4)) {
                                        return true;
                                    }
                                    return false;
                                case -159812115:
                                    if (!strB.equals("i_is_any")) {
                                        return false;
                                    }
                                    if (arrayList != null) {
                                        size = arrayList.size();
                                        i11 = 0;
                                        while (i11 < size) {
                                            Object obj11 = arrayList.get(i11);
                                            i11++;
                                            Locale locale111 = Locale.ROOT;
                                            lowerCase5 = ((String) obj11).toLowerCase(locale111);
                                            m.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            lowerCase6 = obj2.toString().toLowerCase(locale111);
                                            m.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            if (lowerCase5.equals(lowerCase6)) {
                                                return true;
                                            }
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                case -92753547:
                                    if (!strB.equals("i_str_not_in")) {
                                        return false;
                                    }
                                    if (arrayList == null) {
                                        if (arrayList.isEmpty()) {
                                            size2 = arrayList.size();
                                            i12 = 0;
                                            while (i12 < size2) {
                                                Object obj12 = arrayList.get(i12);
                                                i12++;
                                                Locale locale112 = Locale.ROOT;
                                                lowerCase7 = ((String) obj12).toLowerCase(locale112);
                                                m.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                lowerCase8 = obj2.toString().toLowerCase(locale112);
                                                m.e(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                if (lowerCase7.equals(lowerCase8)) {
                                                    return false;
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                    break;
                                    break;
                                case 60:
                                    if (!strB.equals("<")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) < Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 61:
                                    if (!strB.equals("=")) {
                                        return false;
                                    }
                                    return m.a(obj2.toString(), pattern);
                                case 62:
                                    if (!strB.equals(">")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) > Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 1084:
                                    if (!strB.equals("!=")) {
                                        return false;
                                    }
                                    if (m.a(obj2.toString(), pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 1921:
                                    if (!strB.equals("<=")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 1952:
                                    if (!strB.equals("==")) {
                                        return false;
                                    }
                                    return m.a(obj2.toString(), pattern);
                                case 1983:
                                    if (!strB.equals(">=")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3244:
                                    if (!strB.equals("eq")) {
                                        return false;
                                    }
                                    return m.a(obj2.toString(), pattern);
                                case 3294:
                                    if (!strB.equals("ge")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3309:
                                    if (!strB.equals("gt")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) > Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3365:
                                    if (!strB.equals("in")) {
                                        return false;
                                    }
                                    if (arrayList != null) {
                                        return arrayList.contains(obj2.toString());
                                    }
                                    break;
                                case 3449:
                                    if (!strB.equals(txBUGYhC.PtaPOyPfSwYTkDd)) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3464:
                                    if (!strB.equals("lt")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) < Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 3511:
                                    if (!strB.equals("ne")) {
                                        return false;
                                    }
                                    if (m.a(obj2.toString(), pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 102680:
                                    if (!strB.equals("gte")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) >= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 107485:
                                    if (!strB.equals("lte")) {
                                        return false;
                                    }
                                    if (Double.parseDouble(obj2.toString()) <= Double.parseDouble(pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 108954:
                                    if (!strB.equals("neq")) {
                                        return false;
                                    }
                                    if (m.a(obj2.toString(), pattern)) {
                                        return true;
                                    }
                                    return false;
                                case 127966736:
                                    if (!strB.equals("i_str_eq")) {
                                        return false;
                                    }
                                    String string13 = obj2.toString();
                                    Locale locale113 = Locale.ROOT;
                                    String lowerCase112 = string13.toLowerCase(locale113);
                                    m.e(lowerCase112, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    String lowerCase113 = pattern.toLowerCase(locale113);
                                    m.e(lowerCase113, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    return lowerCase112.equals(lowerCase113);
                                case 127966857:
                                    if (!strB.equals("i_str_in")) {
                                        return false;
                                    }
                                    if (arrayList != null) {
                                        size = arrayList.size();
                                        i11 = 0;
                                        while (i11 < size) {
                                            Object obj13 = arrayList.get(i11);
                                            i11++;
                                            Locale locale114 = Locale.ROOT;
                                            lowerCase5 = ((String) obj13).toLowerCase(locale114);
                                            m.e(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            lowerCase6 = obj2.toString().toLowerCase(locale114);
                                            m.e(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                            if (lowerCase5.equals(lowerCase6)) {
                                                return true;
                                            }
                                        }
                                        return false;
                                    }
                                    break;
                                    break;
                                case 363990325:
                                    if (!strB.equals("i_contains")) {
                                        return false;
                                    }
                                    String string14 = obj2.toString();
                                    Locale locale115 = Locale.ROOT;
                                    String lowerCase114 = string14.toLowerCase(locale115);
                                    m.e(lowerCase114, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    String lowerCase115 = pattern.toLowerCase(locale115);
                                    m.e(lowerCase115, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    return q.v0(lowerCase114, lowerCase115, false);
                                case 1091487233:
                                    if (!strB.equals("i_is_not_any")) {
                                        return false;
                                    }
                                    if (arrayList == null) {
                                        if (arrayList.isEmpty()) {
                                            size2 = arrayList.size();
                                            i12 = 0;
                                            while (i12 < size2) {
                                                Object obj14 = arrayList.get(i12);
                                                i12++;
                                                Locale locale116 = Locale.ROOT;
                                                lowerCase7 = ((String) obj14).toLowerCase(locale116);
                                                m.e(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                lowerCase8 = obj2.toString().toLowerCase(locale116);
                                                m.e(lowerCase8, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                                if (lowerCase7.equals(lowerCase8)) {
                                                    return false;
                                                }
                                            }
                                        }
                                        return true;
                                    }
                                    break;
                                    break;
                                case 1918401035:
                                    if (strB.equals("not_contains")) {
                                    }
                                case 1961112862:
                                    if (!strB.equals("i_starts_with")) {
                                        return false;
                                    }
                                    String string15 = obj2.toString();
                                    Locale locale117 = Locale.ROOT;
                                    String lowerCase116 = string15.toLowerCase(locale117);
                                    m.e(lowerCase116, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    String lowerCase117 = pattern.toLowerCase(locale117);
                                    m.e(lowerCase117, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                                    return x.s0(lowerCase116, lowerCase117, false);
                                default:
                                    return false;
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                qf.a.a(d.class, th3);
                return false;
            }
        }
        return false;
    }
}
