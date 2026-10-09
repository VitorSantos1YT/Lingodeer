package t3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;
import com.bumptech.glide.f;
import f2.e;
import g2.k;
import g2.n0;
import g2.o;
import g2.p0;
import i2.g;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import qy.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements LeadingMarginSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f52027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f52028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f52030d;

    public b(float f5, float f11, float f12, v3.c cVar, float f13) {
        this.f52027a = f5;
        this.f52028b = f11;
        int iQ = hz.b.Q(f5 + f12);
        this.f52029c = iQ;
        this.f52030d = hz.b.Q(f13) - iQ;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(final Canvas canvas, final Paint paint, int i11, final int i12, int i13, int i14, int i15, CharSequence charSequence, int i16, int i17, boolean z11, Layout layout) {
        if (canvas == null) {
            return;
        }
        final float f5 = (i13 + i15) / 2.0f;
        int i18 = i11 - this.f52029c;
        if (i18 < 0) {
            i18 = 0;
        }
        final int i19 = i18;
        m.d(charSequence, "null cannot be cast to non-null type android.text.Spanned");
        if (((Spanned) charSequence).getSpanStart(this) != i16 || paint == null) {
            return;
        }
        Paint.Style style = paint.getStyle();
        Object obj = g.f34126a;
        Integer numValueOf = null;
        if (!obj.equals(obj)) {
            throw new NoWhenBranchMatchedException();
        }
        paint.setStyle(Paint.Style.FILL);
        final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f52028b)) & 4294967295L) | (Float.floatToRawIntBits(this.f52027a) << 32);
        fz.a aVar = new fz.a(this) { // from class: t3.a
            @Override // fz.a
            public final Object invoke() {
                int i21 = i12;
                v3.m mVar = v3.m.Ltr;
                long j11 = jFloatToRawIntBits;
                float fC = e.c(j11) / 2.0f;
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fC)) << 32) | (((long) Float.floatToRawIntBits(fC)) & 4294967295L);
                f2.d dVarB = f.b(com.bumptech.glide.e.e(0L, j11), jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits2);
                new n0(dVarB);
                float f11 = i19;
                Canvas canvas2 = canvas;
                Paint paint2 = paint;
                float f12 = f5;
                if (f.C(dVarB)) {
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (dVarB.f26580e >> 32));
                    canvas2.drawRoundRect(f11, f12 - (dVarB.a() / 2.0f), (dVarB.b() * i21) + f11, (dVarB.a() / 2.0f) + f12, fIntBitsToFloat, fIntBitsToFloat, paint2);
                } else {
                    k kVarA = o.a();
                    p0.c(kVarA, dVarB);
                    canvas2.save();
                    canvas2.translate(f11, f12 - (dVarB.a() / 2.0f));
                    canvas2.drawPath(kVarA.f28575a, paint2);
                    canvas2.restore();
                }
                return b0.f48488a;
            }
        };
        if (!Float.isNaN(Float.NaN)) {
            numValueOf = Integer.valueOf(paint.getAlpha());
            paint.setAlpha((int) Math.rint(Float.NaN));
        }
        aVar.invoke();
        if (numValueOf != null) {
            paint.setAlpha(numValueOf.intValue());
        }
        paint.setStyle(style);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z11) {
        int i11 = this.f52030d;
        if (i11 >= 0) {
            return 0;
        }
        return Math.abs(i11);
    }
}
