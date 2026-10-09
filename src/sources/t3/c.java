package t3;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import g2.l;
import i2.e;
import i2.g;
import i2.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f52031a;

    public c(e eVar) {
        this.f52031a = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            g gVar = g.f34126a;
            e eVar = this.f52031a;
            if (m.a(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (!(eVar instanceof h)) {
                throw new NoWhenBranchMatchedException();
            }
            textPaint.setStyle(Paint.Style.STROKE);
            h hVar = (h) eVar;
            textPaint.setStrokeWidth(hVar.f34127a);
            textPaint.setStrokeMiter(hVar.f34128b);
            int i11 = hVar.f34130d;
            if (i11 == 0) {
                join = Paint.Join.MITER;
            } else if (i11 == 1) {
                join = Paint.Join.ROUND;
            } else {
                join = i11 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER;
            }
            textPaint.setStrokeJoin(join);
            int i12 = hVar.f34129c;
            if (i12 == 0) {
                cap = Paint.Cap.BUTT;
            } else if (i12 == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                cap = i12 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT;
            }
            textPaint.setStrokeCap(cap);
            l lVar = hVar.f34131e;
            textPaint.setPathEffect(lVar != null ? lVar.f28580a : null);
        }
    }
}
