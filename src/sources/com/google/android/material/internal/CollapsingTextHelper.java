package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewGroup;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.resources.CancelableFontCallback;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TypefaceUtils;
import com.yalantis.ucrop.view.CropImageView;
import hh.p0;
import nv.p;
import ue.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CollapsingTextHelper {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public Typeface D;
    public CancelableFontCallback E;
    public CancelableFontCallback F;
    public CharSequence H;
    public CharSequence I;
    public boolean J;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int R;
    public int[] S;
    public boolean T;
    public final TextPaint U;
    public final TextPaint V;
    public TimeInterpolator W;
    public TimeInterpolator X;
    public float Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f14605a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f14606a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f14607b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public ColorStateList f14608b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14609c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public float f14610c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f14611d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public float f14612d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14613e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public float f14614e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14615f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ColorStateList f14616f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f14617g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public float f14618g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f14619h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f14620h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Rect f14621i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f14622i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RectF f14623j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public StaticLayout f14624j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f14626k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f14628l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f14629m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public CharSequence f14631n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorStateList f14632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f14634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14636q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f14638r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f14640s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f14642t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CollapsingToolbarLayout.StaticLayoutBuilderConfigurer f14643t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f14644u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f14646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f14648w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f14649w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f14650x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Typeface f14651y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Typeface f14652z;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f14625k = 16;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14627l = 16;
    public float m = 15.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f14630n = 15.0f;
    public TextUtils.TruncateAt G = TextUtils.TruncateAt.END;
    public boolean K = true;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f14633o0 = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f14635p0 = 1;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f14637q0 = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public float f14639r0 = 1.0f;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f14641s0 = 1;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f14645u0 = -1;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f14647v0 = -1;

    public CollapsingTextHelper(ViewGroup viewGroup) {
        this.f14605a = viewGroup;
        TextPaint textPaint = new TextPaint(129);
        this.U = textPaint;
        this.V = new TextPaint(textPaint);
        this.f14619h = new Rect();
        this.f14617g = new Rect();
        this.f14623j = new RectF();
        float f5 = this.f14611d;
        this.f14613e = p0.a(1.0f, f5, 0.5f, f5);
        k(viewGroup.getContext().getResources().getConfiguration());
    }

    public static int a(int i11, float f5, int i12) {
        float f11 = 1.0f - f5;
        return Color.argb(Math.round((Color.alpha(i12) * f5) + (Color.alpha(i11) * f11)), Math.round((Color.red(i12) * f5) + (Color.red(i11) * f11)), Math.round((Color.green(i12) * f5) + (Color.green(i11) * f11)), Math.round((Color.blue(i12) * f5) + (Color.blue(i11) * f11)));
    }

    public static float j(float f5, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return AnimationUtils.a(f5, f11, f12);
    }

    public static boolean m(Rect rect, int i11, int i12, int i13, int i14) {
        return rect.left == i11 && rect.top == i12 && rect.right == i13 && rect.bottom == i14;
    }

    public final void A(float f5) {
        float fM = f.m(f5, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        if (fM != this.f14607b) {
            this.f14607b = fM;
            b();
        }
    }

    public final void B(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.H, charSequence)) {
            this.H = charSequence;
            this.I = null;
            l(false);
        }
    }

    public final boolean C() {
        return this.f14635p0 == 1;
    }

    public final void b() {
        float f5;
        float f11 = this.f14607b;
        boolean z11 = this.f14609c;
        Rect rect = this.f14619h;
        Rect rect2 = this.f14617g;
        RectF rectF = this.f14623j;
        if (z11) {
            if (f11 < this.f14613e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = j(rect2.left, rect.left, f11, this.W);
            rectF.top = j(this.f14638r, this.f14640s, f11, this.W);
            rectF.right = j(rect2.right, rect.right, f11, this.W);
            rectF.bottom = j(rect2.bottom, rect.bottom, f11, this.W);
        }
        boolean z12 = this.f14609c;
        ViewGroup viewGroup = this.f14605a;
        if (!z12) {
            this.f14646v = j(this.f14642t, this.f14644u, f11, this.W);
            this.f14648w = j(this.f14638r, this.f14640s, f11, this.W);
            d(f11, false);
            viewGroup.postInvalidateOnAnimation();
            f5 = f11;
        } else if (f11 < this.f14613e) {
            this.f14646v = this.f14642t;
            this.f14648w = this.f14638r;
            d(CropImageView.DEFAULT_ASPECT_RATIO, false);
            viewGroup.postInvalidateOnAnimation();
            f5 = 0.0f;
        } else {
            this.f14646v = this.f14644u;
            this.f14648w = this.f14640s - Math.max(0, this.f14615f);
            d(1.0f, false);
            viewGroup.postInvalidateOnAnimation();
            f5 = 1.0f;
        }
        r6.a aVar = AnimationUtils.f13769b;
        this.f14628l0 = 1.0f - j(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, 1.0f - f11, aVar);
        viewGroup.postInvalidateOnAnimation();
        this.f14629m0 = j(1.0f, CropImageView.DEFAULT_ASPECT_RATIO, f11, aVar);
        viewGroup.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.f14634p;
        ColorStateList colorStateList2 = this.f14632o;
        TextPaint textPaint = this.U;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(h(colorStateList2), f5, h(this.f14634p)));
        } else {
            textPaint.setColor(h(colorStateList));
        }
        float f12 = this.f14618g0;
        float f13 = this.f14620h0;
        if (f12 != f13) {
            textPaint.setLetterSpacing(j(f13, f12, f11, aVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.N = AnimationUtils.a(this.f14610c0, this.Y, f11);
        this.O = AnimationUtils.a(this.f14612d0, this.Z, f11);
        this.P = AnimationUtils.a(this.f14614e0, this.f14606a0, f11);
        int iA = a(h(this.f14616f0), f11, h(this.f14608b0));
        this.Q = iA;
        textPaint.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.f14609c) {
            int alpha = textPaint.getAlpha();
            float f14 = this.f14613e;
            textPaint.setAlpha((int) ((f11 <= f14 ? AnimationUtils.b(1.0f, CropImageView.DEFAULT_ASPECT_RATIO, this.f14611d, f14, f11) : AnimationUtils.b(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, f14, 1.0f, f11)) * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.a(this.Q, textPaint.getAlpha()));
            }
        }
        viewGroup.postInvalidateOnAnimation();
    }

    public final boolean c(CharSequence charSequence) {
        boolean z11 = this.f14605a.getLayoutDirection() == 1;
        if (this.K) {
            return (z11 ? x4.f.f55781d : x4.f.f55780c).f(charSequence, charSequence.length());
        }
        return z11;
    }

    public final void d(float f5, boolean z11) {
        float f11;
        Typeface typeface;
        float f12;
        if (this.H == null) {
            return;
        }
        float fWidth = this.f14619h.width();
        float fWidth2 = this.f14617g.width();
        if (Math.abs(f5 - 1.0f) < 1.0E-5f) {
            f11 = C() ? this.f14630n : this.m;
            f12 = C() ? this.f14618g0 : this.f14620h0;
            this.L = C() ? 1.0f : j(this.m, this.f14630n, f5, this.X) / this.m;
            if (!C()) {
                fWidth = fWidth2;
            }
            typeface = this.f14650x;
            fWidth2 = fWidth;
        } else {
            f11 = this.m;
            float f13 = this.f14620h0;
            typeface = this.A;
            if (Math.abs(f5 - CropImageView.DEFAULT_ASPECT_RATIO) < 1.0E-5f) {
                this.L = 1.0f;
            } else {
                this.L = j(this.m, this.f14630n, f5, this.X) / this.m;
            }
            float f14 = this.f14630n / this.m;
            float f15 = fWidth2 * f14;
            if (!z11 && !this.f14609c && f15 > fWidth && C()) {
                fWidth2 = Math.min(fWidth / f14, fWidth2);
            }
            f12 = f13;
        }
        int i11 = f5 < 0.5f ? this.f14633o0 : this.f14635p0;
        TextPaint textPaint = this.U;
        boolean z12 = false;
        if (fWidth2 > CropImageView.DEFAULT_ASPECT_RATIO) {
            boolean z13 = this.M != f11;
            boolean z14 = this.f14622i0 != f12;
            boolean z15 = this.D != typeface;
            StaticLayout staticLayout = this.f14624j0;
            boolean z16 = z13 || z14 || (staticLayout != null && (fWidth2 > ((float) staticLayout.getWidth()) ? 1 : (fWidth2 == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z15 || (this.R != i11) || this.T;
            this.M = f11;
            this.f14622i0 = f12;
            this.D = typeface;
            this.T = false;
            this.R = i11;
            textPaint.setLinearText(this.L != 1.0f);
            z12 = z16;
        }
        if (this.I == null || z12) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.D);
            textPaint.setLetterSpacing(this.f14622i0);
            boolean zC = c(this.H);
            this.J = zC;
            StaticLayout staticLayoutE = e(((this.f14633o0 > 1 || this.f14635p0 > 1) && (!zC || this.f14609c)) ? i11 : 1, textPaint, this.H, fWidth2 * (C() ? 1.0f : this.L), this.J);
            this.f14624j0 = staticLayoutE;
            this.I = staticLayoutE.getText();
        }
    }

    public final StaticLayout e(int i11, TextPaint textPaint, CharSequence charSequence, float f5, boolean z11) {
        StaticLayout staticLayoutA;
        Layout.Alignment alignment;
        try {
            if (i11 == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f14625k, this.J ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.J ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.J ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            StaticLayoutBuilderCompat staticLayoutBuilderCompat = new StaticLayoutBuilderCompat(charSequence, textPaint, (int) f5);
            staticLayoutBuilderCompat.f14729l = this.G;
            staticLayoutBuilderCompat.f14728k = z11;
            staticLayoutBuilderCompat.f14722e = alignment;
            staticLayoutBuilderCompat.f14727j = false;
            staticLayoutBuilderCompat.f14723f = i11;
            float f11 = this.f14637q0;
            float f12 = this.f14639r0;
            staticLayoutBuilderCompat.f14724g = f11;
            staticLayoutBuilderCompat.f14725h = f12;
            staticLayoutBuilderCompat.f14726i = this.f14641s0;
            staticLayoutBuilderCompat.m = this.f14643t0;
            staticLayoutA = staticLayoutBuilderCompat.a();
        } catch (StaticLayoutBuilderCompat.StaticLayoutBuilderCompatException e8) {
            e8.getCause().getMessage();
            staticLayoutA = null;
        }
        staticLayoutA.getClass();
        return staticLayoutA;
    }

    public final void f(Canvas canvas) {
        int iSave = canvas.save();
        if (this.I != null) {
            RectF rectF = this.f14623j;
            if (rectF.width() <= CropImageView.DEFAULT_ASPECT_RATIO || rectF.height() <= CropImageView.DEFAULT_ASPECT_RATIO) {
                return;
            }
            float f5 = this.M;
            TextPaint textPaint = this.U;
            textPaint.setTextSize(f5);
            float f11 = this.f14646v;
            float f12 = this.f14648w;
            float f13 = this.L;
            if (f13 != 1.0f && !this.f14609c) {
                canvas.scale(f13, f13, f11, f12);
            }
            if ((this.f14633o0 > 1 || this.f14635p0 > 1) && ((!this.J || this.f14609c) && C() && (!this.f14609c || this.f14607b > this.f14613e))) {
                float lineStart = this.f14646v - this.f14624j0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f12);
                if (!this.f14609c) {
                    textPaint.setAlpha((int) (this.f14629m0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.a(this.Q, textPaint.getAlpha()));
                    }
                    this.f14624j0.draw(canvas);
                }
                if (!this.f14609c) {
                    textPaint.setAlpha((int) (this.f14628l0 * alpha));
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, MaterialColors.a(this.Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.f14624j0.getLineBaseline(0);
                CharSequence charSequence = this.f14631n0;
                float f14 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), CropImageView.DEFAULT_ASPECT_RATIO, f14, textPaint);
                if (i11 >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.f14609c) {
                    String strTrim = this.f14631n0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = p.i(1, 0, strTrim);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.f14624j0.getLineEnd(0), str.length()), CropImageView.DEFAULT_ASPECT_RATIO, f14, (Paint) textPaint);
                }
                canvas = canvas;
            } else {
                canvas.translate(f11, f12);
                this.f14624j0.draw(canvas);
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final float g() {
        int i11 = this.f14645u0;
        if (i11 != -1) {
            return i11;
        }
        float f5 = this.f14630n;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f5);
        textPaint.setTypeface(this.f14650x);
        textPaint.setLetterSpacing(this.f14618g0);
        return -textPaint.ascent();
    }

    public final int h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.S;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final float i() {
        float f5 = this.m;
        TextPaint textPaint = this.V;
        textPaint.setTextSize(f5);
        textPaint.setTypeface(this.A);
        textPaint.setLetterSpacing(this.f14620h0);
        return textPaint.descent() + (-textPaint.ascent());
    }

    public final void k(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f14652z;
            if (typeface != null) {
                this.f14651y = TypefaceUtils.a(configuration, typeface);
            }
            Typeface typeface2 = this.C;
            if (typeface2 != null) {
                this.B = TypefaceUtils.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f14651y;
            if (typeface3 == null) {
                typeface3 = this.f14652z;
            }
            this.f14650x = typeface3;
            Typeface typeface4 = this.B;
            if (typeface4 == null) {
                typeface4 = this.C;
            }
            this.A = typeface4;
            l(true);
        }
    }

    public final void l(boolean z11) {
        float fMeasureText;
        ViewGroup viewGroup = this.f14605a;
        if ((viewGroup.getHeight() <= 0 || viewGroup.getWidth() <= 0) && !z11) {
            return;
        }
        d(1.0f, z11);
        CharSequence charSequence = this.I;
        TextPaint textPaint = this.U;
        if (charSequence != null && this.f14624j0 != null) {
            this.f14631n0 = C() ? TextUtils.ellipsize(this.I, textPaint, this.f14624j0.getWidth(), this.G) : this.I;
        }
        CharSequence charSequence2 = this.f14631n0;
        float fDescent = CropImageView.DEFAULT_ASPECT_RATIO;
        if (charSequence2 != null) {
            this.f14626k0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.f14626k0 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f14627l, this.J ? 1 : 0);
        Rect rect = this.f14621i;
        Rect rect2 = this.f14619h;
        if (rect == null) {
            rect = rect2;
        }
        int i11 = absoluteGravity & 112;
        if (i11 == 48) {
            this.f14640s = rect.top;
        } else if (i11 != 80) {
            this.f14640s = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f14640s = textPaint.ascent() + rect.bottom;
        }
        int i12 = absoluteGravity & 8388615;
        if (i12 == 1) {
            this.f14644u = rect.centerX() - (this.f14626k0 / 2.0f);
        } else if (i12 != 5) {
            this.f14644u = rect.left;
        } else {
            this.f14644u = rect.right - this.f14626k0;
        }
        if (this.f14626k0 <= rect2.width()) {
            float f5 = this.f14644u;
            float fMax = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, rect2.left - f5) + f5;
            this.f14644u = fMax;
            this.f14644u = Math.min(CropImageView.DEFAULT_ASPECT_RATIO, rect2.right - (this.f14626k0 + fMax)) + fMax;
        }
        float f11 = this.f14630n;
        TextPaint textPaint2 = this.V;
        textPaint2.setTextSize(f11);
        textPaint2.setTypeface(this.f14650x);
        textPaint2.setLetterSpacing(this.f14618g0);
        if (textPaint2.descent() + (-textPaint2.ascent()) <= rect2.height()) {
            float f12 = this.f14640s;
            float fMax2 = Math.max(CropImageView.DEFAULT_ASPECT_RATIO, rect2.top - f12) + f12;
            this.f14640s = fMax2;
            this.f14640s = Math.min(CropImageView.DEFAULT_ASPECT_RATIO, rect2.bottom - (g() + fMax2)) + fMax2;
        }
        d(CropImageView.DEFAULT_ASPECT_RATIO, z11);
        StaticLayout staticLayout = this.f14624j0;
        float height = staticLayout != null ? staticLayout.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f14624j0;
        if (staticLayout2 == null || this.f14633o0 <= 1) {
            CharSequence charSequence3 = this.I;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f14624j0;
        this.f14636q = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f14625k, this.J ? 1 : 0);
        int i13 = absoluteGravity2 & 112;
        Rect rect3 = this.f14617g;
        if (i13 == 48) {
            this.f14638r = rect3.top;
        } else if (i13 != 80) {
            this.f14638r = rect3.centerY() - (height / 2.0f);
        } else {
            float f13 = rect3.bottom - height;
            if (this.f14649w0) {
                fDescent = textPaint.descent();
            }
            this.f14638r = f13 + fDescent;
        }
        int i14 = absoluteGravity2 & 8388615;
        if (i14 == 1) {
            this.f14642t = rect3.centerX() - (fMeasureText / 2.0f);
        } else if (i14 != 5) {
            this.f14642t = rect3.left;
        } else {
            this.f14642t = rect3.right - fMeasureText;
        }
        d(this.f14607b, false);
        viewGroup.postInvalidateOnAnimation();
        b();
    }

    public final void n(ColorStateList colorStateList) {
        if (this.f14634p == colorStateList && this.f14632o == colorStateList) {
            return;
        }
        this.f14634p = colorStateList;
        this.f14632o = colorStateList;
        l(false);
    }

    public final void o(int i11, int i12, int i13, int i14) {
        Rect rect = this.f14619h;
        if (m(rect, i11, i12, i13, i14)) {
            return;
        }
        rect.set(i11, i12, i13, i14);
        this.T = true;
    }

    public final void p(int i11, int i12, int i13, int i14) {
        if (this.f14621i == null) {
            this.f14621i = new Rect(i11, i12, i13, i14);
            this.T = true;
        }
        if (m(this.f14621i, i11, i12, i13, i14)) {
            return;
        }
        this.f14621i.set(i11, i12, i13, i14);
        this.T = true;
    }

    public final void q(int i11) {
        ViewGroup viewGroup = this.f14605a;
        TextAppearance textAppearance = new TextAppearance(viewGroup.getContext(), i11);
        ColorStateList colorStateList = textAppearance.f15094k;
        if (colorStateList != null) {
            this.f14634p = colorStateList;
        }
        float f5 = textAppearance.f15095l;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            this.f14630n = f5;
        }
        ColorStateList colorStateList2 = textAppearance.f15084a;
        if (colorStateList2 != null) {
            this.f14608b0 = colorStateList2;
        }
        this.Z = textAppearance.f15089f;
        this.f14606a0 = textAppearance.f15090g;
        this.Y = textAppearance.f15091h;
        this.f14618g0 = textAppearance.f15093j;
        CancelableFontCallback cancelableFontCallback = this.F;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f15083c = true;
        }
        CancelableFontCallback.ApplyFont applyFont = new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.1
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public final void a(Typeface typeface) {
                CollapsingTextHelper collapsingTextHelper = CollapsingTextHelper.this;
                if (collapsingTextHelper.t(typeface)) {
                    collapsingTextHelper.l(false);
                }
            }
        };
        textAppearance.a();
        this.F = new CancelableFontCallback(applyFont, textAppearance.f15098p);
        textAppearance.b(viewGroup.getContext(), this.F);
        l(false);
    }

    public final void r(ColorStateList colorStateList) {
        if (this.f14634p != colorStateList) {
            this.f14634p = colorStateList;
            l(false);
        }
    }

    public final void s(int i11) {
        if (this.f14627l != i11) {
            this.f14627l = i11;
            l(false);
        }
    }

    public final boolean t(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.F;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f15083c = true;
        }
        if (this.f14652z == typeface) {
            return false;
        }
        this.f14652z = typeface;
        Typeface typefaceA = TypefaceUtils.a(this.f14605a.getContext().getResources().getConfiguration(), typeface);
        this.f14651y = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f14652z;
        }
        this.f14650x = typefaceA;
        return true;
    }

    public final void u(int i11, int i12, int i13, int i14, boolean z11) {
        Rect rect = this.f14617g;
        if (m(rect, i11, i12, i13, i14) && z11 == this.f14649w0) {
            return;
        }
        rect.set(i11, i12, i13, i14);
        this.T = true;
        this.f14649w0 = z11;
    }

    public final void v(int i11) {
        if (i11 != this.f14633o0) {
            this.f14633o0 = i11;
            l(false);
        }
    }

    public final void w(int i11) {
        ViewGroup viewGroup = this.f14605a;
        TextAppearance textAppearance = new TextAppearance(viewGroup.getContext(), i11);
        ColorStateList colorStateList = textAppearance.f15094k;
        if (colorStateList != null) {
            this.f14632o = colorStateList;
        }
        float f5 = textAppearance.f15095l;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO) {
            this.m = f5;
        }
        ColorStateList colorStateList2 = textAppearance.f15084a;
        if (colorStateList2 != null) {
            this.f14616f0 = colorStateList2;
        }
        this.f14612d0 = textAppearance.f15089f;
        this.f14614e0 = textAppearance.f15090g;
        this.f14610c0 = textAppearance.f15091h;
        this.f14620h0 = textAppearance.f15093j;
        CancelableFontCallback cancelableFontCallback = this.E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f15083c = true;
        }
        CancelableFontCallback.ApplyFont applyFont = new CancelableFontCallback.ApplyFont() { // from class: com.google.android.material.internal.CollapsingTextHelper.2
            @Override // com.google.android.material.resources.CancelableFontCallback.ApplyFont
            public final void a(Typeface typeface) {
                CollapsingTextHelper collapsingTextHelper = CollapsingTextHelper.this;
                if (collapsingTextHelper.z(typeface)) {
                    collapsingTextHelper.l(false);
                }
            }
        };
        textAppearance.a();
        this.E = new CancelableFontCallback(applyFont, textAppearance.f15098p);
        textAppearance.b(viewGroup.getContext(), this.E);
        l(false);
    }

    public final void x(int i11) {
        if (this.f14625k != i11) {
            this.f14625k = i11;
            l(false);
        }
    }

    public final void y(float f5) {
        if (this.m != f5) {
            this.m = f5;
            l(false);
        }
    }

    public final boolean z(Typeface typeface) {
        CancelableFontCallback cancelableFontCallback = this.E;
        if (cancelableFontCallback != null) {
            cancelableFontCallback.f15083c = true;
        }
        if (this.C == typeface) {
            return false;
        }
        this.C = typeface;
        Typeface typefaceA = TypefaceUtils.a(this.f14605a.getContext().getResources().getConfiguration(), typeface);
        this.B = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.C;
        }
        this.A = typefaceA;
        return true;
    }
}
