package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class SchemaUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f21373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final UnknownFieldSchema f21374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final UnknownFieldSetLiteSchema f21375c;

    static {
        Class<?> cls;
        Class<?> cls2;
        UnknownFieldSchema unknownFieldSchema = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f21373a = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                unknownFieldSchema = (UnknownFieldSchema) cls2.getConstructor(null).newInstance(null);
            } catch (Throwable unused3) {
            }
        }
        f21374b = unknownFieldSchema;
        f21375c = new UnknownFieldSetLiteSchema();
    }

    private SchemaUtil() {
    }

    public static void A(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.i(i11, list, z11);
    }

    public static int a(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iS = 0;
            while (i11 < size) {
                iS += CodedOutputStream.S(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iS;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iS2 = 0;
        while (i11 < size) {
            iS2 += CodedOutputStream.S(intArrayList.f(i11));
            i11++;
        }
        return iS2;
    }

    public static int b(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.V(i11) + 4) * size;
    }

    public static int c(int i11, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream.V(i11) + 8) * size;
    }

    public static int d(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iS = 0;
            while (i11 < size) {
                iS += CodedOutputStream.S(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iS;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iS2 = 0;
        while (i11 < size) {
            iS2 += CodedOutputStream.S(intArrayList.f(i11));
            i11++;
        }
        return iS2;
    }

    public static int e(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iX = 0;
            while (i11 < size) {
                iX += CodedOutputStream.X(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iX;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iX2 = 0;
        while (i11 < size) {
            iX2 += CodedOutputStream.X(longArrayList.f(i11));
            i11++;
        }
        return iX2;
    }

    public static int f(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iW = 0;
            while (i11 < size) {
                iW += CodedOutputStream.W(CodedOutputStream.Y(((Integer) list.get(i11)).intValue()));
                i11++;
            }
            return iW;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iW2 = 0;
        while (i11 < size) {
            iW2 += CodedOutputStream.W(CodedOutputStream.Y(intArrayList.f(i11)));
            i11++;
        }
        return iW2;
    }

    public static int g(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iX = 0;
            while (i11 < size) {
                iX += CodedOutputStream.X(CodedOutputStream.Z(((Long) list.get(i11)).longValue()));
                i11++;
            }
            return iX;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iX2 = 0;
        while (i11 < size) {
            iX2 += CodedOutputStream.X(CodedOutputStream.Z(longArrayList.f(i11)));
            i11++;
        }
        return iX2;
    }

    public static int h(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int iW = 0;
            while (i11 < size) {
                iW += CodedOutputStream.W(((Integer) list.get(i11)).intValue());
                i11++;
            }
            return iW;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int iW2 = 0;
        while (i11 < size) {
            iW2 += CodedOutputStream.W(intArrayList.f(i11));
            i11++;
        }
        return iW2;
    }

    public static int i(List list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int iX = 0;
            while (i11 < size) {
                iX += CodedOutputStream.X(((Long) list.get(i11)).longValue());
                i11++;
            }
            return iX;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int iX2 = 0;
        while (i11 < size) {
            iX2 += CodedOutputStream.X(longArrayList.f(i11));
            i11++;
        }
        return iX2;
    }

    public static Object j(Object obj, int i11, AbstractList abstractList, Internal.EnumLiteMap enumLiteMap, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumLiteMap == null) {
            return obj2;
        }
        int size = abstractList.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) abstractList.get(i13);
            int iIntValue = num.intValue();
            if (enumLiteMap.a(iIntValue) != null) {
                if (i13 != i12) {
                    abstractList.set(i12, num);
                }
                i12++;
            } else {
                obj2 = n(obj, i11, iIntValue, obj2, unknownFieldSchema);
            }
        }
        if (i12 != size) {
            abstractList.subList(i12, size).clear();
        }
        return obj2;
    }

    public static Object k(Object obj, int i11, List list, Internal.EnumVerifier enumVerifier, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (enumVerifier == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                if (!enumVerifier.a(iIntValue)) {
                    obj2 = n(obj, i11, iIntValue, obj2, unknownFieldSchema);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            Integer num = (Integer) list.get(i13);
            int iIntValue2 = num.intValue();
            if (enumVerifier.a(iIntValue2)) {
                if (i13 != i12) {
                    list.set(i12, num);
                }
                i12++;
            } else {
                obj2 = n(obj, i11, iIntValue2, obj2, unknownFieldSchema);
            }
        }
        if (i12 != size) {
            list.subList(i12, size).clear();
        }
        return obj2;
    }

    public static void l(ExtensionSchema extensionSchema, Object obj, Object obj2) {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        FieldSet fieldSetC = extensionSchema.c(obj2);
        if (fieldSetC.f21252a.isEmpty()) {
            return;
        }
        FieldSet fieldSetD = extensionSchema.d(obj);
        fieldSetD.getClass();
        int i11 = 0;
        while (true) {
            anonymousClass1 = fieldSetC.f21252a;
            if (i11 >= anonymousClass1.f21377b.size()) {
                break;
            }
            fieldSetD.k(anonymousClass1.c(i11));
            i11++;
        }
        Iterator it = anonymousClass1.d().iterator();
        while (it.hasNext()) {
            fieldSetD.k((Map.Entry) it.next());
        }
    }

    public static boolean m(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object n(Object obj, int i11, int i12, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        if (obj2 == null) {
            obj2 = unknownFieldSchema.f(obj);
        }
        unknownFieldSchema.e(i12, obj2, i11);
        return obj2;
    }

    public static void o(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.C(i11, list, z11);
    }

    public static void p(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.N(i11, list, z11);
    }

    public static void q(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.B(i11, list, z11);
    }

    public static void r(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.y(i11, list, z11);
    }

    public static void s(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.c(i11, list, z11);
    }

    public static void t(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.q(i11, list, z11);
    }

    public static void u(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.L(i11, list, z11);
    }

    public static void v(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.z(i11, list, z11);
    }

    public static void w(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.h(i11, list, z11);
    }

    public static void x(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.J(i11, list, z11);
    }

    public static void y(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.F(i11, list, z11);
    }

    public static void z(int i11, List list, Writer writer, boolean z11) {
        if (list == null || list.isEmpty()) {
            return;
        }
        writer.E(i11, list, z11);
    }
}
