package t3;

import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import f2.e;
import g2.u0;
import l1.g0;
import l1.k1;
import l1.t;
import r3.i;
import s0.u;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f52032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f52033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f52034c = t.B(new e(9205357640488583168L));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g0 f52035d = t.s(new u(this, 7));

    public d(u0 u0Var, float f5) {
        this.f52032a = u0Var;
        this.f52033b = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        i.c(textPaint, this.f52033b);
        textPaint.setShader((Shader) this.f52035d.getValue());
    }
}
