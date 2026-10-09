package wg;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f55124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public q f55125b;

    public final r a() {
        r rVar = this.f55124a;
        if (rVar != null) {
            return rVar;
        }
        kotlin.jvm.internal.m.n("state");
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView view, String str, boolean z11) {
        kotlin.jvm.internal.m.f(view, "view");
        super.doUpdateVisitedHistory(view, str, z11);
        q qVar = this.f55125b;
        if (qVar == null) {
            kotlin.jvm.internal.m.n("navigator");
            throw null;
        }
        qVar.f55160b.setValue(Boolean.valueOf(view.canGoBack()));
        q qVar2 = this.f55125b;
        if (qVar2 == null) {
            kotlin.jvm.internal.m.n("navigator");
            throw null;
        }
        qVar2.f55161c.setValue(Boolean.valueOf(view.canGoForward()));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String str) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onPageFinished(view, str);
        r rVarA = a();
        rVarA.f55164c.setValue(c.f55126a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView view, String str, Bitmap bitmap) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onPageStarted(view, str, bitmap);
        r rVarA = a();
        rVarA.f55164c.setValue(new e(CropImageView.DEFAULT_ASPECT_RATIO));
        a().f55167f.clear();
        a().f55165d.setValue(null);
        a().f55166e.setValue(null);
        a().f55162a.setValue(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onReceivedError(view, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            a().f55167f.add(new j(webResourceRequest, webResourceError));
        }
    }
}
