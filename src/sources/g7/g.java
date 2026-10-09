package g7;

import p7.b0;
import y6.n0;
import y6.o0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f28813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b0 f28814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f28817g;

    public g(h hVar, String str, int i11, b0 b0Var) {
        this.f28817g = hVar;
        this.f28811a = str;
        this.f28812b = i11;
        this.f28813c = b0Var == null ? -1L : b0Var.f46331d;
        if (b0Var == null || !b0Var.b()) {
            return;
        }
        this.f28814d = b0Var;
    }

    public final boolean a(a aVar) {
        b0 b0Var = aVar.f28787d;
        o0 o0Var = aVar.f28785b;
        if (b0Var == null) {
            return this.f28812b != aVar.f28786c;
        }
        long j11 = this.f28813c;
        if (j11 == -1) {
            return false;
        }
        if (b0Var.f46331d > j11) {
            return true;
        }
        b0 b0Var2 = this.f28814d;
        if (b0Var2 == null) {
            return false;
        }
        int i11 = b0Var2.f46329b;
        int iB = o0Var.b(b0Var.f46328a);
        int iB2 = o0Var.b(b0Var2.f46328a);
        if (b0Var.f46331d < b0Var2.f46331d || iB < iB2) {
            return false;
        }
        if (iB > iB2) {
            return true;
        }
        if (!b0Var.b()) {
            int i12 = b0Var.f46332e;
            return i12 == -1 || i12 > i11;
        }
        int i13 = b0Var.f46329b;
        int i14 = b0Var.f46330c;
        if (i13 <= i11) {
            return i13 == i11 && i14 > b0Var2.f46330c;
        }
        return true;
    }

    public final boolean b(o0 o0Var, o0 o0Var2) {
        b0 b0Var;
        int i11 = this.f28812b;
        if (i11 < o0Var.o()) {
            h hVar = this.f28817g;
            n0 n0Var = hVar.f28820a;
            o0Var.n(i11, n0Var);
            int i12 = n0Var.f57250n;
            while (true) {
                if (i12 > n0Var.f57251o) {
                    i11 = -1;
                    break;
                }
                int iB = o0Var2.b(o0Var.l(i12));
                if (iB != -1) {
                    i11 = o0Var2.f(iB, hVar.f28821b, false).f57230c;
                    break;
                }
                i12++;
            }
        } else if (i11 >= o0Var2.o()) {
            i11 = -1;
            break;
        }
        this.f28812b = i11;
        return i11 != -1 && ((b0Var = this.f28814d) == null || o0Var2.b(b0Var.f46328a) != -1);
    }
}
