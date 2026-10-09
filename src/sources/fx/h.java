package fx;

import a0.b2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h extends uw.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f28244c;

    public /* synthetic */ h(int i11, Object obj, Object obj2) {
        this.f28242a = i11;
        this.f28243b = obj;
        this.f28244c = obj2;
    }

    @Override // uw.h
    public final void c(uw.i iVar) {
        switch (this.f28242a) {
            case 0:
                ((uw.o) this.f28243b).a(new f(iVar, (yw.d) this.f28244c, 1));
                break;
            default:
                uw.h[] hVarArr = (uw.h[]) this.f28243b;
                int length = hVarArr.length;
                if (length == 1) {
                    hVarArr[0].b(new dx.e(iVar, new b2(this, 12), 1));
                } else {
                    w wVar = new w(iVar, length, (tw.c) this.f28244c);
                    iVar.b(wVar);
                    for (int i11 = 0; i11 < length; i11++) {
                        if (!(wVar.get() <= 0)) {
                            uw.h hVar = hVarArr[i11];
                            if (hVar == null) {
                                NullPointerException nullPointerException = new NullPointerException("One of the sources is null");
                                if (wVar.getAndSet(0) > 0) {
                                    wVar.a(i11);
                                    wVar.f28272a.onError(nullPointerException);
                                } else {
                                    qx.b.B(nullPointerException);
                                }
                            } else {
                                hVar.b(wVar.f28274c[i11]);
                            }
                        }
                    }
                }
                break;
        }
    }
}
