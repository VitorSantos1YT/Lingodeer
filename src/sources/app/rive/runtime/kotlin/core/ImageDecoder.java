package app.rive.runtime.kotlin.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class ImageDecoder {
    public static final int $stable = 0;
    public static final ImageDecoder INSTANCE = new ImageDecoder();

    private ImageDecoder() {
    }

    public static final int[] decodeToBitmap(byte[] encoded) {
        m.f(encoded, "encoded");
        try {
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(encoded, 0, encoded.length, new BitmapFactory.Options());
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int[] iArr = new int[(width * height) + 2];
            iArr[0] = width;
            iArr[1] = height;
            bitmapDecodeByteArray.getPixels(iArr, 2, width, 0, 0, width, height);
            return iArr;
        } catch (Exception unused) {
            return new int[0];
        }
    }
}
