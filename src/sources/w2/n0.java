package w2;

import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 extends f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f54550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f54551c;

    public /* synthetic */ n0(Object obj, int i11) {
        this.f54550b = i11;
        this.f54551c = obj;
    }

    @Override // v3.c
    public final float Z() {
        switch (this.f54550b) {
            case 0:
                return ((y2.q0) this.f54551c).Z();
            default:
                return ((AndroidComposeView) this.f54551c).getDensity().Z();
        }
    }

    @Override // w2.f1
    public float b(p pVar) {
        float fIntBitsToFloat;
        int iZ;
        switch (this.f54550b) {
            case 0:
                fz.e eVar = pVar.f54557a;
                if (eVar != null) {
                    return ((Number) eVar.invoke(this, Float.valueOf(Float.NaN))).floatValue();
                }
                y2.q0 q0Var = (y2.q0) this.f54551c;
                if (q0Var.M) {
                    return Float.NaN;
                }
                y2.q0 q0Var2 = q0Var;
                while (true) {
                    b7.c cVar = q0Var2.O;
                    float f5 = (cVar == null || (iZ = ry.l.Z((p[]) cVar.f3959b, pVar)) < 0) ? Float.NaN : ((float[]) cVar.f3960c)[iZ];
                    if (!Float.isNaN(f5)) {
                        q0Var2.s0(q0Var.J0(), pVar);
                        x xVarH0 = q0Var2.H0();
                        x xVarH1 = q0Var.H0();
                        switch (pVar.f54558b) {
                            case 0:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (xVarH1.f(xVarH0, (((long) Float.floatToRawIntBits(f5)) & 4294967295L) | (((long) Float.floatToRawIntBits(((int) (xVarH0.m() >> 32)) / 2.0f)) << 32)) & 4294967295L));
                                break;
                            default:
                                fIntBitsToFloat = Float.intBitsToFloat((int) (xVarH1.f(xVarH0, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(((int) (xVarH0.m() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                break;
                        }
                        return fIntBitsToFloat;
                    }
                    y2.q0 q0VarL0 = q0Var2.L0();
                    if (q0VarL0 == null) {
                        q0Var2.s0(q0Var.J0(), pVar);
                        return Float.NaN;
                    }
                    q0Var2 = q0VarL0;
                }
                break;
            default:
                return super.b(pVar);
        }
    }

    @Override // w2.f1
    public final v3.m c() {
        switch (this.f54550b) {
            case 0:
                return ((y2.q0) this.f54551c).getLayoutDirection();
            default:
                return ((AndroidComposeView) this.f54551c).getLayoutDirection();
        }
    }

    @Override // w2.f1
    public final int e() {
        switch (this.f54550b) {
            case 0:
                return ((y2.q0) this.f54551c).g0();
            default:
                return ((AndroidComposeView) this.f54551c).getRoot().f56893j0.f56974p.f54501a;
        }
    }

    @Override // v3.c
    public final float getDensity() {
        switch (this.f54550b) {
            case 0:
                return ((y2.q0) this.f54551c).getDensity();
            default:
                return ((AndroidComposeView) this.f54551c).getDensity().getDensity();
        }
    }
}
