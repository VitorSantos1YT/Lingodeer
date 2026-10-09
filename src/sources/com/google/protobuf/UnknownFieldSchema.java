package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
@CheckReturnValue
abstract class UnknownFieldSchema<T, B> {
    public abstract void a(int i11, int i12, Object obj);

    public abstract void b(long j11, Object obj, int i11);

    public abstract void c(int i11, Object obj, Object obj2);

    public abstract void d(Object obj, int i11, ByteString byteString);

    public abstract void e(long j11, Object obj, int i11);

    public abstract UnknownFieldSetLite f(Object obj);

    public abstract UnknownFieldSetLite g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract UnknownFieldSetLite k(Object obj, Object obj2);

    public final boolean l(int i11, Reader reader, Object obj) throws InvalidProtocolBufferException {
        int iU = reader.u();
        int i12 = iU >>> 3;
        int i13 = iU & 7;
        if (i13 == 0) {
            e(reader.N(), obj, i12);
            return true;
        }
        if (i13 == 1) {
            b(reader.c(), obj, i12);
            return true;
        }
        if (i13 == 2) {
            d(obj, i12, reader.G());
            return true;
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            a(i12, reader.j(), obj);
            return true;
        }
        UnknownFieldSetLite unknownFieldSetLiteM = m();
        int i14 = 4 | (i12 << 3);
        int i15 = i11 + 1;
        if (i15 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (reader.B() != Integer.MAX_VALUE && l(i15, reader, unknownFieldSetLiteM)) {
        }
        if (i14 != reader.u()) {
            throw InvalidProtocolBufferException.a();
        }
        c(i12, obj, p(unknownFieldSetLiteM));
        return true;
    }

    public abstract UnknownFieldSetLite m();

    public abstract void n(Object obj, Object obj2);

    public abstract void o(Object obj, Object obj2);

    public abstract UnknownFieldSetLite p(Object obj);

    public abstract void q(Object obj, Writer writer);

    public abstract void r(Object obj, Writer writer);
}
