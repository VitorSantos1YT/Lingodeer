package com.google.android.gms.internal.measurement;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzafe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f11298a;

    static {
        char[] cArr = new char[80];
        f11298a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb2, int i11, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        c(i11, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i12 = 1; i12 < str.length(); i12++) {
                char cCharAt = str.charAt(i12);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (!(obj instanceof String)) {
            if (obj instanceof zzacr) {
                sb2.append(": \"");
                sb2.append(zzafx.a(((zzacr) obj).m()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof zzadu) {
                sb2.append(" {");
                b((zzadu) obj, sb2, i11 + 2);
                sb2.append("\n");
                c(i11, sb2);
                sb2.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
                return;
            }
            int i13 = i11 + 2;
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            a(sb2, i13, "key", entry.getKey());
            a(sb2, i13, "value", entry.getValue());
            sb2.append("\n");
            c(i11, sb2);
            sb2.append("}");
            return;
        }
        sb2.append(": \"");
        String strReplace2 = (String) obj;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        for (int i14 = 0; i14 < strReplace2.length(); i14++) {
            char cCharAt2 = strReplace2.charAt(i14);
            if (cCharAt2 < ' ' || cCharAt2 > '~') {
                strReplace = zzafx.a(strReplace2.getBytes(StandardCharsets.UTF_8));
                sb2.append(strReplace);
                sb2.append('\"');
            } else {
                if (cCharAt2 == '\"') {
                    z13 = true;
                } else if (cCharAt2 == '\'') {
                    z12 = true;
                } else if (cCharAt2 == '\\') {
                    z11 = true;
                }
            }
        }
        if (z11) {
            strReplace2 = strReplace2.replace("\\", "\\\\");
        }
        strReplace = z12 ? strReplace2.replace("'", "\\'") : strReplace2;
        if (z13) {
            strReplace = strReplace.replace("\"", "\\\"");
        }
        sb2.append(strReplace);
        sb2.append('\"');
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0184  */
    public static void b(zzadu zzaduVar, StringBuilder sb2, int i11) {
        int i12;
        int i13;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzaduVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i14 = 0;
        while (true) {
            i12 = 3;
            if (i14 >= length) {
                break;
            }
            Method method3 = declaredMethods[i14];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i14++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i12);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i13 = i12;
            } else {
                i13 = i12;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb2, i11, strSubstring.substring(0, strSubstring.length() - 4), zzadu.u(method2, zzaduVar, new Object[0]));
                }
                i12 = i13;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i11, strSubstring.substring(0, strSubstring.length() - 3), zzadu.u(method, zzaduVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objU = zzadu.u(method4, zzaduVar, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) zzadu.u(method5, zzaduVar, new Object[0])).booleanValue();
                    } else if (objU instanceof Boolean) {
                        if (((Boolean) objU).booleanValue()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                    } else if (objU instanceof Integer) {
                        if (((Integer) objU).intValue() == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (objU instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) objU).floatValue()) == 0) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (!(objU instanceof Double)) {
                        if (objU instanceof String) {
                            zEquals = objU.equals(BuildConfig.VERSION_NAME);
                        } else if (objU instanceof zzacr) {
                            zEquals = objU.equals(zzacr.f11213b);
                        } else if (!(objU instanceof zzafc) ? !((objU instanceof Enum) && ((Enum) objU).ordinal() == 0) : objU != ((zzafc) objU).a()) {
                            zBooleanValue = true;
                        } else {
                            zBooleanValue = false;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        } else {
                            zBooleanValue = true;
                        }
                    } else if (Double.doubleToRawLongBits(((Double) objU).doubleValue()) == 0) {
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = true;
                    }
                    if (zBooleanValue) {
                        a(sb2, i11, strSubstring, objU);
                    }
                }
            }
            i12 = i13;
        }
        if (zzaduVar instanceof zzadr) {
            Iterator itB = ((zzadr) zzaduVar).zzb.b();
            if (itB.hasNext()) {
                throw null;
            }
        }
        zzaga zzagaVar = zzaduVar.zzc;
        if (zzagaVar != null) {
            for (int i15 = 0; i15 < zzagaVar.f11346a; i15++) {
                a(sb2, i11, String.valueOf(zzagaVar.f11347b[i15] >>> 3), zzagaVar.f11348c[i15]);
            }
        }
    }

    public static void c(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f11298a, 0, i12);
            i11 -= i12;
        }
    }
}
