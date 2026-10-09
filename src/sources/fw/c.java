package fw;

import android.animation.ValueAnimator;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.plattysoft.leonids.a f28225a;

    public c(com.plattysoft.leonids.a aVar) {
        this.f28225a = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        com.plattysoft.leonids.a aVar = this.f28225a;
        long j11 = iIntValue;
        while (true) {
            long j12 = aVar.f22403i;
            if (((j12 <= 0 || j11 >= j12) && j12 != -1) || aVar.f22399e.isEmpty() || aVar.f22402h >= CropImageView.DEFAULT_ASPECT_RATIO * j11) {
                break;
            } else {
                aVar.a(j11);
            }
        }
        synchronized (aVar.f22400f) {
            int i11 = 0;
            while (i11 < aVar.f22400f.size()) {
                try {
                    if (!((b) aVar.f22400f.get(i11)).b(j11)) {
                        b bVar = (b) aVar.f22400f.remove(i11);
                        i11--;
                        aVar.f22399e.add(bVar);
                    }
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        aVar.f22398d.postInvalidate();
    }
}
