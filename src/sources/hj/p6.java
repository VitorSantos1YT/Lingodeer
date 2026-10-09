package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f33100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f33101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f33102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f33103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SlowPlaySwitchBtn f33104e;

    public p6(FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, SlowPlaySwitchBtn slowPlaySwitchBtn) {
        this.f33100a = frameLayout;
        this.f33101b = linearLayout;
        this.f33102c = linearLayout2;
        this.f33103d = linearLayout3;
        this.f33104e = slowPlaySwitchBtn;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33100a;
    }
}
