package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f33130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f33131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LollipopFixedWebView f33132c;

    public q0(FrameLayout frameLayout, ProgressBar progressBar, LollipopFixedWebView lollipopFixedWebView) {
        this.f33130a = frameLayout;
        this.f33131b = progressBar;
        this.f33132c = lollipopFixedWebView;
    }

    public static q0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_policy_content, (ViewGroup) null, false);
        int i11 = R.id.progress_bar;
        ProgressBar progressBar = (ProgressBar) fr.j3.q(viewInflate, R.id.progress_bar);
        if (progressBar != null) {
            i11 = R.id.web_view;
            LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) fr.j3.q(viewInflate, R.id.web_view);
            if (lollipopFixedWebView != null) {
                return new q0((FrameLayout) viewInflate, progressBar, lollipopFixedWebView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f33130a;
    }
}
