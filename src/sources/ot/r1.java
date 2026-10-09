package ot;

import com.lingodeer.data.model.CoursePracticeType;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class r1 extends xy.i implements fz.e {
    public final /* synthetic */ LinkedHashMap H;
    public final /* synthetic */ s1 K;
    public final /* synthetic */ CoursePracticeType L;
    public final /* synthetic */ List M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f45968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f45969c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f45970d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f45971e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f45972f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f45973t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(long j11, int i11, long j12, int i12, boolean z11, boolean z12, LinkedHashMap linkedHashMap, s1 s1Var, CoursePracticeType coursePracticeType, List list, vy.d dVar) {
        super(2, dVar);
        this.f45968b = j11;
        this.f45969c = i11;
        this.f45970d = j12;
        this.f45971e = i12;
        this.f45972f = z11;
        this.f45973t = z12;
        this.H = linkedHashMap;
        this.K = s1Var;
        this.L = coursePracticeType;
        this.M = list;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new r1(this.f45968b, this.f45969c, this.f45970d, this.f45971e, this.f45972f, this.f45973t, this.H, this.K, this.L, this.M, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((r1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f45967a;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        if (this.f45968b != -1) {
            String str = this.f45969c + ":" + this.f45970d + ":" + this.f45971e + ":" + this.f45972f;
            boolean z11 = this.f45973t;
            LinkedHashMap linkedHashMap = this.H;
            if (z11) {
                linkedHashMap.put(str, new Integer(1));
            } else {
                linkedHashMap.put(str, new Integer(-1));
            }
            this.f45967a = 1;
            yz.f fVar = rz.o0.f50940a;
            Object objM = rz.e0.M(yz.e.f58387a, new mr.a(this.f45968b, this.M, this.H, this.K, this.L, null), this);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }
}
