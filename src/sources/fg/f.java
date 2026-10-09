package fg;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f extends e {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final e[] f27267d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f27268e0;

    public f() {
        e[] eVarArrL = l();
        this.f27267d0 = eVarArrL;
        for (e eVar : eVarArrL) {
            eVar.setCallback(this);
        }
        k(this.f27267d0);
    }

    @Override // fg.e
    public final int c() {
        return this.f27268e0;
    }

    @Override // fg.e
    public ValueAnimator d() {
        return null;
    }

    @Override // fg.e, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        h(canvas);
    }

    @Override // fg.e
    public final void e(int i11) {
        this.f27268e0 = i11;
        for (int i12 = 0; i12 < j(); i12++) {
            i(i12).e(i11);
        }
    }

    public void h(Canvas canvas) {
        e[] eVarArr = this.f27267d0;
        if (eVarArr != null) {
            for (e eVar : eVarArr) {
                int iSave = canvas.save();
                eVar.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public final e i(int i11) {
        e[] eVarArr = this.f27267d0;
        if (eVarArr == null) {
            return null;
        }
        return eVarArr[i11];
    }

    @Override // fg.e, android.graphics.drawable.Animatable
    public final boolean isRunning() {
        boolean z11 = false;
        for (e eVar : this.f27267d0) {
            if (eVar.isRunning()) {
                z11 = true;
                break;
            }
        }
        return z11 || super.isRunning();
    }

    public final int j() {
        e[] eVarArr = this.f27267d0;
        if (eVarArr == null) {
            return 0;
        }
        return eVarArr.length;
    }

    public abstract e[] l();

    @Override // fg.e, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (e eVar : this.f27267d0) {
            eVar.setBounds(rect);
        }
    }

    @Override // fg.e, android.graphics.drawable.Animatable
    public final void start() {
        super.start();
        for (e eVar : this.f27267d0) {
            eVar.start();
        }
    }

    @Override // fg.e, android.graphics.drawable.Animatable
    public final void stop() {
        super.stop();
        for (e eVar : this.f27267d0) {
            eVar.stop();
        }
    }

    @Override // fg.e
    public final void b(Canvas canvas) {
    }

    public void k(e... eVarArr) {
    }
}
