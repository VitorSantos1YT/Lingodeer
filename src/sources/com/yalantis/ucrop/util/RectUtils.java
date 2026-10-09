package com.yalantis.ucrop.util;

import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public class RectUtils {
    public static float[] getCenterFromRect(RectF rectF) {
        return new float[]{rectF.centerX(), rectF.centerY()};
    }

    public static float[] getCornersFromRect(RectF rectF) {
        float f5 = rectF.left;
        float f11 = rectF.top;
        float f12 = rectF.right;
        float f13 = rectF.bottom;
        return new float[]{f5, f11, f12, f11, f12, f13, f5, f13};
    }

    public static float[] getRectSidesFromCorners(float[] fArr) {
        return new float[]{(float) Math.sqrt(Math.pow(fArr[1] - fArr[3], 2.0d) + Math.pow(fArr[0] - fArr[2], 2.0d)), (float) Math.sqrt(Math.pow(fArr[3] - fArr[5], 2.0d) + Math.pow(fArr[2] - fArr[4], 2.0d))};
    }

    public static RectF trapToRect(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i11 = 1; i11 < fArr.length; i11 += 2) {
            float fRound = Math.round(fArr[i11 - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i11] * 10.0f) / 10.0f;
            float f5 = rectF.left;
            if (fRound < f5) {
                f5 = fRound;
            }
            rectF.left = f5;
            float f11 = rectF.top;
            if (fRound2 < f11) {
                f11 = fRound2;
            }
            rectF.top = f11;
            float f12 = rectF.right;
            if (fRound <= f12) {
                fRound = f12;
            }
            rectF.right = fRound;
            float f13 = rectF.bottom;
            if (fRound2 <= f13) {
                fRound2 = f13;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF;
    }
}
