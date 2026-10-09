package s7;

import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import com.google.common.collect.Ordering;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f51435a;

    public k(q qVar) {
        this.f51435a = qVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z11) {
        Ordering ordering = q.f51450k;
        this.f51435a.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z11) {
        Ordering ordering = q.f51450k;
        this.f51435a.f();
    }
}
