package sp;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f51733b;

    public /* synthetic */ c(ProgressBar progressBar, int i11) {
        this.f51732a = i11;
        this.f51733b = progressBar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        switch (this.f51732a) {
            case 0:
                super.onPageFinished(webView, str);
                ProgressBar progressBar = this.f51733b;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                break;
            default:
                super.onPageFinished(webView, str);
                ProgressBar progressBar2 = this.f51733b;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(8);
                }
                break;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        switch (this.f51732a) {
            case 0:
                ProgressBar progressBar = this.f51733b;
                if (progressBar != null) {
                    progressBar.setVisibility(0);
                }
                break;
            default:
                ProgressBar progressBar2 = this.f51733b;
                if (progressBar2 != null) {
                    progressBar2.setVisibility(0);
                }
                break;
        }
    }
}
