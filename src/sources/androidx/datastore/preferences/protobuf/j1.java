package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {
    public abstract k1 a(Object obj);

    public final boolean b(int i11, n nVar, Object obj) throws InvalidProtocolBufferException {
        int i12 = nVar.f1518b;
        int i13 = i12 >>> 3;
        int i14 = i12 & 7;
        if (i14 == 0) {
            nVar.w(0);
            ((k1) obj).c(i13 << 3, Long.valueOf(nVar.f1517a.t()));
            return true;
        }
        if (i14 == 1) {
            nVar.w(1);
            ((k1) obj).c((i13 << 3) | 1, Long.valueOf(nVar.f1517a.q()));
            return true;
        }
        if (i14 == 2) {
            ((k1) obj).c((i13 << 3) | 2, nVar.e());
            return true;
        }
        if (i14 != 3) {
            if (i14 == 4) {
                return false;
            }
            if (i14 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            nVar.w(5);
            ((k1) obj).c(5 | (i13 << 3), Integer.valueOf(nVar.f1517a.p()));
            return true;
        }
        k1 k1Var = new k1(0, new int[8], new Object[8], true);
        int i15 = i13 << 3;
        int i16 = i15 | 4;
        int i17 = i11 + 1;
        if (i17 >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (nVar.a() != Integer.MAX_VALUE && b(i17, nVar, k1Var)) {
        }
        if (i16 != nVar.f1518b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        if (k1Var.f1508e) {
            k1Var.f1508e = false;
        }
        ((k1) obj).c(i15 | 3, k1Var);
        return true;
    }
}
