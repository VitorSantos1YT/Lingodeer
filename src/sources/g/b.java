package g;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.compose.ui.window.PopupLayout;
import bt.j1;
import l1.b1;
import wg.r;
import z3.z;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.n implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f28285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f28286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f28288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f28289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f28290f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PopupLayout popupLayout, fz.a aVar, z zVar, String str, v3.m mVar) {
        super(1);
        this.f28285a = 2;
        this.f28286b = popupLayout;
        this.f28287c = aVar;
        this.f28289e = zVar;
        this.f28288d = str;
        this.f28290f = mVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f28285a) {
            case 0:
                a aVar = (a) this.f28286b;
                aVar.f28284a = ((i.i) this.f28287c).d((String) this.f28288d, (j.a) this.f28289e, new com.google.firebase.database.android.d((b1) this.f28290f, 20));
                return new j1(aVar, 1);
            case 1:
                Context context = (Context) obj;
                r rVar = (r) this.f28288d;
                kotlin.jvm.internal.m.f(context, "context");
                WebView webView = new WebView(context);
                fz.c cVar = (fz.c) this.f28286b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f28287c;
                wg.a aVar2 = (wg.a) this.f28289e;
                wg.b bVar = (wg.b) this.f28290f;
                cVar.invoke(webView);
                webView.setLayoutParams(layoutParams);
                Bundle bundle = rVar.f55168g;
                if (bundle != null) {
                    webView.restoreState(bundle);
                }
                webView.setWebChromeClient(aVar2);
                webView.setWebViewClient(bVar);
                rVar.f55169h.setValue(webView);
                return webView;
            default:
                PopupLayout popupLayout = (PopupLayout) this.f28286b;
                popupLayout.Q.addView(popupLayout, popupLayout.R);
                popupLayout.l((fz.a) this.f28287c, (z) this.f28289e, (String) this.f28288d, (v3.m) this.f28290f);
                return new j1(popupLayout, 19);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i11) {
        super(1);
        this.f28285a = i11;
        this.f28286b = obj;
        this.f28287c = obj2;
        this.f28288d = obj3;
        this.f28289e = obj4;
        this.f28290f = obj5;
    }
}
