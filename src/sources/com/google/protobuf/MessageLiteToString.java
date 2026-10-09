package com.google.protobuf;

import com.tbruyelle.rxpermissions3.BuildConfig;
import hh.p0;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import nv.p;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class MessageLiteToString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f21321a;

    static {
        char[] cArr = new char[80];
        f21321a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private MessageLiteToString() {
    }

    public static void a(int i11, StringBuilder sb2) {
        while (i11 > 0) {
            int i12 = 80;
            if (i11 <= 80) {
                i12 = i11;
            }
            sb2.append(f21321a, 0, i12);
            i11 -= i12;
        }
    }

    public static void b(StringBuilder sb2, int i11, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb2, i11, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb2, i11, str, (Map.Entry) it2.next());
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
        if (obj instanceof String) {
            sb2.append(": \"");
            ByteString byteString = ByteString.f21158b;
            sb2.append(TextFormatEscaper.a(new ByteString.LiteralByteString(((String) obj).getBytes(Internal.f21282a))));
            sb2.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb2.append(": \"");
            sb2.append(TextFormatEscaper.a((ByteString) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb2.append(" {");
            c((GeneratedMessageLite) obj, sb2, i11 + 2);
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
        b(sb2, i13, "key", entry.getKey());
        b(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        a(i11, sb2);
        sb2.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:105:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:132:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00e2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0157  */
    /* JADX WARN: Code duplicated, block: B:65:0x0169  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171  */
    /* JADX WARN: Code duplicated, block: B:69:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x0184  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:92:0x01cf  */
    public static void c(GeneratedMessageLite generatedMessageLite, StringBuilder sb2, int i11) {
        int i12;
        java.lang.reflect.Method method;
        java.lang.reflect.Method method2;
        Object objV;
        boolean zBooleanValue;
        boolean zEquals;
        java.lang.reflect.Method method3;
        java.lang.reflect.Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        java.lang.reflect.Method[] declaredMethods = generatedMessageLite.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i13 = 0;
        while (true) {
            i12 = 3;
            if (i13 >= length) {
                break;
            }
            java.lang.reflect.Method method5 = declaredMethods[i13];
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
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method4 = (java.lang.reflect.Method) entry.getValue()) != null && method4.getReturnType().equals(List.class)) {
                b(sb2, i11, p.i(4, 0, strSubstring), GeneratedMessageLite.v(method4, generatedMessageLite, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method3 = (java.lang.reflect.Method) entry.getValue()) != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                b(sb2, i11, p.i(3, 0, strSubstring), GeneratedMessageLite.v(method3, generatedMessageLite, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring))) {
                if (strSubstring.endsWith("Bytes")) {
                    if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                        method = (java.lang.reflect.Method) entry.getValue();
                        method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                        if (method != null) {
                            objV = GeneratedMessageLite.v(method, generatedMessageLite, new Object[0]);
                            if (method2 == null) {
                                zBooleanValue = true;
                                if (objV instanceof Boolean) {
                                    zEquals = !((Boolean) objV).booleanValue();
                                } else if (objV instanceof Integer) {
                                    if (((Integer) objV).intValue() == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objV instanceof Float) {
                                    if (Float.floatToRawIntBits(((Float) objV).floatValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objV instanceof Double) {
                                    if (Double.doubleToRawLongBits(((Double) objV).doubleValue()) == 0) {
                                        zEquals = true;
                                    } else {
                                        zEquals = false;
                                    }
                                } else if (objV instanceof String) {
                                    zEquals = objV.equals(BuildConfig.VERSION_NAME);
                                } else if (objV instanceof ByteString) {
                                    zEquals = objV.equals(ByteString.f21158b);
                                } else if ((objV instanceof MessageLite) ? !((objV instanceof java.lang.Enum) && ((java.lang.Enum) objV).ordinal() == 0) : objV != ((MessageLite) objV).f()) {
                                    zEquals = false;
                                } else {
                                    zEquals = true;
                                }
                                if (zEquals) {
                                    zBooleanValue = false;
                                }
                            } else {
                                zBooleanValue = ((Boolean) GeneratedMessageLite.v(method2, generatedMessageLite, new Object[0])).booleanValue();
                            }
                            if (zBooleanValue) {
                                b(sb2, i11, strSubstring, objV);
                            }
                        }
                    }
                } else {
                    method = (java.lang.reflect.Method) entry.getValue();
                    method2 = (java.lang.reflect.Method) map.get("has".concat(strSubstring));
                    if (method != null) {
                        objV = GeneratedMessageLite.v(method, generatedMessageLite, new Object[0]);
                        if (method2 == null) {
                            zBooleanValue = true;
                            if (objV instanceof Boolean) {
                                zEquals = !((Boolean) objV).booleanValue();
                            } else if (objV instanceof Integer) {
                                if (((Integer) objV).intValue() == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objV instanceof Float) {
                                if (Float.floatToRawIntBits(((Float) objV).floatValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objV instanceof Double) {
                                if (Double.doubleToRawLongBits(((Double) objV).doubleValue()) == 0) {
                                    zEquals = true;
                                } else {
                                    zEquals = false;
                                }
                            } else if (objV instanceof String) {
                                zEquals = objV.equals(BuildConfig.VERSION_NAME);
                            } else if (objV instanceof ByteString) {
                                zEquals = objV.equals(ByteString.f21158b);
                            } else if (objV instanceof MessageLite) {
                                zEquals = false;
                            } else {
                                zEquals = false;
                            }
                            if (zEquals) {
                                zBooleanValue = false;
                            }
                        } else {
                            zBooleanValue = ((Boolean) GeneratedMessageLite.v(method2, generatedMessageLite, new Object[0])).booleanValue();
                        }
                        if (zBooleanValue) {
                            b(sb2, i11, strSubstring, objV);
                        }
                    }
                }
            }
            i12 = 3;
        }
        if (generatedMessageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator itI = ((GeneratedMessageLite.ExtendableMessage) generatedMessageLite).extensions.i();
            while (itI.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itI.next();
                b(sb2, i11, p0.i(((GeneratedMessageLite.ExtensionDescriptor) entry2.getKey()).f21269b, "]", new StringBuilder("[")), entry2.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != null) {
            for (int i14 = 0; i14 < unknownFieldSetLite.f21407a; i14++) {
                b(sb2, i11, String.valueOf(unknownFieldSetLite.f21408b[i14] >>> 3), unknownFieldSetLite.f21409c[i14]);
            }
        }
    }
}
