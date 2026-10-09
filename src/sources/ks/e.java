package ks;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import java.util.Objects;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    public static Bitmap a(int i11, int i12, String str) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setColor(-7829368);
        paint.setTextSize(Math.min(i11, i12) * 0.05f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setAntiAlias(true);
        canvas.drawText(str, i11 / 2.0f, i12 / 2.0f, paint);
        return bitmapCreateBitmap;
    }

    public static Bitmap b(View view, int i11) {
        Bitmap bitmapA;
        Bitmap bitmapCopy;
        m.f(view, "view");
        try {
            bitmapA = vc.a.h(view);
        } catch (Exception unused) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                bitmapA = a(360, 640, "Screenshot not available");
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
                if (Build.VERSION.SDK_INT < 26 || bitmapCreateBitmap.getConfig() != Bitmap.Config.HARDWARE) {
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    try {
                        int layerType = view.getLayerType();
                        if (layerType == 2) {
                            view.setLayerType(1, null);
                        }
                        view.draw(canvas);
                        if (layerType == 2) {
                            view.setLayerType(2, null);
                        }
                        bitmapA = bitmapCreateBitmap;
                    } catch (Exception unused2) {
                        bitmapCreateBitmap.recycle();
                        bitmapA = a(view.getWidth(), view.getHeight(), "Screenshot not available");
                    }
                } else {
                    bitmapCreateBitmap.recycle();
                    bitmapA = a(view.getWidth(), view.getHeight(), "Screenshot not available");
                }
            }
        }
        bitmapA.getWidth();
        bitmapA.getHeight();
        Bitmap.Config config = bitmapA.getConfig();
        int i12 = Build.VERSION.SDK_INT;
        Objects.toString(config);
        if (i12 < 26 || bitmapA.getConfig() != Bitmap.Config.HARDWARE) {
            bitmapCopy = bitmapA.copy(Bitmap.Config.ARGB_8888, false);
            if (bitmapCopy != null && !bitmapCopy.equals(bitmapA)) {
                Objects.toString(bitmapCopy.getConfig());
                bitmapA.recycle();
                bitmapA = bitmapCopy;
            }
        } else {
            bitmapCopy = Bitmap.createBitmap(bitmapA.getWidth(), bitmapA.getHeight(), Bitmap.Config.ARGB_8888);
            try {
                new Canvas(bitmapCopy).drawBitmap(bitmapA, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, (Paint) null);
                bitmapA.recycle();
                Objects.toString(bitmapCopy.getConfig());
                bitmapA = bitmapCopy;
            } catch (Exception unused3) {
                bitmapCopy.recycle();
                bitmapA.recycle();
                bitmapA = a(bitmapA.getWidth(), bitmapA.getHeight(), "转换失败");
            }
        }
        bitmapA.getWidth();
        bitmapA.getHeight();
        Objects.toString(bitmapA.getConfig());
        if (i11 <= 0) {
            return bitmapA;
        }
        int width = bitmapA.getWidth();
        int height = bitmapA.getHeight();
        float fMin = Math.min((i11 <= 0 || width <= i11) ? 1.0f : i11 / width, 1.0f);
        if (fMin >= 1.0f) {
            return bitmapA;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, (int) (width * fMin), (int) (height * fMin), true);
        bitmapCreateScaledBitmap.getWidth();
        bitmapCreateScaledBitmap.getHeight();
        Objects.toString(bitmapCreateScaledBitmap.getConfig());
        if (!bitmapA.equals(bitmapCreateScaledBitmap)) {
            bitmapA.recycle();
        }
        return bitmapCreateScaledBitmap;
    }
}
