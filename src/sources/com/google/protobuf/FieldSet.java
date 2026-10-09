package com.google.protobuf;

import com.google.android.material.datepicker.d;
import com.google.protobuf.FieldSet.FieldDescriptorLite;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class FieldSet<T extends FieldDescriptorLite<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final FieldSet f21251d = new FieldSet(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SmallSortedMap.AnonymousClass1 f21252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f21254c;

    /* JADX INFO: renamed from: com.google.protobuf.FieldSet$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f21256b;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21256b = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21256b[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21256b[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21256b[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21256b[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21256b[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21256b[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21256b[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21256b[WireFormat.FieldType.GROUP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21256b[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21256b[WireFormat.FieldType.STRING.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21256b[WireFormat.FieldType.BYTES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21256b[WireFormat.FieldType.UINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21256b[WireFormat.FieldType.SFIXED32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21256b[WireFormat.FieldType.SFIXED64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21256b[WireFormat.FieldType.SINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21256b[WireFormat.FieldType.SINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f21256b[WireFormat.FieldType.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[WireFormat.JavaType.values().length];
            f21255a = iArr2;
            try {
                iArr2[WireFormat.JavaType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f21255a[WireFormat.JavaType.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f21255a[WireFormat.JavaType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f21255a[WireFormat.JavaType.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f21255a[WireFormat.JavaType.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f21255a[WireFormat.JavaType.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f21255a[WireFormat.JavaType.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f21255a[WireFormat.JavaType.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f21255a[WireFormat.JavaType.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Builder<T extends FieldDescriptorLite<T>> {
        private Builder() {
            int i11 = SmallSortedMap.H;
            new SmallSortedMap.AnonymousClass1(16);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface FieldDescriptorLite<T extends FieldDescriptorLite<T>> extends Comparable<T> {
        WireFormat.FieldType D();

        GeneratedMessageLite.Builder W(MessageLite.Builder builder, MessageLite messageLite);

        int d();

        WireFormat.JavaType l1();

        boolean m1();

        boolean x();
    }

    private FieldSet() {
        this.f21252a = new SmallSortedMap.AnonymousClass1(16);
    }

    public static int b(WireFormat.FieldType fieldType, int i11, Object obj) {
        int iV = CodedOutputStream.V(i11);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iV *= 2;
        }
        return iV + c(fieldType, obj);
    }

    public static int c(WireFormat.FieldType fieldType, Object obj) {
        int iH;
        int iW;
        switch (AnonymousClass1.f21256b[fieldType.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                Logger logger = CodedOutputStream.f21211b;
                return 8;
            case 2:
                ((Float) obj).getClass();
                Logger logger2 = CodedOutputStream.f21211b;
                return 4;
            case 3:
                return CodedOutputStream.X(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.X(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.S(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                Logger logger3 = CodedOutputStream.f21211b;
                return 8;
            case 7:
                ((Integer) obj).getClass();
                Logger logger4 = CodedOutputStream.f21211b;
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                Logger logger5 = CodedOutputStream.f21211b;
                return 1;
            case 9:
                Logger logger6 = CodedOutputStream.f21211b;
                return ((MessageLite) obj).h();
            case 10:
                if (obj instanceof LazyField) {
                    return CodedOutputStream.T((LazyField) obj);
                }
                Logger logger7 = CodedOutputStream.f21211b;
                iH = ((MessageLite) obj).h();
                iW = CodedOutputStream.W(iH);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    return CodedOutputStream.U((String) obj);
                }
                Logger logger8 = CodedOutputStream.f21211b;
                iH = ((ByteString) obj).size();
                iW = CodedOutputStream.W(iH);
                break;
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    Logger logger9 = CodedOutputStream.f21211b;
                    iH = ((byte[]) obj).length;
                    iW = CodedOutputStream.W(iH);
                } else {
                    Logger logger10 = CodedOutputStream.f21211b;
                    iH = ((ByteString) obj).size();
                    iW = CodedOutputStream.W(iH);
                }
                break;
            case 13:
                return CodedOutputStream.W(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = CodedOutputStream.f21211b;
                return 4;
            case 15:
                ((Long) obj).getClass();
                Logger logger12 = CodedOutputStream.f21211b;
                return 8;
            case 16:
                return CodedOutputStream.W(CodedOutputStream.Y(((Integer) obj).intValue()));
            case 17:
                return CodedOutputStream.X(CodedOutputStream.Z(((Long) obj).longValue()));
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.S(((Internal.EnumLite) obj).d()) : CodedOutputStream.S(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return iW + iH;
    }

    public static int d(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType fieldTypeD = fieldDescriptorLite.D();
        int iD = fieldDescriptorLite.d();
        if (!fieldDescriptorLite.x()) {
            return b(fieldTypeD, iD, obj);
        }
        List list = (List) obj;
        int iB = 0;
        if (!fieldDescriptorLite.m1()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iB += b(fieldTypeD, iD, it.next());
            }
            return iB;
        }
        if (list.isEmpty()) {
            return 0;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            iB += c(fieldTypeD, it2.next());
        }
        return CodedOutputStream.W(iB) + CodedOutputStream.V(iD) + iB;
    }

    public static int f(Map.Entry entry) {
        int iV = CodedOutputStream.V(3);
        int iV2 = CodedOutputStream.V(2);
        int iV3 = CodedOutputStream.V(1);
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (fieldDescriptorLite.l1() != WireFormat.JavaType.MESSAGE || fieldDescriptorLite.x() || fieldDescriptorLite.m1()) {
            return d(fieldDescriptorLite, value);
        }
        if (value instanceof LazyField) {
            int iW = CodedOutputStream.W(((FieldDescriptorLite) entry.getKey()).d()) + iV2;
            return CodedOutputStream.T((LazyField) value) + iV + iW + (iV3 * 2);
        }
        int iW2 = CodedOutputStream.W(((FieldDescriptorLite) entry.getKey()).d()) + iV2;
        int iH = ((MessageLite) value).h();
        return d.b(iH, iH, iV, iW2 + (iV3 * 2));
    }

    public static boolean h(Map.Entry entry) {
        boolean zC;
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        if (fieldDescriptorLite.l1() == WireFormat.JavaType.MESSAGE) {
            if (!fieldDescriptorLite.x()) {
                Object value = entry.getValue();
                if (value instanceof MessageLiteOrBuilder) {
                    return ((MessageLiteOrBuilder) value).c();
                }
                if (value instanceof LazyField) {
                    return true;
                }
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            for (Object obj : (List) entry.getValue()) {
                if (obj instanceof MessageLiteOrBuilder) {
                    zC = ((MessageLiteOrBuilder) obj).c();
                } else {
                    if (!(obj instanceof LazyField)) {
                        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                    }
                    zC = true;
                }
                if (!zC) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void m(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        WireFormat.FieldType fieldTypeD = fieldDescriptorLite.D();
        Charset charset = Internal.f21282a;
        obj.getClass();
        boolean z11 = true;
        switch (AnonymousClass1.f21255a[fieldTypeD.a().ordinal()]) {
            case 1:
                z11 = obj instanceof Integer;
                break;
            case 2:
                z11 = obj instanceof Long;
                break;
            case 3:
                z11 = obj instanceof Float;
                break;
            case 4:
                z11 = obj instanceof Double;
                break;
            case 5:
                z11 = obj instanceof Boolean;
                break;
            case 6:
                z11 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof ByteString) && !(obj instanceof byte[])) {
                    z11 = false;
                }
                break;
            case 8:
                if (!(obj instanceof Integer) && !(obj instanceof Internal.EnumLite)) {
                    z11 = false;
                }
                break;
            case 9:
                if (!(obj instanceof MessageLite) && !(obj instanceof LazyField)) {
                    z11 = false;
                }
                break;
            default:
                z11 = false;
                break;
        }
        if (!z11) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldDescriptorLite.d()), fieldDescriptorLite.D().a(), obj.getClass().getName()));
        }
    }

    public static void n(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i11, Object obj) {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.p0(i11, 3);
            ((MessageLite) obj).d(codedOutputStream);
            codedOutputStream.p0(i11, 4);
        }
        codedOutputStream.p0(i11, fieldType.b());
        switch (AnonymousClass1.f21256b[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.h0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 2:
                codedOutputStream.g0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 3:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.r0(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.i0(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.h0(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.g0(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.d0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 9:
                ((MessageLite) obj).d(codedOutputStream);
                break;
            case 10:
                codedOutputStream.l0((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.o0((String) obj);
                } else {
                    codedOutputStream.f0((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    byte[] bArr = (byte[]) obj;
                    codedOutputStream.e0(bArr, bArr.length);
                } else {
                    codedOutputStream.f0((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.q0(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.g0(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.h0(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.q0(CodedOutputStream.Y(((Integer) obj).intValue()));
                break;
            case 17:
                codedOutputStream.r0(CodedOutputStream.Z(((Long) obj).longValue()));
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.i0(((Integer) obj).intValue());
                } else {
                    codedOutputStream.i0(((Internal.EnumLite) obj).d());
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final FieldSet clone() {
        SmallSortedMap.AnonymousClass1 anonymousClass1;
        FieldSet fieldSet = new FieldSet();
        int i11 = 0;
        while (true) {
            anonymousClass1 = this.f21252a;
            if (i11 >= anonymousClass1.f21377b.size()) {
                break;
            }
            Map.Entry entryC = anonymousClass1.c(i11);
            fieldSet.l((FieldDescriptorLite) entryC.getKey(), entryC.getValue());
            i11++;
        }
        for (Map.Entry entry : anonymousClass1.d()) {
            fieldSet.l((FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        fieldSet.f21254c = this.f21254c;
        return fieldSet;
    }

    public final Object e(FieldDescriptorLite fieldDescriptorLite) {
        Object obj = this.f21252a.get(fieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).a(null) : obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.f21252a.equals(((FieldSet) obj).f21252a);
        }
        return false;
    }

    public final boolean g() {
        int i11 = 0;
        while (true) {
            SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f21252a;
            if (i11 >= anonymousClass1.f21377b.size()) {
                Iterator it = anonymousClass1.d().iterator();
                while (it.hasNext()) {
                    if (!h((Map.Entry) it.next())) {
                        break;
                    }
                }
                return true;
            }
            if (!h(anonymousClass1.c(i11))) {
                break;
            }
            i11++;
        }
        return false;
    }

    public final int hashCode() {
        return this.f21252a.hashCode();
    }

    public final Iterator i() {
        boolean z11 = this.f21254c;
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f21252a;
        return z11 ? new LazyField.LazyIterator(((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator()) : ((SmallSortedMap.EntrySet) anonymousClass1.entrySet()).iterator();
    }

    public final void j() {
        if (this.f21253b) {
            return;
        }
        int i11 = 0;
        while (true) {
            SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f21252a;
            if (i11 >= anonymousClass1.f21377b.size()) {
                anonymousClass1.f();
                this.f21253b = true;
                return;
            }
            Map.Entry entryC = anonymousClass1.c(i11);
            if (entryC.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) entryC.getValue();
                generatedMessageLite.getClass();
                Protobuf protobuf = Protobuf.f21349c;
                protobuf.getClass();
                protobuf.a(generatedMessageLite.getClass()).b(generatedMessageLite);
                generatedMessageLite.y();
            }
            i11++;
        }
    }

    public final void k(Map.Entry entry) {
        FieldDescriptorLite fieldDescriptorLite = (FieldDescriptorLite) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).a(null);
        }
        boolean zX = fieldDescriptorLite.x();
        SmallSortedMap.AnonymousClass1 anonymousClass1 = this.f21252a;
        if (zX) {
            Object objE = e(fieldDescriptorLite);
            if (objE == null) {
                objE = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) objE;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            anonymousClass1.put(fieldDescriptorLite, objE);
            return;
        }
        if (fieldDescriptorLite.l1() != WireFormat.JavaType.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            anonymousClass1.put(fieldDescriptorLite, value);
            return;
        }
        Object objE2 = e(fieldDescriptorLite);
        if (objE2 != null) {
            anonymousClass1.put(fieldDescriptorLite, fieldDescriptorLite.W(((MessageLite) objE2).a(), (MessageLite) value).l());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        anonymousClass1.put(fieldDescriptorLite, value);
    }

    public final void l(FieldDescriptorLite fieldDescriptorLite, Object obj) {
        if (!fieldDescriptorLite.x()) {
            m(fieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj2 = arrayList.get(i11);
                i11++;
                m(fieldDescriptorLite, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.f21254c = true;
        }
        this.f21252a.put(fieldDescriptorLite, obj);
    }

    public FieldSet(int i11) {
        int i12 = SmallSortedMap.H;
        this.f21252a = new SmallSortedMap.AnonymousClass1(0);
        j();
        j();
    }
}
