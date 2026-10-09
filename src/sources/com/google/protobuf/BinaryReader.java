package com.google.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class BinaryReader implements Reader {

    /* JADX INFO: renamed from: com.google.protobuf.BinaryReader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21148a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21148a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21148a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21148a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21148a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21148a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21148a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21148a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21148a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21148a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21148a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21148a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21148a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21148a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21148a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21148a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21148a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21148a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class SafeHeapReader extends BinaryReader {
        public static void R(int i11) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (i11 != 0) {
                throw InvalidProtocolBufferException.d();
            }
        }

        @Override // com.google.protobuf.Reader
        public final Object A(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            R(3);
            Schema schemaA = Protobuf.f21349c.a(cls);
            i(schemaA.d(), schemaA, extensionRegistryLite);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final int B() {
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void C(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final void D(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void E(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void F(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final ByteString G() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void H(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof FloatArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final int I() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final boolean J() {
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final int K() throws InvalidProtocolBufferException {
            R(5);
            Q(4);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void L(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final void M(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof DoubleArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final long N() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final String O() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void P(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof LongArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        public final void Q(int i11) throws InvalidProtocolBufferException {
            if (i11 < 0) {
                throw InvalidProtocolBufferException.h();
            }
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void a(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                w();
                throw null;
            }
            w();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final long b() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final long c() throws InvalidProtocolBufferException {
            R(1);
            Q(8);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void d(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof IntArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final void e(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                x();
                throw null;
            }
            x();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void f(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final void g(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                o();
                throw null;
            }
            o();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final Object h(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            Protobuf.f21349c.a(cls).d();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void i(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            schema.f(obj, this, extensionRegistryLite);
            throw InvalidProtocolBufferException.g();
        }

        @Override // com.google.protobuf.Reader
        public final int j() throws InvalidProtocolBufferException {
            R(5);
            Q(4);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final boolean k() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void l(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final long m() throws InvalidProtocolBufferException {
            R(1);
            Q(8);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void n(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                b();
                throw null;
            }
            b();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final int o() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void p(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof LongArrayList) {
                N();
                throw null;
            }
            N();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void q(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof LongArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final void r(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                I();
                throw null;
            }
            I();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final double readDouble() throws InvalidProtocolBufferException {
            R(1);
            Q(8);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final float readFloat() throws InvalidProtocolBufferException {
            R(5);
            Q(4);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void s(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof IntArrayList) {
                t();
                throw null;
            }
            t();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final int t() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final int u() {
            return 0;
        }

        @Override // com.google.protobuf.Reader
        public final void v(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (!(list instanceof IntArrayList)) {
                throw InvalidProtocolBufferException.d();
            }
            throw InvalidProtocolBufferException.d();
        }

        @Override // com.google.protobuf.Reader
        public final int w() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final long x() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(0);
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final void y(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
            if (list instanceof BooleanArrayList) {
                k();
                throw null;
            }
            k();
            throw null;
        }

        @Override // com.google.protobuf.Reader
        public final String z() throws InvalidProtocolBufferException.InvalidWireTypeException {
            R(2);
            throw null;
        }
    }

    private BinaryReader() {
    }
}
