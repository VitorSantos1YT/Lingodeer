package xu;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.lingodeer.R;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h1.a6;
import h1.dc;
import h1.fc;
import h1.k7;
import h1.ua;
import j0.e2;
import java.util.List;
import mt.k6;
import z2.i2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h1 {
    public static final void a(List users, fz.c onClickUser, fz.c follow, fz.c unFollow, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(users, "users");
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        kotlin.jvm.internal.m.f(follow, "follow");
        kotlin.jvm.internal.m.f(unFollow, "unFollow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-532314604);
        int i12 = i11 | (sVar.h(users) ? 4 : 2) | (sVar.h(onClickUser) ? 32 : 16) | (sVar.h(follow) ? 256 : 128) | (sVar.h(unFollow) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zIsEmpty = users.isEmpty();
            z1.o oVar = z1.o.f58481a;
            if (zIsEmpty) {
                sVar.d0(-1164863240);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, oVar);
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
                d0.n.c(se.k.y(R.drawable.lb_weekly_xp_empty, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                ua.b("Sorry, we can't find any friends", j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).m, sVar, 54, 0, 65532);
                sVar = sVar;
                sVar.p(true);
                sVar.p(false);
            } else {
                boolean z11 = true;
                sVar.d0(-1164374587);
                z1.r rVarD = e2.d(oVar, 1.0f);
                boolean zH = sVar.h(users) | ((i12 & 112) == 32) | ((i12 & 896) == 256);
                if ((i12 & 7168) != 2048) {
                    z11 = false;
                }
                boolean z12 = zH | z11;
                Object objQ = sVar.Q();
                if (z12 || objQ == l1.m.f39353a) {
                    b1 b1Var = new b1(users, onClickUser, follow, unFollow, 0);
                    sVar.o0(b1Var);
                    objQ = b1Var;
                }
                ue.f.a(rVarD, null, null, null, null, null, false, null, (fz.c) objQ, sVar, 6, 510);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c1(users, onClickUser, follow, unFollow, i11, 0);
        }
    }

    public static final void b(LeaderBoardUser user, boolean z11, fz.c onClickUser, fz.c follow, fz.c unFollow, fz.c removeFollower, l1.n nVar, int i11) {
        l1.g gVar;
        boolean z12;
        kotlin.jvm.internal.m.f(user, "user");
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        kotlin.jvm.internal.m.f(follow, "follow");
        kotlin.jvm.internal.m.f(unFollow, "unFollow");
        kotlin.jvm.internal.m.f(removeFollower, "removeFollower");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1416260470);
        int i12 = i11 | (sVar.h(user) ? 4 : 2) | (sVar.h(onClickUser) ? 256 : 128) | (sVar.h(follow) ? 2048 : 1024) | (sVar.h(unFollow) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE);
        if ((i11 & 196608) == 0) {
            i12 |= sVar.h(removeFollower) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(1943552244);
                Object objQ2 = sVar.Q();
                if (objQ2 == gVar2) {
                    objQ2 = new m(10, b1Var);
                    sVar.o0(objQ2);
                }
                t1.d dVarD = t1.e.d(1513019778, new defpackage.d(removeFollower, user, b1Var, 18), sVar);
                gVar = gVar2;
                z12 = false;
                a6.a((fz.a) objQ2, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, 0L, null, null, null, dVarD, sVar, 6, 384, 4094);
                sVar = sVar;
            } else {
                gVar = gVar2;
                z12 = false;
                sVar.d0(1926454008);
            }
            sVar.p(z12);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarG = e2.g(e2.e(oVar, 1.0f), 65);
            boolean zH = sVar.h(user) | ((i12 & 896) == 256 ? true : z12);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new qu.f(onClickUser, user, 2);
                sVar.o0(objQ3);
            }
            z1.r rVarO = d0.n.o(rVarG, z12, null, (fz.a) objQ3, 15);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar, 48);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarO);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, a2VarA, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            int emojiStatus = user.getEmojiStatus();
            Integer numValueOf = Integer.valueOf(emojiStatus);
            if (emojiStatus == -1) {
                numValueOf = null;
            }
            float f5 = 20;
            l1.s sVar2 = sVar;
            qu.b.g(user.getImageName(), user.getNickName(), numValueOf != null ? new qu.c(numValueOf.intValue(), 0, 0) : null, false, 40, j0.c.E(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 14), sVar2, 224256);
            z1.r rVarE = j0.c.E(oVar, 19, CropImageView.DEFAULT_ASPECT_RATIO, 8, CropImageView.DEFAULT_ASPECT_RATIO, 10);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            z1.r rVarP = w4.c.p(1.0f, true, rVarE);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarP);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, uVarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar2);
            ua.b(user.getNickName(), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, j3.A(16), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 0, 0, 65534);
            sVar2.p(true);
            k2.b bVarY = se.k.y(user.isFriend() ? R.drawable.ic_friend_added : R.drawable.ic_add_friend, sVar2, 0);
            z1.r rVarP2 = e2.p(oVar, 37, 23);
            boolean zH2 = sVar2.h(user) | ((57344 & i12) == 16384) | ((i12 & 7168) == 2048);
            Object objQ4 = sVar2.Q();
            if (zH2 || objQ4 == gVar) {
                objQ4 = new qu.x(user, unFollow, follow, 1);
                sVar2.o0(objQ4);
            }
            d0.n.c(bVarY, "add friend", iu.k.q(6, 7, (fz.a) objQ4, sVar2, rVarP2, false), null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 120);
            sVar = sVar2;
            if (z11) {
                sVar.d0(1169653880);
                Object objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    objQ5 = new m(11, b1Var);
                    sVar.o0(objQ5);
                }
                k7.h((fz.a) objQ5, null, false, null, c.f56337a0, sVar, 196614, 30);
                sVar = sVar;
                sVar.p(false);
            } else {
                sVar.d0(1170088500);
                j0.c.g(sVar, e2.s(oVar, f5));
                sVar.p(false);
            }
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new jt.b(user, z11, onClickUser, follow, unFollow, removeFollower, i11);
        }
    }

    public static final void c(fz.a onClickClose, fz.c onClickUser, zu.i1 i1Var, l1.n nVar, int i11) {
        l1.s sVar;
        zu.i1 i1Var2;
        int i12;
        final zu.i1 i1Var3;
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1948819043);
        int i13 = i11 | (sVar2.h(onClickClose) ? 4 : 2) | 128;
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                sVar2.d0(-1614864554);
                ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(sVar2, LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                }
                ViewModel viewModelA = i20.b.a(kotlin.jvm.internal.z.a(zu.i1.class), current.getViewModelStore(), null, i20.a.a(current), null, q10.b.a(sVar2), null);
                sVar2.p(false);
                i12 = i13 & (-897);
                i1Var3 = (zu.i1) viewModelA;
            } else {
                sVar2.W();
                i12 = i13 & (-897);
                i1Var3 = i1Var;
            }
            sVar2.q();
            sVar = sVar2;
            Object value = FlowExtKt.collectAsStateWithLifecycle(i1Var3.f59445e, (LifecycleOwner) null, (Lifecycle.State) null, (vy.i) null, sVar, 0, 7).getValue();
            if (value instanceof zu.e1) {
                sVar.d0(209369682);
                tv.a.d(0, 1, sVar, null);
                sVar.p(false);
            } else {
                if (value instanceof zu.f1) {
                    sVar.d0(-2099390221);
                    zu.f1 f1Var = (zu.f1) value;
                    int i14 = i12;
                    zu.q0 q0Var = f1Var.f59411a;
                    zu.m1 m1Var = f1Var.f59412b;
                    boolean zH = sVar.h(i1Var3);
                    Object objQ = sVar.Q();
                    l1.g gVar = l1.m.f39353a;
                    if (zH || objQ == gVar) {
                        final int i15 = 0;
                        objQ = new fz.c() { // from class: xu.d1
                            @Override // fz.c
                            public final Object invoke(Object obj) {
                                switch (i15) {
                                    case 0:
                                        String it = (String) obj;
                                        kotlin.jvm.internal.m.f(it, "it");
                                        i1Var3.b(new zu.b1(it));
                                        break;
                                    case 1:
                                        LeaderBoardUser it2 = (LeaderBoardUser) obj;
                                        kotlin.jvm.internal.m.f(it2, "it");
                                        i1Var3.b(new zu.z0(it2));
                                        break;
                                    default:
                                        LeaderBoardUser it3 = (LeaderBoardUser) obj;
                                        kotlin.jvm.internal.m.f(it3, "it");
                                        i1Var3.b(new zu.c1(it3));
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar.o0(objQ);
                    }
                    fz.c cVar = (fz.c) objQ;
                    boolean zH2 = sVar.h(i1Var3);
                    Object objQ2 = sVar.Q();
                    if (zH2 || objQ2 == gVar) {
                        objQ2 = new xa.a(i1Var3, 5);
                        sVar.o0(objQ2);
                    }
                    fz.a aVar = (fz.a) objQ2;
                    boolean zH3 = sVar.h(i1Var3);
                    Object objQ3 = sVar.Q();
                    if (zH3 || objQ3 == gVar) {
                        final int i16 = 1;
                        objQ3 = new fz.c() { // from class: xu.d1
                            @Override // fz.c
                            public final Object invoke(Object obj) {
                                switch (i16) {
                                    case 0:
                                        String it = (String) obj;
                                        kotlin.jvm.internal.m.f(it, "it");
                                        i1Var3.b(new zu.b1(it));
                                        break;
                                    case 1:
                                        LeaderBoardUser it2 = (LeaderBoardUser) obj;
                                        kotlin.jvm.internal.m.f(it2, "it");
                                        i1Var3.b(new zu.z0(it2));
                                        break;
                                    default:
                                        LeaderBoardUser it3 = (LeaderBoardUser) obj;
                                        kotlin.jvm.internal.m.f(it3, "it");
                                        i1Var3.b(new zu.c1(it3));
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar.o0(objQ3);
                    }
                    fz.c cVar2 = (fz.c) objQ3;
                    boolean zH4 = sVar.h(i1Var3);
                    Object objQ4 = sVar.Q();
                    if (zH4 || objQ4 == gVar) {
                        final int i17 = 2;
                        objQ4 = new fz.c() { // from class: xu.d1
                            @Override // fz.c
                            public final Object invoke(Object obj) {
                                switch (i17) {
                                    case 0:
                                        String it = (String) obj;
                                        kotlin.jvm.internal.m.f(it, "it");
                                        i1Var3.b(new zu.b1(it));
                                        break;
                                    case 1:
                                        LeaderBoardUser it2 = (LeaderBoardUser) obj;
                                        kotlin.jvm.internal.m.f(it2, "it");
                                        i1Var3.b(new zu.z0(it2));
                                        break;
                                    default:
                                        LeaderBoardUser it3 = (LeaderBoardUser) obj;
                                        kotlin.jvm.internal.m.f(it3, "it");
                                        i1Var3.b(new zu.c1(it3));
                                        break;
                                }
                                return qy.b0.f48488a;
                            }
                        };
                        sVar.o0(objQ4);
                    }
                    d(q0Var, m1Var, cVar, aVar, onClickClose, onClickUser, cVar2, (fz.c) objQ4, sVar, (i14 << 12) & 516096);
                    sVar = sVar;
                } else {
                    sVar.d0(-2103856577);
                }
                sVar.p(false);
            }
            i1Var2 = i1Var3;
        } else {
            sVar = sVar2;
            sVar.W();
            i1Var2 = i1Var;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(i11, 29, onClickClose, onClickUser, i1Var2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:101:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:106:0x0202  */
    /* JADX WARN: Code duplicated, block: B:109:0x0242  */
    /* JADX WARN: Code duplicated, block: B:112:0x0256  */
    /* JADX WARN: Code duplicated, block: B:113:0x0258  */
    /* JADX WARN: Code duplicated, block: B:117:0x0266  */
    /* JADX WARN: Code duplicated, block: B:120:0x0279  */
    /* JADX WARN: Code duplicated, block: B:121:0x027b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0284  */
    /* JADX WARN: Code duplicated, block: B:128:0x0297  */
    /* JADX WARN: Code duplicated, block: B:131:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:132:0x0302  */
    /* JADX WARN: Code duplicated, block: B:137:0x031d  */
    /* JADX WARN: Code duplicated, block: B:140:0x036b  */
    /* JADX WARN: Code duplicated, block: B:141:0x036d  */
    /* JADX WARN: Code duplicated, block: B:146:0x037f  */
    /* JADX WARN: Code duplicated, block: B:97:0x01af  */
    public static final void d(zu.q0 recommendFriendsStatus, zu.m1 searchStatus, fz.c searchFriends, fz.a resetSearch, fz.a onClickClose, fz.c onClickUser, fz.c follow, fz.c unFollow, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        l1.b1 b1Var;
        boolean zF;
        Object objQ;
        int iHashCode;
        l1.b1 b1Var2;
        Object objQ2;
        boolean z11;
        boolean zF2;
        Object objQ3;
        boolean z12;
        Object objQ4;
        Object objQ5;
        int iHashCode2;
        boolean z13;
        boolean z14;
        kotlin.jvm.internal.m.f(recommendFriendsStatus, "recommendFriendsStatus");
        kotlin.jvm.internal.m.f(searchStatus, "searchStatus");
        kotlin.jvm.internal.m.f(searchFriends, "searchFriends");
        kotlin.jvm.internal.m.f(resetSearch, "resetSearch");
        kotlin.jvm.internal.m.f(onClickClose, "onClickClose");
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        kotlin.jvm.internal.m.f(follow, "follow");
        kotlin.jvm.internal.m.f(unFollow, "unFollow");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(465617113);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? sVar2.f(recommendFriendsStatus) : sVar2.h(recommendFriendsStatus) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= (i11 & 64) == 0 ? sVar2.f(searchStatus) : sVar2.h(searchStatus) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(searchFriends) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(resetSearch) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(onClickClose) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onClickUser) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(follow) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(unFollow) ? 8388608 : 4194304;
        }
        if (sVar2.T(i12 & 1, (4793491 & i12) != 4793490)) {
            i2 i2Var = (i2) sVar2.j(z2.g1.f58554p);
            Object objQ6 = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(BuildConfig.VERSION_NAME);
                sVar2.o0(objQ6);
            }
            l1.b1 b1Var3 = (l1.b1) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ7);
            }
            l1.b1 b1Var4 = (l1.b1) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = new e2.v();
                sVar2.o0(objQ8);
            }
            e2.v vVar = (e2.v) objQ8;
            Object objQ9 = sVar2.Q();
            vy.d dVar = null;
            if (objQ9 == gVar) {
                objQ9 = new jp.t0(2, 8, dVar);
                sVar2.o0(objQ9);
            }
            l1.t.f((fz.e) objQ9, i2Var, sVar2);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(oVar);
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarV);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S) {
                b1Var = b1Var3;
            } else {
                b1Var = b1Var3;
                if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar2);
                z1.r rVarD = e2.d(oVar, 1.0f);
                zF = sVar2.f(i2Var);
                objQ = sVar2.Q();
                if (zF || objQ == gVar) {
                    objQ = new bp.s0(4, i2Var, b1Var4);
                    sVar2.o0(objQ);
                }
                z1.r rVarA = s2.g0.a(rVarD, qy.b0.f48488a, (PointerInputEventHandler) objQ);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, rVarA);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar, uVarA, sVar2);
                l1.t.J(hVar2, q1VarL2, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar2);
                b1Var2 = b1Var;
                iu.k.g(onClickClose, null, c.W, null, null, null, null, null, sVar2, ((i12 >> 12) & 14) | 384, 250);
                String str = (String) b1Var2.getValue();
                objQ2 = sVar2.Q();
                if (objQ2 == gVar) {
                    objQ2 = new bp.i2(b1Var2, b1Var4, 22);
                    sVar2.o0(objQ2);
                }
                fz.c cVar = (fz.c) objQ2;
                if ((i12 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zF2 = sVar2.f(i2Var) | z11;
                objQ3 = sVar2.Q();
                if (zF2 || objQ3 == gVar) {
                    objQ3 = new x0.j(searchFriends, i2Var, b1Var4, 2);
                    sVar2.o0(objQ3);
                }
                fz.c cVar2 = (fz.c) objQ3;
                int i13 = i12;
                if ((i12 & 7168) == 2048) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ4 = sVar2.Q();
                if (z12 || objQ4 == gVar) {
                    objQ4 = new e1(0, resetSearch, b1Var2);
                    sVar2.o0(objQ4);
                }
                fz.a aVar = (fz.a) objQ4;
                objQ5 = sVar2.Q();
                if (objQ5 == gVar) {
                    objQ5 = new v(1, b1Var4);
                    sVar2.o0(objQ5);
                }
                f(i2Var, str, cVar, vVar, cVar2, aVar, (fz.c) objQ5, sVar2, 1576320);
                z1.r rVarD2 = e2.d(d0.n.h(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 1.0f);
                w2.q0 q0VarD2 = j0.o.d(z1.c.f58467e, false);
                iHashCode2 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL3 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, rVarD2);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar2);
                l1.t.J(hVar2, q1VarL3, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
                }
                l1.t.J(hVar4, rVarC3, sVar2);
                sVar = sVar2;
                a0.o.b(searchStatus, null, null, null, BuildConfig.VERSION_NAME, null, t1.e.d(-1836770010, new br.u(recommendFriendsStatus, onClickUser, follow, unFollow, 9), sVar2), sVar, ((i13 >> 3) & 14) | 1597440, 46);
                sVar.p(true);
                sVar.p(true);
                if (((String) b1Var2.getValue()).length() > 0) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z13 || !((Boolean) b1Var4.getValue()).booleanValue()) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                float f5 = 16;
                a0.j0.d(z14, j0.c.E(j0.c.r(j0.c.E(j0.r.f35391a.a(oVar, z1.c.K), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 11)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, 7), a0.f1.e(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), 2).a(a0.f1.g(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), CropImageView.DEFAULT_ASPECT_RATIO, 6)), a0.f1.f(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), 2).a(a0.f1.h(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), CropImageView.DEFAULT_ASPECT_RATIO, 6)), null, t1.e.d(360781751, new br.j(searchFriends, i2Var, b1Var2, b1Var4, 19), sVar), sVar, 200064, 16);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar2);
            z1.r rVarD3 = e2.d(oVar, 1.0f);
            zF = sVar2.f(i2Var);
            objQ = sVar2.Q();
            if (zF) {
                objQ = new bp.s0(4, i2Var, b1Var4);
                sVar2.o0(objQ);
            } else {
                objQ = new bp.s0(4, i2Var, b1Var4);
                sVar2.o0(objQ);
            }
            z1.r rVarA2 = s2.g0.a(rVarD3, qy.b0.f48488a, (PointerInputEventHandler) objQ);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL4 = sVar2.l();
            z1.r rVarC4 = z1.a.c(sVar2, rVarA2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, uVarA2, sVar2);
            l1.t.J(hVar2, q1VarL4, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC4, sVar2);
            b1Var2 = b1Var;
            iu.k.g(onClickClose, null, c.W, null, null, null, null, null, sVar2, ((i12 >> 12) & 14) | 384, 250);
            String str2 = (String) b1Var2.getValue();
            objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new bp.i2(b1Var2, b1Var4, 22);
                sVar2.o0(objQ2);
            }
            fz.c cVar3 = (fz.c) objQ2;
            if ((i12 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            zF2 = sVar2.f(i2Var) | z11;
            objQ3 = sVar2.Q();
            if (zF2) {
                objQ3 = new x0.j(searchFriends, i2Var, b1Var4, 2);
                sVar2.o0(objQ3);
            } else {
                objQ3 = new x0.j(searchFriends, i2Var, b1Var4, 2);
                sVar2.o0(objQ3);
            }
            fz.c cVar4 = (fz.c) objQ3;
            int i14 = i12;
            if ((i12 & 7168) == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            objQ4 = sVar2.Q();
            if (z12) {
                objQ4 = new e1(0, resetSearch, b1Var2);
                sVar2.o0(objQ4);
            } else {
                objQ4 = new e1(0, resetSearch, b1Var2);
                sVar2.o0(objQ4);
            }
            fz.a aVar2 = (fz.a) objQ4;
            objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = new v(1, b1Var4);
                sVar2.o0(objQ5);
            }
            f(i2Var, str2, cVar3, vVar, cVar4, aVar2, (fz.c) objQ5, sVar2, 1576320);
            z1.r rVarD4 = e2.d(d0.n.h(j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 2, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p, g2.f0.f28556b), 1.0f);
            w2.q0 q0VarD3 = j0.o.d(z1.c.f58467e, false);
            iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL5 = sVar2.l();
            z1.r rVarC5 = z1.a.c(sVar2, rVarD4);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD3, sVar2);
            l1.t.J(hVar2, q1VarL5, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar5, rVarC5, sVar2);
            sVar = sVar2;
            a0.o.b(searchStatus, null, null, null, BuildConfig.VERSION_NAME, null, t1.e.d(-1836770010, new br.u(recommendFriendsStatus, onClickUser, follow, unFollow, 9), sVar2), sVar, ((i14 >> 3) & 14) | 1597440, 46);
            sVar.p(true);
            sVar.p(true);
            if (((String) b1Var2.getValue()).length() > 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                z14 = false;
            } else {
                z14 = false;
            }
            float f11 = 16;
            a0.j0.d(z14, j0.c.E(j0.c.r(j0.c.E(j0.r.f35391a.a(oVar, z1.c.K), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, 11)), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f11, 7), a0.f1.e(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), 2).a(a0.f1.g(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), CropImageView.DEFAULT_ASPECT_RATIO, 6)), a0.f1.f(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), 2).a(a0.f1.h(b0.e.q(CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, 7), CropImageView.DEFAULT_ASPECT_RATIO, 6)), null, t1.e.d(360781751, new br.j(searchFriends, i2Var, b1Var2, b1Var4, 19), sVar), sVar, 200064, 16);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.m1(recommendFriendsStatus, searchStatus, searchFriends, resetSearch, onClickClose, onClickUser, follow, unFollow, i11);
        }
    }

    public static final void e(List users, fz.c onClickUser, fz.c follow, fz.c unFollow, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(users, "users");
        kotlin.jvm.internal.m.f(onClickUser, "onClickUser");
        kotlin.jvm.internal.m.f(follow, "follow");
        kotlin.jvm.internal.m.f(unFollow, "unFollow");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1648794350);
        int i12 = i11 | (sVar.h(users) ? 4 : 2) | (sVar.h(onClickUser) ? 32 : 16) | (sVar.h(follow) ? 256 : 128) | (sVar.h(unFollow) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            boolean zIsEmpty = users.isEmpty();
            z1.o oVar = z1.o.f58481a;
            if (zIsEmpty) {
                sVar.d0(1986728510);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
                int iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL = sVar.l();
                z1.r rVarC = z1.a.c(sVar, oVar);
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
                d0.n.c(se.k.y(R.drawable.lb_weekly_xp_empty, sVar, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar, 48, 124);
                ua.b("Sorry, we can't find any friends", j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).m, sVar, 54, 0, 65532);
                sVar = sVar;
                sVar.p(true);
                sVar.p(false);
            } else {
                boolean z11 = true;
                sVar.d0(1987207460);
                z1.r rVarD = e2.d(oVar, 1.0f);
                boolean zH = sVar.h(users) | ((i12 & 112) == 32) | ((i12 & 896) == 256);
                if ((i12 & 7168) != 2048) {
                    z11 = false;
                }
                boolean z12 = zH | z11;
                Object objQ = sVar.Q();
                if (z12 || objQ == l1.m.f39353a) {
                    b1 b1Var = new b1(users, onClickUser, follow, unFollow, 1);
                    sVar.o0(b1Var);
                    objQ = b1Var;
                }
                ue.f.a(rVarD, null, null, null, null, null, false, null, (fz.c) objQ, sVar, 6, 510);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c1(users, onClickUser, follow, unFollow, i11, 1);
        }
    }

    public static final void f(i2 i2Var, String searchText, fz.c onSearchTextChange, e2.v focusRequester, fz.c searchFriends, fz.a resetSearch, fz.c onFocusChanged, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(searchText, "searchText");
        kotlin.jvm.internal.m.f(onSearchTextChange, "onSearchTextChange");
        kotlin.jvm.internal.m.f(focusRequester, "focusRequester");
        kotlin.jvm.internal.m.f(searchFriends, "searchFriends");
        kotlin.jvm.internal.m.f(resetSearch, "resetSearch");
        kotlin.jvm.internal.m.f(onFocusChanged, "onFocusChanged");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1549179615);
        int i12 = i11 | (sVar2.f(searchText) ? 32 : 16) | (sVar2.h(searchFriends) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(resetSearch) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar2.T(i12 & 1, (599185 & i12) != 599184)) {
            sVar = sVar2;
            k7.d(j0.c.E(e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 10, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), r0.f.d(0), null, null, null, t1.e.d(-1240190639, new es.h(focusRequester, onFocusChanged, searchFriends, searchText, onSearchTextChange, resetSearch), sVar2), sVar, 196614, 28);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bt.b1(i2Var, searchText, onSearchTextChange, focusRequester, searchFriends, resetSearch, onFocusChanged, i11, 9);
        }
    }
}
