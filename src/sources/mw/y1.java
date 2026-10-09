package mw;

import com.google.common.base.Preconditions;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class y1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ie.o f42806b;

    public /* synthetic */ y1(ie.o oVar, int i11) {
        this.f42805a = i11;
        this.f42806b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f42805a) {
            case 0:
                ie.o oVar = this.f42806b;
                a2 a2Var = (a2) oVar.f34407d;
                a2Var.f42321n = null;
                if (a2Var.f42331x == null) {
                    w1 w1Var = a2Var.f42328u;
                    w1 w1Var2 = (w1) oVar.f34406c;
                    if (w1Var == w1Var2) {
                        a2Var.f42329v = w1Var2;
                        a2 a2Var2 = (a2) this.f42806b.f34407d;
                        a2Var2.f42328u = null;
                        a2.e(a2Var2, lw.n.READY);
                    }
                } else {
                    Preconditions.p("Unexpected non-null activeTransport", a2Var.f42329v == null);
                    ie.o oVar2 = this.f42806b;
                    ((w1) oVar2.f34406c).c(((a2) oVar2.f34407d).f42331x);
                }
                break;
            default:
                ie.o oVar3 = this.f42806b;
                ((a2) oVar3.f34407d).f42326s.remove((w1) oVar3.f34406c);
                if (((a2) this.f42806b.f34407d).f42330w.f40425a == lw.n.SHUTDOWN && ((a2) this.f42806b.f34407d).f42326s.isEmpty()) {
                    a2 a2Var3 = (a2) this.f42806b.f34407d;
                    a2Var3.f42319k.execute(new s1(a2Var3, 2));
                    break;
                }
                break;
        }
    }
}
