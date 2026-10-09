package h1;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.c3 f30256a = new l1.c3(t1.T);

    public static final j3.y0 a(k1.r0 r0Var, l1.n nVar) {
        dc dcVar = (dc) ((l1.s) nVar).j(f30256a);
        switch (ec.f30218a[r0Var.ordinal()]) {
            case 1:
                return dcVar.f30168a;
            case 2:
                return dcVar.f30169b;
            case 3:
                return dcVar.f30170c;
            case 4:
                return dcVar.f30171d;
            case 5:
                return dcVar.f30172e;
            case 6:
                return dcVar.f30173f;
            case 7:
                return dcVar.f30174g;
            case 8:
                return dcVar.f30175h;
            case 9:
                return dcVar.f30176i;
            case 10:
                return dcVar.f30177j;
            case 11:
                return dcVar.f30178k;
            case 12:
                return dcVar.f30179l;
            case 13:
                return dcVar.m;
            case 14:
                return dcVar.f30180n;
            case 15:
                return dcVar.f30181o;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
