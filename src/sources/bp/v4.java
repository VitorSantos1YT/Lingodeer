package bp;

import com.lingo.lingoskill.ui.base.RemoteWhyLearnActivity;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class v4 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RemoteWhyLearnActivity f4859c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4(RemoteWhyLearnActivity remoteWhyLearnActivity, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4857a = i11;
        this.f4859c = remoteWhyLearnActivity;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4857a) {
            case 0:
                return new v4(this.f4859c, dVar, 0);
            case 1:
                return new v4(this.f4859c, dVar, 1);
            case 2:
                return new v4(this.f4859c, dVar, 2);
            case 3:
                return new v4(this.f4859c, dVar, 3);
            case 4:
                return new v4(this.f4859c, dVar, 4);
            case 5:
                return new v4(this.f4859c, dVar, 5);
            default:
                return new v4(this.f4859c, dVar, 6);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4857a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return ((v4) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f4857a) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f4858b;
                RemoteWhyLearnActivity remoteWhyLearnActivity = this.f4859c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0VarL = remoteWhyLearnActivity.l();
                    this.f4858b = 1;
                    if (((fr.o0) n0VarL).S("Personal interest", this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                remoteWhyLearnActivity.finish();
                return qy.b0.f48488a;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f4858b;
                RemoteWhyLearnActivity remoteWhyLearnActivity2 = this.f4859c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0VarL2 = remoteWhyLearnActivity2.l();
                    this.f4858b = 1;
                    if (((fr.o0) n0VarL2).S("Travel", this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                remoteWhyLearnActivity2.finish();
                return qy.b0.f48488a;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                int i13 = this.f4858b;
                RemoteWhyLearnActivity remoteWhyLearnActivity3 = this.f4859c;
                if (i13 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0VarL3 = remoteWhyLearnActivity3.l();
                    this.f4858b = 1;
                    if (((fr.o0) n0VarL3).S("Family", this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                remoteWhyLearnActivity3.finish();
                return qy.b0.f48488a;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i14 = this.f4858b;
                RemoteWhyLearnActivity remoteWhyLearnActivity4 = this.f4859c;
                if (i14 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0VarL4 = remoteWhyLearnActivity4.l();
                    this.f4858b = 1;
                    if (((fr.o0) n0VarL4).S("School", this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                remoteWhyLearnActivity4.finish();
                return qy.b0.f48488a;
            case 4:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i15 = this.f4858b;
                RemoteWhyLearnActivity remoteWhyLearnActivity5 = this.f4859c;
                if (i15 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0VarL5 = remoteWhyLearnActivity5.l();
                    this.f4858b = 1;
                    if (((fr.o0) n0VarL5).S("Work", this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                remoteWhyLearnActivity5.finish();
                return qy.b0.f48488a;
            case 5:
                wy.a aVar6 = wy.a.COROUTINE_SUSPENDED;
                int i16 = this.f4858b;
                RemoteWhyLearnActivity remoteWhyLearnActivity6 = this.f4859c;
                if (i16 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0VarL6 = remoteWhyLearnActivity6.l();
                    this.f4858b = 1;
                    if (((fr.o0) n0VarL6).S("Skill improvement", this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                remoteWhyLearnActivity6.finish();
                return qy.b0.f48488a;
            default:
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i17 = this.f4858b;
                RemoteWhyLearnActivity remoteWhyLearnActivity7 = this.f4859c;
                if (i17 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vt.n0 n0VarL7 = remoteWhyLearnActivity7.l();
                    this.f4858b = 1;
                    if (((fr.o0) n0VarL7).S("Other", this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                remoteWhyLearnActivity7.finish();
                return qy.b0.f48488a;
        }
    }
}
