package vr;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bp.d0;
import br.j;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseCharacterGroup;
import dt.i1;
import h1.k7;
import h1.p7;
import h1.s1;
import h1.v1;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.z;
import l1.b3;
import l1.n;
import l1.s;
import l1.x1;
import mt.b5;
import s0.u;
import z1.o;
import z1.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static final void a(CourseCharacter courseCharacter, boolean z11, boolean z12, fz.a aVar, fz.a aVar2, r rVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.f0(1606710322);
        int i12 = i11 | (sVar.h(courseCharacter) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.g(z12) ? 256 : 128) | (sVar.h(aVar) ? 2048 : 1024) | (sVar.h(aVar2) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            k7.c(aVar, rVar, false, null, k7.p(((s1) sVar.j(v1.f31180a)).f31033p, sVar, 0), null, null, t1.e.d(979650343, new b5(courseCharacter, z11, z12, aVar2), sVar), sVar, ((i12 >> 9) & 14) | 100663344, 236);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i1(courseCharacter, z11, z12, aVar, aVar2, rVar, i11);
        }
    }

    public static final void b(HwView hwView, CourseCharacter courseCharacter, boolean z11, boolean z12, fz.a aVar) {
        String charPath = courseCharacter.getCharPath();
        List<String> partStrings = courseCharacter.getPartStrings();
        List<String> polygonStrings = courseCharacter.getPolygonStrings();
        courseCharacter.getCharacterId();
        hwView.e(charPath, partStrings, polygonStrings);
        if (z11 && z12) {
            hwView.g();
            hwView.setTimeGap(100);
            hwView.f();
            hwView.setAnimListener(new iv.r(1, aVar));
        } else {
            hwView.g();
            hwView.setBgHanziVisibility(true);
        }
        hwView.invalidate();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void c(CourseCharacterGroup courseCharacterGroup, fz.c onPracticeClick, fz.a onBackClick, r rVar, n nVar, int i11) {
        s sVar;
        r rVar2;
        m.f(onPracticeClick, "onPracticeClick");
        m.f(onBackClick, "onBackClick");
        s sVar2 = (s) nVar;
        sVar2.f0(2048731636);
        int i12 = (sVar2.h(courseCharacterGroup) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(onPracticeClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onBackClick) ? 256 : 128;
        }
        int i13 = i12 | 3072;
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            boolean zH = sVar2.h(courseCharacterGroup);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new u(courseCharacterGroup, 16);
                sVar2.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            sVar2.d0(-1614864554);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModel viewModelA = i20.b.a(z.a(zr.i.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), aVar);
            sVar2.p(false);
            zr.i iVar = (zr.i) viewModelA;
            b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(iVar.f59306e, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 0, 7);
            String groupName = courseCharacterGroup.getGroupName();
            zr.h hVar = (zr.h) b3VarCollectAsStateWithLifecycle.getValue();
            boolean zH2 = sVar2.h(iVar);
            Object objQ2 = sVar2.Q();
            if (zH2 || objQ2 == gVar) {
                objQ2 = new s0.a(iVar, 17);
                sVar2.o0(objQ2);
            }
            fz.c cVar = (fz.c) objQ2;
            boolean zH3 = sVar2.h(iVar);
            Object objQ3 = sVar2.Q();
            if (zH3 || objQ3 == gVar) {
                objQ3 = new u(iVar, 17);
                sVar2.o0(objQ3);
            }
            d(groupName, hVar, onPracticeClick, onBackClick, cVar, (fz.a) objQ3, sVar2, ((i13 << 3) & 8064) | 1572864);
            sVar = sVar2;
            rVar2 = o.f58481a;
        } else {
            sVar = sVar2;
            sVar.W();
            rVar2 = rVar;
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new cs.a(courseCharacterGroup, onPracticeClick, onBackClick, rVar2, i11, 19);
        }
    }

    public static final void d(String title, zr.h uiState, fz.c onPracticeClick, fz.a onBackClick, fz.c onClickCharacterItem, fz.a onAnimationCompleted, n nVar, int i11) {
        int i12;
        s sVar;
        m.f(title, "title");
        m.f(uiState, "uiState");
        m.f(onPracticeClick, "onPracticeClick");
        m.f(onBackClick, "onBackClick");
        m.f(onClickCharacterItem, "onClickCharacterItem");
        m.f(onAnimationCompleted, "onAnimationCompleted");
        s sVar2 = (s) nVar;
        sVar2.f0(-1555229934);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.f(title) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar2.f(uiState) : sVar2.h(uiState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(onPracticeClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onBackClick) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(onClickCharacterItem) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onAnimationCompleted) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i13 = 1572864 & i11;
        o oVar = o.f58481a;
        if (i13 == 0) {
            i12 |= sVar2.f(oVar) ? 1048576 : 524288;
        }
        int i14 = i12;
        if (sVar2.T(i14 & 1, (599187 & i14) != 599186)) {
            sVar = sVar2;
            p7.a(oVar, t1.e.d(-382446634, new d0(onBackClick, title, 1), sVar2), null, null, null, 0, 0L, 0L, null, t1.e.d(-2079634527, new j(uiState, onClickCharacterItem, onAnimationCompleted, onPracticeClick, 18), sVar2), sVar, ((i14 >> 18) & 14) | 805306416, 508);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d(title, uiState, onPracticeClick, onBackClick, onClickCharacterItem, onAnimationCompleted, i11);
        }
    }
}
