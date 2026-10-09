package gp;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.lingo.lingoskill.object.SpecialBillingPageConfig;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29477a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f29479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.u f29480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l1 f29481e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(long j11, kotlin.jvm.internal.u uVar, l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.f29479c = j11;
        this.f29480d = uVar;
        this.f29481e = l1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f29477a) {
            case 0:
                return new p0(this.f29481e, this.f29479c, this.f29480d, dVar);
            default:
                return new p0(this.f29479c, this.f29480d, this.f29481e, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f29477a) {
            case 0:
                break;
        }
        return ((p0) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        SpecialBillingPageConfig specialBillingPageConfig;
        long jW;
        long j11;
        long j12;
        long jW2;
        long j13;
        long j14;
        switch (this.f29477a) {
            case 0:
                vt.n0 n0Var = this.f29481e.f29434b;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i11 = this.f29478b;
                long j15 = this.f29479c;
                if (i11 == 0) {
                    com.bumptech.glide.e.F(obj);
                    try {
                        h00.s sVar = xt.c.f56291a;
                        String strF = FirebaseRemoteConfig.d().f("special_billing_page_config");
                        sVar.getClass();
                        specialBillingPageConfig = (SpecialBillingPageConfig) sVar.b(SpecialBillingPageConfig.Companion.serializer(), strF);
                        break;
                    } catch (Exception unused) {
                        specialBillingPageConfig = new SpecialBillingPageConfig((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 2047, (kotlin.jvm.internal.f) null);
                    }
                    if (System.currentTimeMillis() - ((fr.o0) n0Var).f27733a.specialLifeTimeBegin < ((long) specialBillingPageConfig.getSaleTime()) * 60000) {
                        jW = ((long) specialBillingPageConfig.getSaleTime()) * 60000;
                        j11 = ((fr.o0) n0Var).f27733a.specialLifeTimeBegin;
                    } else {
                        long countDownEndTimeIntervalSince1970 = c.a.j().getCountDownEndTimeIntervalSince1970();
                        if (countDownEndTimeIntervalSince1970 > 0) {
                            long j16 = countDownEndTimeIntervalSince1970 * 1000;
                            if (j16 > j15) {
                                this.f29480d.f38357a = true;
                                j12 = j16 - j15;
                            }
                            return new Long(j12);
                        }
                        if (j15 - ((fr.o0) n0Var).f27733a.newTimeDiscountBegin <= c.a.w()) {
                            jW = c.a.w();
                            j11 = ((fr.o0) n0Var).f27733a.newTimeDiscountBegin;
                        } else if (c.a.w() <= 86400000) {
                            this.f29478b = 1;
                            if (((fr.o0) n0Var).V(j15, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            this.f29478b = 2;
                            if (((fr.o0) n0Var).V(j15 - 86400000, this) == aVar) {
                                return aVar;
                            }
                        }
                    }
                    j12 = jW - (j15 - j11);
                    return new Long(j12);
                }
                if (i11 != 1 && i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                jW = FirebaseRemoteConfig.d().e("billing_page_countdown") * 3600000;
                j11 = ((fr.o0) n0Var).f27733a.newTimeDiscountBegin;
                j12 = jW - (j15 - j11);
                return new Long(j12);
            default:
                vt.n0 n0Var2 = this.f29481e.f29434b;
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                int i12 = this.f29478b;
                long j17 = this.f29479c;
                if (i12 == 0) {
                    com.bumptech.glide.e.F(obj);
                    long countDownEndTimeIntervalSince1971 = c.a.j().getCountDownEndTimeIntervalSince1970();
                    if (countDownEndTimeIntervalSince1971 > 0) {
                        long j18 = countDownEndTimeIntervalSince1971 * 1000;
                        if (j18 > j17) {
                            this.f29480d.f38357a = true;
                            j14 = j18 - j17;
                        }
                        return new Long(j14);
                    }
                    if (j17 - ((fr.o0) n0Var2).f27733a.newTimeDiscountBegin <= c.a.w()) {
                        jW2 = c.a.w();
                        j13 = ((fr.o0) n0Var2).f27733a.newTimeDiscountBegin;
                    } else if (c.a.w() <= 86400000) {
                        this.f29478b = 1;
                        if (((fr.o0) n0Var2).V(j17, this) == aVar2) {
                            return aVar2;
                        }
                    } else {
                        this.f29478b = 2;
                        if (((fr.o0) n0Var2).V(j17 - 86400000, this) == aVar2) {
                            return aVar2;
                        }
                    }
                    j14 = jW2 - (j17 - j13);
                    return new Long(j14);
                }
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                jW2 = FirebaseRemoteConfig.d().e("billing_page_countdown") * 3600000;
                j13 = ((fr.o0) n0Var2).f27733a.newTimeDiscountBegin;
                j14 = jW2 - (j17 - j13);
                return new Long(j14);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l1 l1Var, long j11, kotlin.jvm.internal.u uVar, vy.d dVar) {
        super(2, dVar);
        this.f29481e = l1Var;
        this.f29479c = j11;
        this.f29480d = uVar;
    }
}
