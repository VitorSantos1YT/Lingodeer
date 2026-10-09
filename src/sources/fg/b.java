package fg;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends e {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final Paint f27252d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f27253e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f27254f0;

    public b() {
        e(-1);
        Paint paint = new Paint();
        this.f27252d0 = paint;
        paint.setAntiAlias(true);
        paint.setColor(this.f27253e0);
    }

    @Override // fg.e
    public final void b(Canvas canvas) {
        int i11 = this.f27253e0;
        Paint paint = this.f27252d0;
        paint.setColor(i11);
        h(canvas, paint);
    }

    @Override // fg.e
    public final int c() {
        return this.f27254f0;
    }

    @Override // fg.e
    public final void e(int i11) {
        this.f27254f0 = i11;
        i();
    }

    public abstract void h(Canvas canvas, Paint paint);

    public final void i() {
        int i11 = this.Q;
        int i12 = this.f27254f0;
        this.f27253e0 = ((((i12 >>> 24) * (i11 + (i11 >> 7))) >> 8) << 24) | ((i12 << 8) >>> 8);
    }

    @Override // fg.e, android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        this.Q = i11;
        i();
    }

    @Override // fg.e, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f27252d0.setColorFilter(colorFilter);
    }
}
