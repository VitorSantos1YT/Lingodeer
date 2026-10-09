package x0;

import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import bt.j1;
import qy.b0;
import rt.qf;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f55569b;

    public /* synthetic */ a(f fVar, int i11) {
        this.f55568a = i11;
        this.f55569b = fVar;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        switch (this.f55568a) {
            case 0:
                fz.a aVar = (fz.a) obj;
                View view = this.f55569b.f55581a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new qf(2, aVar));
                    }
                }
                return b0.f48488a;
            case 1:
                ActionMode actionMode = this.f55569b.f55588h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return b0.f48488a;
            case 2:
                ActionMode actionMode2 = this.f55569b.f55588h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return b0.f48488a;
            default:
                f fVar = this.f55569b;
                fVar.f55585e.e();
                return new j1(fVar, 13);
        }
    }
}
