package a0;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l1 f240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(l1 l1Var, m1 m1Var, int i11) {
        super(1);
        this.f239a = i11;
        this.f240b = l1Var;
        this.f241c = m1Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        b0.c0 c0Var;
        b0.c0 c0Var2;
        b0.c0 c0Var3;
        b0.c0 c0Var4;
        switch (this.f239a) {
            case 0:
                b0.w1 w1Var = (b0.w1) obj;
                v0 v0Var = v0.PreEnter;
                v0 v0Var2 = v0.Visible;
                if (w1Var.b(v0Var, v0Var2)) {
                    n1 n1Var = this.f240b.f132a.f53a;
                    return (n1Var == null || (c0Var2 = n1Var.f150a) == null) ? f1.f79b : c0Var2;
                }
                if (!w1Var.b(v0Var2, v0.PostExit)) {
                    return f1.f79b;
                }
                n1 n1Var2 = this.f241c.f143a.f53a;
                return (n1Var2 == null || (c0Var = n1Var2.f150a) == null) ? f1.f79b : c0Var;
            case 1:
                int i11 = z0.f244a[((v0) obj).ordinal()];
                float f5 = 1.0f;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (this.f241c.f143a.f53a != null) {
                            f5 = 0.0f;
                        }
                    } else if (this.f240b.f132a.f53a != null) {
                        f5 = 0.0f;
                    }
                }
                return Float.valueOf(f5);
            case 2:
                b0.w1 w1Var2 = (b0.w1) obj;
                v0 v0Var3 = v0.PreEnter;
                v0 v0Var4 = v0.Visible;
                if (w1Var2.b(v0Var3, v0Var4)) {
                    s1 s1Var = this.f240b.f132a.f56d;
                    return (s1Var == null || (c0Var4 = s1Var.f184c) == null) ? f1.f79b : c0Var4;
                }
                if (!w1Var2.b(v0Var4, v0.PostExit)) {
                    return f1.f79b;
                }
                s1 s1Var2 = this.f241c.f143a.f56d;
                return (s1Var2 == null || (c0Var3 = s1Var2.f184c) == null) ? f1.f79b : c0Var3;
            default:
                int i12 = a1.f14a[((v0) obj).ordinal()];
                float f11 = 1.0f;
                if (i12 != 1) {
                    if (i12 == 2) {
                        s1 s1Var3 = this.f240b.f132a.f56d;
                        if (s1Var3 != null) {
                            f11 = s1Var3.f182a;
                        }
                    } else {
                        if (i12 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s1 s1Var4 = this.f241c.f143a.f56d;
                        if (s1Var4 != null) {
                            f11 = s1Var4.f182a;
                        }
                    }
                }
                return Float.valueOf(f11);
        }
    }
}
