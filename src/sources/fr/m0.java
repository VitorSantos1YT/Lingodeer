package fr;

import com.lingodeer.data.env.Env;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o0 f27692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f27693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i11, int i12, o0 o0Var, vy.d dVar) {
        super(2, dVar);
        this.f27691a = i12;
        this.f27692b = o0Var;
        this.f27693c = i11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f27691a) {
            case 0:
                return new m0(this.f27693c, 0, this.f27692b, dVar);
            case 1:
                return new m0(this.f27693c, 1, this.f27692b, dVar);
            case 2:
                return new m0(this.f27693c, 2, this.f27692b, dVar);
            case 3:
                return new m0(this.f27693c, 3, this.f27692b, dVar);
            default:
                return new m0(this.f27693c, this.f27692b, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f27691a) {
            case 0:
                m0 m0Var = (m0) create(b0Var, dVar);
                qy.b0 b0Var2 = qy.b0.f48488a;
                m0Var.invokeSuspend(b0Var2);
                return b0Var2;
            case 1:
                m0 m0Var2 = (m0) create(b0Var, dVar);
                qy.b0 b0Var3 = qy.b0.f48488a;
                m0Var2.invokeSuspend(b0Var3);
                return b0Var3;
            case 2:
                m0 m0Var3 = (m0) create(b0Var, dVar);
                qy.b0 b0Var4 = qy.b0.f48488a;
                m0Var3.invokeSuspend(b0Var4);
                return b0Var4;
            case 3:
                m0 m0Var4 = (m0) create(b0Var, dVar);
                qy.b0 b0Var5 = qy.b0.f48488a;
                m0Var4.invokeSuspend(b0Var5);
                return b0Var5;
            default:
                m0 m0Var5 = (m0) create(b0Var, dVar);
                qy.b0 b0Var6 = qy.b0.f48488a;
                m0Var5.invokeSuspend(b0Var6);
                return b0Var6;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f27691a;
        qy.b0 b0Var = qy.b0.f48488a;
        o0 o0Var = this.f27692b;
        int i12 = this.f27693c;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env = o0Var.f27733a;
                env.tellMeWhyDailyCount = i12;
                env.updateEntry("tellMeWhyDailyCount");
                break;
            case 1:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env2 = o0Var.f27733a;
                env2.tellMeWhyDailyFireTime = i12;
                env2.updateEntry("tellMeWhyDailyFireTime");
                break;
            case 2:
                wy.a aVar3 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env3 = o0Var.f27733a;
                env3.themeValue = i12;
                env3.updateEntry("themeValue");
                break;
            case 3:
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                Env env4 = o0Var.f27733a;
                int i13 = env4.keyLanguage;
                if (i13 == 0) {
                    env4.cnMFSwitch = i12;
                    env4.updateEntry("cnMFSwitch");
                    break;
                } else if (i13 == 1) {
                    env4.jpMFSwitch = i12;
                    env4.updateEntry("jpMFSwitch");
                    break;
                } else if (i13 == 2) {
                    env4.krMFSwitch = i12;
                    env4.updateEntry("krMFSwitch");
                    break;
                } else if (i13 == 3) {
                    env4.enMFSwitch = i12;
                    env4.updateEntry("enMFSwitch");
                    break;
                } else if (i13 != 8 && i13 != 17) {
                    if (i13 != 47 && i13 != 48) {
                        switch (i13) {
                            case 11:
                                env4.cnupMFSwitch = i12;
                                env4.updateEntry("cnupMFSwitch");
                                break;
                            case 12:
                                env4.jpupMFSwitch = i12;
                                env4.updateEntry("jpupMFSwitch");
                                break;
                            case 13:
                                env4.krupMFSwitch = i12;
                                env4.updateEntry("krupMFSwitch");
                                break;
                        }
                    } else {
                        env4.esusMFSwitch = i12;
                        env4.updateEntry("esusMFSwitch");
                        break;
                    }
                } else {
                    env4.ptMFSwitch = i12;
                    env4.updateEntry("ptMFSwitch");
                    break;
                }
                break;
            default:
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                int iL = hz.b.l(i12, 50, 150);
                Env env5 = o0Var.f27733a;
                env5.webViewTextZoom = iL;
                uz.i1 i1Var = o0Var.f27746o;
                Integer num = new Integer(iL);
                i1Var.getClass();
                i1Var.l(null, num);
                env5.updateEntry("webViewTextZoom");
                break;
        }
        return b0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i11, o0 o0Var, vy.d dVar) {
        super(2, dVar);
        this.f27691a = 4;
        this.f27693c = i11;
        this.f27692b = o0Var;
    }
}
