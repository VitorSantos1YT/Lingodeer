package u5;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f52769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f52770b;

    public b(c cVar) {
        this.f52770b = cVar;
    }

    public final boolean a() {
        boolean zUnregisterDurationScaleChangeListener = ValueAnimator.unregisterDurationScaleChangeListener(this.f52769a);
        this.f52769a = null;
        return zUnregisterDurationScaleChangeListener;
    }
}
