package com.google.protobuf;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class CodedOutputStreamWriter implements Writer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedOutputStream f21222a;

    /* JADX INFO: renamed from: com.google.protobuf.CodedOutputStreamWriter$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21223a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21223a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21223a[WireFormat.FieldType.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21223a[WireFormat.FieldType.INT32.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21223a[WireFormat.FieldType.SFIXED32.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21223a[WireFormat.FieldType.SINT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21223a[WireFormat.FieldType.UINT32.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21223a[WireFormat.FieldType.FIXED64.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21223a[WireFormat.FieldType.INT64.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21223a[WireFormat.FieldType.SFIXED64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21223a[WireFormat.FieldType.SINT64.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21223a[WireFormat.FieldType.UINT64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21223a[WireFormat.FieldType.STRING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public CodedOutputStreamWriter(CodedOutputStream codedOutputStream) {
        Internal.a(codedOutputStream, "output");
        this.f21222a = codedOutputStream;
        codedOutputStream.f21213a = this;
    }

    @Override // com.google.protobuf.Writer
    public final void A(int i11, long j11) {
        this.f21222a.k(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public final void B(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.f(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = CodedOutputStream.f21211b;
            i13 += 4;
        }
        codedOutputStream.q0(i13);
        while (i12 < list.size()) {
            codedOutputStream.g0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void C(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.s(i11, ((Boolean) list.get(i12)).booleanValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Boolean) list.get(i14)).getClass();
            Logger logger = CodedOutputStream.f21211b;
            i13++;
        }
        codedOutputStream.q0(i13);
        while (i12 < list.size()) {
            codedOutputStream.d0(((Boolean) list.get(i12)).booleanValue() ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void D(int i11, MapEntryLite.Metadata metadata, Map map) {
        CodedOutputStream codedOutputStream = this.f21222a;
        codedOutputStream.getClass();
        for (Map.Entry entry : map.entrySet()) {
            codedOutputStream.p0(i11, 2);
            codedOutputStream.q0(MapEntryLite.a(metadata, entry.getKey(), entry.getValue()));
            MapEntryLite.b(codedOutputStream, metadata, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.protobuf.Writer
    public final void E(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.d(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int iW = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iW += CodedOutputStream.W(((Integer) list.get(i13)).intValue());
        }
        codedOutputStream.q0(iW);
        while (i12 < list.size()) {
            codedOutputStream.q0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void F(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.o(i11, CodedOutputStream.Z(((Long) list.get(i12)).longValue()));
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int iX = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iX += CodedOutputStream.X(CodedOutputStream.Z(((Long) list.get(i13)).longValue()));
        }
        codedOutputStream.q0(iX);
        while (i12 < list.size()) {
            codedOutputStream.r0(CodedOutputStream.Z(((Long) list.get(i12)).longValue()));
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void G(int i11, long j11) {
        this.f21222a.o(i11, CodedOutputStream.Z(j11));
    }

    @Override // com.google.protobuf.Writer
    public final void H(int i11, float f5) {
        CodedOutputStream codedOutputStream = this.f21222a;
        codedOutputStream.getClass();
        codedOutputStream.f(i11, Float.floatToRawIntBits(f5));
    }

    @Override // com.google.protobuf.Writer
    public final void I(int i11) {
        this.f21222a.p0(i11, 4);
    }

    @Override // com.google.protobuf.Writer
    public final void J(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.d(i11, CodedOutputStream.Y(((Integer) list.get(i12)).intValue()));
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int iW = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iW += CodedOutputStream.W(CodedOutputStream.Y(((Integer) list.get(i13)).intValue()));
        }
        codedOutputStream.q0(iW);
        while (i12 < list.size()) {
            codedOutputStream.q0(CodedOutputStream.Y(((Integer) list.get(i12)).intValue()));
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void K(int i11, int i12) {
        this.f21222a.x(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void L(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.o(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int iX = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iX += CodedOutputStream.X(((Long) list.get(i13)).longValue());
        }
        codedOutputStream.q0(iX);
        while (i12 < list.size()) {
            codedOutputStream.r0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void M(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.x(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int iS = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iS += CodedOutputStream.S(((Integer) list.get(i13)).intValue());
        }
        codedOutputStream.q0(iS);
        while (i12 < list.size()) {
            codedOutputStream.i0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void N(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                double dDoubleValue = ((Double) list.get(i12)).doubleValue();
                codedOutputStream.getClass();
                codedOutputStream.k(i11, Double.doubleToRawLongBits(dDoubleValue));
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Double) list.get(i14)).getClass();
            Logger logger = CodedOutputStream.f21211b;
            i13 += 8;
        }
        codedOutputStream.q0(i13);
        while (i12 < list.size()) {
            codedOutputStream.h0(Double.doubleToRawLongBits(((Double) list.get(i12)).doubleValue()));
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void O(int i11, int i12) {
        this.f21222a.d(i11, CodedOutputStream.Y(i12));
    }

    @Override // com.google.protobuf.Writer
    public final void P(int i11, List list) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f21222a.w(i11, (ByteString) list.get(i12));
        }
    }

    @Override // com.google.protobuf.Writer
    public final void a(int i11, List list, Schema schema) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            j(i11, list.get(i12), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void b(int i11, List list, Schema schema) {
        for (int i12 = 0; i12 < list.size(); i12++) {
            t(i11, list.get(i12), schema);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void c(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                float fFloatValue = ((Float) list.get(i12)).floatValue();
                codedOutputStream.getClass();
                codedOutputStream.f(i11, Float.floatToRawIntBits(fFloatValue));
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Float) list.get(i14)).getClass();
            Logger logger = CodedOutputStream.f21211b;
            i13 += 4;
        }
        codedOutputStream.q0(i13);
        while (i12 < list.size()) {
            codedOutputStream.g0(Float.floatToRawIntBits(((Float) list.get(i12)).floatValue()));
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void d(int i11, int i12) {
        this.f21222a.d(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void e(int i11, Object obj) {
        boolean z11 = obj instanceof ByteString;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (z11) {
            codedOutputStream.n0(i11, (ByteString) obj);
        } else {
            codedOutputStream.m0(i11, (MessageLite) obj);
        }
    }

    @Override // com.google.protobuf.Writer
    public final void f(int i11, int i12) {
        this.f21222a.f(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void g(int i11, double d5) {
        CodedOutputStream codedOutputStream = this.f21222a;
        codedOutputStream.getClass();
        codedOutputStream.k(i11, Double.doubleToRawLongBits(d5));
    }

    @Override // com.google.protobuf.Writer
    public final void h(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.k(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = CodedOutputStream.f21211b;
            i13 += 8;
        }
        codedOutputStream.q0(i13);
        while (i12 < list.size()) {
            codedOutputStream.h0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void i(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.o(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int iX = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iX += CodedOutputStream.X(((Long) list.get(i13)).longValue());
        }
        codedOutputStream.q0(iX);
        while (i12 < list.size()) {
            codedOutputStream.r0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void j(int i11, Object obj, Schema schema) {
        this.f21222a.k0(i11, (MessageLite) obj, schema);
    }

    @Override // com.google.protobuf.Writer
    public final void k(int i11, long j11) {
        this.f21222a.k(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public final Writer.FieldOrder l() {
        return Writer.FieldOrder.ASCENDING;
    }

    @Override // com.google.protobuf.Writer
    public final void m(int i11, List list) {
        boolean z11 = list instanceof LazyStringList;
        CodedOutputStream codedOutputStream = this.f21222a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.n(i11, (String) list.get(i12));
                i12++;
            }
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        while (i12 < list.size()) {
            Object objJ1 = lazyStringList.j1(i12);
            if (objJ1 instanceof String) {
                codedOutputStream.n(i11, (String) objJ1);
            } else {
                codedOutputStream.w(i11, (ByteString) objJ1);
            }
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void n(int i11, String str) {
        this.f21222a.n(i11, str);
    }

    @Override // com.google.protobuf.Writer
    public final void o(int i11, long j11) {
        this.f21222a.o(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public final void p(int i11, Object obj) {
        this.f21222a.j0(i11, (MessageLite) obj);
    }

    @Override // com.google.protobuf.Writer
    public final void q(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.x(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int iS = 0;
        for (int i13 = 0; i13 < list.size(); i13++) {
            iS += CodedOutputStream.S(((Integer) list.get(i13)).intValue());
        }
        codedOutputStream.q0(iS);
        while (i12 < list.size()) {
            codedOutputStream.i0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void r(int i11, long j11) {
        this.f21222a.o(i11, j11);
    }

    @Override // com.google.protobuf.Writer
    public final void s(int i11, boolean z11) {
        this.f21222a.s(i11, z11);
    }

    @Override // com.google.protobuf.Writer
    public final void t(int i11, Object obj, Schema schema) {
        CodedOutputStream codedOutputStream = this.f21222a;
        codedOutputStream.p0(i11, 3);
        schema.e((MessageLite) obj, codedOutputStream.f21213a);
        codedOutputStream.p0(i11, 4);
    }

    @Override // com.google.protobuf.Writer
    public final void u(int i11, int i12) {
        this.f21222a.f(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void v(int i11) {
        this.f21222a.p0(i11, 3);
    }

    @Override // com.google.protobuf.Writer
    public final void w(int i11, ByteString byteString) {
        this.f21222a.w(i11, byteString);
    }

    @Override // com.google.protobuf.Writer
    public final void x(int i11, int i12) {
        this.f21222a.x(i11, i12);
    }

    @Override // com.google.protobuf.Writer
    public final void y(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.k(i11, ((Long) list.get(i12)).longValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Long) list.get(i14)).getClass();
            Logger logger = CodedOutputStream.f21211b;
            i13 += 8;
        }
        codedOutputStream.q0(i13);
        while (i12 < list.size()) {
            codedOutputStream.h0(((Long) list.get(i12)).longValue());
            i12++;
        }
    }

    @Override // com.google.protobuf.Writer
    public final void z(int i11, List list, boolean z11) {
        int i12 = 0;
        CodedOutputStream codedOutputStream = this.f21222a;
        if (!z11) {
            while (i12 < list.size()) {
                codedOutputStream.f(i11, ((Integer) list.get(i12)).intValue());
                i12++;
            }
            return;
        }
        codedOutputStream.p0(i11, 2);
        int i13 = 0;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((Integer) list.get(i14)).getClass();
            Logger logger = CodedOutputStream.f21211b;
            i13 += 4;
        }
        codedOutputStream.q0(i13);
        while (i12 < list.size()) {
            codedOutputStream.g0(((Integer) list.get(i12)).intValue());
            i12++;
        }
    }
}
