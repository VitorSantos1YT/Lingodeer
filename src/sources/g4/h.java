package g4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends l {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f28752f;

    @Override // g4.l
    public final void c(View view, float f5) {
        switch (this.f28752f) {
            case 0:
                view.setAlpha(a(f5));
                break;
            case 1:
                view.setElevation(a(f5));
                break;
            case 2:
                view.setPivotX(a(f5));
                break;
            case 3:
                view.setPivotY(a(f5));
                break;
            case 4:
                view.setRotation(a(f5));
                break;
            case 5:
                view.setRotationX(a(f5));
                break;
            case 6:
                view.setRotationY(a(f5));
                break;
            case 7:
                view.setScaleX(a(f5));
                break;
            case 8:
                view.setScaleY(a(f5));
                break;
            case 9:
                view.setTranslationX(a(f5));
                break;
            case 10:
                view.setTranslationY(a(f5));
                break;
            default:
                view.setTranslationZ(a(f5));
                break;
        }
    }
}
