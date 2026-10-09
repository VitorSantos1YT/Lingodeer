package bp;

import android.view.View;
import com.lingo.lingoskill.ui.base.MoreLingodeerActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l3 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MoreLingodeerActivity f4694c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(MoreLingodeerActivity moreLingodeerActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4692a = i11;
        this.f4694c = moreLingodeerActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4692a) {
            case 0:
                return new l3(this.f4694c, dVar, 0);
            default:
                return new l3(this.f4694c, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4692a) {
            case 0:
                break;
        }
        return ((l3) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f4692a;
        qy.b0 b0Var = qy.b0.f48488a;
        MoreLingodeerActivity moreLingodeerActivity = this.f4694c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4693b;
                if (i12 != 0) {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                vt.n0 n0VarL = moreLingodeerActivity.l();
                this.f4693b = 1;
                fr.o0 o0Var = (fr.o0) n0VarL;
                o0Var.getClass();
                yz.f fVar = rz.o0.f50940a;
                Object objM = rz.e0.M(yz.e.f58387a, new fr.g0(11, o0Var, null), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                return objM == aVar ? aVar : b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4693b;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    wt.m0 m0Var = moreLingodeerActivity.n().f55339f;
                    this.f4693b = 1;
                    obj = uz.x0.u(m0Var, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    View[] viewArr = {((hj.c0) moreLingodeerActivity.j()).f32416e, ((hj.c0) moreLingodeerActivity.j()).f32414c, ((hj.c0) moreLingodeerActivity.j()).f32417f};
                    for (int i14 = 0; i14 < 3; i14++) {
                        viewArr[i14].setVisibility(8);
                    }
                    return b0Var;
                }
                View[] viewArr2 = {((hj.c0) moreLingodeerActivity.j()).f32416e, ((hj.c0) moreLingodeerActivity.j()).f32414c, ((hj.c0) moreLingodeerActivity.j()).f32417f};
                for (int i15 = 0; i15 < 3; i15++) {
                    viewArr2[i15].setVisibility(0);
                }
                return b0Var;
        }
    }
}
