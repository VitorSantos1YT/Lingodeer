package g4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f28742g;

    @Override // g4.g
    public final void e(View view, float f5) {
        switch (this.f28742g) {
            case 0:
                view.setAlpha(a(f5));
                break;
            case 1:
                view.setElevation(a(f5));
                break;
            case 2:
                view.setRotation(a(f5));
                break;
            case 3:
                view.setRotationX(a(f5));
                break;
            case 4:
                view.setRotationY(a(f5));
                break;
            case 5:
                view.setScaleX(a(f5));
                break;
            case 6:
                view.setScaleY(a(f5));
                break;
            case 7:
                view.setTranslationX(a(f5));
                break;
            case 8:
                view.setTranslationY(a(f5));
                break;
            default:
                view.setTranslationZ(a(f5));
                break;
        }
    }
}
