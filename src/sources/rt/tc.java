package rt;

import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.LearnProgress;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class tc extends xy.i implements fz.f {
    public final /* synthetic */ long H;
    public final /* synthetic */ String K;
    public uz.j L;
    public LearnProgress M;
    public boolean N;
    public int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ uz.j f50444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f50445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoursePracticeType f50446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dd f50447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f50448f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ List f50449t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc(vy.d dVar, CoursePracticeType coursePracticeType, dd ddVar, int i11, List list, long j11, String str) {
        super(3, dVar);
        this.f50446d = coursePracticeType;
        this.f50447e = ddVar;
        this.f50448f = i11;
        this.f50449t = list;
        this.H = j11;
        this.K = str;
    }

    @Override // fz.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        tc tcVar = new tc((vy.d) obj3, this.f50446d, this.f50447e, this.f50448f, this.f50449t, this.H, this.K);
        tcVar.f50444b = (uz.j) obj;
        tcVar.f50445c = obj2;
        return tcVar.invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e6  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x011b, code lost:
    
        if (uz.x0.q(r14, r0, r13) == r9) goto L33;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt.tc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
