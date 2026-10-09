package h4;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f31773b;

    public /* synthetic */ s(View view, int i11) {
        this.f31772a = i11;
        this.f31773b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f31772a) {
            case 0:
                this.f31773b.setNestedScrollingEnabled(true);
                break;
            default:
                ((MotionLayout) this.f31773b).W0.a();
                break;
        }
    }
}
