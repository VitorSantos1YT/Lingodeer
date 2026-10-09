package com.google.android.gms.internal.p002firebaseauthapi;

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
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzamd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f10176a;

    static {
        char[] cArr = new char[80];
        f10176a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f10176a, 0, i12);
            i11 -= i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:101:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:103:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:131:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x015e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0166  */
    /* JADX WARN: Code duplicated, block: B:63:0x016b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0188  */
    /* JADX WARN: Code duplicated, block: B:74:0x018c  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    public static void b(zzaku zzakuVar, StringBuilder sb2, int i11) {
        int i12;
        Method method;
        Method method2;
        Object objM;
        boolean zBooleanValue;
        boolean zEquals;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzakuVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i12 = 3;
            if (i13 >= length) {
                break;
            }
            Method method5 = declaredMethods[i13];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith("set")) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i13++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i12);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                c(sb2, i11, p.i(4, 0, strSubstring), zzaku.m(method4, zzakuVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                c(sb2, i11, p.i(3, 0, strSubstring), zzaku.m(method3, zzakuVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + p.i(5, 0, strSubstring))) {
                        method = (Method) entry.getValue();
                        method2 = (Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objM = zzaku.m(method, zzakuVar, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objM instanceof Boolean) {
                                    if (((Boolean) objM).booleanValue()) {
                                        zEquals = false;
                                    } else {
                                        zEquals = true;
                                    }
                                } else if (objM instanceof Integer) {
                                    if (((Integer) objM).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objM).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objM).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objM instanceof String) {
                                    zEquals = objM.equals(BuildConfig.VERSION_NAME);
                                } else if (objM instanceof zzaje) {
                                    zEquals = objM.equals(zzaje.f10066b);
                                } else if ((objM instanceof zzaly) ? !((objM instanceof Enum) && ((Enum) objM).ordinal() == 0) : objM != ((zzaly) objM).zzs()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) zzaku.m(method2, zzakuVar, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                c(sb2, i11, strSubstring, objM);
                            }
                        }
                    }
                } else {
                    method = (Method) entry.getValue();
                    method2 = (Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objM = zzaku.m(method, zzakuVar, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objM instanceof Boolean) {
                                if (((Boolean) objM).booleanValue()) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM instanceof Integer) {
                                if (((Integer) objM).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objM).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objM).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objM instanceof String) {
                                zEquals = objM.equals(BuildConfig.VERSION_NAME);
                            } else if (objM instanceof zzaje) {
                                zEquals = objM.equals(zzaje.f10066b);
                            } else if (objM instanceof zzaly) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) zzaku.m(method2, zzakuVar, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            c(sb2, i11, strSubstring, objM);
                        }
                    }
                }
            }
            i12 = 3;
        }
        if (zzakuVar instanceof zzaku.zzd) {
            Iterator itC = ((zzaku.zzd) zzakuVar).zzc.c();
            if (itC.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzani zzaniVar = zzakuVar.zzb;
        if (zzaniVar != null) {
            for (int i14 = 0; i14 < zzaniVar.f10218a; i14++) {
                c(sb2, i11, String.valueOf(zzaniVar.f10219b[i14] >>> 3), zzaniVar.f10220c[i14]);
            }
        }
    }

    public static void c(StringBuilder sb2, int i11, String str, Object obj) {
        String strReplace;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb2, i11, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        a(i11, sb2);
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
            if (obj instanceof zzaje) {
                sb2.append(": \"");
                sb2.append(zzana.a(((zzaje) obj).r()));
                sb2.append('\"');
                return;
            }
            if (obj instanceof zzaku) {
                sb2.append(" {");
                b((zzaku) obj, sb2, i11 + 2);
                sb2.append("\n");
                a(i11, sb2);
                sb2.append("}");
                return;
            }
            if (!(obj instanceof Map.Entry)) {
                sb2.append(": ");
                sb2.append(obj);
                return;
            }
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i13 = i11 + 2;
            c(sb2, i13, "key", entry.getKey());
            c(sb2, i13, "value", entry.getValue());
            sb2.append("\n");
            a(i11, sb2);
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
                strReplace = zzana.a(strReplace2.getBytes(StandardCharsets.UTF_8));
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
        if (z12) {
            strReplace2 = strReplace2.replace("'", "\\'");
        }
        strReplace = z13 ? strReplace2.replace("\"", "\\\"") : strReplace2;
        sb2.append(strReplace);
        sb2.append('\"');
    }
}
