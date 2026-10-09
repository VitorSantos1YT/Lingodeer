package l;

import android.view.ViewGroup;
import com.yalantis.ucrop.view.CropImageView;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.b f39060b;

    public /* synthetic */ r(androidx.appcompat.app.b bVar, int i11) {
        this.f39059a = i11;
        this.f39060b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f39059a) {
            case 0:
                androidx.appcompat.app.b bVar = this.f39060b;
                if ((bVar.B0 & 1) != 0) {
                    bVar.w(0);
                }
                if ((bVar.B0 & 4096) != 0) {
                    bVar.w(108);
                }
                bVar.A0 = false;
                bVar.B0 = 0;
                break;
            default:
                androidx.appcompat.app.b bVar2 = this.f39060b;
                bVar2.Y.showAtLocation(bVar2.X, 55, 0, 0);
                w0 w0Var = bVar2.f801a0;
                if (w0Var != null) {
                    w0Var.b();
                }
                if (bVar2.f802b0 && (viewGroup = bVar2.f803c0) != null && viewGroup.isLaidOut()) {
                    bVar2.X.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
                    w0 w0VarB = s0.b(bVar2.X);
                    w0VarB.a(1.0f);
                    bVar2.f801a0 = w0VarB;
                    w0VarB.g(new t(this, 0));
                } else {
                    bVar2.X.setAlpha(1.0f);
                    bVar2.X.setVisibility(0);
                }
                break;
        }
    }
}
