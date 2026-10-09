package n0;

import bp.h2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f43004b;

    public /* synthetic */ t0(v0 v0Var, int i11) {
        this.f43003a = i11;
        this.f43004b = v0Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f43003a) {
            case 0:
                a0 a0Var = (a0) this.f43004b.Q.invoke();
                int itemCount = a0Var.getItemCount();
                int i11 = 0;
                while (i11 < itemCount) {
                    if (a0Var.a(i11).equals(obj)) {
                        return Integer.valueOf(i11);
                    }
                    i11++;
                }
                i11 = -1;
                return Integer.valueOf(i11);
            default:
                int iIntValue = ((Integer) obj).intValue();
                v0 v0Var = this.f43004b;
                a0 a0Var2 = (a0) v0Var.Q.invoke();
                if (iIntValue < 0 || iIntValue >= a0Var2.getItemCount()) {
                    StringBuilder sbI = w4.c.i(iIntValue, "Can't scroll to index ", ", it is out of bounds [0, ");
                    sbI.append(a0Var2.getItemCount());
                    sbI.append(')');
                    i0.a.a(sbI.toString());
                }
                rz.e0.B(v0Var.H0(), null, null, new h2(v0Var, iIntValue, (vy.d) null, 8), 3);
                return Boolean.TRUE;
        }
    }
}
