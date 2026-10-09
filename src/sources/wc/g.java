package wc;

import com.airbnb.lottie.LottieAnimationView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f54956b;

    public g(LottieAnimationView lottieAnimationView, int i11) {
        this.f54955a = i11;
        switch (i11) {
            case 1:
                this.f54956b = new WeakReference(lottieAnimationView);
                break;
            default:
                this.f54956b = new WeakReference(lottieAnimationView);
                break;
        }
    }

    @Override // wc.y
    public final void onResult(Object obj) {
        switch (this.f54955a) {
            case 0:
                Throwable th2 = (Throwable) obj;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f54956b.get();
                if (lottieAnimationView != null) {
                    int i11 = lottieAnimationView.f7435d;
                    if (i11 != 0) {
                        lottieAnimationView.setImageResource(i11);
                    }
                    y yVar = lottieAnimationView.f7434c;
                    if (yVar == null) {
                        yVar = LottieAnimationView.P;
                    }
                    yVar.onResult(th2);
                    break;
                }
                break;
            default:
                h hVar = (h) obj;
                LottieAnimationView lottieAnimationView2 = (LottieAnimationView) this.f54956b.get();
                if (lottieAnimationView2 != null) {
                    lottieAnimationView2.setComposition(hVar);
                    break;
                }
                break;
        }
    }
}
