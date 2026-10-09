package sw;

import com.google.common.base.Preconditions;
import java.util.IdentityHashMap;
import java.util.Map;
import lw.p0;
import lw.q0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.y f51861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p0 f51862b;

    public j(lw.y yVar, p0 p0Var) {
        Preconditions.k(yVar, "delegate");
        this.f51861a = yVar;
        Preconditions.k(p0Var, "healthListener");
        this.f51862b = p0Var;
    }

    @Override // lw.y
    public final lw.b c() {
        lw.b bVarC = this.f51861a.c();
        bVarC.getClass();
        Boolean bool = Boolean.TRUE;
        IdentityHashMap identityHashMap = new IdentityHashMap(1);
        identityHashMap.put(q0.f40430d, bool);
        for (Map.Entry entry : bVarC.f40343a.entrySet()) {
            if (!identityHashMap.containsKey(entry.getKey())) {
                identityHashMap.put((lw.a) entry.getKey(), entry.getValue());
            }
        }
        return new lw.b(identityHashMap);
    }

    @Override // lw.y
    public final void p(p0 p0Var) {
        this.f51861a.p(new i(this, p0Var, 0));
    }

    @Override // sw.d
    public final lw.y r() {
        return this.f51861a;
    }
}
