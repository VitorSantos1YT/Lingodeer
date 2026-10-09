package n3;

import androidx.recyclerview.widget.p2;
import fr.p3;
import n0.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hq.a f43158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f43159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ob.l f43160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f43161d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final lp.b f43162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final kp.j f43163f;

    public j(hq.a aVar, a aVar2) {
        ob.l lVar = k.f43164a;
        n nVar = new n(k.f43165b);
        lp.b bVar = new lp.b(4);
        this.f43158a = aVar;
        this.f43159b = aVar2;
        this.f43160c = lVar;
        this.f43161d = nVar;
        this.f43162e = bVar;
        this.f43163f = new kp.j(this, 20);
    }

    public final g0 a(d0 d0Var) {
        ob.l lVar = this.f43160c;
        w0 w0Var = new w0(1, this, d0Var);
        synchronized (((p3) lVar.f44822b)) {
            g0 g0Var = (g0) ((p2) lVar.f44823c).j(d0Var);
            if (g0Var != null) {
                if (g0Var.c()) {
                    return g0Var;
                }
            }
            try {
                g0 g0Var2 = (g0) w0Var.invoke(new w0(2, lVar, d0Var));
                synchronized (((p3) lVar.f44822b)) {
                    if (((p2) lVar.f44823c).j(d0Var) == null && g0Var2.c()) {
                        ((p2) lVar.f44823c).q(d0Var, g0Var2);
                    }
                }
                return g0Var2;
            } catch (Exception e8) {
                throw new IllegalStateException("Could not load font", e8);
            }
        }
    }

    public final g0 b(i iVar, s sVar, int i11, int i12) {
        a aVar = this.f43159b;
        aVar.getClass();
        int i13 = aVar.f43125a;
        s sVar2 = (i13 == 0 || i13 == Integer.MAX_VALUE) ? sVar : new s(hz.b.l(sVar.f43179a + i13, 1, 1000));
        this.f43158a.getClass();
        return a(new d0(iVar, sVar2, i11, i12, null));
    }
}
