package androidx.fragment.app;

import android.animation.AnimatorSet;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f1708a = new k();

    public final void a(AnimatorSet animatorSet) {
        kotlin.jvm.internal.m.f(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void b(AnimatorSet animatorSet, long j11) {
        kotlin.jvm.internal.m.f(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j11);
    }
}
