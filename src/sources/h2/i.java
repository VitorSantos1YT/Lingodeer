package h2;

import y.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f31491a;

    static {
        r rVar = e.f31464e;
        int i11 = rVar.f31458c;
        f fVar = new f(rVar, rVar, 1);
        int i12 = rVar.f31458c;
        m mVar = e.f31482x;
        int i13 = (mVar.f31458c << 6) | i12;
        h hVar = new h(rVar, mVar, 0);
        int i14 = (i12 << 6) | mVar.f31458c;
        h hVar2 = new h(mVar, rVar, 0);
        x xVar = y.n.f56742a;
        x xVar2 = new x();
        xVar2.h(i11 | (i11 << 6), fVar);
        xVar2.h(i13, hVar);
        xVar2.h(i14, hVar2);
        f31491a = xVar2;
    }
}
