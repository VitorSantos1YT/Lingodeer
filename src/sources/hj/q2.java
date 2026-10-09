package hj;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q2 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f33137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FlexboxLayout f33138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FrameLayout f33139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f33140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f33141e;

    public q2(FrameLayout frameLayout, FlexboxLayout flexboxLayout, FrameLayout frameLayout2, View view, LinearLayout linearLayout) {
        this.f33137a = frameLayout;
        this.f33138b = flexboxLayout;
        this.f33139c = frameLayout2;
        this.f33140d = view;
        this.f33141e = linearLayout;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33137a;
    }
}
