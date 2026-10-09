package g2;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f28560f = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f28561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f28562b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewLayerContainer f28563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f28564d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f28565e;

    public g(AndroidComposeView androidComposeView) {
        this.f28561a = androidComposeView;
        e eVar = new e(this);
        this.f28565e = eVar;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.f28564d) {
                context.getApplicationContext().registerComponentCallbacks(eVar);
                this.f28564d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new f(this, 0));
    }

    @Override // g2.c0
    public final void a(j2.c cVar) {
        synchronized (this.f28562b) {
            if (!cVar.f35561s) {
                cVar.f35561s = true;
                cVar.b();
            }
        }
    }

    @Override // g2.c0
    public final j2.c b() {
        j2.e iVar;
        j2.c cVar;
        synchronized (this.f28562b) {
            try {
                AndroidComposeView androidComposeView = this.f28561a;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 29) {
                    b.b(androidComposeView);
                }
                if (i11 >= 29) {
                    iVar = new j2.g();
                } else if (f28560f) {
                    try {
                        iVar = new j2.f(this.f28561a, new w(), new i2.b());
                    } catch (Throwable unused) {
                        f28560f = false;
                        AndroidComposeView androidComposeView2 = this.f28561a;
                        ViewLayerContainer viewLayerContainer = this.f28563c;
                        if (viewLayerContainer == null) {
                            ViewLayerContainer viewLayerContainer2 = new ViewLayerContainer(androidComposeView2.getContext());
                            androidComposeView2.addView(viewLayerContainer2, -1);
                            this.f28563c = viewLayerContainer2;
                            viewLayerContainer = viewLayerContainer2;
                        }
                        iVar = new j2.i(viewLayerContainer);
                    }
                } else {
                    AndroidComposeView androidComposeView3 = this.f28561a;
                    ViewLayerContainer viewLayerContainer3 = this.f28563c;
                    if (viewLayerContainer3 == null) {
                        ViewLayerContainer viewLayerContainer4 = new ViewLayerContainer(androidComposeView3.getContext());
                        androidComposeView3.addView(viewLayerContainer4, -1);
                        this.f28563c = viewLayerContainer4;
                        viewLayerContainer3 = viewLayerContainer4;
                    }
                    iVar = new j2.i(viewLayerContainer3);
                }
                cVar = new j2.c(iVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }
}
