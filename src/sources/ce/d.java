package ce;

import android.content.Context;
import android.graphics.Bitmap;
import hh.p0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements td.n {
    @Override // td.n
    public final vd.b0 b(Context context, vd.b0 b0Var, int i11, int i12) {
        if (!pe.m.i(i11, i12)) {
            throw new IllegalArgumentException(p0.l("Cannot apply transformation on width: ", i11, " or height: ", i12, " less than or equal to zero and not Target.SIZE_ORIGINAL"));
        }
        wd.a aVar = com.bumptech.glide.c.c(context).f7607b;
        Bitmap bitmap = (Bitmap) b0Var.get();
        if (i11 == Integer.MIN_VALUE) {
            i11 = bitmap.getWidth();
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = bitmap.getHeight();
        }
        Bitmap bitmapC = c(aVar, bitmap, i11, i12);
        return bitmap.equals(bitmapC) ? b0Var : c.e(bitmapC, aVar);
    }

    public abstract Bitmap c(wd.a aVar, Bitmap bitmap, int i11, int i12);
}
