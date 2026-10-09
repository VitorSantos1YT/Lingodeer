package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q6 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f33173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f33174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f33175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f33176d;

    public q6(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, TextView textView) {
        this.f33173a = linearLayout;
        this.f33174b = linearLayout2;
        this.f33175c = linearLayout3;
        this.f33176d = textView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33173a;
    }
}
