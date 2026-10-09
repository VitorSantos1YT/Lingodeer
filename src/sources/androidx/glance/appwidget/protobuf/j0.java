package androidx.glance.appwidget.protobuf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {
    public static i0 a(Object obj, Object obj2) {
        i0 i0VarD = (i0) obj;
        i0 i0Var = (i0) obj2;
        if (!i0Var.isEmpty()) {
            if (!i0VarD.f1945a) {
                i0VarD = i0VarD.d();
            }
            i0VarD.c();
            if (!i0Var.isEmpty()) {
                i0VarD.putAll(i0Var);
            }
        }
        return i0VarD;
    }
}
