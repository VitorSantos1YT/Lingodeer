package b0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.graphics.Rect;
import android.view.ScrollCaptureSession;
import com.google.accompanist.permissions.PermissionState;
import com.google.api.Service;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingo.lingoskill.widget.daystreak.DayStreakWidgetReceiver;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.ReviewStatus;
import com.lingodeer.network.model.ApiResponse;
import com.yalantis.ucrop.view.CropImageView;
import f0.v2;
import fr.i3;
import fr.n3;
import h1.x8;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import rt.z5;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends xy.i implements fz.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f3519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f3520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f3521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f3522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i11, Object obj, Object obj2, vy.d dVar) {
        super(2, dVar);
        this.f3517a = i11;
        this.f3520d = obj;
        this.f3522f = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0.emit(r9, r8) == r1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object e(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f3519c
            uz.j r0 = (uz.j) r0
            wy.a r1 = wy.a.COROUTINE_SUSPENDED
            int r2 = r8.f3518b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L15
            com.bumptech.glide.e.F(r9)
            goto L53
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            java.lang.Object r0 = r8.f3521e
            uz.j r0 = (uz.j) r0
            com.bumptech.glide.e.F(r9)
            goto L46
        L25:
            com.bumptech.glide.e.F(r9)
            yz.f r9 = rz.o0.f50940a
            yz.e r9 = yz.e.f58387a
            fr.m1 r2 = new fr.m1
            java.lang.Object r6 = r8.f3520d
            fr.v1 r6 = (fr.v1) r6
            java.lang.Object r7 = r8.f3522f
            java.lang.String r7 = (java.lang.String) r7
            r2.<init>(r6, r7, r5)
            r8.f3519c = r5
            r8.f3521e = r0
            r8.f3518b = r4
            java.lang.Object r9 = rz.e0.M(r9, r2, r8)
            if (r9 != r1) goto L46
            goto L52
        L46:
            r8.f3519c = r5
            r8.f3521e = r5
            r8.f3518b = r3
            java.lang.Object r9 = r0.emit(r9, r8)
            if (r9 != r1) goto L53
        L52:
            return r1
        L53:
            qy.b0 r9 = qy.b0.f48488a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.e(java.lang.Object):java.lang.Object");
    }

    private final Object j(Object obj) {
        i3 i3Var = (i3) this.f3521e;
        String str = (String) this.f3519c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3518b;
        qy.b0 b0Var = qy.b0.f48488a;
        int i12 = 1;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (str.length() > 0) {
                dv.u0 u0Var = i3Var.f27611l;
                String strW = ((fr.o0) i3Var.f27600a).w();
                this.f3518b = 1;
                obj = u0Var.s(strW, str, this);
                if (obj != aVar) {
                }
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
        if (((ApiResponse) obj) instanceof ApiResponse.Error) {
            ((kotlin.jvm.internal.u) this.f3520d).f38357a = false;
            return b0Var;
        }
        vt.l0 l0Var = i3Var.f27604e;
        List list = (List) this.f3522f;
        this.f3518b = 2;
        yz.f fVar = rz.o0.f50940a;
        Object objM = rz.e0.M(yz.e.f58387a, new fr.y((fr.c0) l0Var, list, null, i12), this);
        if (objM != aVar) {
            objM = b0Var;
        }
        return objM == aVar ? aVar : b0Var;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[LOOP:0: B:19:0x0064->B:20:0x0066, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
    
        if (((fr.e0) r15).a(r3, r14) == r2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object m(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.f3521e
            fr.i3 r0 = (fr.i3) r0
            java.lang.Object r1 = r14.f3519c
            java.lang.String r1 = (java.lang.String) r1
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r14.f3518b
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L25
            if (r3 == r5) goto L21
            if (r3 != r4) goto L19
            com.bumptech.glide.e.F(r15)
            goto L8d
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            com.bumptech.glide.e.F(r15)
            goto L41
        L25:
            com.bumptech.glide.e.F(r15)
            int r15 = r1.length()
            if (r15 <= 0) goto L8d
            dv.u0 r15 = r0.f27611l
            vt.n0 r3 = r0.f27600a
            fr.o0 r3 = (fr.o0) r3
            java.lang.String r3 = r3.w()
            r14.f3518b = r5
            java.lang.Object r15 = r15.o(r3, r1, r14)
            if (r15 != r2) goto L41
            goto L8c
        L41:
            com.lingodeer.network.model.ApiResponse r15 = (com.lingodeer.network.model.ApiResponse) r15
            boolean r15 = r15 instanceof com.lingodeer.network.model.ApiResponse.Error
            r1 = 0
            if (r15 == 0) goto L4f
            java.lang.Object r15 = r14.f3520d
            kotlin.jvm.internal.u r15 = (kotlin.jvm.internal.u) r15
            r15.f38357a = r1
            goto L8d
        L4f:
            vt.m0 r15 = r0.f27605f
            java.lang.Object r0 = r14.f3522f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.ArrayList r3 = new java.util.ArrayList
            r5 = 10
            int r5 = ry.n.W(r0, r5)
            r3.<init>(r5)
            int r5 = r0.size()
        L64:
            if (r1 >= r5) goto L82
            java.lang.Object r6 = r0.get(r1)
            int r1 = r1 + 1
            r7 = r6
            com.lingodeer.data.model.DailyStreakHistory r7 = (com.lingodeer.data.model.DailyStreakHistory) r7
            java.lang.String r9 = r7.getPendingType()
            r12 = 9
            r13 = 0
            r8 = 0
            java.lang.String r10 = ""
            r11 = 0
            com.lingodeer.data.model.DailyStreakHistory r6 = com.lingodeer.data.model.DailyStreakHistory.copy$default(r7, r8, r9, r10, r11, r12, r13)
            r3.add(r6)
            goto L64
        L82:
            r14.f3518b = r4
            fr.e0 r15 = (fr.e0) r15
            java.lang.Object r15 = r15.a(r3, r14)
            if (r15 != r2) goto L8d
        L8c:
            return r2
        L8d:
            qy.b0 r15 = qy.b0.f48488a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.m(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0070 A[PHI: r12
      0x0070: PHI (r12v3 b0.f) = (r12v2 b0.f), (r12v7 b0.f) binds: [B:21:0x006d, B:11:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
    
        if (rz.e0.m(400, r14) == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object n(java.lang.Object r15) {
        /*
            r14 = this;
            wy.a r0 = wy.a.COROUTINE_SUSPENDED
            int r1 = r14.f3518b
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 400(0x190, double:1.976E-321)
            if (r1 == 0) goto L31
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L27
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            com.bumptech.glide.e.F(r15)
            r12 = r14
            goto L82
        L1a:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L22:
            com.bumptech.glide.e.F(r15)
            r12 = r14
            goto L70
        L27:
            com.bumptech.glide.e.F(r15)
            r12 = r14
            goto L5e
        L2c:
            com.bumptech.glide.e.F(r15)
            r12 = r14
            goto L55
        L31:
            com.bumptech.glide.e.F(r15)
            java.lang.Object r15 = r14.f3521e
            r8 = r15
            b0.d r8 = (b0.d) r8
            java.lang.Float r9 = new java.lang.Float
            r15 = 1065353216(0x3f800000, float:1.0)
            r9.<init>(r15)
            r15 = 0
            r1 = 6
            r10 = 300(0x12c, float:4.2E-43)
            r11 = 0
            b0.i2 r10 = b0.e.r(r10, r15, r11, r1)
            r14.f3518b = r5
            r13 = 12
            r12 = r14
            java.lang.Object r15 = b0.d.c(r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L55
            goto L81
        L55:
            r12.f3518b = r4
            java.lang.Object r15 = rz.e0.m(r6, r14)
            if (r15 != r0) goto L5e
            goto L81
        L5e:
            java.lang.Object r15 = r12.f3520d
            l1.b1 r15 = (l1.b1) r15
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r15.setValue(r1)
            r12.f3518b = r3
            java.lang.Object r15 = rz.e0.m(r6, r14)
            if (r15 != r0) goto L70
            goto L81
        L70:
            java.lang.Object r15 = r12.f3522f
            l1.b1 r15 = (l1.b1) r15
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r15.setValue(r1)
            r12.f3518b = r2
            java.lang.Object r15 = rz.e0.m(r6, r14)
            if (r15 != r0) goto L82
        L81:
            return r0
        L82:
            java.lang.Object r15 = r12.f3519c
            l1.b1 r15 = (l1.b1) r15
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r15.setValue(r0)
            qy.b0 r15 = qy.b0.f48488a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.n(java.lang.Object):java.lang.Object");
    }

    private final Object o(Object obj) {
        kotlin.jvm.internal.u uVar;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3518b;
        if (i11 == 0) {
            com.bumptech.glide.e.F(obj);
            if (((g.l) this.f3521e).f26172a) {
                kotlin.jvm.internal.u uVar2 = new kotlin.jvm.internal.u();
                fz.e eVar = (fz.e) this.f3520d;
                uz.q qVar = new uz.q(uz.x0.m((tz.h) ((ie.o) this.f3522f).f34406c), new g.k(uVar2, null, 0));
                this.f3519c = uVar2;
                this.f3518b = 1;
                if (eVar.invoke(qVar, this) == aVar) {
                    return aVar;
                }
                uVar = uVar2;
            }
            return qy.b0.f48488a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        uVar = (kotlin.jvm.internal.u) this.f3519c;
        com.bumptech.glide.e.F(obj);
        if (!uVar.f38357a) {
            throw new IllegalStateException("You must collect the progress flow");
        }
        return qy.b0.f48488a;
    }

    private final Object p(Object obj) {
        qy.q qVarV;
        String str;
        gm.g gVar = (gm.g) this.f3522f;
        rz.b0 b0Var = (rz.b0) this.f3519c;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3518b;
        qy.b0 b0Var2 = qy.b0.f48488a;
        if (i11 != 0) {
            if (i11 == 1) {
                qVarV = (qy.q) this.f3520d;
                str = (String) this.f3521e;
                com.bumptech.glide.e.F(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.bumptech.glide.e.F(obj);
            }
            return b0Var2;
        }
        com.bumptech.glide.e.F(obj);
        HwCharacter hwCharacter = gVar.f29295j;
        if (hwCharacter == null) {
            kotlin.jvm.internal.m.n("mCurChar");
            throw null;
        }
        String strO = xt.d.o(hwCharacter.getCharId(), 2, gVar.f47884d.keyLanguage);
        qVarV = com.bumptech.glide.d.v(new fk.a(19));
        bh.i0 i0VarA = ((wt.q) qVarV.getValue()).a(strO);
        this.f3519c = b0Var;
        this.f3521e = strO;
        this.f3520d = qVarV;
        this.f3518b = 1;
        Object objV = uz.x0.v(i0VarA, this);
        if (objV != aVar) {
            str = strO;
            obj = objV;
        }
        return aVar;
        if (((ReviewStatus) obj) == null) {
            wt.q qVar = (wt.q) qVarV.getValue();
            this.f3519c = null;
            this.f3521e = null;
            this.f3520d = null;
            this.f3518b = 2;
            Object objB = ((n3) qVar.f55345b).b(str, -1L, this);
            if (objB != aVar) {
                objB = b0Var2;
            }
            if (objB == aVar) {
                return aVar;
            }
        }
        return b0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e5  */
    private final Object q(Object obj) {
        Object objM;
        xm.c cVar;
        Object objM2;
        xm.c cVar2;
        Object objM3;
        xm.c cVar3;
        xm.c cVar4;
        xm.c cVar5;
        Object objM4;
        xm.c cVar6;
        xm.c cVar7;
        gn.e eVar = (gn.e) this.f3522f;
        uz.i1 i1Var = eVar.f29324d;
        xm.b bVar = eVar.f29321a;
        wy.a aVar = wy.a.COROUTINE_SUSPENDED;
        int i11 = this.f3518b;
        int i12 = 3;
        int i13 = 2;
        int i14 = 1;
        vy.d dVar = null;
        try {
            if (i11 == 0) {
                com.bumptech.glide.e.F(obj);
                gn.a aVarA = gn.a.a((gn.a) i1Var.getValue(), true, null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 126);
                i1Var.getClass();
                i1Var.l(null, aVarA);
                this.f3518b = 1;
                bVar.getClass();
                yz.f fVar = rz.o0.f50940a;
                objM = rz.e0.M(yz.e.f58387a, new xm.a(bVar, dVar, i12), this);
                if (objM == aVar) {
                }
                return aVar;
            }
            if (i11 == 1) {
                com.bumptech.glide.e.F(obj);
                objM = obj;
            } else {
                if (i11 == 2) {
                    cVar = (xm.c) this.f3519c;
                    com.bumptech.glide.e.F(obj);
                    objM2 = obj;
                    cVar2 = (xm.c) objM2;
                    this.f3519c = cVar;
                    this.f3521e = cVar2;
                    this.f3518b = 3;
                    bVar.getClass();
                    yz.f fVar2 = rz.o0.f50940a;
                    objM3 = rz.e0.M(yz.e.f58387a, new xm.a(bVar, dVar, i14), this);
                    if (objM3 == aVar) {
                        cVar3 = cVar;
                        cVar4 = cVar2;
                        cVar5 = (xm.c) objM3;
                        this.f3519c = cVar3;
                        this.f3521e = cVar4;
                        this.f3520d = cVar5;
                        this.f3518b = 4;
                        bVar.getClass();
                        yz.f fVar3 = rz.o0.f50940a;
                        objM4 = rz.e0.M(yz.e.f58387a, new xm.a(bVar, dVar, i13), this);
                        if (objM4 != aVar) {
                            cVar6 = cVar4;
                            cVar7 = cVar3;
                        }
                    }
                    return aVar;
                }
                if (i11 == 3) {
                    cVar4 = (xm.c) this.f3521e;
                    xm.c cVar8 = (xm.c) this.f3519c;
                    com.bumptech.glide.e.F(obj);
                    cVar3 = cVar8;
                    objM3 = obj;
                    cVar5 = (xm.c) objM3;
                    this.f3519c = cVar3;
                    this.f3521e = cVar4;
                    this.f3520d = cVar5;
                    this.f3518b = 4;
                    bVar.getClass();
                    yz.f fVar4 = rz.o0.f50940a;
                    objM4 = rz.e0.M(yz.e.f58387a, new xm.a(bVar, dVar, i13), this);
                    if (objM4 != aVar) {
                        cVar6 = cVar4;
                        cVar7 = cVar3;
                    }
                    return aVar;
                }
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                xm.c cVar9 = (xm.c) this.f3520d;
                cVar6 = (xm.c) this.f3521e;
                cVar7 = (xm.c) this.f3519c;
                com.bumptech.glide.e.F(obj);
                cVar5 = cVar9;
                objM4 = obj;
            }
            eVar.K = new dn.c(cVar7);
            eVar.L = new dn.c(cVar6);
            eVar.M = new dn.c(cVar5);
            eVar.N = new dn.c((xm.c) objM4);
            gn.a aVarA2 = gn.a.a((gn.a) i1Var.getValue(), false, null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 126);
            i1Var.getClass();
            i1Var.l(null, aVarA2);
            return qy.b0.f48488a;
            cVar = (xm.c) objM;
            this.f3519c = cVar;
            this.f3518b = 2;
            bVar.getClass();
            yz.f fVar5 = rz.o0.f50940a;
            objM2 = rz.e0.M(yz.e.f58387a, new xm.a(bVar, dVar, 0), this);
            if (objM2 != aVar) {
                cVar2 = (xm.c) objM2;
                this.f3519c = cVar;
                this.f3521e = cVar2;
                this.f3518b = 3;
                bVar.getClass();
                yz.f fVar6 = rz.o0.f50940a;
                objM3 = rz.e0.M(yz.e.f58387a, new xm.a(bVar, dVar, i14), this);
                if (objM3 == aVar) {
                    cVar3 = cVar;
                    cVar4 = cVar2;
                    cVar5 = (xm.c) objM3;
                    this.f3519c = cVar3;
                    this.f3521e = cVar4;
                    this.f3520d = cVar5;
                    this.f3518b = 4;
                    bVar.getClass();
                    yz.f fVar7 = rz.o0.f50940a;
                    objM4 = rz.e0.M(yz.e.f58387a, new xm.a(bVar, dVar, i13), this);
                    if (objM4 != aVar) {
                        cVar6 = cVar4;
                        cVar7 = cVar3;
                        eVar.K = new dn.c(cVar7);
                        eVar.L = new dn.c(cVar6);
                        eVar.M = new dn.c(cVar5);
                        eVar.N = new dn.c((xm.c) objM4);
                        gn.a aVarA3 = gn.a.a((gn.a) i1Var.getValue(), false, null, null, null, false, CropImageView.DEFAULT_ASPECT_RATIO, false, 126);
                        i1Var.getClass();
                        i1Var.l(null, aVarA3);
                        return qy.b0.f48488a;
                    }
                }
            }
            return aVar;
        } catch (Exception e8) {
            e8.printStackTrace();
            gn.a aVarA4 = gn.a.a((gn.a) i1Var.getValue(), false, null, null, ep.a.e("加载数据失败: ", e8.getMessage()), false, CropImageView.DEFAULT_ASPECT_RATIO, false, 118);
            i1Var.getClass();
            i1Var.l(null, aVarA4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
    
        if (r9 == r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f3519c
            gv.h r0 = (gv.h) r0
            gv.a r1 = r0.f29876b
            wy.a r2 = wy.a.COROUTINE_SUSPENDED
            int r3 = r8.f3518b
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L24
            if (r3 == r5) goto L20
            if (r3 != r4) goto L18
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Exception -> L16
            goto L7c
        L16:
            r9 = move-exception
            goto L7f
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            com.bumptech.glide.e.F(r9)     // Catch: java.lang.Exception -> L16
            goto L30
        L24:
            com.bumptech.glide.e.F(r9)
            r8.f3518b = r5     // Catch: java.lang.Exception -> L16
            java.lang.Object r9 = gv.h.a(r0, r8)     // Catch: java.lang.Exception -> L16
            if (r9 != r2) goto L30
            goto L7b
        L30:
            com.alibaba.sdk.android.oss.OSSClient r9 = new com.alibaba.sdk.android.oss.OSSClient     // Catch: java.lang.Exception -> L16
            android.content.Context r3 = r0.f29875a     // Catch: java.lang.Exception -> L16
            java.lang.String r6 = r1.f29863a     // Catch: java.lang.Exception -> L16
            gv.f r0 = r0.f29880f     // Catch: java.lang.Exception -> L16
            r9.<init>(r3, r6, r0)     // Catch: java.lang.Exception -> L16
            com.alibaba.sdk.android.oss.model.PutObjectRequest r0 = new com.alibaba.sdk.android.oss.model.PutObjectRequest     // Catch: java.lang.Exception -> L16
            java.lang.String r1 = r1.f29864b     // Catch: java.lang.Exception -> L16
            java.lang.Object r3 = r8.f3521e     // Catch: java.lang.Exception -> L16
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> L16
            java.lang.Object r6 = r8.f3520d     // Catch: java.lang.Exception -> L16
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L16
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L16
            r7.<init>()     // Catch: java.lang.Exception -> L16
            r7.append(r3)     // Catch: java.lang.Exception -> L16
            r7.append(r6)     // Catch: java.lang.Exception -> L16
            java.lang.String r3 = r7.toString()     // Catch: java.lang.Exception -> L16
            java.lang.Object r6 = r8.f3522f     // Catch: java.lang.Exception -> L16
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L16
            r0.<init>(r1, r3, r6)     // Catch: java.lang.Exception -> L16
            r8.f3518b = r4     // Catch: java.lang.Exception -> L16
            rz.m r1 = new rz.m     // Catch: java.lang.Exception -> L16
            vy.d r3 = ue.f.x(r8)     // Catch: java.lang.Exception -> L16
            r1.<init>(r5, r3)     // Catch: java.lang.Exception -> L16
            r1.s()     // Catch: java.lang.Exception -> L16
            hd.b r3 = new hd.b     // Catch: java.lang.Exception -> L16
            r4 = 15
            r3.<init>(r1, r4)     // Catch: java.lang.Exception -> L16
            r9.asyncPutObject(r0, r3)     // Catch: java.lang.Exception -> L16
            java.lang.Object r9 = r1.r()     // Catch: java.lang.Exception -> L16
            if (r9 != r2) goto L7c
        L7b:
            return r2
        L7c:
            gv.d r9 = (gv.d) r9     // Catch: java.lang.Exception -> L16
            return r9
        L7f:
            gv.b r0 = new gv.b
            java.lang.String r1 = r9.getMessage()
            java.lang.String r2 = "上传文件时发生异常: "
            java.lang.String r1 = ep.a.e(r2, r1)
            r0.<init>(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c4, code lost:
    
        if (r12 == r4) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object s(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.s(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v7, types: [fz.e, xy.i] */
    @Override // xy.a
    public final vy.d create(Object obj, vy.d dVar) {
        switch (this.f3517a) {
            case 0:
                return new f(this.f3519c, (d) this.f3521e, (l1.b1) this.f3520d, (l1.b1) this.f3522f, dVar, 0);
            case 1:
                f fVar = new f(1, (l1.b1) this.f3520d, (j0) this.f3522f, dVar);
                fVar.f3519c = obj;
                return fVar;
            case 2:
                f fVar2 = new f((fz.c) this.f3521e, (b1.e) this.f3520d, (b1.r) this.f3522f, dVar, 2);
                fVar2.f3519c = obj;
                return fVar2;
            case 3:
                f fVar3 = new f(3, (bh.t) this.f3520d, (String) this.f3522f, dVar);
                fVar3.f3519c = obj;
                return fVar3;
            case 4:
                f fVar4 = new f(4, (List) this.f3520d, (bh.t) this.f3522f, dVar);
                fVar4.f3519c = obj;
                return fVar4;
            case 5:
                return new f((String) this.f3519c, (ep.c) this.f3521e, (Context) this.f3520d, this.f3518b, (x1.p) this.f3522f, dVar);
            case 6:
                return new f(this.f3518b, (pu.b) this.f3519c, (nu.e) this.f3521e, (l1.b1) this.f3520d, (l1.b1) this.f3522f, dVar);
            case 7:
                return new f((ys.d0) this.f3519c, (CourseSentence) this.f3521e, (l1.b1) this.f3520d, (l1.a1) this.f3522f, dVar, 7);
            case 8:
                return new f((jt.m1) this.f3519c, (CourseSentence) this.f3521e, (fz.c) this.f3520d, (fz.a) this.f3522f, dVar, 8);
            case 9:
                return new f(this.f3521e, this.f3522f, (l1.b1) this.f3520d, dVar, 9);
            case 10:
                return new f((cu.t) this.f3521e, this.f3520d, (fz.e) this.f3522f, dVar);
            case 11:
                return new f((z5) this.f3519c, (ns.z) this.f3521e, (l1.b1) this.f3520d, (fz.c) this.f3522f, dVar, 11);
            case 12:
                f fVar5 = new f(this.f3521e, this.f3522f, (l1.b1) this.f3520d, dVar, 12);
                fVar5.f3519c = obj;
                return fVar5;
            case 13:
                f fVar6 = new f((fz.e) this.f3521e, (wz.d) this.f3520d, (BroadcastReceiver.PendingResult) this.f3522f, dVar);
                fVar6.f3519c = obj;
                return fVar6;
            case 14:
                f fVar7 = new f((DayStreakWidgetReceiver) this.f3521e, (Context) this.f3520d, (int[]) this.f3522f, dVar, 14);
                fVar7.f3519c = obj;
                return fVar7;
            case 15:
                f fVar8 = new f((e6.s0) this.f3521e, (e6.c) this.f3520d, (xq.c) this.f3522f, dVar, 15);
                fVar8.f3519c = obj;
                return fVar8;
            case 16:
                f fVar9 = new f((f0.i) this.f3521e, (v2) this.f3520d, (f0.d) this.f3522f, dVar, 16);
                fVar9.f3519c = obj;
                return fVar9;
            case 17:
                return new f((f3.d) this.f3519c, (ScrollCaptureSession) this.f3521e, (Rect) this.f3520d, (Consumer) this.f3522f, dVar, 17);
            case 18:
                return new f((gp.j0) this.f3521e, (x8) this.f3520d, (fz.a) this.f3522f, dVar, 18);
            case 19:
                f fVar10 = new f(19, (fr.v1) this.f3520d, (String) this.f3522f, dVar);
                fVar10.f3519c = obj;
                return fVar10;
            case 20:
                return new f((String) this.f3519c, (i3) this.f3521e, (kotlin.jvm.internal.u) this.f3520d, (List) this.f3522f, dVar, 20);
            case 21:
                return new f((String) this.f3519c, (i3) this.f3521e, (kotlin.jvm.internal.u) this.f3520d, (ArrayList) this.f3522f, dVar, 21);
            case 22:
                return new f((d) this.f3521e, (l1.b1) this.f3520d, (l1.b1) this.f3522f, (l1.b1) this.f3519c, dVar);
            case 23:
                return new f((g.l) this.f3521e, (fz.e) this.f3520d, (ie.o) this.f3522f, dVar, 23);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                f fVar11 = new f((gm.g) this.f3522f, dVar, 24);
                fVar11.f3519c = obj;
                return fVar11;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new f((gn.e) this.f3522f, dVar, 25);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return new f((gv.h) this.f3519c, (String) this.f3521e, (String) this.f3520d, (String) this.f3522f, dVar, 26);
            case 27:
                return new f((l0.w) this.f3519c, (fz.c) this.f3521e, (i1.x) this.f3520d, (lz.g) this.f3522f, dVar, 27);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                f fVar12 = new f((j2.c) this.f3521e, (iw.b) this.f3520d, (y2.k0) this.f3522f, dVar, 28);
                fVar12.f3519c = obj;
                return fVar12;
            default:
                return new f((PermissionState) this.f3519c, (l1.b1) this.f3520d, (l1.b1) this.f3522f, (fz.c) this.f3521e, dVar);
        }
    }

    @Override // fz.e
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        switch (this.f3517a) {
            case 0:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 1:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 2:
                return ((f) create((z2.m0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 3:
                return ((f) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 4:
                return ((f) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 5:
                f fVar = (f) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var = qy.b0.f48488a;
                fVar.invokeSuspend(b0Var);
                return b0Var;
            case 6:
                f fVar2 = (f) create((rz.b0) obj, (vy.d) obj2);
                qy.b0 b0Var2 = qy.b0.f48488a;
                fVar2.invokeSuspend(b0Var2);
                return b0Var2;
            case 7:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 8:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 9:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 10:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 11:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 12:
                return ((f) create((l1.s1) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 13:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 14:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 15:
                return ((f) create((m6.l) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 16:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 17:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 18:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 19:
                return ((f) create((uz.j) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 20:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 21:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 22:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 23:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case 27:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
            default:
                return ((f) create((rz.b0) obj, (vy.d) obj2)).invokeSuspend(qy.b0.f48488a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:455:0x09ba A[PHI: r8 r9
      0x09ba: PHI (r8v3 kotlin.jvm.internal.v) = (r8v1 kotlin.jvm.internal.v), (r8v2 kotlin.jvm.internal.v), (r8v2 kotlin.jvm.internal.v), (r8v5 kotlin.jvm.internal.v) binds: [B:454:0x09a8, B:459:0x09da, B:461:0x09f6, B:450:0x0984] A[DONT_GENERATE, DONT_INLINE]
      0x09ba: PHI (r9v3 rz.b0) = (r9v1 rz.b0), (r9v2 rz.b0), (r9v2 rz.b0), (r9v5 rz.b0) binds: [B:454:0x09a8, B:459:0x09da, B:461:0x09f6, B:450:0x0984] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:458:0x09d5 A[PHI: r8 r9
      0x09d5: PHI (r8v2 kotlin.jvm.internal.v) = (r8v3 kotlin.jvm.internal.v), (r8v4 kotlin.jvm.internal.v) binds: [B:456:0x09d2, B:453:0x099a] A[DONT_GENERATE, DONT_INLINE]
      0x09d5: PHI (r9v2 rz.b0) = (r9v3 rz.b0), (r9v4 rz.b0) binds: [B:456:0x09d2, B:453:0x099a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:460:0x09dc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v7, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r1v47, types: [cu.t] */
    /* JADX WARN: Type inference failed for: r1v48, types: [cu.t] */
    /* JADX WARN: Type inference failed for: r1v50, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r21v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, uz.j] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v62, types: [fz.e, xy.i] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v21, types: [int] */
    /* JADX WARN: Type inference failed for: r5v22, types: [cu.o, fz.e] */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:321:0x05c0 -> B:323:0x05c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:459:0x09da -> B:455:0x09ba). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:461:0x09f6 -> B:455:0x09ba). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // xy.a
    public final java.lang.Object invokeSuspend(java.lang.Object r57) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i11, pu.b bVar, nu.e eVar, l1.b1 b1Var, l1.b1 b1Var2, vy.d dVar) {
        super(2, dVar);
        this.f3517a = 6;
        this.f3518b = i11;
        this.f3519c = bVar;
        this.f3521e = eVar;
        this.f3520d = b1Var;
        this.f3522f = b1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3, vy.d dVar2) {
        super(2, dVar2);
        this.f3517a = 22;
        this.f3521e = dVar;
        this.f3520d = b1Var;
        this.f3522f = b1Var2;
        this.f3519c = b1Var3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PermissionState permissionState, l1.b1 b1Var, l1.b1 b1Var2, fz.c cVar, vy.d dVar) {
        super(2, dVar);
        this.f3517a = 29;
        this.f3519c = permissionState;
        this.f3520d = b1Var;
        this.f3522f = b1Var2;
        this.f3521e = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(cu.t tVar, Object obj, fz.e eVar, vy.d dVar) {
        super(2, dVar);
        this.f3517a = 10;
        this.f3521e = tVar;
        this.f3520d = obj;
        this.f3522f = (xy.i) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f(fz.e eVar, wz.d dVar, BroadcastReceiver.PendingResult pendingResult, vy.d dVar2) {
        super(2, dVar2);
        this.f3517a = 13;
        this.f3521e = (xy.i) eVar;
        this.f3520d = dVar;
        this.f3522f = pendingResult;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3517a = i11;
        this.f3519c = obj;
        this.f3521e = obj2;
        this.f3520d = obj3;
        this.f3522f = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, Object obj3, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3517a = i11;
        this.f3521e = obj;
        this.f3520d = obj2;
        this.f3522f = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, Object obj2, l1.b1 b1Var, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3517a = i11;
        this.f3521e = obj;
        this.f3522f = obj2;
        this.f3520d = b1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, vy.d dVar, int i11) {
        super(2, dVar);
        this.f3517a = i11;
        this.f3522f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, ep.c cVar, Context context, int i11, x1.p pVar, vy.d dVar) {
        super(2, dVar);
        this.f3517a = 5;
        this.f3519c = str;
        this.f3521e = cVar;
        this.f3520d = context;
        this.f3518b = i11;
        this.f3522f = pVar;
    }
}
