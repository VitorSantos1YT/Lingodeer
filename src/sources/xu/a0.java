package xu;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import bp.b2;
import bp.i2;
import bt.g5;
import bt.q3;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.stkouyu.Mode;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.fa;
import h1.ua;
import j0.e2;
import java.util.ArrayList;
import java.util.List;
import l1.b3;
import qp.n2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 {
    public static final void a(List list, fz.c onClickUser, fz.c follow, fz.c unFollow, fz.c removeFollower, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        kotlin.jvm.internal.m.f(follow, "follow");
        kotlin.jvm.internal.m.f(unFollow, "unFollow");
        kotlin.jvm.internal.m.f(removeFollower, "removeFollower");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1361505679);
        int i12 = i11 | (sVar.h(list) ? 4 : 2) | (sVar.h(onClickUser) ? 32 : 16) | (sVar.h(follow) ? 256 : 128) | (sVar.h(unFollow) ? 2048 : 1024) | (sVar.h(removeFollower) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if (sVar.T(i12 & 1, (i12 & 9363) != 9362)) {
            boolean zIsEmpty = list.isEmpty();
            g2.r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            if (zIsEmpty) {
                sVar.d0(-1055182139);
                z1.r rVarH = d0.n.h(e2.d(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, r0Var);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, rVarH);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar);
                l1.t.J(y2.j.f56916e, q1VarL, sVar);
                y2.h hVar = y2.j.f56918g;
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar);
                d0.n.c(se.k.y(R.drawable.lb_weekly_xp_empty, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                sVar = sVar;
                sVar.p(true);
                sVar.p(false);
            } else {
                sVar.d0(-1054743644);
                z1.r rVarH2 = d0.n.h(e2.d(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p, r0Var);
                boolean zH = ((i12 & 112) == 32) | sVar.h(list) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048) | ((i12 & 57344) == 16384);
                Object objQ = sVar.Q();
                if (zH || objQ == l1.m.f39353a) {
                    b1.a aVar = new b1.a(list, onClickUser, follow, unFollow, removeFollower);
                    sVar.o0(aVar);
                    objQ = aVar;
                }
                ue.f.a(rVarH2, null, null, null, null, null, false, null, (fz.c) objQ, sVar, 0, 510);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.v1(list, onClickUser, follow, unFollow, removeFollower, i11, 20);
        }
    }

    public static final void b(o0.b bVar, List list, List list2, fz.c onClickUser, fz.c follow, fz.c unFollow, fz.c removeFollower, l1.n nVar, int i11) {
        List list3;
        List list4;
        l1.s sVar;
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        kotlin.jvm.internal.m.f(follow, "follow");
        kotlin.jvm.internal.m.f(unFollow, "unFollow");
        kotlin.jvm.internal.m.f(removeFollower, "removeFollower");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-481392065);
        int i12 = (sVar2.f(bVar) ? 4 : 2) | i11;
        if ((i11 & 48) == 0) {
            list3 = list;
            i12 |= sVar2.h(list3) ? 32 : 16;
        } else {
            list3 = list;
        }
        if ((i11 & 384) == 0) {
            list4 = list2;
            i12 |= sVar2.h(list4) ? 256 : 128;
        } else {
            list4 = list2;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(onClickUser) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(follow) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(unFollow) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(removeFollower) ? 1048576 : 524288;
        }
        int i13 = i12;
        if (sVar2.T(i13 & 1, (599187 & i13) != 599186)) {
            sVar = sVar2;
            ve.i.d(bVar, e2.d(z1.o.f58481a, 1.0f), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-2104686336, new iv.b0(list3, onClickUser, list4, follow, unFollow, removeFollower, 4), sVar2), sVar, (i13 & 14) | 48, 16380);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new mt.e(bVar, list, list2, onClickUser, follow, unFollow, removeFollower, i11);
        }
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
    public static final void c(final int i11, final fz.a onClickClose, zu.k0 k0Var, l1.n nVar, int i12) {
        l1.s sVar;
        zu.k0 k0Var2;
        int i13;
        zu.k0 k0Var3;
        zu.k0 k0Var4;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-543084725);
        int i14 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.h(onClickClose) ? 32 : 16) | 128;
        if (sVar2.T(i14 & 1, (i14 & 147) != 146)) {
            sVar2.Y();
            if ((i12 & 1) == 0 || sVar2.C()) {
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(zu.k0.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                i13 = i14 & (-897);
                k0Var3 = (zu.k0) viewModelA;
            } else {
                sVar2.W();
                i13 = i14 & (-897);
                k0Var3 = k0Var;
            }
            sVar2.q();
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ);
            }
            final l1.b1 b1Var = (l1.b1) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(null);
                sVar2.o0(objQ2);
            }
            final l1.b1 b1Var2 = (l1.b1) objQ2;
            iu.k.f(b1Var, null, null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, t1.e.d(-1721019409, new g5(10, b1Var2), sVar2), sVar2, 805306374, 510);
            if (((Boolean) FlowExtKt.collectAsStateWithLifecycle(k0Var3.f59463d, Boolean.FALSE, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar2, 48, 14).getValue()).booleanValue()) {
                sVar2.d0(105404344);
                tv.a.c(sVar2, 0);
            } else {
                sVar2.d0(101861943);
            }
            sVar2.p(false);
            final j9.v vVarH = cf.x.H(new j9.c0[0], sVar2);
            boolean zH = sVar2.h(k0Var3) | ((i13 & 14) == 4) | ((i13 & 112) == 32) | sVar2.h(vVarH);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                final zu.k0 k0Var5 = k0Var3;
                fz.c cVar = new fz.c() { // from class: xu.w
                    @Override // fz.c
                    public final Object invoke(Object obj) {
                        j9.t NavHost = (j9.t) obj;
                        kotlin.jvm.internal.m.f(NavHost, "$this$NavHost");
                        final zu.k0 k0Var6 = k0Var5;
                        final int i15 = i11;
                        final fz.a aVar = onClickClose;
                        final j9.v vVar = vVarH;
                        final l1.b1 b1Var3 = b1Var2;
                        final l1.b1 b1Var4 = b1Var;
                        c.a.g(NavHost, Mode.HOME, null, null, new t1.d(new fz.g() { // from class: xu.x
                            @Override // fz.g
                            public final Object f(Object obj2, Object obj3, Object obj4, Object obj5) {
                                a0.r composable = (a0.r) obj2;
                                j9.e it = (j9.e) obj3;
                                l1.n nVar2 = (l1.n) obj4;
                                ((Integer) obj5).getClass();
                                kotlin.jvm.internal.m.f(composable, "$this$composable");
                                kotlin.jvm.internal.m.f(it, "it");
                                final zu.k0 k0Var7 = k0Var6;
                                b3 b3VarCollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(k0Var7.f59464e, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, nVar2, 0, 7);
                                zu.i0 i0Var = (zu.i0) b3VarCollectAsStateWithLifecycle.getValue();
                                if (i0Var instanceof zu.g0) {
                                    l1.s sVar3 = (l1.s) nVar2;
                                    sVar3.d0(-1043511267);
                                    tv.a.d(0, 1, sVar3, null);
                                    sVar3.p(false);
                                } else {
                                    if (!(i0Var instanceof zu.h0)) {
                                        throw nv.p.x((l1.s) nVar2, -1043512311, false);
                                    }
                                    l1.s sVar4 = (l1.s) nVar2;
                                    sVar4.d0(2010997562);
                                    zu.i0 i0Var2 = (zu.i0) b3VarCollectAsStateWithLifecycle.getValue();
                                    kotlin.jvm.internal.m.d(i0Var2, "null cannot be cast to non-null type com.lingodeer.me.viewmodels.MeFollowingFollowerUiState.Success");
                                    zu.h0 h0Var = (zu.h0) i0Var2;
                                    List list = h0Var.f59429a;
                                    ArrayList arrayList = h0Var.f59430b;
                                    j9.v vVar2 = vVar;
                                    boolean zH2 = sVar4.h(vVar2);
                                    Object objQ4 = sVar4.Q();
                                    l1.g gVar2 = l1.m.f39353a;
                                    if (zH2 || objQ4 == gVar2) {
                                        objQ4 = new j9.g(vVar2, 22);
                                        sVar4.o0(objQ4);
                                    }
                                    fz.a aVar2 = (fz.a) objQ4;
                                    Object objQ5 = sVar4.Q();
                                    if (objQ5 == gVar2) {
                                        objQ5 = new i2(b1Var3, b1Var4, 21);
                                        sVar4.o0(objQ5);
                                    }
                                    fz.c cVar2 = (fz.c) objQ5;
                                    boolean zH3 = sVar4.h(k0Var7);
                                    Object objQ6 = sVar4.Q();
                                    if (zH3 || objQ6 == gVar2) {
                                        final int i16 = 0;
                                        objQ6 = new fz.c() { // from class: xu.y
                                            @Override // fz.c
                                            public final Object invoke(Object obj6) {
                                                LeaderBoardUser it2 = (LeaderBoardUser) obj6;
                                                switch (i16) {
                                                    case 0:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.c0(it2));
                                                        break;
                                                    case 1:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.e0(it2));
                                                        break;
                                                    default:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.d0(it2));
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar4.o0(objQ6);
                                    }
                                    fz.c cVar3 = (fz.c) objQ6;
                                    boolean zH4 = sVar4.h(k0Var7);
                                    Object objQ7 = sVar4.Q();
                                    if (zH4 || objQ7 == gVar2) {
                                        final int i17 = 1;
                                        objQ7 = new fz.c() { // from class: xu.y
                                            @Override // fz.c
                                            public final Object invoke(Object obj6) {
                                                LeaderBoardUser it2 = (LeaderBoardUser) obj6;
                                                switch (i17) {
                                                    case 0:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.c0(it2));
                                                        break;
                                                    case 1:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.e0(it2));
                                                        break;
                                                    default:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.d0(it2));
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar4.o0(objQ7);
                                    }
                                    fz.c cVar4 = (fz.c) objQ7;
                                    boolean zH5 = sVar4.h(k0Var7);
                                    Object objQ8 = sVar4.Q();
                                    if (zH5 || objQ8 == gVar2) {
                                        final int i18 = 2;
                                        objQ8 = new fz.c() { // from class: xu.y
                                            @Override // fz.c
                                            public final Object invoke(Object obj6) {
                                                LeaderBoardUser it2 = (LeaderBoardUser) obj6;
                                                switch (i18) {
                                                    case 0:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.c0(it2));
                                                        break;
                                                    case 1:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.e0(it2));
                                                        break;
                                                    default:
                                                        kotlin.jvm.internal.m.f(it2, "it");
                                                        k0Var7.a(new zu.d0(it2));
                                                        break;
                                                }
                                                return qy.b0.f48488a;
                                            }
                                        };
                                        sVar4.o0(objQ8);
                                    }
                                    a0.d(i15, list, arrayList, aVar, aVar2, cVar2, cVar3, cVar4, (fz.c) objQ8, sVar4, 196608);
                                    sVar4.p(false);
                                }
                                return qy.b0.f48488a;
                            }
                        }, true, 155338542), 254);
                        c.a.g(NavHost, "search", null, null, new t1.d(new b2(vVar, b1Var3, b1Var4), true, 702616165), 254);
                        return qy.b0.f48488a;
                    }
                };
                k0Var4 = k0Var5;
                sVar2.o0(cVar);
                objQ3 = cVar;
            } else {
                k0Var4 = k0Var3;
            }
            sVar = sVar2;
            com.bumptech.glide.e.c(vVarH, Mode.HOME, null, null, null, null, null, null, (fz.c) objQ3, sVar, 48);
            k0Var2 = k0Var4;
        } else {
            sVar = sVar2;
            sVar.W();
            k0Var2 = k0Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0.t1(i11, onClickClose, k0Var2, i12, 28);
        }
    }

    public static final void d(int i11, List list, List list2, fz.a onClickClose, fz.a onClickSearchFriends, fz.c onClickUser, fz.c follow, fz.c unFollow, fz.c removeFollower, l1.n nVar, int i12) {
        int i13;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickSearchFriends, "onClickSearchFriends");
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        kotlin.jvm.internal.m.f(follow, "follow");
        kotlin.jvm.internal.m.f(unFollow, "unFollow");
        kotlin.jvm.internal.m.f(removeFollower, "removeFollower");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2057404627);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.h(list) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(list2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(onClickClose) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(onClickSearchFriends) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((1572864 & i12) == 0) {
            i13 |= sVar.h(follow) ? 1048576 : 524288;
        }
        if ((12582912 & i12) == 0) {
            i13 |= sVar.h(unFollow) ? 8388608 : 4194304;
        }
        if ((100663296 & i12) == 0) {
            i13 |= sVar.h(removeFollower) ? 67108864 : 33554432;
        }
        int i14 = i13;
        if (sVar.T(i14 & 1, (38347923 & i14) != 38347922)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            z1.r rVarV = j0.c.v(e2.d(z1.o.f58481a, 1.0f));
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar) {
                objQ2 = defpackage.e.v(i11, sVar);
            }
            l1.a1 a1Var = (l1.a1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new uu.f(20);
                sVar.o0(objQ3);
            }
            o0.b bVarB = o0.w.b(i11, (i14 & 14) | 384, 2, (fz.a) objQ3, sVar);
            Integer numValueOf = Integer.valueOf(bVarB.k());
            boolean zF = sVar.f(bVarB);
            Object objQ4 = sVar.Q();
            if (zF || objQ4 == gVar) {
                objQ4 = new nu.b(21, bVarB, a1Var, null);
                sVar.o0(objQ4);
            }
            l1.t.f((fz.e) objQ4, numValueOf, sVar);
            int iL = ((l1.h1) a1Var).l();
            boolean zH = sVar.h(b0Var) | sVar.f(bVarB);
            Object objQ5 = sVar.Q();
            if (zH || objQ5 == gVar) {
                objQ5 = new n2(24, b0Var, bVarB);
                sVar.o0(objQ5);
            }
            e(iL, (fz.c) objQ5, onClickClose, onClickSearchFriends, sVar, (i14 >> 3) & 8064);
            int i15 = i14 >> 6;
            b(bVarB, list, list2, onClickUser, follow, unFollow, removeFollower, sVar, (i14 & 1008) | 3072 | (57344 & i15) | (458752 & i15) | (i15 & 3670016));
            sVar = sVar;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new iu.s(i11, list, list2, onClickClose, onClickSearchFriends, onClickUser, follow, unFollow, removeFollower, i12);
        }
    }

    public static final void e(int i11, fz.c updateIndex, fz.a onClickClose, fz.a onClickSearchFriends, l1.n nVar, int i12) {
        int i13;
        kotlin.jvm.internal.m.f(updateIndex, "updateIndex");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickSearchFriends, "onClickSearchFriends");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1047163048);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.h(updateIndex) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(onClickClose) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(onClickSearchFriends) ? 2048 : 1024;
        }
        if (sVar.T(i13 & 1, (i13 & 1171) != 1170)) {
            List listL = ns.o.L(ub.a.e0(sVar, R.string.following), ub.a.e0(sVar, R.string.followers));
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            iu.k.g(onClickClose, null, null, null, t1.e.d(-227081955, new bp.u(17, onClickSearchFriends), sVar), null, null, null, sVar, ((i13 >> 6) & 14) | 24576, 238);
            fa.a(i11, j0.r.f35391a.a(j0.c.C(oVar, 52, CropImageView.DEFAULT_ASPECT_RATIO, 2), z1.c.H), 0L, 0L, null, null, t1.e.d(1022526582, new et.c(i11, 3, updateIndex, listL), sVar), sVar, (i13 & 14) | 1572864, 60);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.d(i11, updateIndex, onClickClose, onClickSearchFriends, i12, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(LeaderBoardUser user, int i11, fz.c onClickUser, l1.n nVar, int i12) {
        int i13;
        y2.h hVar;
        y2.h hVar2;
        y2.h hVar3;
        y2.h hVar4;
        y2.i iVar;
        int i14;
        Integer num;
        kotlin.jvm.internal.m.f(user, "user");
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(808943484);
        if ((i12 & 6) == 0) {
            i13 = (sVar.h(user) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.d(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar.h(onClickUser) ? 256 : 128;
        }
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.i iVar2 = z1.c.M;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = e2.g(e2.e(oVar, 1.0f), 65);
            boolean zH = ((i13 & 896) == 256) | sVar.h(user);
            Object objQ = sVar.Q();
            if (zH || objQ == l1.m.f39353a) {
                objQ = new qu.f(onClickUser, user, 1);
                sVar.o0(objQ);
            }
            z1.r rVarO = d0.n.o(rVarG, false, null, (fz.a) objQ, 15);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar2, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarO);
            y2.k.J.getClass();
            y2.i iVar3 = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar3);
            } else {
                sVar.r0();
            }
            y2.h hVar5 = y2.j.f56917f;
            l1.t.J(hVar5, a2VarA, sVar);
            y2.h hVar6 = y2.j.f56916e;
            l1.t.J(hVar6, q1VarL, sVar);
            y2.h hVar7 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar7);
            }
            y2.h hVar8 = y2.j.f56915d;
            l1.t.J(hVar8, rVarC, sVar);
            if (i11 == 0) {
                hVar = hVar6;
                hVar2 = hVar8;
                hVar3 = hVar7;
                hVar4 = hVar5;
                iVar = iVar3;
                i14 = 0;
                num = null;
                sVar.d0(467174971);
                d0.n.c(se.k.y(R.drawable.lb_top_user_medal_1, sVar, 0), null, e2.s(j0.c.E(oVar, 11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                sVar.p(false);
            } else if (i11 == 1) {
                hVar = hVar6;
                hVar2 = hVar8;
                hVar3 = hVar7;
                hVar4 = hVar5;
                iVar = iVar3;
                i14 = 0;
                num = null;
                sVar.d0(467184635);
                d0.n.c(se.k.y(R.drawable.lb_top_user_medal_2, sVar, 0), null, e2.s(j0.c.E(oVar, 11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                sVar.p(false);
            } else if (i11 != 2) {
                sVar.d0(1598426020);
                num = null;
                hVar2 = hVar8;
                hVar4 = hVar5;
                hVar = hVar6;
                hVar3 = hVar7;
                i14 = 0;
                iVar = iVar3;
                ua.b(String.valueOf(i11 + 1), e2.s(j0.c.E(oVar, 11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 29), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar.j(ua.f31167a), 0L, j3.A(14), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, 48, 0, 65532);
                sVar = sVar;
                sVar.p(false);
            } else {
                hVar = hVar6;
                hVar2 = hVar8;
                hVar3 = hVar7;
                hVar4 = hVar5;
                iVar = iVar3;
                i14 = 0;
                num = null;
                sVar.d0(467194299);
                d0.n.c(se.k.y(R.drawable.lb_top_user_medal_3, sVar, 0), null, e2.s(j0.c.E(oVar, 11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), 29), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 432, 120);
                sVar.p(false);
            }
            int emojiStatus = user.getEmojiStatus();
            Integer numValueOf = Integer.valueOf(emojiStatus);
            if (emojiStatus == -1) {
                numValueOf = num;
            }
            l1.s sVar2 = sVar;
            qu.b.g(user.getImageName(), user.getNickName(), numValueOf != null ? new qu.c(numValueOf.intValue(), i14, i14) : num, false, 40, j0.c.E(oVar, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), sVar2, 224256);
            z1.r rVarE = j0.c.E(oVar, 19, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarP = w4.c.p(1.0f, true, rVarE);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, i14);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarP);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar4, uVarA, sVar2);
            l1.t.J(hVar, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar2, rVarC2, sVar2);
            String nickName = user.getNickName();
            l1.d0 d0Var = ua.f31167a;
            j3.y0 y0Var = (j3.y0) sVar2.j(d0Var);
            long jA = j3.A(16);
            n3.s sVar3 = n3.s.H;
            ua.b(nickName, null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0Var, 0L, jA, sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 0, 0, 65534);
            sVar2.p(true);
            ua.b(w4.c.f(user.getWeekEarnedXP(), " XP"), e2.s(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14, CropImageView.DEFAULT_ASPECT_RATIO, 11), 72), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(d0Var), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31036s, j3.A(r0), sVar3, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar2, 48, 0, 65532);
            sVar = sVar2;
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new gs.o(user, i11, onClickUser, i12, 6);
        }
    }

    public static final void g(List list, fz.c onClickUser, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1629211167);
        int i12 = (sVar2.h(list) ? 4 : 2) | i11 | (sVar2.h(onClickUser) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            boolean zIsEmpty = list.isEmpty();
            g2.r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            if (zIsEmpty) {
                sVar2.d0(1595679283);
                z1.r rVarH = d0.n.h(e2.d(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, r0Var);
                w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
                int iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarH);
                y2.k.J.getClass();
                y2.i iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                y2.h hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar2);
                sVar = sVar2;
                d0.n.c(se.k.y(R.drawable.lb_weekly_xp_empty, sVar2, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                sVar.p(true);
                sVar.p(false);
            } else {
                sVar2.d0(1596110524);
                z1.r rVarH2 = d0.n.h(e2.d(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, r0Var);
                boolean zH = sVar2.h(list) | ((i12 & 112) == 32);
                Object objQ = sVar2.Q();
                if (zH || objQ == l1.m.f39353a) {
                    objQ = new pr.a(3, onClickUser, list);
                    sVar2.o0(objQ);
                }
                ue.f.a(rVarH2, null, null, null, null, null, false, null, (fz.c) objQ, sVar2, 0, 510);
                sVar = sVar2;
                sVar.p(false);
            }
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q3(i11, 8, onClickUser, list);
        }
    }
}
