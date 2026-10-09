package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2638b;

    public /* synthetic */ v(Object obj, int i11) {
        this.f2637a = i11;
        this.f2638b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i11 = this.f2637a;
        Object obj = this.f2638b;
        switch (i11) {
            case 0:
                z zVar = (z) obj;
                ValueAnimator valueAnimator = zVar.f2678z;
                int i12 = zVar.A;
                if (i12 == 1) {
                    valueAnimator.cancel();
                } else if (i12 != 2) {
                }
                zVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).n();
                break;
        }
    }
}
