package bp;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookServiceException;
import com.facebook.internal.WebDialog$setUpWebView$1;
import com.lingo.lingoskill.ui.base.MethodologyActivity;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i3 extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View.OnCreateContextMenuListener f4639b;

    public /* synthetic */ i3(View.OnCreateContextMenuListener onCreateContextMenuListener, int i11) {
        this.f4638a = i11;
        this.f4639b = onCreateContextMenuListener;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String url) {
        ProgressDialog progressDialog;
        switch (this.f4638a) {
            case 0:
                super.onPageFinished(view, url);
                ((hj.q0) ((MethodologyActivity) this.f4639b).j()).f33131b.setVisibility(8);
                break;
            case 1:
                super.onPageFinished(view, url);
                jp.j1 j1Var = (jp.j1) this.f4639b;
                if (j1Var.getView() != null) {
                    hj.e3 e3Var = j1Var.U;
                    kotlin.jvm.internal.m.c(e3Var);
                    ((ProgressBar) e3Var.f32524c).setVisibility(8);
                }
                break;
            default:
                kotlin.jvm.internal.m.f(view, "view");
                kotlin.jvm.internal.m.f(url, "url");
                super.onPageFinished(view, url);
                lf.p1 p1Var = (lf.p1) this.f4639b;
                if (!p1Var.L && (progressDialog = p1Var.f40094e) != null) {
                    progressDialog.dismiss();
                }
                FrameLayout frameLayout = p1Var.f40096t;
                if (frameLayout != null) {
                    frameLayout.setBackgroundColor(0);
                }
                WebDialog$setUpWebView$1 webDialog$setUpWebView$1 = p1Var.f40093d;
                if (webDialog$setUpWebView$1 != null) {
                    webDialog$setUpWebView$1.setVisibility(0);
                }
                ImageView imageView = p1Var.f40095f;
                if (imageView != null) {
                    imageView.setVisibility(0);
                }
                p1Var.M = true;
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView view, String url, Bitmap bitmap) {
        ProgressDialog progressDialog;
        switch (this.f4638a) {
            case 2:
                kotlin.jvm.internal.m.f(view, "view");
                kotlin.jvm.internal.m.f(url, "url");
                re.s sVar = re.s.f49201a;
                super.onPageStarted(view, url, bitmap);
                lf.p1 p1Var = (lf.p1) this.f4639b;
                if (!p1Var.L && (progressDialog = p1Var.f40094e) != null) {
                    progressDialog.show();
                    break;
                }
                break;
            default:
                super.onPageStarted(view, url, bitmap);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView view, int i11, String description, String failingUrl) {
        switch (this.f4638a) {
            case 2:
                kotlin.jvm.internal.m.f(view, "view");
                kotlin.jvm.internal.m.f(description, "description");
                kotlin.jvm.internal.m.f(failingUrl, "failingUrl");
                super.onReceivedError(view, i11, description, failingUrl);
                ((lf.p1) this.f4639b).e(new FacebookDialogException(description, i11, failingUrl));
                break;
            default:
                super.onReceivedError(view, i11, description, failingUrl);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
        switch (this.f4638a) {
            case 2:
                kotlin.jvm.internal.m.f(view, "view");
                kotlin.jvm.internal.m.f(handler, "handler");
                kotlin.jvm.internal.m.f(error, "error");
                super.onReceivedSslError(view, handler, error);
                handler.cancel();
                ((lf.p1) this.f4639b).e(new FacebookDialogException(null, -11, null));
                break;
            default:
                super.onReceivedSslError(view, handler, error);
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f4638a) {
            case 1:
                jp.j1 j1Var = (jp.j1) this.f4639b;
                if (!oz.x.s0(j1Var.S, "https://www.lingodeer.com/dp", false)) {
                    return shouldOverrideUrlLoading(webView, j1Var.S);
                }
                androidx.fragment.app.p0 p0VarRequireActivity = j1Var.requireActivity();
                kotlin.jvm.internal.m.d(p0VarRequireActivity, "null cannot be cast to non-null type com.lingo.lingoskill.base.ui.BaseActivity<*>");
                ((ji.b) p0VarRequireActivity).o(j1Var.S);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        int i11;
        switch (this.f4638a) {
            case 0:
                kotlin.jvm.internal.m.f(view, "view");
                if (url != null) {
                    view.loadUrl(url);
                }
                return true;
            case 1:
            default:
                return super.shouldOverrideUrlLoading(view, url);
            case 2:
                lf.p1 p1Var = (lf.p1) this.f4639b;
                kotlin.jvm.internal.m.f(view, "view");
                kotlin.jvm.internal.m.f(url, "url");
                re.s sVar = re.s.f49201a;
                Uri uri = Uri.parse(url);
                boolean z11 = uri.getPath() != null && Pattern.matches("^/(v\\d+\\.\\d+/)??dialog/.*", uri.getPath());
                if (oz.x.s0(url, p1Var.f40091b, false)) {
                    Bundle bundleC = p1Var.c(url);
                    String string = bundleC.getString("error");
                    if (string == null) {
                        string = bundleC.getString("error_type");
                    }
                    String string2 = bundleC.getString("error_msg");
                    if (string2 == null) {
                        string2 = bundleC.getString("error_message");
                    }
                    if (string2 == null) {
                        string2 = bundleC.getString("error_description");
                    }
                    String string3 = bundleC.getString("error_code");
                    if (string3 != null && !lf.j1.y(string3)) {
                        try {
                            i11 = Integer.parseInt(string3);
                        } catch (NumberFormatException unused) {
                            i11 = -1;
                        }
                        break;
                    } else {
                        i11 = -1;
                    }
                    if (lf.j1.y(string) && lf.j1.y(string2) && i11 == -1) {
                        lf.l1 l1Var = p1Var.f40092c;
                        if (l1Var == null || p1Var.K) {
                            return true;
                        }
                        p1Var.K = true;
                        l1Var.b(bundleC, null);
                        p1Var.dismiss();
                        return true;
                    }
                    if (string != null && (string.equals("access_denied") || string.equals("OAuthAccessDeniedException"))) {
                        p1Var.cancel();
                        return true;
                    }
                    if (i11 == 4201) {
                        p1Var.cancel();
                        return true;
                    }
                    p1Var.e(new FacebookServiceException(new re.r(i11, string, string2), string2));
                    return true;
                }
                if (oz.x.s0(url, "fbconnect://cancel", false)) {
                    p1Var.cancel();
                    return true;
                }
                if (!z11 && !oz.q.v0(url, "touch", false)) {
                    try {
                        p1Var.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(url)));
                        return true;
                    } catch (ActivityNotFoundException unused2) {
                    }
                }
                return false;
        }
    }
}
