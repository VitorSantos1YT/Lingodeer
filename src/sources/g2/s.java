package g2;

import android.graphics.RenderEffect;
import l0.Eeqr.HOBXIlHxIkMBEA;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RenderEffect f28596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f28597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f28598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f28599d;

    public s(float f5, float f11, int i11) {
        this.f28597b = f5;
        this.f28598c = f11;
        this.f28599d = i11;
    }

    public final RenderEffect a() {
        RenderEffect renderEffect = this.f28596a;
        if (renderEffect != null) {
            return renderEffect;
        }
        RenderEffect renderEffectA = s0.a(this.f28597b, this.f28598c, this.f28599d);
        this.f28596a = renderEffectA;
        return renderEffectA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f28597b == sVar.f28597b && this.f28598c == sVar.f28598c && this.f28599d == sVar.f28599d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28599d) + defpackage.e.a(Float.hashCode(this.f28597b) * 31, this.f28598c, 31);
    }

    public final String toString() {
        return "BlurEffect(renderEffect=null, radiusX=" + this.f28597b + ", radiusY=" + this.f28598c + HOBXIlHxIkMBEA.QMZSeQy + ((Object) f0.I(this.f28599d)) + ')';
    }
}
