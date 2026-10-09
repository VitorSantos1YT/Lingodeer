package com.google.android.material.carousel;

import com.yalantis.ucrop.view.CropImageView;
import nv.p;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class Arrangement {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f14128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f14131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f14132f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14133g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f14134h;

    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ca  */
    public Arrangement(int i11, float f5, float f11, float f12, int i12, float f13, int i13, float f14, int i14, float f15) {
        float fAbs;
        this.f14127a = i11;
        float fM = f.m(f5, f11, f12);
        this.f14128b = fM;
        this.f14129c = i12;
        this.f14131e = f13;
        this.f14130d = i13;
        this.f14132f = f14;
        this.f14133g = i14;
        float f16 = i14;
        float f17 = (f13 * i13) + (f14 * f16);
        float f18 = i12;
        float f19 = f15 - ((fM * f18) + f17);
        if (i12 > 0 && f19 > CropImageView.DEFAULT_ASPECT_RATIO) {
            this.f14128b = Math.min(f19 / f18, f12 - fM) + fM;
        } else if (i12 > 0 && f19 < CropImageView.DEFAULT_ASPECT_RATIO) {
            this.f14128b = Math.max(f19 / f18, f11 - fM) + fM;
        }
        int i15 = this.f14129c;
        float f21 = i15 > 0 ? this.f14128b : 0.0f;
        this.f14128b = f21;
        int i16 = this.f14130d;
        float f22 = i16;
        float f23 = f22 / 2.0f;
        float f24 = (f15 - ((i15 + f23) * (i15 > 0 ? f21 : 0.0f))) / (f23 + f16);
        this.f14132f = f24;
        float f25 = (f21 + f24) / 2.0f;
        this.f14131e = f25;
        if (i16 > 0 && f24 != f14) {
            float f26 = (f14 - f24) * f16;
            float fMin = Math.min(Math.abs(f26), f25 * 0.1f * f22);
            if (f26 > CropImageView.DEFAULT_ASPECT_RATIO) {
                this.f14131e -= fMin / this.f14130d;
                this.f14132f = (fMin / f16) + this.f14132f;
            } else {
                this.f14131e = (fMin / this.f14130d) + this.f14131e;
                this.f14132f -= fMin / f16;
            }
        }
        if (i14 > 0 && this.f14129c > 0 && this.f14130d > 0) {
            float f27 = this.f14132f;
            float f28 = this.f14131e;
            if (f27 <= f28 || f28 <= this.f14128b) {
                fAbs = Float.MAX_VALUE;
            } else {
                fAbs = i11 * Math.abs(f14 - this.f14132f);
            }
        } else if (i14 <= 0 || this.f14129c <= 0 || this.f14132f > this.f14128b) {
            fAbs = i11 * Math.abs(f14 - this.f14132f);
        } else {
            fAbs = Float.MAX_VALUE;
        }
        this.f14134h = fAbs;
    }

    public static Arrangement a(float f5, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        Arrangement arrangement = null;
        int i11 = 1;
        for (int i12 : iArr3) {
            int length = iArr2.length;
            int i13 = 0;
            while (i13 < length) {
                int i14 = iArr2[i13];
                int length2 = iArr.length;
                int i15 = 0;
                while (i15 < length2) {
                    int i16 = length;
                    int i17 = i13;
                    int i18 = i11;
                    int i19 = length2;
                    int i21 = i15;
                    Arrangement arrangement2 = new Arrangement(i18, f11, f12, f13, iArr[i15], f14, i14, f15, i12, f5);
                    float f16 = arrangement2.f14134h;
                    if (arrangement == null || f16 < arrangement.f14134h) {
                        if (f16 == CropImageView.DEFAULT_ASPECT_RATIO) {
                            return arrangement2;
                        }
                        arrangement = arrangement2;
                    }
                    int i22 = i18 + 1;
                    i15 = i21 + 1;
                    i13 = i17;
                    i11 = i22;
                    length = i16;
                    length2 = i19;
                }
                i13++;
                i11 = i11;
                length = length;
            }
        }
        return arrangement;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Arrangement [priority=");
        sb2.append(this.f14127a);
        sb2.append(", smallCount=");
        sb2.append(this.f14129c);
        sb2.append(", smallSize=");
        sb2.append(this.f14128b);
        sb2.append(", mediumCount=");
        sb2.append(this.f14130d);
        sb2.append(", mediumSize=");
        sb2.append(this.f14131e);
        sb2.append(", largeCount=");
        sb2.append(this.f14133g);
        sb2.append(", largeSize=");
        sb2.append(this.f14132f);
        sb2.append(", cost=");
        return p.h(this.f14134h, "]", sb2);
    }
}
