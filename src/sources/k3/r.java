package k3;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f37889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextUtils.TruncateAt f37890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ar.f f37893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Layout f37894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37896h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f37897i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f37898j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f37899k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f37900l;
    public final Paint.FontMetricsInt m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f37901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m3.h[] f37902o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f37903p = new Rect();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a9.i f37904q;

    /* JADX WARN: Code duplicated, block: B:100:0x01ac A[PHI: r7
      0x01ac: PHI (r7v7 int) = (r7v6 int), (r7v9 int) binds: [B:105:0x01be, B:98:0x01a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x022a  */
    /* JADX WARN: Code duplicated, block: B:129:0x022c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0231  */
    /* JADX WARN: Code duplicated, block: B:132:0x0233  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x016c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0183  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r25v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v8 */
    public r(CharSequence charSequence, float f5, TextPaint textPaint, int i11, TextUtils.TruncateAt truncateAt, int i12, boolean z11, int i13, int i14, int i15, int i16, int i17, int i18, l lVar) {
        int i19;
        int i21;
        TextDirectionHeuristic textDirectionHeuristic;
        Layout layoutA;
        m3.h[] hVarArr;
        int i22;
        int i23;
        int i24;
        char c11;
        long j11;
        int i25;
        int i26;
        int i27;
        int i28;
        long jA;
        ?? r9;
        boolean zC;
        int topPadding;
        boolean zB;
        long jA2;
        Paint.FontMetricsInt fontMetricsInt;
        int i29;
        this.f37889a = textPaint;
        this.f37890b = truncateAt;
        this.f37891c = z11;
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicB = s.b(i12);
        Layout.Alignment alignment = p.f37886a;
        Layout.Alignment alignment2 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? Layout.Alignment.ALIGN_NORMAL : p.f37887b : p.f37886a : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z12 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, m3.a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsA = lVar.a();
            double d5 = f5;
            int iCeil = (int) Math.ceil(d5);
            if (metricsA == null || lVar.c() > f5 || z12) {
                i19 = 0;
                this.f37900l = false;
                i21 = i13;
                textDirectionHeuristic = textDirectionHeuristicB;
                layoutA = o.a(charSequence, textPaint, iCeil, charSequence.length(), textDirectionHeuristic, alignment2, i21, truncateAt, (int) Math.ceil(d5), i18, z11, i14, i15, i16, i17);
            } else {
                this.f37900l = true;
                if (iCeil < 0) {
                    p3.a.a("negative width");
                }
                if (iCeil < 0) {
                    p3.a.a("negative ellipsized width");
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    layoutA = c.a(charSequence, textPaint, iCeil, alignment2, metricsA, z11, truncateAt, iCeil);
                    i19 = 0;
                } else {
                    i19 = 0;
                    layoutA = new BoringLayout(charSequence, textPaint, iCeil, alignment2, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO, metricsA, z11, truncateAt, iCeil);
                }
                i21 = i13;
                textDirectionHeuristic = textDirectionHeuristicB;
            }
            this.f37894f = layoutA;
            Trace.endSection();
            int iMin = Math.min(layoutA.getLineCount(), i21);
            this.f37895g = iMin;
            int i30 = iMin - 1;
            this.f37892d = (iMin >= i21 && (layoutA.getEllipsisCount(i30) > 0 || layoutA.getLineEnd(i30) != charSequence.length())) ? 1 : i19;
            if (layoutA.getText() instanceof Spanned) {
                CharSequence text = layoutA.getText();
                kotlin.jvm.internal.m.d(text, "null cannot be cast to non-null type android.text.Spanned");
                if (o.f((Spanned) text, m3.h.class) || layoutA.getText().length() <= 0) {
                    CharSequence text2 = layoutA.getText();
                    kotlin.jvm.internal.m.d(text2, "null cannot be cast to non-null type android.text.Spanned");
                    hVarArr = (m3.h[]) ((Spanned) text2).getSpans(i19, layoutA.getText().length(), m3.h.class);
                } else {
                    hVarArr = null;
                }
            } else {
                hVarArr = null;
            }
            this.f37902o = hVarArr;
            if (hVarArr == null) {
                i22 = 2;
                i23 = i19;
            } else {
                m3.h hVar = hVarArr.length == 0 ? null : hVarArr[i19];
                if (hVar != null) {
                    if (hVar.f40841c) {
                        i22 = 2;
                        i29 = hVar.f40844f == 2 ? 1 : i29;
                        i23 = i29;
                    } else {
                        i22 = 2;
                    }
                    i29 = i19;
                    i23 = i29;
                } else {
                    i22 = 2;
                    i23 = i19;
                }
            }
            if (hVarArr == null) {
                i24 = i19;
            } else {
                m3.h hVar2 = hVarArr.length == 0 ? null : hVarArr[i19];
                if (hVar2 != null && hVar2.f40842d && hVar2.f40844f == i22) {
                    i24 = 1;
                } else {
                    i24 = i19;
                }
            }
            if (i23 == 0 || i24 == 0) {
                long jA3 = s.f37906b;
                if (z11) {
                    c11 = ' ';
                    j11 = 4294967295L;
                    i25 = 33;
                } else {
                    if (this.f37900l) {
                        BoringLayout boringLayout = (BoringLayout) layoutA;
                        i25 = 33;
                        if (Build.VERSION.SDK_INT >= 33) {
                            zB = d.b(boringLayout);
                        } else {
                            r9 = i19;
                        }
                    } else {
                        i25 = 33;
                        StaticLayout staticLayout = (StaticLayout) layoutA;
                        int i31 = Build.VERSION.SDK_INT;
                        if (i31 >= 33) {
                            zC = d.c(staticLayout);
                        } else if (i31 >= 28) {
                            r9 = 1;
                        } else {
                            r9 = i19;
                        }
                    }
                    if (r9 != 0) {
                        r9 = zC;
                        r9 = zB;
                        c11 = ' ';
                        j11 = 4294967295L;
                    } else {
                        r9 = zC;
                        TextPaint paint = layoutA.getPaint();
                        CharSequence text3 = layoutA.getText();
                        c11 = ' ';
                        j11 = 4294967295L;
                        Rect rectB = o.b(paint, text3, layoutA.getLineStart(i19), layoutA.getLineEnd(i19));
                        int lineAscent = layoutA.getLineAscent(i19);
                        int i32 = rectB.top;
                        if (i32 < lineAscent) {
                            r9 = zB;
                            topPadding = lineAscent - i32;
                        } else {
                            r9 = zB;
                            topPadding = layoutA.getTopPadding();
                        }
                        i26 = 1;
                        rectB = iMin != 1 ? o.b(paint, text3, layoutA.getLineStart(i30), layoutA.getLineEnd(i30)) : rectB;
                        int lineDescent = layoutA.getLineDescent(i30);
                        int i33 = rectB.bottom;
                        int bottomPadding = i33 > lineDescent ? i33 - lineDescent : layoutA.getBottomPadding();
                        if (topPadding != 0 || bottomPadding != 0) {
                            jA3 = s.a(topPadding, bottomPadding);
                        }
                    }
                    if (i23 != 0) {
                        i27 = i19;
                    } else {
                        i27 = (int) (jA3 >> c11);
                    }
                    if (i24 != 0) {
                        i28 = i19;
                    } else {
                        i28 = (int) (jA3 & j11);
                    }
                    jA = s.a(i27, i28);
                }
                i26 = 1;
                if (i23 != 0) {
                    i27 = i19;
                } else {
                    i27 = (int) (jA3 >> c11);
                }
                if (i24 != 0) {
                    i28 = i19;
                } else {
                    i28 = (int) (jA3 & j11);
                }
                jA = s.a(i27, i28);
            } else {
                jA = s.f37906b;
                c11 = ' ';
                j11 = 4294967295L;
                i25 = 33;
                i26 = 1;
            }
            if (hVarArr != null) {
                int length2 = hVarArr.length;
                int iMax = i19;
                int i34 = iMax;
                int iMax2 = i34;
                while (i34 < length2) {
                    m3.h hVar3 = hVarArr[i34];
                    int i35 = hVar3.M;
                    iMax = i35 < 0 ? Math.max(iMax, Math.abs(i35)) : iMax;
                    int i36 = hVar3.N;
                    if (i36 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i36));
                    }
                    i34++;
                }
                jA2 = (iMax == 0 && iMax2 == 0) ? s.f37906b : s.a(iMax, iMax2);
            } else {
                jA2 = s.f37906b;
            }
            this.f37896h = Math.max((int) (jA >> c11), (int) (jA2 >> c11));
            this.f37897i = Math.max((int) (jA & j11), (int) (jA2 & j11));
            TextPaint textPaint2 = this.f37889a;
            m3.h[] hVarArr2 = this.f37902o;
            int i37 = this.f37895g - i26;
            Layout layout = this.f37894f;
            if (layout.getLineStart(i37) != layout.getLineEnd(i37) || hVarArr2 == null || hVarArr2.length == 0) {
                fontMetricsInt = null;
            } else {
                TextDirectionHeuristic textDirectionHeuristic2 = textDirectionHeuristic;
                SpannableString spannableString = new SpannableString("\u200b");
                m3.h hVar4 = (m3.h) ry.l.U(hVarArr2);
                spannableString.setSpan(new m3.h(hVar4.f40839a, spannableString.length(), (i37 == 0 || !hVar4.f40842d) ? hVar4.f40842d : i19, hVar4.f40842d, hVar4.f40843e, hVar4.f40844f), i19, spannableString.length(), i25);
                StaticLayout staticLayoutA = o.a(spannableString, textPaint2, Integer.MAX_VALUE, spannableString.length(), textDirectionHeuristic2, j.f37874a, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f37891c, 0, 0, 0, 0);
                fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = staticLayoutA.getLineAscent(i19);
                fontMetricsInt.descent = staticLayoutA.getLineDescent(i19);
                fontMetricsInt.top = staticLayoutA.getLineTop(i19);
                fontMetricsInt.bottom = staticLayoutA.getLineBottom(i19);
            }
            this.f37901n = fontMetricsInt != null ? fontMetricsInt.bottom - ((int) (e(i30) - g(i30))) : i19;
            this.m = fontMetricsInt;
            Layout layout2 = this.f37894f;
            this.f37898j = se.p.Q(layout2, i30, layout2.getPaint());
            Layout layout3 = this.f37894f;
            this.f37899k = se.p.R(layout3, i30, layout3.getPaint());
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final int a() {
        boolean z11 = this.f37892d;
        Layout layout = this.f37894f;
        return (z11 ? layout.getLineBottom(this.f37895g - 1) : layout.getHeight()) + this.f37896h + this.f37897i + this.f37901n;
    }

    public final float b(int i11) {
        return i11 == this.f37895g + (-1) ? this.f37898j + this.f37899k : CropImageView.DEFAULT_ASPECT_RATIO;
    }

    public final a9.i c() {
        a9.i iVar = this.f37904q;
        if (iVar != null) {
            return iVar;
        }
        a9.i iVar2 = new a9.i();
        iVar2.f517a = this.f37894f;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            int iH0 = oz.q.H0(((Layout) iVar2.f517a).getText(), '\n', length, 4);
            length = iH0 < 0 ? ((Layout) iVar2.f517a).getText().length() : iH0 + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < ((Layout) iVar2.f517a).getText().length());
        iVar2.f518b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList2.add(null);
        }
        iVar2.f519c = arrayList2;
        iVar2.f520d = new boolean[((ArrayList) iVar2.f518b).size()];
        ((ArrayList) iVar2.f518b).size();
        this.f37904q = iVar2;
        return iVar2;
    }

    public final float d(int i11) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f37896h + ((i11 != this.f37895g + (-1) || (fontMetricsInt = this.m) == null) ? this.f37894f.getLineBaseline(i11) : g(i11) - fontMetricsInt.ascent);
    }

    public final float e(int i11) {
        Paint.FontMetricsInt fontMetricsInt;
        int i12 = this.f37895g;
        int i13 = i12 - 1;
        Layout layout = this.f37894f;
        if (i11 != i13 || (fontMetricsInt = this.m) == null) {
            return this.f37896h + layout.getLineBottom(i11) + (i11 == i12 + (-1) ? this.f37897i : 0);
        }
        return layout.getLineBottom(i11 - 1) + fontMetricsInt.bottom;
    }

    public final int f(int i11) {
        ThreadLocal threadLocal = s.f37905a;
        Layout layout = this.f37894f;
        return (layout.getEllipsisCount(i11) <= 0 || this.f37890b != TextUtils.TruncateAt.END) ? layout.getLineEnd(i11) : layout.getText().length();
    }

    public final float g(int i11) {
        return this.f37894f.getLineTop(i11) + (i11 == 0 ? 0 : this.f37896h);
    }

    public final float h(int i11, boolean z11) {
        return b(this.f37894f.getLineForOffset(i11)) + c().o(i11, true, z11);
    }

    public final float i(int i11, boolean z11) {
        return b(this.f37894f.getLineForOffset(i11)) + c().o(i11, false, z11);
    }

    public final ar.f j() {
        ar.f fVar = this.f37893e;
        if (fVar != null) {
            return fVar;
        }
        Layout layout = this.f37894f;
        ar.f fVar2 = new ar.f(layout.getText(), layout.getText().length(), this.f37889a.getTextLocale());
        this.f37893e = fVar2;
        return fVar2;
    }
}
