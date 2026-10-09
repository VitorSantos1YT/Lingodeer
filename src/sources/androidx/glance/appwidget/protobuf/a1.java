package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends y0 {
    @Override // androidx.glance.appwidget.protobuf.y0
    public final z0 a(Object obj) {
        x xVar = (x) obj;
        z0 z0Var = xVar.unknownFields;
        if (z0Var != z0.f2011f) {
            return z0Var;
        }
        z0 z0Var2 = new z0(0, new int[8], new Object[8], true);
        xVar.unknownFields = z0Var2;
        return z0Var2;
    }
}
