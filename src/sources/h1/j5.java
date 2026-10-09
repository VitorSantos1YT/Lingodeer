package h1;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rz.b0 f30476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.d f30477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ fz.a f30478c;

    public j5(fz.a aVar, b0.d dVar, rz.b0 b0Var) {
        this.f30476a = b0Var;
        this.f30477b = dVar;
        this.f30478c = aVar;
    }

    public final void onBackCancelled() {
        rz.e0.B(this.f30476a, null, null, new bt.f0(this.f30477b, null, 2), 3);
    }

    public final void onBackInvoked() {
        this.f30478c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        rz.e0.B(this.f30476a, null, null, new i5(this.f30477b, backEvent, null, 0), 3);
    }

    public final void onBackStarted(BackEvent backEvent) {
        rz.e0.B(this.f30476a, null, null, new i5(this.f30477b, backEvent, null, 1), 3);
    }
}
