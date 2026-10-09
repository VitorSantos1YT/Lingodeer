package ys;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import rt.h9;
import rt.hb;
import rt.l9;
import rt.mb;
import rt.qc;
import rt.rc;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h2 {
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
    public static final void a(final boolean z11, mb mbVar, l9 l9Var, fz.a onClickClose, fz.a finish, fz.c loginNow, fz.c cVar, l1.n nVar, int i11) {
        mb mbVar2;
        l9 l9Var2;
        l9 l9Var3;
        int i12;
        mb mbVar3;
        mb mbVar4;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(finish, "finish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-244316533);
        int i13 = i11 | (sVar.g(z11) ? 4 : 2) | 144 | (sVar.h(onClickClose) ? 2048 : 1024) | (sVar.h(finish) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(loginNow) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(cVar) ? 1048576 : 524288);
        if (sVar.T(i13 & 1, (599187 & i13) != 599186)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean z12 = (i13 & 14) == 4;
                Object objQ = sVar.Q();
                if (z12 || objQ == gVar) {
                    objQ = new fz.a() { // from class: ys.e2
                        @Override // fz.a
                        public final Object invoke() {
                            return com.bumptech.glide.d.G(Boolean.valueOf(z11));
                        }
                    };
                    sVar.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar.d0(-1614864554);
                LocalViewModelStoreOwner localViewModelStoreOwner = LocalViewModelStoreOwner.INSTANCE;
                int i15 = LocalViewModelStoreOwner.$stable;
                ViewModelStoreOwner current = localViewModelStoreOwner.getCurrent(sVar, i15);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(mb.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar);
                sVar.p(false);
                mb mbVar5 = (mb) viewModelA;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current2 = localViewModelStoreOwner.getCurrent(sVar, i15);
                if (current2 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA2 = i20.b.a(kotlin.jvm.internal.z.a(l9.class), current2.getViewModelStore(), null, i20.a.a(current2), null, q10.b.a(sVar), null);
                sVar.p(false);
                l9Var3 = (l9) viewModelA2;
                i12 = i13 & (-1009);
                mbVar3 = mbVar5;
            } else {
                sVar.W();
                l9Var3 = l9Var;
                i12 = i13 & (-1009);
                mbVar3 = mbVar;
            }
            sVar.q();
            j9.v vVarH = cf.x.H(new j9.c0[0], sVar);
            boolean zH = ((i12 & 7168) == 2048) | sVar.h(mbVar3) | sVar.h(l9Var3) | ((3670016 & i12) == 1048576) | sVar.h(vVarH) | ((57344 & i12) == 16384) | ((i12 & 458752) == 131072);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                mb mbVar6 = mbVar3;
                dl.d dVar = new dl.d(mbVar6, l9Var3, cVar, onClickClose, vVarH, finish, loginNow, 10);
                mbVar4 = mbVar6;
                sVar.o0(dVar);
                objQ2 = dVar;
            } else {
                mbVar4 = mbVar3;
            }
            com.bumptech.glide.e.c(vVarH, "course_test", null, null, null, null, null, null, (fz.c) objQ2, sVar, 48);
            l9Var2 = l9Var3;
            mbVar2 = mbVar4;
        } else {
            sVar.W();
            mbVar2 = mbVar;
            l9Var2 = l9Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new es.g(z11, mbVar2, l9Var2, onClickClose, finish, loginNow, cVar, i11);
        }
    }

    public static final void b(final rc uiState, final h9 settingsUiState, final qs.b bVar, final hb countDownState, final int i11, final int i12, final fz.c onClickBilling, final fz.c bookmarkUiStateFor, final fz.e bookmarkUiStateForItem, final fz.c knowledgeNoteUiStateFor, final fz.c onToggleBookmarkFor, final fz.f onToggleBookmarkForItem, final fz.e onSaveKnowledgeNoteFor, final fz.a startCountdown, final fz.a pauseCountdown, final fz.a resumeCountdown, final fz.c onConfirmSettings, final fz.e onConfirmQuestionPreference, final fz.c onResetQuestionPreference, final fz.a updateScriptShortcutDisplay, final fz.e onChecked, final fz.a onShowNext, final fz.c onSkip, final fz.a onClickClose, final fz.a showFinishScreen, l1.n nVar, final int i13) {
        l1.s sVar;
        l1.s sVar2;
        l1.g gVar;
        boolean z11;
        int i14;
        qc qcVar;
        boolean z12;
        l1.b1 b1Var;
        l1.s sVar3;
        boolean z13;
        int i15;
        kotlin.jvm.internal.m.f(uiState, "uiState");
        kotlin.jvm.internal.m.f(settingsUiState, "settingsUiState");
        kotlin.jvm.internal.m.f(countDownState, "countDownState");
        kotlin.jvm.internal.m.f(onClickBilling, "onClickBilling");
        kotlin.jvm.internal.m.f(bookmarkUiStateFor, "bookmarkUiStateFor");
        kotlin.jvm.internal.m.f(bookmarkUiStateForItem, "bookmarkUiStateForItem");
        kotlin.jvm.internal.m.f(knowledgeNoteUiStateFor, "knowledgeNoteUiStateFor");
        kotlin.jvm.internal.m.f(onToggleBookmarkFor, "onToggleBookmarkFor");
        kotlin.jvm.internal.m.f(onToggleBookmarkForItem, "onToggleBookmarkForItem");
        kotlin.jvm.internal.m.f(onSaveKnowledgeNoteFor, "onSaveKnowledgeNoteFor");
        kotlin.jvm.internal.m.f(startCountdown, "startCountdown");
        kotlin.jvm.internal.m.f(pauseCountdown, "pauseCountdown");
        kotlin.jvm.internal.m.f(resumeCountdown, "resumeCountdown");
        kotlin.jvm.internal.m.f(onConfirmSettings, "onConfirmSettings");
        kotlin.jvm.internal.m.f(onConfirmQuestionPreference, "onConfirmQuestionPreference");
        kotlin.jvm.internal.m.f(onResetQuestionPreference, "onResetQuestionPreference");
        kotlin.jvm.internal.m.f(updateScriptShortcutDisplay, "updateScriptShortcutDisplay");
        kotlin.jvm.internal.m.f(onChecked, "onChecked");
        kotlin.jvm.internal.m.f(onShowNext, "onShowNext");
        kotlin.jvm.internal.m.f(onSkip, "onSkip");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(showFinishScreen, "showFinishScreen");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(-515093925);
        int i16 = i13 | (sVar4.f(uiState) ? 4 : 2) | (sVar4.f(settingsUiState) ? 32 : 16) | (sVar4.h(bVar) ? 256 : 128) | (sVar4.f(countDownState) ? 2048 : 1024) | (sVar4.d(i11) ? 16384 : 8192) | (sVar4.d(i12) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar4.h(onClickBilling) ? 1048576 : 524288) | (sVar4.h(bookmarkUiStateFor) ? 8388608 : 4194304) | (sVar4.h(bookmarkUiStateForItem) ? 67108864 : 33554432) | (sVar4.h(knowledgeNoteUiStateFor) ? 536870912 : 268435456);
        int i17 = (sVar4.h(onToggleBookmarkFor) ? 4 : 2) | (sVar4.h(onToggleBookmarkForItem) ? 32 : 16) | (sVar4.h(onSaveKnowledgeNoteFor) ? 256 : 128) | (sVar4.h(startCountdown) ? 2048 : 1024) | (sVar4.h(pauseCountdown) ? 16384 : 8192) | (sVar4.h(resumeCountdown) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar4.h(onConfirmSettings) ? 1048576 : 524288) | (sVar4.h(onConfirmQuestionPreference) ? 8388608 : 4194304) | (sVar4.h(onResetQuestionPreference) ? 67108864 : 33554432) | (sVar4.h(updateScriptShortcutDisplay) ? 536870912 : 268435456);
        int i18 = (sVar4.h(onChecked) ? (char) 4 : (char) 2) | (sVar4.h(onShowNext) ? ' ' : (char) 16) | (sVar4.h(onSkip) ? (char) 256 : (char) 128) | (sVar4.h(onClickClose) ? (char) 2048 : (char) 1024) | (sVar4.h(showFinishScreen) ? (char) 16384 : (char) 8192);
        if (sVar4.T(i16 & 1, ((i16 & 306783379) == 306783378 && (i17 & 306783379) == 306783378 && (i18 & 9363) == 9362) ? false : true)) {
            int i19 = i16 & 14;
            boolean z14 = (i19 == 4) | ((i17 & 7168) == 2048);
            Object objQ = sVar4.Q();
            l1.g gVar2 = l1.m.f39353a;
            vy.d dVar = null;
            if (z14 || objQ == gVar2) {
                objQ = new nu.b(23, uiState, startCountdown, dVar);
                sVar4.o0(objQ);
            }
            l1.t.f((fz.e) objQ, uiState, sVar4);
            Object objQ2 = sVar4.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar4.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            if (((Boolean) b1Var2.getValue()).booleanValue()) {
                sVar4.d0(756600263);
                Object objQ3 = sVar4.Q();
                if (objQ3 == gVar2) {
                    objQ3 = new d1(2, b1Var2);
                    sVar4.o0(objQ3);
                }
                fz.a aVar = (fz.a) objQ3;
                boolean z15 = (i17 & 3670016) == 1048576;
                Object objQ4 = sVar4.Q();
                if (z15 || objQ4 == gVar2) {
                    objQ4 = new xu.n1(onConfirmSettings, 8);
                    sVar4.o0(objQ4);
                }
                fz.c cVar = (fz.c) objQ4;
                boolean zH = sVar4.h(bVar) | ((i17 & 29360128) == 8388608);
                Object objQ5 = sVar4.Q();
                if (zH || objQ5 == gVar2) {
                    objQ5 = new d2(bVar, onConfirmQuestionPreference, 0);
                    sVar4.o0(objQ5);
                }
                fz.c cVar2 = (fz.c) objQ5;
                boolean z16 = (i17 & 234881024) == 67108864;
                Object objQ6 = sVar4.Q();
                if (z16 || objQ6 == gVar2) {
                    objQ6 = new xu.n1(onResetQuestionPreference, 9);
                    sVar4.o0(objQ6);
                }
                int i21 = i16 >> 3;
                gVar = gVar2;
                i14 = 734423111;
                qcVar = null;
                a.w(settingsUiState, bVar, false, false, aVar, cVar, cVar2, (fz.c) objQ6, sVar4, (i21 & 14) | 24576 | (i21 & 112), 12);
                sVar2 = sVar4;
                z11 = false;
            } else {
                sVar2 = sVar4;
                gVar = gVar2;
                z11 = false;
                i14 = 734423111;
                qcVar = null;
                sVar2.d0(734423111);
            }
            sVar2.p(z11);
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ7);
            }
            l1.b1 b1Var3 = (l1.b1) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ8);
            }
            l1.b1 b1Var4 = (l1.b1) objQ8;
            qc qcVar2 = uiState instanceof qc ? (qc) uiState : qcVar;
            long j11 = qcVar2 != null ? qcVar2.f50303c : -1L;
            if (!((Boolean) b1Var4.getValue()).booleanValue() || j11 <= 0) {
                z12 = false;
                sVar2.d0(i14);
            } else {
                sVar2.d0(757562224);
                Object objQ9 = sVar2.Q();
                if (objQ9 == gVar) {
                    objQ9 = new d1(3, b1Var4);
                    sVar2.o0(objQ9);
                }
                fz.a aVar2 = (fz.a) objQ9;
                boolean z17 = (i16 & 3670016) == 1048576;
                Object objQ10 = sVar2.Q();
                if (z17 || objQ10 == gVar) {
                    objQ10 = new xu.w0(onClickBilling, 14);
                    sVar2.o0(objQ10);
                }
                j3.c(j11, aVar2, (fz.a) objQ10, sVar2, 48);
                z12 = false;
            }
            sVar2.p(z12);
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar2.d0(757870829);
                Object objQ11 = sVar2.Q();
                if (objQ11 == gVar) {
                    objQ11 = new d1(4, b1Var3);
                    sVar2.o0(objQ11);
                }
                fz.a aVar3 = (fz.a) objQ11;
                Object objQ12 = sVar2.Q();
                if (objQ12 == gVar) {
                    objQ12 = new d1(5, b1Var3);
                    sVar2.o0(objQ12);
                }
                fz.a aVar4 = (fz.a) objQ12;
                i15 = 16384;
                boolean z18 = ((i16 & 57344) == 16384) | ((i16 & 458752) == 131072) | ((r22 & 57344) == 16384) | ((i18 & 7168) == 2048);
                Object objQ13 = sVar2.Q();
                if (z18 || objQ13 == gVar) {
                    d1.y yVar = new d1.y(i11, i12, showFinishScreen, onClickClose, b1Var3);
                    b1Var = b1Var3;
                    sVar2.o0(yVar);
                    objQ13 = yVar;
                } else {
                    b1Var = b1Var3;
                }
                tv.a.i(true, aVar3, aVar4, (fz.a) objQ13, sVar2, 438);
                sVar3 = sVar2;
                z13 = false;
            } else {
                b1Var = b1Var3;
                sVar3 = sVar2;
                z13 = false;
                i15 = 16384;
                sVar3.d0(i14);
            }
            sVar3.p(z13);
            Object objQ14 = sVar3.Q();
            if (objQ14 == gVar) {
                objQ14 = new d1(6, b1Var);
                sVar3.o0(objQ14);
            }
            se.i.a(false, (fz.a) objQ14, sVar3, 48, 1);
            int i22 = i15;
            t1.d dVarD = t1.e.d(-1782459446, new mt.e(uiState, i11, settingsUiState, updateScriptShortcutDisplay, b1Var, countDownState, b1Var4, b1Var2), sVar3);
            Object objQ15 = sVar3.Q();
            if (objQ15 == gVar) {
                objQ15 = new b(2, (byte) 0);
                sVar3.o0(objQ15);
            }
            fz.e eVar = (fz.e) objQ15;
            Object objQ16 = sVar3.Q();
            if (objQ16 == gVar) {
                objQ16 = new b(3, (byte) 0);
                sVar3.o0(objQ16);
            }
            fz.e eVar2 = (fz.e) objQ16;
            boolean z19 = ((r22 & 14) == 4) | ((i17 & 57344) == i22);
            Object objQ17 = sVar3.Q();
            if (z19 || objQ17 == gVar) {
                objQ17 = new bp.m2(onChecked, pauseCountdown, 2);
                sVar3.o0(objQ17);
            }
            fz.e eVar3 = (fz.e) objQ17;
            boolean z20 = ((r22 & 112) == 32) | ((i17 & 458752) == 131072);
            Object objQ18 = sVar3.Q();
            if (z20 || objQ18 == gVar) {
                objQ18 = new defpackage.a(3, onShowNext, resumeCountdown);
                sVar3.o0(objQ18);
            }
            fz.a aVar5 = (fz.a) objQ18;
            Object objQ19 = sVar3.Q();
            if (objQ19 == gVar) {
                objQ19 = new d(3);
                sVar3.o0(objQ19);
            }
            int i23 = i19 | 384 | (i16 & 112) | ((i16 >> 6) & 458752) | ((i17 << 18) & 3670016) | ((i16 >> 3) & 29360128) | ((i17 << 21) & 234881024) | (i16 & 1879048192);
            int i24 = r22 << 12;
            l1.s sVar5 = sVar3;
            a.n(uiState, settingsUiState, true, false, 0L, bookmarkUiStateFor, onToggleBookmarkFor, bookmarkUiStateForItem, onToggleBookmarkForItem, knowledgeNoteUiStateFor, onSaveKnowledgeNoteFor, dVarD, eVar, eVar2, eVar3, aVar5, onSkip, (fz.a) objQ19, showFinishScreen, sVar5, i23, ((i17 >> 6) & 14) | 12586416 | (i24 & 3670016) | (i24 & 234881024), 24);
            sVar = sVar5;
        } else {
            sVar = sVar4;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(settingsUiState, bVar, countDownState, i11, i12, onClickBilling, bookmarkUiStateFor, bookmarkUiStateForItem, knowledgeNoteUiStateFor, onToggleBookmarkFor, onToggleBookmarkForItem, onSaveKnowledgeNoteFor, startCountdown, pauseCountdown, resumeCountdown, onConfirmSettings, onConfirmQuestionPreference, onResetQuestionPreference, updateScriptShortcutDisplay, onChecked, onShowNext, onSkip, onClickClose, showFinishScreen, i13) { // from class: ys.c2
                public final /* synthetic */ fz.c H;
                public final /* synthetic */ fz.e K;
                public final /* synthetic */ fz.c L;
                public final /* synthetic */ fz.c M;
                public final /* synthetic */ fz.f N;
                public final /* synthetic */ fz.e O;
                public final /* synthetic */ fz.a P;
                public final /* synthetic */ fz.a Q;
                public final /* synthetic */ fz.a R;
                public final /* synthetic */ fz.c S;
                public final /* synthetic */ fz.e T;
                public final /* synthetic */ fz.c U;
                public final /* synthetic */ fz.a V;
                public final /* synthetic */ fz.e W;
                public final /* synthetic */ fz.a X;
                public final /* synthetic */ fz.c Y;
                public final /* synthetic */ fz.a Z;

                /* JADX INFO: renamed from: a0, reason: collision with root package name */
                public final /* synthetic */ fz.a f57949a0;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ h9 f57950b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ qs.b f57951c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ hb f57952d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ int f57953e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ int f57954f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f57955t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    h2.b(this.f57948a, this.f57950b, this.f57951c, this.f57952d, this.f57953e, this.f57954f, this.f57955t, this.H, this.K, this.L, this.M, this.N, this.O, this.P, this.Q, this.R, this.S, this.T, this.U, this.V, this.W, this.X, this.Y, this.Z, this.f57949a0, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
