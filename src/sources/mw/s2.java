package mw;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class s2 extends lw.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u2 f42677a;

    public s2(u2 u2Var) {
        this.f42677a = u2Var;
    }

    @Override // lw.d
    public final String e() {
        return this.f42677a.f42714b;
    }

    @Override // lw.d
    public final lw.f f(lw.e1 e1Var, lw.c cVar) {
        y2 y2Var = this.f42677a.f42716d;
        Logger logger = y2.f42807c0;
        Executor executor = cVar.f40350b;
        if (executor == null) {
            executor = y2Var.f42823h;
        }
        v vVar = new v(e1Var, executor, cVar, y2Var.f42815a0, y2Var.I ? null : this.f42677a.f42716d.f42821f.f42519a.f44211d, this.f42677a.f42716d.L);
        vVar.f42744r = this.f42677a.f42716d.f42828n;
        return vVar;
    }
}
