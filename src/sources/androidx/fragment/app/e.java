package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m2 f1646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f1648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f1649d;

    public e(m2 m2Var, ViewGroup viewGroup, View view, f fVar) {
        this.f1646a = m2Var;
        this.f1647b = viewGroup;
        this.f1648c = view;
        this.f1649d = fVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        kotlin.jvm.internal.m.f(animation, "animation");
        ViewGroup viewGroup = this.f1647b;
        viewGroup.post(new d(viewGroup, this.f1648c, this.f1649d, 0));
        if (k1.L(2)) {
            Objects.toString(this.f1646a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        kotlin.jvm.internal.m.f(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        kotlin.jvm.internal.m.f(animation, "animation");
        if (k1.L(2)) {
            Objects.toString(this.f1646a);
        }
    }
}
