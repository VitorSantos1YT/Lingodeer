package y2;

import rt.mc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends z1.q {
    public final int Q = l1.e(this);
    public z1.q R;

    @Override // z1.q
    public final void J0() {
        super.J0();
        for (z1.q qVar = this.R; qVar != null; qVar = qVar.f58487f) {
            qVar.S0(this.H);
            if (!qVar.P) {
                qVar.J0();
            }
        }
    }

    @Override // z1.q
    public final void K0() {
        for (z1.q qVar = this.R; qVar != null; qVar = qVar.f58487f) {
            qVar.K0();
        }
        super.K0();
    }

    @Override // z1.q
    public final void O0() {
        super.O0();
        for (z1.q qVar = this.R; qVar != null; qVar = qVar.f58487f) {
            qVar.O0();
        }
    }

    @Override // z1.q
    public final void P0() {
        for (z1.q qVar = this.R; qVar != null; qVar = qVar.f58487f) {
            qVar.P0();
        }
        super.P0();
    }

    @Override // z1.q
    public final void Q0() {
        super.Q0();
        for (z1.q qVar = this.R; qVar != null; qVar = qVar.f58487f) {
            qVar.Q0();
        }
    }

    @Override // z1.q
    public final void R0(z1.q qVar) {
        this.f58482a = qVar;
        for (z1.q qVar2 = this.R; qVar2 != null; qVar2 = qVar2.f58487f) {
            qVar2.R0(qVar);
        }
    }

    @Override // z1.q
    public final void S0(k1 k1Var) {
        this.H = k1Var;
        for (z1.q qVar = this.R; qVar != null; qVar = qVar.f58487f) {
            qVar.S0(k1Var);
        }
    }

    public final m T0(m mVar) {
        z1.q qVar = ((z1.q) mVar).f58482a;
        if (qVar != mVar) {
            z1.q qVar2 = mVar instanceof z1.q ? (z1.q) mVar : null;
            z1.q qVar3 = qVar2 != null ? qVar2.f58486e : null;
            if (qVar != this.f58482a || !kotlin.jvm.internal.m.a(qVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
        } else {
            if (qVar.P) {
                v2.a.b("Cannot delegate to an already attached node");
            }
            qVar.R0(this.f58482a);
            int i11 = this.f58484c;
            int iF = l1.f(qVar);
            qVar.f58484c = iF;
            int i12 = this.f58484c;
            int i13 = iF & 2;
            if (i13 != 0 && (i12 & 2) != 0 && !(this instanceof z)) {
                v2.a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + qVar);
            }
            qVar.f58487f = this.R;
            this.R = qVar;
            qVar.f58486e = this;
            V0(iF | this.f58484c, false);
            if (this.P) {
                if (i13 == 0 || (i11 & 2) != 0) {
                    S0(this.H);
                } else {
                    mc mcVar = f.x(this).f56892i0;
                    this.f58482a.S0(null);
                    mcVar.k();
                }
                qVar.J0();
                qVar.P0();
                if (!qVar.P) {
                    v2.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                l1.a(qVar, -1, 1);
            }
        }
        return mVar;
    }

    public final void U0(m mVar) {
        z1.q qVar = null;
        for (z1.q qVar2 = this.R; qVar2 != null; qVar2 = qVar2.f58487f) {
            if (qVar2 == mVar) {
                boolean z11 = qVar2.P;
                if (z11) {
                    y.d0 d0Var = l1.f56959a;
                    if (!z11) {
                        v2.a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    l1.a(qVar2, -1, 2);
                    qVar2.Q0();
                    qVar2.K0();
                }
                qVar2.R0(qVar2);
                qVar2.f58485d = 0;
                if (qVar == null) {
                    this.R = qVar2.f58487f;
                } else {
                    qVar.f58487f = qVar2.f58487f;
                }
                qVar2.f58487f = null;
                qVar2.f58486e = null;
                int i11 = this.f58484c;
                int iF = l1.f(this);
                V0(iF, true);
                if (this.P && (i11 & 2) != 0 && (iF & 2) == 0) {
                    mc mcVar = f.x(this).f56892i0;
                    this.f58482a.S0(null);
                    mcVar.k();
                    return;
                }
                return;
            }
            qVar = qVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + mVar).toString());
    }

    public final void V0(int i11, boolean z11) {
        z1.q qVar;
        int i12 = this.f58484c;
        this.f58484c = i11;
        if (i12 != i11) {
            z1.q qVar2 = this.f58482a;
            if (qVar2 == this) {
                this.f58485d = i11;
            }
            if (this.P) {
                z1.q qVar3 = this;
                while (qVar3 != null) {
                    i11 |= qVar3.f58484c;
                    qVar3.f58484c = i11;
                    if (qVar3 == qVar2) {
                        break;
                    } else {
                        qVar3 = qVar3.f58486e;
                    }
                }
                if (z11 && qVar3 == qVar2) {
                    i11 = l1.f(qVar2);
                    qVar2.f58484c = i11;
                }
                int i13 = i11 | ((qVar3 == null || (qVar = qVar3.f58487f) == null) ? 0 : qVar.f58485d);
                while (qVar3 != null) {
                    i13 |= qVar3.f58484c;
                    qVar3.f58485d = i13;
                    qVar3 = qVar3.f58486e;
                }
            }
        }
    }
}
