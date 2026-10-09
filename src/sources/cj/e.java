package cj;

import b7.e0;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import fr.r;
import rz.b0;
import rz.o0;
import xy.i;
import yz.f;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ScDetailAdapter f7176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f7177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f7178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(ScDetailAdapter scDetailAdapter, String str, boolean z11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f7174a = i11;
        this.f7176c = scDetailAdapter;
        this.f7177d = str;
        this.f7178e = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f7174a) {
            case 0:
                return new e(this.f7176c, this.f7177d, this.f7178e, dVar, 0);
            default:
                return new e(this.f7176c, this.f7177d, this.f7178e, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f7174a) {
            case 0:
                break;
        }
        return ((e) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        e eVar;
        int i11 = this.f7174a;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f7175b;
                ScDetailAdapter scDetailAdapter = this.f7176c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.e eVar2 = scDetailAdapter.f21764f;
                    LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                    String strK = xt.d.k(x.n().keyLanguage);
                    this.f7175b = 1;
                    eVar = this;
                    if (((r) eVar2).a(strK, this.f7177d, this.f7178e, "sc", eVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    eVar = this;
                }
                if (!eVar.f7178e) {
                    return b0Var;
                }
                e0.A(scDetailAdapter.f21762d, "jxz_tv_learn_add_fav");
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f7175b;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return b0Var;
                }
                com.bumptech.glide.e.F(obj);
                f fVar = o0.f50940a;
                yz.e eVar3 = yz.e.f58387a;
                e eVar4 = new e(this.f7176c, this.f7177d, this.f7178e, null, 0);
                this.f7175b = 1;
                return rz.e0.M(eVar3, eVar4, this) == aVar2 ? aVar2 : b0Var;
        }
    }
}
