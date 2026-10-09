package bh;

import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseSentenceModel050;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends xy.i implements fz.e {
    public Iterator H;
    public Collection K;
    public Object L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public long S;
    public long T;
    public long U;
    public int V;
    public final /* synthetic */ long W;
    public final /* synthetic */ t X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f4238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CourseSentenceModel050 f4239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CourseSentence f4240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CourseSentenceModel050 f4241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f4242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f4243f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f4244t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j11, t tVar, vy.d dVar) {
        super(2, dVar);
        this.W = j11;
        this.X = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new j(this.W, this.X, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:38:0x0230  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0230 -> B:39:0x0240). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0329 -> B:57:0x033c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r66) {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
