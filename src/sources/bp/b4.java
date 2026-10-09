package bp;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.lingo.lingoskill.ui.base.NewsFeedWebActivity;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class b4 extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NewsFeedWebActivity f4506a;

    public b4(NewsFeedWebActivity newsFeedWebActivity) {
        this.f4506a = newsFeedWebActivity;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
        lc.d dVar = new lc.d(this.f4506a);
        lc.d.c(dVar, null, str2, 5);
        final int i11 = 0;
        lc.d.e(dVar, Integer.valueOf(R.string.f22251ok), null, new fz.c() { // from class: bp.a4
            @Override // fz.c
            public final Object invoke(Object obj) {
                lc.d it = (lc.d) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        JsResult jsResult2 = jsResult;
                        if (jsResult2 != null) {
                            jsResult2.confirm();
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        JsResult jsResult3 = jsResult;
                        if (jsResult3 != null) {
                            jsResult3.cancel();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        }, 2);
        final int i12 = 1;
        md.a.r(dVar, new fz.c() { // from class: bp.a4
            @Override // fz.c
            public final Object invoke(Object obj) {
                lc.d it = (lc.d) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        JsResult jsResult2 = jsResult;
                        if (jsResult2 != null) {
                            jsResult2.confirm();
                        }
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        JsResult jsResult3 = jsResult;
                        if (jsResult3 != null) {
                            jsResult3.cancel();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        dVar.show();
        return true;
    }
}
