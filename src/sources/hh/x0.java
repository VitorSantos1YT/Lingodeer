package hh;

import android.view.View;
import android.webkit.WebSettings;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebSettings f32309b;

    public /* synthetic */ x0(WebSettings webSettings, int i11) {
        this.f32308a = i11;
        this.f32309b = webSettings;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        View it = (View) obj;
        switch (this.f32308a) {
            case 0:
                WebSettings webSettings = this.f32309b;
                if (webSettings.getTextZoom() < 150) {
                    webSettings.setSupportZoom(true);
                    webSettings.setTextZoom(webSettings.getTextZoom() + 10);
                }
                break;
            case 1:
                WebSettings webSettings2 = this.f32309b;
                if (webSettings2.getTextZoom() > 50) {
                    webSettings2.setSupportZoom(true);
                    webSettings2.setTextZoom(webSettings2.getTextZoom() - 10);
                }
                break;
            case 2:
                kotlin.jvm.internal.m.f(it, "it");
                WebSettings webSettings3 = this.f32309b;
                if (webSettings3.getTextZoom() < 150) {
                    webSettings3.setSupportZoom(true);
                    webSettings3.setTextZoom(webSettings3.getTextZoom() + 10);
                }
                break;
            case 3:
                kotlin.jvm.internal.m.f(it, "it");
                WebSettings webSettings4 = this.f32309b;
                if (webSettings4.getTextZoom() > 50) {
                    webSettings4.setSupportZoom(true);
                    webSettings4.setTextZoom(webSettings4.getTextZoom() - 10);
                }
                break;
            case 4:
                kotlin.jvm.internal.m.f(it, "it");
                WebSettings webSettings5 = this.f32309b;
                if (webSettings5.getTextZoom() < 150) {
                    webSettings5.setSupportZoom(true);
                    webSettings5.setTextZoom(webSettings5.getTextZoom() + 10);
                }
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                WebSettings webSettings6 = this.f32309b;
                if (webSettings6.getTextZoom() > 50) {
                    webSettings6.setSupportZoom(true);
                    webSettings6.setTextZoom(webSettings6.getTextZoom() - 10);
                }
                break;
        }
        return qy.b0.f48488a;
    }
}
