package gd;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends c {
    @Override // gd.c, yc.e
    public final void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        rectF.set(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // gd.c
    public final void k(Canvas canvas, Matrix matrix, int i11, kd.b bVar) {
    }
}
