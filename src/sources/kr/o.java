package kr;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class o extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f38546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f38548d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(List list, long j11, Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38545a = i11;
        this.f38546b = list;
        this.f38547c = j11;
        this.f38548d = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38545a) {
            case 0:
                return new o(this.f38546b, this.f38547c, (i) this.f38548d, dVar, 0);
            default:
                return new o(this.f38546b, this.f38547c, (z0) this.f38548d, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f38545a) {
            case 0:
                break;
        }
        return ((o) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    @Override // xy.a
    public final Object invokeSuspend(Object obj) {
        int i11 = this.f38545a;
        Object obj2 = this.f38548d;
        long j11 = this.f38547c;
        long jB = 0;
        List<String> list = this.f38546b;
        switch (i11) {
            case 0:
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                long jB2 = 0;
                for (String str : list) {
                    int[] iArr = bq.r.f4959a;
                    jB2 += bq.m.B(str);
                }
                float f5 = j11;
                for (String str2 : list.subList(0, ((i) obj2).f38494d)) {
                    int[] iArr2 = bq.r.f4959a;
                    jB += bq.m.B(str2);
                }
                return new Float((f5 + jB) / jB2);
            default:
                wy.a aVar2 = wy.a.COROUTINE_SUSPENDED;
                com.bumptech.glide.e.F(obj);
                long jB3 = 0;
                for (String str3 : list) {
                    int[] iArr3 = bq.r.f4959a;
                    jB3 += bq.m.B(str3);
                }
                float f11 = j11;
                for (String str4 : list.subList(0, ((Number) ((z0) obj2).K.getValue()).intValue())) {
                    int[] iArr4 = bq.r.f4959a;
                    jB += bq.m.B(str4);
                }
                return new Float((f11 + jB) / jB3);
        }
    }
}
