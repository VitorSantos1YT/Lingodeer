package m3;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends CharacterStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f40854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f40855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f40856d;

    public j(float f5, float f11, float f12, int i11) {
        this.f40853a = i11;
        this.f40854b = f5;
        this.f40855c = f11;
        this.f40856d = f12;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.f40856d, this.f40854b, this.f40855c, this.f40853a);
    }
}
