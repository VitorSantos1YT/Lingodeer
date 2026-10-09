package g4;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends q {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f28761k;

    @Override // g4.q
    public final boolean d(float f5, long j11, View view, c4.e eVar) {
        switch (this.f28761k) {
            case 0:
                view.setAlpha(b(f5, j11, view, eVar));
                break;
            case 1:
                view.setElevation(b(f5, j11, view, eVar));
                break;
            case 2:
                view.setRotation(b(f5, j11, view, eVar));
                break;
            case 3:
                view.setRotationX(b(f5, j11, view, eVar));
                break;
            case 4:
                view.setRotationY(b(f5, j11, view, eVar));
                break;
            case 5:
                view.setScaleX(b(f5, j11, view, eVar));
                break;
            case 6:
                view.setScaleY(b(f5, j11, view, eVar));
                break;
            case 7:
                view.setTranslationX(b(f5, j11, view, eVar));
                break;
            case 8:
                view.setTranslationY(b(f5, j11, view, eVar));
                break;
            default:
                view.setTranslationZ(b(f5, j11, view, eVar));
                break;
        }
        return this.f28773h;
    }
}
