package k3;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import ch.b0;
import com.yalantis.ucrop.view.CropImageView;
import java.text.Bidi;
import ko.Zea.ealNNtLp;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {
    public static final Rect b(TextPaint textPaint, CharSequence charSequence, int i11, int i12) {
        int i13 = i11;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i13 - 1, i12, MetricAffectingSpan.class) != i12) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i13 < i12) {
                    int iNextSpanTransition = spanned.nextSpanTransition(i13, i12, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i13, iNextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        f.j(textPaint2, charSequence, i13, iNextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i13, iNextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i13 = iNextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            f.j(textPaint, charSequence, i13, i12, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i13, i12, rect3);
        return rect3;
    }

    public static final float c(int i11, int i12, float[] fArr) {
        return fArr[((i11 - i12) * 2) + 1];
    }

    public static final int d(Layout layout, int i11, boolean z11) {
        if (i11 <= 0) {
            return 0;
        }
        if (i11 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i11);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i11 || lineEnd == i11) {
            if (lineStart == i11) {
                if (z11) {
                    return lineForOffset - 1;
                }
            } else if (!z11) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0265 A[EDGE_INSN: B:144:0x0265->B:171:0x02c1 BREAK  A[LOOP:5: B:154:0x0281->B:206:0x0281]] */
    public static final int e(r rVar, Layout layout, a9.i iVar, int i11, RectF rectF, l3.d dVar, b0 b0Var, boolean z11) {
        k[] kVarArr;
        int i12;
        k[] kVarArr2;
        int i13;
        int iQ;
        int i14;
        int i15;
        int iP;
        Bidi bidiCreateLineBidi;
        float fA;
        float fA2;
        float fA3;
        int lineTop = layout.getLineTop(i11);
        int lineBottom = layout.getLineBottom(i11);
        int lineStart = layout.getLineStart(i11);
        int lineEnd = layout.getLineEnd(i11);
        if (lineStart == lineEnd) {
            return -1;
        }
        int i16 = (lineEnd - lineStart) * 2;
        float[] fArr = new float[i16];
        Layout layout2 = rVar.f37894f;
        int lineStart2 = layout2.getLineStart(i11);
        int iF = rVar.f(i11);
        if (i16 < (iF - lineStart2) * 2) {
            p3.a.a("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 2");
        }
        f3.g gVar = new f3.g(rVar);
        boolean z12 = false;
        boolean z13 = layout2.getParagraphDirection(i11) == 1;
        int i17 = 0;
        while (lineStart2 < iF) {
            boolean zIsRtlCharAt = layout2.isRtlCharAt(lineStart2);
            if (z13 && !zIsRtlCharAt) {
                fA = gVar.a(lineStart2, z12, z12, true);
                fA3 = gVar.a(lineStart2 + 1, true, true, true);
            } else if (z13 && zIsRtlCharAt) {
                fA3 = gVar.a(lineStart2, false, false, false);
                fA = gVar.a(lineStart2 + 1, true, true, false);
            } else {
                if (zIsRtlCharAt) {
                    fA2 = gVar.a(lineStart2, false, false, true);
                    fA = gVar.a(lineStart2 + 1, true, true, true);
                } else {
                    fA = gVar.a(lineStart2, false, false, false);
                    fA2 = gVar.a(lineStart2 + 1, true, true, false);
                }
                fA3 = fA2;
            }
            fArr[i17] = fA;
            fArr[i17 + 1] = fA3;
            i17 += 2;
            lineStart2++;
            z13 = z13;
            z12 = false;
        }
        Layout layout3 = (Layout) iVar.f517a;
        int lineStart3 = layout3.getLineStart(i11);
        int lineEnd2 = layout3.getLineEnd(i11);
        int iQ2 = iVar.q(lineStart3, false);
        int iR = iVar.r(iQ2);
        int i18 = lineStart3 - iR;
        int i19 = lineEnd2 - iR;
        Bidi bidiH = iVar.h(iQ2);
        if (bidiH == null || (bidiCreateLineBidi = bidiH.createLineBidi(i18, i19)) == null) {
            kVarArr = new k[]{new k(lineStart3, lineEnd2, layout3.isRtlCharAt(lineStart3))};
        } else {
            int runCount = bidiCreateLineBidi.getRunCount();
            kVarArr = new k[runCount];
            int i21 = 0;
            while (i21 < runCount) {
                int i22 = runCount;
                kVarArr[i21] = new k(bidiCreateLineBidi.getRunStart(i21) + lineStart3, bidiCreateLineBidi.getRunLimit(i21) + lineStart3, bidiCreateLineBidi.getRunLevel(i21) % 2 == 1);
                i21++;
                runCount = i22;
            }
        }
        lz.e gVar2 = z11 ? new lz.g(0, kVarArr.length - 1, 1) : new lz.e(kVarArr.length - 1, 0, -1);
        int i23 = gVar2.f40532a;
        int i24 = gVar2.f40533b;
        int i25 = gVar2.f40534c;
        if ((i25 <= 0 || i23 > i24) && (i25 >= 0 || i24 > i23)) {
            return -1;
        }
        while (true) {
            k kVar = kVarArr[i23];
            boolean z14 = kVar.f37877c;
            int i26 = kVar.f37875a;
            int iL = kVar.f37876b;
            float f5 = z14 ? fArr[((iL - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
            float fC = z14 ? c(i26, lineStart, fArr) : c(iL - 1, lineStart, fArr);
            if (z11) {
                float f11 = rectF.left;
                if (fC >= f11) {
                    i12 = i25;
                    float f12 = rectF.right;
                    if (f5 <= f12) {
                        if ((z14 || f11 > f5) && (!z14 || f12 < fC)) {
                            int i27 = iL;
                            int i28 = i26;
                            while (true) {
                                i14 = i27;
                                if (i27 - i28 <= 1) {
                                    break;
                                }
                                int i29 = (i14 + i28) / 2;
                                float f13 = fArr[(i29 - lineStart) * 2];
                                if ((z14 || f13 <= rectF.left) && (!z14 || f13 >= rectF.right)) {
                                    i27 = i14;
                                    i28 = i29;
                                } else {
                                    i27 = i29;
                                }
                            }
                            i15 = z14 ? i14 : i28;
                        } else {
                            i15 = i26;
                        }
                        int iQ3 = dVar.q(i15);
                        if (iQ3 != -1 && (iP = dVar.p(iQ3)) < iL) {
                            if (iP >= i26) {
                                i26 = iP;
                            }
                            if (iQ3 > iL) {
                                iQ3 = iL;
                            }
                            kVarArr2 = kVarArr;
                            RectF rectF2 = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, lineTop, CropImageView.DEFAULT_ASPECT_RATIO, lineBottom);
                            int iQ4 = iQ3;
                            while (true) {
                                rectF2.left = z14 ? fArr[((iQ4 - 1) - lineStart) * 2] : fArr[(i26 - lineStart) * 2];
                                rectF2.right = z14 ? c(i26, lineStart, fArr) : c(iQ4 - 1, lineStart, fArr);
                                if (((Boolean) b0Var.invoke(rectF2, rectF)).booleanValue()) {
                                    break;
                                }
                                i26 = dVar.i(i26);
                                if (i26 != -1 && i26 < iL) {
                                    iQ4 = dVar.q(i26);
                                    if (iQ4 > iL) {
                                        iQ4 = iL;
                                    }
                                }
                            }
                        }
                        i26 = -1;
                        break;
                    }
                } else {
                    i12 = i25;
                }
                kVarArr2 = kVarArr;
                i26 = -1;
                break;
            } else {
                i12 = i25;
                kVarArr2 = kVarArr;
                float f14 = rectF.left;
                if (fC < f14) {
                    iL = -1;
                    break;
                }
                float f15 = rectF.right;
                if (f5 <= f15) {
                    if ((z14 || f15 < fC) && (!z14 || f14 > f5)) {
                        int i30 = iL;
                        int i31 = i26;
                        while (i30 - i31 > 1) {
                            int i32 = (i30 + i31) / 2;
                            float f16 = fArr[(i32 - lineStart) * 2];
                            int i33 = i30;
                            if ((z14 || f16 <= rectF.right) && (!z14 || f16 >= rectF.left)) {
                                i30 = i33;
                                i31 = i32;
                            } else {
                                i30 = i32;
                            }
                        }
                        i13 = z14 ? i30 : i31;
                    } else {
                        i13 = iL - 1;
                    }
                    int iP2 = dVar.p(i13 + 1);
                    if (iP2 == -1 || (iQ = dVar.q(iP2)) <= i26) {
                        iL = -1;
                        break;
                    }
                    if (iP2 < i26) {
                        iP2 = i26;
                    }
                    if (iQ <= iL) {
                        iL = iQ;
                    }
                    RectF rectF3 = new RectF(CropImageView.DEFAULT_ASPECT_RATIO, lineTop, CropImageView.DEFAULT_ASPECT_RATIO, lineBottom);
                    int iP3 = iP2;
                    while (true) {
                        rectF3.left = z14 ? fArr[((iL - 1) - lineStart) * 2] : fArr[(iP3 - lineStart) * 2];
                        rectF3.right = z14 ? c(iP3, lineStart, fArr) : c(iL - 1, lineStart, fArr);
                        if (((Boolean) b0Var.invoke(rectF3, rectF)).booleanValue()) {
                            break;
                        }
                        iL = dVar.l(iL);
                        if (iL == -1 || iL <= i26) {
                            iL = -1;
                            break;
                        }
                        iP3 = dVar.p(iL);
                        if (iP3 < i26) {
                            iP3 = i26;
                        }
                    }
                } else {
                    iL = -1;
                    break;
                }
                i26 = iL;
            }
            if (i26 >= 0) {
                return i26;
            }
            if (i23 == i24) {
                return -1;
            }
            i23 += i12;
            i25 = i12;
            kVarArr = kVarArr2;
        }
    }

    public static final boolean f(Spanned spanned, Class cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static StaticLayout a(CharSequence charSequence, TextPaint textPaint, int i11, int i12, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i13, TextUtils.TruncateAt truncateAt, int i14, int i15, boolean z11, int i16, int i17, int i18, int i19) {
        if (i12 < 0) {
            p3.a.a("invalid start value");
        }
        int length = charSequence.length();
        if (i12 < 0 || i12 > length) {
            p3.a.a("invalid end value");
        }
        if (i13 < 0) {
            p3.a.a("invalid maxLines value");
        }
        if (i11 < 0) {
            p3.a.a(ealNNtLp.ZzP);
        }
        if (i14 < 0) {
            p3.a.a("invalid ellipsizedWidth value");
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, i12, textPaint, i11);
        builderObtain.setTextDirection(textDirectionHeuristic);
        builderObtain.setAlignment(alignment);
        builderObtain.setMaxLines(i13);
        builderObtain.setEllipsize(truncateAt);
        builderObtain.setEllipsizedWidth(i14);
        builderObtain.setLineSpacing(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        builderObtain.setIncludePad(z11);
        builderObtain.setBreakStrategy(i16);
        builderObtain.setHyphenationFrequency(i19);
        builderObtain.setIndents(null, null);
        int i21 = Build.VERSION.SDK_INT;
        if (i21 >= 26) {
            e.f(builderObtain, i15);
        }
        if (i21 >= 28) {
            m.a(builderObtain);
        }
        if (i21 >= 33) {
            d.d(builderObtain, i17, i18);
        }
        if (i21 >= 35) {
            n.a(builderObtain);
        }
        return builderObtain.build();
    }
}
