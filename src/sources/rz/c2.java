package rz;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f50875a = new ThreadLocal();

    public static y0 a() {
        ThreadLocal threadLocal = f50875a;
        y0 y0Var = (y0) threadLocal.get();
        if (y0Var != null) {
            return y0Var;
        }
        i iVar = new i(Thread.currentThread());
        threadLocal.set(iVar);
        return iVar;
    }
}
