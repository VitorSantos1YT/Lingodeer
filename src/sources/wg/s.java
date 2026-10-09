package wg;

import android.os.Bundle;
import android.webkit.WebView;
import ry.x;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends kotlin.jvm.internal.n implements fz.e {
    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        w1.k mapSaver = (w1.k) obj;
        r it = (r) obj2;
        kotlin.jvm.internal.m.f(mapSaver, "$this$mapSaver");
        kotlin.jvm.internal.m.f(it, "it");
        Bundle bundle = new Bundle();
        WebView webView = (WebView) it.f55169h.getValue();
        if (webView != null) {
            webView.saveState(bundle);
        }
        return x.Y(new qy.l("pagetitle", (String) it.f55165d.getValue()), new qy.l("lastloaded", (String) it.f55162a.getValue()), new qy.l("bundle", bundle));
    }
}
