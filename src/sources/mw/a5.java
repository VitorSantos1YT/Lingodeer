package mw;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a5 extends lw.y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw.y f42340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b5 f42341b;

    public a5(b5 b5Var, lw.y yVar) {
        this.f42341b = b5Var;
        this.f42340a = yVar;
    }

    @Override // lw.y
    public final void i(lw.q1 q1Var) {
        this.f42340a.i(q1Var);
        this.f42341b.f42365f.execute(new lf.i0(this, 4));
    }

    @Override // lw.y
    public final void m(lw.h1 h1Var) {
        lw.b bVar = h1Var.f40394b;
        IdentityHashMap identityHashMap = bVar.f40343a;
        lw.a aVar = b5.f42363g;
        if (identityHashMap.get(aVar) != null) {
            throw new IllegalStateException("RetryingNameResolver can only be used once to wrap a NameResolver");
        }
        List list = Collections.EMPTY_LIST;
        lw.b bVar2 = lw.b.f40342b;
        List list2 = h1Var.f40393a;
        lw.g1 g1Var = h1Var.f40395c;
        bVar.getClass();
        z4 z4Var = new z4(this.f42341b);
        IdentityHashMap identityHashMap2 = new IdentityHashMap(1);
        identityHashMap2.put(aVar, z4Var);
        for (Map.Entry entry : bVar.f40343a.entrySet()) {
            if (!identityHashMap2.containsKey(entry.getKey())) {
                identityHashMap2.put((lw.a) entry.getKey(), entry.getValue());
            }
        }
        this.f42340a.m(new lw.h1(list2, new lw.b(identityHashMap2), g1Var));
    }
}
