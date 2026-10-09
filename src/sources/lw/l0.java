package lw;

import com.google.common.base.Preconditions;
import mw.b4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class l0 extends o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f40414b;

    public /* synthetic */ l0(Object obj, int i11) {
        this.f40413a = i11;
        this.f40414b = obj;
    }

    @Override // lw.o0
    public final m0 a(b4 b4Var) {
        switch (this.f40413a) {
            case 0:
                return (m0) this.f40414b;
            case 1:
                return m0.a((q1) this.f40414b);
            default:
                m0 m0VarA = ((o0) this.f40414b).a(b4Var);
                y yVar = m0VarA.f40418a;
                if (yVar == null) {
                    return m0VarA;
                }
                b bVarC = yVar.c();
                return m0.b(yVar, new sw.s((sw.n) bVarC.f40343a.get(sw.v.f51902n), m0VarA.f40419b));
        }
    }

    public String toString() {
        switch (this.f40413a) {
            case 0:
                return "FixedResultPicker(" + ((m0) this.f40414b) + ")";
            default:
                return super.toString();
        }
    }

    public l0(m0 m0Var) {
        this.f40413a = 0;
        Preconditions.k(m0Var, "result");
        this.f40414b = m0Var;
    }
}
