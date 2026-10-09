package r;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.f f48589b;

    public /* synthetic */ j1(androidx.appcompat.widget.f fVar, int i11) {
        this.f48588a = i11;
        this.f48589b = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48588a) {
            case 0:
                ViewParent parent = this.f48589b.f1085d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                androidx.appcompat.widget.f fVar = this.f48589b;
                fVar.f();
                View view = fVar.f1085d;
                if (view.isEnabled() && !view.isLongClickable() && fVar.i()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    fVar.f1088t = true;
                    break;
                }
                break;
        }
    }
}
