package gu;

import java.util.List;
import qy.b0;
import uz.j;
import xy.i;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends i implements fz.e {
    public /* synthetic */ Object H;
    public final /* synthetic */ f K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f29850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f29851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f29854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29855f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29856t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, vy.d dVar) {
        super(2, dVar);
        this.K = fVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        e eVar = new e(this.K, dVar);
        eVar.H = obj;
        return eVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((j) obj, (vy.d) obj2)).invokeSuspend(b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:28:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x0117  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0132, code lost:
    
        if (r3.emit((com.lingodeer.data.model.DayStreakStatus) r2, r19) == r4) goto L36;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
