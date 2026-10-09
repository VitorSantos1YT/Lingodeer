package ns;

import android.net.Uri;
import com.google.api.Service;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseQuestionPreference;
import com.lingodeer.data.model.CourseQuestionPreferenceContext;
import com.lingodeer.data.model.CourseQuestionPreferenceKt;
import com.lingodeer.data.model.CourseUnit;
import com.yalantis.ucrop.view.CropImageView;
import d1.z0;
import f0.s2;
import g00.t1;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import l1.b1;
import mt.q2;
import n9.e1;
import n9.n1;
import ot.o2;
import rt.a9;
import rt.b4;
import rt.b9;
import rt.c9;
import rt.d9;
import rt.dd;
import rt.e3;
import rt.e9;
import rt.f9;
import rt.fd;
import rt.g9;
import rt.h9;
import rt.hd;
import rt.j2;
import rt.jd;
import rt.l9;
import rt.r5;
import rt.w4;
import uz.i1;
import uz.x0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f43989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f43990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f43987a = i11;
        this.f43989c = obj;
        this.f43990d = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081 A[Catch: CancellationException -> 0x001f, Exception -> 0x00a7, TryCatch #2 {CancellationException -> 0x001f, Exception -> 0x00a7, blocks: (B:8:0x001a, B:33:0x008d, B:34:0x0093, B:14:0x002a, B:30:0x0081, B:15:0x002e, B:27:0x0075, B:16:0x0032, B:22:0x005c, B:24:0x006a, B:19:0x0039), top: B:42:0x0010 }] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r4 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f43989c
            rt.e3 r0 = (rt.e3) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r11.f43988b
            r3 = 7
            qy.b0 r4 = qy.b0.f48488a
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L36
            if (r2 == r9) goto L32
            if (r2 == r8) goto L2e
            if (r2 == r7) goto L2a
            if (r2 != r6) goto L22
            com.bumptech.glide.e.F(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            goto L8d
        L1f:
            r12 = move-exception
            goto Lc1
        L22:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2a:
            com.bumptech.glide.e.F(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            goto L81
        L2e:
            com.bumptech.glide.e.F(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            goto L75
        L32:
            com.bumptech.glide.e.F(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            goto L5c
        L36:
            com.bumptech.glide.e.F(r12)
            wt.b0 r12 = r0.f49668p0     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.lang.Object r2 = r11.f43990d     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.util.List r2 = (java.util.List) r2     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            vt.w0 r12 = r12.f55236a     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            vt.z0 r12 = (vt.z0) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r10 = 900(0x384, float:1.261E-42)
            java.util.ArrayList r2 = ry.m.g1(r2, r10, r10)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            mi.b r10 = new mi.b     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r10.<init>(r2, r12, r5)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            gp.r r12 = new gp.r     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r12.<init>(r10)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r11.f43988b = r9     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.lang.Object r12 = uz.x0.u(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r12 != r1) goto L5c
            goto L8c
        L5c:
            java.util.List r12 = (java.util.List) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            bq.f r2 = r0.A0     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.util.List r12 = r2.s(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            boolean r2 = r12.isEmpty()     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r2 != 0) goto L8d
            wt.b0 r2 = r0.f49668p0     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r11.f43988b = r8     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.lang.Object r12 = r2.l(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r12 != r1) goto L75
            goto L8c
        L75:
            vt.c r12 = r0.f50703b     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r11.f43988b = r7     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            vt.d r12 = (vt.d) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r12.d(r11)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r4 != r1) goto L81
            goto L8c
        L81:
            vt.c r12 = r0.f50703b     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r11.f43988b = r6     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            vt.d r12 = (vt.d) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r12.j(r11)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r4 != r1) goto L8d
        L8c:
            return r1
        L8d:
            bq.f r12 = r0.A0     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.lang.Object r12 = r12.f4945c     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            uz.i1 r12 = (uz.i1) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
        L93:
            java.lang.Object r1 = r12.getValue()     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r2 = r1
            rt.ae r2 = (rt.ae) r2     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            rt.yd r6 = rt.yd.f50728a     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            rt.ae r2 = rt.ae.a(r2, r5, r5, r6, r3)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            boolean r1 = r12.j(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r1 == 0) goto L93
            goto Lc0
        La7:
            bq.f r12 = r0.A0
            java.lang.Object r12 = r12.f4945c
            uz.i1 r12 = (uz.i1) r12
        Lad:
            java.lang.Object r0 = r12.getValue()
            r1 = r0
            rt.ae r1 = (rt.ae) r1
            rt.vd r2 = rt.vd.f50556a
            rt.ae r1 = rt.ae.a(r1, r5, r5, r2, r3)
            boolean r0 = r12.j(r0, r1)
            if (r0 == 0) goto Lad
        Lc0:
            return r4
        Lc1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.j.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081 A[Catch: CancellationException -> 0x001f, Exception -> 0x00a7, TryCatch #2 {CancellationException -> 0x001f, Exception -> 0x00a7, blocks: (B:8:0x001a, B:33:0x008d, B:34:0x0093, B:14:0x002a, B:30:0x0081, B:15:0x002e, B:27:0x0075, B:16:0x0032, B:22:0x005c, B:24:0x006a, B:19:0x0039), top: B:42:0x0010 }] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r4 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f43989c
            rt.b4 r0 = (rt.b4) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r11.f43988b
            r3 = 7
            qy.b0 r4 = qy.b0.f48488a
            r5 = 0
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L36
            if (r2 == r9) goto L32
            if (r2 == r8) goto L2e
            if (r2 == r7) goto L2a
            if (r2 != r6) goto L22
            com.bumptech.glide.e.F(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            goto L8d
        L1f:
            r12 = move-exception
            goto Lc1
        L22:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2a:
            com.bumptech.glide.e.F(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            goto L81
        L2e:
            com.bumptech.glide.e.F(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            goto L75
        L32:
            com.bumptech.glide.e.F(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            goto L5c
        L36:
            com.bumptech.glide.e.F(r12)
            wt.b0 r12 = r0.f49489c     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.lang.Object r2 = r11.f43990d     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.util.List r2 = (java.util.List) r2     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            vt.w0 r12 = r12.f55236a     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            vt.z0 r12 = (vt.z0) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r10 = 900(0x384, float:1.261E-42)
            java.util.ArrayList r2 = ry.m.g1(r2, r10, r10)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            mi.b r10 = new mi.b     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r10.<init>(r2, r12, r5)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            gp.r r12 = new gp.r     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r12.<init>(r10)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r11.f43988b = r9     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.lang.Object r12 = uz.x0.u(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r12 != r1) goto L5c
            goto L8c
        L5c:
            java.util.List r12 = (java.util.List) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            bq.f r2 = r0.f49488b0     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.util.List r12 = r2.s(r12)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            boolean r2 = r12.isEmpty()     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r2 != 0) goto L8d
            wt.b0 r2 = r0.f49489c     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r11.f43988b = r8     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.lang.Object r12 = r2.l(r12, r11)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r12 != r1) goto L75
            goto L8c
        L75:
            vt.c r12 = r0.f49493e     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r11.f43988b = r7     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            vt.d r12 = (vt.d) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r12.d(r11)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r4 != r1) goto L81
            goto L8c
        L81:
            vt.c r12 = r0.f49493e     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r11.f43988b = r6     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            vt.d r12 = (vt.d) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r12.j(r11)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r4 != r1) goto L8d
        L8c:
            return r1
        L8d:
            bq.f r12 = r0.f49488b0     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            java.lang.Object r12 = r12.f4945c     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            uz.i1 r12 = (uz.i1) r12     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
        L93:
            java.lang.Object r1 = r12.getValue()     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            r2 = r1
            rt.ae r2 = (rt.ae) r2     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            rt.yd r6 = rt.yd.f50728a     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            rt.ae r2 = rt.ae.a(r2, r5, r5, r6, r3)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            boolean r1 = r12.j(r1, r2)     // Catch: java.util.concurrent.CancellationException -> L1f java.lang.Exception -> La7
            if (r1 == 0) goto L93
            goto Lc0
        La7:
            bq.f r12 = r0.f49488b0
            java.lang.Object r12 = r12.f4945c
            uz.i1 r12 = (uz.i1) r12
        Lad:
            java.lang.Object r0 = r12.getValue()
            r1 = r0
            rt.ae r1 = (rt.ae) r1
            rt.vd r2 = rt.vd.f50556a
            rt.ae r1 = rt.ae.a(r1, r5, r5, r2, r3)
            boolean r0 = r12.j(r0, r1)
            if (r0 == 0) goto Lad
        Lc0:
            return r4
        Lc1:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.j.j(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:168:0x042e  */
    /* JADX WARN: Code duplicated, block: B:171:0x043c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00be  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:42:0x010f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0124  */
    /* JADX WARN: Code duplicated, block: B:48:0x0146  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x016e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0173  */
    /* JADX WARN: Code duplicated, block: B:60:0x0189  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d6  */
    private final Object m(Object obj) {
        Object objM;
        Object objM2;
        boolean z11;
        boolean z12;
        int i11;
        Object objM3;
        Object objM4;
        int i12;
        Object objM5;
        int i13;
        Object objM6;
        e9 e9Var = (e9) this.f43989c;
        l9 l9Var = (l9) this.f43990d;
        vt.h0 h0Var = l9Var.f50023c;
        uz.r0 r0Var = l9Var.f50024d;
        vt.n0 n0Var = l9Var.f50021a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i14 = this.f43988b;
        qy.b0 b0Var = qy.b0.f48488a;
        switch (i14) {
            case 0:
                com.bumptech.glide.e.F(obj);
                if (e9Var instanceof b9) {
                    int i15 = ((b9) e9Var).f49528a.f50782a;
                    this.f43988b = 1;
                    if (((fr.o0) n0Var).Z(i15, this) != aVar) {
                        int i16 = ((b9) e9Var).f49528a.f50783b;
                        this.f43988b = 2;
                        fr.o0 o0Var = (fr.o0) n0Var;
                        o0Var.getClass();
                        yz.f fVar = rz.o0.f50940a;
                        objM = rz.e0.M(yz.e.f58387a, new fr.f0(i16, 29, o0Var, null), this);
                        if (objM != aVar) {
                            objM = b0Var;
                        }
                        if (objM != aVar) {
                            boolean z13 = ((b9) e9Var).f49528a.f50785d;
                            this.f43988b = 3;
                            fr.o0 o0Var2 = (fr.o0) n0Var;
                            o0Var2.getClass();
                            yz.f fVar2 = rz.o0.f50940a;
                            objM2 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var2, z13, null, 5), this);
                            if (objM2 != aVar) {
                                objM2 = b0Var;
                            }
                            if (objM2 != aVar) {
                                z11 = ((b9) e9Var).f49528a.f50786e;
                                this.f43988b = 4;
                                if (((fr.o0) n0Var).B(z11, this) != aVar) {
                                    z12 = ((b9) e9Var).f49528a.f50787f;
                                    this.f43988b = 5;
                                    if (((fr.o0) n0Var).b0(z12, this) != aVar) {
                                        i11 = ((b9) e9Var).f49528a.f50788g;
                                        this.f43988b = 6;
                                        if (((fr.o0) n0Var).L(i11, this) != aVar) {
                                            float f5 = ((b9) e9Var).f49528a.f50789h;
                                            this.f43988b = 7;
                                            fr.o0 o0Var3 = (fr.o0) n0Var;
                                            o0Var3.getClass();
                                            yz.f fVar3 = rz.o0.f50940a;
                                            objM3 = rz.e0.M(yz.e.f58387a, new fr.k0(f5, 0, o0Var3, null), this);
                                            if (objM3 != aVar) {
                                                objM3 = b0Var;
                                            }
                                            if (objM3 != aVar) {
                                                int i17 = ((b9) e9Var).f49528a.f50790i;
                                                this.f43988b = 8;
                                                fr.o0 o0Var4 = (fr.o0) n0Var;
                                                o0Var4.getClass();
                                                yz.f fVar4 = rz.o0.f50940a;
                                                objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i17, 4, o0Var4, null), this);
                                                if (objM4 != aVar) {
                                                    objM4 = b0Var;
                                                }
                                                if (objM4 != aVar) {
                                                    i12 = ((b9) e9Var).f49528a.f50791j;
                                                    this.f43988b = 9;
                                                    if (((fr.o0) n0Var).D(i12, this) != aVar) {
                                                        boolean z14 = ((b9) e9Var).f49528a.f50792k;
                                                        this.f43988b = 10;
                                                        fr.o0 o0Var5 = (fr.o0) n0Var;
                                                        o0Var5.getClass();
                                                        yz.f fVar5 = rz.o0.f50940a;
                                                        objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var5, z14, null, 11), this);
                                                        if (objM5 != aVar) {
                                                            objM5 = b0Var;
                                                        }
                                                        if (objM5 != aVar) {
                                                            i13 = ((b9) e9Var).f49528a.f50793l;
                                                            if (i13 != -1) {
                                                                this.f43988b = 11;
                                                                fr.o0 o0Var6 = (fr.o0) n0Var;
                                                                o0Var6.getClass();
                                                                yz.f fVar6 = rz.o0.f50940a;
                                                                objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var6, null), this);
                                                                if (objM6 != aVar) {
                                                                    objM6 = b0Var;
                                                                }
                                                                if (objM6 != aVar) {
                                                                    vt.c cVar = l9Var.f50022b;
                                                                    this.f43988b = 23;
                                                                    ((vt.d) cVar).k(this);
                                                                    if (b0Var == aVar) {
                                                                        return b0Var;
                                                                    }
                                                                }
                                                            } else {
                                                                vt.c cVar2 = l9Var.f50022b;
                                                                this.f43988b = 23;
                                                                ((vt.d) cVar2).k(this);
                                                                if (b0Var == aVar) {
                                                                    return b0Var;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (e9Var instanceof c9) {
                    c9 c9Var = (c9) e9Var;
                    CourseQuestionPreferenceContext courseQuestionPreferenceContext = c9Var.f49576a;
                    CourseQuestionPreference courseQuestionPreferenceCopy$default = CourseQuestionPreference.copy$default(c9Var.f49577b, courseQuestionPreferenceContext.getKeyLanguage(), courseQuestionPreferenceContext.getQuestionTypeKey(), null, null, null, false, System.currentTimeMillis(), 60, null);
                    this.f43988b = 12;
                    fr.x xVar = (fr.x) h0Var;
                    Object objV = hz.b.V(xVar.f27959b, new fr.w(courseQuestionPreferenceCopy$default, xVar, null), this);
                    if (objV != aVar) {
                        objV = b0Var;
                    }
                    if (objV != aVar) {
                        vt.c cVar3 = l9Var.f50022b;
                        this.f43988b = 23;
                        ((vt.d) cVar3).k(this);
                        if (b0Var == aVar) {
                            return b0Var;
                        }
                    }
                } else {
                    boolean z15 = e9Var instanceof a9;
                    f9 f9Var = f9.f49754a;
                    if (z15) {
                        h9 h9Var = (h9) r0Var.f53391a.getValue();
                        if (kotlin.jvm.internal.m.a(h9Var, f9Var)) {
                            vt.c cVar4 = l9Var.f50022b;
                            this.f43988b = 23;
                            ((vt.d) cVar4).k(this);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        } else {
                            if (!(h9Var instanceof g9)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CourseQuestionPreferenceContext context = ((a9) e9Var).f49449a;
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            kotlin.jvm.internal.m.f(context, "context");
                            CourseQuestionPreference courseQuestionPreferenceBuildDefaultCourseQuestionPreference = CourseQuestionPreferenceKt.buildDefaultCourseQuestionPreference(context, jCurrentTimeMillis);
                            this.f43988b = 13;
                            fr.x xVar2 = (fr.x) h0Var;
                            Object objV2 = hz.b.V(xVar2.f27959b, new fr.w(courseQuestionPreferenceBuildDefaultCourseQuestionPreference, xVar2, null), this);
                            if (objV2 != aVar) {
                                objV2 = b0Var;
                            }
                            if (objV2 != aVar) {
                                vt.c cVar5 = l9Var.f50022b;
                                this.f43988b = 23;
                                ((vt.d) cVar5).k(this);
                                if (b0Var == aVar) {
                                    return b0Var;
                                }
                            }
                        }
                    } else {
                        if (!(e9Var instanceof d9)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        h9 h9Var2 = (h9) r0Var.f53391a.getValue();
                        if (kotlin.jvm.internal.m.a(h9Var2, f9Var)) {
                            vt.c cVar6 = l9Var.f50022b;
                            this.f43988b = 23;
                            ((vt.d) cVar6).k(this);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        } else {
                            if (!(h9Var2 instanceof g9)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Object value = r0Var.f53391a.getValue();
                            kotlin.jvm.internal.m.d(value, "null cannot be cast to non-null type com.lingodeer.course.viewmodels.CourseSettingsUiState.Success");
                            int i18 = ((g9) value).f49787b.f50784c;
                            if (i18 != 1) {
                                if (i18 != 2) {
                                    if (i18 != 3) {
                                        vt.c cVar7 = l9Var.f50022b;
                                        this.f43988b = 23;
                                        ((vt.d) cVar7).k(this);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    } else {
                                        this.f43988b = 14;
                                        if (((fr.o0) n0Var).Z(3, this) != aVar) {
                                            vt.c cVar8 = l9Var.f50022b;
                                            this.f43988b = 23;
                                            ((vt.d) cVar8).k(this);
                                            if (b0Var == aVar) {
                                                return b0Var;
                                            }
                                        }
                                    }
                                } else if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage))) {
                                    int iT = ((fr.o0) n0Var).t();
                                    if (iT == 3 || iT == 4) {
                                        this.f43988b = 15;
                                        if (((fr.o0) n0Var).Z(0, this) != aVar) {
                                            vt.c cVar9 = l9Var.f50022b;
                                            this.f43988b = 23;
                                            ((vt.d) cVar9).k(this);
                                            if (b0Var == aVar) {
                                                return b0Var;
                                            }
                                        }
                                    } else if (iT != 5) {
                                        vt.c cVar10 = l9Var.f50022b;
                                        this.f43988b = 23;
                                        ((vt.d) cVar10).k(this);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    } else {
                                        this.f43988b = 16;
                                        if (((fr.o0) n0Var).Z(1, this) != aVar) {
                                            vt.c cVar11 = l9Var.f50022b;
                                            this.f43988b = 23;
                                            ((vt.d) cVar11).k(this);
                                            if (b0Var == aVar) {
                                                return b0Var;
                                            }
                                        }
                                    }
                                } else if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage)) || ry.l.D(new Integer[]{13, 2}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage))) {
                                    this.f43988b = 17;
                                    if (((fr.o0) n0Var).Z(1, this) != aVar) {
                                        vt.c cVar12 = l9Var.f50022b;
                                        this.f43988b = 23;
                                        ((vt.d) cVar12).k(this);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    }
                                } else if (ry.l.D(new Integer[]{new Integer(51), new Integer(55), new Integer(57), new Integer(61), new Integer(63)}, new Integer(((fr.o0) n0Var).f27733a.keyLanguage))) {
                                    this.f43988b = 18;
                                    if (((fr.o0) n0Var).Z(0, this) != aVar) {
                                        vt.c cVar13 = l9Var.f50022b;
                                        this.f43988b = 23;
                                        ((vt.d) cVar13).k(this);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    }
                                } else {
                                    vt.c cVar14 = l9Var.f50022b;
                                    this.f43988b = 23;
                                    ((vt.d) cVar14).k(this);
                                    if (b0Var == aVar) {
                                        return b0Var;
                                    }
                                }
                            } else if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage))) {
                                int iT2 = ((fr.o0) n0Var).t();
                                if (iT2 == 0) {
                                    this.f43988b = 19;
                                    if (((fr.o0) n0Var).Z(6, this) != aVar) {
                                        vt.c cVar15 = l9Var.f50022b;
                                        this.f43988b = 23;
                                        ((vt.d) cVar15).k(this);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    }
                                } else if (iT2 != 1) {
                                    vt.c cVar16 = l9Var.f50022b;
                                    this.f43988b = 23;
                                    ((vt.d) cVar16).k(this);
                                    if (b0Var == aVar) {
                                        return b0Var;
                                    }
                                } else {
                                    this.f43988b = 20;
                                    if (((fr.o0) n0Var).Z(5, this) != aVar) {
                                        vt.c cVar17 = l9Var.f50022b;
                                        this.f43988b = 23;
                                        ((vt.d) cVar17).k(this);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    }
                                }
                            } else if (ry.l.D(new Integer[]{11, 0}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage)) || ry.l.D(new Integer[]{13, 2}, Integer.valueOf(((fr.o0) n0Var).f27733a.keyLanguage))) {
                                this.f43988b = 21;
                                if (((fr.o0) n0Var).Z(2, this) != aVar) {
                                    vt.c cVar18 = l9Var.f50022b;
                                    this.f43988b = 23;
                                    ((vt.d) cVar18).k(this);
                                    if (b0Var == aVar) {
                                        return b0Var;
                                    }
                                }
                            } else if (ry.l.D(new Integer[]{new Integer(51), new Integer(55), new Integer(57), new Integer(61), new Integer(63)}, new Integer(((fr.o0) n0Var).f27733a.keyLanguage))) {
                                this.f43988b = 22;
                                if (((fr.o0) n0Var).Z(1, this) != aVar) {
                                    vt.c cVar19 = l9Var.f50022b;
                                    this.f43988b = 23;
                                    ((vt.d) cVar19).k(this);
                                    if (b0Var == aVar) {
                                        return b0Var;
                                    }
                                }
                            } else {
                                vt.c cVar110 = l9Var.f50022b;
                                this.f43988b = 23;
                                ((vt.d) cVar110).k(this);
                                if (b0Var == aVar) {
                                    return b0Var;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 1:
                com.bumptech.glide.e.F(obj);
                int i19 = ((b9) e9Var).f49528a.f50783b;
                this.f43988b = 2;
                fr.o0 o0Var7 = (fr.o0) n0Var;
                o0Var7.getClass();
                yz.f fVar7 = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new fr.f0(i19, 29, o0Var7, null), this);
                if (objM != aVar) {
                    objM = b0Var;
                }
                if (objM != aVar) {
                    boolean z16 = ((b9) e9Var).f49528a.f50785d;
                    this.f43988b = 3;
                    fr.o0 o0Var8 = (fr.o0) n0Var;
                    o0Var8.getClass();
                    yz.f fVar8 = rz.o0.f50940a;
                    objM2 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var8, z16, null, 5), this);
                    if (objM2 != aVar) {
                        objM2 = b0Var;
                    }
                    if (objM2 != aVar) {
                        z11 = ((b9) e9Var).f49528a.f50786e;
                        this.f43988b = 4;
                        if (((fr.o0) n0Var).B(z11, this) != aVar) {
                            z12 = ((b9) e9Var).f49528a.f50787f;
                            this.f43988b = 5;
                            if (((fr.o0) n0Var).b0(z12, this) != aVar) {
                                i11 = ((b9) e9Var).f49528a.f50788g;
                                this.f43988b = 6;
                                if (((fr.o0) n0Var).L(i11, this) != aVar) {
                                    float f11 = ((b9) e9Var).f49528a.f50789h;
                                    this.f43988b = 7;
                                    fr.o0 o0Var9 = (fr.o0) n0Var;
                                    o0Var9.getClass();
                                    yz.f fVar9 = rz.o0.f50940a;
                                    objM3 = rz.e0.M(yz.e.f58387a, new fr.k0(f11, 0, o0Var9, null), this);
                                    if (objM3 != aVar) {
                                        objM3 = b0Var;
                                    }
                                    if (objM3 != aVar) {
                                        int i110 = ((b9) e9Var).f49528a.f50790i;
                                        this.f43988b = 8;
                                        fr.o0 o0Var10 = (fr.o0) n0Var;
                                        o0Var10.getClass();
                                        yz.f fVar10 = rz.o0.f50940a;
                                        objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i110, 4, o0Var10, null), this);
                                        if (objM4 != aVar) {
                                            objM4 = b0Var;
                                        }
                                        if (objM4 != aVar) {
                                            i12 = ((b9) e9Var).f49528a.f50791j;
                                            this.f43988b = 9;
                                            if (((fr.o0) n0Var).D(i12, this) != aVar) {
                                                boolean z17 = ((b9) e9Var).f49528a.f50792k;
                                                this.f43988b = 10;
                                                fr.o0 o0Var11 = (fr.o0) n0Var;
                                                o0Var11.getClass();
                                                yz.f fVar11 = rz.o0.f50940a;
                                                objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var11, z17, null, 11), this);
                                                if (objM5 != aVar) {
                                                    objM5 = b0Var;
                                                }
                                                if (objM5 != aVar) {
                                                    i13 = ((b9) e9Var).f49528a.f50793l;
                                                    if (i13 != -1) {
                                                        this.f43988b = 11;
                                                        fr.o0 o0Var12 = (fr.o0) n0Var;
                                                        o0Var12.getClass();
                                                        yz.f fVar12 = rz.o0.f50940a;
                                                        objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var12, null), this);
                                                        if (objM6 != aVar) {
                                                            objM6 = b0Var;
                                                        }
                                                        if (objM6 != aVar) {
                                                            vt.c cVar111 = l9Var.f50022b;
                                                            this.f43988b = 23;
                                                            ((vt.d) cVar111).k(this);
                                                            if (b0Var == aVar) {
                                                                return b0Var;
                                                            }
                                                        }
                                                    } else {
                                                        vt.c cVar112 = l9Var.f50022b;
                                                        this.f43988b = 23;
                                                        ((vt.d) cVar112).k(this);
                                                        if (b0Var == aVar) {
                                                            return b0Var;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 2:
                com.bumptech.glide.e.F(obj);
                boolean z18 = ((b9) e9Var).f49528a.f50785d;
                this.f43988b = 3;
                fr.o0 o0Var13 = (fr.o0) n0Var;
                o0Var13.getClass();
                yz.f fVar13 = rz.o0.f50940a;
                objM2 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var13, z18, null, 5), this);
                if (objM2 != aVar) {
                    objM2 = b0Var;
                }
                if (objM2 != aVar) {
                    z11 = ((b9) e9Var).f49528a.f50786e;
                    this.f43988b = 4;
                    if (((fr.o0) n0Var).B(z11, this) != aVar) {
                        z12 = ((b9) e9Var).f49528a.f50787f;
                        this.f43988b = 5;
                        if (((fr.o0) n0Var).b0(z12, this) != aVar) {
                            i11 = ((b9) e9Var).f49528a.f50788g;
                            this.f43988b = 6;
                            if (((fr.o0) n0Var).L(i11, this) != aVar) {
                                float f12 = ((b9) e9Var).f49528a.f50789h;
                                this.f43988b = 7;
                                fr.o0 o0Var14 = (fr.o0) n0Var;
                                o0Var14.getClass();
                                yz.f fVar14 = rz.o0.f50940a;
                                objM3 = rz.e0.M(yz.e.f58387a, new fr.k0(f12, 0, o0Var14, null), this);
                                if (objM3 != aVar) {
                                    objM3 = b0Var;
                                }
                                if (objM3 != aVar) {
                                    int i111 = ((b9) e9Var).f49528a.f50790i;
                                    this.f43988b = 8;
                                    fr.o0 o0Var15 = (fr.o0) n0Var;
                                    o0Var15.getClass();
                                    yz.f fVar15 = rz.o0.f50940a;
                                    objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i111, 4, o0Var15, null), this);
                                    if (objM4 != aVar) {
                                        objM4 = b0Var;
                                    }
                                    if (objM4 != aVar) {
                                        i12 = ((b9) e9Var).f49528a.f50791j;
                                        this.f43988b = 9;
                                        if (((fr.o0) n0Var).D(i12, this) != aVar) {
                                            boolean z19 = ((b9) e9Var).f49528a.f50792k;
                                            this.f43988b = 10;
                                            fr.o0 o0Var16 = (fr.o0) n0Var;
                                            o0Var16.getClass();
                                            yz.f fVar16 = rz.o0.f50940a;
                                            objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var16, z19, null, 11), this);
                                            if (objM5 != aVar) {
                                                objM5 = b0Var;
                                            }
                                            if (objM5 != aVar) {
                                                i13 = ((b9) e9Var).f49528a.f50793l;
                                                if (i13 != -1) {
                                                    this.f43988b = 11;
                                                    fr.o0 o0Var17 = (fr.o0) n0Var;
                                                    o0Var17.getClass();
                                                    yz.f fVar17 = rz.o0.f50940a;
                                                    objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var17, null), this);
                                                    if (objM6 != aVar) {
                                                        objM6 = b0Var;
                                                    }
                                                    if (objM6 != aVar) {
                                                        vt.c cVar113 = l9Var.f50022b;
                                                        this.f43988b = 23;
                                                        ((vt.d) cVar113).k(this);
                                                        if (b0Var == aVar) {
                                                            return b0Var;
                                                        }
                                                    }
                                                } else {
                                                    vt.c cVar114 = l9Var.f50022b;
                                                    this.f43988b = 23;
                                                    ((vt.d) cVar114).k(this);
                                                    if (b0Var == aVar) {
                                                        return b0Var;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 3:
                com.bumptech.glide.e.F(obj);
                z11 = ((b9) e9Var).f49528a.f50786e;
                this.f43988b = 4;
                if (((fr.o0) n0Var).B(z11, this) != aVar) {
                    z12 = ((b9) e9Var).f49528a.f50787f;
                    this.f43988b = 5;
                    if (((fr.o0) n0Var).b0(z12, this) != aVar) {
                        i11 = ((b9) e9Var).f49528a.f50788g;
                        this.f43988b = 6;
                        if (((fr.o0) n0Var).L(i11, this) != aVar) {
                            float f13 = ((b9) e9Var).f49528a.f50789h;
                            this.f43988b = 7;
                            fr.o0 o0Var18 = (fr.o0) n0Var;
                            o0Var18.getClass();
                            yz.f fVar18 = rz.o0.f50940a;
                            objM3 = rz.e0.M(yz.e.f58387a, new fr.k0(f13, 0, o0Var18, null), this);
                            if (objM3 != aVar) {
                                objM3 = b0Var;
                            }
                            if (objM3 != aVar) {
                                int i112 = ((b9) e9Var).f49528a.f50790i;
                                this.f43988b = 8;
                                fr.o0 o0Var19 = (fr.o0) n0Var;
                                o0Var19.getClass();
                                yz.f fVar19 = rz.o0.f50940a;
                                objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i112, 4, o0Var19, null), this);
                                if (objM4 != aVar) {
                                    objM4 = b0Var;
                                }
                                if (objM4 != aVar) {
                                    i12 = ((b9) e9Var).f49528a.f50791j;
                                    this.f43988b = 9;
                                    if (((fr.o0) n0Var).D(i12, this) != aVar) {
                                        boolean z110 = ((b9) e9Var).f49528a.f50792k;
                                        this.f43988b = 10;
                                        fr.o0 o0Var110 = (fr.o0) n0Var;
                                        o0Var110.getClass();
                                        yz.f fVar110 = rz.o0.f50940a;
                                        objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var110, z110, null, 11), this);
                                        if (objM5 != aVar) {
                                            objM5 = b0Var;
                                        }
                                        if (objM5 != aVar) {
                                            i13 = ((b9) e9Var).f49528a.f50793l;
                                            if (i13 != -1) {
                                                this.f43988b = 11;
                                                fr.o0 o0Var111 = (fr.o0) n0Var;
                                                o0Var111.getClass();
                                                yz.f fVar111 = rz.o0.f50940a;
                                                objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var111, null), this);
                                                if (objM6 != aVar) {
                                                    objM6 = b0Var;
                                                }
                                                if (objM6 != aVar) {
                                                    vt.c cVar115 = l9Var.f50022b;
                                                    this.f43988b = 23;
                                                    ((vt.d) cVar115).k(this);
                                                    if (b0Var == aVar) {
                                                        return b0Var;
                                                    }
                                                }
                                            } else {
                                                vt.c cVar116 = l9Var.f50022b;
                                                this.f43988b = 23;
                                                ((vt.d) cVar116).k(this);
                                                if (b0Var == aVar) {
                                                    return b0Var;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 4:
                com.bumptech.glide.e.F(obj);
                z12 = ((b9) e9Var).f49528a.f50787f;
                this.f43988b = 5;
                if (((fr.o0) n0Var).b0(z12, this) != aVar) {
                    i11 = ((b9) e9Var).f49528a.f50788g;
                    this.f43988b = 6;
                    if (((fr.o0) n0Var).L(i11, this) != aVar) {
                        float f14 = ((b9) e9Var).f49528a.f50789h;
                        this.f43988b = 7;
                        fr.o0 o0Var112 = (fr.o0) n0Var;
                        o0Var112.getClass();
                        yz.f fVar112 = rz.o0.f50940a;
                        objM3 = rz.e0.M(yz.e.f58387a, new fr.k0(f14, 0, o0Var112, null), this);
                        if (objM3 != aVar) {
                            objM3 = b0Var;
                        }
                        if (objM3 != aVar) {
                            int i113 = ((b9) e9Var).f49528a.f50790i;
                            this.f43988b = 8;
                            fr.o0 o0Var113 = (fr.o0) n0Var;
                            o0Var113.getClass();
                            yz.f fVar113 = rz.o0.f50940a;
                            objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i113, 4, o0Var113, null), this);
                            if (objM4 != aVar) {
                                objM4 = b0Var;
                            }
                            if (objM4 != aVar) {
                                i12 = ((b9) e9Var).f49528a.f50791j;
                                this.f43988b = 9;
                                if (((fr.o0) n0Var).D(i12, this) != aVar) {
                                    boolean z111 = ((b9) e9Var).f49528a.f50792k;
                                    this.f43988b = 10;
                                    fr.o0 o0Var114 = (fr.o0) n0Var;
                                    o0Var114.getClass();
                                    yz.f fVar114 = rz.o0.f50940a;
                                    objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var114, z111, null, 11), this);
                                    if (objM5 != aVar) {
                                        objM5 = b0Var;
                                    }
                                    if (objM5 != aVar) {
                                        i13 = ((b9) e9Var).f49528a.f50793l;
                                        if (i13 != -1) {
                                            this.f43988b = 11;
                                            fr.o0 o0Var115 = (fr.o0) n0Var;
                                            o0Var115.getClass();
                                            yz.f fVar115 = rz.o0.f50940a;
                                            objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var115, null), this);
                                            if (objM6 != aVar) {
                                                objM6 = b0Var;
                                            }
                                            if (objM6 != aVar) {
                                                vt.c cVar117 = l9Var.f50022b;
                                                this.f43988b = 23;
                                                ((vt.d) cVar117).k(this);
                                                if (b0Var == aVar) {
                                                    return b0Var;
                                                }
                                            }
                                        } else {
                                            vt.c cVar118 = l9Var.f50022b;
                                            this.f43988b = 23;
                                            ((vt.d) cVar118).k(this);
                                            if (b0Var == aVar) {
                                                return b0Var;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 5:
                com.bumptech.glide.e.F(obj);
                i11 = ((b9) e9Var).f49528a.f50788g;
                this.f43988b = 6;
                if (((fr.o0) n0Var).L(i11, this) != aVar) {
                    float f15 = ((b9) e9Var).f49528a.f50789h;
                    this.f43988b = 7;
                    fr.o0 o0Var116 = (fr.o0) n0Var;
                    o0Var116.getClass();
                    yz.f fVar116 = rz.o0.f50940a;
                    objM3 = rz.e0.M(yz.e.f58387a, new fr.k0(f15, 0, o0Var116, null), this);
                    if (objM3 != aVar) {
                        objM3 = b0Var;
                    }
                    if (objM3 != aVar) {
                        int i114 = ((b9) e9Var).f49528a.f50790i;
                        this.f43988b = 8;
                        fr.o0 o0Var117 = (fr.o0) n0Var;
                        o0Var117.getClass();
                        yz.f fVar117 = rz.o0.f50940a;
                        objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i114, 4, o0Var117, null), this);
                        if (objM4 != aVar) {
                            objM4 = b0Var;
                        }
                        if (objM4 != aVar) {
                            i12 = ((b9) e9Var).f49528a.f50791j;
                            this.f43988b = 9;
                            if (((fr.o0) n0Var).D(i12, this) != aVar) {
                                boolean z112 = ((b9) e9Var).f49528a.f50792k;
                                this.f43988b = 10;
                                fr.o0 o0Var118 = (fr.o0) n0Var;
                                o0Var118.getClass();
                                yz.f fVar118 = rz.o0.f50940a;
                                objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var118, z112, null, 11), this);
                                if (objM5 != aVar) {
                                    objM5 = b0Var;
                                }
                                if (objM5 != aVar) {
                                    i13 = ((b9) e9Var).f49528a.f50793l;
                                    if (i13 != -1) {
                                        this.f43988b = 11;
                                        fr.o0 o0Var119 = (fr.o0) n0Var;
                                        o0Var119.getClass();
                                        yz.f fVar119 = rz.o0.f50940a;
                                        objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var119, null), this);
                                        if (objM6 != aVar) {
                                            objM6 = b0Var;
                                        }
                                        if (objM6 != aVar) {
                                            vt.c cVar119 = l9Var.f50022b;
                                            this.f43988b = 23;
                                            ((vt.d) cVar119).k(this);
                                            if (b0Var == aVar) {
                                                return b0Var;
                                            }
                                        }
                                    } else {
                                        vt.c cVar1110 = l9Var.f50022b;
                                        this.f43988b = 23;
                                        ((vt.d) cVar1110).k(this);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 6:
                com.bumptech.glide.e.F(obj);
                float f16 = ((b9) e9Var).f49528a.f50789h;
                this.f43988b = 7;
                fr.o0 o0Var1110 = (fr.o0) n0Var;
                o0Var1110.getClass();
                yz.f fVar1110 = rz.o0.f50940a;
                objM3 = rz.e0.M(yz.e.f58387a, new fr.k0(f16, 0, o0Var1110, null), this);
                if (objM3 != aVar) {
                    objM3 = b0Var;
                }
                if (objM3 != aVar) {
                    int i115 = ((b9) e9Var).f49528a.f50790i;
                    this.f43988b = 8;
                    fr.o0 o0Var1111 = (fr.o0) n0Var;
                    o0Var1111.getClass();
                    yz.f fVar1111 = rz.o0.f50940a;
                    objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i115, 4, o0Var1111, null), this);
                    if (objM4 != aVar) {
                        objM4 = b0Var;
                    }
                    if (objM4 != aVar) {
                        i12 = ((b9) e9Var).f49528a.f50791j;
                        this.f43988b = 9;
                        if (((fr.o0) n0Var).D(i12, this) != aVar) {
                            boolean z113 = ((b9) e9Var).f49528a.f50792k;
                            this.f43988b = 10;
                            fr.o0 o0Var1112 = (fr.o0) n0Var;
                            o0Var1112.getClass();
                            yz.f fVar1112 = rz.o0.f50940a;
                            objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var1112, z113, null, 11), this);
                            if (objM5 != aVar) {
                                objM5 = b0Var;
                            }
                            if (objM5 != aVar) {
                                i13 = ((b9) e9Var).f49528a.f50793l;
                                if (i13 != -1) {
                                    this.f43988b = 11;
                                    fr.o0 o0Var1113 = (fr.o0) n0Var;
                                    o0Var1113.getClass();
                                    yz.f fVar1113 = rz.o0.f50940a;
                                    objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var1113, null), this);
                                    if (objM6 != aVar) {
                                        objM6 = b0Var;
                                    }
                                    if (objM6 != aVar) {
                                        vt.c cVar1111 = l9Var.f50022b;
                                        this.f43988b = 23;
                                        ((vt.d) cVar1111).k(this);
                                        if (b0Var == aVar) {
                                            return b0Var;
                                        }
                                    }
                                } else {
                                    vt.c cVar1112 = l9Var.f50022b;
                                    this.f43988b = 23;
                                    ((vt.d) cVar1112).k(this);
                                    if (b0Var == aVar) {
                                        return b0Var;
                                    }
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 7:
                com.bumptech.glide.e.F(obj);
                int i116 = ((b9) e9Var).f49528a.f50790i;
                this.f43988b = 8;
                fr.o0 o0Var1114 = (fr.o0) n0Var;
                o0Var1114.getClass();
                yz.f fVar1114 = rz.o0.f50940a;
                objM4 = rz.e0.M(yz.e.f58387a, new fr.f0(i116, 4, o0Var1114, null), this);
                if (objM4 != aVar) {
                    objM4 = b0Var;
                }
                if (objM4 != aVar) {
                    i12 = ((b9) e9Var).f49528a.f50791j;
                    this.f43988b = 9;
                    if (((fr.o0) n0Var).D(i12, this) != aVar) {
                        boolean z114 = ((b9) e9Var).f49528a.f50792k;
                        this.f43988b = 10;
                        fr.o0 o0Var1115 = (fr.o0) n0Var;
                        o0Var1115.getClass();
                        yz.f fVar1115 = rz.o0.f50940a;
                        objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var1115, z114, null, 11), this);
                        if (objM5 != aVar) {
                            objM5 = b0Var;
                        }
                        if (objM5 != aVar) {
                            i13 = ((b9) e9Var).f49528a.f50793l;
                            if (i13 != -1) {
                                this.f43988b = 11;
                                fr.o0 o0Var1116 = (fr.o0) n0Var;
                                o0Var1116.getClass();
                                yz.f fVar1116 = rz.o0.f50940a;
                                objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var1116, null), this);
                                if (objM6 != aVar) {
                                    objM6 = b0Var;
                                }
                                if (objM6 != aVar) {
                                    vt.c cVar1113 = l9Var.f50022b;
                                    this.f43988b = 23;
                                    ((vt.d) cVar1113).k(this);
                                    if (b0Var == aVar) {
                                        return b0Var;
                                    }
                                }
                            } else {
                                vt.c cVar1114 = l9Var.f50022b;
                                this.f43988b = 23;
                                ((vt.d) cVar1114).k(this);
                                if (b0Var == aVar) {
                                    return b0Var;
                                }
                            }
                        }
                    }
                }
                return aVar;
            case 8:
                com.bumptech.glide.e.F(obj);
                i12 = ((b9) e9Var).f49528a.f50791j;
                this.f43988b = 9;
                if (((fr.o0) n0Var).D(i12, this) != aVar) {
                    boolean z115 = ((b9) e9Var).f49528a.f50792k;
                    this.f43988b = 10;
                    fr.o0 o0Var1117 = (fr.o0) n0Var;
                    o0Var1117.getClass();
                    yz.f fVar1117 = rz.o0.f50940a;
                    objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var1117, z115, null, 11), this);
                    if (objM5 != aVar) {
                        objM5 = b0Var;
                    }
                    if (objM5 != aVar) {
                        i13 = ((b9) e9Var).f49528a.f50793l;
                        if (i13 != -1) {
                            this.f43988b = 11;
                            fr.o0 o0Var1118 = (fr.o0) n0Var;
                            o0Var1118.getClass();
                            yz.f fVar1118 = rz.o0.f50940a;
                            objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var1118, null), this);
                            if (objM6 != aVar) {
                                objM6 = b0Var;
                            }
                            if (objM6 != aVar) {
                                vt.c cVar1115 = l9Var.f50022b;
                                this.f43988b = 23;
                                ((vt.d) cVar1115).k(this);
                                if (b0Var == aVar) {
                                    return b0Var;
                                }
                            }
                        } else {
                            vt.c cVar1116 = l9Var.f50022b;
                            this.f43988b = 23;
                            ((vt.d) cVar1116).k(this);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        }
                    }
                }
                return aVar;
            case 9:
                com.bumptech.glide.e.F(obj);
                boolean z116 = ((b9) e9Var).f49528a.f50792k;
                this.f43988b = 10;
                fr.o0 o0Var1119 = (fr.o0) n0Var;
                o0Var1119.getClass();
                yz.f fVar1119 = rz.o0.f50940a;
                objM5 = rz.e0.M(yz.e.f58387a, new fr.j0(o0Var1119, z116, null, 11), this);
                if (objM5 != aVar) {
                    objM5 = b0Var;
                }
                if (objM5 != aVar) {
                    i13 = ((b9) e9Var).f49528a.f50793l;
                    if (i13 != -1) {
                        this.f43988b = 11;
                        fr.o0 o0Var11110 = (fr.o0) n0Var;
                        o0Var11110.getClass();
                        yz.f fVar11110 = rz.o0.f50940a;
                        objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var11110, null), this);
                        if (objM6 != aVar) {
                            objM6 = b0Var;
                        }
                        if (objM6 != aVar) {
                            vt.c cVar1117 = l9Var.f50022b;
                            this.f43988b = 23;
                            ((vt.d) cVar1117).k(this);
                            if (b0Var == aVar) {
                                return b0Var;
                            }
                        }
                    } else {
                        vt.c cVar1118 = l9Var.f50022b;
                        this.f43988b = 23;
                        ((vt.d) cVar1118).k(this);
                        if (b0Var == aVar) {
                            return b0Var;
                        }
                    }
                }
                return aVar;
            case 10:
                com.bumptech.glide.e.F(obj);
                i13 = ((b9) e9Var).f49528a.f50793l;
                if (i13 != -1) {
                    this.f43988b = 11;
                    fr.o0 o0Var11111 = (fr.o0) n0Var;
                    o0Var11111.getClass();
                    yz.f fVar11111 = rz.o0.f50940a;
                    objM6 = rz.e0.M(yz.e.f58387a, new fr.m0(i13, 3, o0Var11111, null), this);
                    if (objM6 != aVar) {
                        objM6 = b0Var;
                    }
                    if (objM6 != aVar) {
                        vt.c cVar1119 = l9Var.f50022b;
                        this.f43988b = 23;
                        ((vt.d) cVar1119).k(this);
                        if (b0Var == aVar) {
                            return b0Var;
                        }
                    }
                } else {
                    vt.c cVar11110 = l9Var.f50022b;
                    this.f43988b = 23;
                    ((vt.d) cVar11110).k(this);
                    if (b0Var == aVar) {
                        return b0Var;
                    }
                }
                return aVar;
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                com.bumptech.glide.e.F(obj);
                vt.c cVar11111 = l9Var.f50022b;
                this.f43988b = 23;
                ((vt.d) cVar11111).k(this);
                if (b0Var == aVar) {
                    return aVar;
                }
                return b0Var;
            case 23:
                com.bumptech.glide.e.F(obj);
                return b0Var;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final Object n(Object obj) {
        Object objU;
        Object value;
        Object value2;
        Object value3;
        dd ddVar = (dd) this.f43989c;
        LinkedHashMap linkedHashMap = ddVar.f50720t;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f43988b;
        int i12 = 1;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            long j11 = ddVar.f49644u0;
            if (j11 != -1) {
                wt.o0 o0Var = ddVar.f49639p0;
                CoursePracticeType practiceType = ddVar.f49646w0;
                o0Var.getClass();
                kotlin.jvm.internal.m.f(practiceType, "practiceType");
                gp.r rVar = new gp.r(new bh.l(o0Var, j11, practiceType, (vy.d) null, 15));
                this.f43988b = 1;
                objU = x0.u(rVar, this);
                if (objU == aVar) {
                    return aVar;
                }
            }
            return qy.b0.f48488a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.bumptech.glide.e.F(obj);
        objU = obj;
        String str = (String) objU;
        if (str.length() > 0) {
            h00.s sVar = xt.c.f56291a;
            sVar.getClass();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) sVar.b(new g00.g0(t1.f28468a, g00.m0.f28434a, 1), str);
            kotlin.jvm.internal.m.f(linkedHashMap2, "<set-?>");
            ddVar.H = linkedHashMap2;
            i1 i1Var = ddVar.Y;
            Integer num = (Integer) linkedHashMap2.get("__manual_skip_count__");
            int i13 = 0;
            Integer numValueOf = Integer.valueOf(num != null ? num.intValue() : 0);
            i1Var.getClass();
            i1Var.l(null, numValueOf);
            i1 i1Var2 = ddVar.Z;
            Set setKeySet = linkedHashMap2.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : setKeySet) {
                if (oz.x.s0((String) obj2, "__manual_skip_item__:", false)) {
                    arrayList.add(obj2);
                }
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj3 = arrayList.get(i14);
                i14++;
                linkedHashSet.add(oz.q.R0((String) obj3, "__manual_skip_item__:"));
            }
            i1Var2.getClass();
            i1Var2.l(null, linkedHashSet);
            linkedHashMap.clear();
            ArrayList arrayList2 = new ArrayList();
            Objects.toString(ddVar.H);
            LinkedHashMap linkedHashMap3 = ddVar.H;
            vt.n0 n0Var = (vt.n0) this.f43990d;
            int i15 = 0;
            for (Map.Entry entry : linkedHashMap3.entrySet()) {
                List listW0 = oz.q.W0((CharSequence) entry.getKey(), new String[]{":"}, i13, 6);
                if (listW0.size() >= 3) {
                    int i16 = Integer.parseInt((String) listW0.get(i13));
                    long j12 = Long.parseLong((String) listW0.get(i12));
                    int i17 = Integer.parseInt((String) listW0.get(2));
                    if (listW0.size() == 4) {
                        boolean z11 = Boolean.parseBoolean((String) listW0.get(3));
                        if ((i16 != 0 || i17 != 6) && ((i16 != 3 || i17 != 14) && ((i16 != 2 || i17 != 2 || j12 != 0) && i16 != -1 && !z11 && ((Number) entry.getValue()).intValue() != 0))) {
                            linkedHashMap.put(nv.p.k(i17, xt.d.o(j12, i16, ((fr.o0) n0Var).f27733a.keyLanguage), ":"), entry.getValue());
                        }
                    }
                    if (((Number) entry.getValue()).intValue() == 0) {
                        arrayList2.add(i16 + ":" + j12 + ":" + i17 + ":1");
                    } else {
                        xy.f.a(i15);
                        i15++;
                    }
                }
                i12 = 1;
                i13 = 0;
            }
            i1 i1Var3 = ddVar.B0;
            do {
                value = i1Var3.getValue();
            } while (!i1Var3.j(value, ry.m.y0(arrayList2, "#", null, null, null, 62)));
            LinkedHashMap progress = ddVar.H;
            kotlin.jvm.internal.m.f(progress, "progress");
            Integer num2 = (Integer) progress.get("__manual_skip_count__");
            int iIntValue = (num2 != null ? num2.intValue() : 0) + i15;
            i1 i1Var4 = ddVar.W;
            do {
                value2 = i1Var4.getValue();
                ((Number) value2).intValue();
            } while (!i1Var4.j(value2, new Integer(iIntValue)));
            i1 i1Var5 = ddVar.X;
            do {
                value3 = i1Var5.getValue();
                ((Number) value3).intValue();
            } while (!i1Var5.j(value3, new Integer(iIntValue)));
        }
        return qy.b0.f48488a;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r0.emit(null, r11) == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005c, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object o(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f43989c
            uz.j r0 = (uz.j) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r11.f43988b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L25
            if (r2 == r5) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            com.bumptech.glide.e.F(r12)
            goto L50
        L21:
            com.bumptech.glide.e.F(r12)
            goto L5f
        L25:
            com.bumptech.glide.e.F(r12)
            java.lang.Object r12 = r11.f43990d
            rt.dd r12 = (rt.dd) r12
            long r7 = r12.f49645v0
            r9 = -1
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 != 0) goto L3f
            r11.f43989c = r6
            r11.f43988b = r5
            java.lang.Object r12 = r0.emit(r6, r11)
            if (r12 != r1) goto L5f
            goto L5e
        L3f:
            wt.m r12 = r12.f49638o0
            gp.r r12 = r12.f(r7)
            r11.f43989c = r0
            r11.f43988b = r4
            java.lang.Object r12 = uz.x0.v(r12, r11)
            if (r12 != r1) goto L50
            goto L5e
        L50:
            com.lingodeer.data.model.CourseUnit r12 = (com.lingodeer.data.model.CourseUnit) r12
            if (r12 == 0) goto L5f
            r11.f43989c = r6
            r11.f43988b = r3
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L5f
        L5e:
            return r1
        L5f:
            qy.b0 r12 = qy.b0.f48488a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.j.o(java.lang.Object):java.lang.Object");
    }

    private final Object p(Object obj) {
        Object objL;
        Object value;
        Object value2;
        jd jdVar = (jd) this.f43990d;
        i1 i1Var = jdVar.f49945e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f43988b;
        qy.b0 b0Var = qy.b0.f48488a;
        vy.d dVar = null;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                gp.r rVarF = jdVar.f49942b.f(jdVar.f49944d);
                this.f43989c = null;
                this.f43988b = 1;
                obj = x0.u(rVarF, this);
                if (obj == aVar) {
                }
            }
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
                return b0Var;
            }
            com.bumptech.glide.e.F(obj);
            objL = ks.b.n(((CourseUnit) obj).getLessonList());
        } catch (Throwable th2) {
            objL = com.bumptech.glide.e.l(th2);
        }
        if (qy.o.a(objL) != null) {
            if (!jdVar.N) {
                jdVar.N = true;
                jdVar.a("fail");
            }
            jdVar.f49947t.d(fd.f49765a);
            return b0Var;
        }
        List list = (List) objL;
        if (list.isEmpty()) {
            jdVar.M = true;
            do {
                value2 = i1Var.getValue();
            } while (!i1Var.j(value2, new hd(1.0f, true, true)));
            jdVar.a("downloaded");
            return b0Var;
        }
        do {
            value = i1Var.getValue();
        } while (!i1Var.j(value, new hd(CropImageView.DEFAULT_ASPECT_RATIO, false, false)));
        o2 o2Var = jdVar.f49941a;
        long j11 = jdVar.f49944d;
        o2Var.getClass();
        n1 n1Var = new n1(x0.g(new mr.a(j11, list, o2Var, null)), new g.k(jdVar, dVar, 4));
        b1.b bVar = new b1.b(jdVar, 15);
        this.f43989c = null;
        this.f43988b = 2;
        return n1Var.collect(bVar, this) == aVar ? aVar : b0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object q(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f43989c
            uz.j r0 = (uz.j) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r8.f43988b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L21
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            com.bumptech.glide.e.F(r9)
            goto L4e
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            com.bumptech.glide.e.F(r9)
            goto L3e
        L21:
            com.bumptech.glide.e.F(r9)
            yz.f r9 = rz.o0.f50940a
            yz.e r9 = yz.e.f58387a
            rt.h r2 = new rt.h
            java.lang.Object r6 = r8.f43990d
            rv.b r6 = (rv.b) r6
            r7 = 12
            r2.<init>(r6, r5, r7)
            r8.f43989c = r0
            r8.f43988b = r4
            java.lang.Object r9 = rz.e0.M(r9, r2, r8)
            if (r9 != r1) goto L3e
            goto L4d
        L3e:
            rv.a r9 = (rv.a) r9
            java.util.Objects.toString(r9)
            r8.f43989c = r5
            r8.f43988b = r3
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L4e
        L4d:
            return r1
        L4e:
            qy.b0 r9 = qy.b0.f48488a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.j.q(java.lang.Object):java.lang.Object");
    }

    private final Object r(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f43988b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            s2.w wVar = (s2.w) this.f43989c;
            d1.q0 q0Var = new d1.q0((z0) this.f43990d, 2);
            this.f43988b = 1;
            if (s2.d(wVar, null, null, q0Var, this, 7) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        return qy.b0.f48488a;
    }

    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f43987a) {
            case 0:
                return new j(0, (l) this.f43989c, (String) this.f43990d, dVar);
            case 1:
                j jVar = new j((nu.e) this.f43990d, dVar, 1);
                jVar.f43989c = obj;
                return jVar;
            case 2:
                return new j(2, (pu.b) this.f43989c, (b1) this.f43990d, dVar);
            case 3:
                return new j(3, (s2.w) this.f43989c, (o0.t) this.f43990d, dVar);
            case 4:
                j jVar2 = new j((o9.b) this.f43990d, dVar, 4);
                jVar2.f43989c = obj;
                return jVar2;
            case 5:
                return new j(5, (oo.h) this.f43989c, (List) this.f43990d, dVar);
            case 6:
                return new j((oo.t) this.f43990d, dVar, 6);
            case 7:
                return new j((oo.y) this.f43990d, dVar, 7);
            case 8:
                return new j(8, (p0.f) this.f43989c, (mt.l0) this.f43990d, dVar);
            case 9:
                j jVar3 = new j((ph.a0) this.f43990d, dVar, 9);
                jVar3.f43989c = obj;
                return jVar3;
            case 10:
                return new j(10, (qn.a) this.f43989c, (String) this.f43990d, dVar);
            case 11:
                j jVar4 = new j((fz.e) this.f43990d, dVar, 11);
                jVar4.f43989c = obj;
                return jVar4;
            case 12:
                return new j(12, (rt.y) this.f43989c, (rt.u) this.f43990d, dVar);
            case 13:
                return new j(13, (rt.v0) this.f43989c, (rt.z0) this.f43990d, dVar);
            case 14:
                return new j((j2) this.f43990d, dVar, 14);
            case 15:
                return new j(15, (j2) this.f43989c, (rt.n1) this.f43990d, dVar);
            case 16:
                return new j(16, (j2) this.f43989c, (List) this.f43990d, dVar);
            case 17:
                return new j(17, (j2) this.f43989c, (q2) this.f43990d, dVar);
            case 18:
                return new j(18, (e3) this.f43989c, (List) this.f43990d, dVar);
            case 19:
                j jVar5 = new j((e3) this.f43990d, dVar, 19);
                jVar5.f43989c = obj;
                return jVar5;
            case 20:
                return new j(20, (b4) this.f43989c, (List) this.f43990d, dVar);
            case 21:
                return new j(21, (r5) this.f43989c, (w4) this.f43990d, dVar);
            case 22:
                j jVar6 = new j((wt.b0) this.f43990d, dVar, 22);
                jVar6.f43989c = obj;
                return jVar6;
            case 23:
                return new j(23, (e9) this.f43989c, (l9) this.f43990d, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return new j(24, (dd) this.f43989c, (vt.n0) this.f43990d, dVar);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                j jVar7 = new j((dd) this.f43990d, dVar, 25);
                jVar7.f43989c = obj;
                return jVar7;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                j jVar8 = new j((jd) this.f43990d, dVar, 26);
                jVar8.f43989c = obj;
                return jVar8;
            case 27:
                j jVar9 = new j((rv.b) this.f43990d, dVar, 27);
                jVar9.f43989c = obj;
                return jVar9;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new j(28, (s2.w) this.f43989c, (z0) this.f43990d, dVar);
            default:
                return new j(29, (s9.a) this.f43989c, (Uri) this.f43990d, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f43987a) {
            case 0:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((j) create((e1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((j) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((j) create((r5.b) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((j) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((j) create((Set) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((j) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((j) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((j) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:421:0x0afd  */
    /* JADX WARN: Code duplicated, block: B:424:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:429:0x0b1c A[LOOP:10: B:428:0x0b1a->B:429:0x0b1c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:481:0x0b19 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0b39 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:? A[LOOP:11: B:422:0x0b01->B:483:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x03bf, code lost:
    
        if (((bh.a1) r12).i(r0, false, r53) == r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x044a, code lost:
    
        if (((bh.a1) r12).i(r0, false, r53) == r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x04d5, code lost:
    
        if (((bh.a1) r12).i(r0, false, r53) == r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0562, code lost:
    
        if (((bh.a1) r12).i(r0, false, r53) == r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x05ec, code lost:
    
        if (((bh.a1) r12).i(r0, false, r53) == r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0678, code lost:
    
        if (((bh.a1) r12).i(r0, false, r53) == r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0705, code lost:
    
        if (((bh.a1) r12).i(r0, false, r53) == r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x085a, code lost:
    
        if (r1.emit(r3, r53) == r2) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0b35, code lost:
    
        if (rz.e0.m(800, r53) == r1) goto L432;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:?, code lost:
    
        return r2;
     */
    @Override // xy.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instruction units count: 3154
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ns.j.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f43987a = i11;
        this.f43990d = obj;
    }
}
