package bt;

import com.lingodeer.data.model.CourseSentence;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class z0 implements fz.a {
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6240a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f6242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f6243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f6245f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6246t;

    public /* synthetic */ z0(CourseSentence courseSentence, ys.d0 d0Var, l1.b1 b1Var, l1.b1 b1Var2, rz.b0 b0Var, l1.a1 a1Var, l1.b1 b1Var3, l1.b1 b1Var4) {
        this.f6244e = courseSentence;
        this.f6245f = d0Var;
        this.f6241b = b1Var;
        this.f6243d = b1Var2;
        this.f6242c = b0Var;
        this.K = a1Var;
        this.f6246t = b1Var3;
        this.H = b1Var4;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f6240a) {
            case 0:
                CourseSentence courseSentence = (CourseSentence) this.f6244e;
                ys.d0 d0Var = (ys.d0) this.f6245f;
                l1.a1 a1Var = (l1.a1) this.K;
                l1.b1 b1Var = (l1.b1) this.f6246t;
                l1.b1 b1Var2 = (l1.b1) this.H;
                b.k(d0Var, this.f6241b, this.f6243d, this.f6242c, courseSentence, a1Var, b1Var, jh.h.q(courseSentence), new ht.c(courseSentence.getVisemedMap()));
                b1Var2.setValue(Boolean.TRUE);
                break;
            default:
                l1.b3 b3Var = (l1.b3) this.f6244e;
                l1.b3 b3Var2 = (l1.b3) this.f6245f;
                rt.e3 e3Var = (rt.e3) this.f6246t;
                fz.a aVar = (fz.a) this.H;
                fz.a aVar2 = (fz.a) this.K;
                this.f6241b.setValue(Boolean.FALSE);
                int iIntValue = ((Number) b3Var2.getValue()).intValue() + ((Number) b3Var.getValue()).intValue();
                rz.b0 b0Var = this.f6242c;
                l1.b1 b1Var3 = this.f6243d;
                if (iIntValue > 0) {
                    if (!((Boolean) b1Var3.getValue()).booleanValue()) {
                        b1Var3.setValue(Boolean.TRUE);
                        rz.e0.B(b0Var, null, null, new mt.h4(e3Var, aVar, null, 1), 3);
                    }
                } else if (!((Boolean) b1Var3.getValue()).booleanValue()) {
                    b1Var3.setValue(Boolean.TRUE);
                    rz.e0.B(b0Var, null, null, new mt.h4(e3Var, aVar2, null, 0), 3);
                }
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ z0(l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, rz.b0 b0Var, l1.b1 b1Var4, rt.e3 e3Var, fz.a aVar, fz.a aVar2) {
        this.f6241b = b1Var;
        this.f6244e = b1Var2;
        this.f6245f = b1Var3;
        this.f6242c = b0Var;
        this.f6243d = b1Var4;
        this.f6246t = e3Var;
        this.H = aVar;
        this.K = aVar2;
    }
}
