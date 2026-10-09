package com.google.android.gms.internal.play_billing;

import com.google.zxing.aztec.detector.zTGP.gkbGsXmgaxRjJ;
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

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f12400a;

    static {
        char[] cArr = new char[80];
        f12400a = cArr;
        Arrays.fill(cArr, ' ');
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
            zzei zzeiVar = zzei.f12350b;
            sb2.append(zzhf.a(new zzeg(((String) obj).getBytes(zzfo.f12383a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzei) {
            sb2.append(": \"");
            sb2.append(zzhf.a((zzei) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzfi) {
            sb2.append(" {");
            c((zzfi) obj, sb2, i11 + 2);
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
        int i13 = i11 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb2, i13, "key", entry.getKey());
        a(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        b(i11, sb2);
        sb2.append("}");
    }

    public static void b(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f12400a, 0, i12);
            i11 -= i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0200  */
    public static void c(zzfi zzfiVar, StringBuilder sb2, int i11) {
        String str;
        int i12;
        int i13;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfiVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i14 = 0;
        while (true) {
            str = gkbGsXmgaxRjJ.xhdbEuESGxD;
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
                    } else if (method3.getName().startsWith(str)) {
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
                    a(sb2, i11, strSubstring.substring(0, strSubstring.length() - 4), zzfi.j(method2, zzfiVar, new Object[0]));
                }
                i12 = i13;
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb2, i11, strSubstring.substring(0, strSubstring.length() - 3), zzfi.j(method, zzfiVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey(str.concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objJ = zzfi.j(method4, zzfiVar, new Object[0]);
                    if (method5 == null) {
                        if (objJ instanceof Boolean) {
                            if (((Boolean) objJ).booleanValue()) {
                                a(sb2, i11, strSubstring, objJ);
                            }
                        } else if (objJ instanceof Integer) {
                            if (((Integer) objJ).intValue() != 0) {
                                a(sb2, i11, strSubstring, objJ);
                            }
                        } else if (objJ instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objJ).floatValue()) != 0) {
                                a(sb2, i11, strSubstring, objJ);
                            }
                        } else if (!(objJ instanceof Double)) {
                            if (objJ instanceof String) {
                                zEquals = objJ.equals(BuildConfig.VERSION_NAME);
                            } else if (objJ instanceof zzei) {
                                zEquals = objJ.equals(zzei.f12350b);
                            } else if (objJ instanceof zzgl) {
                                if (objJ != ((zzgl) objJ).zzh()) {
                                    a(sb2, i11, strSubstring, objJ);
                                }
                            } else if (!(objJ instanceof Enum) || ((Enum) objJ).ordinal() != 0) {
                                a(sb2, i11, strSubstring, objJ);
                            }
                            if (!zEquals) {
                                a(sb2, i11, strSubstring, objJ);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objJ).doubleValue()) != 0) {
                            a(sb2, i11, strSubstring, objJ);
                        }
                    } else if (((Boolean) zzfi.j(method5, zzfiVar, new Object[0])).booleanValue()) {
                        a(sb2, i11, strSubstring, objJ);
                    }
                }
            }
            i12 = i13;
        }
        if (zzfiVar instanceof zzff) {
            Iterator itA = ((zzff) zzfiVar).zzb.a();
            if (itA.hasNext()) {
                throw null;
            }
        }
        zzhi zzhiVar = zzfiVar.zzc;
        if (zzhiVar != null) {
            for (int i15 = 0; i15 < zzhiVar.f12450a; i15++) {
                a(sb2, i11, String.valueOf(zzhiVar.f12451b[i15] >>> 3), zzhiVar.f12452c[i15]);
            }
        }
    }
}
