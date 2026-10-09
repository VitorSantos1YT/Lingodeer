package com.google.android.material.resources;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class CancelableFontCallback extends TextAppearanceFontCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Typeface f15081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplyFont f15082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15083c;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ApplyFont {
        void a(Typeface typeface);
    }

    public CancelableFontCallback(ApplyFont applyFont, Typeface typeface) {
        this.f15081a = typeface;
        this.f15082b = applyFont;
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void a(int i11) {
        if (this.f15083c) {
            return;
        }
        this.f15082b.a(this.f15081a);
    }

    @Override // com.google.android.material.resources.TextAppearanceFontCallback
    public final void b(Typeface typeface, boolean z11) {
        if (this.f15083c) {
            return;
        }
        this.f15082b.a(typeface);
    }
}
