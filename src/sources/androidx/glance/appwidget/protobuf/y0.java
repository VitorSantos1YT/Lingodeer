package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y0 {
    public abstract z0 a(Object obj);

    public final boolean b(int i11, k kVar, Object obj) throws InvalidProtocolBufferException {
        int i12 = kVar.f1953b;
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            kVar.v(0);
            ((z0) obj).c(i13 << 3, Long.valueOf(kVar.f1952a.t()));
            return true;
        }
        if (i14 == 1) {
            kVar.v(1);
            ((z0) obj).c((i13 << 3) | 1, Long.valueOf(kVar.f1952a.q()));
            return true;
        }
        if (i14 == 2) {
            ((z0) obj).c((i13 << 3) | 2, kVar.e());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            kVar.v(5);
            ((z0) obj).c(5 | (i13 << 3), Integer.valueOf(kVar.f1952a.p()));
            return true;
        }
        z0 z0Var = new z0(0, new int[8], new Object[8], true);
        int i15 = i13 << 3;
        int i16 = i15 | 4;
        int i17 = i11 + 1;
        if (i17 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (kVar.a() != Integer.MAX_VALUE && b(i17, kVar, z0Var)) {
        }
        if (i16 != kVar.f1953b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (z0Var.f2016e) {
            z0Var.f2016e = false;
        }
        ((z0) obj).c(i15 | 3, z0Var);
        return true;
    }
}
