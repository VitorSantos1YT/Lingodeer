package m3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ReplacementSpan {
    public Paint.FontMetricsInt H;
    public int K;
    public int L;
    public boolean M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f40846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f40848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f40849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f40850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f40851f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f40852t;

    public i(float f5, int i11, float f11, int i12, v3.c cVar, int i13) {
        float fY0 = CropImageView.DEFAULT_ASPECT_RATIO;
        float fY1 = i11 == 0 ? cVar.y0(j3.L(4294967296L, f5)) : 0.0f;
        fY0 = i12 == 0 ? cVar.y0(j3.L(4294967296L, f11)) : fY0;
        this.f40846a = f5;
        this.f40847b = i11;
        this.f40848c = f11;
        this.f40849d = i12;
        this.f40850e = fY1;
        this.f40851f = fY0;
        this.f40852t = i13;
    }

    public final Paint.FontMetricsInt a() {
        Paint.FontMetricsInt fontMetricsInt = this.H;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        m.n("fontMetrics");
        throw null;
    }

    public final int b() {
        if (!this.M) {
            p3.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.L;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i11, int i12, Paint.FontMetricsInt fontMetricsInt) {
        float f5;
        float f11;
        this.M = true;
        float textSize = paint.getTextSize();
        this.H = paint.getFontMetricsInt();
        if (a().descent <= a().ascent) {
            p3.a.a("Invalid fontMetrics: line height can not be negative.");
        }
        int i13 = this.f40847b;
        if (i13 == 0) {
            f5 = this.f40850e;
        } else {
            if (i13 != 1) {
                p3.a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f5 = this.f40846a * textSize;
        }
        this.K = (int) Math.ceil(f5);
        int i14 = this.f40849d;
        if (i14 == 0) {
            f11 = this.f40851f;
        } else {
            if (i14 != 1) {
                p3.a.b("Unsupported unit.");
                throw new KotlinNothingValueException();
            }
            f11 = this.f40848c * textSize;
        }
        this.L = (int) Math.ceil(f11);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = a().ascent;
            fontMetricsInt.descent = a().descent;
            fontMetricsInt.leading = a().leading;
            switch (this.f40852t) {
                case 0:
                    if (fontMetricsInt.ascent > (-b())) {
                        fontMetricsInt.ascent = -b();
                    }
                    break;
                case 1:
                case 4:
                    if (b() + fontMetricsInt.ascent > fontMetricsInt.descent) {
                        fontMetricsInt.descent = b() + fontMetricsInt.ascent;
                    }
                    break;
                case 2:
                case 5:
                    if (fontMetricsInt.ascent > fontMetricsInt.descent - b()) {
                        fontMetricsInt.ascent = fontMetricsInt.descent - b();
                    }
                    break;
                case 3:
                case 6:
                    if (fontMetricsInt.descent - fontMetricsInt.ascent < b()) {
                        int iB = fontMetricsInt.ascent - ((b() - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2);
                        fontMetricsInt.ascent = iB;
                        fontMetricsInt.descent = b() + iB;
                    }
                    break;
                default:
                    p3.a.a("Unknown verticalAlign.");
                    break;
            }
            fontMetricsInt.top = Math.min(a().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(a().bottom, fontMetricsInt.descent);
        }
        if (!this.M) {
            p3.a.c("PlaceholderSpan is not laid out yet.");
        }
        return this.K;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i11, int i12, float f5, int i13, int i14, int i15, Paint paint) {
    }
}
