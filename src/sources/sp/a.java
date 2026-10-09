package sp;

import android.view.View;
import android.webkit.WebView;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f51728b;

    public /* synthetic */ a(WebView webView, int i11) {
        this.f51727a = i11;
        this.f51728b = webView;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f51727a) {
            case 0:
                m.f(it, "it");
                WebView webView = this.f51728b;
                if (webView.getSettings().getTextZoom() < 150) {
                    webView.getSettings().setSupportZoom(true);
                    webView.getSettings().setTextZoom(webView.getSettings().getTextZoom() + 10);
                }
                break;
            case 1:
                m.f(it, "it");
                WebView webView2 = this.f51728b;
                if (webView2.getSettings().getTextZoom() > 50) {
                    webView2.getSettings().setSupportZoom(true);
                    webView2.getSettings().setTextZoom(webView2.getSettings().getTextZoom() - 10);
                }
                break;
            case 2:
                m.f(it, "it");
                WebView webView3 = this.f51728b;
                if (webView3.getSettings().getTextZoom() < 150) {
                    webView3.getSettings().setSupportZoom(true);
                    webView3.getSettings().setTextZoom(webView3.getSettings().getTextZoom() + 10);
                }
                break;
            default:
                m.f(it, "it");
                WebView webView4 = this.f51728b;
                if (webView4.getSettings().getTextZoom() > 50) {
                    webView4.getSettings().setSupportZoom(true);
                    webView4.getSettings().setTextZoom(webView4.getSettings().getTextZoom() - 10);
                }
                break;
        }
        return b0.f48488a;
    }
}
