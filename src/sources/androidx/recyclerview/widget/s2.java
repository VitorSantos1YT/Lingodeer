package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2 f2610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2 f2611b;

    public s2(r2 r2Var) {
        this.f2610a = r2Var;
        q2 q2Var = new q2();
        q2Var.f2594a = 0;
        this.f2611b = q2Var;
    }

    public final View a(int i11, int i12, int i13, int i14) {
        r2 r2Var = this.f2610a;
        int iB = r2Var.b();
        int iC = r2Var.c();
        int i15 = i12 > i11 ? 1 : -1;
        View view = null;
        while (i11 != i12) {
            View viewD = r2Var.d(i11);
            int iA = r2Var.a(viewD);
            int iE = r2Var.e(viewD);
            q2 q2Var = this.f2611b;
            q2Var.f2595b = iB;
            q2Var.f2596c = iC;
            q2Var.f2597d = iA;
            q2Var.f2598e = iE;
            if (i13 != 0) {
                q2Var.f2594a = i13;
                if (q2Var.a()) {
                    return viewD;
                }
            }
            if (i14 != 0) {
                q2Var.f2594a = i14;
                if (q2Var.a()) {
                    view = viewD;
                }
            }
            i11 += i15;
        }
        return view;
    }

    public final boolean b(View view) {
        r2 r2Var = this.f2610a;
        int iB = r2Var.b();
        int iC = r2Var.c();
        int iA = r2Var.a(view);
        int iE = r2Var.e(view);
        q2 q2Var = this.f2611b;
        q2Var.f2595b = iB;
        q2Var.f2596c = iC;
        q2Var.f2597d = iA;
        q2Var.f2598e = iE;
        q2Var.f2594a = 24579;
        return q2Var.a();
    }
}
