package dr;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kr.l1;
import rz.b0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends xy.i implements fz.e {
    public int H;
    public int K;
    public int L;
    public Object M;
    public Object N;
    public Object O;
    public Collection P;
    public final /* synthetic */ Object Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f23503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f23504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f23505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f23506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23507f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f23508t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f23502a = i11;
        this.Q = obj;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f23502a) {
            case 0:
                return new a((f) this.Q, dVar, 0);
            default:
                return new a((l1) this.Q, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f23502a) {
            case 0:
                break;
        }
        return ((a) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x041b A[LOOP:2: B:98:0x0415->B:100:0x041b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:118:0x0502  */
    /* JADX WARN: Code duplicated, block: B:85:0x0331  */
    /* JADX WARN: Code duplicated, block: B:88:0x0372  */
    /* JADX WARN: Code duplicated, block: B:92:0x0397 A[LOOP:3: B:90:0x0391->B:92:0x0397, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x03fa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x017f -> B:126:0x0185). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0199 -> B:38:0x0196). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x03fa -> B:97:0x0404). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r53) {
        /*
            Method dump skipped, instruction units count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
