package l1;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends vy.a implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y1.d f39314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i2 f39315b;

    /* JADX WARN: Illegal instructions before constructor call */
    public h2(y1.d dVar, i2 i2Var) {
        rz.z zVar = rz.z.f50977a;
        this.f39314a = dVar;
        this.f39315b = i2Var;
        super(zVar);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void c(Throwable th2, vy.i iVar) throws Throwable {
        y1.d dVar = this.f39314a;
        i2 i2Var = this.f39315b;
        hz.b.T(th2, new pv.c(25, dVar, i2Var));
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) i2Var.f39319a.get(rz.z.f50977a);
        if (coroutineExceptionHandler == null) {
            throw th2;
        }
        coroutineExceptionHandler.c(th2, iVar);
    }
}
