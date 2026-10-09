package ys;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.data.model.CoursePracticeType;
import rt.bb;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class m0 {
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
    public static final void a(final long j11, final long j12, final CoursePracticeType practiceType, bb bbVar, final fz.a finish, final fz.c loginNow, l1.n nVar, final int i11) {
        final bb bbVar2;
        bb bbVar3;
        int i12;
        kotlin.jvm.internal.m.f(practiceType, "practiceType");
        kotlin.jvm.internal.m.f(finish, "finish");
        kotlin.jvm.internal.m.f(loginNow, "loginNow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1127449751);
        int i13 = i11 | (sVar.e(j11) ? 4 : 2) | (sVar.e(j12) ? 32 : 16) | (sVar.d(practiceType.ordinal()) ? 256 : 128) | 1024 | (sVar.h(finish) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(loginNow) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            sVar.Y();
            int i14 = i11 & 1;
            l1.g gVar = l1.m.f39353a;
            if (i14 == 0 || sVar.C()) {
                boolean z11 = ((i13 & 14) == 4) | ((i13 & 112) == 32) | ((i13 & 896) == 256);
                Object objQ = sVar.Q();
                if (z11 || objQ == gVar) {
                    fz.a aVar = new fz.a() { // from class: ys.e0
                        @Override // fz.a
                        public final Object invoke() {
                            return com.bumptech.glide.d.G(Long.valueOf(j11), Long.valueOf(j12), practiceType);
                        }
                    };
                    sVar.o0(aVar);
                    objQ = aVar;
                }
                fz.a aVar2 = (fz.a) objQ;
                sVar.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(bb.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar), aVar2);
                sVar.p(false);
                bbVar3 = (bb) viewModelA;
                i12 = i13 & (-7169);
            } else {
                sVar.W();
                i12 = i13 & (-7169);
                bbVar3 = bbVar;
            }
            sVar.q();
            l1.b1 b1VarO = l1.t.o(bbVar3.S, sVar);
            l1.b1 b1VarO2 = l1.t.o(bbVar3.Q, sVar);
            j9.v vVarH = cf.x.H(new j9.c0[0], sVar);
            String str = l0.f58127a[practiceType.ordinal()] != 1 ? "course_dialogue_practice" : "course_dialogue_speaking";
            boolean zH = sVar.h(bbVar3) | sVar.f(b1VarO) | sVar.f(b1VarO2) | ((57344 & i12) == 16384) | sVar.h(vVarH) | ((i12 & 896) == 256) | ((i12 & 458752) == 131072);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                dl.d dVar = new dl.d(bbVar3, finish, vVarH, b1VarO, b1VarO2, practiceType, loginNow, 9);
                sVar.o0(dVar);
                objQ2 = dVar;
            }
            com.bumptech.glide.e.c(vVarH, str, null, null, null, null, null, null, (fz.c) objQ2, sVar, 0);
            bbVar2 = bbVar3;
        } else {
            sVar.W();
            bbVar2 = bbVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(j11, j12, practiceType, bbVar2, finish, loginNow, i11) { // from class: ys.g0

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ long f58018a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ long f58019b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ CoursePracticeType f58020c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ bb f58021d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.a f58022e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.c f58023f;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(1);
                    m0.a(this.f58018a, this.f58019b, this.f58020c, this.f58021d, this.f58022e, this.f58023f, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }
}
