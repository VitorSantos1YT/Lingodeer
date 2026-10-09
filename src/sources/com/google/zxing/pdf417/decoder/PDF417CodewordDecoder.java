package com.google.zxing.pdf417.decoder;

import com.google.zxing.pdf417.PDF417Common;
import com.yalantis.ucrop.view.CropImageView;
import java.lang.reflect.Array;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
final class PDF417CodewordDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[][] f21558a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i11;
        for (int i12 = 0; i12 < 2787; i12++) {
            int i13 = PDF417Common.f21555a[i12];
            int i14 = i13 & 1;
            int i15 = 0;
            while (i15 < 8) {
                float f5 = CropImageView.DEFAULT_ASPECT_RATIO;
                while (true) {
                    i11 = i13 & 1;
                    if (i11 == i14) {
                        f5 += 1.0f;
                        i13 >>= 1;
                    }
                }
                f21558a[i12][7 - i15] = f5 / 17.0f;
                i15++;
                i14 = i11;
            }
        }
    }

    private PDF417CodewordDecoder() {
    }
}
