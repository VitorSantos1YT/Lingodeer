package ot;

import com.lingodeer.data.model.TestModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m1 extends xy.i implements fz.e {
    public int H;
    public int K;
    public int L;
    public final /* synthetic */ List M;
    public final /* synthetic */ ArrayList N;
    public final /* synthetic */ o1 O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f45893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TestModel f45894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ht.o f45895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o1 f45896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Collection f45897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Iterator f45898f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f45899t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(List list, ArrayList arrayList, o1 o1Var, vy.d dVar) {
        super(2, dVar);
        this.M = list;
        this.N = arrayList;
        this.O = o1Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        return new m1(this.M, this.N, this.O, dVar);
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:345:0x1051  */
    /* JADX WARN: Code duplicated, block: B:348:0x106f A[PHI: r2 r4 r5 r6 r10
      0x106f: PHI (r2v41 com.lingodeer.data.model.TestModel) = (r2v4 com.lingodeer.data.model.TestModel), (r2v137 com.lingodeer.data.model.TestModel) binds: [B:32:0x023c, B:346:0x106b] A[DONT_GENERATE, DONT_INLINE]
      0x106f: PHI (r4v73 ot.o1) = (r4v5 ot.o1), (r4v132 ot.o1) binds: [B:32:0x023c, B:346:0x106b] A[DONT_GENERATE, DONT_INLINE]
      0x106f: PHI (r5v29 java.util.Iterator) = (r5v2 java.util.Iterator), (r5v74 java.util.Iterator) binds: [B:32:0x023c, B:346:0x106b] A[DONT_GENERATE, DONT_INLINE]
      0x106f: PHI (r6v15 java.lang.Object) = (r6v1 java.lang.Object), (r6v73 java.lang.Object) binds: [B:32:0x023c, B:346:0x106b] A[DONT_GENERATE, DONT_INLINE]
      0x106f: PHI (r10v32 java.util.ArrayList) = (r10v2 java.util.ArrayList), (r10v71 java.util.ArrayList) binds: [B:32:0x023c, B:346:0x106b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:350:0x1073  */
    /* JADX WARN: Code duplicated, block: B:358:0x10fb  */
    /* JADX WARN: Code duplicated, block: B:367:0x1163  */
    /* JADX WARN: Code duplicated, block: B:373:0x1157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:374:0x0c5c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x027c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0287  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:162:0x07d4 -> B:35:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:176:0x082f -> B:35:0x0276). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x02cc -> B:52:0x02d0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r71) {
        /*
            Method dump skipped, instruction units count: 4586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ot.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
