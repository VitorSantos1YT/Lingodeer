package xu;

import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.lifecycle.viewmodel.anchor.hIIS.scqhIrGXy;
import bt.g6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import dt.y3;
import fr.j3;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.ua;
import j0.e2;
import l1.c3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class r {
    public static final void b(int i11, String title, z1.r rVar, fz.e rightContent, l1.n nVar, int i12) {
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(rightContent, "rightContent");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1158753608);
        int i13 = i12 | (sVar.d(i11) ? 4 : 2);
        if ((i12 & 48) == 0) {
            i13 |= sVar.f(title) ? 32 : 16;
        }
        int i14 = i13 | (sVar.f(rVar) ? 256 : 128);
        if (sVar.T(i14 & 1, (i14 & 1171) != 1170)) {
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, a2VarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            k2.b bVarY = se.k.y(i11, sVar, i14 & 14);
            float f5 = a.f56325b;
            z1.o oVar = z1.o.f58481a;
            d0.n.c(bVarY, null, e2.n(oVar, f5), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            j3.y0 y0VarA = j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
            z1.r rVarC2 = j0.c.C(oVar, 12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            ua.b(title, w4.c.p(1.0f, true, rVarC2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar, (i14 >> 3) & 14, 0, 65532);
            sVar = sVar;
            ep.a.w(6, rightContent, sVar, true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(i11, title, rVar, rightContent, i12, 10);
        }
    }

    public static final void c(fz.a onDismissRequest, fz.a onConfirm, fz.a onCancel, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        kotlin.jvm.internal.m.f(onCancel, "onCancel");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-351471514);
        int i12 = i11 | (sVar2.h(onConfirm) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            sVar = sVar2;
            k7.a(onDismissRequest, t1.e.d(929449246, new nv.y(14, onCancel), sVar2), null, t1.e.d(1218268636, new nv.y(15, onConfirm), sVar2), c.E, c.F, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l(onDismissRequest, onConfirm, onCancel, i11, 1);
        }
    }

    public static final void d(fz.a onDismissRequest, fz.a onConfirm, fz.a onCancel, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        kotlin.jvm.internal.m.f(onConfirm, "onConfirm");
        kotlin.jvm.internal.m.f(onCancel, "onCancel");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(412368901);
        int i12 = i11 | (sVar2.h(onConfirm) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            sVar = sVar2;
            k7.a(onDismissRequest, t1.e.d(1693289661, new nv.y(16, onConfirm), sVar2), null, t1.e.d(1982109051, new nv.y(17, onCancel), sVar2), c.I, c.J, null, 0L, 0L, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 1772598, 16276);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l(onDismissRequest, onConfirm, onCancel, i11, 2);
        }
    }

    public static final void e(fz.a onClickClose, fz.a onClickPremium, fz.a onClickProgressBackup, fz.a onTakePhoto, fz.a onChoosePhoto, final fz.a resetLoginStatus, final fz.a onLogoutError, final zu.q viewModel, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickPremium, "onClickPremium");
        kotlin.jvm.internal.m.f(onClickProgressBackup, "onClickProgressBackup");
        kotlin.jvm.internal.m.f(onTakePhoto, "onTakePhoto");
        kotlin.jvm.internal.m.f(onChoosePhoto, "onChoosePhoto");
        kotlin.jvm.internal.m.f(resetLoginStatus, "resetLoginStatus");
        kotlin.jvm.internal.m.f(onLogoutError, "onLogoutError");
        kotlin.jvm.internal.m.f(viewModel, "viewModel");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1527577829);
        int i12 = i11 | (sVar.h(onClickClose) ? 4 : 2) | (sVar.h(onClickPremium) ? 32 : 16) | (sVar.h(onClickProgressBackup) ? 256 : 128) | (sVar.h(onTakePhoto) ? 2048 : 1024) | (sVar.h(onChoosePhoto) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(resetLoginStatus) ? 131072 : 65536) | (sVar.h(onLogoutError) ? 1048576 : 524288) | (sVar.h(viewModel) ? 8388608 : 4194304);
        if (sVar.T(i12 & 1, (4793491 & i12) != 4793490)) {
            zu.m mVar = (zu.m) FlowExtKt.collectAsStateWithLifecycle(viewModel.f59536t, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7).getValue();
            boolean zH = sVar.h(viewModel);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new mt.r(viewModel, 23);
                sVar.o0(objQ);
            }
            fz.e eVar = (fz.e) objQ;
            boolean zH2 = sVar.h(viewModel);
            Object objQ2 = sVar.Q();
            if (zH2 || objQ2 == gVar) {
                final int i13 = 0;
                objQ2 = new fz.c() { // from class: xu.n
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i13) {
                            case 0:
                                viewModel.a(new zu.g(((Boolean) obj).booleanValue()), new ju.d(25), new ju.d(25));
                                break;
                            default:
                                String newNickName = (String) obj;
                                kotlin.jvm.internal.m.f(newNickName, "newNickName");
                                viewModel.a(new zu.i(newNickName), new ju.d(25), new ju.d(25));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ2);
            }
            fz.c cVar = (fz.c) objQ2;
            int i14 = 458752 & i12;
            int i15 = i12 & 3670016;
            boolean zH3 = (i15 == 1048576) | sVar.h(viewModel) | (i14 == 131072);
            Object objQ3 = sVar.Q();
            if (zH3 || objQ3 == gVar) {
                final int i16 = 0;
                objQ3 = new fz.a() { // from class: xu.p
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                fz.a aVar = onLogoutError;
                                viewModel.a(zu.c.f59384a, resetLoginStatus, aVar);
                                break;
                            default:
                                fz.a aVar2 = onLogoutError;
                                viewModel.a(zu.e.f59407a, resetLoginStatus, aVar2);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean zH4 = sVar.h(viewModel) | (i14 == 131072) | (i15 == 1048576);
            Object objQ4 = sVar.Q();
            if (zH4 || objQ4 == gVar) {
                final int i17 = 1;
                objQ4 = new fz.a() { // from class: xu.p
                    @Override // fz.a
                    public final Object invoke() {
                        switch (i17) {
                            case 0:
                                fz.a aVar2 = onLogoutError;
                                viewModel.a(zu.c.f59384a, resetLoginStatus, aVar2);
                                break;
                            default:
                                fz.a aVar3 = onLogoutError;
                                viewModel.a(zu.e.f59407a, resetLoginStatus, aVar3);
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ4);
            }
            fz.a aVar2 = (fz.a) objQ4;
            boolean zH5 = sVar.h(viewModel);
            Object objQ5 = sVar.Q();
            if (zH5 || objQ5 == gVar) {
                final int i18 = 1;
                objQ5 = new fz.c() { // from class: xu.n
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        switch (i18) {
                            case 0:
                                viewModel.a(new zu.g(((Boolean) obj).booleanValue()), new ju.d(25), new ju.d(25));
                                break;
                            default:
                                String newNickName = (String) obj;
                                kotlin.jvm.internal.m.f(newNickName, "newNickName");
                                viewModel.a(new zu.i(newNickName), new ju.d(25), new ju.d(25));
                                break;
                        }
                        return qy.b0.f48488a;
                    }
                };
                sVar.o0(objQ5);
            }
            fz.c cVar2 = (fz.c) objQ5;
            boolean zH6 = sVar.h(viewModel);
            Object objQ6 = sVar.Q();
            if (zH6 || objQ6 == gVar) {
                objQ6 = new xa.a(viewModel, 4);
                sVar.o0(objQ6);
            }
            f(mVar, onClickClose, onClickPremium, onClickProgressBackup, onTakePhoto, onChoosePhoto, eVar, cVar, aVar, aVar2, cVar2, (fz.a) objQ6, sVar, (i12 << 3) & 524272, 0);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g6(onClickClose, onClickPremium, onClickProgressBackup, onTakePhoto, onChoosePhoto, resetLoginStatus, onLogoutError, viewModel, i11, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:103:0x0322  */
    /* JADX WARN: Code duplicated, block: B:104:0x0326  */
    /* JADX WARN: Code duplicated, block: B:109:0x0341  */
    /* JADX WARN: Code duplicated, block: B:112:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:114:0x0429  */
    /* JADX WARN: Code duplicated, block: B:117:0x0454  */
    /* JADX WARN: Code duplicated, block: B:120:0x045d  */
    /* JADX WARN: Code duplicated, block: B:123:0x0463 A[PHI: r8
      0x0463: PHI (r8v11 java.lang.String) = (r8v9 java.lang.String), (r8v12 java.lang.String) binds: [B:122:0x0461, B:118:0x045a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:124:0x0465  */
    /* JADX WARN: Code duplicated, block: B:127:0x046c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x046e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0477  */
    /* JADX WARN: Code duplicated, block: B:133:0x047f  */
    /* JADX WARN: Code duplicated, block: B:134:0x0481  */
    /* JADX WARN: Code duplicated, block: B:138:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:140:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:143:0x0511 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:146:0x0517  */
    /* JADX WARN: Code duplicated, block: B:61:0x0158  */
    /* JADX WARN: Code duplicated, block: B:62:0x0165  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x01de  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x0216  */
    /* JADX WARN: Code duplicated, block: B:85:0x0292  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:89:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:94:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ea  */
    public static final void a(String str, String str2, String str3, String str4, String str5, fz.a aVar, fz.a aVar2, z1.r rVar, l1.n nVar, int i11) {
        String str6;
        y2.i iVar;
        z1.o oVar;
        Object objQ;
        y2.i iVar2;
        int iHashCode;
        float f5;
        y2.h hVar;
        z1.o oVar2;
        l1.s sVar;
        l1.s sVar2;
        z1.o oVar3;
        int iHashCode2;
        y2.h hVar2;
        Object objQ2;
        int iHashCode3;
        float f11;
        l1.s sVar3;
        int i12;
        String strE0;
        String strE1;
        String strE2;
        boolean z11;
        Object objQ3;
        l1.s sVar4;
        boolean z12;
        boolean zH;
        Object objQ4;
        String strConcat;
        String str7 = str;
        String str8 = str4;
        l1.s sVar5 = (l1.s) nVar;
        sVar5.f0(-1478779983);
        int i13 = i11 | (sVar5.f(str7) ? 4 : 2) | (sVar5.f(str2) ? 32 : 16) | (sVar5.f(str3) ? 256 : 128) | (sVar5.f(str8) ? 2048 : 1024) | (sVar5.f(str5) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar5.f(rVar) ? 8388608 : 4194304);
        if (sVar5.T(i13 & 1, (4793491 & i13) != 4793490)) {
            Context context = (Context) sVar5.j(AndroidCompositionLocals_androidKt.f1200b);
            boolean zF = sVar5.f(context);
            Object objQ5 = sVar5.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ5 == gVar) {
                Object systemService = context.getSystemService("clipboard");
                kotlin.jvm.internal.m.d(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                objQ5 = (ClipboardManager) systemService;
                sVar5.o0(objQ5);
            }
            ClipboardManager clipboardManager = (ClipboardManager) objQ5;
            String strE3 = ub.a.e0(sVar5, R.string.uid_copied);
            int i14 = i13 & 14;
            boolean z13 = i14 == 4;
            Object objQ6 = sVar5.Q();
            if (z13 || objQ6 == gVar) {
                objQ6 = oz.q.K0(str7) ? "-" : str7;
                sVar5.o0(objQ6);
            }
            String str9 = (String) objQ6;
            z1.i iVar3 = z1.c.M;
            j0.b bVar = j0.i.f35303a;
            j0.a2 a2VarA = j0.z1.a(bVar, iVar3, sVar5, 48);
            int iHashCode4 = Long.hashCode(sVar5.T);
            l1.q1 q1VarL = sVar5.l();
            z1.r rVarC = z1.a.c(sVar5, rVar);
            y2.k.J.getClass();
            y2.i iVar4 = y2.j.f56913b;
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar4);
            } else {
                sVar5.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, a2VarA, sVar5);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar5);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar5.S) {
                iVar = iVar4;
            } else {
                iVar = iVar4;
                if (!kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                }
                y2.h hVar6 = y2.j.f56915d;
                l1.t.J(hVar6, rVarC, sVar5);
                r0.e eVar = r0.f.f48733a;
                oVar = z1.o.f58481a;
                z1.r rVarN = e2.n(d2.h.b(oVar, eVar), a.f56324a);
                d0.v vVarA = d0.n.a(((h1.s1) sVar5.j(h1.v1.f31180a)).f31017a, a.f56328e);
                z1.r rVarK = d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.a(), rVarN);
                objQ = sVar5.Q();
                if (objQ == gVar) {
                    objQ = new wo.c(13, aVar2);
                    sVar5.o0(objQ);
                }
                iVar2 = iVar;
                z1.r rVarQ = iu.k.q(0, 7, (fz.a) objQ, sVar5, rVarK, false);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar5.T);
                l1.q1 q1VarL2 = sVar5.l();
                z1.r rVarC2 = z1.a.c(sVar5, rVarQ);
                sVar5.h0();
                if (sVar5.S) {
                    sVar5.k(iVar2);
                } else {
                    sVar5.r0();
                }
                l1.t.J(hVar3, q0VarD, sVar5);
                l1.t.J(hVar4, q1VarL2, sVar5);
                if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar5, iHashCode, hVar5);
                }
                l1.t.J(hVar6, rVarC2, sVar5);
                if (oz.q.K0(str3)) {
                    f5 = 1.0f;
                    hVar = hVar5;
                    oVar2 = oVar;
                    sVar5.d0(977245577);
                    d0.n.c(se.k.y(R.drawable.ep_me_avaster_active, sVar5, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 432, 120);
                    sVar = sVar5;
                    sVar.p(false);
                } else {
                    sVar5.d0(976823667);
                    if (oz.x.s0(str3, "http", false)) {
                        strConcat = str3;
                    } else {
                        strConcat = null;
                    }
                    if (strConcat == null) {
                        strConcat = scqhIrGXy.zLGVGPxOjMJTa.concat(str3);
                    }
                    f5 = 1.0f;
                    hVar = hVar5;
                    oVar2 = oVar;
                    wb.k.b(strConcat, null, e2.d(oVar, 1.0f), se.k.y(R.drawable.ep_me_avaster_active, sVar5, 0), null, w2.i.f54517d, sVar5, 432, 64496);
                    sVar = sVar5;
                    sVar.p(false);
                }
                sVar2 = sVar;
                d0.n.c(se.k.y(R.drawable.ic_change_pic, sVar, 0), null, j0.c.A(d0.n.h(e2.d(oVar2, f5), a.f56330g, g2.f0.f28556b), 14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 432, 120);
                sVar2.p(true);
                oVar3 = oVar2;
                z1.r rVarE = j0.c.E(oVar3, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
                if (f5 <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                z1.r rVarP = w4.c.p(f5, true, rVarE);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                iHashCode2 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL3 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, rVarP);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar3, uVarA, sVar2);
                l1.t.J(hVar4, q1VarL3, sVar2);
                if (sVar2.S && kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    hVar2 = hVar;
                } else {
                    hVar2 = hVar;
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                }
                l1.t.J(hVar6, rVarC3, sVar2);
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = new wo.c(14, aVar);
                    sVar2.o0(objQ2);
                }
                z1.r rVarQ2 = iu.k.q(6, 7, (fz.a) objQ2, sVar2, oVar3, false);
                j0.a2 a2VarA2 = j0.z1.a(bVar, z1.c.L, sVar2, 0);
                iHashCode3 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL4 = sVar2.l();
                z1.r rVarC4 = z1.a.c(sVar2, rVarQ2);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar2);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar3, a2VarA2, sVar2);
                l1.t.J(hVar4, q1VarL4, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
                }
                l1.t.J(hVar6, rVarC4, sVar2);
                ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, (i13 >> 3) & 14, 0, 65534);
                f11 = 4;
                d0.n.c(se.k.y(R.drawable.ic_goal_select_bg, sVar2, 0), null, j0.c.E(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 432, 120);
                sVar3 = sVar2;
                sVar3.p(true);
                if (str4.length() > 0) {
                    sVar3.d0(828863519);
                    str8 = str4;
                    ua.b(oz.x.q0(ub.a.e0(sVar3, R.string.joined_s), "%s", str8), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(fc.f30256a)).f30180n, sVar3, 48, 0, 65532);
                    sVar3 = sVar3;
                } else {
                    str8 = str4;
                    sVar3.d0(807105611);
                }
                sVar3.p(false);
                i12 = i13 >> 12;
                strE0 = ub.a.e0(sVar3, R.string.log_in_method_google);
                strE1 = ub.a.e0(sVar3, R.string.log_in_method_facebook);
                strE2 = ub.a.e0(sVar3, R.string.log_in_method_email_pwd);
                if (((i12 & 14) ^ 6) > 4) {
                    str6 = str5;
                    if (!sVar3.f(str6)) {
                        z11 = true;
                    }
                    objQ3 = sVar3.Q();
                    if (z11 || objQ3 == gVar) {
                        if (!kotlin.jvm.internal.m.a(str6, "Google")) {
                            if (kotlin.jvm.internal.m.a(str6, "Facebook")) {
                                strE0 = strE1;
                            } else {
                                strE0 = strE2;
                            }
                        }
                        sVar3.o0(strE0);
                        objQ3 = strE0;
                    }
                    String str10 = (String) objQ3;
                    c3 c3Var = fc.f30256a;
                    sVar4 = sVar3;
                    ua.b(str10, j0.c.E(r21, CropImageView.DEFAULT_ASPECT_RATIO, r23, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var)).f30180n, sVar4, 48, 0, 65532);
                    String strD0 = ub.a.d0(R.string.uid_format, new Object[]{str9}, sVar4);
                    j3.y0 y0Var = ((dc) sVar4.j(c3Var)).f30180n;
                    z1.r rVarE2 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                    if (i14 == 4) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zH = sVar4.h(clipboardManager) | z12 | sVar4.h(context) | sVar4.f(strE3);
                    objQ4 = sVar4.Q();
                    if (!zH || objQ4 == gVar) {
                        str7 = str;
                        objQ4 = new fu.j(str7, clipboardManager, context, strE3);
                        sVar4.o0(objQ4);
                    } else {
                        str7 = str;
                    }
                    ua.b(strD0, s2.g0.a(rVarE2, str7, (PointerInputEventHandler) objQ4), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var, sVar4, 0, 0, 65532);
                    sVar5 = sVar4;
                    sVar5.p(true);
                    sVar5.p(true);
                } else {
                    str6 = str5;
                }
                if ((i12 & 6) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ3 = sVar3.Q();
                if (z11) {
                    if (!kotlin.jvm.internal.m.a(str6, "Google")) {
                        if (kotlin.jvm.internal.m.a(str6, "Facebook")) {
                            strE0 = strE1;
                        } else {
                            strE0 = strE2;
                        }
                    }
                    sVar3.o0(strE0);
                    objQ3 = strE0;
                } else {
                    if (!kotlin.jvm.internal.m.a(str6, "Google")) {
                        if (kotlin.jvm.internal.m.a(str6, "Facebook")) {
                            strE0 = strE1;
                        } else {
                            strE0 = strE2;
                        }
                    }
                    sVar3.o0(strE0);
                    objQ3 = strE0;
                }
                String str11 = (String) objQ3;
                c3 c3Var2 = fc.f30256a;
                sVar4 = sVar3;
                ua.b(str11, j0.c.E(r21, CropImageView.DEFAULT_ASPECT_RATIO, r23, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var2)).f30180n, sVar4, 48, 0, 65532);
                String strD1 = ub.a.d0(R.string.uid_format, new Object[]{str9}, sVar4);
                j3.y0 y0Var2 = ((dc) sVar4.j(c3Var2)).f30180n;
                z1.r rVarE3 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                if (i14 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zH = sVar4.h(clipboardManager) | z12 | sVar4.h(context) | sVar4.f(strE3);
                objQ4 = sVar4.Q();
                if (zH) {
                    str7 = str;
                    objQ4 = new fu.j(str7, clipboardManager, context, strE3);
                    sVar4.o0(objQ4);
                } else {
                    str7 = str;
                    objQ4 = new fu.j(str7, clipboardManager, context, strE3);
                    sVar4.o0(objQ4);
                }
                ua.b(strD1, s2.g0.a(rVarE3, str7, (PointerInputEventHandler) objQ4), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var2, sVar4, 0, 0, 65532);
                sVar5 = sVar4;
                sVar5.p(true);
                sVar5.p(true);
            }
            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar5);
            y2.h hVar7 = y2.j.f56915d;
            l1.t.J(hVar7, rVarC, sVar5);
            r0.e eVar2 = r0.f.f48733a;
            oVar = z1.o.f58481a;
            z1.r rVarN2 = e2.n(d2.h.b(oVar, eVar2), a.f56324a);
            d0.v vVarA2 = d0.n.a(((h1.s1) sVar5.j(h1.v1.f31180a)).f31017a, a.f56328e);
            z1.r rVarK2 = d0.n.k(vVarA2.f22811a, vVarA2.f22812b, r0.f.a(), rVarN2);
            objQ = sVar5.Q();
            if (objQ == gVar) {
                objQ = new wo.c(13, aVar2);
                sVar5.o0(objQ);
            }
            iVar2 = iVar;
            z1.r rVarQ3 = iu.k.q(0, 7, (fz.a) objQ, sVar5, rVarK2, false);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar5.T);
            l1.q1 q1VarL5 = sVar5.l();
            z1.r rVarC5 = z1.a.c(sVar5, rVarQ3);
            sVar5.h0();
            if (sVar5.S) {
                sVar5.k(iVar2);
            } else {
                sVar5.r0();
            }
            l1.t.J(hVar3, q0VarD2, sVar5);
            l1.t.J(hVar4, q1VarL5, sVar5);
            if (sVar5.S) {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar5);
            } else {
                defpackage.e.A(iHashCode, sVar5, iHashCode, hVar5);
            }
            l1.t.J(hVar7, rVarC5, sVar5);
            if (oz.q.K0(str3)) {
                sVar5.d0(976823667);
                if (oz.x.s0(str3, "http", false)) {
                    strConcat = str3;
                } else {
                    strConcat = null;
                }
                if (strConcat == null) {
                    strConcat = scqhIrGXy.zLGVGPxOjMJTa.concat(str3);
                }
                f5 = 1.0f;
                hVar = hVar5;
                oVar2 = oVar;
                wb.k.b(strConcat, null, e2.d(oVar, 1.0f), se.k.y(R.drawable.ep_me_avaster_active, sVar5, 0), null, w2.i.f54517d, sVar5, 432, 64496);
                sVar = sVar5;
                sVar.p(false);
            } else {
                f5 = 1.0f;
                hVar = hVar5;
                oVar2 = oVar;
                sVar5.d0(977245577);
                d0.n.c(se.k.y(R.drawable.ep_me_avaster_active, sVar5, 0), null, e2.d(oVar2, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar5, 432, 120);
                sVar = sVar5;
                sVar.p(false);
            }
            sVar2 = sVar;
            d0.n.c(se.k.y(R.drawable.ic_change_pic, sVar, 0), null, j0.c.A(d0.n.h(e2.d(oVar2, f5), a.f56330g, g2.f0.f28556b), 14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 432, 120);
            sVar2.p(true);
            oVar3 = oVar2;
            z1.r rVarE4 = j0.c.E(oVar3, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (f5 <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarP2 = w4.c.p(f5, true, rVarE4);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL6 = sVar2.l();
            z1.r rVarC6 = z1.a.c(sVar2, rVarP2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar3, uVarA2, sVar2);
            l1.t.J(hVar4, q1VarL6, sVar2);
            if (sVar2.S) {
                hVar2 = hVar;
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
            } else {
                hVar2 = hVar;
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
            }
            l1.t.J(hVar7, rVarC6, sVar2);
            objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new wo.c(14, aVar);
                sVar2.o0(objQ2);
            }
            z1.r rVarQ4 = iu.k.q(6, 7, (fz.a) objQ2, sVar2, oVar3, false);
            j0.a2 a2VarA3 = j0.z1.a(bVar, z1.c.L, sVar2, 0);
            iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL7 = sVar2.l();
            z1.r rVarC7 = z1.a.c(sVar2, rVarQ4);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar2);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar3, a2VarA3, sVar2);
            l1.t.J(hVar4, q1VarL7, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
            } else {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar2);
            }
            l1.t.J(hVar7, rVarC7, sVar2);
            ua.b(str2, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, j3.A(16), n3.s.L, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, (i13 >> 3) & 14, 0, 65534);
            f11 = 4;
            d0.n.c(se.k.y(R.drawable.ic_goal_select_bg, sVar2, 0), null, j0.c.E(oVar3, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 432, 120);
            sVar3 = sVar2;
            sVar3.p(true);
            if (str4.length() > 0) {
                sVar3.d0(828863519);
                str8 = str4;
                ua.b(oz.x.q0(ub.a.e0(sVar3, R.string.joined_s), "%s", str8), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(fc.f30256a)).f30180n, sVar3, 48, 0, 65532);
                sVar3 = sVar3;
            } else {
                str8 = str4;
                sVar3.d0(807105611);
            }
            sVar3.p(false);
            i12 = i13 >> 12;
            strE0 = ub.a.e0(sVar3, R.string.log_in_method_google);
            strE1 = ub.a.e0(sVar3, R.string.log_in_method_facebook);
            strE2 = ub.a.e0(sVar3, R.string.log_in_method_email_pwd);
            if (((i12 & 14) ^ 6) > 4) {
                str6 = str5;
                if (!sVar3.f(str6)) {
                    z11 = true;
                }
                objQ3 = sVar3.Q();
                if (z11) {
                    if (!kotlin.jvm.internal.m.a(str6, "Google")) {
                        if (kotlin.jvm.internal.m.a(str6, "Facebook")) {
                            strE0 = strE1;
                        } else {
                            strE0 = strE2;
                        }
                    }
                    sVar3.o0(strE0);
                    objQ3 = strE0;
                } else {
                    if (!kotlin.jvm.internal.m.a(str6, "Google")) {
                        if (kotlin.jvm.internal.m.a(str6, "Facebook")) {
                            strE0 = strE1;
                        } else {
                            strE0 = strE2;
                        }
                    }
                    sVar3.o0(strE0);
                    objQ3 = strE0;
                }
                String str12 = (String) objQ3;
                c3 c3Var3 = fc.f30256a;
                sVar4 = sVar3;
                ua.b(str12, j0.c.E(r21, CropImageView.DEFAULT_ASPECT_RATIO, r23, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var3)).f30180n, sVar4, 48, 0, 65532);
                String strD2 = ub.a.d0(R.string.uid_format, new Object[]{str9}, sVar4);
                j3.y0 y0Var3 = ((dc) sVar4.j(c3Var3)).f30180n;
                z1.r rVarE5 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                if (i14 == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zH = sVar4.h(clipboardManager) | z12 | sVar4.h(context) | sVar4.f(strE3);
                objQ4 = sVar4.Q();
                if (zH) {
                    str7 = str;
                    objQ4 = new fu.j(str7, clipboardManager, context, strE3);
                    sVar4.o0(objQ4);
                } else {
                    str7 = str;
                    objQ4 = new fu.j(str7, clipboardManager, context, strE3);
                    sVar4.o0(objQ4);
                }
                ua.b(strD2, s2.g0.a(rVarE5, str7, (PointerInputEventHandler) objQ4), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var3, sVar4, 0, 0, 65532);
                sVar5 = sVar4;
                sVar5.p(true);
                sVar5.p(true);
            } else {
                str6 = str5;
            }
            if ((i12 & 6) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objQ3 = sVar3.Q();
            if (z11) {
                if (!kotlin.jvm.internal.m.a(str6, "Google")) {
                    if (kotlin.jvm.internal.m.a(str6, "Facebook")) {
                        strE0 = strE1;
                    } else {
                        strE0 = strE2;
                    }
                }
                sVar3.o0(strE0);
                objQ3 = strE0;
            } else {
                if (!kotlin.jvm.internal.m.a(str6, "Google")) {
                    if (kotlin.jvm.internal.m.a(str6, "Facebook")) {
                        strE0 = strE1;
                    } else {
                        strE0 = strE2;
                    }
                }
                sVar3.o0(strE0);
                objQ3 = strE0;
            }
            String str13 = (String) objQ3;
            c3 c3Var4 = fc.f30256a;
            sVar4 = sVar3;
            ua.b(str13, j0.c.E(r21, CropImageView.DEFAULT_ASPECT_RATIO, r23, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar3.j(c3Var4)).f30180n, sVar4, 48, 0, 65532);
            String strD3 = ub.a.d0(R.string.uid_format, new Object[]{str9}, sVar4);
            j3.y0 y0Var4 = ((dc) sVar4.j(c3Var4)).f30180n;
            z1.r rVarE6 = j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            if (i14 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            zH = sVar4.h(clipboardManager) | z12 | sVar4.h(context) | sVar4.f(strE3);
            objQ4 = sVar4.Q();
            if (zH) {
                str7 = str;
                objQ4 = new fu.j(str7, clipboardManager, context, strE3);
                sVar4.o0(objQ4);
            } else {
                str7 = str;
                objQ4 = new fu.j(str7, clipboardManager, context, strE3);
                sVar4.o0(objQ4);
            }
            ua.b(strD3, s2.g0.a(rVarE6, str7, (PointerInputEventHandler) objQ4), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0Var4, sVar4, 0, 0, 65532);
            sVar5 = sVar4;
            sVar5.p(true);
            sVar5.p(true);
        } else {
            str6 = str5;
            sVar5.W();
        }
        l1.x1 x1VarT = sVar5.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new g6(str7, str2, str3, str8, str6, aVar, aVar2, rVar, i11, 6);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:227:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:229:0x04e1  */
    /* JADX WARN: Code duplicated, block: B:234:0x0501  */
    /* JADX WARN: Code duplicated, block: B:240:0x0522  */
    /* JADX WARN: Code duplicated, block: B:241:0x0533  */
    /* JADX WARN: Code duplicated, block: B:244:0x0543  */
    /* JADX WARN: Code duplicated, block: B:247:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:248:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:253:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:256:0x0616  */
    /* JADX WARN: Code duplicated, block: B:257:0x0618  */
    /* JADX WARN: Code duplicated, block: B:260:0x061d  */
    /* JADX WARN: Code duplicated, block: B:263:0x0643  */
    /* JADX WARN: Code duplicated, block: B:264:0x0647  */
    /* JADX WARN: Code duplicated, block: B:269:0x0662  */
    /* JADX WARN: Code duplicated, block: B:272:0x0713  */
    /* JADX WARN: Code duplicated, block: B:275:0x0718  */
    /* JADX WARN: Code duplicated, block: B:279:0x0722  */
    /* JADX WARN: Code duplicated, block: B:282:0x072b  */
    /* JADX WARN: Code duplicated, block: B:283:0x0730  */
    /* JADX WARN: Code duplicated, block: B:285:0x0738  */
    /* JADX WARN: Code duplicated, block: B:286:0x073d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0746  */
    /* JADX WARN: Code duplicated, block: B:290:0x074b  */
    /* JADX WARN: Code duplicated, block: B:293:0x0754  */
    /* JADX WARN: Code duplicated, block: B:296:0x075d  */
    /* JADX WARN: Code duplicated, block: B:297:0x0762  */
    /* JADX WARN: Code duplicated, block: B:299:0x076a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:301:0x076d  */
    /* JADX WARN: Code duplicated, block: B:302:0x076f  */
    /* JADX WARN: Code duplicated, block: B:306:0x0786  */
    /* JADX WARN: Code duplicated, block: B:307:0x0788  */
    /* JADX WARN: Code duplicated, block: B:310:0x078f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:313:0x0795  */
    /* JADX WARN: Code duplicated, block: B:316:0x07d8  */
    /* JADX WARN: Code duplicated, block: B:318:0x07eb  */
    /* JADX WARN: Code duplicated, block: B:319:0x07f8  */
    /* JADX WARN: Code duplicated, block: B:322:0x081a  */
    /* JADX WARN: Code duplicated, block: B:325:0x0831  */
    /* JADX WARN: Code duplicated, block: B:328:0x085d  */
    /* JADX WARN: Code duplicated, block: B:331:0x0889  */
    /* JADX WARN: Code duplicated, block: B:332:0x088b  */
    /* JADX WARN: Code duplicated, block: B:335:0x0892 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:338:0x0898  */
    /* JADX WARN: Code duplicated, block: B:341:0x08c0  */
    /* JADX WARN: Code duplicated, block: B:342:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:344:0x08c5  */
    /* JADX WARN: Code duplicated, block: B:347:0x08d8  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void f(zu.m mVar, final fz.a onClickClose, fz.a onClickPremium, fz.a onClickProgressBackup, final fz.a onTakePhoto, final fz.a onChoosePhoto, final fz.e onChangePassword, final fz.c onRestProgress, final fz.a onDeleteAccount, final fz.a onLogout, final fz.c updateNickName, final fz.a resetChangePasswordResult, l1.n nVar, final int i11, final int i12) {
        fz.a aVar;
        zu.m mVar2;
        l1.s sVar;
        fz.a aVar2;
        boolean z11;
        boolean z12;
        y2.i iVar;
        y2.i iVar2;
        int iHashCode;
        y2.i iVar3;
        y2.h hVar;
        Object objQ;
        l1.b1 b1Var;
        Object objQ2;
        float f5;
        l1.b1 b1Var2;
        y2.h hVar2;
        int iHashCode2;
        double d5;
        boolean z13;
        int iHashCode3;
        String str;
        String strM;
        String strE0;
        String strE1;
        String strE2;
        String strE3;
        String strE4;
        String strE5;
        String strE6;
        boolean zF;
        Object objQ3;
        l1.g gVar;
        boolean z14;
        Object objQ4;
        l1.b1 b1Var3;
        boolean z15;
        Object objQ5;
        Object objQ6;
        boolean z16;
        Object objQ7;
        boolean z17;
        Object objQ8;
        Object objQ9;
        l1.b1 b1Var4;
        kotlin.jvm.internal.m.f(mVar, OCBJEWZHh.epNhP);
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickPremium, "onClickPremium");
        kotlin.jvm.internal.m.f(onClickProgressBackup, "onClickProgressBackup");
        kotlin.jvm.internal.m.f(onTakePhoto, "onTakePhoto");
        kotlin.jvm.internal.m.f(onChoosePhoto, "onChoosePhoto");
        kotlin.jvm.internal.m.f(onChangePassword, "onChangePassword");
        kotlin.jvm.internal.m.f(onRestProgress, "onRestProgress");
        kotlin.jvm.internal.m.f(onDeleteAccount, "onDeleteAccount");
        kotlin.jvm.internal.m.f(onLogout, "onLogout");
        kotlin.jvm.internal.m.f(updateNickName, "updateNickName");
        kotlin.jvm.internal.m.f(resetChangePasswordResult, "resetChangePasswordResult");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2135194813);
        int i13 = (i11 & 6) == 0 ? ((i11 & 8) == 0 ? sVar2.f(mVar) : sVar2.h(mVar) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i13 |= sVar2.h(onClickClose) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= sVar2.h(onClickPremium) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.h(onClickProgressBackup) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= sVar2.h(onTakePhoto) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i13 |= sVar2.h(onChoosePhoto) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= sVar2.h(onChangePassword) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= sVar2.h(onRestProgress) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= sVar2.h(onDeleteAccount) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i13 |= sVar2.h(onLogout) ? 536870912 : 268435456;
        }
        int i14 = (i12 & 6) == 0 ? i12 | (sVar2.h(updateNickName) ? 4 : 2) : i12;
        if ((i12 & 48) == 0) {
            i14 |= sVar2.h(resetChangePasswordResult) ? 32 : 16;
        }
        int i15 = i14;
        if (!sVar2.T(i13 & 1, ((i13 & 306783379) == 306783378 && (i15 & 19) == 18) ? false : true)) {
            aVar = onClickPremium;
            mVar2 = mVar;
            sVar = sVar2;
            aVar2 = onClickProgressBackup;
            sVar.W();
        } else if (mVar.equals(zu.k.f59459a)) {
            sVar2.d0(1072170642);
            tv.a.d(0, 1, sVar2, null);
            sVar2.p(false);
            aVar = onClickPremium;
            mVar2 = mVar;
            sVar = sVar2;
            aVar2 = onClickProgressBackup;
        } else {
            if (!(mVar instanceof zu.l)) {
                throw nv.p.x(sVar2, 1072179636, false);
            }
            sVar2.d0(-1122050672);
            zu.l lVar = (zu.l) mVar;
            boolean z18 = lVar.f59485i;
            String str2 = lVar.f59482f;
            String str3 = lVar.f59479c;
            int i16 = i13;
            if (lVar.f59486j) {
                sVar2.d0(-1122347280);
                z11 = false;
                tv.a.c(sVar2, 0);
            } else {
                z11 = false;
                sVar2.d0(-1129902817);
            }
            sVar2.p(z11);
            Object objQ10 = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ10 == gVar2) {
                objQ10 = l1.t.B(new f(false, false, false, false, false, false));
                sVar2.o0(objQ10);
            }
            l1.b1 b1Var5 = (l1.b1) objQ10;
            if (((f) b1Var5.getValue()).f56391a) {
                sVar2.d0(-1122130094);
                Object objQ11 = sVar2.Q();
                if (objQ11 == gVar2) {
                    objQ11 = new m(7, b1Var5);
                    sVar2.o0(objQ11);
                }
                fz.a aVar3 = (fz.a) objQ11;
                boolean z19 = (i15 & 14) == 4;
                Object objQ12 = sVar2.Q();
                if (z19 || objQ12 == gVar2) {
                    objQ12 = new y3(updateNickName, b1Var5, 10);
                    sVar2.o0(objQ12);
                }
                c.h(str3, aVar3, (fz.c) objQ12, sVar2, 48);
                sVar2.p(false);
            } else if (((f) b1Var5.getValue()).f56392b) {
                sVar2.d0(-1121688685);
                Object objQ13 = sVar2.Q();
                if (objQ13 == gVar2) {
                    objQ13 = new m(3, b1Var5);
                    sVar2.o0(objQ13);
                }
                fz.a aVar4 = (fz.a) objQ13;
                boolean z20 = (i16 & 57344) == 16384;
                Object objQ14 = sVar2.Q();
                if (z20 || objQ14 == gVar2) {
                    objQ14 = new fu.e(26, onTakePhoto, b1Var5);
                    sVar2.o0(objQ14);
                }
                fz.a aVar5 = (fz.a) objQ14;
                boolean z21 = (i16 & 458752) == 131072;
                Object objQ15 = sVar2.Q();
                if (z21 || objQ15 == gVar2) {
                    objQ15 = new fu.e(27, onChoosePhoto, b1Var5);
                    sVar2.o0(objQ15);
                }
                c.i(aVar4, aVar5, (fz.a) objQ15, sVar2, 6);
                sVar2.p(false);
            } else if (((f) b1Var5.getValue()).f56393c) {
                sVar2.d0(-1121094105);
                Object objQ16 = sVar2.Q();
                if (objQ16 == gVar2) {
                    objQ16 = new m(4, b1Var5);
                    sVar2.o0(objQ16);
                }
                fz.a aVar6 = (fz.a) objQ16;
                boolean z22 = (i16 & 234881024) == 67108864;
                Object objQ17 = sVar2.Q();
                if (z22 || objQ17 == gVar2) {
                    objQ17 = new fu.e(28, onDeleteAccount, b1Var5);
                    sVar2.o0(objQ17);
                }
                fz.a aVar7 = (fz.a) objQ17;
                Object objQ18 = sVar2.Q();
                if (objQ18 == gVar2) {
                    objQ18 = new m(5, b1Var5);
                    sVar2.o0(objQ18);
                }
                c(aVar6, aVar7, (fz.a) objQ18, sVar2, 390);
                sVar2.p(false);
            } else if (((f) b1Var5.getValue()).f56394d) {
                sVar2.d0(-1120579319);
                Object objQ19 = sVar2.Q();
                if (objQ19 == gVar2) {
                    objQ19 = new m(6, b1Var5);
                    sVar2.o0(objQ19);
                }
                fz.a aVar8 = (fz.a) objQ19;
                boolean z23 = (i16 & 29360128) == 8388608;
                Object objQ20 = sVar2.Q();
                if (z23 || objQ20 == gVar2) {
                    objQ20 = new y3(onRestProgress, b1Var5, 11);
                    sVar2.o0(objQ20);
                }
                fz.c cVar = (fz.c) objQ20;
                Object objQ21 = sVar2.Q();
                if (objQ21 == gVar2) {
                    objQ21 = new m(8, b1Var5);
                    sVar2.o0(objQ21);
                }
                c.f(390, aVar8, (fz.a) objQ21, cVar, sVar2);
                sVar2.p(false);
            } else if (((f) b1Var5.getValue()).f56395e) {
                sVar2.d0(-1120036633);
                zu.a aVar9 = lVar.f59487k;
                boolean z24 = (i15 & 112) == 32;
                Object objQ22 = sVar2.Q();
                if (z24 || objQ22 == gVar2) {
                    objQ22 = new fu.e(29, resetChangePasswordResult, b1Var5);
                    sVar2.o0(objQ22);
                }
                c.c(aVar9, (fz.a) objQ22, onChangePassword, sVar2, (i16 >> 12) & 896);
                sVar2.p(false);
            } else {
                if (((f) b1Var5.getValue()).f56396f) {
                    sVar2.d0(-1119561341);
                    Object objQ23 = sVar2.Q();
                    if (objQ23 == gVar2) {
                        objQ23 = new pr.z(25, b1Var5);
                        sVar2.o0(objQ23);
                    }
                    fz.a aVar10 = (fz.a) objQ23;
                    boolean z25 = (i16 & 1879048192) == 536870912;
                    Object objQ24 = sVar2.Q();
                    if (z25 || objQ24 == gVar2) {
                        objQ24 = new fu.e(25, onLogout, b1Var5);
                        sVar2.o0(objQ24);
                    }
                    fz.a aVar11 = (fz.a) objQ24;
                    Object objQ25 = sVar2.Q();
                    if (objQ25 == gVar2) {
                        objQ25 = new pr.z(26, b1Var5);
                        sVar2.o0(objQ25);
                    }
                    d(aVar10, aVar11, (fz.a) objQ25, sVar2, 390);
                    z12 = false;
                } else {
                    z12 = false;
                    sVar2.d0(-1129902817);
                }
                sVar2.p(z12);
            }
            c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar2.j(c3Var)).f31031n;
            z1.o oVar = z1.o.f58481a;
            g2.r0 r0Var = g2.f0.f28556b;
            z1.r rVarV = j0.c.v(e2.d(d0.n.h(oVar, j11, r0Var), 1.0f));
            j0.d dVar = j0.i.f35305c;
            z1.h hVar3 = z1.c.O;
            j0.u uVarA = j0.t.a(dVar, hVar3, sVar2, 0);
            int iHashCode4 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarV);
            y2.k.J.getClass();
            y2.i iVar4 = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar4);
            } else {
                sVar2.r0();
            }
            y2.h hVar4 = y2.j.f56917f;
            l1.t.J(hVar4, uVarA, sVar2);
            y2.h hVar5 = y2.j.f56916e;
            l1.t.J(hVar5, q1VarL, sVar2);
            y2.h hVar6 = y2.j.f56918g;
            if (sVar2.S) {
                iVar = iVar4;
            } else {
                iVar = iVar4;
                if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                }
                y2.h hVar7 = y2.j.f56915d;
                l1.t.J(hVar7, rVarC, sVar2);
                iVar2 = iVar;
                iu.k.g(onClickClose, null, c.f56373w, null, null, null, null, null, sVar2, ((i16 >> 3) & 14) | 384, 250);
                sVar = sVar2;
                k7.g(null, a.f56326c, g2.x.f28622i, sVar, 432, 1);
                z1.r rVarY = d0.n.y(d0.n.h(oVar, ((h1.s1) sVar.j(c3Var)).f31033p, r0Var), d0.n.u(sVar), true, 12);
                j0.u uVarA2 = j0.t.a(dVar, hVar3, sVar, 0);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVarY);
                sVar.h0();
                if (sVar.S) {
                    iVar3 = iVar2;
                    sVar.k(iVar3);
                } else {
                    iVar3 = iVar2;
                    sVar.r0();
                }
                l1.t.J(hVar4, uVarA2, sVar);
                l1.t.J(hVar5, q1VarL2, sVar);
                if (sVar.S && kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    hVar = hVar6;
                } else {
                    hVar = hVar6;
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(hVar7, rVarC2, sVar);
                String str4 = lVar.f59478b;
                String str5 = lVar.f59481e;
                String str6 = lVar.f59483g;
                objQ = sVar.Q();
                if (objQ == gVar2) {
                    b1Var = b1Var5;
                    objQ = new pr.z(27, b1Var);
                    sVar.o0(objQ);
                } else {
                    b1Var = b1Var5;
                }
                fz.a aVar12 = (fz.a) objQ;
                objQ2 = sVar.Q();
                if (objQ2 == gVar2) {
                    objQ2 = new pr.z(28, b1Var);
                    sVar.o0(objQ2);
                }
                fz.a aVar13 = (fz.a) objQ2;
                float f11 = 12;
                f5 = a.f56327d;
                a(str4, str3, str5, str6, str2, aVar12, aVar13, j0.c.B(oVar, f5, f11), sVar, 1769472);
                b1Var2 = b1Var;
                hVar2 = hVar;
                k7.g(j0.c.C(oVar, 18, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
                z1.i iVar5 = z1.c.M;
                z1.r rVarA = j0.c.A(oVar, f5);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar5, sVar, 48);
                iHashCode2 = Long.hashCode(sVar.T);
                l1.q1 q1VarL3 = sVar.l();
                z1.r rVarC3 = z1.a.c(sVar, rVarA);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar4, a2VarA, sVar);
                l1.t.J(hVar5, q1VarL3, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
                }
                l1.t.J(hVar7, rVarC3, sVar);
                d0.n.c(se.k.y(R.drawable.account_email, sVar, 0), null, e2.n(oVar, a.f56325b), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                z1.r rVarC4 = j0.c.C(oVar, f11, CropImageView.DEFAULT_ASPECT_RATIO, 2);
                d5 = 1.0f;
                if (d5 > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                z1.r rVarP = w4.c.p(1.0f, true, rVarC4);
                j0.u uVarA3 = j0.t.a(dVar, hVar3, sVar, 0);
                iHashCode3 = Long.hashCode(sVar.T);
                l1.q1 q1VarL4 = sVar.l();
                z1.r rVarC5 = z1.a.c(sVar, rVarP);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar3);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar4, uVarA3, sVar);
                l1.t.J(hVar5, q1VarL4, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
                }
                l1.t.J(hVar7, rVarC5, sVar);
                ua.b(lVar.f59480d, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65534);
                sVar.p(true);
                sVar.p(true);
                str = lVar.f59484h;
                strM = defpackage.e.m(ub.a.e0(sVar, R.string.account_type), " ");
                strE0 = ub.a.e0(sVar, R.string.membership_premium_lifetime);
                strE1 = ub.a.e0(sVar, R.string.membership_premium_monthly);
                strE2 = ub.a.e0(sVar, R.string.membership_premium_quarterly);
                strE3 = ub.a.e0(sVar, R.string.membership_premium_semiannual);
                strE4 = ub.a.e0(sVar, R.string.membership_premium_annual);
                strE5 = ub.a.e0(sVar, R.string.membership_premium);
                strE6 = ub.a.e0(sVar, R.string.membership_basic);
                zF = sVar.f(str) | sVar.g(z18);
                objQ3 = sVar.Q();
                if (zF) {
                    gVar = gVar2;
                } else {
                    gVar = gVar2;
                    if (objQ3 == gVar) {
                    }
                    String str7 = (String) objQ3;
                    boolean z26 = !z18;
                    if ((i16 & 896) == 256) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objQ4 = sVar.Q();
                    if (!z14 || objQ4 == gVar) {
                        aVar = onClickPremium;
                        objQ4 = new wo.c(11, aVar);
                        sVar.o0(objQ4);
                    } else {
                        aVar = onClickPremium;
                    }
                    mVar2 = mVar;
                    b(R.drawable.account_premium, str7, j0.c.A(d0.n.o(oVar, z26, null, (fz.a) objQ4, 14), f5), t1.e.d(-553296068, new mt.r(mVar2, 24), sVar), sVar, 3072);
                    if (ry.l.D(new String[]{"Google", "Facebook"}, str2)) {
                        b1Var3 = b1Var2;
                        z15 = false;
                        sVar.d0(-1292556180);
                    } else {
                        sVar.d0(-1277954126);
                        String strE7 = ub.a.e0(sVar, R.string.change_password);
                        objQ9 = sVar.Q();
                        if (objQ9 == gVar) {
                            b1Var4 = b1Var2;
                            objQ9 = new pr.z(29, b1Var4);
                            sVar.o0(objQ9);
                        } else {
                            b1Var4 = b1Var2;
                        }
                        b1Var3 = b1Var4;
                        z15 = false;
                        b(R.drawable.account_change_password, strE7, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ9, 15), f5), c.f56374x, sVar, 3072);
                    }
                    sVar.p(z15);
                    String strE8 = ub.a.e0(sVar, R.string.clear_progress);
                    objQ5 = sVar.Q();
                    if (objQ5 == gVar) {
                        objQ5 = new m(0, b1Var3);
                        sVar.o0(objQ5);
                    }
                    b(R.drawable.account_reset_progress, strE8, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ5, 15), f5), c.f56375y, sVar, 3072);
                    String strE9 = ub.a.e0(sVar, R.string.delete_account);
                    objQ6 = sVar.Q();
                    if (objQ6 == gVar) {
                        objQ6 = new m(1, b1Var3);
                        sVar.o0(objQ6);
                    }
                    b(R.drawable.account_delete_account, strE9, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ6, 15), f5), c.f56376z, sVar, 3072);
                    String strE10 = ub.a.e0(sVar, R.string.progress_sync);
                    if ((i16 & 7168) == 2048) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    objQ7 = sVar.Q();
                    if (!z16 || objQ7 == gVar) {
                        aVar2 = onClickProgressBackup;
                        objQ7 = new wo.c(12, aVar2);
                        sVar.o0(objQ7);
                    } else {
                        aVar2 = onClickProgressBackup;
                    }
                    b(R.drawable.backup_download_backup, strE10, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ7, 15), f5), c.A, sVar, 3072);
                    sVar.p(true);
                    if (d5 > 0.0d) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        k0.a.a("invalid weight; must be greater than zero");
                    }
                    j0.c.g(sVar, new j0.i1(1.0f, true));
                    objQ8 = sVar.Q();
                    if (objQ8 == gVar) {
                        objQ8 = new m(2, b1Var3);
                        sVar.o0(objQ8);
                    }
                    iu.k.e((fz.a) objQ8, e2.e(j0.c.A(oVar, 16), 1.0f), false, 0L, null, c.B, sVar, 196662, 28);
                    sVar.p(true);
                    sVar.p(false);
                }
                switch (str.hashCode()) {
                    case -1935871827:
                        if (!str.equals("YEAR-SUBSCRIPTION")) {
                            strE5 = defpackage.e.m(strM, strE4);
                        } else if (!z18) {
                            strE5 = strE6;
                        }
                        break;
                    case -299982564:
                        if (!str.equals("SEMI-SUBSCRIPTION")) {
                            strE5 = defpackage.e.m(strM, strE3);
                        } else if (!z18) {
                            strE5 = strE6;
                        }
                        break;
                    case 399530551:
                        if (!str.equals("PREMIUM")) {
                            if (!z18) {
                                strE5 = strE6;
                            }
                        }
                        break;
                    case 1285232490:
                        if (!str.equals("MONTH-SUBSCRIPTION")) {
                            strE5 = defpackage.e.m(strM, strE1);
                        } else if (!z18) {
                            strE5 = strE6;
                        }
                        break;
                    case 1743197129:
                        if (str.equals("LIFETIME")) {
                            strE5 = defpackage.e.m(strM, strE0);
                        } else if (!z18) {
                            strE5 = strE6;
                        }
                        break;
                    case 1942174398:
                        if (!str.equals("QUARTER-SUBSCRIPTION")) {
                            strE5 = defpackage.e.m(strM, strE2);
                        } else if (!z18) {
                            strE5 = strE6;
                        }
                        break;
                    default:
                        if (!z18) {
                            strE5 = strE6;
                        }
                        break;
                }
                sVar.o0(strE5);
                objQ3 = strE5;
                String str8 = (String) objQ3;
                boolean z27 = !z18;
                if ((i16 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ4 = sVar.Q();
                if (z14) {
                    aVar = onClickPremium;
                    objQ4 = new wo.c(11, aVar);
                    sVar.o0(objQ4);
                } else {
                    aVar = onClickPremium;
                    objQ4 = new wo.c(11, aVar);
                    sVar.o0(objQ4);
                }
                mVar2 = mVar;
                b(R.drawable.account_premium, str8, j0.c.A(d0.n.o(oVar, z27, null, (fz.a) objQ4, 14), f5), t1.e.d(-553296068, new mt.r(mVar2, 24), sVar), sVar, 3072);
                if (ry.l.D(new String[]{"Google", "Facebook"}, str2)) {
                    sVar.d0(-1277954126);
                    String strE11 = ub.a.e0(sVar, R.string.change_password);
                    objQ9 = sVar.Q();
                    if (objQ9 == gVar) {
                        b1Var4 = b1Var2;
                        objQ9 = new pr.z(29, b1Var4);
                        sVar.o0(objQ9);
                    } else {
                        b1Var4 = b1Var2;
                    }
                    b1Var3 = b1Var4;
                    z15 = false;
                    b(R.drawable.account_change_password, strE11, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ9, 15), f5), c.f56374x, sVar, 3072);
                } else {
                    b1Var3 = b1Var2;
                    z15 = false;
                    sVar.d0(-1292556180);
                }
                sVar.p(z15);
                String strE12 = ub.a.e0(sVar, R.string.clear_progress);
                objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    objQ5 = new m(0, b1Var3);
                    sVar.o0(objQ5);
                }
                b(R.drawable.account_reset_progress, strE12, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ5, 15), f5), c.f56375y, sVar, 3072);
                String strE13 = ub.a.e0(sVar, R.string.delete_account);
                objQ6 = sVar.Q();
                if (objQ6 == gVar) {
                    objQ6 = new m(1, b1Var3);
                    sVar.o0(objQ6);
                }
                b(R.drawable.account_delete_account, strE13, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ6, 15), f5), c.f56376z, sVar, 3072);
                String strE14 = ub.a.e0(sVar, R.string.progress_sync);
                if ((i16 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ7 = sVar.Q();
                if (z16) {
                    aVar2 = onClickProgressBackup;
                    objQ7 = new wo.c(12, aVar2);
                    sVar.o0(objQ7);
                } else {
                    aVar2 = onClickProgressBackup;
                    objQ7 = new wo.c(12, aVar2);
                    sVar.o0(objQ7);
                }
                b(R.drawable.backup_download_backup, strE14, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ7, 15), f5), c.A, sVar, 3072);
                sVar.p(true);
                if (d5 > 0.0d) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.c.g(sVar, new j0.i1(1.0f, true));
                objQ8 = sVar.Q();
                if (objQ8 == gVar) {
                    objQ8 = new m(2, b1Var3);
                    sVar.o0(objQ8);
                }
                iu.k.e((fz.a) objQ8, e2.e(j0.c.A(oVar, 16), 1.0f), false, 0L, null, c.B, sVar, 196662, 28);
                sVar.p(true);
                sVar.p(false);
            }
            defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar6);
            y2.h hVar8 = y2.j.f56915d;
            l1.t.J(hVar8, rVarC, sVar2);
            iVar2 = iVar;
            iu.k.g(onClickClose, null, c.f56373w, null, null, null, null, null, sVar2, ((i16 >> 3) & 14) | 384, 250);
            sVar = sVar2;
            k7.g(null, a.f56326c, g2.x.f28622i, sVar, 432, 1);
            z1.r rVarY2 = d0.n.y(d0.n.h(oVar, ((h1.s1) sVar.j(c3Var)).f31033p, r0Var), d0.n.u(sVar), true, 12);
            j0.u uVarA4 = j0.t.a(dVar, hVar3, sVar, 0);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL5 = sVar.l();
            z1.r rVarC6 = z1.a.c(sVar, rVarY2);
            sVar.h0();
            if (sVar.S) {
                iVar3 = iVar2;
                sVar.k(iVar3);
            } else {
                iVar3 = iVar2;
                sVar.r0();
            }
            l1.t.J(hVar4, uVarA4, sVar);
            l1.t.J(hVar5, q1VarL5, sVar);
            if (sVar.S) {
                hVar = hVar6;
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            } else {
                hVar = hVar6;
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(hVar8, rVarC6, sVar);
            String str9 = lVar.f59478b;
            String str10 = lVar.f59481e;
            String str11 = lVar.f59483g;
            objQ = sVar.Q();
            if (objQ == gVar2) {
                b1Var = b1Var5;
                objQ = new pr.z(27, b1Var);
                sVar.o0(objQ);
            } else {
                b1Var = b1Var5;
            }
            fz.a aVar14 = (fz.a) objQ;
            objQ2 = sVar.Q();
            if (objQ2 == gVar2) {
                objQ2 = new pr.z(28, b1Var);
                sVar.o0(objQ2);
            }
            fz.a aVar15 = (fz.a) objQ2;
            float f12 = 12;
            f5 = a.f56327d;
            a(str9, str3, str10, str11, str2, aVar14, aVar15, j0.c.B(oVar, f5, f12), sVar, 1769472);
            b1Var2 = b1Var;
            hVar2 = hVar;
            k7.g(j0.c.C(oVar, 18, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 0L, sVar, 6, 6);
            z1.i iVar6 = z1.c.M;
            z1.r rVarA2 = j0.c.A(oVar, f5);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar6, sVar, 48);
            iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL6 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarA2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar4, a2VarA2, sVar);
            l1.t.J(hVar5, q1VarL6, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
            } else {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar2);
            }
            l1.t.J(hVar8, rVarC7, sVar);
            d0.n.c(se.k.y(R.drawable.account_email, sVar, 0), null, e2.n(oVar, a.f56325b), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
            z1.r rVarC8 = j0.c.C(oVar, f12, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            d5 = 1.0f;
            if (d5 > 0.0d) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarP2 = w4.c.p(1.0f, true, rVarC8);
            j0.u uVarA5 = j0.t.a(dVar, hVar3, sVar, 0);
            iHashCode3 = Long.hashCode(sVar.T);
            l1.q1 q1VarL7 = sVar.l();
            z1.r rVarC9 = z1.a.c(sVar, rVarP2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar4, uVarA5, sVar);
            l1.t.J(hVar5, q1VarL7, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
            } else {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar2);
            }
            l1.t.J(hVar8, rVarC9, sVar);
            ua.b(lVar.f59480d, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar, 0, 0, 65534);
            sVar.p(true);
            sVar.p(true);
            str = lVar.f59484h;
            strM = defpackage.e.m(ub.a.e0(sVar, R.string.account_type), " ");
            strE0 = ub.a.e0(sVar, R.string.membership_premium_lifetime);
            strE1 = ub.a.e0(sVar, R.string.membership_premium_monthly);
            strE2 = ub.a.e0(sVar, R.string.membership_premium_quarterly);
            strE3 = ub.a.e0(sVar, R.string.membership_premium_semiannual);
            strE4 = ub.a.e0(sVar, R.string.membership_premium_annual);
            strE5 = ub.a.e0(sVar, R.string.membership_premium);
            strE6 = ub.a.e0(sVar, R.string.membership_basic);
            zF = sVar.f(str) | sVar.g(z18);
            objQ3 = sVar.Q();
            if (zF) {
                gVar = gVar2;
                if (objQ3 == gVar) {
                }
                String str12 = (String) objQ3;
                boolean z28 = !z18;
                if ((i16 & 896) == 256) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ4 = sVar.Q();
                if (z14) {
                    aVar = onClickPremium;
                    objQ4 = new wo.c(11, aVar);
                    sVar.o0(objQ4);
                } else {
                    aVar = onClickPremium;
                    objQ4 = new wo.c(11, aVar);
                    sVar.o0(objQ4);
                }
                mVar2 = mVar;
                b(R.drawable.account_premium, str12, j0.c.A(d0.n.o(oVar, z28, null, (fz.a) objQ4, 14), f5), t1.e.d(-553296068, new mt.r(mVar2, 24), sVar), sVar, 3072);
                if (ry.l.D(new String[]{"Google", "Facebook"}, str2)) {
                    sVar.d0(-1277954126);
                    String strE15 = ub.a.e0(sVar, R.string.change_password);
                    objQ9 = sVar.Q();
                    if (objQ9 == gVar) {
                        b1Var4 = b1Var2;
                        objQ9 = new pr.z(29, b1Var4);
                        sVar.o0(objQ9);
                    } else {
                        b1Var4 = b1Var2;
                    }
                    b1Var3 = b1Var4;
                    z15 = false;
                    b(R.drawable.account_change_password, strE15, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ9, 15), f5), c.f56374x, sVar, 3072);
                } else {
                    b1Var3 = b1Var2;
                    z15 = false;
                    sVar.d0(-1292556180);
                }
                sVar.p(z15);
                String strE16 = ub.a.e0(sVar, R.string.clear_progress);
                objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    objQ5 = new m(0, b1Var3);
                    sVar.o0(objQ5);
                }
                b(R.drawable.account_reset_progress, strE16, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ5, 15), f5), c.f56375y, sVar, 3072);
                String strE17 = ub.a.e0(sVar, R.string.delete_account);
                objQ6 = sVar.Q();
                if (objQ6 == gVar) {
                    objQ6 = new m(1, b1Var3);
                    sVar.o0(objQ6);
                }
                b(R.drawable.account_delete_account, strE17, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ6, 15), f5), c.f56376z, sVar, 3072);
                String strE18 = ub.a.e0(sVar, R.string.progress_sync);
                if ((i16 & 7168) == 2048) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ7 = sVar.Q();
                if (z16) {
                    aVar2 = onClickProgressBackup;
                    objQ7 = new wo.c(12, aVar2);
                    sVar.o0(objQ7);
                } else {
                    aVar2 = onClickProgressBackup;
                    objQ7 = new wo.c(12, aVar2);
                    sVar.o0(objQ7);
                }
                b(R.drawable.backup_download_backup, strE18, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ7, 15), f5), c.A, sVar, 3072);
                sVar.p(true);
                if (d5 > 0.0d) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (!z17) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.c.g(sVar, new j0.i1(1.0f, true));
                objQ8 = sVar.Q();
                if (objQ8 == gVar) {
                    objQ8 = new m(2, b1Var3);
                    sVar.o0(objQ8);
                }
                iu.k.e((fz.a) objQ8, e2.e(j0.c.A(oVar, 16), 1.0f), false, 0L, null, c.B, sVar, 196662, 28);
                sVar.p(true);
                sVar.p(false);
            } else {
                gVar = gVar2;
            }
            switch (str.hashCode()) {
                case -1935871827:
                    if (!str.equals("YEAR-SUBSCRIPTION")) {
                        strE5 = defpackage.e.m(strM, strE4);
                    } else if (!z18) {
                        strE5 = strE6;
                    }
                    break;
                case -299982564:
                    if (!str.equals("SEMI-SUBSCRIPTION")) {
                        strE5 = defpackage.e.m(strM, strE3);
                    } else if (!z18) {
                        strE5 = strE6;
                    }
                    break;
                case 399530551:
                    if (!str.equals("PREMIUM")) {
                        if (!z18) {
                            strE5 = strE6;
                        }
                    }
                    break;
                case 1285232490:
                    if (!str.equals("MONTH-SUBSCRIPTION")) {
                        strE5 = defpackage.e.m(strM, strE1);
                    } else if (!z18) {
                        strE5 = strE6;
                    }
                    break;
                case 1743197129:
                    if (str.equals("LIFETIME")) {
                        strE5 = defpackage.e.m(strM, strE0);
                    } else if (!z18) {
                        strE5 = strE6;
                    }
                    break;
                case 1942174398:
                    if (!str.equals("QUARTER-SUBSCRIPTION")) {
                        strE5 = defpackage.e.m(strM, strE2);
                    } else if (!z18) {
                        strE5 = strE6;
                    }
                    break;
                default:
                    if (!z18) {
                        strE5 = strE6;
                    }
                    break;
            }
            sVar.o0(strE5);
            objQ3 = strE5;
            String str13 = (String) objQ3;
            boolean z29 = !z18;
            if ((i16 & 896) == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ4 = sVar.Q();
            if (z14) {
                aVar = onClickPremium;
                objQ4 = new wo.c(11, aVar);
                sVar.o0(objQ4);
            } else {
                aVar = onClickPremium;
                objQ4 = new wo.c(11, aVar);
                sVar.o0(objQ4);
            }
            mVar2 = mVar;
            b(R.drawable.account_premium, str13, j0.c.A(d0.n.o(oVar, z29, null, (fz.a) objQ4, 14), f5), t1.e.d(-553296068, new mt.r(mVar2, 24), sVar), sVar, 3072);
            if (ry.l.D(new String[]{"Google", "Facebook"}, str2)) {
                sVar.d0(-1277954126);
                String strE19 = ub.a.e0(sVar, R.string.change_password);
                objQ9 = sVar.Q();
                if (objQ9 == gVar) {
                    b1Var4 = b1Var2;
                    objQ9 = new pr.z(29, b1Var4);
                    sVar.o0(objQ9);
                } else {
                    b1Var4 = b1Var2;
                }
                b1Var3 = b1Var4;
                z15 = false;
                b(R.drawable.account_change_password, strE19, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ9, 15), f5), c.f56374x, sVar, 3072);
            } else {
                b1Var3 = b1Var2;
                z15 = false;
                sVar.d0(-1292556180);
            }
            sVar.p(z15);
            String strE110 = ub.a.e0(sVar, R.string.clear_progress);
            objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = new m(0, b1Var3);
                sVar.o0(objQ5);
            }
            b(R.drawable.account_reset_progress, strE110, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ5, 15), f5), c.f56375y, sVar, 3072);
            String strE111 = ub.a.e0(sVar, R.string.delete_account);
            objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                objQ6 = new m(1, b1Var3);
                sVar.o0(objQ6);
            }
            b(R.drawable.account_delete_account, strE111, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ6, 15), f5), c.f56376z, sVar, 3072);
            String strE112 = ub.a.e0(sVar, R.string.progress_sync);
            if ((i16 & 7168) == 2048) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ7 = sVar.Q();
            if (z16) {
                aVar2 = onClickProgressBackup;
                objQ7 = new wo.c(12, aVar2);
                sVar.o0(objQ7);
            } else {
                aVar2 = onClickProgressBackup;
                objQ7 = new wo.c(12, aVar2);
                sVar.o0(objQ7);
            }
            b(R.drawable.backup_download_backup, strE112, j0.c.A(d0.n.o(oVar, false, null, (fz.a) objQ7, 15), f5), c.A, sVar, 3072);
            sVar.p(true);
            if (d5 > 0.0d) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z17) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new j0.i1(1.0f, true));
            objQ8 = sVar.Q();
            if (objQ8 == gVar) {
                objQ8 = new m(2, b1Var3);
                sVar.o0(objQ8);
            }
            iu.k.e((fz.a) objQ8, e2.e(j0.c.A(oVar, 16), 1.0f), false, 0L, null, c.B, sVar, 196662, 28);
            sVar.p(true);
            sVar.p(false);
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            final fz.a aVar16 = aVar;
            final fz.a aVar17 = aVar2;
            final zu.m mVar3 = mVar2;
            x1VarT.f39502d = new fz.e() { // from class: xu.o
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    int iM2 = l1.t.M(i12);
                    r.f(mVar3, onClickClose, aVar16, aVar17, onTakePhoto, onChoosePhoto, onChangePassword, onRestProgress, onDeleteAccount, onLogout, updateNickName, resetChangePasswordResult, (l1.n) obj, iM, iM2);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
