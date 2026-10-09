package bh;

import b0.i2;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.lingoskill.ui.base.NewsFeedWebActivity;
import com.lingodeer.data.model.LearnProgress;
import fr.v1;
import java.util.List;
import rt.b4;
import rt.ja;
import rt.uf;
import rt.y9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f4248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4249e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(v1 v1Var, boolean z11, vy.d dVar) {
        super(2, dVar);
        this.f4245a = 4;
        this.f4249e = v1Var;
        this.f4247c = z11;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f4245a) {
            case 0:
                return new j0(this.f4247c, (a1) this.f4248d, (LearnProgress) this.f4249e, dVar, 0);
            case 1:
                return new j0((NewsFeedWebActivity) this.f4248d, this.f4247c, (String) this.f4249e, dVar, 1);
            case 2:
                j0 j0Var = new j0(this.f4247c, (b0.d) this.f4249e, dVar);
                j0Var.f4248d = obj;
                return j0Var;
            case 3:
                return new j0((CourseTestIndexActivity) this.f4248d, (uf) this.f4249e, this.f4247c, dVar, 3);
            case 4:
                j0 j0Var2 = new j0((v1) this.f4249e, this.f4247c, dVar);
                j0Var2.f4248d = obj;
                return j0Var2;
            case 5:
                return new j0((b0.d) this.f4248d, this.f4247c, (i2) this.f4249e, dVar, 5);
            case 6:
                return new j0(this.f4247c, (List) this.f4248d, (l1.a1) this.f4249e, dVar, 6);
            case 7:
                return new j0(this.f4247c, (kr.g0) this.f4248d, (kr.d0) this.f4249e, dVar, 7);
            case 8:
                return new j0(this.f4247c, (e2.v) this.f4248d, (z2.i2) this.f4249e, dVar, 8);
            case 9:
                return new j0((b4) this.f4248d, (rt.m0) this.f4249e, this.f4247c, dVar, 9);
            case 10:
                return new j0((y9) this.f4248d, (ja) this.f4249e, this.f4247c, dVar, 10);
            case 11:
                return new j0(this.f4247c, (b0.d) this.f4248d, (fz.a) this.f4249e, dVar, 11);
            default:
                return new j0((zu.q) this.f4248d, (zu.j) this.f4249e, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f4245a) {
            case 0:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((j0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((j0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x027c A[Catch: Exception -> 0x022d, all -> 0x029c, PHI: r4
      0x027c: PHI (r4v9 bh.j0) = (r4v8 bh.j0), (r4v8 bh.j0), (r4v0 bh.j0) binds: [B:134:0x0279, B:131:0x026f, B:118:0x0236] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x022d, blocks: (B:112:0x0229, B:118:0x0236, B:136:0x027c, B:119:0x023a, B:128:0x0264, B:130:0x0269, B:133:0x0272, B:122:0x0241), top: B:322:0x021e }] */
    /* JADX WARN: Code duplicated, block: B:357:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9 A[Catch: Exception -> 0x015c, all -> 0x01c9, PHI: r4
      0x01a9: PHI (r4v15 bh.j0) = (r4v14 bh.j0), (r4v14 bh.j0), (r4v0 bh.j0) binds: [B:78:0x01a6, B:75:0x019d, B:62:0x0165] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #2 {Exception -> 0x015c, blocks: (B:56:0x0158, B:62:0x0165, B:80:0x01a9, B:63:0x0169, B:72:0x0193, B:74:0x0197, B:77:0x01a0, B:66:0x0170), top: B:323:0x014e }] */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0286, code lost:
    
        if (r13 == r15) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b3, code lost:
    
        if (r13 == r15) goto L82;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bh.j0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, Object obj2, boolean z11, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4245a = i11;
        this.f4248d = obj;
        this.f4249e = obj2;
        this.f4247c = z11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(Object obj, boolean z11, Object obj2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4245a = i11;
        this.f4248d = obj;
        this.f4247c = z11;
        this.f4249e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(zu.q qVar, zu.j jVar, vy.d dVar) {
        super(2, dVar);
        this.f4245a = 12;
        this.f4248d = qVar;
        this.f4249e = jVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(boolean z11, b0.d dVar, vy.d dVar2) {
        super(2, dVar2);
        this.f4245a = 2;
        this.f4247c = z11;
        this.f4249e = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(boolean z11, Object obj, Object obj2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f4245a = i11;
        this.f4247c = z11;
        this.f4248d = obj;
        this.f4249e = obj2;
    }
}
