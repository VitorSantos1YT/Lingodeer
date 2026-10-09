package gp;

import com.lingodeer.database.model.LanguageHistoryEntity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f29413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LanguageHistoryEntity f29414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(m mVar, LanguageHistoryEntity languageHistoryEntity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f29411a = i11;
        this.f29413c = mVar;
        this.f29414d = languageHistoryEntity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29411a) {
            case 0:
                return new k(this.f29413c, this.f29414d, dVar, 0);
            default:
                return new k(this.f29413c, this.f29414d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29411a) {
            case 0:
                break;
        }
        return ((k) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29411a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f29412b;
                qy.b0 b0Var = qy.b0.f48488a;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.q0 q0Var = this.f29413c.f29442a;
                    LanguageHistoryEntity languageHistoryEntity = this.f29414d;
                    int keyLanguage = languageHistoryEntity.getKeyLanguage();
                    int locate = languageHistoryEntity.getLocate();
                    this.f29412b = 1;
                    Object objC = cf.x.C(this, ((fr.z0) q0Var).f27998a.f3062a, false, true, new au.p0(keyLanguage, locate, 0));
                    if (objC != aVar) {
                        objC = b0Var;
                    }
                    if (objC != aVar) {
                        objC = b0Var;
                    }
                    if (objC == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return b0Var;
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29412b;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.q0 q0Var2 = this.f29413c.f29442a;
                    LanguageHistoryEntity languageHistoryEntityCopy$default = LanguageHistoryEntity.copy$default(this.f29414d, null, 0, 0, null, null, System.currentTimeMillis(), 31, null);
                    this.f29412b = 1;
                    if (((fr.z0) q0Var2).a(languageHistoryEntityCopy$default, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }
}
