package com.google.android.material.elevation;

import android.content.Context;
import android.graphics.Color;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.MaterialAttributes;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import r4.c;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class ElevationOverlayProvider {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f14455f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14460e;

    public ElevationOverlayProvider(Context context) {
        boolean zB = MaterialAttributes.b(context, R.attr.elevationOverlayEnabled, false);
        int iB = MaterialColors.b(context, R.attr.elevationOverlayColor, 0);
        int iB2 = MaterialColors.b(context, R.attr.elevationOverlayAccentColor, 0);
        int iB3 = MaterialColors.b(context, R.attr.colorSurface, 0);
        float f5 = context.getResources().getDisplayMetrics().density;
        this.f14456a = zB;
        this.f14457b = iB;
        this.f14458c = iB2;
        this.f14459d = iB3;
        this.f14460e = f5;
    }

    public final int a(int i11, float f5) {
        int i12;
        if (!this.f14456a || c.e(i11, 255) != this.f14459d) {
            return i11;
        }
        float f11 = this.f14460e;
        float fMin = (f11 <= CropImageView.DEFAULT_ASPECT_RATIO || f5 <= CropImageView.DEFAULT_ASPECT_RATIO) ? 0.0f : Math.min(((((float) Math.log1p(f5 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i11);
        int iF = MaterialColors.f(c.e(i11, 255), fMin, this.f14457b);
        if (fMin > CropImageView.DEFAULT_ASPECT_RATIO && (i12 = this.f14458c) != 0) {
            iF = c.c(c.e(i12, f14455f), iF);
        }
        return c.e(iF, iAlpha);
    }
}
