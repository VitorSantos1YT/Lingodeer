package b0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import app.rive.runtime.kotlin.RiveAnimationView;
import app.rive.runtime.kotlin.controllers.RiveFileController;
import com.google.api.Service;
import com.lingo.course.ui.CourseTestIndexActivity;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.speak.adapter.SpeakTryAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseLesson;
import com.lingodeer.data.model.CourseLessonPracticeType;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.database.UserDataDatabase;
import com.lingodeer.network.model.SearchUser;
import com.yalantis.ucrop.view.CropImageView;
import f0.v2;
import fr.x4;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3737f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f3738t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i11, Object obj, Object obj2, Object obj3, Object obj4, vy.d dVar, boolean z11) {
        super(2, dVar);
        this.f3732a = i11;
        this.f3736e = obj;
        this.f3737f = obj2;
        this.f3734c = obj3;
        this.f3738t = obj4;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0105  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e3, code lost:
    
        if (oi.c.b(r1, r13) == r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        if (r2.c(r13) == r3) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.x0.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:55:0x012e A[Catch: Exception -> 0x021a, TryCatch #0 {Exception -> 0x021a, blocks: (B:7:0x0022, B:64:0x018a, B:66:0x0191, B:69:0x0199, B:70:0x019d, B:72:0x01a3, B:12:0x0039, B:53:0x0126, B:55:0x012e, B:57:0x013e, B:58:0x014c, B:60:0x015f, B:61:0x017a, B:15:0x0044, B:46:0x00e7, B:48:0x00f3, B:50:0x00f6, B:18:0x004f, B:75:0x01b1, B:77:0x01bd, B:79:0x01cc, B:80:0x01d0, B:82:0x01d6, B:84:0x01d9, B:94:0x0215, B:87:0x01e0, B:89:0x01e7, B:91:0x020f, B:21:0x0066, B:24:0x006e, B:35:0x0089, B:37:0x009a, B:39:0x00aa, B:40:0x00ae, B:42:0x00be, B:43:0x00d9, B:27:0x0075, B:30:0x007c, B:33:0x0083), top: B:100:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x013e A[Catch: Exception -> 0x021a, LOOP:1: B:56:0x013c->B:57:0x013e, LOOP_END, TryCatch #0 {Exception -> 0x021a, blocks: (B:7:0x0022, B:64:0x018a, B:66:0x0191, B:69:0x0199, B:70:0x019d, B:72:0x01a3, B:12:0x0039, B:53:0x0126, B:55:0x012e, B:57:0x013e, B:58:0x014c, B:60:0x015f, B:61:0x017a, B:15:0x0044, B:46:0x00e7, B:48:0x00f3, B:50:0x00f6, B:18:0x004f, B:75:0x01b1, B:77:0x01bd, B:79:0x01cc, B:80:0x01d0, B:82:0x01d6, B:84:0x01d9, B:94:0x0215, B:87:0x01e0, B:89:0x01e7, B:91:0x020f, B:21:0x0066, B:24:0x006e, B:35:0x0089, B:37:0x009a, B:39:0x00aa, B:40:0x00ae, B:42:0x00be, B:43:0x00d9, B:27:0x0075, B:30:0x007c, B:33:0x0083), top: B:100:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x015f A[Catch: Exception -> 0x021a, LOOP:2: B:59:0x015d->B:60:0x015f, LOOP_END, TryCatch #0 {Exception -> 0x021a, blocks: (B:7:0x0022, B:64:0x018a, B:66:0x0191, B:69:0x0199, B:70:0x019d, B:72:0x01a3, B:12:0x0039, B:53:0x0126, B:55:0x012e, B:57:0x013e, B:58:0x014c, B:60:0x015f, B:61:0x017a, B:15:0x0044, B:46:0x00e7, B:48:0x00f3, B:50:0x00f6, B:18:0x004f, B:75:0x01b1, B:77:0x01bd, B:79:0x01cc, B:80:0x01d0, B:82:0x01d6, B:84:0x01d9, B:94:0x0215, B:87:0x01e0, B:89:0x01e7, B:91:0x020f, B:21:0x0066, B:24:0x006e, B:35:0x0089, B:37:0x009a, B:39:0x00aa, B:40:0x00ae, B:42:0x00be, B:43:0x00d9, B:27:0x0075, B:30:0x007c, B:33:0x0083), top: B:100:0x001a }] */
    /* JADX WARN: Code duplicated, block: B:96:0x021a  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
    
        if (r3.hasTransport(2) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0187, code lost:
    
        if (r1 == r9) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.x0.j(java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj) {
        l1.b1 b1Var = (l1.b1) this.f3737f;
        l1.b1 b1Var2 = (l1.b1) this.f3735d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3733b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                ((fz.c) ((l1.b1) this.f3736e).getValue()).invoke(Boolean.FALSE);
                b1Var.setValue(Long.valueOf(System.currentTimeMillis()));
                long jLongValue = ((Number) b1Var.getValue()).longValue() - ((Number) ((l1.b1) this.f3734c).getValue()).longValue();
                if (jLongValue < 1300) {
                    this.f3733b = 1;
                    if (rz.e0.m(1300 - jLongValue, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return qy.b0.f48488a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        ((fz.a) ((l1.b1) this.f3738t).getValue()).invoke();
        b1Var2.setValue(Boolean.FALSE);
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (rz.e0.M(r12, r1, r11) == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (rz.e0.M(r12, r0, r11) == r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f3735d
            r2 = r0
            oo.k0 r2 = (oo.k0) r2
            wy.a r8 = wy.a.COROUTINE_SUSPENDED
            int r0 = r11.f3733b
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L24
            if (r0 == r10) goto L1d
            if (r0 != r9) goto L15
            com.bumptech.glide.e.F(r12)
            goto L67
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            com.bumptech.glide.e.F(r12)     // Catch: java.lang.Exception -> L21
            goto L67
        L21:
            r0 = move-exception
            r12 = r0
            goto L51
        L24:
            com.bumptech.glide.e.F(r12)
            java.lang.Object r12 = r11.f3736e
            android.view.View r12 = (android.view.View) r12
            r2.f45691a0 = r12
            yz.f r12 = rz.o0.f50940a     // Catch: java.lang.Exception -> L21
            yz.e r12 = yz.e.f58387a     // Catch: java.lang.Exception -> L21
            ad.x r1 = new ad.x     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r11.f3737f     // Catch: java.lang.Exception -> L21
            r3 = r0
            java.io.File r3 = (java.io.File) r3     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r11.f3734c     // Catch: java.lang.Exception -> L21
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L21
            java.lang.Object r0 = r11.f3738t     // Catch: java.lang.Exception -> L21
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch: java.lang.Exception -> L21
            r6 = 0
            r7 = 26
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L21
            r11.f3733b = r10     // Catch: java.lang.Exception -> L21
            java.lang.Object r12 = rz.e0.M(r12, r1, r11)     // Catch: java.lang.Exception -> L21
            if (r12 != r8) goto L67
            goto L66
        L51:
            r12.getMessage()
            yz.f r12 = rz.o0.f50940a
            sz.c r12 = wz.m.f55536a
            oo.j0 r0 = new oo.j0
            r1 = 0
            r0.<init>(r2, r1, r10)
            r11.f3733b = r9
            java.lang.Object r12 = rz.e0.M(r12, r0, r11)
            if (r12 != r8) goto L67
        L66:
            return r8
        L67:
            qy.b0 r12 = qy.b0.f48488a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.x0.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:50:0x0154 A[Catch: Exception -> 0x003b, CancellationException -> 0x003e, PHI: r5 r6 r10 r11
      0x0154: PHI (r5v12 j$.time.LocalDate) = (r5v10 j$.time.LocalDate), (r5v18 j$.time.LocalDate) binds: [B:48:0x0150, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r6v17 java.lang.Object) = (r6v15 java.lang.Object), (r6v25 java.lang.Object) binds: [B:48:0x0150, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r10v8 j$.time.ZoneId) = (r10v6 j$.time.ZoneId), (r10v10 j$.time.ZoneId) binds: [B:48:0x0150, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x0154: PHI (r11v10 java.util.List) = (r11v7 java.util.List), (r11v18 java.util.List) binds: [B:48:0x0150, B:19:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x003b, blocks: (B:12:0x0036, B:18:0x004d, B:50:0x0154, B:52:0x0160, B:53:0x0165, B:56:0x017b, B:57:0x0184, B:59:0x018a, B:60:0x01aa, B:64:0x01b9, B:66:0x01c9, B:67:0x01cc, B:71:0x01e0, B:21:0x0060, B:43:0x0130, B:44:0x0135, B:47:0x0141, B:22:0x0067, B:28:0x0080, B:29:0x008f, B:31:0x0095, B:32:0x00ac, B:35:0x00c1, B:37:0x00eb, B:39:0x0116, B:38:0x0104, B:25:0x0070), top: B:84:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0160 A[Catch: Exception -> 0x003b, CancellationException -> 0x003e, TryCatch #0 {Exception -> 0x003b, blocks: (B:12:0x0036, B:18:0x004d, B:50:0x0154, B:52:0x0160, B:53:0x0165, B:56:0x017b, B:57:0x0184, B:59:0x018a, B:60:0x01aa, B:64:0x01b9, B:66:0x01c9, B:67:0x01cc, B:71:0x01e0, B:21:0x0060, B:43:0x0130, B:44:0x0135, B:47:0x0141, B:22:0x0067, B:28:0x0080, B:29:0x008f, B:31:0x0095, B:32:0x00ac, B:35:0x00c1, B:37:0x00eb, B:39:0x0116, B:38:0x0104, B:25:0x0070), top: B:84:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:59:0x018a A[Catch: Exception -> 0x003b, CancellationException -> 0x003e, LOOP:0: B:57:0x0184->B:59:0x018a, LOOP_END, TryCatch #0 {Exception -> 0x003b, blocks: (B:12:0x0036, B:18:0x004d, B:50:0x0154, B:52:0x0160, B:53:0x0165, B:56:0x017b, B:57:0x0184, B:59:0x018a, B:60:0x01aa, B:64:0x01b9, B:66:0x01c9, B:67:0x01cc, B:71:0x01e0, B:21:0x0060, B:43:0x0130, B:44:0x0135, B:47:0x0141, B:22:0x0067, B:28:0x0080, B:29:0x008f, B:31:0x0095, B:32:0x00ac, B:35:0x00c1, B:37:0x00eb, B:39:0x0116, B:38:0x0104, B:25:0x0070), top: B:84:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c9 A[Catch: Exception -> 0x003b, CancellationException -> 0x003e, TryCatch #0 {Exception -> 0x003b, blocks: (B:12:0x0036, B:18:0x004d, B:50:0x0154, B:52:0x0160, B:53:0x0165, B:56:0x017b, B:57:0x0184, B:59:0x018a, B:60:0x01aa, B:64:0x01b9, B:66:0x01c9, B:67:0x01cc, B:71:0x01e0, B:21:0x0060, B:43:0x0130, B:44:0x0135, B:47:0x0141, B:22:0x0067, B:28:0x0080, B:29:0x008f, B:31:0x0095, B:32:0x00ac, B:35:0x00c1, B:37:0x00eb, B:39:0x0116, B:38:0x0104, B:25:0x0070), top: B:84:0x0017 }] */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e6, code lost:
    
        if (r3.emit(r5, r18) == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0212, code lost:
    
        if (r3.emit(rt.e2.f49665a, r18) == r4) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Object, java.util.concurrent.CancellationException, rt.n1, rz.z1] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, uz.i1] */
    /* JADX WARN: Type inference failed for: r5v1, types: [rz.q1, rz.z1] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.x0.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        s0.s0 s0Var = (s0.s0) this.f3735d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3733b;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                gp.r rVarK = l1.t.K(new pr.z(6, (l1.b1) this.f3736e));
                d0.g0 g0Var = new d0.g0(s0Var, (o3.x) this.f3737f, (d1.z0) this.f3734c, (o3.j) this.f3738t, 4);
                this.f3733b = 1;
                if (rVarK.collect(g0Var, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            s0.o0.q(s0Var);
            return qy.b0.f48488a;
        } catch (Throwable th2) {
            s0.o0.q(s0Var);
            throw th2;
        }
    }

    private final Object q(Object obj) {
        f2.c cVarB;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3733b;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        p0.c cVar = (p0.c) this.f3735d;
        o3.w wVar = (o3.w) this.f3736e;
        s0.z0 z0Var = ((s0.s0) this.f3737f).f51166a;
        j3.u0 u0Var = ((s0.o1) this.f3734c).f51124a;
        o3.p pVar = (o3.p) this.f3738t;
        this.f3733b = 1;
        int iS = pVar.s(j3.x0.e(wVar.f44705b));
        if (iS < u0Var.f35797a.f35784a.f35700b.length()) {
            cVarB = u0Var.b(iS);
        } else {
            cVarB = iS != 0 ? u0Var.b(iS - 1) : new f2.c(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, (int) (s0.d1.a(z0Var.f51267b, z0Var.f51272g, z0Var.f51273h, s0.d1.f51015a, 1) & 4294967295L));
        }
        Object objA = cVar.a(cVarB, this);
        if (objA != aVar) {
            objA = b0Var;
        }
        return objA == aVar ? aVar : b0Var;
    }

    private final Object r(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        com.bumptech.glide.e.F(obj);
        l1.b1 b1Var = (l1.b1) this.f3735d;
        RiveAnimationView riveAnimationView = (RiveAnimationView) b1Var.getValue();
        if (riveAnimationView != null) {
            int i11 = this.f3733b;
            String str = (String) this.f3736e;
            l1.b1 b1Var2 = (l1.b1) this.f3737f;
            l1.b1 b1Var3 = (l1.b1) this.f3734c;
            kotlin.jvm.internal.y yVar = (kotlin.jvm.internal.y) this.f3738t;
            if (((Number) ((qy.l) b1Var2.getValue()).f48495a).longValue() != -1) {
                String strValueOf = String.valueOf(((Number) ((qy.l) b1Var2.getValue()).f48495a).longValue());
                if (((Number) ((qy.l) b1Var3.getValue()).f48495a).longValue() != ((Number) ((qy.l) b1Var2.getValue()).f48495a).longValue() && ((Number) ((qy.l) b1Var3.getValue()).f48495a).longValue() != -1) {
                    RiveFileController.setNumberState$default(riveAnimationView.getController(), "InLesson", String.valueOf(((Number) ((qy.l) b1Var3.getValue()).f48495a).longValue()), CropImageView.DEFAULT_ASPECT_RATIO, null, 8, null);
                }
                Object obj2 = ((qy.l) b1Var2.getValue()).f48495a;
                Object obj3 = ((qy.l) b1Var2.getValue()).f48496b;
                Objects.toString(obj2);
                Objects.toString(obj3);
                RiveFileController.setNumberState$default(riveAnimationView.getController(), "InLesson", strValueOf, ((Number) ((qy.l) b1Var2.getValue()).f48496b).longValue(), null, 8, null);
                b1Var3.setValue((qy.l) b1Var2.getValue());
            } else {
                if (i11 == R.raw.ld_speakanimation_392_554_pose03_0210) {
                    riveAnimationView.reset();
                } else {
                    com.bumptech.glide.d.d(yVar, b1Var);
                }
                if (str.length() > 0) {
                    riveAnimationView.fireState("InLesson", str);
                }
            }
        }
        return qy.b0.f48488a;
    }

    private final Object s(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3733b;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return obj;
        }
        com.bumptech.glide.e.F(obj);
        gc.i iVar = (gc.i) this.f3735d;
        bc.i iVar2 = new bc.i(iVar, ((vb.i) this.f3736e).f53834g, 0, iVar, (hc.g) this.f3737f, (vb.c) this.f3734c, ((Bitmap) this.f3738t) != null);
        this.f3733b = 1;
        Object objF = iVar2.f(iVar, this);
        return objF == aVar ? aVar : objF;
    }

    private final Object t(Object obj) {
        kotlin.jvm.internal.y yVar;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3733b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
            yVar2.f38361a = vt.w.f54292a;
            vt.r rVar = (vt.r) this.f3736e;
            UserDataDatabase userDataDatabase = rVar.f54281a;
            vt.i iVar = new vt.i((String) this.f3737f, rVar, (String) this.f3734c, (String) this.f3738t, yVar2, null);
            this.f3735d = yVar2;
            this.f3733b = 1;
            if (hz.b.V(userDataDatabase, iVar, this) == aVar) {
                return aVar;
            }
            yVar = yVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yVar = (kotlin.jvm.internal.y) this.f3735d;
            com.bumptech.glide.e.F(obj);
        }
        return yVar.f38361a;
    }

    /* JADX WARN: Type inference failed for: r4v14, types: [fz.f, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3732a) {
            case 0:
                return new x0((f1) this.f3737f, this.f3734c, (c2) this.f3738t, dVar, 0);
            case 1:
                x0 x0Var = new x0((z2.m0) this.f3735d, (fz.c) this.f3736e, (b1.e) this.f3737f, (b1.r) this.f3738t, dVar, 1);
                x0Var.f3734c = obj;
                return x0Var;
            case 2:
                return new x0((CourseTestIndexActivity) this.f3737f, (l1.b1) this.f3734c, (l1.b1) this.f3738t, dVar, 2);
            case 3:
                return new x0((CourseTestIndexActivity) this.f3735d, (CourseLesson) this.f3736e, (CoursePracticeType) this.f3737f, (fz.a) this.f3734c, (CourseLessonPracticeType) this.f3738t, dVar, 3);
            case 4:
                return new x0(4, this.f3736e, this.f3737f, this.f3734c, this.f3738t, dVar, false);
            case 5:
                return new x0((jt.v) this.f3735d, (et.o) this.f3736e, (CoursePracticeType) this.f3737f, this.f3733b, (rz.b0) this.f3734c, (l0.w) this.f3738t, dVar);
            case 6:
                x0 x0Var2 = new x0((v2) this.f3735d, (f0.i) this.f3736e, (f0.d) this.f3737f, (rz.g1) this.f3738t, dVar, 6);
                x0Var2.f3734c = obj;
                return x0Var2;
            case 7:
                x0 x0Var3 = new x0((s2.w) this.f3735d, (fz.f) this.f3736e, (fz.c) this.f3737f, (f0.l1) this.f3738t, dVar);
                x0Var3.f3734c = obj;
                return x0Var3;
            case 8:
                return new x0(8, (SearchUser) this.f3734c, (fr.v1) this.f3738t, dVar);
            case 9:
                return new x0((x4) this.f3738t, dVar, 9);
            case 10:
                return new x0((SpeakTryAdapter) this.f3735d, (View) this.f3736e, (String) this.f3737f, (WaveView) this.f3734c, (FrameLayout) this.f3738t, dVar, 10);
            case 11:
                return new x0((jt.v) this.f3735d, (x1.p) this.f3736e, (av.i) this.f3737f, (rz.b0) this.f3734c, (String) this.f3738t, dVar, 11);
            case 12:
                x0 x0Var4 = new x0((k9.i) this.f3735d, (l1.b1) this.f3736e, (l1.g1) this.f3737f, (l1.b1) this.f3738t, dVar, 12);
                x0Var4.f3734c = obj;
                return x0Var4;
            case 13:
                return new x0((ch.b0) this.f3735d, (String) this.f3736e, (fv.a) this.f3737f, (uv.b) this.f3734c, (String) this.f3738t, dVar, 13);
            case 14:
                x0 x0Var5 = new x0((l1.d2) this.f3736e, (l1.c2) this.f3737f, (l1.w0) this.f3738t, dVar);
                x0Var5.f3734c = obj;
                return x0Var5;
            case 15:
                return new x0(15, (List) this.f3734c, (oi.c) this.f3738t, dVar);
            case 16:
                x0 x0Var6 = new x0((fz.e) this.f3735d, (h2.d) this.f3736e, (rz.b0) this.f3737f, (AtomicReference) this.f3738t, dVar, 16);
                x0Var6.f3734c = obj;
                return x0Var6;
            case 17:
                x0 x0Var7 = new x0((mr.e) this.f3737f, (ArrayList) this.f3738t, dVar);
                x0Var7.f3734c = obj;
                return x0Var7;
            case 18:
                return new x0((l1.b1) this.f3735d, (l1.b1) this.f3736e, (l1.b1) this.f3737f, (l1.b1) this.f3734c, (l1.b1) this.f3738t, dVar, 18);
            case 19:
                return new x0((oo.k0) this.f3735d, (View) this.f3736e, (File) this.f3737f, (String) this.f3734c, (ArrayList) this.f3738t, dVar, 19);
            case 20:
                x0 x0Var8 = new x0((rt.j2) this.f3738t, dVar, 20);
                x0Var8.f3734c = obj;
                return x0Var8;
            case 21:
                return new x0((s0.s0) this.f3735d, (l1.b1) this.f3736e, (o3.x) this.f3737f, (d1.z0) this.f3734c, (o3.j) this.f3738t, dVar, 21);
            case 22:
                return new x0((p0.c) this.f3735d, (o3.w) this.f3736e, (s0.s0) this.f3737f, (s0.o1) this.f3734c, (o3.p) this.f3738t, dVar, 22);
            case 23:
                return new x0((l1.b1) this.f3735d, this.f3733b, (String) this.f3736e, (l1.b1) this.f3737f, (l1.b1) this.f3734c, (kotlin.jvm.internal.y) this.f3738t, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new x0((gc.i) this.f3735d, (vb.i) this.f3736e, (hc.g) this.f3737f, (vb.c) this.f3734c, (Bitmap) this.f3738t, dVar, 24);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new x0(25, this.f3736e, this.f3737f, this.f3734c, this.f3738t, dVar, false);
            default:
                return new x0((zs.f) this.f3735d, (Context) this.f3736e, (Bitmap) this.f3737f, (zs.a) this.f3734c, (zs.c) this.f3738t, dVar, 26);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3732a) {
            case 0:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                x0 x0Var = (x0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                x0Var.invokeSuspend(b0Var);
                return b0Var;
            case 6:
                return ((x0) create((f0.g2) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((x0) create((uz.i) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((x0) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                x0 x0Var2 = (x0) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                x0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((x0) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:337:0x0822  */
    /* JADX WARN: Code duplicated, block: B:420:0x0a18  */
    /* JADX WARN: Code duplicated, block: B:433:0x0a4c  */
    /* JADX WARN: Code duplicated, block: B:439:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:441:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:443:0x0a6f  */
    /* JADX WARN: Code duplicated, block: B:448:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:476:0x0b15 A[PHI: r1 r6 r7
      0x0b15: PHI (r1v12 wy.a) = (r1v4 wy.a), (r1v13 wy.a) binds: [B:474:0x0b12, B:411:0x09c8] A[DONT_GENERATE, DONT_INLINE]
      0x0b15: PHI (r6v9 java.lang.Object) = (r6v2 java.lang.Object), (r6v10 java.lang.Object) binds: [B:474:0x0b12, B:411:0x09c8] A[DONT_GENERATE, DONT_INLINE]
      0x0b15: PHI (r7v6 b0.f1) = (r7v2 b0.f1), (r7v8 b0.f1) binds: [B:474:0x0b12, B:411:0x09c8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:496:0x01ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:519:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:530:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x020b A[Catch: all -> 0x0136, LOOP:1: B:94:0x0209->B:95:0x020b, LOOP_END, TryCatch #5 {all -> 0x0136, blocks: (B:57:0x0131, B:89:0x01f8, B:90:0x01fe, B:92:0x0203, B:93:0x0204, B:95:0x020b, B:96:0x0217, B:113:0x0259, B:114:0x025a, B:91:0x01ff), top: B:493:0x0123, inners: #7 }] */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0b1f, code lost:
    
        if (b0.f1.u0(r7, r31) == r1) goto L478;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r1v118, types: [int] */
    /* JADX WARN: Type inference failed for: r1v119, types: [ui.k] */
    /* JADX WARN: Type inference failed for: r1v137, types: [java.lang.Object, ui.k] */
    /* JADX WARN: Type inference failed for: r1v138, types: [ui.k] */
    /* JADX WARN: Type inference failed for: r1v155 */
    /* JADX WARN: Type inference failed for: r1v156 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v82 */
    /* JADX WARN: Type inference failed for: r2v83, types: [java.lang.Object, rz.g1] */
    /* JADX WARN: Type inference failed for: r2v84 */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93 */
    /* JADX WARN: Type inference failed for: r4v31, types: [java.lang.Object, java.util.Collection] */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instruction units count: 2916
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f3732a = i11;
        this.f3734c = obj;
        this.f3738t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3732a = i11;
        this.f3735d = obj;
        this.f3736e = obj2;
        this.f3737f = obj3;
        this.f3734c = obj4;
        this.f3738t = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, Object obj4, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3732a = i11;
        this.f3735d = obj;
        this.f3736e = obj2;
        this.f3737f = obj3;
        this.f3738t = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3732a = i11;
        this.f3737f = obj;
        this.f3734c = obj2;
        this.f3738t = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3732a = i11;
        this.f3738t = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(jt.v vVar, et.o oVar, CoursePracticeType coursePracticeType, int i11, rz.b0 b0Var, l0.w wVar, vy.d dVar) {
        super(2, dVar);
        this.f3732a = 5;
        this.f3735d = vVar;
        this.f3736e = oVar;
        this.f3737f = coursePracticeType;
        this.f3733b = i11;
        this.f3734c = b0Var;
        this.f3738t = wVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(l1.b1 b1Var, int i11, String str, l1.b1 b1Var2, l1.b1 b1Var3, kotlin.jvm.internal.y yVar, vy.d dVar) {
        super(2, dVar);
        this.f3732a = 23;
        this.f3735d = b1Var;
        this.f3733b = i11;
        this.f3736e = str;
        this.f3737f = b1Var2;
        this.f3734c = b1Var3;
        this.f3738t = yVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(l1.d2 d2Var, l1.c2 c2Var, l1.w0 w0Var, vy.d dVar) {
        super(2, dVar);
        this.f3732a = 14;
        this.f3736e = d2Var;
        this.f3737f = c2Var;
        this.f3738t = w0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(mr.e eVar, ArrayList arrayList, vy.d dVar) {
        super(2, dVar);
        this.f3732a = 17;
        this.f3737f = eVar;
        this.f3738t = arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public x0(s2.w wVar, fz.f fVar, fz.c cVar, f0.l1 l1Var, vy.d dVar) {
        super(2, dVar);
        this.f3732a = 7;
        this.f3735d = wVar;
        this.f3736e = (xy.i) fVar;
        this.f3737f = cVar;
        this.f3738t = l1Var;
    }
}
