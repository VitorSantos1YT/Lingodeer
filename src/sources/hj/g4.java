package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g4 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f32625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f32626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32627d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f32628e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f32629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f32630g;

    public g4(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6) {
        this.f32624a = linearLayout;
        this.f32625b = textView;
        this.f32626c = textView2;
        this.f32627d = textView3;
        this.f32628e = textView4;
        this.f32629f = textView5;
        this.f32630g = textView6;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32624a;
    }
}
