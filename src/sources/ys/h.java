package ys;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import rt.g4;
import rt.l4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {
    public static final void a(final long j11, final int i11, final fz.c onClickLesson, final fz.c onClickStoryLesson, final fz.c onClickUnitTips, final fz.c onClickUnitOffline, final fz.c onClickUnitWordReview, final fz.a onCLickClose, final fz.a goBilling, l4 l4Var, l1.n nVar, final int i12) {
        l1.s sVar;
        final l4 l4Var2;
        boolean z11;
        int i13;
        l4 l4Var3;
        kotlin.jvm.internal.m.f(onClickLesson, "onClickLesson");
        kotlin.jvm.internal.m.f(onClickStoryLesson, "onClickStoryLesson");
        kotlin.jvm.internal.m.f(onClickUnitTips, "onClickUnitTips");
        kotlin.jvm.internal.m.f(onClickUnitOffline, "onClickUnitOffline");
        kotlin.jvm.internal.m.f(onClickUnitWordReview, "onClickUnitWordReview");
        kotlin.jvm.internal.m.f(onCLickClose, "onCLickClose");
        kotlin.jvm.internal.m.f(goBilling, "goBilling");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-607484148);
        int i14 = i12 | (sVar2.e(j11) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16) | (sVar2.h(onClickLesson) ? 256 : 128) | (sVar2.h(onClickStoryLesson) ? 2048 : 1024) | (sVar2.h(onClickUnitTips) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickUnitWordReview) ? 1048576 : 524288) | (sVar2.h(onCLickClose) ? 8388608 : 4194304) | (sVar2.h(goBilling) ? 67108864 : 33554432) | 268435456;
        if (sVar2.T(i14 & 1, (306783379 & i14) != 306783378)) {
            sVar2.Y();
            int i15 = i12 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i15 == 0 || sVar2.C()) {
                boolean z12 = ((i14 & 14) == 4) | ((i14 & 112) == 32);
                Object objQ = sVar2.Q();
                if (z12 || objQ == gVar) {
                    objQ = new jr.q(j11, i11, 2);
                    sVar2.o0(objQ);
                }
                fz.a aVar = (fz.a) objQ;
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(l4.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), aVar);
                z11 = false;
                sVar2.p(false);
                l4 l4Var4 = (l4) viewModelA;
                i13 = i14 & (-1879048193);
                l4Var3 = l4Var4;
            } else {
                sVar2.W();
                i13 = i14 & (-1879048193);
                z11 = false;
                l4Var3 = l4Var;
            }
            sVar2.q();
            int i16 = i13;
            boolean z13 = z11;
            sVar = sVar2;
            l4 l4Var5 = l4Var3;
            g4 g4Var = (g4) FlowExtKt.collectAsStateWithLifecycle(l4Var3.f50011a, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7).getValue();
            boolean z14 = (i16 & 896) == 256 ? true : z13;
            Object objQ2 = sVar.Q();
            if (z14 || objQ2 == gVar) {
                objQ2 = new f(onClickLesson, 0);
                sVar.o0(objQ2);
            }
            a.d(g4Var, (fz.e) objQ2, onClickStoryLesson, onClickUnitTips, onClickUnitOffline, onClickUnitWordReview, goBilling, onCLickClose, sVar, ((i16 >> 3) & 524160) | (3670016 & (i16 >> 6)) | (i16 & 29360128));
            l4Var2 = l4Var5;
        } else {
            sVar = sVar2;
            sVar.W();
            l4Var2 = l4Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(j11, i11, onClickLesson, onClickStoryLesson, onClickUnitTips, onClickUnitOffline, onClickUnitWordReview, onCLickClose, goBilling, l4Var2, i12) { // from class: ys.g
                public final /* synthetic */ fz.a H;
                public final /* synthetic */ fz.a K;
                public final /* synthetic */ l4 L;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f58011a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ int f58012b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ fz.c f58013c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.c f58014d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.c f58015e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.c f58016f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f58017t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(196609);
                    h.a(this.f58011a, this.f58012b, this.f58013c, this.f58014d, this.f58015e, this.f58016f, this.f58017t, this.H, this.K, this.L, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
