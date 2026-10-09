package bp;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class u5 extends WebViewClient {
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView view, String str) {
        kotlin.jvm.internal.m.f(view, "view");
        if (str == null) {
            return true;
        }
        view.loadUrl(str);
        return true;
    }
}
