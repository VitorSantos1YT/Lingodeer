package jt;

import android.content.Context;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseUnit;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final class m extends xy.i implements fz.e {
    public Object H;
    public Object K;
    public Object L;
    public /* synthetic */ Object M;
    public final /* synthetic */ Object N;
    public final /* synthetic */ Object O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37038a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f37041d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f37042e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Serializable f37043f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f37044t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CourseUnit courseUnit, wt.m mVar, vy.d dVar) {
        super(2, dVar);
        this.N = courseUnit;
        this.O = mVar;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f37038a) {
            case 0:
                return new m((g) this.f37042e, this.f37039b, (List) this.H, (rz.b0) this.K, (String) this.f37043f, (String) this.f37044t, this.f37041d, (CourseSentence) this.L, (vt.n0) this.M, (av.i) this.N, (Context) this.O, dVar);
            default:
                m mVar = new m((CourseUnit) this.N, (wt.m) this.O, dVar);
                mVar.M = obj;
                return mVar;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37038a) {
            case 0:
                return ((m) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((m) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0158 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x011b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0123  */
    /* JADX WARN: Code duplicated, block: B:46:0x0137  */
    /* JADX WARN: Code duplicated, block: B:51:0x0154  */
    /* JADX WARN: Code duplicated, block: B:56:0x016e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0178  */
    /* JADX WARN: Code duplicated, block: B:60:0x0188  */
    /* JADX WARN: Code duplicated, block: B:69:0x026e  */
    /* JADX WARN: Code duplicated, block: B:76:0x02de  */
    /* JADX WARN: Code duplicated, block: B:78:0x030d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0344  */
    /* JADX WARN: Code duplicated, block: B:84:0x0353  */
    /* JADX WARN: Code duplicated, block: B:86:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:89:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:93:0x0431  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b8, code lost:
    
        if (r2 == r1) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x044c, code lost:
    
        if (r8.emit(r3, r60) == r1) goto L96;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v24 */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.io.Serializable, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Throwable, vy.d] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r61) {
        /*
            Method dump skipped, instruction units count: 1210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jt.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g gVar, String str, List list, rz.b0 b0Var, String str2, String str3, int i11, CourseSentence courseSentence, vt.n0 n0Var, av.i iVar, Context context, vy.d dVar) {
        super(2, dVar);
        this.f37042e = gVar;
        this.f37039b = str;
        this.H = list;
        this.K = b0Var;
        this.f37043f = str2;
        this.f37044t = str3;
        this.f37041d = i11;
        this.L = courseSentence;
        this.M = n0Var;
        this.N = iVar;
        this.O = context;
    }
}
