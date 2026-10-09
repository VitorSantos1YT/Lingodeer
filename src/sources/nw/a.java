package nw;

import mw.h0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f44185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f44186d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, int i11) {
        super(cVar, 1);
        this.f44185c = i11;
        switch (i11) {
            case 1:
                this.f44186d = cVar;
                super(cVar, 1);
                tw.b.b();
                break;
            default:
                this.f44186d = cVar;
                tw.b.b();
                break;
        }
    }

    @Override // mw.h0
    public final void a() {
        c cVar;
        int i11;
        c cVar2;
        switch (this.f44185c) {
            case 0:
                m00.i iVar = new m00.i();
                tw.b.c();
                try {
                    tw.a aVar = tw.b.f52660a;
                    aVar.getClass();
                    synchronized (this.f44186d.f44189a) {
                        m00.i iVar2 = this.f44186d.f44190b;
                        iVar.K0(iVar2, iVar2.d());
                        cVar = this.f44186d;
                        cVar.f44194f = false;
                        i11 = cVar.O;
                        break;
                    }
                    cVar.K.K0(iVar, iVar.f40718b);
                    synchronized (this.f44186d.f44189a) {
                        this.f44186d.O -= i11;
                        break;
                    }
                    aVar.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        tw.b.f52660a.getClass();
                        break;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                m00.i iVar3 = new m00.i();
                tw.b.c();
                try {
                    tw.a aVar2 = tw.b.f52660a;
                    aVar2.getClass();
                    synchronized (this.f44186d.f44189a) {
                        m00.i iVar4 = this.f44186d.f44190b;
                        iVar3.K0(iVar4, iVar4.f40718b);
                        cVar2 = this.f44186d;
                        cVar2.f44195t = false;
                        break;
                    }
                    cVar2.K.K0(iVar3, iVar3.f40718b);
                    this.f44186d.K.flush();
                    aVar2.getClass();
                    return;
                } catch (Throwable th4) {
                    try {
                        tw.b.f52660a.getClass();
                        break;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
        }
    }
}
