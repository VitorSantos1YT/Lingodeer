package rt;

import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.LearnProgress;
import j$.time.LocalDate;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class h2 extends xy.i implements fz.i {
    public /* synthetic */ g2 H;
    public /* synthetic */ boolean K;
    public /* synthetic */ int L;
    public /* synthetic */ mt.q2 M;
    public /* synthetic */ qy.l N;
    public final /* synthetic */ j2 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f49808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f49809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f49810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f2 f49811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f49812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f49813f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49814t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(j2 j2Var, vy.d dVar) {
        super(6, dVar);
        this.O = j2Var;
    }

    @Override // fz.i
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        int iIntValue = ((Number) obj3).intValue();
        h2 h2Var = new h2(this.O, (vy.d) obj6);
        h2Var.H = (g2) obj;
        h2Var.K = zBooleanValue;
        h2Var.L = iIntValue;
        h2Var.M = (mt.q2) obj4;
        h2Var.N = (qy.l) obj5;
        return h2Var.invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        f2 f2Var;
        Object objU;
        int i11;
        boolean zBooleanValue;
        int i12;
        List newReviewList;
        int i13;
        int i14;
        f2 f2Var2;
        int i15;
        int i16;
        boolean z11;
        List list;
        int i17;
        j2 j2Var = this.O;
        wt.m mVar = j2Var.f49905b;
        vt.n0 n0Var = j2Var.f49907d;
        g2 g2Var = this.H;
        boolean z12 = this.K;
        int i18 = this.L;
        mt.q2 currentFlashCardPracticeMode = this.M;
        qy.l lVar = this.N;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i19 = this.f49814t;
        if (i19 == 0) {
            com.bumptech.glide.e.F(obj);
            f2Var = g2Var instanceof f2 ? (f2) g2Var : null;
            if (f2Var == null) {
                return e2.f49665a;
            }
            gp.r rVarB = mVar.b();
            this.H = null;
            this.M = currentFlashCardPracticeMode;
            this.N = lVar;
            this.f49811d = f2Var;
            this.K = z12;
            this.L = i18;
            this.f49814t = 1;
            objU = uz.x0.u(rVarB, this);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i19 == 1) {
            f2Var = this.f49811d;
            com.bumptech.glide.e.F(obj);
            objU = obj;
        } else {
            if (i19 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i17 = this.f49810c;
            i15 = this.f49809b;
            z11 = this.f49813f;
            i16 = this.f49808a;
            list = this.f49812e;
            f2Var2 = this.f49811d;
            com.bumptech.glide.e.F(obj);
        }
        i14 = i17;
        i13 = i15;
        zBooleanValue = z11;
        i11 = i16;
        f2Var = f2Var2;
        newReviewList = list;
        List list2 = f2Var.f49711b;
        boolean z13 = !list2.isEmpty();
        List list3 = f2Var.f49710a;
        List list4 = f2Var.f49713d;
        boolean z14 = f2Var.f49714e;
        boolean z15 = f2Var.f49717h;
        kotlin.jvm.internal.m.f(newReviewList, "newReviewList");
        kotlin.jvm.internal.m.f(currentFlashCardPracticeMode, "currentFlashCardPracticeMode");
        return new f2(list3, newReviewList, list2, list4, z14, z12, currentFlashCardPracticeMode, z15, i11, zBooleanValue, i13, i14, z13);
        int flashCardPracticeCount = ((LearnProgress) objU).getFlashCardPracticeCount();
        i11 = i18 == 0 ? 20 : i18;
        Boolean bool = (Boolean) lVar.f48495a;
        zBooleanValue = bool != null ? bool.booleanValue() : ((fr.o0) n0Var).f27733a.flashCardShuffleNewReviews;
        Integer num = (Integer) lVar.f48496b;
        int iIntValue = num != null ? num.intValue() : ((fr.o0) n0Var).f27733a.flashCardDailyNewReviewsLimit;
        Env env = ((fr.o0) n0Var).f27733a;
        int i21 = env.flashCardDailyNewReviewsStudiedCount;
        long j11 = env.flashCardDailyNewReviewsStudiedEpochDay;
        long epochDay = LocalDate.now().toEpochDay();
        if (iIntValue <= 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            if (j11 != epochDay || i21 < 0) {
                i21 = 0;
            }
            i12 = iIntValue - i21;
            if (i12 < 0) {
                i12 = 0;
            }
        }
        List listU0 = i12 != Integer.MAX_VALUE ? ry.m.U0(f2Var.f49711b, i12) : f2Var.f49711b;
        if (i11 != flashCardPracticeCount) {
            this.H = null;
            this.M = currentFlashCardPracticeMode;
            this.N = null;
            this.f49811d = f2Var;
            this.f49812e = listU0;
            this.K = z12;
            this.L = i18;
            this.f49808a = i11;
            this.f49813f = zBooleanValue;
            this.f49809b = iIntValue;
            this.f49810c = i12;
            this.f49814t = 2;
            if (mVar.j(i11, this) != aVar) {
                f2Var2 = f2Var;
                i15 = iIntValue;
                i16 = i11;
                z11 = zBooleanValue;
                list = listU0;
                i17 = i12;
                i14 = i17;
                i13 = i15;
                zBooleanValue = z11;
                i11 = i16;
                f2Var = f2Var2;
                newReviewList = list;
            }
            return aVar;
        }
        newReviewList = listU0;
        i13 = iIntValue;
        i14 = i12;
        List list5 = f2Var.f49711b;
        boolean z16 = !list5.isEmpty();
        List list6 = f2Var.f49710a;
        List list7 = f2Var.f49713d;
        boolean z17 = f2Var.f49714e;
        boolean z18 = f2Var.f49717h;
        kotlin.jvm.internal.m.f(newReviewList, "newReviewList");
        kotlin.jvm.internal.m.f(currentFlashCardPracticeMode, "currentFlashCardPracticeMode");
        return new f2(list6, newReviewList, list5, list7, z17, z12, currentFlashCardPracticeMode, z18, i11, zBooleanValue, i13, i14, z16);
    }
}
