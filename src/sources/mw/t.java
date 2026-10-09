package mw;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class t extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f42683c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f42684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(t2 t2Var, lw.r rVar) {
        super(rVar, 0);
        this.f42684d = t2Var;
    }

    @Override // mw.h0
    public final void b() {
        List list;
        switch (this.f42683c) {
            case 0:
                xq.c cVar = (xq.c) this.f42684d;
                tw.b.c();
                try {
                    tw.b.a();
                    tw.b.f52660a.getClass();
                    if (((lw.q1) cVar.f56175c) == null) {
                        try {
                            ((lw.y) cVar.f56174b).l();
                        } catch (Throwable th2) {
                            lw.q1 q1VarH = lw.q1.f40435f.g(th2).h("Failed to call onReady.");
                            cVar.f56175c = q1VarH;
                            ((v) cVar.f56176d).f42739l.p(q1VarH);
                        }
                        break;
                    }
                    tw.b.f52660a.getClass();
                    return;
                } catch (Throwable th3) {
                    try {
                        tw.b.f52660a.getClass();
                        break;
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            case 1:
                ((n0) this.f42684d).t();
                return;
            default:
                m0 m0Var = (m0) this.f42684d;
                m0Var.getClass();
                List arrayList = new ArrayList();
                while (true) {
                    synchronized (m0Var) {
                        try {
                            if (m0Var.f42531c.isEmpty()) {
                                m0Var.f42531c = null;
                                m0Var.f42530b = true;
                                return;
                            } else {
                                list = m0Var.f42531c;
                                m0Var.f42531c = arrayList;
                            }
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    list.clear();
                    arrayList = list;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n0 n0Var, m0 m0Var) {
        super(n0Var.f42557f, 0);
        this.f42684d = m0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(xq.c cVar) {
        super(((v) cVar.f56176d).f42735h, 0);
        this.f42684d = cVar;
    }
}
