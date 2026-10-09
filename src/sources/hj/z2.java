package hj;

import android.view.View;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class z2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f33658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FlexboxLayout f33659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e3 f33660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SlowPlaySwitchBtn f33661e;

    public z2(LinearLayout linearLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, e3 e3Var, SlowPlaySwitchBtn slowPlaySwitchBtn) {
        this.f33657a = linearLayout;
        this.f33658b = flexboxLayout;
        this.f33659c = flexboxLayout2;
        this.f33660d = e3Var;
        this.f33661e = slowPlaySwitchBtn;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33657a;
    }
}
