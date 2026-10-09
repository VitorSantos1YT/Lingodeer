package ce;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.yalantis.ucrop.view.CropImageView;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6855b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(td.g.f52121a);

    @Override // td.g
    public final void a(MessageDigest messageDigest) {
        messageDigest.update(f6855b);
    }

    @Override // ce.d
    public final Bitmap c(wd.a aVar, Bitmap bitmap, int i11, int i12) {
        float width;
        float height;
        Paint paint = c0.f6845a;
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        int width2 = bitmap.getWidth() * i12;
        int height2 = bitmap.getHeight() * i11;
        float width3 = CropImageView.DEFAULT_ASPECT_RATIO;
        if (width2 > height2) {
            width = i12 / bitmap.getHeight();
            width3 = (i11 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i11 / bitmap.getWidth();
            height = (i12 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width3 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapI = aVar.i(i11, i12, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapI.setHasAlpha(bitmap.hasAlpha());
        c0.a(bitmap, bitmapI, matrix);
        return bitmapI;
    }

    @Override // td.g
    public final boolean equals(Object obj) {
        return obj instanceof g;
    }

    @Override // td.g
    public final int hashCode() {
        return -599754482;
    }
}
