package bp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.lifecycle.LifecycleOwnerKt;
import com.lingo.lingoskill.ui.base.NewsFeedDetailActivity;
import com.lingo.lingoskill.ui.base.NewsFeedWebActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f4875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4876c;

    public /* synthetic */ w3(Object obj, int i11) {
        this.f4874a = i11;
        this.f4876c = obj;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        ViewPropertyAnimator duration;
        switch (this.f4874a) {
            case 0:
                super.onPageFinished(webView, str);
                NewsFeedDetailActivity newsFeedDetailActivity = (NewsFeedDetailActivity) this.f4876c;
                if (!newsFeedDetailActivity.isFinishing() && !newsFeedDetailActivity.isDestroyed()) {
                    ((hj.g0) newsFeedDetailActivity.j()).f32591b.setVisibility(8);
                    break;
                }
                break;
            case 1:
                super.onPageFinished(webView, str);
                ((hj.h0) ((NewsFeedWebActivity) this.f4876c).j()).f32642c.setVisibility(8);
                break;
            case 2:
                super.onPageFinished(webView, str);
                RemoteUrlActivity remoteUrlActivity = (RemoteUrlActivity) this.f4876c;
                if (!remoteUrlActivity.isFinishing() && !remoteUrlActivity.isDestroyed()) {
                    ((hj.q0) remoteUrlActivity.j()).f33131b.setVisibility(8);
                    break;
                }
                break;
            default:
                super.onPageFinished(webView, str);
                jp.w0 w0Var = (jp.w0) this.f4876c;
                if (w0Var.getView() != null) {
                    ta.a aVar = w0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = ((hj.r5) aVar).f33229b.animate();
                    if (viewPropertyAnimatorAnimate != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(CropImageView.DEFAULT_ASPECT_RATIO)) != null && (duration = viewPropertyAnimatorAlpha.setDuration(300L)) != null) {
                        duration.start();
                    }
                    th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new a5.f(w0Var, 19), vx.b.f54316e), w0Var.f36401t);
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f4874a) {
            case 0:
                NewsFeedDetailActivity newsFeedDetailActivity = (NewsFeedDetailActivity) this.f4876c;
                if (!newsFeedDetailActivity.isFinishing() && !newsFeedDetailActivity.isDestroyed()) {
                    this.f4875b = str;
                    ((hj.g0) newsFeedDetailActivity.j()).f32591b.setVisibility(0);
                    break;
                }
                break;
            case 1:
                this.f4875b = str;
                ((hj.h0) ((NewsFeedWebActivity) this.f4876c).j()).f32642c.setVisibility(0);
                break;
            case 2:
                RemoteUrlActivity remoteUrlActivity = (RemoteUrlActivity) this.f4876c;
                if (!remoteUrlActivity.isFinishing() && !remoteUrlActivity.isDestroyed()) {
                    this.f4875b = str;
                    ((hj.q0) remoteUrlActivity.j()).f33131b.setVisibility(0);
                    break;
                }
                break;
            default:
                jp.w0 w0Var = (jp.w0) this.f4876c;
                if (w0Var.getView() != null) {
                    this.f4875b = str;
                    ta.a aVar = w0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar);
                    ((hj.r5) aVar).f33229b.setAlpha(1.0f);
                    ta.a aVar2 = w0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar2);
                    ((hj.r5) aVar2).f33234g.setSpeed(2.0f);
                    ta.a aVar3 = w0Var.f36400f;
                    kotlin.jvm.internal.m.c(aVar3);
                    ((hj.r5) aVar3).f33234g.h();
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String url) {
        int i11 = this.f4874a;
        vy.d dVar = null;
        Object obj = this.f4876c;
        int i12 = 1;
        kotlin.jvm.internal.m.f(view, "view");
        kotlin.jvm.internal.m.f(url, "url");
        switch (i11) {
            case 0:
                NewsFeedDetailActivity newsFeedDetailActivity = (NewsFeedDetailActivity) obj;
                if (newsFeedDetailActivity.isFinishing() || newsFeedDetailActivity.isDestroyed()) {
                    return true;
                }
                if (!oz.x.s0(url, "mailto:", false)) {
                    String str = this.f4875b;
                    if (str == null || !oz.x.l0(str, url, false)) {
                        return super.shouldOverrideUrlLoading(view, url);
                    }
                    view.loadUrl(url);
                    return true;
                }
                String strSubstring = url.substring(7);
                kotlin.jvm.internal.m.e(strSubstring, "substring(...)");
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{strSubstring});
                if (intent.resolveActivity(newsFeedDetailActivity.getPackageManager()) != null) {
                    newsFeedDetailActivity.startActivity(intent);
                    return true;
                }
                lc.d dVar2 = new lc.d(newsFeedDetailActivity);
                lc.d.g(dVar2, null, newsFeedDetailActivity.getString(R.string.email_not_found_title), 1);
                lc.d.e(dVar2, Integer.valueOf(R.string.f22251ok), null, new q3(dVar2, i12), 2);
                dVar2.show();
                return true;
            case 1:
                NewsFeedWebActivity newsFeedWebActivity = (NewsFeedWebActivity) obj;
                int i13 = NewsFeedWebActivity.Q;
                if (!oz.x.s0(url, "https://www.lingodeer.com/dp", false)) {
                    String str2 = this.f4875b;
                    if (str2 == null || !oz.x.l0(str2, url, false)) {
                        return super.shouldOverrideUrlLoading(view, url);
                    }
                    view.loadUrl(url);
                    return true;
                }
                newsFeedWebActivity.o(url);
                Uri uri = Uri.parse(url);
                if (!uri.getQueryParameterNames().contains("contentId")) {
                    return true;
                }
                String queryParameter = uri.getQueryParameter("contentId");
                newsFeedWebActivity.m().c("jxz_news_feed_click", new ar.a(queryParameter, 3));
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(newsFeedWebActivity), null, null, new b1.c(10, newsFeedWebActivity, queryParameter, dVar), 3);
                return true;
            case 2:
                RemoteUrlActivity remoteUrlActivity = (RemoteUrlActivity) obj;
                if (remoteUrlActivity.isFinishing() || remoteUrlActivity.isDestroyed()) {
                    return true;
                }
                if (oz.x.s0(url, "https://www.lingodeer.com/dp", false)) {
                    remoteUrlActivity.o(url);
                    return true;
                }
                String str3 = this.f4875b;
                if (str3 == null || !oz.x.l0(str3, url, false)) {
                    return super.shouldOverrideUrlLoading(view, url);
                }
                view.loadUrl(url);
                return true;
            default:
                if (((jp.w0) obj).getView() == null) {
                    return false;
                }
                String str4 = this.f4875b;
                if (str4 == null || !oz.x.l0(str4, url, false)) {
                    return super.shouldOverrideUrlLoading(view, url);
                }
                view.loadUrl(url);
                return true;
        }
    }
}
