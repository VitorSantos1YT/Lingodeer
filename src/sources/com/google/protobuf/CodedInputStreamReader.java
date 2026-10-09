package com.google.protobuf;

import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
final class CodedInputStreamReader implements Reader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CodedInputStream f21206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f21207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f21208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f21209d = 0;

    /* JADX INFO: renamed from: com.google.protobuf.CodedInputStreamReader$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21210a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f21210a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21210a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21210a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21210a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21210a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21210a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21210a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21210a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21210a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f21210a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f21210a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f21210a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f21210a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f21210a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f21210a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f21210a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f21210a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public CodedInputStreamReader(CodedInputStream codedInputStream) {
        Internal.a(codedInputStream, "input");
        this.f21206a = codedInputStream;
        codedInputStream.f21173d = this;
    }

    public static void W(int i11) throws InvalidProtocolBufferException {
        if ((i11 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void X(int i11) throws InvalidProtocolBufferException {
        if ((i11 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // com.google.protobuf.Reader
    public final Object A(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(3);
        Schema schemaA = Protobuf.f21349c.a(cls);
        Object objD = schemaA.d();
        Q(objD, schemaA, extensionRegistryLite);
        schemaA.b(objD);
        return objD;
    }

    @Override // com.google.protobuf.Reader
    public final int B() {
        int i11 = this.f21209d;
        if (i11 != 0) {
            this.f21207b = i11;
            this.f21209d = 0;
        } else {
            this.f21207b = this.f21206a.y();
        }
        int i12 = this.f21207b;
        if (i12 == 0 || i12 == this.f21208c) {
            return Integer.MAX_VALUE;
        }
        return i12 >>> 3;
    }

    @Override // com.google.protobuf.Reader
    public final void C(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(list, false);
    }

    @Override // com.google.protobuf.Reader
    public final void D(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        V(2);
        R(obj, schema, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Reader
    public final void E(Map map, MapEntryLite.Metadata metadata, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        CodedInputStream codedInputStream = this.f21206a;
        int i11 = codedInputStream.i(codedInputStream.z());
        metadata.getClass();
        Object obj = metadata.f21316c;
        Object objS = BuildConfig.VERSION_NAME;
        Object objS2 = obj;
        while (true) {
            try {
                int iB = B();
                if (iB == Integer.MAX_VALUE || codedInputStream.e()) {
                    break;
                }
                if (iB == 1) {
                    objS = S(metadata.f21314a, null, null);
                } else if (iB != 2) {
                    try {
                        if (!J()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                        if (!J()) {
                            throw new InvalidProtocolBufferException("Unable to parse map entry.");
                        }
                    }
                } else {
                    objS2 = S(metadata.f21315b, obj.getClass(), extensionRegistryLite);
                }
            } catch (Throwable th2) {
                codedInputStream.h(i11);
                throw th2;
            }
        }
        map.put(objS, objS2);
        codedInputStream.h(i11);
    }

    @Override // com.google.protobuf.Reader
    public final void F(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        T(list, true);
    }

    @Override // com.google.protobuf.Reader
    public final ByteString G() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f21206a.k();
    }

    @Override // com.google.protobuf.Reader
    public final void H(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof FloatArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 2) {
                int iZ = codedInputStream.z();
                W(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Float.valueOf(codedInputStream.p()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Float.valueOf(codedInputStream.p()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.f21207b);
            this.f21209d = iY;
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 2) {
            int iZ2 = codedInputStream.z();
            W(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                floatArrayList.d(codedInputStream.p());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i12 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            floatArrayList.d(codedInputStream.p());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.f21207b);
        this.f21209d = iY2;
    }

    @Override // com.google.protobuf.Reader
    public final int I() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f21206a.q();
    }

    @Override // com.google.protobuf.Reader
    public final boolean J() {
        int i11;
        CodedInputStream codedInputStream = this.f21206a;
        if (codedInputStream.e() || (i11 = this.f21207b) == this.f21208c) {
            return false;
        }
        return codedInputStream.B(i11);
    }

    @Override // com.google.protobuf.Reader
    public final int K() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f21206a.s();
    }

    @Override // com.google.protobuf.Reader
    public final void L(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        if ((this.f21207b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(G());
            CodedInputStream codedInputStream = this.f21206a;
            if (codedInputStream.e()) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == this.f21207b);
        this.f21209d = iY;
    }

    @Override // com.google.protobuf.Reader
    public final void M(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof DoubleArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 1) {
                do {
                    list.add(Double.valueOf(codedInputStream.l()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iZ = codedInputStream.z();
            X(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Double.valueOf(codedInputStream.l()));
            } while (codedInputStream.d() < iD);
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 1) {
            do {
                doubleArrayList.d(codedInputStream.l());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iZ2 = codedInputStream.z();
        X(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            doubleArrayList.d(codedInputStream.l());
        } while (codedInputStream.d() < iD2);
    }

    @Override // com.google.protobuf.Reader
    public final long N() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f21206a.r();
    }

    @Override // com.google.protobuf.Reader
    public final String O() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f21206a.x();
    }

    @Override // com.google.protobuf.Reader
    public final void P(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.o()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iZ = codedInputStream.z();
            X(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Long.valueOf(codedInputStream.o()));
            } while (codedInputStream.d() < iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 1) {
            do {
                longArrayList.d(codedInputStream.o());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iZ2 = codedInputStream.z();
        X(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            longArrayList.d(codedInputStream.o());
        } while (codedInputStream.d() < iD2);
    }

    public final void Q(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) {
        int i11 = this.f21208c;
        this.f21208c = ((this.f21207b >>> 3) << 3) | 4;
        try {
            schema.f(obj, this, extensionRegistryLite);
            if (this.f21207b != this.f21208c) {
                throw InvalidProtocolBufferException.g();
            }
            this.f21208c = i11;
        } catch (Throwable th2) {
            this.f21208c = i11;
            throw th2;
        }
    }

    public final void R(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream = this.f21206a;
        int iZ = codedInputStream.z();
        if (codedInputStream.f21170a >= codedInputStream.f21171b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i11 = codedInputStream.i(iZ);
        codedInputStream.f21170a++;
        schema.f(obj, this, extensionRegistryLite);
        codedInputStream.a(0);
        codedInputStream.f21170a--;
        codedInputStream.h(i11);
    }

    public final Object S(WireFormat.FieldType fieldType, Class cls, ExtensionRegistryLite extensionRegistryLite) {
        switch (AnonymousClass1.f21210a[fieldType.ordinal()]) {
            case 1:
                return Boolean.valueOf(k());
            case 2:
                return G();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(t());
            case 5:
                return Integer.valueOf(j());
            case 6:
                return Long.valueOf(c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(I());
            case 9:
                return Long.valueOf(N());
            case 10:
                return h(cls, extensionRegistryLite);
            case 11:
                return Integer.valueOf(K());
            case 12:
                return Long.valueOf(m());
            case 13:
                return Integer.valueOf(w());
            case 14:
                return Long.valueOf(x());
            case 15:
                return O();
            case 16:
                return Integer.valueOf(o());
            case 17:
                return Long.valueOf(b());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final void T(List list, boolean z11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        int iY2;
        if ((this.f21207b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z12 = list instanceof LazyStringList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z12 || z11) {
            do {
                list.add(z11 ? O() : z());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.f21207b);
            this.f21209d = iY;
            return;
        }
        LazyStringList lazyStringList = (LazyStringList) list;
        do {
            lazyStringList.F(G());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.f21207b);
        this.f21209d = iY2;
    }

    public final void U(int i11) throws InvalidProtocolBufferException {
        if (this.f21206a.d() != i11) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void V(int i11) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f21207b & 7) != i11) {
            throw InvalidProtocolBufferException.d();
        }
    }

    @Override // com.google.protobuf.Reader
    public final void a(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.u()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.u()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 0) {
            do {
                intArrayList.d(codedInputStream.u());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.d(codedInputStream.u());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // com.google.protobuf.Reader
    public final long b() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f21206a.A();
    }

    @Override // com.google.protobuf.Reader
    public final long c() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f21206a.o();
    }

    @Override // com.google.protobuf.Reader
    public final void d(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 2) {
                int iZ = codedInputStream.z();
                W(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Integer.valueOf(codedInputStream.s()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.s()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.f21207b);
            this.f21209d = iY;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 2) {
            int iZ2 = codedInputStream.z();
            W(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                intArrayList.d(codedInputStream.s());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i12 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            intArrayList.d(codedInputStream.s());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.f21207b);
        this.f21209d = iY2;
    }

    @Override // com.google.protobuf.Reader
    public final void e(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.v()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.v()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 0) {
            do {
                longArrayList.d(codedInputStream.v());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.d(codedInputStream.v());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // com.google.protobuf.Reader
    public final void f(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iY;
        int i11 = this.f21207b;
        if ((i11 & 7) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            Object objD = schema.d();
            Q(objD, schema, extensionRegistryLite);
            schema.b(objD);
            list.add(objD);
            CodedInputStream codedInputStream = this.f21206a;
            if (codedInputStream.e() || this.f21209d != 0) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == i11);
        this.f21209d = iY;
    }

    @Override // com.google.protobuf.Reader
    public final void g(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.z()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.z()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 0) {
            do {
                intArrayList.d(codedInputStream.z());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.d(codedInputStream.z());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // com.google.protobuf.Reader
    public final Object h(Class cls, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        V(2);
        Schema schemaA = Protobuf.f21349c.a(cls);
        Object objD = schemaA.d();
        R(objD, schemaA, extensionRegistryLite);
        schemaA.b(objD);
        return objD;
    }

    @Override // com.google.protobuf.Reader
    public final void i(Object obj, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(3);
        Q(obj, schema, extensionRegistryLite);
    }

    @Override // com.google.protobuf.Reader
    public final int j() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f21206a.n();
    }

    @Override // com.google.protobuf.Reader
    public final boolean k() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f21206a.j();
    }

    @Override // com.google.protobuf.Reader
    public final void l(List list, Schema schema, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        int iY;
        int i11 = this.f21207b;
        if ((i11 & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            Object objD = schema.d();
            R(objD, schema, extensionRegistryLite);
            schema.b(objD);
            list.add(objD);
            CodedInputStream codedInputStream = this.f21206a;
            if (codedInputStream.e() || this.f21209d != 0) {
                return;
            } else {
                iY = codedInputStream.y();
            }
        } while (iY == i11);
        this.f21209d = iY;
    }

    @Override // com.google.protobuf.Reader
    public final long m() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f21206a.t();
    }

    @Override // com.google.protobuf.Reader
    public final void n(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.A()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.A()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 0) {
            do {
                longArrayList.d(codedInputStream.A());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.d(codedInputStream.A());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // com.google.protobuf.Reader
    public final int o() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f21206a.z();
    }

    @Override // com.google.protobuf.Reader
    public final void p(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 0) {
                do {
                    list.add(Long.valueOf(codedInputStream.r()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Long.valueOf(codedInputStream.r()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 0) {
            do {
                longArrayList.d(codedInputStream.r());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            longArrayList.d(codedInputStream.r());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // com.google.protobuf.Reader
    public final void q(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof LongArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 1) {
                do {
                    list.add(Long.valueOf(codedInputStream.t()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iZ = codedInputStream.z();
            X(iZ);
            int iD = codedInputStream.d() + iZ;
            do {
                list.add(Long.valueOf(codedInputStream.t()));
            } while (codedInputStream.d() < iD);
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 1) {
            do {
                longArrayList.d(codedInputStream.t());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iZ2 = codedInputStream.z();
        X(iZ2);
        int iD2 = codedInputStream.d() + iZ2;
        do {
            longArrayList.d(codedInputStream.t());
        } while (codedInputStream.d() < iD2);
    }

    @Override // com.google.protobuf.Reader
    public final void r(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.q()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.q()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 0) {
            do {
                intArrayList.d(codedInputStream.q());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.d(codedInputStream.q());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // com.google.protobuf.Reader
    public final double readDouble() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(1);
        return this.f21206a.l();
    }

    @Override // com.google.protobuf.Reader
    public final float readFloat() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(5);
        return this.f21206a.p();
    }

    @Override // com.google.protobuf.Reader
    public final void s(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 0) {
                do {
                    list.add(Integer.valueOf(codedInputStream.m()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Integer.valueOf(codedInputStream.m()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 0) {
            do {
                intArrayList.d(codedInputStream.m());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            intArrayList.d(codedInputStream.m());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // com.google.protobuf.Reader
    public final int t() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f21206a.m();
    }

    @Override // com.google.protobuf.Reader
    public final int u() {
        return this.f21207b;
    }

    @Override // com.google.protobuf.Reader
    public final void v(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof IntArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 2) {
                int iZ = codedInputStream.z();
                W(iZ);
                int iD = codedInputStream.d() + iZ;
                do {
                    list.add(Integer.valueOf(codedInputStream.n()));
                } while (codedInputStream.d() < iD);
                return;
            }
            if (i11 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            do {
                list.add(Integer.valueOf(codedInputStream.n()));
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY = codedInputStream.y();
                }
            } while (iY == this.f21207b);
            this.f21209d = iY;
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 2) {
            int iZ2 = codedInputStream.z();
            W(iZ2);
            int iD2 = codedInputStream.d() + iZ2;
            do {
                intArrayList.d(codedInputStream.n());
            } while (codedInputStream.d() < iD2);
            return;
        }
        if (i12 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            intArrayList.d(codedInputStream.n());
            if (codedInputStream.e()) {
                return;
            } else {
                iY2 = codedInputStream.y();
            }
        } while (iY2 == this.f21207b);
        this.f21209d = iY2;
    }

    @Override // com.google.protobuf.Reader
    public final int w() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f21206a.u();
    }

    @Override // com.google.protobuf.Reader
    public final long x() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(0);
        return this.f21206a.v();
    }

    @Override // com.google.protobuf.Reader
    public final void y(List list) throws InvalidProtocolBufferException {
        int iY;
        int iY2;
        boolean z11 = list instanceof BooleanArrayList;
        CodedInputStream codedInputStream = this.f21206a;
        if (!z11) {
            int i11 = this.f21207b & 7;
            if (i11 == 0) {
                do {
                    list.add(Boolean.valueOf(codedInputStream.j()));
                    if (codedInputStream.e()) {
                        return;
                    } else {
                        iY = codedInputStream.y();
                    }
                } while (iY == this.f21207b);
                this.f21209d = iY;
                return;
            }
            if (i11 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            int iD = codedInputStream.d() + codedInputStream.z();
            do {
                list.add(Boolean.valueOf(codedInputStream.j()));
            } while (codedInputStream.d() < iD);
            U(iD);
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        int i12 = this.f21207b & 7;
        if (i12 == 0) {
            do {
                booleanArrayList.d(codedInputStream.j());
                if (codedInputStream.e()) {
                    return;
                } else {
                    iY2 = codedInputStream.y();
                }
            } while (iY2 == this.f21207b);
            this.f21209d = iY2;
            return;
        }
        if (i12 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int iD2 = codedInputStream.d() + codedInputStream.z();
        do {
            booleanArrayList.d(codedInputStream.j());
        } while (codedInputStream.d() < iD2);
        U(iD2);
    }

    @Override // com.google.protobuf.Reader
    public final String z() throws InvalidProtocolBufferException.InvalidWireTypeException {
        V(2);
        return this.f21206a.w();
    }
}
