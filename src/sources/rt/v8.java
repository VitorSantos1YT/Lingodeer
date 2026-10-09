package rt;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class v8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f50534b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f50533a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f50535c = true;

    public final u8 a(uz.p0 selection, fz.c cVar) {
        u8 u8Var;
        kotlin.jvm.internal.m.f(selection, "selection");
        synchronized (this.f50533a) {
            this.f50534b++;
            this.f50535c = false;
            uz.i1 i1Var = (uz.i1) selection;
            Object objInvoke = cVar.invoke(i1Var.getValue());
            i1Var.k((u8) objInvoke);
            u8Var = (u8) objInvoke;
        }
        return u8Var;
    }
}
