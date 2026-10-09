package z2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements GestureDetector.OnGestureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e5.l f58634a;

    public o1(e5.l lVar) {
        this.f58634a = lVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f11) {
        e5.l lVar = this.f58634a;
        o oVar = (o) lVar.f24858c;
        if (!lVar.f24857b) {
            int i11 = lVar.f24856a;
            if (i11 == 1) {
                if (Math.abs(f5) > Math.abs(f11)) {
                    ((e2.p) oVar.f58632b.getFocusOwner()).h(f5 > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : 2, false);
                    return true;
                }
            } else if (i11 == 2 && Math.abs(f11) > Math.abs(f5)) {
                ((e2.p) oVar.f58632b.getFocusOwner()).h(f11 > CropImageView.DEFAULT_ASPECT_RATIO ? 1 : 2, false);
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f5, float f11) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}
