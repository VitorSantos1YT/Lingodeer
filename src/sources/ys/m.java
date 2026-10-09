package ys;

import rt.z8;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class m implements fz.a {
    public final /* synthetic */ l1.b1 H;
    public final /* synthetic */ l1.b1 K;
    public final /* synthetic */ l1.b1 L;
    public final /* synthetic */ l1.b1 M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f58148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.c f58149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z8 f58150d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f58151e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f58152f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ l1.b1 f58153t;

    public /* synthetic */ m(fz.c cVar, z8 z8Var, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7, l1.b1 b1Var8) {
        this.f58147a = 0;
        this.f58149c = cVar;
        this.f58150d = z8Var;
        this.f58148b = b1Var;
        this.f58151e = b1Var2;
        this.f58152f = b1Var3;
        this.f58153t = b1Var4;
        this.H = b1Var5;
        this.K = b1Var6;
        this.L = b1Var7;
        this.M = b1Var8;
    }

    @Override // fz.a
    public final Object invoke() {
        switch (this.f58147a) {
            case 0:
                a.A(this.f58149c, this.f58150d, this.f58148b, this.f58151e, this.f58152f, this.f58153t, this.H, this.K, this.L, this.M, 0, 0, false, false, 0, 0, 0, 261120);
                break;
            case 1:
                l1.b1 b1Var = this.f58148b;
                int iB = a.B(b1Var) - 10;
                b1Var.setValue(Integer.valueOf(iB));
                a.A(this.f58149c, this.f58150d, this.f58151e, this.f58152f, this.f58153t, this.H, this.K, this.L, b1Var, this.M, 0, 0, false, false, 0, iB, 0, 195584);
                break;
            default:
                l1.b1 b1Var2 = this.f58148b;
                int iB2 = a.B(b1Var2) + 10;
                b1Var2.setValue(Integer.valueOf(iB2));
                a.A(this.f58149c, this.f58150d, this.f58151e, this.f58152f, this.f58153t, this.H, this.K, this.L, b1Var2, this.M, 0, 0, false, false, 0, iB2, 0, 195584);
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ m(l1.b1 b1Var, fz.c cVar, z8 z8Var, l1.b1 b1Var2, l1.b1 b1Var3, l1.b1 b1Var4, l1.b1 b1Var5, l1.b1 b1Var6, l1.b1 b1Var7, l1.b1 b1Var8, int i11) {
        this.f58147a = i11;
        this.f58148b = b1Var;
        this.f58149c = cVar;
        this.f58150d = z8Var;
        this.f58151e = b1Var2;
        this.f58152f = b1Var3;
        this.f58153t = b1Var4;
        this.H = b1Var5;
        this.K = b1Var6;
        this.L = b1Var7;
        this.M = b1Var8;
    }
}
