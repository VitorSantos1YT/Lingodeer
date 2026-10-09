package d1;

import bt.j1;
import com.yalantis.ucrop.view.CropImageView;
import kotlin.KotlinNothingValueException;
import s0.o1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f22974b;

    public /* synthetic */ q0(z0 z0Var, int i11) {
        this.f22973a = i11;
        this.f22974b = z0Var;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x013d  */
    @Override // fz.c
    public final Object invoke(Object obj) {
        f2.c cVar;
        char c11;
        float fIntBitsToFloat;
        w2.x xVarC;
        w2.x xVarC2;
        w2.x xVarC3;
        w2.x xVarC4;
        int i11 = this.f22973a;
        z0 z0Var = this.f22974b;
        switch (i11) {
            case 0:
                w2.x xVar = (w2.x) obj;
                s0.s0 s0Var = z0Var.f23040d;
                f2.c cVar2 = f2.c.f26571e;
                if (s0Var == null) {
                    cVar = cVar2;
                } else {
                    if (s0Var.f51180p) {
                        s0Var = null;
                    }
                    if (s0Var != null) {
                        o3.p pVar = z0Var.f23038b;
                        long j11 = z0Var.m().f44705b;
                        int i12 = j3.x0.f35822c;
                        int iS = pVar.s((int) (j11 >> 32));
                        int iS2 = z0Var.f23038b.s((int) (z0Var.m().f44705b & 4294967295L));
                        s0.s0 s0Var2 = z0Var.f23040d;
                        long jP = 0;
                        long jP2 = (s0Var2 == null || (xVarC4 = s0Var2.c()) == null) ? 0L : xVarC4.P(z0Var.k(true));
                        s0.s0 s0Var3 = z0Var.f23040d;
                        if (s0Var3 != null && (xVarC3 = s0Var3.c()) != null) {
                            jP = xVarC3.P(z0Var.k(false));
                        }
                        s0.s0 s0Var4 = z0Var.f23040d;
                        float fIntBitsToFloat2 = CropImageView.DEFAULT_ASPECT_RATIO;
                        if (s0Var4 == null || (xVarC2 = s0Var4.c()) == null) {
                            c11 = ' ';
                            fIntBitsToFloat = 0.0f;
                        } else {
                            o1 o1VarD = s0Var.d();
                            c11 = ' ';
                            fIntBitsToFloat = Float.intBitsToFloat((int) (xVarC2.P((((long) Float.floatToRawIntBits(o1VarD != null ? o1VarD.f51124a.c(iS).f26573b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << 32)) & 4294967295L));
                        }
                        s0.s0 s0Var5 = z0Var.f23040d;
                        if (s0Var5 != null && (xVarC = s0Var5.c()) != null) {
                            o1 o1VarD2 = s0Var.d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (xVarC.P((((long) Float.floatToRawIntBits(CropImageView.DEFAULT_ASPECT_RATIO)) << c11) | (((long) Float.floatToRawIntBits(o1VarD2 != null ? o1VarD2.f51124a.c(iS2).f26573b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        int i13 = (int) (jP2 >> c11);
                        int i14 = (int) (jP >> c11);
                        cVar = new f2.c(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), (s0Var.f51166a.f51272g.getDensity() * 25) + Math.max(Float.intBitsToFloat((int) (jP2 & 4294967295L)), Float.intBitsToFloat((int) (jP & 4294967295L))));
                    } else {
                        cVar = cVar2;
                    }
                }
                s0.s0 s0Var6 = z0Var.f23040d;
                w2.x xVarC5 = s0Var6 != null ? s0Var6.c() : null;
                if (xVarC5 != null) {
                    return (xVarC5.k() && xVar.k()) ? com.bumptech.glide.e.e(xVar.f(w2.a0.h(xVarC5), cVar.d()), cVar.c()) : cVar2;
                }
                i0.a.d("Required value was null.");
                throw new KotlinNothingValueException();
            case 1:
                return new j1(z0Var, 12);
            default:
                z0Var.q();
                return qy.b0.f48488a;
        }
    }
}
