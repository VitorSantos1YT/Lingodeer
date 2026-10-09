package f;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f26119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f26120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f26121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f26122d;

    public a0(y yVar, y yVar2, z zVar, z zVar2) {
        this.f26119a = yVar;
        this.f26120b = yVar2;
        this.f26121c = zVar;
        this.f26122d = zVar2;
    }

    public final void onBackCancelled() {
        this.f26122d.invoke();
    }

    public final void onBackInvoked() {
        this.f26121c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        this.f26120b.invoke(new a(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.m.f(backEvent, "backEvent");
        this.f26119a.invoke(new a(backEvent));
    }
}
