package b0;

import mt.k4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2 f3470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f3472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l1.k1 f3473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1.k1 f3474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final s0 f3475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i1 f3476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final s f3477h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f3478i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f3479j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s f3480k;

    public d(Object obj, j2 j2Var, Object obj2) {
        this.f3470a = j2Var;
        this.f3471b = obj2;
        n nVar = new n(j2Var, obj, null, 60);
        this.f3472c = nVar;
        this.f3473d = l1.t.B(Boolean.FALSE);
        this.f3474e = l1.t.B(obj);
        this.f3475f = new s0();
        this.f3476g = new i1(obj2, 3);
        s sVar = nVar.f3615c;
        boolean z11 = sVar instanceof o;
        s sVar2 = z11 ? e.f3491e : sVar instanceof p ? e.f3492f : sVar instanceof q ? e.f3493g : e.f3494h;
        this.f3477h = sVar2;
        s sVar3 = z11 ? e.f3487a : sVar instanceof p ? e.f3488b : sVar instanceof q ? e.f3489c : e.f3490d;
        this.f3478i = sVar3;
        this.f3479j = sVar2;
        this.f3480k = sVar3;
    }

    public static final Object a(d dVar, Object obj) {
        j2 j2Var = dVar.f3470a;
        s sVar = dVar.f3480k;
        s sVar2 = dVar.f3479j;
        if (!kotlin.jvm.internal.m.a(sVar2, dVar.f3477h) || !kotlin.jvm.internal.m.a(sVar, dVar.f3478i)) {
            s sVar3 = (s) j2Var.f3575a.invoke(obj);
            int iB = sVar3.b();
            boolean z11 = false;
            for (int i11 = 0; i11 < iB; i11++) {
                if (sVar3.a(i11) < sVar2.a(i11) || sVar3.a(i11) > sVar.a(i11)) {
                    sVar3.e(i11, hz.b.k(sVar3.a(i11), sVar2.a(i11), sVar.a(i11)));
                    z11 = true;
                }
            }
            if (z11) {
                return j2Var.f3576b.invoke(sVar3);
            }
        }
        return obj;
    }

    public static final void b(d dVar) {
        n nVar = dVar.f3472c;
        nVar.f3615c.d();
        nVar.f3616d = Long.MIN_VALUE;
        dVar.f3473d.setValue(Boolean.FALSE);
    }

    public static Object c(d dVar, Object obj, m mVar, k4 k4Var, vy.d dVar2, int i11) {
        if ((i11 & 2) != 0) {
            mVar = dVar.f3476g;
        }
        m mVar2 = mVar;
        Object objInvoke = dVar.f3470a.f3576b.invoke(dVar.f3472c.f3615c);
        if ((i11 & 8) != 0) {
            k4Var = null;
        }
        k4 k4Var2 = k4Var;
        Object objD = dVar.d();
        j2 j2Var = dVar.f3470a;
        return s0.a(dVar.f3475f, new b(dVar, objInvoke, new r1(mVar2, j2Var, objD, obj, (s) j2Var.f3575a.invoke(objInvoke)), dVar.f3472c.f3616d, k4Var2, null), dVar2);
    }

    public final Object d() {
        return this.f3472c.f3614b.getValue();
    }

    public final Object e(Object obj, vy.d dVar) {
        Object objA = s0.a(this.f3475f, new c(0, this, obj, null), dVar);
        return objA == wy.a.COROUTINE_SUSPENDED ? objA : qy.b0.f48488a;
    }

    public /* synthetic */ d(Object obj, j2 j2Var, Object obj2, int i11) {
        this(obj, j2Var, (i11 & 4) != 0 ? null : obj2);
    }
}
