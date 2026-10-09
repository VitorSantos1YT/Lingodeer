package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static d0 a(long j11, Object obj) {
        d0 d0Var = (d0) q1.f1541c.h(j11, obj);
        if (((b) d0Var).f1448a) {
            return d0Var;
        }
        b1 b1Var = (b1) d0Var;
        int i11 = b1Var.f1451c;
        b1 b1VarE = b1Var.e(i11 == 0 ? 10 : i11 * 2);
        q1.o(obj, j11, b1VarE);
        return b1VarE;
    }
}
