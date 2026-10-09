package kd;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.yalantis.ucrop.view.CropImageView;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Matrix f38124a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f10.b f38125b = new f10.b(2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f10.b f38126c = new f10.b(3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f10.b f38127d = new f10.b(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f10.b f38128e = new f10.b(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f38129f = (float) (Math.sqrt(2.0d) / 2.0d);

    public static void a(Path path, float f5, float f11, float f12) {
        wc.a aVar = wc.d.f54943a;
        PathMeasure pathMeasure = (PathMeasure) f38125b.get();
        Path path2 = (Path) f38126c.get();
        Path path3 = (Path) f38127d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (!(f5 == 1.0f && f11 == CropImageView.DEFAULT_ASPECT_RATIO) && length >= 1.0f && Math.abs((f11 - f5) - 1.0f) >= 0.01d) {
            float f13 = f5 * length;
            float f14 = f11 * length;
            float f15 = f12 * length;
            float fMin = Math.min(f13, f14) + f15;
            float fMax = Math.max(f13, f14) + f15;
            if (fMin >= length && fMax >= length) {
                fMin = h.d(fMin, length);
                fMax = h.d(fMax, length);
            }
            if (fMin < CropImageView.DEFAULT_ASPECT_RATIO) {
                fMin = h.d(fMin, length);
            }
            if (fMax < CropImageView.DEFAULT_ASPECT_RATIO) {
                fMax = h.d(fMax, length);
            }
            if (fMin == fMax) {
                path.reset();
                return;
            }
            if (fMin >= fMax) {
                fMin -= length;
            }
            path2.reset();
            pathMeasure.getSegment(fMin, fMax, path2, true);
            if (fMax > length) {
                path3.reset();
                pathMeasure.getSegment(CropImageView.DEFAULT_ASPECT_RATIO, fMax % length, path3, true);
                path2.addPath(path3);
            } else if (fMin < CropImageView.DEFAULT_ASPECT_RATIO) {
                path3.reset();
                pathMeasure.getSegment(fMin + length, length, path3, true);
                path2.addPath(path3);
            }
            path.set(path2);
        }
    }

    public static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e8) {
            throw e8;
        } catch (Exception unused) {
        }
    }

    public static float c() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static Bitmap d(Bitmap bitmap, int i11, int i12) {
        if (bitmap.getWidth() == i11 && bitmap.getHeight() == i12) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, i12, true);
        bitmap.recycle();
        return bitmapCreateScaledBitmap;
    }

    public static void e(Canvas canvas, RectF rectF, Paint paint) {
        wc.a aVar = wc.d.f54943a;
        canvas.saveLayer(rectF, paint);
    }
}
