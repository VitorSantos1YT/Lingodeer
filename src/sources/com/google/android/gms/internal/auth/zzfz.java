package com.google.android.gms.internal.auth;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import zp.sBa.anrPHlQ;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
final class zzfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f9515a;

    static {
        char[] cArr = new char[80];
        f9515a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void b(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f9515a, 0, i12);
            i11 -= i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ff  */
    public static void c(zzev zzevVar, StringBuilder sb2, int i11) {
        int i12;
        int i13;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzevVar.getClass().getDeclaredMethods();
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
                    a(sb2, i11, strSubstring.substring(0, strSubstring.length() - 4), zzev.b(method2, zzevVar, new Object[0]));
                }
                i12 = i13;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i11, strSubstring.substring(0, strSubstring.length() - 3), zzev.b(method, zzevVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objB = zzev.b(method4, zzevVar, new Object[0]);
                    if (method5 == null) {
                        if (objB instanceof Boolean) {
                            if (((Boolean) objB).booleanValue()) {
                                a(sb2, i11, strSubstring, objB);
                            }
                        } else if (objB instanceof Integer) {
                            if (((Integer) objB).intValue() != 0) {
                                a(sb2, i11, strSubstring, objB);
                            }
                        } else if (objB instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objB).floatValue()) != 0) {
                                a(sb2, i11, strSubstring, objB);
                            }
                        } else if (!(objB instanceof Double)) {
                            if (objB instanceof String) {
                                zEquals = objB.equals(BuildConfig.VERSION_NAME);
                            } else if (objB instanceof zzef) {
                                zEquals = objB.equals(zzef.f9482b);
                            } else if (objB instanceof zzfx) {
                                if (objB != ((zzfx) objB).zze()) {
                                    a(sb2, i11, strSubstring, objB);
                                }
                            } else if (!(objB instanceof Enum) || ((Enum) objB).ordinal() != 0) {
                                a(sb2, i11, strSubstring, objB);
                            }
                            if (!zEquals) {
                                a(sb2, i11, strSubstring, objB);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objB).doubleValue()) != 0) {
                            a(sb2, i11, strSubstring, objB);
                        }
                    } else if (((Boolean) zzev.b(method5, zzevVar, new Object[0])).booleanValue()) {
                        a(sb2, i11, strSubstring, objB);
                    }
                }
            }
            i12 = i13;
        }
        if (zzevVar instanceof zzeu) {
            throw null;
        }
        zzha zzhaVar = zzevVar.zzc;
        if (zzhaVar != null) {
            for (int i15 = 0; i15 < zzhaVar.f9562a; i15++) {
                a(sb2, i11, String.valueOf(zzhaVar.f9563b[i15] >>> 3), zzhaVar.f9564c[i15]);
            }
        }
    }

    public static void a(StringBuilder sb2, int i11, String str, Object obj) {
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
        b(i11, sb2);
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
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzgx.a(new zzec(((String) obj).getBytes(zzfa.f9501a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzef) {
            sb2.append(": \"");
            sb2.append(zzgx.a((zzef) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzev) {
            sb2.append(" {");
            c((zzev) obj, sb2, i11 + 2);
            sb2.append("\n");
            b(i11, sb2);
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
        a(sb2, i13, "key", entry.getKey());
        a(sb2, i13, anrPHlQ.VlF, entry.getValue());
        sb2.append("\n");
        b(i11, sb2);
        sb2.append("}");
    }
}
