package u5;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends v10.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f52780j;

    public /* synthetic */ d(int i11) {
        this.f52780j = i11;
    }

    @Override // v10.c
    public final void K(Object obj, float f5) {
        switch (this.f52780j) {
            case 0:
                ((View) obj).setAlpha(f5);
                break;
            case 1:
                ((View) obj).setScaleX(f5);
                break;
            case 2:
                ((View) obj).setScaleY(f5);
                break;
            case 3:
                ((View) obj).setRotation(f5);
                break;
            case 4:
                ((View) obj).setRotationX(f5);
                break;
            default:
                ((View) obj).setRotationY(f5);
                break;
        }
    }

    @Override // v10.c
    public final float x(Object obj) {
        switch (this.f52780j) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getScaleX();
            case 2:
                return ((View) obj).getScaleY();
            case 3:
                return ((View) obj).getRotation();
            case 4:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }
}
