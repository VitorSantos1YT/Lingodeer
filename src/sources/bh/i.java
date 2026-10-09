package bh;

import com.lingodeer.data.model.CourseSentence;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends xy.i implements fz.e {
    public int H;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public long P;
    public long Q;
    public long R;
    public int S;
    public final /* synthetic */ long T;
    public final /* synthetic */ t U;
    public Object V;
    public Object W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f4228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CourseSentence f4229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f4230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f4231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f4232f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f4233t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(long j11, t tVar, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4227a = i11;
        this.T = j11;
        this.U = tVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4227a) {
            case 0:
                return new i(this.T, this.U, dVar, 0);
            case 1:
                return new i(this.T, this.U, dVar, 1);
            case 2:
                return new i(this.T, this.U, dVar, 2);
            case 3:
                return new i(this.T, this.U, dVar, 3);
            default:
                return new i(this.T, this.U, dVar, 4);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        rz.b0 b0Var = (rz.b0) obj;
        vy.d dVar = (vy.d) obj2;
        switch (this.f4227a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((i) create(b0Var, dVar)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:236:0x0a8a  */
    /* JADX WARN: Code duplicated, block: B:239:0x0adf  */
    /* JADX WARN: Code duplicated, block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x0657 -> B:140:0x0662). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:189:0x089c -> B:190:0x08a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:239:0x0adf -> B:240:0x0aea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x01cd -> B:40:0x01d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0412 -> B:90:0x041d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r52) {
        /*
            Method dump skipped, instruction units count: 2924
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
