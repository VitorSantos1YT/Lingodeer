package i4;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f34136a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorMatrix f34137b = new ColorMatrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorMatrix f34138c = new ColorMatrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f34139d = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f34140e = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f34141f = 1.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f34142g = 1.0f;

    public final void a(ImageView imageView) {
        boolean z11;
        float f5;
        char c11;
        float fLog;
        float fPow;
        float f11;
        float fLog2;
        ColorMatrix colorMatrix = this.f34137b;
        colorMatrix.reset();
        float f12 = this.f34140e;
        char c12 = 16;
        char c13 = 15;
        char c14 = 14;
        char c15 = '\r';
        char c16 = 11;
        float[] fArr = this.f34136a;
        boolean z12 = true;
        if (f12 != 1.0f) {
            float f13 = 1.0f - f12;
            float f14 = 0.2999f * f13;
            float f15 = 0.587f * f13;
            float f16 = f13 * 0.114f;
            fArr[0] = f14 + f12;
            fArr[1] = f15;
            fArr[2] = f16;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f14;
            fArr[6] = f15 + f12;
            fArr[7] = f16;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f14;
            fArr[11] = f15;
            fArr[12] = f16 + f12;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix.set(fArr);
            z11 = true;
        } else {
            z11 = false;
        }
        float f17 = this.f34141f;
        ColorMatrix colorMatrix2 = this.f34138c;
        if (f17 != 1.0f) {
            colorMatrix2.setScale(f17, f17, f17, 1.0f);
            colorMatrix.postConcat(colorMatrix2);
            z11 = true;
        }
        float f18 = this.f34142g;
        if (f18 != 1.0f) {
            if (f18 <= CropImageView.DEFAULT_ASPECT_RATIO) {
                f18 = 0.01f;
            }
            float f19 = (5000.0f / f18) / 100.0f;
            f5 = 1.0f;
            if (f19 > 66.0f) {
                double d5 = f19 - 60.0f;
                fPow = ((float) Math.pow(d5, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) Math.pow(d5, 0.07551485300064087d)) * 288.12216f;
            } else {
                fLog = (((float) Math.log(f19)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f19 >= 1115947008) {
                f11 = 305.0448f;
                fLog2 = 255.0f;
            } else if (f19 > 19.0f) {
                f11 = 305.0448f;
                fLog2 = (((float) Math.log(f19 - 10.0f)) * 138.51773f) - 305.0448f;
            } else {
                f11 = 305.0448f;
                fLog2 = 0.0f;
            }
            float fMin = Math.min(255.0f, Math.max(fPow, CropImageView.DEFAULT_ASPECT_RATIO));
            float fMin2 = Math.min(255.0f, Math.max(fLog, CropImageView.DEFAULT_ASPECT_RATIO));
            float fMin3 = Math.min(255.0f, Math.max(fLog2, CropImageView.DEFAULT_ASPECT_RATIO));
            float fLog3 = (((float) Math.log(50.0f)) * 99.4708f) - 161.11957f;
            c11 = '\f';
            float fLog4 = (((float) Math.log(40.0f)) * 138.51773f) - f11;
            float fMin4 = Math.min(255.0f, Math.max(255.0f, CropImageView.DEFAULT_ASPECT_RATIO));
            float fMin5 = Math.min(255.0f, Math.max(fLog3, CropImageView.DEFAULT_ASPECT_RATIO));
            float fMin6 = fMin3 / Math.min(255.0f, Math.max(fLog4, CropImageView.DEFAULT_ASPECT_RATIO));
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[c16] = 0.0f;
            fArr[12] = fMin6;
            fArr[c15] = 0.0f;
            fArr[c14] = 0.0f;
            fArr[c13] = 0.0f;
            fArr[c12] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
            z11 = true;
        } else {
            f5 = 1.0f;
            c12 = 16;
            c13 = 15;
            c14 = 14;
            c15 = '\r';
            c11 = '\f';
            c16 = 11;
        }
        float f21 = this.f34139d;
        if (f21 != f5) {
            fArr[0] = f21;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f21;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[c16] = 0.0f;
            fArr[c11] = f21;
            fArr[c15] = 0.0f;
            fArr[c14] = 0.0f;
            fArr[c13] = 0.0f;
            fArr[c12] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = f5;
            fArr[19] = 0.0f;
            colorMatrix2.set(fArr);
            colorMatrix.postConcat(colorMatrix2);
        } else {
            z12 = z11;
        }
        if (z12) {
            imageView.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            imageView.clearColorFilter();
        }
    }
}
