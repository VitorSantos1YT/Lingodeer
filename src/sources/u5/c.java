package u5;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.Choreographer;
import java.util.ArrayList;
import lf.i0;
import o3.b0;
import qp.o2;
import y.t0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f52771i = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final o2 f52776e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f52779h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f52772a = new t0(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f52773b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tp.g f52774c = new tp.g(this, 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f52775d = new i0(this, 12);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f52777f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f52778g = 1.0f;

    public c(o2 o2Var) {
        this.f52776e = o2Var;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [android.animation.ValueAnimator$DurationScaleChangeListener, u5.a] */
    public final void a(f fVar) {
        ArrayList arrayList = this.f52773b;
        if (arrayList.size() == 0) {
            ((Choreographer) this.f52776e.f48095b).postFrameCallback(new b0(this.f52775d, 1));
            if (Build.VERSION.SDK_INT >= 33) {
                this.f52778g = ValueAnimator.getDurationScale();
                if (this.f52779h == null) {
                    this.f52779h = new b(this);
                }
                final b bVar = this.f52779h;
                if (bVar.f52769a == null) {
                    ?? r9 = new ValueAnimator.DurationScaleChangeListener() { // from class: u5.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f5) {
                            bVar.f52770b.f52778g = f5;
                        }
                    };
                    bVar.f52769a = r9;
                    ValueAnimator.registerDurationScaleChangeListener(r9);
                }
            }
        }
        if (arrayList.contains(fVar)) {
            return;
        }
        arrayList.add(fVar);
    }
}
