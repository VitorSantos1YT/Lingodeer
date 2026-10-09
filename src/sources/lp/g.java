package lp;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f40194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f40195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vq.f f40196c;

    public /* synthetic */ g(u uVar, k kVar, vq.f fVar) {
        this.f40194a = uVar;
        this.f40195b = kVar;
        this.f40196c = fVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        k kVar = this.f40195b;
        Handler handler = kVar.f40208e;
        int action = motionEvent.getAction();
        u uVar = this.f40194a;
        if (action == 0) {
            uVar.f38357a = true;
            androidx.fragment.app.d dVar = new androidx.fragment.app.d(uVar, view, this.f40196c, 12);
            kVar.m = dVar;
            handler.postDelayed(dVar, 200L);
            kVar.f40209f = System.currentTimeMillis();
            kVar.f40210g = 0L;
        }
        if (motionEvent.getAction() == 1) {
            kVar.f40210g = System.currentTimeMillis();
            androidx.fragment.app.d dVar2 = kVar.m;
            if (dVar2 != null) {
                handler.removeCallbacks(dVar2);
            }
            if (kVar.f40210g - kVar.f40209f < 200) {
                view.performClick();
                uVar.f38357a = false;
            }
            kVar.f40209f = 0L;
            kVar.f40210g = 0L;
        }
        return true;
    }
}
