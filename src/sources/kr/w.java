package kr;

import a0.b2;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.Toast;
import androidx.lifecycle.ViewModelKt;
import com.google.android.gms.internal.play_billing.zzbt;
import com.google.api.Service;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseACK;
import com.lingodeer.data.model.CoursePracticeType;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.DbFileVersion;
import com.lingodeer.data.model.SyllableWriteLesson;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import l0.Eeqr.HOBXIlHxIkMBEA;
import l1.c2;
import l1.s1;
import l1.y2;
import mt.m2;
import n9.y1;
import rt.b4;
import rz.z1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class w extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f38602c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f38603d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f38604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i11, Object obj, Object obj2, String str, vy.d dVar) {
        super(2, dVar);
        this.f38600a = i11;
        this.f38603d = obj;
        this.f38604e = obj2;
        this.f38602c = str;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0075  */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
    
        if (r2.emit(r12, r11) == r3) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object j(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f38602c
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r11.f38604e
            no.s r1 = (no.s) r1
            java.lang.Object r2 = r11.f38603d
            uz.j r2 = (uz.j) r2
            wy.a r3 = wy.a.COROUTINE_SUSPENDED
            int r4 = r11.f38601b
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            java.lang.String r9 = "removeValue(...)"
            r10 = 0
            if (r4 == 0) goto L3a
            if (r4 == r8) goto L36
            if (r4 == r7) goto L32
            if (r4 == r6) goto L2e
            if (r4 != r5) goto L26
            com.bumptech.glide.e.F(r12)
            goto L98
        L26:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2e:
            com.bumptech.glide.e.F(r12)
            goto L8b
        L32:
            com.bumptech.glide.e.F(r12)
            goto L71
        L36:
            com.bumptech.glide.e.F(r12)
            goto L57
        L3a:
            com.bumptech.glide.e.F(r12)
            com.google.firebase.database.DatabaseReference r12 = r1.f43916a
            if (r12 == 0) goto La7
            com.google.firebase.database.DatabaseReference r12 = r12.e(r0)
            com.google.android.gms.tasks.Task r12 = r12.h(r10)
            kotlin.jvm.internal.m.e(r12, r9)
            r11.f38603d = r2
            r11.f38601b = r8
            java.lang.Object r12 = se.p.M(r12, r11)
            if (r12 != r3) goto L57
            goto L97
        L57:
            com.google.firebase.database.DatabaseReference r12 = r1.f43918c
            if (r12 == 0) goto La1
            com.google.firebase.database.DatabaseReference r12 = r12.e(r0)
            com.google.android.gms.tasks.Task r12 = r12.h(r10)
            kotlin.jvm.internal.m.e(r12, r9)
            r11.f38603d = r2
            r11.f38601b = r7
            java.lang.Object r12 = se.p.M(r12, r11)
            if (r12 != r3) goto L71
            goto L97
        L71:
            com.google.firebase.database.DatabaseReference r12 = r1.f43917b
            if (r12 == 0) goto L9b
            com.google.firebase.database.DatabaseReference r12 = r12.e(r0)
            com.google.android.gms.tasks.Task r12 = r12.h(r10)
            kotlin.jvm.internal.m.e(r12, r9)
            r11.f38603d = r2
            r11.f38601b = r6
            java.lang.Object r12 = se.p.M(r12, r11)
            if (r12 != r3) goto L8b
            goto L97
        L8b:
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            r11.f38603d = r10
            r11.f38601b = r5
            java.lang.Object r12 = r2.emit(r12, r11)
            if (r12 != r3) goto L98
        L97:
            return r3
        L98:
            qy.b0 r12 = qy.b0.f48488a
            return r12
        L9b:
            java.lang.String r12 = "mLatestUserDb"
            kotlin.jvm.internal.m.n(r12)
            throw r10
        La1:
            java.lang.String r12 = "mTopUserDb"
            kotlin.jvm.internal.m.n(r12)
            throw r10
        La7:
            java.lang.String r12 = "mUserDb"
            kotlin.jvm.internal.m.n(r12)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kr.w.j(java.lang.Object):java.lang.Object");
    }

    private final Object m(Object obj) {
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f38601b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            pl.d dVarO = pl.d.f46951b.o();
            String str = (String) this.f38602c;
            String str2 = (String) this.f38603d;
            ob.m mVar = new ob.m((oo.t) this.f38604e, str2, str, 26);
            this.f38601b = 1;
            if (dVarO.a("story/", str, str2, mVar, this) == aVar) {
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

    /* JADX WARN: Code duplicated, block: B:40:0x00d4  */
    private final Object n(Object obj) {
        Object objR;
        p0.f fVar = (p0.f) this.f38602c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f38601b;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
            return b0Var;
        }
        com.bumptech.glide.e.F(obj);
        f0.i iVar = fVar.Q;
        m2 m2Var = new m2(fVar, (y2.k1) this.f38603d, (d2.c) this.f38604e);
        this.f38601b = 1;
        iVar.getClass();
        f2.c cVar = (f2.c) m2Var.invoke();
        if (cVar == null || iVar.V0(cVar, iVar.Y)) {
            objR = b0Var;
        } else {
            rz.m mVar = new rz.m(1, ue.f.x(this));
            mVar.s();
            f0.g gVar = new f0.g(m2Var, mVar);
            f0.a aVar2 = iVar.U;
            n1.e eVar = aVar2.f26179a;
            f2.c cVar2 = (f2.c) m2Var.invoke();
            if (cVar2 == null) {
                mVar.resumeWith(b0Var);
            } else {
                mVar.u(new com.google.accompanist.permissions.a(12, aVar2, gVar));
                lz.g gVarU = hz.b.U(0, eVar.f43114c);
                int i12 = gVarU.f40532a;
                int i13 = gVarU.f40533b;
                if (i12 > i13) {
                    eVar.b(0, gVar);
                    break;
                }
                while (true) {
                    f2.c cVar3 = (f2.c) ((f0.g) eVar.f43112a[i13]).f26275a.invoke();
                    if (cVar3 != null) {
                        f2.c cVarE = cVar2.e(cVar3);
                        if (!cVarE.equals(cVar2)) {
                            if (!cVarE.equals(cVar3)) {
                                CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                int i14 = eVar.f43114c - 1;
                                if (i14 <= i13) {
                                    while (true) {
                                        ((f0.g) eVar.f43112a[i13]).f26276b.k(cancellationException);
                                        if (i14 == i13) {
                                            break;
                                        }
                                        i14++;
                                    }
                                }
                            }
                        } else {
                            eVar.b(i13 + 1, gVar);
                            break;
                        }
                    }
                    if (i13 == i12) {
                        eVar.b(0, gVar);
                        break;
                    }
                    i13--;
                }
                if (!iVar.Z) {
                    iVar.W0();
                }
            }
            objR = mVar.r();
            if (objR != wy.a.COROUTINE_SUSPENDED) {
                objR = b0Var;
            }
        }
        return objR == aVar ? aVar : b0Var;
    }

    private final Object o(Object obj) {
        Bitmap bitmap = (Bitmap) this.f38603d;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f38601b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            Context context = (Context) this.f38602c;
            this.f38601b = 1;
            obj = ks.b.g(context, bitmap, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.bumptech.glide.e.F(obj);
        }
        ((fz.e) this.f38604e).invoke((Uri) obj, bitmap);
        return qy.b0.f48488a;
    }

    private final Object p(Object obj) {
        String str;
        Object value;
        qv.e eVar = (qv.e) this.f38604e;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f38601b;
        qy.b0 b0Var = qy.b0.f48488a;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            String strD = c.a.d((SyllableWriteLesson) this.f38603d);
            vt.n0 n0Var = eVar.f48430a;
            this.f38602c = strD;
            this.f38601b = 1;
            fr.o0 o0Var = (fr.o0) n0Var;
            o0Var.getClass();
            yz.f fVar = rz.o0.f50940a;
            Object objM = rz.e0.M(yz.e.f58387a, new fr.i0(o0Var, strD, null, 6), this);
            if (objM != aVar) {
                objM = b0Var;
            }
            if (objM == aVar) {
                return aVar;
            }
            str = strD;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.f38602c;
            com.bumptech.glide.e.F(obj);
        }
        uz.i1 i1Var = eVar.f48433d;
        do {
            value = i1Var.getValue();
        } while (!i1Var.j(value, str));
        return b0Var;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r1v16, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v22, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f38600a) {
            case 0:
                return new w(0, (h) this.f38603d, (b0) this.f38604e, dVar);
            case 1:
                w wVar = new w((z0) this.f38604e, dVar, 1);
                wVar.f38603d = obj;
                return wVar;
            case 2:
                return new w(this.f38603d, (String) this.f38602c, (String) this.f38604e, dVar, 2);
            case 3:
                return new w((a1) this.f38602c, (List) this.f38603d, (d1) this.f38604e, dVar, 3);
            case 4:
                w wVar2 = new w(4, (c2) this.f38603d, (l1.w0) this.f38604e, dVar);
                wVar2.f38602c = obj;
                return wVar2;
            case 5:
                w wVar3 = new w(5, (vy.i) this.f38603d, (uz.i) this.f38604e, dVar);
                wVar3.f38602c = obj;
                return wVar3;
            case 6:
                w wVar4 = new w(6, (fz.e) this.f38603d, (h2.d) this.f38604e, dVar);
                wVar4.f38602c = obj;
                return wVar4;
            case 7:
                return new w(this.f38603d, (String) this.f38602c, (String) this.f38604e, dVar, 7);
            case 8:
                w wVar5 = new w(8, (mr.e) this.f38603d, (ArrayList) this.f38604e, dVar);
                wVar5.f38602c = obj;
                return wVar5;
            case 9:
                return new w((j2.c) this.f38602c, (Context) this.f38603d, (CourseACK) this.f38604e, dVar, 9);
            case 10:
                return new w(10, (o0.b) this.f38603d, (l1.b1) this.f38604e, (String) this.f38602c, dVar);
            case 11:
                return new w((rt.m2) this.f38602c, (l1.b1) this.f38603d, (l1.b1) this.f38604e, dVar, 11);
            case 12:
                return new w(12, (b4) this.f38603d, (fz.c) this.f38604e, (String) this.f38602c, dVar);
            case 13:
                w wVar6 = new w((n5.v) this.f38604e, dVar, 13);
                wVar6.f38603d = obj;
                return wVar6;
            case 14:
                w wVar7 = new w(14, (n5.v) this.f38603d, (fz.e) this.f38604e, dVar);
                wVar7.f38602c = obj;
                return wVar7;
            case 15:
                w wVar8 = new w((File) this.f38604e, dVar, 15);
                wVar8.f38603d = obj;
                return wVar8;
            case 16:
                w wVar9 = new w((a9.i) this.f38604e, dVar, 16);
                wVar9.f38603d = obj;
                return wVar9;
            case 17:
                w wVar10 = new w((rz.h1) this.f38603d, (fz.e) this.f38604e, dVar);
                wVar10.f38602c = obj;
                return wVar10;
            case 18:
                w wVar11 = new w((fz.f) this.f38603d, (b1.b) this.f38604e, dVar);
                wVar11.f38602c = obj;
                return wVar11;
            case 19:
                w wVar12 = new w(19, (tz.h) this.f38603d, (n9.w0) this.f38604e, dVar);
                wVar12.f38602c = obj;
                return wVar12;
            case 20:
                return new w((n9.f0) this.f38602c, (o9.a) this.f38603d, (n9.e1) this.f38604e, dVar, 20);
            case 21:
                w wVar13 = new w((tz.h) this.f38603d, (fz.e) this.f38604e, dVar);
                wVar13.f38602c = obj;
                return wVar13;
            case 22:
                w wVar14 = new w(22, (lp.b) this.f38603d, (fz.c) this.f38604e, dVar);
                wVar14.f38602c = obj;
                return wVar14;
            case 23:
                return new w(23, (List) this.f38603d, (ni.m) this.f38604e, (String) this.f38602c, dVar);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                w wVar15 = new w((no.s) this.f38604e, (String) this.f38602c, dVar);
                wVar15.f38603d = obj;
                return wVar15;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new w((String) this.f38602c, (String) this.f38603d, (oo.t) this.f38604e, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new w((p0.f) this.f38602c, (y2.k1) this.f38603d, (d2.c) this.f38604e, dVar, 26);
            case 27:
                return new w((Context) this.f38602c, (Bitmap) this.f38603d, (fz.e) this.f38604e, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return new w(28, (SyllableWriteLesson) this.f38603d, (qv.e) this.f38604e, dVar);
            default:
                return new w(29, (vt.e) this.f38603d, (rt.j) this.f38604e, (String) this.f38602c, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f38600a) {
            case 0:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((w) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                return ((w) create((s1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 6:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 7:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((w) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((w) create((tz.t) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((w) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((w) create((y1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((w) create(obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((w) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((w) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f38600a = i11;
        this.f38603d = obj;
        this.f38604e = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x007a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085 A[PHI: r13
      0x0085: PHI (r13v3 kr.w) = (r13v0 kr.w), (r13v0 kr.w), (r13v4 kr.w) binds: [B:21:0x0078, B:23:0x0081, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x016f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0173  */
    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:77:0x018f A[PHI: r13
      0x018f: PHI (r13v7 kr.w) = (r13v0 kr.w), (r13v0 kr.w), (r13v8 kr.w) binds: [B:73:0x0183, B:75:0x018c, B:7:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:92:0x0209 A[LOOP:0: B:90:0x0203->B:92:0x0209, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (o9.a.a(r5, r6, r7, r8, true, r10, r11, r12, r13) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r0 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ac, code lost:
    
        if (r0 == r1) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kr.w.e(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:481:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:550:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[LOOP:2: B:153:0x02e8->B:552:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v118, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r3v101, types: [fz.f, xy.i] */
    /* JADX WARN: Type inference failed for: r3v99, types: [fz.e, xy.i] */
    @Override // xy.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        Object value3;
        String strN;
        Object objM;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        boolean z11;
        Object value8;
        Object objB;
        Object objB2;
        Object objL;
        AtomicReference atomicReference;
        Object objM2;
        Object objO;
        Object objI;
        uz.j jVar;
        Object objM3;
        n5.x0 x0Var;
        uz.j jVar2;
        n5.x0 x0Var2;
        uz.q qVar;
        tz.t tVar;
        n5.o0 o0Var;
        uz.j jVar3;
        Object objV;
        Iterator it;
        ry.v vVar;
        rz.g1 g1Var;
        Object objY;
        rz.g1 g1Var2;
        Object objO2;
        int i11 = 21;
        int i12 = 6;
        int i13 = 5;
        int i14 = 4;
        int i15 = 3;
        int i16 = 2;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        boolean z24 = false;
        zBooleanValue = false;
        int i17 = 0;
        boolean zBooleanValue = false;
        boolean z25 = false;
        int i18 = 0;
        int i19 = 1;
        switch (this.f38600a) {
            case 0:
                h hVar = (h) this.f38603d;
                b0 b0Var = (b0) this.f38604e;
                uz.i1 i1Var = b0Var.H;
                av.n nVar = b0Var.f38426c;
                uz.i1 i1Var2 = b0Var.O;
                uz.i1 i1Var3 = b0Var.P;
                uz.i1 i1Var4 = b0Var.K;
                wy.a aVar = wy.a.COROUTINE_SUSPENDED;
                int i21 = this.f38601b;
                if (i21 == 0) {
                    com.bumptech.glide.e.F(obj);
                    if (hVar instanceof d) {
                        rz.e0.B(ViewModelKt.getViewModelScope(b0Var), null, null, new kb.e(i19, b0Var, hVar, z14 ? 1 : 0), 3);
                        n nVar2 = ((d) hVar).f38439a;
                        if (nVar2.f38540h) {
                            do {
                                value6 = i1Var3.getValue();
                            } while (!i1Var3.j(value6, ry.m.G0(nVar2.f38533a, (List) value6)));
                            do {
                                value7 = i1Var2.getValue();
                            } while (!i1Var2.j(value7, ry.m.F0((List) value7, nVar2.f38533a)));
                        } else {
                            do {
                                value4 = i1Var2.getValue();
                            } while (!i1Var2.j(value4, ry.m.G0(nVar2.f38533a, (List) value4)));
                            do {
                                value5 = i1Var3.getValue();
                            } while (!i1Var3.j(value5, ry.m.F0((List) value5, nVar2.f38533a)));
                        }
                    } else if (hVar instanceof f) {
                        qy.q qVar2 = fv.b.f28186a;
                        strN = fv.b.N(b0Var.f38428e, ((f) hVar).f38456a.f38533a);
                        yz.f fVar = rz.o0.f50940a;
                        yz.e eVar = yz.e.f58387a;
                        aq.a aVar2 = new aq.a(strN, z13 ? 1 : 0, i14);
                        this.f38602c = strN;
                        this.f38601b = 1;
                        objM = rz.e0.M(eVar, aVar2, this);
                        if (objM == aVar) {
                            return aVar;
                        }
                    } else if (hVar instanceof g) {
                        uz.i1 i1Var5 = b0Var.f38430t;
                        do {
                            value2 = i1Var5.getValue();
                        } while (!i1Var5.j(value2, ((g) hVar).f38462a));
                        do {
                            value3 = i1Var.getValue();
                            ((Boolean) value3).getClass();
                        } while (!i1Var.j(value3, Boolean.TRUE));
                    } else if (hVar.equals(e.f38453a)) {
                        do {
                            value = i1Var.getValue();
                            ((Boolean) value).getClass();
                        } while (!i1Var.j(value, Boolean.TRUE));
                    } else {
                        if (!hVar.equals(c.f38432a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        rz.e0.B(ViewModelKt.getViewModelScope(b0Var), null, null, new q(b0Var, z12 ? 1 : 0, i19), 3);
                    }
                    return qy.b0.f48488a;
                }
                if (i21 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                strN = (String) this.f38602c;
                com.bumptech.glide.e.F(obj);
                objM = obj;
                boolean zBooleanValue2 = ((Boolean) objM).booleanValue();
                nVar.g();
                z1 z1Var = b0Var.N;
                if (z1Var != null) {
                    z1Var.cancel(null);
                }
                i iVar = (i) i1Var4.getValue();
                String str = iVar != null ? iVar.f38491a : null;
                n nVar3 = ((f) hVar).f38456a;
                boolean zA = kotlin.jvm.internal.m.a(str, nVar3.f38533a);
                while (true) {
                    Object value9 = i1Var4.getValue();
                    i iVar2 = (i) value9;
                    String str2 = nVar3.f38533a;
                    if (!zA) {
                        z11 = true;
                    } else if (iVar2 != null ? iVar2.f38492b : z24) {
                        z11 = z24;
                    } else {
                        z11 = true;
                    }
                    if (i1Var4.j(value9, new i(str2, z11, zBooleanValue2 ? 1.0f : 0.0f, (zA && iVar2 != null) ? iVar2.f38494d : 0))) {
                        if (!zA) {
                            uz.i1 i1Var6 = b0Var.L;
                            do {
                                value8 = i1Var6.getValue();
                                ((Number) value8).floatValue();
                            } while (!i1Var6.j(value8, new Float(CropImageView.DEFAULT_ASPECT_RATIO)));
                        }
                        i iVar3 = (i) i1Var4.getValue();
                        if (iVar3 != null && iVar3.f38492b) {
                            nVar.l();
                        }
                        if (!zBooleanValue2) {
                            String str3 = nVar3.f38533a;
                            String strConcat = "https://lingodeer.oss-us-west-1.aliyuncs.com/".concat(nVar3.f38536d);
                            ch.b0 b0Var2 = new ch.b0(b0Var, 23);
                            fv.c cVar = b0Var.f38425b;
                            fv.a aVar3 = new fv.a(6L, strConcat, strN);
                            uv.b bVar = b0Var.M;
                            if (bVar != null) {
                                cVar.a(bVar.a());
                            }
                            cVar.d(aVar3, new v(b0Var, b0Var2, str3, aVar3, strN));
                        }
                        return qy.b0.f48488a;
                    }
                    z24 = false;
                }
                break;
            case 1:
                uz.j jVar4 = (uz.j) this.f38603d;
                wy.a aVar4 = wy.a.COROUTINE_SUSPENDED;
                int i22 = this.f38601b;
                if (i22 != 0) {
                    if (i22 == 1) {
                        jVar4 = (uz.j) this.f38602c;
                        com.bumptech.glide.e.F(obj);
                        objB = obj;
                    } else {
                        if (i22 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                wt.o0 o0Var2 = ((z0) this.f38604e).f38629c;
                CoursePracticeType coursePracticeType = CoursePracticeType.COURSE_STORY_SPEAKING;
                this.f38603d = null;
                this.f38602c = jVar4;
                this.f38601b = 1;
                objB = wt.o0.b(o0Var2, coursePracticeType, 0, this, 6);
                if (objB == aVar4) {
                    return aVar4;
                }
                this.f38603d = null;
                this.f38602c = null;
                this.f38601b = 2;
                if (jVar4.emit(objB, this) == aVar4) {
                    return aVar4;
                }
                return qy.b0.f48488a;
            case 2:
                z0 z0Var = (z0) this.f38603d;
                wy.a aVar5 = wy.a.COROUTINE_SUSPENDED;
                int i23 = this.f38601b;
                if (i23 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar2 = rz.o0.f50940a;
                    yz.e eVar2 = yz.e.f58387a;
                    aq.a aVar6 = new aq.a((String) this.f38604e, z15 ? 1 : 0, i13);
                    this.f38601b = 1;
                    if (rz.e0.M(eVar2, aVar6, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i23 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                new no.s(z0Var.f38632f).a(((fr.o0) z0Var.f38627a).w(), "story/" + ((String) this.f38602c));
                return qy.b0.f48488a;
            case 3:
                d1 d1Var = (d1) this.f38604e;
                List list = (List) this.f38603d;
                a1 a1Var = (a1) this.f38602c;
                wy.a aVar7 = wy.a.COROUTINE_SUSPENDED;
                int i24 = this.f38601b;
                if (i24 == 0) {
                    com.bumptech.glide.e.F(obj);
                    List<CourseWord> displayCourseWords = a1Var.f38410a.f34557a.getDisplayCourseWords();
                    this.f38601b = 1;
                    objB2 = jt.h1.b(displayCourseWords, list, this);
                    if (objB2 == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i24 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objB2 = obj;
                }
                qy.l lVar = (qy.l) objB2;
                List list2 = (List) lVar.f48495a;
                float fFloatValue = ((Number) lVar.f48496b).floatValue();
                Objects.toString(d1Var);
                Objects.toString(list);
                int i25 = 0;
                for (Object obj2 : list2) {
                    int i26 = i25 + 1;
                    if (i25 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    CourseWord courseWord = (CourseWord) obj2;
                    courseWord.getSpeechScore();
                    courseWord.toString();
                    i25 = i26;
                }
                kotlin.jvm.internal.m.d(d1Var, "null cannot be cast to non-null type com.lingo.story.viewmodels.StorySpeakingUiState.Success");
                c1 c1Var = (c1) d1Var;
                List list3 = c1Var.f38434a;
                ArrayList arrayList = new ArrayList(ry.n.W(list3, 10));
                for (Object obj3 : list3) {
                    int i27 = i18 + 1;
                    if (i18 < 0) {
                        ns.o.V();
                        throw null;
                    }
                    a1 a1VarA = (a1) obj3;
                    if (a1Var.f38410a.f34557a.getSentenceId() == a1VarA.f38410a.f34557a.getSentenceId()) {
                        ir.b bVar2 = a1VarA.f38410a;
                        a1VarA = a1.a(a1VarA, ir.b.a(bVar2, CourseSentence.copy$default(bVar2.f34557a, 0L, null, null, null, null, null, null, null, null, false, false, false, null, list2, null, null, null, null, null, null, null, fFloatValue, 0, 6283263, null)), false, false, false, false, false, 0, 202);
                    }
                    arrayList.add(a1VarA);
                    i18 = i27;
                }
                return c1.a(c1Var, arrayList, 0, false, false, 30);
            case 4:
                wy.a aVar8 = wy.a.COROUTINE_SUSPENDED;
                int i28 = this.f38601b;
                if (i28 == 0) {
                    com.bumptech.glide.e.F(obj);
                    rz.b0 b0Var3 = (rz.b0) this.f38602c;
                    c2 c2Var = (c2) this.f38603d;
                    l1.w0 w0Var = (l1.w0) this.f38604e;
                    this.f38601b = 1;
                    if (c2Var.invoke(b0Var3, w0Var, this) == aVar8) {
                        return aVar8;
                    }
                } else {
                    if (i28 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 5:
                uz.i iVar4 = (uz.i) this.f38604e;
                vy.i iVar5 = (vy.i) this.f38603d;
                wy.a aVar9 = wy.a.COROUTINE_SUSPENDED;
                int i29 = this.f38601b;
                if (i29 == 0) {
                    com.bumptech.glide.e.F(obj);
                    s1 s1Var = (s1) this.f38602c;
                    if (kotlin.jvm.internal.m.a(iVar5, vy.j.f54321a)) {
                        y2 y2Var = new y2(s1Var, 0);
                        this.f38601b = 1;
                        if (iVar4.collect(y2Var, this) == aVar9) {
                            return aVar9;
                        }
                    } else {
                        kb.e eVar3 = new kb.e(i13, iVar4, s1Var, z16 ? 1 : 0);
                        this.f38601b = 2;
                        if (rz.e0.M(iVar5, eVar3, this) == aVar9) {
                            return aVar9;
                        }
                    }
                } else {
                    if (i29 != 1 && i29 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 6:
                wy.a aVar10 = wy.a.COROUTINE_SUSPENDED;
                int i30 = this.f38601b;
                if (i30 == 0) {
                    com.bumptech.glide.e.F(obj);
                    rz.b0 b0Var4 = (rz.b0) this.f38602c;
                    AtomicReference atomicReference2 = new AtomicReference(null);
                    b0.x0 x0Var3 = new b0.x0((fz.e) this.f38603d, (h2.d) this.f38604e, b0Var4, atomicReference2, null, 16);
                    this.f38602c = atomicReference2;
                    this.f38601b = 1;
                    objL = rz.e0.l(x0Var3, this);
                    if (objL == aVar10) {
                        return aVar10;
                    }
                    atomicReference = atomicReference2;
                } else {
                    if (i30 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atomicReference = (AtomicReference) this.f38602c;
                    com.bumptech.glide.e.F(obj);
                    objL = obj;
                }
                rz.g1 g1Var3 = (rz.g1) atomicReference.get();
                if (g1Var3 != null) {
                    g1Var3.cancel(null);
                }
                return objL;
            case 7:
                String str4 = (String) this.f38602c;
                mr.e eVar4 = (mr.e) this.f38603d;
                wy.a aVar11 = wy.a.COROUTINE_SUSPENDED;
                int i31 = this.f38601b;
                try {
                    if (i31 != 0) {
                        if (i31 == 1) {
                            com.bumptech.glide.e.F(obj);
                            objM2 = obj;
                        } else {
                            if (i31 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            com.bumptech.glide.e.F(obj);
                        }
                        z25 = true;
                        return Boolean.valueOf(z25);
                    }
                    com.bumptech.glide.e.F(obj);
                    String str5 = ((String) this.f38604e) + str4;
                    this.f38601b = 1;
                    yz.f fVar3 = rz.o0.f50940a;
                    objM2 = rz.e0.M(yz.e.f58387a, new mr.c(str5, eVar4, null), this);
                    if (objM2 == aVar11) {
                        return aVar11;
                    }
                    long jLongValue = ((Number) objM2).longValue();
                    vt.h1 h1Var = eVar4.f41200a;
                    DbFileVersion dbFileVersion = new DbFileVersion(str4, jLongValue, true);
                    this.f38601b = 2;
                    yz.f fVar4 = rz.o0.f50940a;
                    Object objM4 = rz.e0.M(yz.e.f58387a, new e6.q0(i11, h1Var, (Object) dbFileVersion, (vy.d) (z17 ? 1 : 0)), this);
                    if (objM4 != aVar11) {
                        objM4 = qy.b0.f48488a;
                    }
                    if (objM4 == aVar11) {
                        return aVar11;
                    }
                    z25 = true;
                } catch (Exception unused) {
                }
                return Boolean.valueOf(z25);
            case 8:
                ArrayList arrayList2 = (ArrayList) this.f38604e;
                mr.e eVar5 = (mr.e) this.f38603d;
                rz.b0 b0Var5 = (rz.b0) this.f38602c;
                wy.a aVar12 = wy.a.COROUTINE_SUSPENDED;
                int i32 = this.f38601b;
                try {
                    if (i32 == 0) {
                        com.bumptech.glide.e.F(obj);
                        arrayList2.size();
                        kb.e eVar6 = new kb.e(15, eVar5, arrayList2, z18 ? 1 : 0);
                        this.f38602c = b0Var5;
                        this.f38601b = 1;
                        objO = rz.e0.O(300000L, eVar6, this);
                        if (objO == aVar12) {
                            return aVar12;
                        }
                    } else {
                        if (i32 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        objO = obj;
                    }
                    Boolean bool = (Boolean) objO;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    break;
                } catch (Exception unused2) {
                }
                return Boolean.valueOf(zBooleanValue);
            case 9:
                Context context = (Context) this.f38603d;
                wy.a aVar13 = wy.a.COROUTINE_SUSPENDED;
                int i33 = this.f38601b;
                if (i33 != 0) {
                    if (i33 == 1) {
                        com.bumptech.glide.e.F(obj);
                        objI = obj;
                    } else {
                        if (i33 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    Toast.makeText(context, context.getString(R.string.successfully_saved_to_device_album), 0).show();
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                j2.c cVar2 = (j2.c) this.f38602c;
                this.f38601b = 1;
                objI = cVar2.i(this);
                if (objI == aVar13) {
                    return aVar13;
                }
                Bitmap bitmapA = g2.i.a((g2.h) objI);
                String bookmarkId = ((CourseACK) this.f38604e).getBookmarkId();
                this.f38601b = 2;
                if (ks.b.h(context, bitmapA, bookmarkId, this) == aVar13) {
                    return aVar13;
                }
                Toast.makeText(context, context.getString(R.string.successfully_saved_to_device_album), 0).show();
                return qy.b0.f48488a;
            case 10:
                wy.a aVar14 = wy.a.COROUTINE_SUSPENDED;
                int i34 = this.f38601b;
                if (i34 == 0) {
                    com.bumptech.glide.e.F(obj);
                    List list4 = (List) ((l1.b1) this.f38604e).getValue();
                    String str6 = (String) this.f38602c;
                    Iterator it2 = list4.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            i17 = -1;
                        } else if (!kotlin.jvm.internal.m.a(((CourseACK) it2.next()).getUnitName(), str6)) {
                            i17++;
                        }
                    }
                    if (i17 != -1) {
                        o0.b bVar3 = (o0.b) this.f38603d;
                        this.f38601b = 1;
                        if (o0.t.t(bVar3, i17, this) == aVar14) {
                            return aVar14;
                        }
                    }
                } else {
                    if (i34 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 11:
                wy.a aVar15 = wy.a.COROUTINE_SUSPENDED;
                int i35 = this.f38601b;
                if (i35 == 0) {
                    com.bumptech.glide.e.F(obj);
                    yz.f fVar5 = rz.o0.f50940a;
                    yz.e eVar7 = yz.e.f58387a;
                    ad.y yVar = new ad.y((rt.m2) this.f38602c, (l1.b1) this.f38603d, (l1.b1) this.f38604e, (vy.d) null, 19);
                    this.f38601b = 1;
                    if (rz.e0.M(eVar7, yVar, this) == aVar15) {
                        return aVar15;
                    }
                } else {
                    if (i35 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 12:
                wy.a aVar16 = wy.a.COROUTINE_SUSPENDED;
                int i36 = this.f38601b;
                if (i36 == 0) {
                    com.bumptech.glide.e.F(obj);
                    b4 b4Var = (b4) this.f38603d;
                    this.f38601b = 1;
                    if (b4Var.i(this) == aVar16) {
                        return aVar16;
                    }
                } else {
                    if (i36 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                ((fz.c) this.f38604e).invoke((String) this.f38602c);
                return qy.b0.f48488a;
            case 13:
                qy.b0 b0Var6 = qy.b0.f48488a;
                n5.v vVar2 = (n5.v) this.f38604e;
                wy.a aVar17 = wy.a.COROUTINE_SUSPENDED;
                int i37 = this.f38601b;
                if (i37 == 0) {
                    com.bumptech.glide.e.F(obj);
                    jVar = (uz.j) this.f38603d;
                    this.f38603d = jVar;
                    this.f38601b = 1;
                    objM3 = rz.e0.M(vVar2.f43400c.getCoroutineContext(), new n5.l(vVar2, z19 ? 1 : 0, i16), this);
                    if (objM3 != aVar17) {
                    }
                    return aVar17;
                }
                if (i37 == 1) {
                    jVar = (uz.j) this.f38603d;
                    com.bumptech.glide.e.F(obj);
                    objM3 = obj;
                } else {
                    if (i37 != 2) {
                        if (i37 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                        return b0Var6;
                    }
                    x0Var2 = (n5.c) this.f38602c;
                    jVar2 = (uz.j) this.f38603d;
                    com.bumptech.glide.e.F(obj);
                }
                uz.j jVar5 = jVar2;
                x0Var = x0Var2;
                jVar = jVar5;
                qVar = new uz.q(new gp.r(new n9.n1(new n9.n1(new n9.n1(new n5.l(vVar2, z22 ? 1 : 0, z24 ? 1 : 0), (uz.i1) vVar2.f43405h.f40203b), new ej.j(i16, i16, z21 ? 1 : 0), 4), new iv.h0(x0Var, z20 ? 1 : 0, 27), 3), i15), new gq.b(vVar2, null));
                this.f38603d = null;
                this.f38602c = null;
                this.f38601b = 3;
                if (uz.x0.q(jVar, qVar, this) != aVar17) {
                    return b0Var6;
                }
                return aVar17;
                x0Var = (n5.x0) objM3;
                if (x0Var instanceof n5.c) {
                    n5.c cVar3 = (n5.c) x0Var;
                    Object obj4 = cVar3.f43249b;
                    this.f38603d = jVar;
                    this.f38602c = cVar3;
                    this.f38601b = 2;
                    if (jVar.emit(obj4, this) != aVar17) {
                        jVar2 = jVar;
                        x0Var2 = x0Var;
                        uz.j jVar6 = jVar2;
                        x0Var = x0Var2;
                        jVar = jVar6;
                        qVar = new uz.q(new gp.r(new n9.n1(new n9.n1(new n9.n1(new n5.l(vVar2, z22 ? 1 : 0, z24 ? 1 : 0), (uz.i1) vVar2.f43405h.f40203b), new ej.j(i16, i16, z21 ? 1 : 0), 4), new iv.h0(x0Var, z20 ? 1 : 0, 27), 3), i15), new gq.b(vVar2, null));
                        this.f38603d = null;
                        this.f38602c = null;
                        this.f38601b = 3;
                        if (uz.x0.q(jVar, qVar, this) != aVar17) {
                            return b0Var6;
                        }
                    }
                } else {
                    if (x0Var instanceof n5.y0) {
                        throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                    }
                    if (x0Var instanceof n5.q0) {
                        throw ((n5.q0) x0Var).f43362b;
                    }
                    if (x0Var instanceof n5.f0) {
                        return b0Var6;
                    }
                    qVar = new uz.q(new gp.r(new n9.n1(new n9.n1(new n9.n1(new n5.l(vVar2, z22 ? 1 : 0, z24 ? 1 : 0), (uz.i1) vVar2.f43405h.f40203b), new ej.j(i16, i16, z21 ? 1 : 0), 4), new iv.h0(x0Var, z20 ? 1 : 0, 27), 3), i15), new gq.b(vVar2, null));
                    this.f38603d = null;
                    this.f38602c = null;
                    this.f38601b = 3;
                    if (uz.x0.q(jVar, qVar, this) != aVar17) {
                        return b0Var6;
                    }
                }
                return aVar17;
            case 14:
                n5.v vVar3 = (n5.v) this.f38603d;
                wy.a aVar18 = wy.a.COROUTINE_SUSPENDED;
                int i38 = this.f38601b;
                if (i38 != 0) {
                    if (i38 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    return obj;
                }
                com.bumptech.glide.e.F(obj);
                rz.b0 b0Var7 = (rz.b0) this.f38602c;
                rz.t tVarB = rz.e0.b();
                n5.h0 h0Var = new n5.h0((fz.e) this.f38604e, tVarB, vVar3.f43405h.b(), b0Var7.getCoroutineContext());
                dm.c cVar4 = vVar3.f43409l;
                Object objI2 = ((tz.h) cVar4.f23492d).i(h0Var);
                if (objI2 instanceof tz.m) {
                    Throwable th2 = ((tz.m) objI2).f52705a;
                    if (th2 == null) {
                        throw new ClosedSendChannelException("Channel was closed normally");
                    }
                    throw th2;
                }
                if (objI2 instanceof tz.n) {
                    throw new IllegalStateException("Check failed.");
                }
                if (((AtomicInteger) ((dm.a) cVar4.f23493e).f23485b).getAndIncrement() == 0) {
                    rz.e0.B((rz.b0) cVar4.f23490b, null, null, new kb.e((Object) cVar4, (vy.d) (z23 ? 1 : 0), 22), 3);
                }
                this.f38601b = 1;
                Object objO3 = tVarB.o(this);
                return objO3 == aVar18 ? aVar18 : objO3;
            case 15:
                wy.a aVar19 = wy.a.COROUTINE_SUSPENDED;
                int i39 = this.f38601b;
                if (i39 != 0) {
                    if (i39 == 1) {
                        o0Var = (n5.o0) this.f38602c;
                        tVar = (tz.t) this.f38603d;
                        com.bumptech.glide.e.F(obj);
                    } else {
                        if (i39 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.bumptech.glide.e.F(obj);
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                tVar = (tz.t) this.f38603d;
                File file = (File) this.f38604e;
                a0.e eVar8 = new a0.e(17, file, tVar);
                Object obj5 = n5.p0.f43354b;
                File parentFile = file.getParentFile();
                kotlin.jvm.internal.m.c(parentFile);
                String key = parentFile.getCanonicalFile().getPath();
                synchronized (n5.p0.f43354b) {
                    try {
                        LinkedHashMap linkedHashMap = n5.p0.f43355c;
                        kotlin.jvm.internal.m.e(key, "key");
                        Object obj6 = linkedHashMap.get(key);
                        Object obj7 = obj6;
                        if (obj6 == null) {
                            n5.p0 p0Var = new n5.p0(key);
                            linkedHashMap.put(key, p0Var);
                            obj7 = p0Var;
                        }
                        n5.p0 p0Var2 = (n5.p0) obj7;
                        p0Var2.f43356a.add(eVar8);
                        if (p0Var2.f43356a.size() == 1) {
                            p0Var2.startWatching();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                n5.o0 o0Var3 = new n5.o0(z24 ? 1 : 0, key, eVar8);
                qy.b0 b0Var8 = qy.b0.f48488a;
                this.f38603d = tVar;
                this.f38602c = o0Var3;
                this.f38601b = 1;
                if (((tz.s) tVar).f52713d.f(b0Var8, this) == aVar19) {
                    return aVar19;
                }
                o0Var = o0Var3;
                a0.c0 c0Var = new a0.c0(o0Var, i11);
                this.f38603d = null;
                this.f38602c = null;
                this.f38601b = 2;
                if (se.k.i(tVar, c0Var, this) == aVar19) {
                    return aVar19;
                }
                return qy.b0.f48488a;
            case 16:
                a9.i iVar6 = (a9.i) this.f38604e;
                wy.a aVar20 = wy.a.COROUTINE_SUSPENDED;
                int i40 = this.f38601b;
                if (i40 != 0) {
                    if (i40 == 1) {
                        jVar3 = (uz.j) this.f38603d;
                        com.bumptech.glide.e.F(obj);
                        objV = obj;
                    } else {
                        if (i40 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) this.f38602c;
                        jVar3 = (uz.j) this.f38603d;
                        com.bumptech.glide.e.F(obj);
                    }
                    while (it.hasNext()) {
                        vVar = (ry.v) it.next();
                        this.f38603d = jVar3;
                        this.f38602c = it;
                        this.f38601b = 2;
                        if (jVar3.emit(vVar, this) == aVar20) {
                            return aVar20;
                        }
                    }
                    return qy.b0.f48488a;
                }
                com.bumptech.glide.e.F(obj);
                jVar3 = (uz.j) this.f38603d;
                ij.d dVar = (ij.d) iVar6.f517a;
                this.f38603d = jVar3;
                this.f38601b = 1;
                objV = dVar.v(this);
                if (objV == aVar20) {
                    return aVar20;
                }
                ((z1) iVar6.f520d).start();
                it = ((List) objV).iterator();
                while (it.hasNext()) {
                    vVar = (ry.v) it.next();
                    this.f38603d = jVar3;
                    this.f38602c = it;
                    this.f38601b = 2;
                    if (jVar3.emit(vVar, this) == aVar20) {
                        return aVar20;
                    }
                }
                return qy.b0.f48488a;
            case 17:
                wy.a aVar21 = wy.a.COROUTINE_SUSPENDED;
                int i41 = this.f38601b;
                if (i41 == 0) {
                    com.bumptech.glide.e.F(obj);
                    y1 y1Var = (y1) this.f38602c;
                    ((rz.h1) this.f38603d).invokeOnCompletion(new a0.o0(y1Var, 26));
                    ?? r9 = (xy.i) this.f38604e;
                    this.f38601b = 1;
                    if (r9.invoke(y1Var, this) == aVar21) {
                        return aVar21;
                    }
                } else {
                    if (i41 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 18:
                wy.a aVar22 = wy.a.COROUTINE_SUSPENDED;
                int i42 = this.f38601b;
                if (i42 == 0) {
                    com.bumptech.glide.e.F(obj);
                    Object obj8 = this.f38602c;
                    ?? r11 = (xy.i) this.f38603d;
                    b1.b bVar4 = (b1.b) this.f38604e;
                    this.f38601b = 1;
                    if (r11.invoke(bVar4, obj8, this) == aVar22) {
                        return aVar22;
                    }
                } else {
                    if (i42 != 1) {
                        throw new IllegalStateException(HOBXIlHxIkMBEA.SlsrvmvY);
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 19:
                wy.a aVar23 = wy.a.COROUTINE_SUSPENDED;
                int i43 = this.f38601b;
                if (i43 == 0) {
                    com.bumptech.glide.e.F(obj);
                    rz.b0 b0Var9 = (rz.b0) this.f38602c;
                    uz.d dVarM = uz.x0.m((tz.h) this.f38603d);
                    n9.u0 u0Var = new n9.u0((n9.w0) this.f38604e, b0Var9);
                    this.f38601b = 1;
                    if (dVarM.collect(u0Var, this) == aVar23) {
                        return aVar23;
                    }
                } else {
                    if (i43 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 20:
                return e(obj);
            case 21:
                wy.a aVar24 = wy.a.COROUTINE_SUSPENDED;
                int i44 = this.f38601b;
                if (i44 == 0) {
                    com.bumptech.glide.e.F(obj);
                    y1 y1Var2 = new y1((rz.b0) this.f38602c, (tz.h) this.f38603d);
                    ?? r12 = (xy.i) this.f38604e;
                    this.f38601b = 1;
                    if (r12.invoke(y1Var2, this) == aVar24) {
                        return aVar24;
                    }
                } else {
                    if (i44 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
            case 22:
                bq.f fVar6 = (bq.f) ((lp.b) this.f38603d).f40184b;
                wy.a aVar25 = wy.a.COROUTINE_SUSPENDED;
                int i45 = this.f38601b;
                if (i45 == 0) {
                    com.bumptech.glide.e.F(obj);
                    vy.g gVar = ((rz.b0) this.f38602c).getCoroutineContext().get(rz.z.f50978b);
                    if (gVar == null) {
                        throw new IllegalStateException("Internal error. coroutineScope should've created a job.");
                    }
                    g1Var = (rz.g1) gVar;
                    this.f38602c = g1Var;
                    this.f38601b = 1;
                    objY = fVar6.y(g1Var, this);
                    if (objY == aVar25) {
                        return aVar25;
                    }
                } else {
                    if (i45 != 1) {
                        if (i45 == 2) {
                            g1Var2 = (rz.g1) this.f38602c;
                            try {
                                com.bumptech.glide.e.F(obj);
                                this.f38602c = null;
                                this.f38601b = 3;
                                if (fVar6.k(g1Var2, this) == aVar25) {
                                    return aVar25;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                this.f38602c = th;
                                this.f38601b = 4;
                                if (fVar6.k(g1Var2, this) == aVar25) {
                                    return aVar25;
                                }
                                throw th;
                            }
                        } else {
                            if (i45 != 3) {
                                if (i45 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                Throwable th5 = (Throwable) this.f38602c;
                                com.bumptech.glide.e.F(obj);
                                throw th5;
                            }
                            com.bumptech.glide.e.F(obj);
                        }
                        return qy.b0.f48488a;
                    }
                    g1Var = (rz.g1) this.f38602c;
                    com.bumptech.glide.e.F(obj);
                    objY = obj;
                }
                rz.g1 g1Var4 = g1Var;
                if (((Boolean) objY).booleanValue()) {
                    try {
                        fz.c cVar5 = (fz.c) this.f38604e;
                        this.f38602c = g1Var4;
                        this.f38601b = 2;
                        if (cVar5.invoke(this) == aVar25) {
                            return aVar25;
                        }
                        g1Var2 = g1Var4;
                        this.f38602c = null;
                        this.f38601b = 3;
                        if (fVar6.k(g1Var2, this) == aVar25) {
                            return aVar25;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        g1Var2 = g1Var4;
                        this.f38602c = th;
                        this.f38601b = 4;
                        if (fVar6.k(g1Var2, this) == aVar25) {
                            return aVar25;
                        }
                        throw th;
                    }
                }
                return qy.b0.f48488a;
            case 23:
                wy.a aVar26 = wy.a.COROUTINE_SUSPENDED;
                int i46 = this.f38601b;
                if (i46 == 0) {
                    com.bumptech.glide.e.F(obj);
                    List<String> list5 = (List) this.f38603d;
                    String str7 = (String) this.f38602c;
                    ArrayList arrayList3 = new ArrayList(ry.n.W(list5, 10));
                    for (String str8 : list5) {
                        b1.p pVar = new b1.p(i14, z24);
                        pVar.f3800b = str8;
                        pVar.f3801c = str7;
                        arrayList3.add(pVar.q());
                    }
                    b2 b2Var = new b2(i12);
                    b2Var.o(arrayList3);
                    com.android.billingclient.api.d dVar2 = ((ni.m) this.f38604e).U;
                    if (dVar2 == null) {
                        kotlin.jvm.internal.m.n("billingClient");
                        throw null;
                    }
                    if (((zzbt) b2Var.f27b) == null) {
                        throw new IllegalArgumentException("Product list must be set to a non empty list.");
                    }
                    hd.b bVar5 = new hd.b(b2Var);
                    this.f38601b = 1;
                    rz.t tVarB2 = rz.e0.b();
                    a5.f fVar7 = new a5.f(i13, z24);
                    fVar7.f378b = tVarB2;
                    dVar2.d(bVar5, fVar7);
                    objO2 = tVarB2.o(this);
                    wy.a aVar27 = wy.a.COROUTINE_SUSPENDED;
                    if (objO2 == aVar26) {
                        return aVar26;
                    }
                } else {
                    if (i46 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                    objO2 = obj;
                }
                com.android.billingclient.api.p pVar2 = (com.android.billingclient.api.p) objO2;
                int i47 = pVar2.f7571a.f7519a;
                List list6 = pVar2.f7572b;
                if (list6 == null) {
                    return ry.r.f50854a;
                }
                Iterator it3 = list6.iterator();
                while (it3.hasNext()) {
                    Objects.toString((com.android.billingclient.api.o) it3.next());
                }
                return list6;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return j(obj);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return m(obj);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return n(obj);
            case 27:
                return o(obj);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return p(obj);
            default:
                rt.j jVar7 = (rt.j) this.f38604e;
                wy.a aVar28 = wy.a.COROUTINE_SUSPENDED;
                int i48 = this.f38601b;
                if (i48 == 0) {
                    com.bumptech.glide.e.F(obj);
                    bh.r rVarB = ((fr.r) ((vt.e) this.f38603d)).b(xt.d.k(((fr.o0) jVar7.f49899e).f27733a.keyLanguage), (String) this.f38602c);
                    rt.g gVar2 = new rt.g(jVar7, z24 ? 1 : 0);
                    this.f38601b = 1;
                    if (rVarB.collect(gVar2, this) == aVar28) {
                        return aVar28;
                    }
                } else {
                    if (i48 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.bumptech.glide.e.F(obj);
                }
                return qy.b0.f48488a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(fz.f fVar, b1.b bVar, vy.d dVar) {
        super(2, dVar);
        this.f38600a = 18;
        this.f38603d = (xy.i) fVar;
        this.f38604e = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38600a = i11;
        this.f38602c = obj;
        this.f38603d = obj2;
        this.f38604e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, String str, String str2, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38600a = i11;
        this.f38603d = obj;
        this.f38602c = str;
        this.f38604e = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f38600a = i11;
        this.f38604e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(no.s sVar, String str, vy.d dVar) {
        super(2, dVar);
        this.f38600a = 24;
        this.f38604e = sVar;
        this.f38602c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(rz.h1 h1Var, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f38600a = 17;
        this.f38603d = h1Var;
        this.f38604e = (xy.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(tz.h hVar, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f38600a = 21;
        this.f38603d = hVar;
        this.f38604e = (xy.i) eVar;
    }
}
