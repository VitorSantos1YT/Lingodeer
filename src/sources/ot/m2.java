package ot;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m2 extends xy.i implements fz.e {
    public int H;
    public final /* synthetic */ List K;
    public final /* synthetic */ o2 L;
    public final /* synthetic */ long M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f45900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o2 f45901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f45902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Iterator f45903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f45904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45905f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45906t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(long j11, List list, o2 o2Var, vy.d dVar) {
        super(2, dVar);
        this.K = list;
        this.L = o2Var;
        this.M = j11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new m2(this.M, this.K, this.L, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m2) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x005d  */
    /* JADX WARN: Code duplicated, block: B:17:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:20:0x00db  */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009c, code lost:
    
        if (r5 == r1) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x009c -> B:16:0x009f). Please report as a decompilation issue!!! */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.m2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
