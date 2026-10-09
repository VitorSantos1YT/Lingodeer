package m3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f40857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f40858b;

    public k(boolean z11, boolean z12) {
        this.f40857a = z11;
        this.f40858b = z12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.f40857a);
        textPaint.setStrikeThruText(this.f40858b);
    }
}
