package hj;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.lingo.lingoskill.widget.LollipopFixedWebView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinearLayout f32640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3 f32641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f32642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LollipopFixedWebView f32643d;

    public h0(LinearLayout linearLayout, d3 d3Var, ProgressBar progressBar, LollipopFixedWebView lollipopFixedWebView) {
        this.f32640a = linearLayout;
        this.f32641b = d3Var;
        this.f32642c = progressBar;
        this.f32643d = lollipopFixedWebView;
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32640a;
    }
}
