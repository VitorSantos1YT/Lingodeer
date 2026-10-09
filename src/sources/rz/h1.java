package rz;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class h1 extends q1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f50911c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(g1 g1Var) {
        super(true);
        boolean z11 = true;
        F(g1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q1.f50946b;
        p pVar = (p) atomicReferenceFieldUpdater.get(this);
        q qVar = pVar instanceof q ? (q) pVar : null;
        if (qVar == null) {
            z11 = false;
            break;
        }
        q1 q1VarH = qVar.h();
        while (!q1VarH.A()) {
            p pVar2 = (p) atomicReferenceFieldUpdater.get(q1VarH);
            q qVar2 = pVar2 instanceof q ? (q) pVar2 : null;
            if (qVar2 == null) {
                z11 = false;
                break;
            }
            q1VarH = qVar2.h();
        }
        this.f50911c = z11;
    }

    @Override // rz.q1
    public final boolean A() {
        return this.f50911c;
    }

    @Override // rz.q1
    public final boolean B() {
        return true;
    }
}
