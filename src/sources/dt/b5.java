package dt;

import android.content.Context;
import android.content.pm.ResolveInfo;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b5 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f23665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f23666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f23667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f23668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f23669f;

    public /* synthetic */ b5(long j11, boolean z11, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, int i11) {
        this.f23664a = i11;
        this.f23665b = j11;
        this.f23666c = z11;
        this.f23667d = b1Var;
        this.f23668e = b1Var2;
        this.f23669f = b1Var3;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f23664a) {
            case 0:
                l1.b1 b1Var = (l1.b1) this.f23667d;
                l1.b1 b1Var2 = (l1.b1) this.f23668e;
                final l1.b1 b1Var3 = (l1.b1) this.f23669f;
                WebView webView = (WebView) obj;
                kotlin.jvm.internal.m.f(webView, "webView");
                b1Var.setValue(webView);
                webView.getSettings().setSupportZoom(true);
                webView.getSettings().setTextZoom(((Number) b1Var2.getValue()).intValue());
                b1Var2.setValue(Integer.valueOf(webView.getSettings().getTextZoom()));
                webView.setOnTouchListener(new View.OnTouchListener() { // from class: dt.e5
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0 && motionEvent.getAction() != 2) {
                            return false;
                        }
                        b1Var3.setValue(Boolean.TRUE);
                        return false;
                    }
                });
                webView.setBackgroundColor(g2.f0.E(this.f23665b));
                if (this.f23666c) {
                    if (se.k.s("ALGORITHMIC_DARKENING")) {
                        va.a.b(webView.getSettings());
                    }
                    if (se.k.s("FORCE_DARK")) {
                        va.a.c(webView.getSettings());
                    }
                }
                break;
            case 1:
                l1.b1 b1Var4 = (l1.b1) this.f23667d;
                l1.b1 b1Var5 = (l1.b1) this.f23668e;
                l1.b1 b1Var6 = (l1.b1) this.f23669f;
                WebView webView2 = (WebView) obj;
                kotlin.jvm.internal.m.f(webView2, "webView");
                b1Var4.setValue(webView2);
                webView2.getSettings().setSupportZoom(true);
                webView2.getSettings().setTextZoom(((Number) b1Var5.getValue()).intValue());
                b1Var5.setValue(Integer.valueOf(webView2.getSettings().getTextZoom()));
                webView2.setOnTouchListener(new qp.o(5, new kotlin.jvm.internal.v(), b1Var6));
                webView2.setBackgroundColor(g2.f0.E(this.f23665b));
                if (this.f23666c) {
                    if (se.k.s("ALGORITHMIC_DARKENING")) {
                        va.a.b(webView2.getSettings());
                    }
                    if (se.k.s("FORCE_DARK")) {
                        va.a.c(webView2.getSettings());
                    }
                }
                break;
            default:
                Context context = (Context) this.f23667d;
                ResolveInfo resolveInfo = (ResolveInfo) this.f23668e;
                String str = (String) this.f23669f;
                t0.a.f51979b.i(context, resolveInfo, Boolean.valueOf(this.f23666c), str, new j3.x0(this.f23665b));
                ((v0.g) obj).close();
                break;
        }
        return qy.b0.f48488a;
    }

    public /* synthetic */ b5(Context context, ResolveInfo resolveInfo, boolean z11, String str, long j11) {
        this.f23664a = 2;
        this.f23667d = context;
        this.f23668e = resolveInfo;
        this.f23666c = z11;
        this.f23669f = str;
        this.f23665b = j11;
    }
}
