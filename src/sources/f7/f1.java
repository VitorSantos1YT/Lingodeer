package f7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f26734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f26735f;

    public static void b(e eVar) {
        int i11 = eVar.H;
        if (i11 == 2) {
            b7.a.j(i11 == 2);
            eVar.H = 1;
            eVar.v();
        }
    }

    public static boolean h(e eVar) {
        return eVar.H != 0;
    }

    public static void l(e eVar, long j11) {
        eVar.P = true;
        if (eVar instanceof r7.e) {
            r7.e eVar2 = (r7.e) eVar;
            b7.a.j(eVar2.P);
            eVar2.f48845m0 = j11;
        }
    }

    public void a(e eVar, k kVar) {
        b7.a.j(((e) this.f26734e) == eVar || ((e) this.f26735f) == eVar);
        if (h(eVar)) {
            if (eVar == ((e) kVar.f26823e)) {
                kVar.f26824f = null;
                kVar.f26823e = null;
                kVar.f26819a = true;
            }
            b(eVar);
            b7.a.j(eVar.H == 1);
            eVar.f26701c.f();
            eVar.H = 0;
            eVar.K = null;
            eVar.L = null;
            eVar.P = false;
            eVar.p();
            eVar.S = null;
        }
    }

    public int c() {
        boolean zH = h((e) this.f26734e);
        e eVar = (e) this.f26735f;
        return (zH ? 1 : 0) + ((eVar == null || !h(eVar)) ? 0 : 1);
    }

    public e d(l0 l0Var) {
        p7.z0 z0Var;
        if (l0Var != null && (z0Var = l0Var.f26827c[this.f26732c]) != null) {
            e eVar = (e) this.f26734e;
            if (eVar.K == z0Var) {
                return eVar;
            }
            e eVar2 = (e) this.f26735f;
            if (eVar2 != null && eVar2.K == z0Var) {
                return eVar2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003a  */
    public boolean e(l0 l0Var, e eVar) {
        l0 l0Var2;
        int i11 = this.f26732c;
        if (eVar != null) {
            p7.z0 z0Var = l0Var.f26827c[i11];
            p7.z0 z0Var2 = eVar.K;
            if (z0Var2 != null) {
                if (z0Var2 != z0Var) {
                    l0Var2 = l0Var.m;
                    if (l0Var2 != null || l0Var2.f26827c[i11] != eVar.K) {
                    }
                } else if (z0Var != null && !eVar.l()) {
                    l0 l0Var3 = l0Var.m;
                    if (!l0Var.f26831g.f26848g || l0Var3 == null || !l0Var3.f26829e || (!(eVar instanceof r7.e) && !(eVar instanceof n7.b) && eVar.O < l0Var3.e())) {
                        l0Var2 = l0Var.m;
                        return l0Var2 != null ? false : false;
                    }
                }
            }
        }
        return true;
    }

    public boolean f() {
        int i11 = this.f26733d;
        return i11 == 2 || i11 == 4 || i11 == 3;
    }

    public boolean g() {
        int i11 = this.f26733d;
        if (i11 == 0 || i11 == 2 || i11 == 4) {
            return h((e) this.f26734e);
        }
        e eVar = (e) this.f26735f;
        eVar.getClass();
        return eVar.H != 0;
    }

    public void i(boolean z11) {
        if (z11) {
            if (this.f26730a) {
                e eVar = (e) this.f26734e;
                b7.a.j(eVar.H == 0);
                eVar.f26701c.f();
                eVar.t();
                this.f26730a = false;
                return;
            }
            return;
        }
        if (this.f26731b) {
            e eVar2 = (e) this.f26735f;
            eVar2.getClass();
            b7.a.j(eVar2.H == 0);
            eVar2.f26701c.f();
            eVar2.t();
            this.f26731b = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int j(e eVar, l0 l0Var, s7.w wVar, k kVar) {
        int i11;
        e eVar2 = (e) this.f26734e;
        int i12 = this.f26732c;
        if (eVar == null || eVar.H == 0 || (eVar == eVar2 && ((i11 = this.f26733d) == 2 || i11 == 4))) {
            return 1;
        }
        if (eVar == ((e) this.f26735f) && this.f26733d == 3) {
            return 1;
        }
        Object[] objArr = eVar.K != l0Var.f26827c[i12];
        boolean zB = wVar.b(i12);
        if (!zB || objArr != false) {
            if (!eVar.P) {
                s7.s sVar = wVar.f51471c[i12];
                int length = sVar != null ? sVar.length() : 0;
                y6.p[] pVarArr = new y6.p[length];
                for (int i13 = 0; i13 < length; i13++) {
                    sVar.getClass();
                    pVarArr[i13] = sVar.f(i13);
                }
                p7.z0 z0Var = l0Var.f26827c[i12];
                z0Var.getClass();
                eVar.z(pVarArr, z0Var, l0Var.e(), l0Var.f26839p, l0Var.f26831g.f26842a);
                return 3;
            }
            if (!eVar.m()) {
                return 0;
            }
            a(eVar, kVar);
            if (!zB || f()) {
                i(eVar == eVar2);
                return 1;
            }
        }
        return 1;
    }

    public void k() {
        if (!h((e) this.f26734e)) {
            i(true);
        }
        e eVar = (e) this.f26735f;
        if (eVar == null || eVar.H != 0) {
            return;
        }
        i(false);
    }

    public void m() {
        int i11;
        e eVar = (e) this.f26734e;
        int i12 = eVar.H;
        if (i12 == 1 && this.f26733d != 4) {
            b7.a.j(i12 == 1);
            eVar.H = 2;
            eVar.u();
            return;
        }
        e eVar2 = (e) this.f26735f;
        if (eVar2 == null || (i11 = eVar2.H) != 1 || this.f26733d == 3) {
            return;
        }
        b7.a.j(i11 == 1);
        eVar2.H = 2;
        eVar2.u();
    }
}
