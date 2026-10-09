package j3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f35681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f35682b = 0;

    static {
        v3.p[] pVarArr = v3.o.f53500b;
        f35681a = v3.o.f53501c;
    }

    public static final c0 a(c0 c0Var, int i11, int i12, long j11, u3.q qVar, f0 f0Var, u3.i iVar, int i13, int i14, u3.s sVar) {
        long j12;
        int i15 = i11;
        int i16 = i12;
        long j13 = j11;
        u3.q qVar2 = qVar;
        f0 f0Var2 = f0Var;
        u3.i iVar2 = iVar;
        int i17 = i13;
        int i18 = i14;
        u3.s sVar2 = sVar;
        if (i15 == 0 || i15 == c0Var.f35668a) {
            v3.p[] pVarArr = v3.o.f53500b;
            if ((j13 & 1095216660480L) == 0) {
                j12 = 0;
            } else {
                j12 = 0;
                if (v3.o.a(j13, c0Var.f35670c)) {
                }
            }
            if ((qVar2 == null || qVar2.equals(c0Var.f35671d)) && ((i16 == 0 || i16 == c0Var.f35669b) && ((f0Var2 == null || f0Var2.equals(c0Var.f35672e)) && ((iVar2 == null || iVar2.equals(c0Var.f35673f)) && ((i17 == 0 || i17 == c0Var.f35674g) && ((i18 == 0 || i18 == c0Var.f35675h) && (sVar2 == null || sVar2.equals(c0Var.f35676i)))))))) {
                return c0Var;
            }
        } else {
            j12 = 0;
        }
        v3.p[] pVarArr2 = v3.o.f53500b;
        if ((j13 & 1095216660480L) == j12) {
            j13 = c0Var.f35670c;
        }
        if (qVar2 == null) {
            qVar2 = c0Var.f35671d;
        }
        if (i15 == 0) {
            i15 = c0Var.f35668a;
        }
        if (i16 == 0) {
            i16 = c0Var.f35669b;
        }
        f0 f0Var3 = c0Var.f35672e;
        if (f0Var3 != null && f0Var2 == null) {
            f0Var2 = f0Var3;
        }
        if (iVar2 == null) {
            iVar2 = c0Var.f35673f;
        }
        if (i17 == 0) {
            i17 = c0Var.f35674g;
        }
        if (i18 == 0) {
            i18 = c0Var.f35675h;
        }
        if (sVar2 == null) {
            sVar2 = c0Var.f35676i;
        }
        return new c0(i15, i16, j13, qVar2, f0Var2, iVar2, i17, i18, sVar2);
    }
}
