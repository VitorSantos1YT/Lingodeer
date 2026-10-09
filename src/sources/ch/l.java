package ch;

import bt.g6;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.CourseUiState;
import com.yalantis.ucrop.view.CropImageView;
import h1.i9;
import l1.q1;
import l1.x1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static final void a(CourseUiState courseUiState, fz.c updateTopBannerRes, fz.a onClickAlphabet, fz.a onClickChineseTone, fz.c onClickUnit, fz.c onClickUnitTestOut, fz.a onClickLevelUp, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(courseUiState, "courseUiState");
        kotlin.jvm.internal.m.f(updateTopBannerRes, "updateTopBannerRes");
        kotlin.jvm.internal.m.f(onClickAlphabet, "onClickAlphabet");
        kotlin.jvm.internal.m.f(onClickChineseTone, "onClickChineseTone");
        kotlin.jvm.internal.m.f(onClickUnit, "onClickUnit");
        kotlin.jvm.internal.m.f(onClickUnitTestOut, "onClickUnitTestOut");
        kotlin.jvm.internal.m.f(onClickLevelUp, "onClickLevelUp");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1958240562);
        int i12 = i11 | (sVar.h(courseUiState) ? 4 : 2) | (sVar.h(updateTopBannerRes) ? 32 : 16) | (sVar.h(onClickAlphabet) ? 256 : 128) | (sVar.h(onClickChineseTone) ? 2048 : 1024) | (sVar.h(onClickUnit) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(onClickUnitTestOut) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickLevelUp) ? 1048576 : 524288);
        if (!sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            sVar.W();
        } else if (courseUiState.equals(CourseUiState.Loading.INSTANCE)) {
            sVar.d0(673516353);
            tv.a.d(0, 1, sVar, null);
            sVar.p(false);
        } else {
            if (!(courseUiState instanceof CourseUiState.Success)) {
                throw nv.p.x(sVar, 673515253, false);
            }
            sVar.d0(-595760033);
            i9.a(null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(1771362798, new g6(courseUiState, l0.y.a(0, sVar, 3), updateTopBannerRes, onClickAlphabet, onClickChineseTone, onClickUnit, onClickUnitTestOut, onClickLevelUp), sVar), sVar, 12582912, 127);
            sVar.p(false);
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(courseUiState, updateTopBannerRes, onClickAlphabet, onClickChineseTone, onClickUnit, onClickUnitTestOut, onClickLevelUp, i11, 1);
        }
    }

    public static final void b(CourseUiState courseUiState, fz.c updateTopBannerRes, fz.a onClickAlphabet, fz.a onClickChineseTone, fz.c onClickUnit, fz.c onClickUnitTestOut, fz.a onClickLevelUp, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(courseUiState, "courseUiState");
        kotlin.jvm.internal.m.f(updateTopBannerRes, "updateTopBannerRes");
        kotlin.jvm.internal.m.f(onClickAlphabet, "onClickAlphabet");
        kotlin.jvm.internal.m.f(onClickChineseTone, "onClickChineseTone");
        kotlin.jvm.internal.m.f(onClickUnit, "onClickUnit");
        kotlin.jvm.internal.m.f(onClickUnitTestOut, "onClickUnitTestOut");
        kotlin.jvm.internal.m.f(onClickLevelUp, "onClickLevelUp");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-645586846);
        int i12 = i11 | (sVar2.h(courseUiState) ? 4 : 2) | (sVar2.h(updateTopBannerRes) ? 32 : 16) | (sVar2.h(onClickAlphabet) ? 256 : 128) | (sVar2.h(onClickChineseTone) ? 2048 : 1024) | (sVar2.h(onClickUnit) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickUnitTestOut) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickLevelUp) ? 1048576 : 524288);
        if (sVar2.T(i12 & 1, (599187 & i12) != 599186)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, z1.o.f58481a);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL, sVar2);
            y2.h hVar = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            sVar = sVar2;
            a(courseUiState, updateTopBannerRes, onClickAlphabet, onClickChineseTone, onClickUnit, onClickUnitTestOut, onClickLevelUp, sVar, i12 & 4194302);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k(courseUiState, updateTopBannerRes, onClickAlphabet, onClickChineseTone, onClickUnit, onClickUnitTestOut, onClickLevelUp, i11, 0);
        }
    }
}
