package js;

import com.lingodeer.data.model.chinesetone.ChineseToneLesson;
import com.lingodeer.data.model.chinesetone.ChineseToneUnit;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends xy.i implements fz.e {
    public int H;
    public int K;
    public int L;
    public final /* synthetic */ i M;
    public final /* synthetic */ ChineseToneLesson N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f36763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f36764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ChineseToneUnit f36765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public i f36766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f36767e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f36768f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f36769t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ChineseToneLesson chineseToneLesson, vy.d dVar) {
        super(2, dVar);
        this.M = iVar;
        this.N = chineseToneLesson;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new h(this.M, this.N, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x00df  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:27:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:33:0x0101 A[PHI: r14 r16
      0x0101: PHI (r14v7 long) = (r14v5 long), (r14v8 long) binds: [B:31:0x00fd, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]
      0x0101: PHI (r16v4 long) = (r16v2 long), (r16v5 long) binds: [B:31:0x00fd, B:12:0x0084] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0229  */
    /* JADX WARN: Code duplicated, block: B:85:0x0261  */
    /* JADX WARN: Code duplicated, block: B:95:0x02b9 A[PHI: r14
      0x02b9: PHI (r14v23 long) = (r14v5 long), (r14v24 long) binds: [B:29:0x00f0, B:94:0x02b8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:98:0x02d2 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x01f8 -> B:73:0x01fe). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x0261 -> B:86:0x0263). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: js.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
