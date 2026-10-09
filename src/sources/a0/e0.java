package a0;

import android.app.job.JobParameters;
import android.content.Context;
import android.view.MenuItem;
import b0.h2;
import bp.r2;
import com.google.api.Service;
import com.lingo.lingoskill.ui.base.NewsFeedWebActivity;
import com.lingo.lingoskill.ui.base.UpdateLessonActivity;
import com.lingo.notification.UnifiedNotificationJobService;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.LoginHistory;
import f0.g2;
import f0.i2;
import l1.b3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f62a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f63b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f64c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f65d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f66e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f62a = i11;
        this.f65d = obj;
        this.f66e = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r5.invoke(r1, r4) == r0) goto L15;
     */
    /* JADX WARN: Type inference failed for: r5v6, types: [fz.e, xy.i] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r5) {
        /*
            r4 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r4.f63b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            com.bumptech.glide.e.F(r5)
            goto L47
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            java.lang.Object r1 = r4.f64c
            rz.b0 r1 = (rz.b0) r1
            com.bumptech.glide.e.F(r5)
            goto L37
        L20:
            com.bumptech.glide.e.F(r5)
            java.lang.Object r5 = r4.f64c
            r1 = r5
            rz.b0 r1 = (rz.b0) r1
            java.lang.Object r5 = r4.f65d
            rz.g1 r5 = (rz.g1) r5
            r4.f64c = r1
            r4.f63b = r3
            java.lang.Object r5 = r5.join(r4)
            if (r5 != r0) goto L37
            goto L46
        L37:
            java.lang.Object r5 = r4.f66e
            xy.i r5 = (xy.i) r5
            r3 = 0
            r4.f64c = r3
            r4.f63b = r2
            java.lang.Object r5 = r5.invoke(r1, r4)
            if (r5 != r0) goto L47
        L46:
            return r0
        L47:
            qy.b0 r5 = qy.b0.f48488a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e0.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r1v22, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r2v13, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f62a) {
            case 0:
                e0 e0Var = new e0(0, (b0.c2) this.f65d, (l1.b1) this.f66e, dVar);
                e0Var.f64c = obj;
                return e0Var;
            case 1:
                return new e0(1, (String) this.f65d, (aq.b) this.f66e, dVar);
            case 2:
                return new e0((h2) this.f66e, dVar, 2);
            case 3:
                e0 e0Var2 = new e0((bh.a1) this.f66e, dVar, 3);
                e0Var2.f64c = obj;
                return e0Var2;
            case 4:
                e0 e0Var3 = new e0(4, (r2) this.f65d, (LoginHistory) this.f66e, dVar);
                e0Var3.f64c = obj;
                return e0Var3;
            case 5:
                return new e0(5, (NewsFeedWebActivity) this.f65d, (MenuItem) this.f66e, dVar);
            case 6:
                return new e0((UpdateLessonActivity) this.f66e, dVar, 6);
            case 7:
                return new e0((jt.u) this.f64c, (fz.c) this.f65d, (l1.b1) this.f66e, dVar, 7);
            case 8:
                return new e0((jt.h0) this.f64c, (fz.c) this.f65d, (l1.b1) this.f66e, dVar, 8);
            case 9:
                return new e0((jt.k0) this.f64c, (fz.c) this.f65d, (l1.b1) this.f66e, dVar, 9);
            case 10:
                return new e0((jt.l0) this.f64c, (fz.c) this.f65d, (l1.b1) this.f66e, dVar, 10);
            case 11:
                return new e0((jt.s0) this.f64c, (fz.c) this.f65d, (fz.a) this.f66e, dVar, 11);
            case 12:
                return new e0((jt.m1) this.f64c, (CourseSentence) this.f65d, (fz.c) this.f66e, dVar, 12);
            case 13:
                return new e0((jt.q1) this.f64c, (fz.c) this.f65d, (l1.b1) this.f66e, dVar, 13);
            case 14:
                return new e0((h0.i) this.f64c, (h0.k) this.f65d, (d0.z) this.f66e, dVar, 14);
            case 15:
                return new e0((h0.i) this.f64c, (h0.h) this.f65d, (rz.q0) this.f66e, dVar, 15);
            case 16:
                e0 e0Var4 = new e0(16, (b3) this.f65d, (b0.d) this.f66e, dVar);
                e0Var4.f64c = obj;
                return e0Var4;
            case 17:
                return new e0((xq.c) this.f64c, (Context) this.f65d, (e6.c) this.f66e, dVar, 17);
            case 18:
                return new e0((UnifiedNotificationJobService) this.f64c, (er.e) this.f65d, (JobParameters) this.f66e, dVar, 18);
            case 19:
                return new e0((fz.c) this.f64c, (et.o) this.f65d, (CourseSentence) this.f66e, dVar, 19);
            case 20:
                return new e0(this.f63b, (jt.v) this.f64c, (rz.b0) this.f65d, (l0.w) this.f66e, dVar);
            case 21:
                return new e0((f0.k) this.f64c, (d0.l1) this.f65d, (e0) this.f66e, dVar, 21);
            case 22:
                e0 e0Var5 = new e0(22, (f0.n) this.f65d, (fz.e) this.f66e, dVar);
                e0Var5.f64c = obj;
                return e0Var5;
            case 23:
                return new e0((f0.n) this.f64c, (d0.l1) this.f65d, (fz.e) this.f66e, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                e0 e0Var6 = new e0(24, (f0.m0) this.f65d, (f0.r0) this.f66e, dVar);
                e0Var6.f64c = obj;
                return e0Var6;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                e0 e0Var7 = new e0(25, (f0.m0) this.f65d, (i2) this.f66e, dVar);
                e0Var7.f64c = obj;
                return e0Var7;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                e0 e0Var8 = new e0(26, (i2) this.f65d, (fz.e) this.f66e, dVar);
                e0Var8.f64c = obj;
                return e0Var8;
            case 27:
                return new e0((fz.f) this.f64c, (f0.l1) this.f65d, (s2.t) this.f66e, dVar);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                e0 e0Var9 = new e0((rz.g1) this.f65d, (fz.e) this.f66e, dVar);
                e0Var9.f64c = obj;
                return e0Var9;
            default:
                e0 e0Var10 = new e0((fz.e) this.f65d, (a4.i) this.f66e, dVar);
                e0Var10.f64c = obj;
                return e0Var10;
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f62a) {
            case 0:
                return ((e0) create((l1.s1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((e0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                e0 e0Var = (e0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                e0Var.invokeSuspend(b0Var);
                return b0Var;
            case 21:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((e0) create((f0.n1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((e0) create((f0.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((e0) create((g2) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((e0) create((f0.n1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((e0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x045d, code lost:
    
        if (r3.a(r0, r41) == r2) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0861, code lost:
    
        if (((fr.o0) r0).N(r2, r41) == r3) goto L383;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v100, types: [er.e] */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v145 */
    /* JADX WARN: Type inference failed for: r0v146 */
    /* JADX WARN: Type inference failed for: r2v128, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r3v101, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r3v40, types: [java.lang.Object, qy.h] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, qy.h] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r42) {
        /*
            Method dump skipped, instruction units count: 2868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(int i11, jt.v vVar, rz.b0 b0Var, l0.w wVar, vy.d dVar) {
        super(2, dVar);
        this.f62a = 20;
        this.f63b = i11;
        this.f64c = vVar;
        this.f65d = b0Var;
        this.f66e = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(fz.e eVar, a4.i iVar, vy.d dVar) {
        super(2, dVar);
        this.f62a = 29;
        this.f65d = (xy.i) eVar;
        this.f66e = iVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(fz.f fVar, f0.l1 l1Var, s2.t tVar, vy.d dVar) {
        super(2, dVar);
        this.f62a = 27;
        this.f64c = (xy.i) fVar;
        this.f65d = l1Var;
        this.f66e = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f62a = i11;
        this.f64c = obj;
        this.f65d = obj2;
        this.f66e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f62a = i11;
        this.f66e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e0(rz.g1 g1Var, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f62a = 28;
        this.f65d = g1Var;
        this.f66e = (xy.i) eVar;
    }
}
