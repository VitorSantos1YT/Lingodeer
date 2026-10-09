package kd;

import android.graphics.Color;
import android.graphics.Matrix;
import com.yalantis.ucrop.view.CropImageView;
import gd.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f38082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f38083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f38084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f38086e = null;

    public b(b bVar) {
        this.f38082a = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f38083b = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f38084c = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f38085d = 0;
        this.f38082a = bVar.f38082a;
        this.f38083b = bVar.f38083b;
        this.f38084c = bVar.f38084c;
        this.f38085d = bVar.f38085d;
    }

    public final void a(int i11, m mVar) {
        int iAlpha = Color.alpha(this.f38085d);
        int iC = h.c(i11);
        Matrix matrix = k.f38124a;
        int i12 = (int) ((((iAlpha / 255.0f) * iC) / 255.0f) * 255.0f);
        if (i12 <= 0) {
            mVar.clearShadowLayer();
        } else {
            mVar.setShadowLayer(Math.max(this.f38082a, Float.MIN_VALUE), this.f38083b, this.f38084c, Color.argb(i12, Color.red(this.f38085d), Color.green(this.f38085d), Color.blue(this.f38085d)));
        }
    }

    public final void b(int i11) {
        this.f38085d = Color.argb(Math.round((h.c(i11) * Color.alpha(this.f38085d)) / 255.0f), Color.red(this.f38085d), Color.green(this.f38085d), Color.blue(this.f38085d));
    }

    public final void c(Matrix matrix) {
        if (this.f38086e == null) {
            this.f38086e = new float[2];
        }
        float[] fArr = this.f38086e;
        fArr[0] = this.f38083b;
        fArr[1] = this.f38084c;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.f38086e;
        this.f38083b = fArr2[0];
        this.f38084c = fArr2[1];
        this.f38082a = matrix.mapRadius(this.f38082a);
    }
}
