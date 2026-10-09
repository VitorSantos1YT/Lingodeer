package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32569c;

    public f4(LinearLayout linearLayout, TextView textView, TextView textView2) {
        this.f32567a = linearLayout;
        this.f32568b = textView;
        this.f32569c = textView2;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32567a;
    }
}
