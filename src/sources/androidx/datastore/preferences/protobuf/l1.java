package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends j1 {
    @Override // androidx.datastore.preferences.protobuf.j1
    public final k1 a(Object obj) {
        c0 c0Var = (c0) obj;
        k1 k1Var = c0Var.unknownFields;
        if (k1Var != k1.f1503f) {
            return k1Var;
        }
        k1 k1Var2 = new k1(0, new int[8], new Object[8], true);
        c0Var.unknownFields = k1Var2;
        return k1Var2;
    }
}
