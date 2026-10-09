package z4;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f58913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v1 f58914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v1 f58915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f58916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View f58917e;

    public y0(g1 g1Var, v1 v1Var, v1 v1Var2, int i11, View view) {
        this.f58913a = g1Var;
        this.f58914b = v1Var;
        this.f58915c = v1Var2;
        this.f58916d = i11;
        this.f58917e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        l1 i1Var;
        float animatedFraction = valueAnimator.getAnimatedFraction();
        g1 g1Var = this.f58913a;
        f1 f1Var = g1Var.f58839a;
        f1Var.e(animatedFraction);
        v1 v1Var = this.f58914b;
        s1 s1Var = v1Var.f58905a;
        float fC = f1Var.c();
        PathInterpolator pathInterpolator = a1.f58805e;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 34) {
            i1Var = new k1(v1Var);
        } else if (i11 >= 30) {
            i1Var = new j1(v1Var);
        } else {
            i1Var = i11 >= 29 ? new i1(v1Var) : new h1(v1Var);
        }
        for (int i12 = 1; i12 <= 512; i12 <<= 1) {
            if ((this.f58916d & i12) == 0) {
                i1Var.c(i12, s1Var.g(i12));
            } else {
                r4.d dVarG = s1Var.g(i12);
                r4.d dVarG2 = this.f58915c.f58905a.g(i12);
                float f5 = 1.0f - fC;
                i1Var.c(i12, v1.e(dVarG, (int) (((double) ((dVarG.f48793a - dVarG2.f48793a) * f5)) + 0.5d), (int) (((double) ((dVarG.f48794b - dVarG2.f48794b) * f5)) + 0.5d), (int) (((double) ((dVarG.f48795c - dVarG2.f48795c) * f5)) + 0.5d), (int) (((double) ((dVarG.f48796d - dVarG2.f48796d) * f5)) + 0.5d)));
            }
        }
        a1.h(this.f58917e, i1Var.b(), Collections.singletonList(g1Var));
    }
}
