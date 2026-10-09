package fg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final /* synthetic */ int f27251g0;

    @Override // fg.b
    public final void h(Canvas canvas, Paint paint) {
        switch (this.f27251g0) {
            case 0:
                Rect rect = this.R;
                if (rect != null) {
                    canvas.drawCircle(this.R.centerX(), this.R.centerY(), Math.min(rect.width(), this.R.height()) / 2, paint);
                }
                break;
            default:
                Rect rect2 = this.R;
                if (rect2 != null) {
                    canvas.drawRect(rect2, paint);
                }
                break;
        }
    }
}
