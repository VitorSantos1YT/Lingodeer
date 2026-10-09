package bh;

import com.lingodeer.data.model.CourseSentence;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends xy.i implements fz.e {
    public int H;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public long P;
    public long Q;
    public long R;
    public long S;
    public int T;
    public final /* synthetic */ long U;
    public final /* synthetic */ t V;
    public Object W;
    public Object X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f4256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CourseSentence f4257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f4258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f4259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f4260f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f4261t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(long j11, t tVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4255a = i11;
        this.U = j11;
        this.V = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4255a) {
            case 0:
                return new k(this.U, this.V, dVar, 0);
            default:
                return new k(this.U, this.V, dVar, 1);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4255a) {
            case 0:
                break;
        }
        return ((k) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x0450  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01ec -> B:39:0x01f9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0450 -> B:88:0x045d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 1236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
