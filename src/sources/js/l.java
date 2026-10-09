package js;

import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import java.util.List;
import w9.g0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class l extends xy.i implements fz.e {
    public /* synthetic */ Object H;
    public Object K;
    public Object L;
    public final /* synthetic */ Object M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36785a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f36786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f36787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f36788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36790f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36791t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ChineseToneLesson chineseToneLesson, r rVar, vy.d dVar) {
        super(2, dVar);
        this.M = chineseToneLesson;
        this.L = rVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f36785a) {
            case 0:
                l lVar = new l((ChineseToneLesson) this.M, (r) this.L, dVar);
                lVar.H = obj;
                return lVar;
            case 1:
                l lVar2 = new l((List) this.L, (o20.w) this.M, dVar);
                lVar2.H = obj;
                return lVar2;
            default:
                return new l((w9.j[]) this.f36787c, (g0) this.H, (w9.x) this.M, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36785a) {
            case 0:
                return ((l) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((l) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((l) create((y9.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x02ec A[Catch: Exception -> 0x032e, TryCatch #0 {Exception -> 0x032e, blocks: (B:76:0x0255, B:79:0x0270, B:108:0x030f, B:103:0x02e6, B:105:0x02ec, B:111:0x0317, B:110:0x0313, B:82:0x027e, B:87:0x028c, B:92:0x029a, B:98:0x02aa, B:100:0x02b1, B:102:0x02d6, B:101:0x02c0), top: B:119:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x030e  */
    /* JADX WARN: Code duplicated, block: B:110:0x0313 A[Catch: Exception -> 0x032e, TryCatch #0 {Exception -> 0x032e, blocks: (B:76:0x0255, B:79:0x0270, B:108:0x030f, B:103:0x02e6, B:105:0x02ec, B:111:0x0317, B:110:0x0313, B:82:0x027e, B:87:0x028c, B:92:0x029a, B:98:0x02aa, B:100:0x02b1, B:102:0x02d6, B:101:0x02c0), top: B:119:0x0240 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x030c -> B:108:0x030f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:29:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0136 -> B:46:0x013a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: js.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(List list, o20.w wVar, vy.d dVar) {
        super(2, dVar);
        this.L = list;
        this.M = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w9.j[] jVarArr, g0 g0Var, w9.x xVar, vy.d dVar) {
        super(2, dVar);
        this.f36787c = jVarArr;
        this.H = g0Var;
        this.M = xVar;
    }
}
