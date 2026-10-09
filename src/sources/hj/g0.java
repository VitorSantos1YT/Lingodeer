package hj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.lingo.lingoskill.widget.LollipopFixedWebView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 implements ta.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f32590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProgressBar f32591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NestedScrollView f32592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f32593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LollipopFixedWebView f32594e;

    public g0(FrameLayout frameLayout, ProgressBar progressBar, NestedScrollView nestedScrollView, TextView textView, LollipopFixedWebView lollipopFixedWebView) {
        this.f32590a = frameLayout;
        this.f32591b = progressBar;
        this.f32592c = nestedScrollView;
        this.f32593d = textView;
        this.f32594e = lollipopFixedWebView;
    }

    public static g0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_news_feed_detail, (ViewGroup) null, false);
        int i11 = R.id.progress_bar;
        ProgressBar progressBar = (ProgressBar) fr.j3.q(viewInflate, R.id.progress_bar);
        if (progressBar != null) {
            i11 = R.id.scroll_view;
            NestedScrollView nestedScrollView = (NestedScrollView) fr.j3.q(viewInflate, R.id.scroll_view);
            if (nestedScrollView != null) {
                i11 = R.id.tv_content;
                TextView textView = (TextView) fr.j3.q(viewInflate, R.id.tv_content);
                if (textView != null) {
                    i11 = R.id.web_view;
                    LollipopFixedWebView lollipopFixedWebView = (LollipopFixedWebView) fr.j3.q(viewInflate, R.id.web_view);
                    if (lollipopFixedWebView != null) {
                        return new g0((FrameLayout) viewInflate, progressBar, nestedScrollView, textView, lollipopFixedWebView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i11)));
    }

    @Override // ta.a
    public final View getRoot() {
        return this.f32590a;
    }
}
