package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class StaticLayoutBuilderCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f14718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f14719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14721d;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f14728k;
    public StaticLayoutBuilderConfigurer m;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Layout.Alignment f14722e = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14723f = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14724g = CropImageView.DEFAULT_ASPECT_RATIO;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f14725h = 1.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14726i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f14727j = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f14729l = null;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class StaticLayoutBuilderCompatException extends Exception {
    }

    public StaticLayoutBuilderCompat(CharSequence charSequence, TextPaint textPaint, int i11) {
        this.f14718a = charSequence;
        this.f14719b = textPaint;
        this.f14720c = i11;
        this.f14721d = charSequence.length();
    }

    public final StaticLayout a() {
        if (this.f14718a == null) {
            this.f14718a = BuildConfig.VERSION_NAME;
        }
        int iMax = Math.max(0, this.f14720c);
        CharSequence charSequenceEllipsize = this.f14718a;
        int i11 = this.f14723f;
        TextPaint textPaint = this.f14719b;
        if (i11 == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.f14729l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f14721d);
        this.f14721d = iMin;
        if (this.f14728k && this.f14723f == 1) {
            this.f14722e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
        builderObtain.setAlignment(this.f14722e);
        builderObtain.setIncludePad(this.f14727j);
        builderObtain.setTextDirection(this.f14728k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f14729l;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f14723f);
        float f5 = this.f14724g;
        if (f5 != CropImageView.DEFAULT_ASPECT_RATIO || this.f14725h != 1.0f) {
            builderObtain.setLineSpacing(f5, this.f14725h);
        }
        if (this.f14723f > 1) {
            builderObtain.setHyphenationFrequency(this.f14726i);
        }
        StaticLayoutBuilderConfigurer staticLayoutBuilderConfigurer = this.m;
        if (staticLayoutBuilderConfigurer != null) {
            staticLayoutBuilderConfigurer.a(builderObtain);
        }
        return builderObtain.build();
    }
}
