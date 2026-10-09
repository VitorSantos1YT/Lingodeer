package wg;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public r f55123a;

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i11) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onProgressChanged(view, i11);
        r rVar = this.f55123a;
        if (rVar == null) {
            kotlin.jvm.internal.m.n("state");
            throw null;
        }
        if (((f) rVar.f55164c.getValue()) instanceof c) {
            return;
        }
        r rVar2 = this.f55123a;
        if (rVar2 == null) {
            kotlin.jvm.internal.m.n("state");
            throw null;
        }
        rVar2.f55164c.setValue(new e(i11 / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView view, Bitmap bitmap) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onReceivedIcon(view, bitmap);
        r rVar = this.f55123a;
        if (rVar != null) {
            rVar.f55166e.setValue(bitmap);
        } else {
            kotlin.jvm.internal.m.n("state");
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView view, String str) {
        kotlin.jvm.internal.m.f(view, "view");
        super.onReceivedTitle(view, str);
        r rVar = this.f55123a;
        if (rVar != null) {
            rVar.f55165d.setValue(str);
        } else {
            kotlin.jvm.internal.m.n("state");
            throw null;
        }
    }
}
