package wt;

import com.lingodeer.data.model.CourseUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends xy.i implements fz.e {
    public vt.n0 H;
    public Iterator K;
    public CourseUnit L;
    public String M;
    public List N;
    public String O;
    public Collection P;
    public Iterator Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public long Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f55256a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public /* synthetic */ Object f55257a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f55258b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final /* synthetic */ vt.i0 f55259b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public kotlin.jvm.internal.w f55260c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final /* synthetic */ m f55261c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.w f55262d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final /* synthetic */ vt.n0 f55263d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public kotlin.jvm.internal.w f55264e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f55265f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public m f55266t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(vt.i0 i0Var, m mVar, vt.n0 n0Var, vy.d dVar) {
        super(2, dVar);
        this.f55259b0 = i0Var;
        this.f55261c0 = mVar;
        this.f55263d0 = n0Var;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        f fVar = new f(this.f55259b0, this.f55261c0, this.f55263d0, dVar);
        fVar.f55257a0 = obj;
        return fVar;
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:104:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:128:0x01c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0176  */
    /* JADX WARN: Code duplicated, block: B:39:0x017e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0186  */
    /* JADX WARN: Code duplicated, block: B:43:0x0196  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:59:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:97:0x0453  */
    /* JADX WARN: Code duplicated, block: B:99:0x0498 A[LOOP:2: B:98:0x0496->B:99:0x0498, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v44, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v77 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, uz.j] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r75v1 */
    /* JADX WARN: Type inference failed for: r75v11 */
    /* JADX WARN: Type inference failed for: r75v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x037a -> B:12:0x0074). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r75) {
        /*
            Method dump skipped, instruction units count: 1355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
