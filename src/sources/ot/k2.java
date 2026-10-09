package ot;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class k2 extends xy.i implements fz.e {
    public List H;
    public int K;
    public final /* synthetic */ l2 L;
    public final /* synthetic */ List M;
    public final /* synthetic */ long N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f45871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f45872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f45874d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public l2 f45875e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Collection f45876f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Iterator f45877t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(l2 l2Var, List list, long j11, vy.d dVar) {
        super(2, dVar);
        this.L = l2Var;
        this.M = list;
        this.N = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new k2(this.L, this.M, this.N, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((k2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0078 A[Catch: Exception -> 0x001e, TryCatch #0 {Exception -> 0x001e, blocks: (B:7:0x0015, B:29:0x010e, B:30:0x0116, B:32:0x011c, B:35:0x012c, B:37:0x0130, B:39:0x0136, B:41:0x013c, B:42:0x016b, B:43:0x0179, B:45:0x017f, B:47:0x018e, B:48:0x0192, B:50:0x0199, B:56:0x01b3, B:57:0x01b7, B:14:0x003d, B:24:0x00c6, B:18:0x0072, B:20:0x0078, B:25:0x00ce, B:17:0x0052, B:51:0x01a3, B:53:0x01ae), top: B:62:0x000b, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x00be  */
    /* JADX WARN: Code duplicated, block: B:23:0x00bf  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00bf -> B:24:0x00c6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.k2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
