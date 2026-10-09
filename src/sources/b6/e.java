package b6;

import android.content.Context;
import androidx.fragment.app.FragmentContainerView;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FragmentContainerView f3943b;

    public e(int i11) {
        this.f3942a = i11;
    }

    public final FragmentContainerView a() {
        FragmentContainerView fragmentContainerView = this.f3943b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException(p0.i(this.f3942a, " yet", new StringBuilder("AndroidView has not created a container for ")).toString());
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
        fragmentContainerView.setId(this.f3942a);
        this.f3943b = fragmentContainerView;
        return fragmentContainerView;
    }
}
