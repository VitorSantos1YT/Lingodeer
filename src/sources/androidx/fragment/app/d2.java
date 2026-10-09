package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 implements Transition.TransitionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f2 f1645e;

    public d2(f2 f2Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f1645e = f2Var;
        this.f1641a = obj;
        this.f1642b = arrayList;
        this.f1643c = obj2;
        this.f1644d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        f2 f2Var = this.f1645e;
        Object obj = this.f1641a;
        if (obj != null) {
            f2Var.A(obj, this.f1642b, null);
        }
        Object obj2 = this.f1643c;
        if (obj2 != null) {
            f2Var.A(obj2, this.f1644d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
