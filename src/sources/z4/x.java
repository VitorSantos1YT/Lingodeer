package z4;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScrollFeedbackProvider f58912a;

    public x(NestedScrollView nestedScrollView) {
        this.f58912a = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // z4.y
    public final void onScrollLimit(int i11, int i12, int i13, boolean z11) {
        this.f58912a.onScrollLimit(i11, i12, i13, z11);
    }

    @Override // z4.y
    public final void onScrollProgress(int i11, int i12, int i13, int i14) {
        this.f58912a.onScrollProgress(i11, i12, i13, i14);
    }
}
