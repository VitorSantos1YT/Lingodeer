package z2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g3.o f58583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y.y f58584b;

    public h2(g3.t tVar, y.m mVar) {
        this.f58583a = tVar.f28699d;
        this.f58584b = new y.y(g3.t.j(4, tVar).size());
        List listJ = g3.t.j(4, tVar);
        int size = listJ.size();
        for (int i11 = 0; i11 < size; i11++) {
            g3.t tVar2 = (g3.t) listJ.get(i11);
            if (mVar.a(tVar2.f28702g)) {
                this.f58584b.a(tVar2.f28702g);
            }
        }
    }
}
