package z2;

import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l1.c3 f58537a = new l1.c3(c2.f58521b);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final wy.a a(b1.r rVar, b0.f fVar, xy.c cVar) {
        d2 d2Var;
        if (cVar instanceof d2) {
            d2Var = (d2) cVar;
            int i11 = d2Var.f58527b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                d2Var.f58527b = i11 - Integer.MIN_VALUE;
            } else {
                d2Var = new d2(cVar);
            }
        } else {
            d2Var = new d2(cVar);
        }
        Object obj = d2Var.f58526a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = d2Var.f58527b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            if (!rVar.f58482a.P) {
                throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
            }
            y2.t1 t1VarY = y2.f.y(rVar);
            t1.i iVar = (t1.i) y2.f.x(rVar).f56887e0;
            iVar.getClass();
            if (l1.t.E(iVar, f58537a) != null) {
                throw new ClassCastException();
            }
            d2Var.f58527b = 1;
            if (b(t1VarY, fVar, d2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final wy.a b(y2.t1 t1Var, fz.e eVar, xy.c cVar) {
        e2 e2Var;
        if (cVar instanceof e2) {
            e2Var = (e2) cVar;
            int i11 = e2Var.f58532b;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e2Var.f58532b = i11 - Integer.MIN_VALUE;
            } else {
                e2Var = new e2(cVar);
            }
        } else {
            e2Var = new e2(cVar);
        }
        Object obj = e2Var.f58531a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i12 = e2Var.f58532b;
        if (i12 == 0) {
            com.bumptech.glide.e.F(obj);
            e2Var.f58532b = 1;
            if (((AndroidComposeView) t1Var).I(eVar, e2Var) == aVar) {
                return aVar;
            }
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                throw new KotlinNothingValueException();
            }
            com.bumptech.glide.e.F(obj);
        }
        throw new KotlinNothingValueException();
    }
}
