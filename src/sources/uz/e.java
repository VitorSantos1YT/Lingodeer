package uz;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class e extends vz.d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53279d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f53280e;

    public e(Iterable iterable, vy.i iVar, int i11, tz.a aVar) {
        super(iVar, i11, aVar);
        this.f53280e = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // vz.d
    public Object f(tz.t tVar, vy.d dVar) {
        switch (this.f53279d) {
            case 0:
                Object objInvoke = ((xy.i) this.f53280e).invoke(tVar, dVar);
                return objInvoke == wy.a.COROUTINE_SUSPENDED ? objInvoke : qy.b0.f48488a;
            default:
                vz.r rVar = new vz.r(tVar);
                Iterator it = this.f53280e.iterator();
                while (it.hasNext()) {
                    rz.e0.B(tVar, null, null, new sr.d(19, (i) it.next(), rVar, null), 3);
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Iterable, java.lang.Object] */
    @Override // vz.d
    public vz.d g(vy.i iVar, int i11, tz.a aVar) {
        switch (this.f53279d) {
            case 0:
                return new e((fz.e) this.f53280e, iVar, i11, aVar);
            default:
                return new e((Iterable) this.f53280e, iVar, i11, aVar);
        }
    }

    @Override // vz.d
    public tz.v i(rz.b0 b0Var) {
        switch (this.f53279d) {
            case 1:
                fz.e dVar = new sr.d(this, null, 17);
                tz.a aVar = tz.a.SUSPEND;
                rz.d0 d0Var = rz.d0.DEFAULT;
                tz.s sVar = new tz.s(rz.e0.C(b0Var, this.f54332a), qx.p.b(this.f54333b, 4, aVar));
                sVar.Z(d0Var, sVar, dVar);
                return sVar;
            default:
                return super.i(b0Var);
        }
    }

    @Override // vz.d
    public String toString() {
        switch (this.f53279d) {
            case 0:
                return "block[" + ((xy.i) this.f53280e) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(fz.e eVar, vy.i iVar, int i11, tz.a aVar) {
        super(iVar, i11, aVar);
        this.f53280e = (xy.i) eVar;
    }
}
