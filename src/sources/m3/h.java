package m3;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements LineHeightSpan {
    public int M;
    public int N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f40842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f40843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f40844f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f40845t = Integer.MIN_VALUE;
    public int H = Integer.MIN_VALUE;
    public int K = Integer.MIN_VALUE;
    public int L = Integer.MIN_VALUE;

    public h(float f5, int i11, boolean z11, boolean z12, float f11, int i12) {
        this.f40839a = f5;
        this.f40840b = i11;
        this.f40841c = z11;
        this.f40842d = z12;
        this.f40843e = f11;
        this.f40844f = i12;
        if ((CropImageView.DEFAULT_ASPECT_RATIO > f11 || f11 > 1.0f) && f11 != -1.0f) {
            p3.a.c("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i11, int i12, int i13, int i14, Paint.FontMetricsInt fontMetricsInt) {
        double dCeil;
        int i15 = fontMetricsInt.descent;
        int i16 = fontMetricsInt.ascent;
        if (i15 - i16 <= 0) {
            return;
        }
        boolean z11 = i11 == 0;
        boolean z12 = i12 == this.f40840b;
        int i17 = this.f40844f;
        boolean z13 = this.f40842d;
        boolean z14 = this.f40841c;
        if (z11 && z12 && z14 && z13 && i17 != 2) {
            return;
        }
        if (this.f40845t == Integer.MIN_VALUE) {
            int i18 = i15 - i16;
            int iCeil = (int) Math.ceil(this.f40839a);
            int i19 = iCeil - i18;
            if (i17 != 1 || i19 > 0) {
                float fAbs = this.f40843e;
                if (fAbs == -1.0f) {
                    fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                }
                if (i19 <= 0) {
                    dCeil = Math.ceil(i19 * fAbs);
                } else {
                    dCeil = Math.ceil((1.0f - fAbs) * i19);
                }
                int i21 = (int) dCeil;
                int i22 = fontMetricsInt.descent;
                int i23 = i21 + i22;
                this.K = i23;
                int i24 = i23 - iCeil;
                this.H = i24;
                if (i17 == 0 || i19 >= 0) {
                    if (z14) {
                        i24 = fontMetricsInt.ascent;
                    }
                    this.f40845t = i24;
                    if (z13) {
                        i23 = i22;
                    }
                    this.L = i23;
                    this.M = fontMetricsInt.ascent - i24;
                    this.N = i23 - i22;
                } else if (i17 == 2) {
                    this.f40845t = z14 ? Math.max(fontMetricsInt.ascent, i24) : Math.min(fontMetricsInt.ascent, i24);
                    this.L = z13 ? Math.min(fontMetricsInt.descent, this.K) : Math.max(fontMetricsInt.descent, this.K);
                    this.M = 0;
                    this.N = 0;
                }
            } else {
                int i25 = fontMetricsInt.ascent;
                this.H = i25;
                int i26 = fontMetricsInt.descent;
                this.K = i26;
                this.f40845t = i25;
                this.L = i26;
                this.M = 0;
                this.N = 0;
            }
        }
        fontMetricsInt.ascent = z11 ? this.f40845t : this.H;
        fontMetricsInt.descent = z12 ? this.L : this.K;
    }
}
