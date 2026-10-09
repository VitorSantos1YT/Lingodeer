package ug;

import fz.e;
import g2.x;
import h1.h2;
import h1.ua;
import j3.y0;
import l1.n;
import l1.s;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f52963b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f52964c = new c(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52965a;

    public /* synthetic */ c(int i11) {
        this.f52965a = i11;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f52965a) {
            case 0:
                ((Number) obj2).intValue();
                s sVar = (s) ((n) obj);
                sVar.d0(1840009000);
                y0 y0Var = (y0) sVar.j(ua.f31167a);
                sVar.p(false);
                return y0Var;
            default:
                ((Number) obj2).intValue();
                s sVar2 = (s) ((n) obj);
                sVar2.d0(626488777);
                long j11 = ((x) sVar2.j(h2.f30320a)).f28624a;
                sVar2.p(false);
                return new x(j11);
        }
    }
}
