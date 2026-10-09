package r;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.h f48617a;

    public o1(androidx.appcompat.widget.h hVar) {
        this.f48617a = hVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        androidx.appcompat.widget.h hVar = this.f48617a;
        py.b bVar = hVar.T;
        Handler handler = hVar.X;
        w wVar = hVar.f1095b0;
        int action = motionEvent.getAction();
        int x11 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && wVar != null && wVar.isShowing() && x11 >= 0 && x11 < wVar.getWidth() && y10 >= 0 && y10 < wVar.getHeight()) {
            handler.postDelayed(bVar, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(bVar);
        return false;
    }
}
