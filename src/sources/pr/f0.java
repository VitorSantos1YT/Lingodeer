package pr;

import a0.f1;
import a0.j0;
import a0.k0;
import a0.l1;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.k2;
import bt.f2;
import bt.g5;
import bt.q3;
import bt.v1;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.api.Service;
import com.google.firebase.annotations.jjzf.kHfjNGauVgdF;
import com.google.protobuf.DescriptorProtos;
import com.google.type.bACG.scNRoQgKSYX;
import com.lingo.lingoskill.ruskill.ui.learn.mr.OCBJEWZHh;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLanguage;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLeaderBoardType;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.AchievementRecordType;
import com.stkouyu.util.httputil.Consts;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import d1.d1;
import dt.b3;
import dt.c3;
import dt.l2;
import fr.j3;
import fr.p3;
import fu.g0;
import g2.r0;
import h1.g7;
import h1.i9;
import h1.k7;
import h1.s1;
import h1.ua;
import hh.p0;
import j0.a2;
import j0.e2;
import j0.i1;
import j0.z1;
import j3.y0;
import java.util.ArrayList;
import java.util.List;
import km.g2;
import kotlin.NoWhenBranchMatchedException;
import l1.a1;
import l1.b1;
import l1.h1;
import l1.q1;
import l1.x1;
import mt.k6;
import mt.n4;
import vt.n0;
import w2.q0;
import w2.w0;
import z2.g1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f47031a = new t1.d(new os.a(9), false, -1597792209);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f47032b = new t1.d(new os.a(10), false, -354307568);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f47033c = new t1.d(new os.a(11), false, -1168953365);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f47034d = new t1.d(new os.a(12), false, -2116124173);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f47035e = new t1.d(new os.a(13), false, 1350231092);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f47036f = new t1.d(new os.a(14), false, -943618353);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f47037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f47038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f47039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f47040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.d f47041k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t1.d f47042l;

    static {
        new t1.d(new nv.b(23), false, 1082962663);
        f47037g = new t1.d(new nv.b(24), false, -2031199073);
        f47038h = new t1.d(new os.a(15), false, -2056546904);
        f47039i = new t1.d(new os.a(16), false, -281710483);
        f47040j = new t1.d(new os.a(17), false, -584898472);
        f47041k = new t1.d(new os.a(18), false, -974307109);
        f47042l = new t1.d(new nv.b(25), false, 1371709184);
        new t1.d(new nv.b(26), false, 145813413);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    public static final void a(AchievementLevel achievement, qr.a achievementSize, l1.n nVar, int i11) {
        qr.a aVar;
        int i12;
        String strValueOf;
        kotlin.jvm.internal.m.f(achievement, "achievement");
        kotlin.jvm.internal.m.f(achievementSize, "achievementSize");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-291923400);
        int i13 = (sVar.h(achievement) ? 4 : 2) | i11;
        if (sVar.T(i13 & 1, (i13 & 19) != 18)) {
            int i14 = -1;
            if (achievement.isActive() && ry.l.D(new qr.a[]{qr.a.MIDDLE_SMALL, qr.a.BIG}, achievementSize)) {
                String id2 = achievement.getId();
                int iHashCode = id2.hashCode();
                if (iHashCode != 3832) {
                    if (iHashCode != 159337103) {
                        if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                            i14 = R.raw.achievement_day_streak_type_active;
                        }
                    } else if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                        i14 = R.raw.achievement_knowledge_point_type_active;
                    }
                } else if (id2.equals("xp")) {
                    i14 = R.raw.achievement_xp_type_active;
                }
            }
            boolean zIsActive = achievement.isActive();
            int iR = ve.i.r(achievement);
            String id3 = achievement.getId();
            int iHashCode2 = id3.hashCode();
            if (iHashCode2 == 3832) {
                if (id3.equals("xp")) {
                    i12 = R.drawable.achievement_xp_type_grey;
                    int i15 = i12;
                    List listU = ve.i.u(achievement);
                    if (achievement.getLevel() > 0) {
                        strValueOf = String.valueOf(ve.i.x(achievement, achievement.getLevel()));
                    } else {
                        strValueOf = BuildConfig.VERSION_NAME;
                    }
                    aVar = achievementSize;
                    d(zIsActive, aVar, iR, i15, i14, listU, strValueOf, sVar, 1597488);
                }
                throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievement.getId()));
            }
            if (iHashCode2 == 159337103) {
                if (id3.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                    i12 = R.drawable.achievement_knowledge_point_type_grey;
                    int i16 = i12;
                    List listU2 = ve.i.u(achievement);
                    if (achievement.getLevel() > 0) {
                        strValueOf = String.valueOf(ve.i.x(achievement, achievement.getLevel()));
                    } else {
                        strValueOf = BuildConfig.VERSION_NAME;
                    }
                    aVar = achievementSize;
                    d(zIsActive, aVar, iR, i16, i14, listU2, strValueOf, sVar, 1597488);
                }
                throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievement.getId()));
            }
            if (iHashCode2 == 542228865 && id3.equals(AchievementLevelType.DAY_STREAK)) {
                i12 = R.drawable.achievement_day_streak_type_grey;
                int i17 = i12;
                List listU3 = ve.i.u(achievement);
                if (achievement.getLevel() > 0) {
                    strValueOf = String.valueOf(ve.i.x(achievement, achievement.getLevel()));
                } else {
                    strValueOf = BuildConfig.VERSION_NAME;
                }
                aVar = achievementSize;
                d(zIsActive, aVar, iR, i17, i14, listU3, strValueOf, sVar, 1597488);
            }
            throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievement.getId()));
        }
        aVar = achievementSize;
        sVar.W();
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(achievement, i11, 29, aVar);
        }
    }

    public static final void b(List achievementLanguages, fz.a onBackClick, fz.c onLanguageItemClick, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(achievementLanguages, "achievementLanguages");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(onLanguageItemClick, "onLanguageItemClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2070401692);
        int i12 = i11 | (sVar.h(achievementLanguages) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | (sVar.h(onLanguageItemClick) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarV = j0.c.v(oVar);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
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
            iu.k.g(onBackClick, null, f47031a, null, null, null, null, null, sVar, ((i12 >> 3) & 14) | 384, 250);
            j0.c.g(sVar, e2.g(oVar, 10));
            i9.a(null, null, 0L, 0L, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, null, t1.e.d(744903477, new q3(7, onLanguageItemClick, achievementLanguages), sVar), sVar, 12582912, 127);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k6(achievementLanguages, onBackClick, onLanguageItemClick, i11, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:112:0x0300  */
    /* JADX WARN: Code duplicated, block: B:116:0x032c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0341  */
    /* JADX WARN: Code duplicated, block: B:121:0x034d  */
    /* JADX WARN: Code duplicated, block: B:124:0x036f  */
    /* JADX WARN: Code duplicated, block: B:127:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:131:0x04ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:132:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:139:0x04d3  */
    /* JADX WARN: Code duplicated, block: B:142:0x04db  */
    /* JADX WARN: Code duplicated, block: B:143:0x04e2  */
    /* JADX WARN: Code duplicated, block: B:145:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:146:0x04f0 A[PHI: r9
      0x04f0: PHI (r9v31 boolean) = (r9v28 boolean), (r9v32 boolean), (r9v34 boolean) binds: [B:144:0x04e7, B:140:0x04d8, B:133:0x04be] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0501  */
    /* JADX WARN: Code duplicated, block: B:150:0x0511 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:151:0x0513  */
    /* JADX WARN: Code duplicated, block: B:158:0x052a  */
    /* JADX WARN: Code duplicated, block: B:161:0x0532  */
    /* JADX WARN: Code duplicated, block: B:162:0x0539  */
    /* JADX WARN: Code duplicated, block: B:164:0x0540  */
    /* JADX WARN: Code duplicated, block: B:165:0x0547 A[PHI: r9
      0x0547: PHI (r9v14 boolean) = (r9v11 boolean), (r9v15 boolean), (r9v17 boolean) binds: [B:163:0x053e, B:159:0x052f, B:152:0x0515] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:169:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:171:0x061f  */
    /* JADX WARN: Code duplicated, block: B:173:0x0627  */
    /* JADX WARN: Code duplicated, block: B:178:0x0645  */
    /* JADX WARN: Code duplicated, block: B:183:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:186:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:189:0x071d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0730  */
    /* JADX WARN: Code duplicated, block: B:192:0x0736  */
    /* JADX WARN: Code duplicated, block: B:195:0x0746  */
    /* JADX WARN: Code duplicated, block: B:198:0x0790  */
    /* JADX WARN: Code duplicated, block: B:97:0x029c  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a0  */
    public static final void c(final AchievementLevel achievement, n0 n0Var, final fz.a onBackClick, final fz.f shareImage, final fz.c shareMore, l1.n nVar, final int i11) {
        l1.s sVar;
        final n0 n0Var2;
        final n0 n0Var3;
        int i12;
        b1 b1Var;
        Object yVar;
        z1.j jVar;
        y2.h hVar;
        b1 b1Var2;
        int iHashCode;
        int iHashCode2;
        boolean z11;
        l1.s sVar2;
        AchievementLevel achievementLevel;
        boolean z12;
        boolean z13;
        l1.s sVar3;
        b1 b1Var3;
        l1.g gVar;
        rz.b0 b0Var;
        ur.a aVar;
        Object objQ;
        l1.g gVar2;
        Object obj;
        Object objQ2;
        l1.d0 d0Var;
        float f5;
        l1.s sVar4;
        AchievementLevel achievementLevel2;
        String strW;
        boolean zIsActive;
        String strM;
        String id2;
        int iHashCode3;
        boolean z14;
        int i13;
        int i14;
        String strQ0;
        l1.s sVar5;
        boolean z15;
        int iHashCode4;
        String id3;
        int iHashCode5;
        int i15;
        int i16;
        Object objQ3;
        kotlin.jvm.internal.m.f(achievement, "achievement");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(shareImage, "shareImage");
        kotlin.jvm.internal.m.f(shareMore, "shareMore");
        l1.s sVar6 = (l1.s) nVar;
        sVar6.f0(-1597473133);
        int i17 = (sVar6.h(achievement) ? 4 : 2) | i11 | 16;
        if ((i11 & 384) == 0) {
            i17 |= sVar6.h(onBackClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i17 |= sVar6.h(shareImage) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i17 |= sVar6.h(shareMore) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if (sVar6.T(i17 & 1, (i17 & 9363) != 9362)) {
            sVar6.Y();
            int i18 = i11 & 1;
            l1.g gVar3 = l1.m.f39353a;
            vy.d dVar = null;
            if (i18 == 0 || sVar6.C()) {
                e20.a aVarC = w4.c.c(sVar6, -1168520582, sVar6, -1633490746);
                boolean zF = sVar6.f(null) | sVar6.f(aVarC);
                Object objQ4 = sVar6.Q();
                if (zF || objQ4 == gVar3) {
                    objQ4 = w4.c.e(n0.class, aVarC, null, null, sVar6);
                }
                sVar6.p(false);
                sVar6.p(false);
                n0Var3 = (n0) objQ4;
                i12 = i17 & (-113);
            } else {
                sVar6.W();
                i12 = i17 & (-113);
                n0Var3 = n0Var;
            }
            int i19 = i12;
            sVar6.q();
            Context context = (Context) sVar6.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ5 = sVar6.Q();
            if (objQ5 == gVar3) {
                objQ5 = l1.t.q(sVar6);
                sVar6.o0(objQ5);
            }
            rz.b0 b0Var2 = (rz.b0) objQ5;
            e20.a aVarC2 = w4.c.c(sVar6, -1168520582, sVar6, -1633490746);
            boolean zF2 = sVar6.f(null) | sVar6.f(aVarC2);
            Object objQ6 = sVar6.Q();
            if (zF2 || objQ6 == gVar3) {
                objQ6 = w4.c.e(ur.a.class, aVarC2, null, null, sVar6);
            }
            sVar6.p(false);
            sVar6.p(false);
            ur.a aVar2 = (ur.a) objQ6;
            Object objQ7 = sVar6.Q();
            if (objQ7 == gVar3) {
                objQ7 = l1.t.B(achievement);
                sVar6.o0(objQ7);
            }
            b1 b1Var4 = (b1) objQ7;
            Object objQ8 = sVar6.Q();
            if (objQ8 == gVar3) {
                objQ8 = l1.t.B(ry.r.f50854a);
                sVar6.o0(objQ8);
            }
            b1 b1Var5 = (b1) objQ8;
            Object objQ9 = sVar6.Q();
            if (objQ9 == gVar3) {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar6.o0(objQ9);
            }
            b1 b1Var6 = (b1) objQ9;
            boolean zH = sVar6.h(aVar2);
            Object objQ10 = sVar6.Q();
            if (zH || objQ10 == gVar3) {
                objQ10 = new l(aVar2, b1Var4, dVar, 0);
                sVar6.o0(objQ10);
            }
            l1.t.f((fz.e) objQ10, achievement, sVar6);
            boolean zH2 = sVar6.h(achievement) | sVar6.h(n0Var3);
            Object objQ11 = sVar6.Q();
            if (zH2 || objQ11 == gVar3) {
                b1Var = b1Var5;
                yVar = new ad.y(achievement, n0Var3, b1Var, dVar, 26);
                sVar6.o0(yVar);
            } else {
                yVar = objQ11;
                b1Var = b1Var5;
            }
            l1.t.f((fz.e) yVar, qy.b0.f48488a, sVar6);
            if (((List) b1Var.getValue()).isEmpty()) {
                x1 x1VarT = sVar6.t();
                if (x1VarT != null) {
                    final int i21 = 0;
                    x1VarT.f39502d = new fz.e() { // from class: pr.f
                        @Override // fz.e
                        public final Object invoke(Object obj2, Object obj3) {
                            switch (i21) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    f0.c(achievement, n0Var3, onBackClick, shareImage, shareMore, (l1.n) obj2, l1.t.M(i11 | 1));
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    f0.c(achievement, n0Var3, onBackClick, shareImage, shareMore, (l1.n) obj2, l1.t.M(i11 | 1));
                                    break;
                            }
                            return qy.b0.f48488a;
                        }
                    };
                    return;
                }
                return;
            }
            n0 n0Var4 = n0Var3;
            int level = achievement.isActive() ? achievement.getLevel() - 1 : 0;
            Object objQ12 = sVar6.Q();
            if (objQ12 == gVar3) {
                objQ12 = new n4(24, b1Var);
                sVar6.o0(objQ12);
            }
            o0.b bVarB = o0.w.b(level, 384, 2, (fz.a) objQ12, sVar6);
            z1.j jVar2 = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar2, false);
            int iHashCode6 = Long.hashCode(sVar6.T);
            q1 q1VarL = sVar6.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar6, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(iVar);
            } else {
                sVar6.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, q0VarD, sVar6);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar6);
            y2.h hVar4 = y2.j.f56918g;
            if (sVar6.S) {
                jVar = jVar2;
            } else {
                jVar = jVar2;
                if (!kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode6))) {
                }
                hVar = y2.j.f56915d;
                l1.t.J(hVar, rVarC, sVar6);
                b1Var2 = b1Var;
                j0.d(((AchievementLevel) b1Var4.getValue()).isActive(), null, f1.e(null, 3), f1.f(null, 3), null, t1.e.d(966831857, new g5(7, b1Var4), sVar6), sVar6, 200064, 18);
                z1.r rVarD = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar6, 48);
                iHashCode = Long.hashCode(sVar6.T);
                q1 q1VarL2 = sVar6.l();
                z1.r rVarC2 = z1.a.c(sVar6, rVarD);
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(iVar);
                } else {
                    sVar6.r0();
                }
                l1.t.J(hVar2, uVarA, sVar6);
                l1.t.J(hVar3, q1VarL2, sVar6);
                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar6, iHashCode, hVar4);
                }
                l1.t.J(hVar, rVarC2, sVar6);
                a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar6, 0);
                iHashCode2 = Long.hashCode(sVar6.T);
                q1 q1VarL3 = sVar6.l();
                z1.r rVarC3 = z1.a.c(sVar6, oVar);
                sVar6.h0();
                if (sVar6.S) {
                    sVar6.k(iVar);
                } else {
                    sVar6.r0();
                }
                l1.t.J(hVar2, a2VarA, sVar6);
                l1.t.J(hVar3, q1VarL3, sVar6);
                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar4);
                }
                l1.t.J(hVar, rVarC3, sVar6);
                k7.h(onBackClick, null, false, null, f47032b, sVar6, ((i19 >> 6) & 14) | 196608, 30);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.c.g(sVar6, new i1(1.0f, true));
                if (achievement.isActive()) {
                    sVar6.d0(-759738937);
                    objQ3 = sVar6.Q();
                    if (objQ3 == gVar3) {
                        objQ3 = new n4(25, b1Var6);
                        sVar6.o0(objQ3);
                    }
                    k7.h((fz.a) objQ3, null, false, null, f47033c, sVar6, 196614, 30);
                    sVar2 = sVar6;
                    z11 = false;
                } else {
                    z11 = false;
                    sVar2 = sVar6;
                    sVar2.d0(-767621617);
                }
                sVar2.p(z11);
                sVar2.p(true);
                j0.c.g(sVar2, e2.g(oVar, 32));
                a((AchievementLevel) b1Var4.getValue(), qr.a.BIG, sVar2, r8);
                if (((List) b1Var2.getValue()).size() > 1) {
                    sVar2.d0(1664251199);
                    b0Var = b0Var2;
                    aVar = aVar2;
                    k(bVarB, t1.e.d(-1882576321, new iv.b0(bVarB, achievement, b0Var2, aVar2, b1Var2, b1Var4, 3), sVar2), sVar2, 48);
                    j0.c.g(sVar2, e2.g(oVar, 12));
                    String strV = ve.i.v(achievement, sVar2);
                    d0Var = ua.f31167a;
                    y0 y0Var = (y0) sVar2.j(d0Var);
                    long jA = j3.A(30);
                    n3.s sVar7 = n3.s.L;
                    f5 = 52;
                    sVar4 = sVar2;
                    b1Var3 = b1Var6;
                    gVar = gVar3;
                    ua.b(strV, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var, 0L, jA, sVar7, null, null, 0L, null, null, 3, 4, 0L, null, 16678905), sVar4, 48, 0, 65532);
                    j0.c.g(sVar4, e2.g(oVar, 9));
                    sVar4.d0(607943863);
                    achievementLevel2 = (AchievementLevel) b1Var4.getValue();
                    strW = w(achievementLevel2);
                    zIsActive = achievementLevel2.isActive();
                    strM = BuildConfig.VERSION_NAME;
                    if (zIsActive) {
                        sVar4.d0(-1186103712);
                        id3 = achievementLevel2.getId();
                        iHashCode5 = id3.hashCode();
                        if (iHashCode5 != 3832) {
                            z14 = false;
                            if (id3.equals("xp")) {
                                i15 = 368363986;
                                i16 = R.string.you_got_s_xp;
                                strM = ep.a.m(sVar4, i15, i16, sVar4, z14);
                            } else {
                                sVar4.d0(-1464632367);
                                sVar4.p(z14);
                            }
                        } else if (iHashCode5 == 159337103) {
                            z14 = false;
                            if (id3.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                                i15 = 368370281;
                                i16 = R.string.you_mastered_your_s_knowledge_point;
                                strM = ep.a.m(sVar4, i15, i16, sVar4, z14);
                            } else {
                                sVar4.d0(-1464632367);
                                sVar4.p(z14);
                            }
                        } else if (iHashCode5 == 542228865 && id3.equals(AchievementLevelType.DAY_STREAK)) {
                            i15 = 368386912;
                            i16 = R.string.you_reached_a_s_day_streak;
                            z14 = false;
                            strM = ep.a.m(sVar4, i15, i16, sVar4, z14);
                        } else {
                            z14 = false;
                            sVar4.d0(-1464632367);
                            sVar4.p(z14);
                        }
                        strQ0 = oz.x.q0(strM, "%s", strW);
                        sVar4.p(z14);
                    } else {
                        sVar4.d0(-1185983866);
                        id2 = achievementLevel2.getId();
                        iHashCode3 = id2.hashCode();
                        if (iHashCode3 != 3832) {
                            z14 = false;
                            if (id2.equals("xp")) {
                                i13 = 89202630;
                                i14 = R.string.get_s_xp_to_win_this_badge;
                                strM = ep.a.m(sVar4, i13, i14, sVar4, z14);
                            } else {
                                sVar4.d0(-1528617909);
                                sVar4.p(z14);
                            }
                        } else if (iHashCode3 == 159337103) {
                            z14 = false;
                            if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                                i13 = 89209655;
                                i14 = R.string.master_s_knowledge_points_to_win_this_badge;
                                strM = ep.a.m(sVar4, i13, i14, sVar4, z14);
                            } else {
                                sVar4.d0(-1528617909);
                                sVar4.p(z14);
                            }
                        } else if (iHashCode3 == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                            i13 = 89227730;
                            i14 = R.string.reach_a_s_day_streak_to_win_this_badge;
                            z14 = false;
                            strM = ep.a.m(sVar4, i13, i14, sVar4, z14);
                        } else {
                            z14 = false;
                            sVar4.d0(-1528617909);
                            sVar4.p(z14);
                        }
                        strQ0 = oz.x.q0(strM, "%s", strW);
                        sVar4.p(z14);
                    }
                    sVar4.p(z14);
                    ua.b(strQ0, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(d0Var), 0L, j3.A(18), sVar7, null, null, 0L, null, null, 3, 4, 0L, null, 16678905), sVar4, 48, 0, 65532);
                    sVar5 = sVar4;
                    if (((AchievementLevel) b1Var4.getValue()).isActive()) {
                        sVar5.d0(1667219201);
                        z1.r rVarA = d2.h.a(j0.c.B(d0.n.h(j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ve.i.s((AchievementLevel) b1Var4.getValue()), r0.f.a()), 8, 2), 0.8f);
                        q0 q0VarD2 = j0.o.d(jVar, false);
                        iHashCode4 = Long.hashCode(sVar5.T);
                        q1 q1VarL4 = sVar5.l();
                        z1.r rVarC4 = z1.a.c(sVar5, rVarA);
                        sVar5.h0();
                        if (sVar5.S) {
                            sVar5.k(iVar);
                        } else {
                            sVar5.r0();
                        }
                        l1.t.J(hVar2, q0VarD2, sVar5);
                        l1.t.J(hVar3, q1VarL4, sVar5);
                        if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode4))) {
                            defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar4);
                        }
                        l1.t.J(hVar, rVarC4, sVar5);
                        ua.b(((AchievementLevel) b1Var4.getValue()).getEarnDate(), j0.r.f35391a.a(oVar, z1.c.f58467e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(d0Var), g2.x.f28618e, j3.A(12), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 0, 0, 65532);
                        sVar5 = sVar5;
                        z13 = true;
                        sVar5.p(true);
                        z15 = false;
                    } else {
                        z15 = false;
                        z13 = true;
                        sVar5.d0(1655570579);
                    }
                    sVar5.p(z15);
                    j0.c.g(sVar5, j0.v.a(oVar, 1.0f));
                    achievementLevel = achievement;
                    sVar3 = sVar5;
                    j0.c(!((AchievementLevel) b1Var4.getValue()).isActive(), null, null, null, null, t1.e.d(1921548226, new at.p(26, achievementLevel, b1Var4), sVar5), sVar3, 1572870, 30);
                    z12 = false;
                } else {
                    achievementLevel = achievement;
                    z12 = z11;
                    z13 = true;
                    sVar3 = sVar2;
                    b1Var3 = b1Var6;
                    gVar = gVar3;
                    b0Var = b0Var2;
                    aVar = aVar2;
                    sVar3.d0(1655570579);
                }
                sVar3.p(z12);
                sVar3.p(z13);
                if (((Boolean) b1Var3.getValue()).booleanValue()) {
                    sVar3.d0(1359644806);
                    kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                    objQ = sVar3.Q();
                    gVar2 = gVar;
                    if (objQ == gVar2) {
                        obj = null;
                        sVar3.o0(null);
                        objQ = null;
                    } else {
                        obj = null;
                    }
                    yVar2.f38361a = (Uri) objQ;
                    kotlin.jvm.internal.y yVar3 = new kotlin.jvm.internal.y();
                    objQ2 = sVar3.Q();
                    if (objQ2 == gVar2) {
                        sVar3.o0(obj);
                        objQ2 = obj;
                    }
                    yVar3.f38361a = (Bitmap) objQ2;
                    rz.b0 b0Var3 = b0Var;
                    ur.a aVar3 = aVar;
                    sVar = sVar3;
                    tv.j.b(b1Var3, new i(yVar2, shareImage, b0Var3, achievementLevel, aVar3, 0), new j(yVar2, shareMore, b0Var3, achievement, aVar3, 0), new k(yVar3, b0Var3, context, achievement, aVar3, 0), t1.e.d(446997872, new g(achievement, yVar3, yVar2, 0), sVar3), sVar, 24582);
                } else {
                    sVar = sVar3;
                    sVar.d0(1345120841);
                }
                sVar.p(z12);
                sVar.p(z13);
                n0Var2 = n0Var4;
            }
            defpackage.e.A(iHashCode6, sVar6, iHashCode6, hVar4);
            hVar = y2.j.f56915d;
            l1.t.J(hVar, rVarC, sVar6);
            b1Var2 = b1Var;
            j0.d(((AchievementLevel) b1Var4.getValue()).isActive(), null, f1.e(null, 3), f1.f(null, 3), null, t1.e.d(966831857, new g5(7, b1Var4), sVar6), sVar6, 200064, 18);
            z1.r rVarD2 = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
            j0.u uVarA2 = j0.t.a(j0.i.f35305c, z1.c.P, sVar6, 48);
            iHashCode = Long.hashCode(sVar6.T);
            q1 q1VarL5 = sVar6.l();
            z1.r rVarC5 = z1.a.c(sVar6, rVarD2);
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(iVar);
            } else {
                sVar6.r0();
            }
            l1.t.J(hVar2, uVarA2, sVar6);
            l1.t.J(hVar3, q1VarL5, sVar6);
            if (sVar6.S) {
                defpackage.e.A(iHashCode, sVar6, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar6, iHashCode, hVar4);
            }
            l1.t.J(hVar, rVarC5, sVar6);
            a2 a2VarA2 = z1.a(j0.i.f35303a, z1.c.L, sVar6, 0);
            iHashCode2 = Long.hashCode(sVar6.T);
            q1 q1VarL6 = sVar6.l();
            z1.r rVarC6 = z1.a.c(sVar6, oVar);
            sVar6.h0();
            if (sVar6.S) {
                sVar6.k(iVar);
            } else {
                sVar6.r0();
            }
            l1.t.J(hVar2, a2VarA2, sVar6);
            l1.t.J(hVar3, q1VarL6, sVar6);
            if (sVar6.S) {
                defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar4);
            } else {
                defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar4);
            }
            l1.t.J(hVar, rVarC6, sVar6);
            k7.h(onBackClick, null, false, null, f47032b, sVar6, ((i19 >> 6) & 14) | 196608, 30);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar6, new i1(1.0f, true));
            if (achievement.isActive()) {
                sVar6.d0(-759738937);
                objQ3 = sVar6.Q();
                if (objQ3 == gVar3) {
                    objQ3 = new n4(25, b1Var6);
                    sVar6.o0(objQ3);
                }
                k7.h((fz.a) objQ3, null, false, null, f47033c, sVar6, 196614, 30);
                sVar2 = sVar6;
                z11 = false;
            } else {
                z11 = false;
                sVar2 = sVar6;
                sVar2.d0(-767621617);
            }
            sVar2.p(z11);
            sVar2.p(true);
            j0.c.g(sVar2, e2.g(oVar, 32));
            a((AchievementLevel) b1Var4.getValue(), qr.a.BIG, sVar2, r8);
            if (((List) b1Var2.getValue()).size() > 1) {
                sVar2.d0(1664251199);
                b0Var = b0Var2;
                aVar = aVar2;
                k(bVarB, t1.e.d(-1882576321, new iv.b0(bVarB, achievement, b0Var2, aVar2, b1Var2, b1Var4, 3), sVar2), sVar2, 48);
                j0.c.g(sVar2, e2.g(oVar, 12));
                String strV2 = ve.i.v(achievement, sVar2);
                d0Var = ua.f31167a;
                y0 y0Var2 = (y0) sVar2.j(d0Var);
                long jA2 = j3.A(30);
                n3.s sVar8 = n3.s.L;
                f5 = 52;
                sVar4 = sVar2;
                b1Var3 = b1Var6;
                gVar = gVar3;
                ua.b(strV2, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a(y0Var2, 0L, jA2, sVar8, null, null, 0L, null, null, 3, 4, 0L, null, 16678905), sVar4, 48, 0, 65532);
                j0.c.g(sVar4, e2.g(oVar, 9));
                sVar4.d0(607943863);
                achievementLevel2 = (AchievementLevel) b1Var4.getValue();
                strW = w(achievementLevel2);
                zIsActive = achievementLevel2.isActive();
                strM = BuildConfig.VERSION_NAME;
                if (zIsActive) {
                    sVar4.d0(-1186103712);
                    id3 = achievementLevel2.getId();
                    iHashCode5 = id3.hashCode();
                    if (iHashCode5 != 3832) {
                        z14 = false;
                        if (id3.equals("xp")) {
                            i15 = 368363986;
                            i16 = R.string.you_got_s_xp;
                            strM = ep.a.m(sVar4, i15, i16, sVar4, z14);
                        } else {
                            sVar4.d0(-1464632367);
                            sVar4.p(z14);
                        }
                    } else if (iHashCode5 == 159337103) {
                        if (iHashCode5 == 542228865) {
                            i15 = 368386912;
                            i16 = R.string.you_reached_a_s_day_streak;
                            z14 = false;
                            strM = ep.a.m(sVar4, i15, i16, sVar4, z14);
                        }
                        z14 = false;
                        sVar4.d0(-1464632367);
                        sVar4.p(z14);
                    } else {
                        z14 = false;
                        if (id3.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                            sVar4.d0(-1464632367);
                            sVar4.p(z14);
                        } else {
                            i15 = 368370281;
                            i16 = R.string.you_mastered_your_s_knowledge_point;
                            strM = ep.a.m(sVar4, i15, i16, sVar4, z14);
                        }
                    }
                    strQ0 = oz.x.q0(strM, "%s", strW);
                    sVar4.p(z14);
                } else {
                    sVar4.d0(-1185983866);
                    id2 = achievementLevel2.getId();
                    iHashCode3 = id2.hashCode();
                    if (iHashCode3 != 3832) {
                        z14 = false;
                        if (id2.equals("xp")) {
                            i13 = 89202630;
                            i14 = R.string.get_s_xp_to_win_this_badge;
                            strM = ep.a.m(sVar4, i13, i14, sVar4, z14);
                        } else {
                            sVar4.d0(-1528617909);
                            sVar4.p(z14);
                        }
                    } else if (iHashCode3 == 159337103) {
                        if (iHashCode3 == 542228865) {
                            i13 = 89227730;
                            i14 = R.string.reach_a_s_day_streak_to_win_this_badge;
                            z14 = false;
                            strM = ep.a.m(sVar4, i13, i14, sVar4, z14);
                        }
                        z14 = false;
                        sVar4.d0(-1528617909);
                        sVar4.p(z14);
                    } else {
                        z14 = false;
                        if (id2.equals(AchievementLevelType.KNOWLEDGE_POINT)) {
                            sVar4.d0(-1528617909);
                            sVar4.p(z14);
                        } else {
                            i13 = 89209655;
                            i14 = R.string.master_s_knowledge_points_to_win_this_badge;
                            strM = ep.a.m(sVar4, i13, i14, sVar4, z14);
                        }
                    }
                    strQ0 = oz.x.q0(strM, "%s", strW);
                    sVar4.p(z14);
                }
                sVar4.p(z14);
                ua.b(strQ0, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(d0Var), 0L, j3.A(18), sVar8, null, null, 0L, null, null, 3, 4, 0L, null, 16678905), sVar4, 48, 0, 65532);
                sVar5 = sVar4;
                if (((AchievementLevel) b1Var4.getValue()).isActive()) {
                    sVar5.d0(1667219201);
                    z1.r rVarA2 = d2.h.a(j0.c.B(d0.n.h(j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ve.i.s((AchievementLevel) b1Var4.getValue()), r0.f.a()), 8, 2), 0.8f);
                    q0 q0VarD3 = j0.o.d(jVar, false);
                    iHashCode4 = Long.hashCode(sVar5.T);
                    q1 q1VarL7 = sVar5.l();
                    z1.r rVarC7 = z1.a.c(sVar5, rVarA2);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar2, q0VarD3, sVar5);
                    l1.t.J(hVar3, q1VarL7, sVar5);
                    if (sVar5.S) {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar4);
                    } else {
                        defpackage.e.A(iHashCode4, sVar5, iHashCode4, hVar4);
                    }
                    l1.t.J(hVar, rVarC7, sVar5);
                    ua.b(((AchievementLevel) b1Var4.getValue()).getEarnDate(), j0.r.f35391a.a(oVar, z1.c.f58467e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar5.j(d0Var), g2.x.f28618e, j3.A(12), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar5, 0, 0, 65532);
                    sVar5 = sVar5;
                    z13 = true;
                    sVar5.p(true);
                    z15 = false;
                } else {
                    z15 = false;
                    z13 = true;
                    sVar5.d0(1655570579);
                }
                sVar5.p(z15);
                j0.c.g(sVar5, j0.v.a(oVar, 1.0f));
                achievementLevel = achievement;
                sVar3 = sVar5;
                j0.c(!((AchievementLevel) b1Var4.getValue()).isActive(), null, null, null, null, t1.e.d(1921548226, new at.p(26, achievementLevel, b1Var4), sVar5), sVar3, 1572870, 30);
                z12 = false;
            } else {
                achievementLevel = achievement;
                z12 = z11;
                z13 = true;
                sVar3 = sVar2;
                b1Var3 = b1Var6;
                gVar = gVar3;
                b0Var = b0Var2;
                aVar = aVar2;
                sVar3.d0(1655570579);
            }
            sVar3.p(z12);
            sVar3.p(z13);
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar3.d0(1359644806);
                kotlin.jvm.internal.y yVar4 = new kotlin.jvm.internal.y();
                objQ = sVar3.Q();
                gVar2 = gVar;
                if (objQ == gVar2) {
                    obj = null;
                    sVar3.o0(null);
                    objQ = null;
                } else {
                    obj = null;
                }
                yVar4.f38361a = (Uri) objQ;
                kotlin.jvm.internal.y yVar5 = new kotlin.jvm.internal.y();
                objQ2 = sVar3.Q();
                if (objQ2 == gVar2) {
                    sVar3.o0(obj);
                    objQ2 = obj;
                }
                yVar5.f38361a = (Bitmap) objQ2;
                rz.b0 b0Var4 = b0Var;
                ur.a aVar4 = aVar;
                sVar = sVar3;
                tv.j.b(b1Var3, new i(yVar4, shareImage, b0Var4, achievementLevel, aVar4, 0), new j(yVar4, shareMore, b0Var4, achievement, aVar4, 0), new k(yVar5, b0Var4, context, achievement, aVar4, 0), t1.e.d(446997872, new g(achievement, yVar5, yVar4, 0), sVar3), sVar, 24582);
            } else {
                sVar = sVar3;
                sVar.d0(1345120841);
            }
            sVar.p(z12);
            sVar.p(z13);
            n0Var2 = n0Var4;
        } else {
            sVar = sVar6;
            sVar.W();
            n0Var2 = n0Var;
        }
        x1 x1VarT2 = sVar.t();
        if (x1VarT2 != null) {
            final int i22 = 1;
            x1VarT2.f39502d = new fz.e() { // from class: pr.f
                @Override // fz.e
                public final Object invoke(Object obj2, Object obj3) {
                    switch (i22) {
                        case 0:
                            ((Integer) obj3).getClass();
                            f0.c(achievement, n0Var2, onBackClick, shareImage, shareMore, (l1.n) obj2, l1.t.M(i11 | 1));
                            break;
                        default:
                            ((Integer) obj3).getClass();
                            f0.c(achievement, n0Var2, onBackClick, shareImage, shareMore, (l1.n) obj2, l1.t.M(i11 | 1));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void d(boolean z11, qr.a achievementSize, int i11, int i12, final int i13, List list, String levelNumber, l1.n nVar, int i14) {
        int i15;
        Object gVar;
        final int i16;
        final a1 a1Var;
        final a1 a1Var2;
        a1 a1Var3;
        String str;
        Integer num;
        final a1 a1Var4;
        a1 a1Var5;
        int i17;
        boolean z12;
        boolean z13;
        g2.j0 j0VarA;
        int i18;
        kotlin.jvm.internal.m.f(achievementSize, "achievementSize");
        kotlin.jvm.internal.m.f(levelNumber, "levelNumber");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(456205816);
        if ((i14 & 6) == 0) {
            i15 = (sVar.g(z11) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        int i19 = i15 | (sVar.d(i11) ? 256 : 128);
        if ((i14 & 3072) == 0) {
            i19 |= sVar.d(i12) ? 2048 : 1024;
        }
        if ((196608 & i14) == 0) {
            i19 |= sVar.d(i13) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        int i21 = i19 | (sVar.h(list) ? 8388608 : 4194304);
        if ((100663296 & i14) == 0) {
            i21 |= sVar.f(levelNumber) ? 67108864 : 33554432;
        }
        if (sVar.T(i21 & 1, (38347923 & i21) != 38347922)) {
            Object objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                int i22 = s.f47096a[achievementSize.ordinal()];
                if (i22 == 1) {
                    i18 = 320;
                } else if (i22 == 2) {
                    i18 = 226;
                } else if (i22 != 3) {
                    i18 = i22 != 4 ? 110 : 88;
                } else {
                    i18 = 190;
                }
                objQ = Integer.valueOf(i18);
                sVar.o0(objQ);
            }
            int iIntValue = ((Number) objQ).intValue();
            Object objQ2 = sVar.Q();
            if (objQ2 == gVar2) {
                objQ2 = defpackage.e.v(0, sVar);
            }
            a1 a1Var6 = (a1) objQ2;
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar2) {
                objQ3 = defpackage.e.v(0, sVar);
            }
            a1 a1Var7 = (a1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar2) {
                objQ4 = defpackage.e.v(0, sVar);
            }
            a1 a1Var8 = (a1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar2) {
                objQ5 = defpackage.e.v(0, sVar);
            }
            a1 a1Var9 = (a1) objQ5;
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar2) {
                objQ6 = defpackage.e.v(0, sVar);
            }
            a1 a1Var10 = (a1) objQ6;
            Integer numValueOf = Integer.valueOf(iIntValue);
            Integer numValueOf2 = Integer.valueOf(i11);
            boolean zD = sVar.d(iIntValue) | ((i21 & 234881024) == 67108864);
            Object objQ7 = sVar.Q();
            if (zD || objQ7 == gVar2) {
                i16 = iIntValue;
                a1Var = a1Var9;
                a1Var2 = a1Var10;
                a1Var3 = a1Var8;
                str = levelNumber;
                num = numValueOf2;
                a1Var4 = a1Var6;
                a1Var5 = a1Var7;
                i17 = 4;
                z12 = true;
                z13 = false;
                gVar = new b0.g(i16, str, a1Var4, a1Var5, a1Var3, a1Var, a1Var2, null);
                sVar.o0(gVar);
            } else {
                i16 = iIntValue;
                a1Var = a1Var9;
                a1Var2 = a1Var10;
                a1Var3 = a1Var8;
                str = levelNumber;
                a1Var4 = a1Var6;
                a1Var5 = a1Var7;
                i17 = 4;
                z12 = true;
                z13 = false;
                gVar = objQ7;
                num = numValueOf2;
            }
            l1.t.h(numValueOf, num, str, (fz.e) gVar, sVar);
            boolean zF = sVar.f(list);
            if ((i21 & 14) != i17) {
                z12 = z13;
            }
            boolean z14 = zF | z12;
            Object objQ8 = sVar.Q();
            if (z14 || objQ8 == gVar2) {
                if (list.isEmpty()) {
                    j0VarA = null;
                } else {
                    j0VarA = z11 ? p3.A(list) : p3.A(ns.o.L(new g2.x(g2.f0.e(4284703587L)), new g2.x(g2.f0.e(4289769648L))));
                }
                objQ8 = j0VarA;
                sVar.o0(objQ8);
            }
            final g2.t tVar = (g2.t) objQ8;
            final int i23 = z11 ? i11 : i12;
            final a1 a1Var11 = a1Var5;
            final a1 a1Var12 = a1Var3;
            final String str2 = str;
            l1.t.a(g1.f58552n.a(v3.m.Ltr), t1.e.d(-1514870088, new fz.e() { // from class: pr.q
                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:101:0x02e0  */
                /* JADX WARN: Code duplicated, block: B:103:0x02e6  */
                /* JADX WARN: Code duplicated, block: B:106:0x02ee  */
                /* JADX WARN: Code duplicated, block: B:107:0x02f2  */
                /* JADX WARN: Code duplicated, block: B:110:0x02f9  */
                /* JADX WARN: Code duplicated, block: B:111:0x02fd  */
                /* JADX WARN: Code duplicated, block: B:114:0x0304  */
                /* JADX WARN: Code duplicated, block: B:115:0x0308  */
                /* JADX WARN: Code duplicated, block: B:118:0x030f  */
                /* JADX WARN: Code duplicated, block: B:119:0x0313  */
                /* JADX WARN: Code duplicated, block: B:122:0x031a  */
                /* JADX WARN: Code duplicated, block: B:123:0x031e  */
                /* JADX WARN: Code duplicated, block: B:126:0x0325  */
                /* JADX WARN: Code duplicated, block: B:127:0x0329  */
                /* JADX WARN: Code duplicated, block: B:130:0x0332  */
                /* JADX WARN: Code duplicated, block: B:131:0x0336  */
                /* JADX WARN: Code duplicated, block: B:134:0x033f  */
                /* JADX WARN: Code duplicated, block: B:135:0x0343  */
                /* JADX WARN: Code duplicated, block: B:137:0x034b  */
                /* JADX WARN: Code duplicated, block: B:138:0x034f  */
                /* JADX WARN: Code duplicated, block: B:86:0x023e  */
                /* JADX WARN: Code duplicated, block: B:97:0x02d5  */
                /* JADX WARN: Code duplicated, block: B:99:0x02da  */
                /* JADX WARN: Failed to clean up code after switch over string restore
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v7 int, still in use, count: 1, list:
                  (r13v7 int) from 0x01cc: IF  (r13v7 int) != (35 int)  -> B:46:0x01ce A[HIDDEN] (LINE:461)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
                	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
                	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
                 */
                /* JADX WARN: Failed to clean up code after switch over string restore
                jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v7 int, still in use, count: 1, list:
                  (r13v7 int) from 0x01cc: IF  (r13v7 int) != (35 int)  -> B:46:0x01ce A[HIDDEN] (LINE:461)
                	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
                	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
                	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
                	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
                 */
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    boolean z15;
                    int i24;
                    float f5;
                    String number;
                    int i25;
                    q qVar = this;
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    z1.j jVar = z1.c.f58463a;
                    boolean z16 = true;
                    boolean z17 = false;
                    l1.s sVar2 = (l1.s) nVar2;
                    if (sVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        float f11 = i16;
                        z1.o oVar = z1.o.f58481a;
                        z1.r rVarN = e2.n(oVar, f11);
                        q0 q0VarD = j0.o.d(jVar, false);
                        int iHashCode = Long.hashCode(sVar2.T);
                        q1 q1VarL = sVar2.l();
                        z1.r rVarC = z1.a.c(sVar2, rVarN);
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
                        int i26 = i13;
                        j0.r rVar = j0.r.f35391a;
                        if (i26 != -1) {
                            sVar2.d0(-400041269);
                            f0.p(i26, 0, sVar2, e2.n(oVar, f11));
                            sVar2.p(false);
                        } else {
                            sVar2.d0(-399611144);
                            d0.n.c(se.k.y(i23, sVar2, 0), null, e2.n(rVar.a(oVar, z1.c.H), f11), null, w2.i.f54516c, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 24624, 104);
                            sVar2.p(false);
                        }
                        g2.t tVar2 = tVar;
                        if (tVar2 == null) {
                            sVar2.d0(-399163474);
                            sVar2.p(false);
                            z15 = true;
                        } else {
                            sVar2.d0(-399163473);
                            sVar2.d0(125672193);
                            int i27 = 0;
                            int i28 = 0;
                            while (true) {
                                String str3 = str2;
                                if (i27 < str3.length()) {
                                    char cCharAt = str3.charAt(i27);
                                    int i29 = i28 + 1;
                                    int iL = ((h1) a1Var).l();
                                    h1 h1Var = (h1) a1Var4;
                                    z1.r rVarX = j0.c.x(e2.s(oVar, h1Var.l()), ((h1Var.l() - ((h1) a1Var12).l()) * i28) + iL, ((h1) a1Var2).l());
                                    q0 q0VarD2 = j0.o.d(jVar, z17);
                                    int iHashCode2 = Long.hashCode(sVar2.T);
                                    q1 q1VarL2 = sVar2.l();
                                    z1.r rVarC2 = z1.a.c(sVar2, rVarX);
                                    y2.k.J.getClass();
                                    y2.i iVar2 = y2.j.f56913b;
                                    sVar2.h0();
                                    if (sVar2.S) {
                                        sVar2.k(iVar2);
                                    } else {
                                        sVar2.r0();
                                    }
                                    l1.t.J(y2.j.f56917f, q0VarD2, sVar2);
                                    l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
                                    y2.h hVar2 = y2.j.f56918g;
                                    if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                                        defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar2);
                                    }
                                    l1.t.J(y2.j.f56915d, rVarC2, sVar2);
                                    int iL2 = kotlin.jvm.internal.m.a(String.valueOf(cCharAt), "#") ? (int) (((double) h1Var.l()) * 0.9d) : h1Var.l();
                                    boolean zA = kotlin.jvm.internal.m.a(String.valueOf(cCharAt), "#");
                                    a1 a1Var13 = a1Var11;
                                    int iL3 = zA ? (int) (((double) ((h1) a1Var13).l()) * 0.9d) : ((h1) a1Var13).l();
                                    String number2 = String.valueOf(cCharAt);
                                    kotlin.jvm.internal.m.f(number2, "number");
                                    z1.j jVar2 = jVar;
                                    int i30 = i27;
                                    g2.t tVar3 = tVar2;
                                    j0.r rVar2 = rVar;
                                    z1.o oVar2 = oVar;
                                    if (number2.hashCode() != 35) {
                                        switch (number2) {
                                            case "1":
                                                i24 = R.drawable.achievement_number_bg_1;
                                                break;
                                            case "2":
                                                i24 = R.drawable.achievement_number_bg_2;
                                                break;
                                            case "3":
                                                i24 = R.drawable.achievement_number_bg_3;
                                                break;
                                            case "4":
                                                i24 = R.drawable.achievement_number_bg_4;
                                                break;
                                            case "5":
                                                i24 = R.drawable.achievement_number_bg_5;
                                                break;
                                            case "6":
                                                i24 = R.drawable.achievement_number_bg_6;
                                                break;
                                            case "7":
                                                i24 = R.drawable.achievement_number_bg_7;
                                                break;
                                            case "8":
                                                i24 = R.drawable.achievement_number_bg_8;
                                                break;
                                            case "9":
                                                i24 = R.drawable.achievement_number_bg_9;
                                                break;
                                            default:
                                                i24 = R.drawable.achievement_number_bg_0;
                                                break;
                                        }
                                    } else if (number2.equals("#")) {
                                        i24 = R.drawable.achievement_number_rank_bg;
                                    } else {
                                        i24 = R.drawable.achievement_number_bg_0;
                                    }
                                    k2.b bVarY = se.k.y(i24, sVar2, 0);
                                    float f12 = iL2;
                                    float f13 = iL3;
                                    z1.r rVarP = e2.p(oVar2, f12, f13);
                                    z1.j jVar3 = z1.c.f58467e;
                                    z1.r rVarS = g2.f0.s(rVar2.a(rVarP, jVar3), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0.99f, CropImageView.DEFAULT_ASPECT_RATIO, null, 524283);
                                    boolean zF2 = sVar2.f(tVar3);
                                    Object objQ9 = sVar2.Q();
                                    if (zF2) {
                                        f5 = f13;
                                    } else {
                                        f5 = f13;
                                        if (objQ9 == l1.m.f39353a) {
                                        }
                                        z1.r rVarE = d2.h.e(rVarS, (fz.c) objQ9);
                                        w0 w0Var = w2.i.f54517d;
                                        float f14 = f5;
                                        d0.n.c(bVarY, null, rVarE, null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 24624, 104);
                                        number = String.valueOf(cCharAt);
                                        kotlin.jvm.internal.m.f(number, "number");
                                        if (number.hashCode() != 35) {
                                            switch (number) {
                                                case "1":
                                                    i25 = R.drawable.achievement_number_1;
                                                    break;
                                                case "2":
                                                    i25 = R.drawable.achievement_number_2;
                                                    break;
                                                case "3":
                                                    i25 = R.drawable.achievement_number_3;
                                                    break;
                                                case "4":
                                                    i25 = R.drawable.achievement_number_4;
                                                    break;
                                                case "5":
                                                    i25 = R.drawable.achievement_number_5;
                                                    break;
                                                case "6":
                                                    i25 = R.drawable.achievement_number_6;
                                                    break;
                                                case "7":
                                                    i25 = R.drawable.achievement_number_7;
                                                    break;
                                                case "8":
                                                    i25 = R.drawable.achievement_number_8;
                                                    break;
                                                case "9":
                                                    i25 = R.drawable.achievement_number_9;
                                                    break;
                                                default:
                                                    i25 = R.drawable.achievement_number_0;
                                                    break;
                                            }
                                        } else if (number.equals("#")) {
                                            i25 = R.drawable.achievement_number_rank;
                                        } else {
                                            i25 = R.drawable.achievement_number_0;
                                        }
                                        oVar = oVar2;
                                        d0.n.c(se.k.y(i25, sVar2, 0), null, rVar2.a(e2.p(oVar, f12, f14), jVar3), null, w0Var, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 24624, 104);
                                        sVar2.p(true);
                                        i27 = i30 + 1;
                                        z16 = true;
                                        rVar = rVar2;
                                        i28 = i29;
                                        jVar = jVar2;
                                        tVar2 = tVar3;
                                        z17 = false;
                                        qVar = this;
                                    }
                                    objQ9 = new p(tVar3, 1);
                                    sVar2.o0(objQ9);
                                    z1.r rVarE2 = d2.h.e(rVarS, (fz.c) objQ9);
                                    w0 w0Var2 = w2.i.f54517d;
                                    float f15 = f5;
                                    d0.n.c(bVarY, null, rVarE2, null, w0Var2, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 24624, 104);
                                    number = String.valueOf(cCharAt);
                                    kotlin.jvm.internal.m.f(number, "number");
                                    if (number.hashCode() != 35) {
                                        switch (number) {
                                            case 49:
                                                if (number.equals("1")) {
                                                    i25 = R.drawable.achievement_number_1;
                                                } else {
                                                    i25 = R.drawable.achievement_number_0;
                                                }
                                                break;
                                            case 50:
                                                if (number.equals("2")) {
                                                    i25 = R.drawable.achievement_number_2;
                                                } else {
                                                    i25 = R.drawable.achievement_number_0;
                                                }
                                                break;
                                            case 51:
                                                if (number.equals("3")) {
                                                    i25 = R.drawable.achievement_number_3;
                                                } else {
                                                    i25 = R.drawable.achievement_number_0;
                                                }
                                                break;
                                            case 52:
                                                if (number.equals("4")) {
                                                    i25 = R.drawable.achievement_number_4;
                                                } else {
                                                    i25 = R.drawable.achievement_number_0;
                                                }
                                                break;
                                            case 53:
                                                if (number.equals("5")) {
                                                    i25 = R.drawable.achievement_number_5;
                                                } else {
                                                    i25 = R.drawable.achievement_number_0;
                                                }
                                                break;
                                            case 54:
                                                if (number.equals("6")) {
                                                    i25 = R.drawable.achievement_number_6;
                                                } else {
                                                    i25 = R.drawable.achievement_number_0;
                                                }
                                                break;
                                            case 55:
                                                if (number.equals("7")) {
                                                    i25 = R.drawable.achievement_number_7;
                                                } else {
                                                    i25 = R.drawable.achievement_number_0;
                                                }
                                                break;
                                            case 56:
                                                if (number.equals("8")) {
                                                    i25 = R.drawable.achievement_number_8;
                                                } else {
                                                    i25 = R.drawable.achievement_number_0;
                                                }
                                                break;
                                            case 57:
                                                if (number.equals("9")) {
                                                    i25 = R.drawable.achievement_number_0;
                                                } else {
                                                    i25 = R.drawable.achievement_number_9;
                                                }
                                                break;
                                            default:
                                                i25 = R.drawable.achievement_number_0;
                                                break;
                                        }
                                    } else if (number.equals("#")) {
                                        i25 = R.drawable.achievement_number_0;
                                    } else {
                                        i25 = R.drawable.achievement_number_rank;
                                    }
                                    oVar = oVar2;
                                    d0.n.c(se.k.y(i25, sVar2, 0), null, rVar2.a(e2.p(oVar, f12, f15), jVar3), null, w0Var2, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 24624, 104);
                                    sVar2.p(true);
                                    i27 = i30 + 1;
                                    z16 = true;
                                    rVar = rVar2;
                                    i28 = i29;
                                    jVar = jVar2;
                                    tVar2 = tVar3;
                                    z17 = false;
                                    qVar = this;
                                } else {
                                    z15 = z16;
                                    boolean z18 = z17;
                                    sVar2.p(z18);
                                    sVar2.p(z18);
                                }
                            }
                        }
                        sVar2.p(z15);
                    } else {
                        sVar2.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, 56);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new r(z11, achievementSize, i11, i12, i13, list, levelNumber, i14);
        }
    }

    public static final void e(AchievementLanguage achievement, qr.a achievementSize, l1.n nVar, int i11) {
        qr.a aVar;
        int i12;
        int i13;
        List listL;
        kotlin.jvm.internal.m.f(achievement, "achievement");
        kotlin.jvm.internal.m.f(achievementSize, "achievementSize");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-703897636);
        int i14 = (sVar.h(achievement) ? 4 : 2) | i11;
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            if (achievement.isActive() && ry.l.D(new qr.a[]{qr.a.MIDDLE_SMALL, qr.a.BIG}, achievementSize)) {
                switch (rr.a.f49393a[achievement.getLanguage().ordinal()]) {
                    case 1:
                        i12 = R.raw.achievement_language_mal;
                        break;
                    case 2:
                        i12 = R.raw.achievement_language_krup;
                        break;
                    case 3:
                        i12 = R.raw.achievement_language_kr;
                        break;
                    case 4:
                        i12 = R.raw.achievement_language_araup;
                        break;
                    case 5:
                        i12 = R.raw.achievement_language_ara;
                        break;
                    case 6:
                        i12 = R.raw.achievement_language_vt;
                        break;
                    case 7:
                        i12 = R.raw.achievement_language_esocup;
                        break;
                    case 8:
                        i12 = R.raw.achievement_language_esoc;
                        break;
                    case 9:
                        i12 = R.raw.achievement_language_ptocup;
                        break;
                    case 10:
                        i12 = R.raw.achievement_language_ptoc;
                        break;
                    case 11:
                        i12 = R.raw.achievement_language_en;
                        break;
                    case 12:
                        i12 = R.raw.achievement_language_thai;
                        break;
                    case 13:
                        i12 = R.raw.achievement_language_pol;
                        break;
                    case 14:
                        i12 = R.raw.achievement_language_frocup;
                        break;
                    case 15:
                        i12 = R.raw.achievement_language_froc;
                        break;
                    case 16:
                        i12 = R.raw.achievement_language_jpup;
                        break;
                    case 17:
                        i12 = R.raw.achievement_language_jp;
                        break;
                    case 18:
                        i12 = R.raw.achievement_language_frusup;
                        break;
                    case 19:
                        i12 = R.raw.achievement_language_frus;
                        break;
                    case 20:
                        i12 = R.raw.achievement_language_esusup;
                        break;
                    case 21:
                        i12 = R.raw.achievement_language_esus;
                        break;
                    case 22:
                        i12 = R.raw.achievement_language_itocup;
                        break;
                    case 23:
                        i12 = R.raw.achievement_language_itoc;
                        break;
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                        i12 = R.raw.achievement_language_deocup;
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        i12 = R.raw.achievement_language_deoc;
                        break;
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        i12 = R.raw.achievement_language_grk;
                        break;
                    case 27:
                        i12 = R.raw.achievement_language_tur;
                        break;
                    case Service.MONITORING_FIELD_NUMBER /* 28 */:
                        i12 = R.raw.achievement_language_idn;
                        break;
                    case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                        i12 = R.raw.achievement_language_hindi;
                        break;
                    case 30:
                        i12 = R.raw.achievement_language_ruocup;
                        break;
                    case 31:
                        i12 = R.raw.achievement_language_ruoc;
                        break;
                    case Consts.SP /* 32 */:
                        i12 = R.raw.achievement_language_urk;
                        break;
                    case 33:
                        i12 = R.raw.achievement_language_cnup;
                        break;
                    case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                        i12 = R.raw.achievement_language_cn;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            } else {
                i12 = -1;
            }
            int i15 = i12;
            boolean zIsActive = achievement.isActive();
            int iK = v10.c.k(achievement);
            ks.d language = achievement.getLanguage();
            int[] iArr = rr.a.f49393a;
            switch (iArr[language.ordinal()]) {
                case 1:
                    i13 = R.drawable.achievement_language_mal_grey;
                    break;
                case 2:
                    i13 = R.drawable.achievement_language_krup_grey;
                    break;
                case 3:
                    i13 = R.drawable.achievement_language_kr_grey;
                    break;
                case 4:
                    i13 = R.drawable.achievement_language_araup_grey;
                    break;
                case 5:
                    i13 = R.drawable.achievement_language_ara_grey;
                    break;
                case 6:
                    i13 = R.drawable.achievement_language_vt_grey;
                    break;
                case 7:
                    i13 = R.drawable.achievement_language_esocup_grey;
                    break;
                case 8:
                    i13 = R.drawable.achievement_language_esoc_grey;
                    break;
                case 9:
                    i13 = R.drawable.achievement_language_ptocup_grey;
                    break;
                case 10:
                    i13 = R.drawable.achievement_language_ptoc_grey;
                    break;
                case 11:
                    i13 = R.drawable.achievement_language_en_grey;
                    break;
                case 12:
                    i13 = R.drawable.achievement_language_thai_grey;
                    break;
                case 13:
                    i13 = R.drawable.achievement_language_pol_grey;
                    break;
                case 14:
                    i13 = R.drawable.achievement_language_frocup_grey;
                    break;
                case 15:
                    i13 = R.drawable.achievement_language_froc_grey;
                    break;
                case 16:
                    i13 = R.drawable.achievement_language_jpup_grey;
                    break;
                case 17:
                    i13 = R.drawable.achievement_language_jp_grey;
                    break;
                case 18:
                    i13 = R.drawable.achievement_language_frusup_grey;
                    break;
                case 19:
                    i13 = R.drawable.achievement_language_frus_grey;
                    break;
                case 20:
                    i13 = R.drawable.achievement_language_esusup_grey;
                    break;
                case 21:
                    i13 = R.drawable.achievement_language_esus_grey;
                    break;
                case 22:
                    i13 = R.drawable.achievement_language_itocup_grey;
                    break;
                case 23:
                    i13 = R.drawable.achievement_language_itoc_grey;
                    break;
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                    i13 = R.drawable.achievement_language_deocup_grey;
                    break;
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                    i13 = R.drawable.achievement_language_deoc_grey;
                    break;
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    i13 = R.drawable.achievement_language_grk_grey;
                    break;
                case 27:
                    i13 = R.drawable.achievement_language_tur_grey;
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                    i13 = R.drawable.achievement_language_idn_grey;
                    break;
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    i13 = R.drawable.achievement_language_hindi_grey;
                    break;
                case 30:
                    i13 = R.drawable.achievement_language_ruocup_grey;
                    break;
                case 31:
                    i13 = R.drawable.achievement_language_ruoc_grey;
                    break;
                case Consts.SP /* 32 */:
                    i13 = R.drawable.achievement_language_ukr_grey;
                    break;
                case 33:
                    i13 = R.drawable.achievement_language_cnup_grey;
                    break;
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    i13 = R.drawable.achievement_language_cn_grey;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            int i16 = i13;
            switch (iArr[achievement.getLanguage().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 18:
                case 19:
                case Service.BILLING_FIELD_NUMBER /* 26 */:
                    listL = ns.o.L(new g2.x(g2.f0.e(4287407355L)), new g2.x(g2.f0.e(4287407355L)));
                    break;
                case 4:
                case 5:
                case 9:
                case 10:
                case 11:
                case 27:
                case Service.SYSTEM_PARAMETERS_FIELD_NUMBER /* 29 */:
                    listL = ns.o.L(new g2.x(g2.f0.e(4288862122L)), new g2.x(g2.f0.e(4288862122L)));
                    break;
                case 6:
                case 7:
                case 8:
                case 12:
                case 14:
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                case Service.METRICS_FIELD_NUMBER /* 24 */:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case Consts.SP /* 32 */:
                    listL = ns.o.L(new g2.x(g2.f0.e(4293635198L)), new g2.x(g2.f0.e(4293635198L)));
                    break;
                case 13:
                case 16:
                case 17:
                case 30:
                case 31:
                    listL = ns.o.L(new g2.x(g2.f0.e(4293957007L)), new g2.x(g2.f0.e(4293957007L)));
                    break;
                case Service.MONITORING_FIELD_NUMBER /* 28 */:
                case 33:
                case DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER /* 34 */:
                    listL = ns.o.L(new g2.x(g2.f0.e(4290096127L)), new g2.x(g2.f0.e(4290096127L)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            aVar = achievementSize;
            d(zIsActive, aVar, iK, i16, i15, listL, BuildConfig.VERSION_NAME, sVar, 102260784);
        } else {
            aVar = achievementSize;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(achievement, i11, 26, aVar);
        }
    }

    public static final void g(AchievementLanguage achievementLanguage, g0 g0Var, l1.n nVar, int i11) {
        g0 g0Var2;
        kotlin.jvm.internal.m.f(achievementLanguage, "achievementLanguage");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(115113722);
        int i12 = (sVar.h(achievementLanguage) ? 4 : 2) | i11 | (sVar.h(g0Var) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = p3.A(v10.c.s(achievementLanguage));
                sVar.o0(objQ);
            }
            g0Var2 = g0Var;
            r((g2.t) objQ, v10.c.k(achievementLanguage), BuildConfig.VERSION_NAME, v10.c.s(achievementLanguage), BuildConfig.VERSION_NAME, tv.a.m(achievementLanguage.getLanguage(), sVar), g0Var2, sVar, ((i12 << 15) & 3670016) | 24966);
        } else {
            g0Var2 = g0Var;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(achievementLanguage, i11, 2, g0Var2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:65:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x0110  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void h(AchievementLeaderBoard achievementLeaderBoard, qr.a achievementSize, l1.n nVar, int i11) {
        qr.a aVar;
        int i12;
        int i13;
        String strValueOf;
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "achievementLeaderBoard");
        kotlin.jvm.internal.m.f(achievementSize, "achievementSize");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1897577370);
        int i14 = (sVar.h(achievementLeaderBoard) ? 4 : 2) | i11;
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            if (achievementLeaderBoard.isActive() && ry.l.D(new qr.a[]{qr.a.MIDDLE_SMALL, qr.a.BIG}, achievementSize)) {
                String id2 = achievementLeaderBoard.getId();
                switch (id2.hashCode()) {
                    case 2020897257:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                            i12 = R.raw.achievement_leaderboard_level_a;
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897258:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                            i12 = R.raw.achievement_leaderboard_level_b;
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897259:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                            i12 = R.raw.achievement_leaderboard_level_c;
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897260:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                            i12 = R.raw.achievement_leaderboard_level_d;
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897261:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                            i12 = R.raw.achievement_leaderboard_level_e;
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897262:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                            i12 = R.raw.achievement_leaderboard_level_f;
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    default:
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                }
            }
            i12 = -1;
            boolean zIsActive = achievementLeaderBoard.isActive();
            int iJ = vc.a.j(achievementLeaderBoard);
            String id3 = achievementLeaderBoard.getId();
            switch (id3.hashCode()) {
                case 2020897257:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                        i13 = R.drawable.achievement_leaderboard_level_a_grey;
                        int i15 = i13;
                        List listO = vc.a.o(achievementLeaderBoard);
                        if (achievementLeaderBoard.getCount() > 0) {
                            strValueOf = String.valueOf(achievementLeaderBoard.getCount());
                        } else {
                            strValueOf = BuildConfig.VERSION_NAME;
                        }
                        aVar = achievementSize;
                        d(zIsActive, aVar, iJ, i15, i12, listO, strValueOf, sVar, 1597488);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897258:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                        i13 = R.drawable.achievement_leaderboard_level_b_grey;
                        int i16 = i13;
                        List listO2 = vc.a.o(achievementLeaderBoard);
                        if (achievementLeaderBoard.getCount() > 0) {
                            strValueOf = String.valueOf(achievementLeaderBoard.getCount());
                        } else {
                            strValueOf = BuildConfig.VERSION_NAME;
                        }
                        aVar = achievementSize;
                        d(zIsActive, aVar, iJ, i16, i12, listO2, strValueOf, sVar, 1597488);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897259:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                        i13 = R.drawable.achievement_leaderboard_level_c_grey;
                        int i17 = i13;
                        List listO3 = vc.a.o(achievementLeaderBoard);
                        if (achievementLeaderBoard.getCount() > 0) {
                            strValueOf = String.valueOf(achievementLeaderBoard.getCount());
                        } else {
                            strValueOf = BuildConfig.VERSION_NAME;
                        }
                        aVar = achievementSize;
                        d(zIsActive, aVar, iJ, i17, i12, listO3, strValueOf, sVar, 1597488);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897260:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                        i13 = R.drawable.achievement_leaderboard_level_d_grey;
                        int i18 = i13;
                        List listO4 = vc.a.o(achievementLeaderBoard);
                        if (achievementLeaderBoard.getCount() > 0) {
                            strValueOf = String.valueOf(achievementLeaderBoard.getCount());
                        } else {
                            strValueOf = BuildConfig.VERSION_NAME;
                        }
                        aVar = achievementSize;
                        d(zIsActive, aVar, iJ, i18, i12, listO4, strValueOf, sVar, 1597488);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897261:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                        i13 = R.drawable.achievement_leaderboard_level_e_grey;
                        int i19 = i13;
                        List listO5 = vc.a.o(achievementLeaderBoard);
                        if (achievementLeaderBoard.getCount() > 0) {
                            strValueOf = String.valueOf(achievementLeaderBoard.getCount());
                        } else {
                            strValueOf = BuildConfig.VERSION_NAME;
                        }
                        aVar = achievementSize;
                        d(zIsActive, aVar, iJ, i19, i12, listO5, strValueOf, sVar, 1597488);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897262:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                        i13 = R.drawable.achievement_leaderboard_level_f_grey;
                        int i110 = i13;
                        List listO6 = vc.a.o(achievementLeaderBoard);
                        if (achievementLeaderBoard.getCount() > 0) {
                            strValueOf = String.valueOf(achievementLeaderBoard.getCount());
                        } else {
                            strValueOf = BuildConfig.VERSION_NAME;
                        }
                        aVar = achievementSize;
                        d(zIsActive, aVar, iJ, i110, i12, listO6, strValueOf, sVar, 1597488);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                default:
                    throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
            }
        }
        aVar = achievementSize;
        sVar.W();
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(achievementLeaderBoard, i11, 28, aVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [l1.n, l1.s] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [a20.a, b20.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v14 */
    public static final void i(AchievementLeaderBoard achievementLeaderBoard, fz.a onBackClick, fz.f shareImage, fz.c shareMore, l1.n nVar, int i11) {
        Object obj;
        ?? r9;
        String strQ0;
        ?? r11;
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "achievementLeaderBoard");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(shareImage, "shareImage");
        kotlin.jvm.internal.m.f(shareMore, "shareMore");
        ?? r12 = (l1.s) nVar;
        r12.f0(-1881927817);
        int i12 = i11 | (r12.h(achievementLeaderBoard) ? 4 : 2) | (r12.h(onBackClick) ? 32 : 16) | (r12.h(shareImage) ? 256 : 128) | (r12.h(shareMore) ? 2048 : 1024);
        if (r12.T(i12 & 1, (i12 & 1171) != 1170)) {
            Context context = (Context) r12.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ = r12.Q();
            Object obj2 = l1.m.f39353a;
            if (objQ == obj2) {
                objQ = l1.t.q(r12);
                r12.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = r12.Q();
            if (objQ2 == obj2) {
                objQ2 = l1.t.B(Boolean.FALSE);
                r12.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(r12.T);
            q1 q1VarL = r12.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(r12, oVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            r12.h0();
            if (r12.S) {
                r12.k(iVar);
            } else {
                r12.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, r12);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, r12);
            y2.h hVar3 = y2.j.f56918g;
            if (r12.S || !kotlin.jvm.internal.m.a(r12.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, r12, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, r12);
            j0.d(achievementLeaderBoard.isActive(), null, f1.e(null, 3), f1.f(null, 3), null, t1.e.d(-248954027, new a00.b(achievementLeaderBoard, 29), r12), r12, 200064, 18);
            z1.r rVarD = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, r12, 48);
            int iHashCode2 = Long.hashCode(r12.T);
            q1 q1VarL2 = r12.l();
            z1.r rVarC2 = z1.a.c(r12, rVarD);
            r12.h0();
            if (r12.S) {
                r12.k(iVar);
            } else {
                r12.r0();
            }
            l1.t.J(hVar, uVarA, r12);
            l1.t.J(hVar2, q1VarL2, r12);
            if (r12.S || !kotlin.jvm.internal.m.a(r12.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, r12, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, r12);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, r12, 0);
            int iHashCode3 = Long.hashCode(r12.T);
            q1 q1VarL3 = r12.l();
            z1.r rVarC3 = z1.a.c(r12, oVar);
            r12.h0();
            if (r12.S) {
                r12.k(iVar);
            } else {
                r12.r0();
            }
            l1.t.J(hVar, a2VarA, r12);
            l1.t.J(hVar2, q1VarL3, r12);
            if (r12.S || !kotlin.jvm.internal.m.a(r12.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, r12, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, r12);
            k7.h(onBackClick, null, false, null, f47035e, r12, ((i12 >> 3) & 14) | 196608, 30);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(r12, new i1(1.0f, true));
            if (achievementLeaderBoard.isActive()) {
                r12.d0(-1595083517);
                Object objQ3 = r12.Q();
                if (objQ3 == obj2) {
                    objQ3 = new n4(28, b1Var);
                    r12.o0(objQ3);
                }
                obj = obj2;
                k7.h((fz.a) objQ3, null, false, null, f47036f, r12, 196614, 30);
                r9 = 0;
            } else {
                obj = obj2;
                r9 = 0;
                r12.d0(-1599081525);
            }
            r12.p(r9);
            r12.p(true);
            j0.c.g(r12, e2.g(oVar, 32));
            h(achievementLeaderBoard, qr.a.BIG, r12, (i12 & 14) | 48);
            float f5 = 52;
            j0.c.g(r12, e2.g(oVar, f5));
            r12.d0(931604073);
            if (achievementLeaderBoard.isActive()) {
                r12.d0(135852927);
                strQ0 = oz.x.q0(oz.x.q0(ub.a.e0(r12, R.string.leaderboard_top3_active_desc), "%lv", vc.a.p(achievementLeaderBoard, r12)), "%s", String.valueOf(achievementLeaderBoard.getCount()));
                r12.p(r9);
            } else {
                r12.d0(135940037);
                strQ0 = oz.x.q0(ub.a.e0(r12, R.string.leaderboard_top3_desc), "%lv", vc.a.p(achievementLeaderBoard, r12));
                r12.p(r9);
            }
            r12.p(r9);
            l1.d0 d0Var = ua.f31167a;
            ua.b(strQ0, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) r12.j(d0Var), 0L, j3.A(20), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), r12, 48, 0, 65532);
            if (!achievementLeaderBoard.isActive() || achievementLeaderBoard.getEarnDate().length() <= 0) {
                r12.d0(-1189769393);
            } else {
                r12.d0(-1184405773);
                z1.r rVarA = d2.h.a(j0.c.B(d0.n.h(j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((g2.x) vc.a.n(achievementLeaderBoard).get(r9)).f28624a, r0.f.a()), 8, 2), 0.8f);
                q0 q0VarD2 = j0.o.d(jVar, r9);
                int iHashCode4 = Long.hashCode(r12.T);
                q1 q1VarL4 = r12.l();
                z1.r rVarC4 = z1.a.c(r12, rVarA);
                r12.h0();
                if (r12.S) {
                    r12.k(iVar);
                } else {
                    r12.r0();
                }
                l1.t.J(hVar, q0VarD2, r12);
                l1.t.J(hVar2, q1VarL4, r12);
                if (r12.S || !kotlin.jvm.internal.m.a(r12.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, r12, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC4, r12);
                ua.b(achievementLeaderBoard.getEarnDate(), j0.r.f35391a.a(oVar, z1.c.f58467e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) r12.j(d0Var), g2.x.f28618e, j3.A(12), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), r12, 0, 0, 65532);
                r12.p(true);
            }
            r12.p(r9);
            r12.p(true);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                r12.d0(1826398658);
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                Object objQ4 = r12.Q();
                Object obj3 = obj;
                if (objQ4 == obj3) {
                    r11 = 0;
                    r12.o0(null);
                    objQ4 = null;
                } else {
                    r11 = 0;
                }
                yVar.f38361a = (Uri) objQ4;
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                Object objQ5 = r12.Q();
                ?? r13 = objQ5;
                if (objQ5 == obj3) {
                    r12.o0(r11);
                    r13 = r11;
                }
                yVar2.f38361a = (Bitmap) r13;
                e20.a aVarC = w4.c.c(r12, -1168520582, r12, -1633490746);
                boolean zF = r12.f(r11) | r12.f(aVarC);
                Object objQ6 = r12.Q();
                if (zF || objQ6 == obj3) {
                    objQ6 = w4.c.e(ur.a.class, aVarC, r11, r11, r12);
                }
                r12.p(r9);
                r12.p(r9);
                ur.a aVar = (ur.a) objQ6;
                tv.j.b(b1Var, new v1(yVar, shareImage, b0Var, achievementLeaderBoard, aVar, 13), new bp.x1(yVar, shareMore, b0Var, achievementLeaderBoard, aVar, 9), new bp.x1(yVar2, b0Var, context, achievementLeaderBoard, aVar, 10), t1.e.d(-1126142060, new k6(achievementLeaderBoard, yVar2, yVar, 9), r12), r12, 24582);
            } else {
                r12.d0(1820006117);
            }
            r12.p(r9);
            r12.p(true);
        } else {
            r12.W();
        }
        x1 x1VarT = r12.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(achievementLeaderBoard, onBackClick, shareImage, shareMore, i11, 1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final void j(AchievementLeaderBoard achievementLeaderBoard, g0 g0Var, l1.n nVar, int i11) {
        int count;
        String str;
        List listL;
        kotlin.jvm.internal.m.f(achievementLeaderBoard, "achievementLeaderBoard");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1123620086);
        int i12 = (sVar.h(achievementLeaderBoard) ? 4 : 2) | i11 | (sVar.h(g0Var) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                String id2 = achievementLeaderBoard.getId();
                switch (id2.hashCode()) {
                    case 2020897257:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                            listL = ns.o.L(new g2.x(g2.f0.e(4289237247L)), new g2.x(g2.f0.e(4286533375L)));
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897258:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                            listL = ns.o.L(new g2.x(g2.f0.e(4287682559L)), new g2.x(g2.f0.e(4278416082L)));
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897259:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                            listL = ns.o.L(new g2.x(g2.f0.e(4287406847L)), new g2.x(g2.f0.e(4281361140L)));
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897260:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                            listL = ns.o.L(new g2.x(g2.f0.e(4294950028L)), new g2.x(g2.f0.e(4288429357L)));
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897261:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                            listL = ns.o.L(new g2.x(g2.f0.e(4294944930L)), new g2.x(g2.f0.e(4292757310L)));
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    case 2020897262:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                            listL = ns.o.L(new g2.x(g2.f0.e(4294954914L)), new g2.x(g2.f0.e(4294277147L)));
                            break;
                        }
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                    default:
                        throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementLeaderBoard.getId()));
                }
                objQ = p3.A(listL);
                sVar.o0(objQ);
            }
            g2.t tVar = (g2.t) objQ;
            String strValueOf = String.valueOf(achievementLeaderBoard.getCount());
            int iJ = vc.a.j(achievementLeaderBoard);
            List listO = vc.a.o(achievementLeaderBoard);
            String id3 = achievementLeaderBoard.getId();
            switch (id3.hashCode()) {
                case 2020897257:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                        count = achievementLeaderBoard.getCount();
                        str = "I'm successfully made it into the top three of the Fox League ";
                        r(tVar, iJ, strValueOf, listO, BuildConfig.VERSION_NAME, p0.h(count, str, " times!"), g0Var, sVar, ((i12 << 15) & 3670016) | 24582);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("Wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897258:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                        count = achievementLeaderBoard.getCount();
                        str = "I'm successfully made it into the top three of the ELK League ";
                        r(tVar, iJ, strValueOf, listO, BuildConfig.VERSION_NAME, p0.h(count, str, " times!"), g0Var, sVar, ((i12 << 15) & 3670016) | 24582);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("Wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897259:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                        count = achievementLeaderBoard.getCount();
                        str = "I'm successfully made it into the top three of the HAWK League ";
                        r(tVar, iJ, strValueOf, listO, BuildConfig.VERSION_NAME, p0.h(count, str, " times!"), g0Var, sVar, ((i12 << 15) & 3670016) | 24582);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("Wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897260:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                        count = achievementLeaderBoard.getCount();
                        str = "I'm successfully made it into the top three of the WOLF League ";
                        r(tVar, iJ, strValueOf, listO, BuildConfig.VERSION_NAME, p0.h(count, str, " times!"), g0Var, sVar, ((i12 << 15) & 3670016) | 24582);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("Wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897261:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                        count = achievementLeaderBoard.getCount();
                        str = "I'm successfully made it into the top three of the BEAR League ";
                        r(tVar, iJ, strValueOf, listO, BuildConfig.VERSION_NAME, p0.h(count, str, " times!"), g0Var, sVar, ((i12 << 15) & 3670016) | 24582);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("Wrong achievement type: ", achievementLeaderBoard.getId()));
                case 2020897262:
                    if (id3.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                        count = achievementLeaderBoard.getCount();
                        str = "I'm successfully made it into the top three of the DRAGON League ";
                        r(tVar, iJ, strValueOf, listO, BuildConfig.VERSION_NAME, p0.h(count, str, " times!"), g0Var, sVar, ((i12 << 15) & 3670016) | 24582);
                        break;
                    }
                    throw new IllegalArgumentException(ep.a.e("Wrong achievement type: ", achievementLeaderBoard.getId()));
                default:
                    throw new IllegalArgumentException(ep.a.e("Wrong achievement type: ", achievementLeaderBoard.getId()));
            }
        }
        sVar.W();
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(achievementLeaderBoard, i11, 0, g0Var);
        }
    }

    public static final void k(o0.t tVar, t1.d dVar, l1.n nVar, int i11) {
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-580893303);
        int i12 = i11 | (sVar.f(tVar) ? 4 : 2);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            v3.c cVar = (v3.c) sVar.j(g1.f58547h);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(new v3.f(0));
                sVar.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            float f5 = ((v3.f) b1Var.getValue()).f53489a;
            float f11 = 42;
            j0.v1 v1Var = new j0.v1(f5, f11, f5, f11);
            z1.r rVarE = e2.e(z1.o.f58481a, 1.0f);
            boolean zF = sVar.f(cVar);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = new d1(cVar, b1Var, 3);
                sVar.o0(objQ2);
            }
            ve.i.d(tVar, w2.a0.m(rVarE, (fz.c) objQ2), v1Var, null, CropImageView.DEFAULT_ASPECT_RATIO, null, null, false, null, null, null, t1.e.d(-684214454, new b3(dVar, 1), sVar), sVar, i12 & 14, 16376);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(tVar, i11, 25, dVar);
        }
    }

    public static final void l(List achievements, List achievementLeaderBoards, ArrayList arrayList, boolean z11, fz.c onItemClick, fz.c onRecordItemClick, fz.c onLeaderBoardItemClick, fz.c onLanguageItemClick, fz.c onAllLanguageAchievementsClick, l1.n nVar, int i11) {
        int i12;
        boolean z12;
        l1.s sVar;
        kotlin.jvm.internal.m.f(achievements, "achievements");
        kotlin.jvm.internal.m.f(achievementLeaderBoards, "achievementLeaderBoards");
        kotlin.jvm.internal.m.f(onItemClick, "onItemClick");
        kotlin.jvm.internal.m.f(onRecordItemClick, "onRecordItemClick");
        kotlin.jvm.internal.m.f(onLeaderBoardItemClick, "onLeaderBoardItemClick");
        kotlin.jvm.internal.m.f(onLanguageItemClick, "onLanguageItemClick");
        kotlin.jvm.internal.m.f(onAllLanguageAchievementsClick, "onAllLanguageAchievementsClick");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1920430360);
        int i13 = i11 & 6;
        ry.r rVar = ry.r.f50854a;
        if (i13 == 0) {
            i12 = (sVar2.h(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(achievements) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(achievementLeaderBoards) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(arrayList) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            z12 = z11;
            i12 |= sVar2.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        } else {
            z12 = z11;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onItemClick) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onLeaderBoardItemClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar2.h(onLanguageItemClick) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar2.h(onAllLanguageAchievementsClick) ? 536870912 : 268435456;
        }
        if (sVar2.T(i12 & 1, (306259091 & i12) != 306259090)) {
            m0.b bVar = new m0.b(3);
            j0.g gVarG = j0.i.g(19);
            int i14 = i12;
            float f5 = 24;
            float f11 = 16;
            j0.v1 v1Var = new j0.v1(f11, f5, f11, f5);
            boolean zH = sVar2.h(rVar) | sVar2.h(achievements) | ((i14 & 458752) == 131072) | sVar2.h(arrayList) | ((i14 & 57344) == 16384) | ((i14 & 1879048192) == 536870912) | ((i14 & 234881024) == 67108864) | sVar2.h(achievementLeaderBoards) | ((i14 & 29360128) == 8388608);
            Object objQ = sVar2.Q();
            if (zH || objQ == l1.m.f39353a) {
                f2 f2Var = new f2(achievements, arrayList, achievementLeaderBoards, onItemClick, z12, onAllLanguageAchievementsClick, onLanguageItemClick, onLeaderBoardItemClick);
                sVar2.o0(f2Var);
                objQ = f2Var;
            }
            sVar = sVar2;
            md.a.a(bVar, null, null, v1Var, gVarG, null, null, false, null, (fz.c) objQ, sVar, 196608, 982);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l2(achievements, achievementLeaderBoards, arrayList, z11, onItemClick, onRecordItemClick, onLeaderBoardItemClick, onLanguageItemClick, onAllLanguageAchievementsClick, i11);
        }
    }

    public static final void m(AchievementRecord achievementRecord, qr.a achievementSize, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(achievementRecord, "achievementRecord");
        kotlin.jvm.internal.m.f(achievementSize, "achievementSize");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-575035350);
        int i12 = (sVar.h(achievementRecord) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            android.support.v4.media.session.a.s(achievementRecord);
            throw null;
        }
        sVar.W();
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new k9.p(achievementRecord, i11, 27, achievementSize);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x01a6  */
    public static final void o(AchievementRecord achievementRecord, g0 g0Var, l1.n nVar, int i11) {
        List listL;
        kotlin.jvm.internal.m.f(achievementRecord, "achievementRecord");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(697650778);
        int i12 = (sVar.h(achievementRecord) ? 4 : 2) | i11 | (sVar.h(g0Var) ? 32 : 16);
        if (!sVar.T(i12 & 1, (i12 & 19) != 18)) {
            sVar.W();
            x1 x1VarT = sVar.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new y(achievementRecord, i11, 1, g0Var);
                return;
            }
            return;
        }
        Object objQ = sVar.Q();
        if (objQ == l1.m.f39353a) {
            String id2 = achievementRecord.getId();
            int iHashCode = id2.hashCode();
            if (iHashCode == -1706072195) {
                if (id2.equals(AchievementRecordType.LEADERBOARD)) {
                    listL = ns.o.L(new g2.x(g2.f0.e(4289360383L)), new g2.x(g2.f0.e(4289360383L)));
                    objQ = p3.A(listL);
                    sVar.o0(objQ);
                }
                throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementRecord.getId()));
            }
            if (iHashCode == -739364438) {
                if (id2.equals(AchievementRecordType.PERFECT_LESSON)) {
                    listL = ns.o.L(new g2.x(g2.f0.e(4293294616L)), new g2.x(g2.f0.e(4293294616L)));
                    objQ = p3.A(listL);
                    sVar.o0(objQ);
                }
                throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementRecord.getId()));
            }
            if (iHashCode == 3832 && id2.equals("xp")) {
                listL = ns.o.L(new g2.x(g2.f0.e(4280455643L)), new g2.x(g2.f0.e(4278535631L)));
                objQ = p3.A(listL);
                sVar.o0(objQ);
            }
            throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievementRecord.getId()));
        }
        if (kotlin.jvm.internal.m.a(achievementRecord.getId(), AchievementRecordType.LEADERBOARD)) {
            achievementRecord.getRecord();
        } else {
            String.valueOf(achievementRecord.getRecord());
        }
        if (kotlin.jvm.internal.m.a(achievementRecord.getId(), AchievementRecordType.LEADERBOARD)) {
            sVar.d0(368129020);
            switch (achievementRecord.getClassName()) {
                case "ClassA":
                    sVar.d0(427518943);
                    ub.a.e0(sVar, R.string.class_a);
                    sVar.p(false);
                    break;
                case "ClassB":
                    sVar.d0(427520927);
                    ub.a.e0(sVar, R.string.class_b);
                    sVar.p(false);
                    break;
                case "ClassC":
                    sVar.d0(427522911);
                    ub.a.e0(sVar, R.string.class_c);
                    sVar.p(false);
                    break;
                case "ClassD":
                    sVar.d0(427524895);
                    ub.a.e0(sVar, R.string.class_d);
                    sVar.p(false);
                    break;
                case "ClassE":
                    sVar.d0(427526879);
                    ub.a.e0(sVar, R.string.class_e);
                    sVar.p(false);
                    break;
                case "ClassF":
                    sVar.d0(427528863);
                    ub.a.e0(sVar, R.string.class_f);
                    sVar.p(false);
                    break;
                default:
                    sVar.d0(427530719);
                    ub.a.e0(sVar, R.string.class_a);
                    sVar.p(false);
                    break;
            }
            sVar.p(false);
        } else {
            sVar.d0(368609179);
            sVar.p(false);
            String.valueOf(achievementRecord.getRecord());
        }
        android.support.v4.media.session.a.s(achievementRecord);
        throw null;
    }

    public static final void p(int i11, int i12, l1.n nVar, z1.r modifier) {
        int i13;
        z1.r rVar;
        kotlin.jvm.internal.m.f(modifier, "modifier");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-262366508);
        int i14 = (sVar.d(i11) ? 4 : 2) | i12 | (sVar.f(modifier) ? 32 : 16);
        if (sVar.T(i14 & 1, (i14 & 19) != 18)) {
            Object objQ = sVar.Q();
            if (objQ == l1.m.f39353a) {
                objQ = new ot.f2(4);
                sVar.o0(objQ);
            }
            i13 = i11;
            rVar = modifier;
            tv.g.a(rVar, i13, null, null, false, (fz.c) objQ, sVar, ((i14 >> 3) & 14) | 1572864 | ((i14 << 3) & 112), 60);
        } else {
            i13 = i11;
            rVar = modifier;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c3(i13, rVar, i12, 4);
        }
    }

    public static final void r(g2.t brush, int i11, String levelNumberText, List list, String title, String subTitle, fz.e eVar, l1.n nVar, int i12) {
        int i13;
        int i14;
        fz.e eVar2;
        l1.s sVar;
        kotlin.jvm.internal.m.f(brush, "brush");
        kotlin.jvm.internal.m.f(levelNumberText, "levelNumberText");
        kotlin.jvm.internal.m.f(title, "title");
        kotlin.jvm.internal.m.f(subTitle, "subTitle");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(2052962463);
        if ((i12 & 6) == 0) {
            i13 = (sVar2.f(brush) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 = i11;
            i13 |= sVar2.d(i14) ? 32 : 16;
        } else {
            i14 = i11;
        }
        if ((i12 & 384) == 0) {
            i13 |= sVar2.f(levelNumberText) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar2.h(list) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar2.f(title) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i13 |= sVar2.f(subTitle) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i12) == 0) {
            eVar2 = eVar;
            i13 |= sVar2.h(eVar2) ? 1048576 : 524288;
        } else {
            eVar2 = eVar;
        }
        if (sVar2.T(i13 & 1, (i13 & 599187) != 599186)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            boolean zH = ((i13 & 14) == 4) | ((i13 & 112) == 32) | sVar2.h(list) | ((i13 & 896) == 256) | ((57344 & i13) == 16384) | ((458752 & i13) == 131072) | sVar2.h(b0Var) | ((i13 & 3670016) == 1048576);
            Object objQ2 = sVar2.Q();
            if (zH || objQ2 == gVar) {
                g2 g2Var = new g2(brush, i14, list, levelNumberText, title, subTitle, b0Var, eVar2);
                sVar2.o0(g2Var);
                objQ2 = g2Var;
            }
            sVar = sVar2;
            y3.h.b((fz.c) objQ2, e2.p(z1.o.f58481a, 320, 350), null, sVar, 48, 4);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b0(brush, i11, levelNumberText, list, title, subTitle, eVar, i12);
        }
    }

    public static final void s(AchievementLevel achievement, fz.a onDismissRequest, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(achievement, "achievement");
        kotlin.jvm.internal.m.f(onDismissRequest, "onDismissRequest");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1885811114);
        int i12 = (sVar.h(achievement) ? 4 : 2) | i11;
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(ur.a.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            ur.a aVar = (ur.a) objQ;
            boolean zH = sVar.h(aVar) | sVar.h(achievement);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new n(aVar, achievement, (vy.d) null, 2);
                sVar.o0(objQ2);
            }
            l1.t.f((fz.e) objQ2, achievement, sVar);
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = new okhttp3.b(2, onDismissRequest);
                sVar.o0(objQ3);
            }
            androidx.compose.ui.window.a.a((fz.a) objQ3, new z3.r(3), t1.e.d(-963295123, new c0(achievement, onDismissRequest), sVar), sVar, 432, 0);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c0(achievement, onDismissRequest, i11, 1);
        }
    }

    public static final void t(final AchievementLevel achievementLevel, fz.a aVar, l1.n nVar, int i11) {
        l1.s sVar;
        fz.a aVar2 = aVar;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(84634037);
        int i12 = (sVar2.h(achievementLevel) ? 4 : 2) | i11 | (sVar2.h(aVar2) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            boolean zF = sVar2.f(achievementLevel);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ);
            }
            b1 b1Var = (b1) objQ;
            boolean zF2 = sVar2.f(achievementLevel);
            Object objQ2 = sVar2.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            b1 b1Var2 = (b1) objQ2;
            boolean zF3 = sVar2.f(b1Var) | sVar2.f(b1Var2);
            Object objQ3 = sVar2.Q();
            vy.d dVar = null;
            if (zF3 || objQ3 == gVar) {
                objQ3 = new fu.y(b1Var, b1Var2, dVar, 6);
                sVar2.o0(objQ3);
            }
            l1.t.f((fz.e) objQ3, achievementLevel, sVar2);
            z1.o oVar = z1.o.f58481a;
            float f5 = 14;
            z1.r rVarB = d2.h.b(d0.n.h(e2.g(e2.e(j0.c.C(oVar, 22, CropImageView.DEFAULT_ASPECT_RATIO, 2), 1.0f), 410), ((s1) sVar2.j(h1.v1.f31180a)).f31033p, r0.f.d(f5)), r0.f.d(f5));
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarB);
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
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            final int i13 = 0;
            j0.d(((Boolean) b1Var.getValue()).booleanValue(), null, f1.e(null, 3), null, BuildConfig.VERSION_NAME, t1.e.d(900385815, new fz.f() { // from class: pr.d0
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i13) {
                        case 0:
                            k0 AnimatedVisibility = (k0) obj;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                            z1.r rVarG = e2.g(e2.e(z1.o.f58481a, 1.0f), 210);
                            l1.s sVar3 = (l1.s) ((l1.n) obj2);
                            AchievementLevel achievementLevel2 = achievementLevel;
                            boolean zH = sVar3.h(achievementLevel2);
                            Object objQ4 = sVar3.Q();
                            if (zH || objQ4 == l1.m.f39353a) {
                                objQ4 = new x(achievementLevel2, 0);
                                sVar3.o0(objQ4);
                            }
                            d0.n.b(6, (fz.c) objQ4, sVar3, rVarG);
                            break;
                        case 1:
                            k0 AnimatedVisibility2 = (k0) obj;
                            ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                            f0.a(achievementLevel, qr.a.MIDDLE_SMALL, (l1.n) obj2, 48);
                            break;
                        default:
                            k0 AnimatedVisibility3 = (k0) obj;
                            l1.n nVar2 = (l1.n) obj2;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.f(AnimatedVisibility3, "$this$AnimatedVisibility");
                            AchievementLevel achievementLevel3 = achievementLevel;
                            String strQ0 = oz.x.q0(ve.i.w(achievementLevel3, nVar2), "%s", f0.w(achievementLevel3));
                            l1.s sVar4 = (l1.s) nVar2;
                            float f11 = 52;
                            ua.b(strQ0, j0.c.E(z1.o.f58481a, f11, 36, f11, CropImageView.DEFAULT_ASPECT_RATIO, 8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), 0L, j3.A(18), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar4, 0, 0, 65532);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar2, 221568, 10);
            z1.r rVarD = e2.d(oVar, 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarD);
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
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar2, 0);
            int iHashCode3 = Long.hashCode(sVar2.T);
            q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar2);
            aVar2 = aVar;
            k7.h(aVar2, null, false, null, f47040j, sVar2, ((i12 >> 3) & 14) | 196608, 30);
            sVar2.p(true);
            boolean zBooleanValue = ((Boolean) b1Var.getValue()).booleanValue();
            l1 l1VarA = f1.e(null, 3).a(f1.g(null, 0.8f, 5));
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = new ot.f2(7);
                sVar2.o0(objQ4);
            }
            l1 l1VarA2 = l1VarA.a(f1.r((fz.c) objQ4, 1));
            final int i14 = 1;
            j0.c(zBooleanValue, null, l1VarA2, null, BuildConfig.VERSION_NAME, t1.e.d(808211553, new fz.f() { // from class: pr.d0
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i14) {
                        case 0:
                            k0 AnimatedVisibility = (k0) obj;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                            z1.r rVarG = e2.g(e2.e(z1.o.f58481a, 1.0f), 210);
                            l1.s sVar3 = (l1.s) ((l1.n) obj2);
                            AchievementLevel achievementLevel2 = achievementLevel;
                            boolean zH = sVar3.h(achievementLevel2);
                            Object objQ5 = sVar3.Q();
                            if (zH || objQ5 == l1.m.f39353a) {
                                objQ5 = new x(achievementLevel2, 0);
                                sVar3.o0(objQ5);
                            }
                            d0.n.b(6, (fz.c) objQ5, sVar3, rVarG);
                            break;
                        case 1:
                            k0 AnimatedVisibility2 = (k0) obj;
                            ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                            f0.a(achievementLevel, qr.a.MIDDLE_SMALL, (l1.n) obj2, 48);
                            break;
                        default:
                            k0 AnimatedVisibility3 = (k0) obj;
                            l1.n nVar2 = (l1.n) obj2;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.f(AnimatedVisibility3, "$this$AnimatedVisibility");
                            AchievementLevel achievementLevel3 = achievementLevel;
                            String strQ0 = oz.x.q0(ve.i.w(achievementLevel3, nVar2), "%s", f0.w(achievementLevel3));
                            l1.s sVar4 = (l1.s) nVar2;
                            float f11 = 52;
                            ua.b(strQ0, j0.c.E(z1.o.f58481a, f11, 36, f11, CropImageView.DEFAULT_ASPECT_RATIO, 8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), 0L, j3.A(18), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar4, 0, 0, 65532);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar2, 1772550, 10);
            boolean zBooleanValue2 = ((Boolean) b1Var2.getValue()).booleanValue();
            l1 l1VarE = f1.e(null, 3);
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = new k2(29);
                sVar2.o0(objQ5);
            }
            l1 l1VarA3 = l1VarE.a(f1.r((fz.c) objQ5, 1));
            final int i15 = 2;
            j0.c(zBooleanValue2, null, l1VarA3, null, BuildConfig.VERSION_NAME, t1.e.d(-1593759862, new fz.f() { // from class: pr.d0
                @Override // fz.f
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    switch (i15) {
                        case 0:
                            k0 AnimatedVisibility = (k0) obj;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.f(AnimatedVisibility, "$this$AnimatedVisibility");
                            z1.r rVarG = e2.g(e2.e(z1.o.f58481a, 1.0f), 210);
                            l1.s sVar3 = (l1.s) ((l1.n) obj2);
                            AchievementLevel achievementLevel2 = achievementLevel;
                            boolean zH = sVar3.h(achievementLevel2);
                            Object objQ6 = sVar3.Q();
                            if (zH || objQ6 == l1.m.f39353a) {
                                objQ6 = new x(achievementLevel2, 0);
                                sVar3.o0(objQ6);
                            }
                            d0.n.b(6, (fz.c) objQ6, sVar3, rVarG);
                            break;
                        case 1:
                            k0 AnimatedVisibility2 = (k0) obj;
                            ((Integer) obj3).intValue();
                            kotlin.jvm.internal.m.f(AnimatedVisibility2, "$this$AnimatedVisibility");
                            f0.a(achievementLevel, qr.a.MIDDLE_SMALL, (l1.n) obj2, 48);
                            break;
                        default:
                            k0 AnimatedVisibility3 = (k0) obj;
                            l1.n nVar2 = (l1.n) obj2;
                            ((Integer) obj3).getClass();
                            kotlin.jvm.internal.m.f(AnimatedVisibility3, "$this$AnimatedVisibility");
                            AchievementLevel achievementLevel3 = achievementLevel;
                            String strQ0 = oz.x.q0(ve.i.w(achievementLevel3, nVar2), "%s", f0.w(achievementLevel3));
                            l1.s sVar4 = (l1.s) nVar2;
                            float f11 = 52;
                            ua.b(strQ0, j0.c.E(z1.o.f58481a, f11, 36, f11, CropImageView.DEFAULT_ASPECT_RATIO, 8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar4.j(ua.f31167a), 0L, j3.A(18), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar4, 0, 0, 65532);
                            break;
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2), sVar2, 1772550, 10);
            sVar = sVar2;
            j0.c.g(sVar, j0.v.a(oVar, 1.0f));
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new c0(achievementLevel, aVar2, i11, 2);
        }
    }

    public static final void v(int i11, boolean z11, AchievementLevel achievementLevel, AchievementLevel achievementLevel2, fz.a aVar, fz.a aVar2, l1.n nVar, int i12) {
        int i13;
        AchievementLevel achievementLevel3;
        boolean z12;
        AchievementLevel achievementLevel4;
        fz.a aVar3 = aVar2;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1117508581);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            achievementLevel3 = achievementLevel;
            i13 |= sVar.h(achievementLevel3) ? 256 : 128;
        } else {
            achievementLevel3 = achievementLevel;
        }
        if ((i12 & 3072) == 0) {
            i13 |= sVar.h(achievementLevel2) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= sVar.h(aVar) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i12) == 0) {
            i13 |= sVar.h(aVar3) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar.T(i13 & 1, (74899 & i13) != 74898)) {
            long jA = z11 ? j3.A(14) : j3.A(10);
            long jS = i11 + 1 <= achievementLevel3.getLevel() ? ve.i.s(achievementLevel3) : g2.f0.e(4291086540L);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarN = e2.n(oVar, 80);
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarN);
            y2.k.J.getClass();
            int i14 = i13;
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.r rVarN2 = e2.n(oVar, 68);
            z1.j jVar2 = z1.c.f58467e;
            j0.r rVar = j0.r.f35391a;
            z1.r rVarA = rVar.a(rVarN2, jVar2);
            q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarA);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD2, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            int i15 = i14 & 112;
            boolean zE = sVar.e(jS) | (i15 == 32);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zE || objQ == gVar) {
                objQ = new dt.b0(3, jS, z11);
                sVar.o0(objQ);
            }
            z1.r rVarB = d2.h.b(rVar.a(e2.n(d2.h.d(oVar, (fz.c) objQ), z11 ? 58 : 46), jVar2), r0.f.f48733a);
            boolean z13 = (i14 & 57344) == 16384;
            Object objQ2 = sVar.Q();
            if (z13 || objQ2 == gVar) {
                objQ2 = new okhttp3.b(1, aVar);
                sVar.o0(objQ2);
            }
            z1.r rVarQ = iu.k.q(0, 7, (fz.a) objQ2, sVar, rVarB, false);
            q0 q0VarD3 = j0.o.d(jVar, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVarQ);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, q0VarD3, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            achievementLevel4 = achievementLevel2;
            ua.b(String.valueOf(ve.i.x(achievementLevel4, achievementLevel2.getLevel())), rVar.a(oVar, jVar2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), g2.x.f28618e, jA, n3.s.N, null, null, 0L, null, null, 0, 0, 0L, null, 16777208), sVar, 0, 0, 65532);
            sVar = sVar;
            sVar.p(true);
            sVar.p(true);
            sVar.p(true);
            Boolean boolValueOf = Boolean.valueOf(z11);
            boolean z14 = (i15 == 32) | ((i14 & 458752) == 131072);
            Object objQ3 = sVar.Q();
            if (z14 || objQ3 == gVar) {
                z12 = z11;
                aVar3 = aVar2;
                objQ3 = new g.m(3, aVar3, null, z12);
                sVar.o0(objQ3);
            } else {
                z12 = z11;
                aVar3 = aVar2;
            }
            l1.t.f((fz.e) objQ3, boolValueOf, sVar);
        } else {
            z12 = z11;
            achievementLevel4 = achievementLevel2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new lh.b(i11, z12, achievementLevel, achievementLevel4, aVar, aVar3, i12);
        }
    }

    public static final String w(AchievementLevel achievement) {
        kotlin.jvm.internal.m.f(achievement, "achievement");
        return String.valueOf(ve.i.x(achievement, achievement.getLevel()));
    }

    public static final void f(AchievementLanguage achievementLanguage, fz.a onBackClick, fz.f shareImage, fz.c cVar, l1.n nVar, int i11) {
        l1.s sVar;
        kotlin.jvm.internal.m.f(achievementLanguage, "achievementLanguage");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(shareImage, "shareImage");
        kotlin.jvm.internal.m.f(cVar, scNRoQgKSYX.UosWXxTuu);
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2015228080);
        int i12 = i11 | (sVar2.h(achievementLanguage) ? 4 : 2) | (sVar2.h(onBackClick) ? 32 : 16) | (sVar2.h(shareImage) ? 256 : 128) | (sVar2.h(cVar) ? 2048 : 1024);
        if (sVar2.T(i12 & 1, (i12 & 1171) != 1170)) {
            Context context = (Context) sVar2.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode = Long.hashCode(sVar2.T);
            q1 q1VarL = sVar2.l();
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar2, oVar);
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
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            j0.d(achievementLanguage.isActive(), null, f1.e(null, 3), f1.f(null, 3), null, t1.e.d(1057974706, new a00.b(achievementLanguage, 28), sVar2), sVar2, 200064, 18);
            z1.r rVarD = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarD);
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
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar2, 0);
            int iHashCode3 = Long.hashCode(sVar2.T);
            q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, oVar);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            k7.h(onBackClick, null, false, null, f47034d, sVar2, ((i12 >> 3) & 14) | 196608, 30);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar2, new i1(1.0f, true));
            sVar2.p(true);
            j0.c.g(sVar2, e2.g(oVar, 32));
            e(achievementLanguage, qr.a.BIG, sVar2, (i12 & 14) | 48);
            float f5 = 52;
            j0.c.g(sVar2, e2.g(oVar, f5));
            String strM = tv.a.m(achievementLanguage.getLanguage(), sVar2);
            l1.d0 d0Var = ua.f31167a;
            y0 y0Var = (y0) sVar2.j(d0Var);
            long jA = j3.A(20);
            n3.s sVar3 = n3.s.L;
            y0 y0VarA = y0.a(y0Var, 0L, jA, sVar3, null, null, 0L, null, null, 3, 0, 0L, null, 16744441);
            float f11 = CropImageView.DEFAULT_ASPECT_RATIO;
            ua.b(strM, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA, sVar2, 48, 0, 65532);
            float f12 = 0;
            z1.r rVarA = d2.h.a(j0.c.E(e2.s(oVar, 120), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((double) achievementLanguage.getProgress()) <= 0.0d ? 0.0f : 1.0f);
            boolean zH = sVar2.h(achievementLanguage);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new lt.e(achievementLanguage, 14);
                sVar2.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = new ot.f2(3);
                sVar2.o0(objQ4);
            }
            g7.c(aVar, rVarA, 0L, 0L, 0, f12, (fz.c) objQ4, sVar2, 1769472, 28);
            String strF = w4.c.f((int) (achievementLanguage.getProgress() * 100), " %");
            y0 y0VarA2 = y0.a((y0) sVar2.j(d0Var), 0L, j3.A(16), sVar3, null, null, 0L, null, null, 3, 0, 0L, null, 16744441);
            z1.r rVarE = j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
            if (achievementLanguage.getProgress() > 0.0d) {
                f11 = 1.0f;
            }
            ua.b(strF, d2.h.a(rVarE, f11), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0VarA2, sVar2, 0, 0, 65532);
            sVar = sVar2;
            sVar.p(true);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(567863610);
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                Object objQ5 = sVar.Q();
                if (objQ5 == gVar) {
                    sVar.o0(null);
                    objQ5 = null;
                }
                yVar.f38361a = (Uri) objQ5;
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                Object objQ6 = sVar.Q();
                if (objQ6 == gVar) {
                    sVar.o0(null);
                    objQ6 = null;
                }
                yVar2.f38361a = (Bitmap) objQ6;
                e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
                boolean zF = sVar.f(null) | sVar.f(aVarC);
                Object objQ7 = sVar.Q();
                if (zF || objQ7 == gVar) {
                    objQ7 = w4.c.e(ur.a.class, aVarC, null, null, sVar);
                }
                sVar.p(false);
                sVar.p(false);
                ur.a aVar2 = (ur.a) objQ7;
                tv.j.b(b1Var, new v1(yVar, shareImage, b0Var, achievementLanguage, aVar2, 12), new bp.x1(yVar, cVar, b0Var, achievementLanguage, aVar2, 7), new bp.x1(yVar2, b0Var, context, achievementLanguage, aVar2, 8), t1.e.d(684501651, new k6(achievementLanguage, yVar2, yVar, 8), sVar), sVar, 24582);
            } else {
                sVar.d0(561881912);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(achievementLanguage, onBackClick, shareImage, cVar, i11, 0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:98:0x02d8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static final void n(AchievementRecord achievementRecord, fz.a onBackClick, fz.f shareImage, fz.c cVar, l1.n nVar, int i11) {
        Object obj;
        ?? r9;
        String strM;
        boolean z11;
        kotlin.jvm.internal.m.f(achievementRecord, "achievementRecord");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(shareImage, "shareImage");
        kotlin.jvm.internal.m.f(cVar, scNRoQgKSYX.DJBcl);
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2096649019);
        int i12 = i11 | (sVar.h(achievementRecord) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | (sVar.h(shareImage) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ = sVar.Q();
            Object obj2 = l1.m.f39353a;
            if (objQ == obj2) {
                objQ = l1.t.q(sVar);
                sVar.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            Object objQ2 = sVar.Q();
            if (objQ2 == obj2) {
                objQ2 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ2);
            }
            b1 b1Var = (b1) objQ2;
            long jE = g2.f0.e(4294243320L);
            r0 r0Var = g2.f0.f28556b;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarH = d0.n.h(oVar, jE, r0Var);
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, q0VarD, sVar);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar);
            z1.r rVarG = e2.g(e2.e(oVar, 1.0f), 356);
            boolean zH = sVar.h(achievementRecord);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == obj2) {
                objQ3 = new ot.e2(achievementRecord, 4);
                sVar.o0(objQ3);
            }
            d0.n.b(6, (fz.c) objQ3, sVar, rVarG);
            z1.r rVarD = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarD);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, uVarA, sVar);
            l1.t.J(hVar2, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar);
            a2 a2VarA = z1.a(j0.i.f35303a, z1.c.L, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar);
            k7.h(onBackClick, null, false, null, f47038h, sVar, ((i12 >> 3) & 14) | 196608, 30);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new i1(1.0f, true));
            if (achievementRecord.isActive()) {
                sVar.d0(897203231);
                Object objQ4 = sVar.Q();
                if (objQ4 == obj2) {
                    objQ4 = new n4(29, b1Var);
                    sVar.o0(objQ4);
                }
                obj = obj2;
                k7.h((fz.a) objQ4, null, false, null, f47039i, sVar, 196614, 30);
                r9 = 0;
            } else {
                obj = obj2;
                r9 = 0;
                sVar.d0(893616221);
            }
            sVar.p(r9);
            sVar.p(true);
            j0.c.g(sVar, e2.g(oVar, 32));
            m(achievementRecord, qr.a.BIG, sVar, (i12 & 14) | 48);
            float f5 = 52;
            j0.c.g(sVar, e2.g(oVar, f5));
            sVar.d0(232601710);
            String className = achievementRecord.getClassName();
            switch (className.hashCode()) {
                case 2020897257:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                        strM = ep.a.m(sVar, 605652058, R.string.class_a, sVar, r9);
                    } else {
                        strM = ep.a.m(sVar, 605638746, R.string.class_a, sVar, r9);
                    }
                    break;
                case 2020897258:
                    if (!className.equals(kHfjNGauVgdF.OBOtU)) {
                        strM = ep.a.m(sVar, 605652058, R.string.class_a, sVar, r9);
                    } else {
                        strM = ep.a.m(sVar, 605640986, R.string.class_b, sVar, r9);
                    }
                    break;
                case 2020897259:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                        strM = ep.a.m(sVar, 605652058, R.string.class_a, sVar, r9);
                    } else {
                        strM = ep.a.m(sVar, 605643226, R.string.class_c, sVar, r9);
                    }
                    break;
                case 2020897260:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                        strM = ep.a.m(sVar, 605652058, R.string.class_a, sVar, r9);
                    } else {
                        strM = ep.a.m(sVar, 605645466, R.string.class_d, sVar, r9);
                    }
                    break;
                case 2020897261:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                        strM = ep.a.m(sVar, 605652058, R.string.class_a, sVar, r9);
                    } else {
                        strM = ep.a.m(sVar, 605647706, R.string.class_e, sVar, r9);
                    }
                    break;
                case 2020897262:
                    if (!className.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                        strM = ep.a.m(sVar, 605652058, R.string.class_a, sVar, r9);
                    } else {
                        strM = ep.a.m(sVar, 605649946, R.string.class_f, sVar, r9);
                    }
                    break;
                default:
                    strM = ep.a.m(sVar, 605652058, R.string.class_a, sVar, r9);
                    break;
            }
            String strQ0 = oz.x.q0(BuildConfig.VERSION_NAME, "%s", strM);
            sVar.p(r9);
            l1.d0 d0Var = ua.f31167a;
            ua.b(strQ0, j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), 0L, j3.A(20), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, 48, 0, 65532);
            if (achievementRecord.isActive()) {
                sVar.d0(-1378250489);
                z1.r rVarA = d2.h.a(j0.c.B(d0.n.h(j0.c.E(j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2), CropImageView.DEFAULT_ASPECT_RATIO, 16, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), ((g2.x) android.support.v4.media.session.a.x(achievementRecord).get(r9)).f28624a, r0.f.a()), 8, 2), 0.8f);
                q0 q0VarD2 = j0.o.d(jVar, r9);
                int iHashCode4 = Long.hashCode(sVar.T);
                q1 q1VarL4 = sVar.l();
                z1.r rVarC4 = z1.a.c(sVar, rVarA);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, q0VarD2, sVar);
                l1.t.J(hVar2, q1VarL4, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar3);
                }
                l1.t.J(hVar4, rVarC4, sVar);
                ua.b(achievementRecord.getEarnDate(), j0.r.f35391a.a(oVar, z1.c.f58467e), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(d0Var), g2.x.f28618e, j3.A(12), n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar, 0, 0, 65532);
                sVar.p(true);
            } else {
                sVar.d0(-1383502695);
            }
            sVar.p(r9);
            sVar.p(true);
            if (((Boolean) b1Var.getValue()).booleanValue()) {
                sVar.d0(414358174);
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                Object objQ5 = sVar.Q();
                Object obj3 = obj;
                if (objQ5 == obj3) {
                    sVar.o0(null);
                    objQ5 = null;
                }
                yVar.f38361a = (Uri) objQ5;
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                Object objQ6 = sVar.Q();
                if (objQ6 == obj3) {
                    sVar.o0(null);
                    objQ6 = null;
                }
                yVar2.f38361a = (Bitmap) objQ6;
                e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
                boolean zF = sVar.f(null) | sVar.f(aVarC);
                Object objQ7 = sVar.Q();
                if (zF || objQ7 == obj3) {
                    objQ7 = w4.c.e(ur.a.class, aVarC, null, null, sVar);
                }
                sVar.p(r9);
                sVar.p(r9);
                ur.a aVar = (ur.a) objQ7;
                z11 = true;
                tv.j.b(b1Var, new v1(yVar, shareImage, b0Var, achievementRecord, aVar, 14), new bp.x1(yVar, cVar, b0Var, achievementRecord, aVar, 11), new bp.x1(yVar2, b0Var, context, achievementRecord, aVar, 12), t1.e.d(-506677688, new k6(achievementRecord, yVar2, yVar, 10), sVar), sVar, 24582);
            } else {
                z11 = true;
                sVar.d0(408087587);
            }
            sVar.p(r9);
            sVar.p(z11);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(achievementRecord, onBackClick, shareImage, cVar, i11, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    public static final void q(AchievementLevel achievement, fz.e eVar, l1.n nVar, int i11) {
        String strM;
        long j11;
        List listL;
        kotlin.jvm.internal.m.f(achievement, "achievement");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1948482794);
        int i12 = (sVar.h(achievement) ? 4 : 2) | i11 | (sVar.h(eVar) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            String str = OCBJEWZHh.fRNADfEFoi;
            if (objQ == gVar) {
                String id2 = achievement.getId();
                int iHashCode = id2.hashCode();
                if (iHashCode == 3832) {
                    j11 = 4278535631L;
                    listL = id2.equals("xp") ? ns.o.L(new g2.x(g2.f0.e(4291192749L)), new g2.x(g2.f0.e(4292492903L))) : ns.o.L(new g2.x(g2.f0.e(4280455643L)), new g2.x(g2.f0.e(j11)));
                } else if (iHashCode != 159337103) {
                    if (iHashCode == 542228865 && id2.equals(AchievementLevelType.DAY_STREAK)) {
                        listL = ns.o.L(new g2.x(g2.f0.e(4293837098L)), new g2.x(g2.f0.e(4294479111L)));
                    } else {
                        j11 = 4278535631L;
                    }
                } else if (id2.equals(str)) {
                    listL = ns.o.L(new g2.x(g2.f0.e(4280455643L)), new g2.x(g2.f0.e(4278535631L)));
                } else {
                    j11 = 4278535631L;
                }
                objQ = p3.A(listL);
                sVar.o0(objQ);
            }
            g2.t tVar = (g2.t) objQ;
            String strW = w(achievement);
            int iR = ve.i.r(achievement);
            List listU = ve.i.u(achievement);
            String strV = ve.i.v(achievement, sVar);
            String id3 = achievement.getId();
            int iHashCode2 = id3.hashCode();
            if (iHashCode2 == 3832) {
                if (id3.equals("xp")) {
                    strM = ep.a.m(sVar, -296400666, R.string.i_got_s_xp, sVar, false);
                    r(tVar, iR, strW, listU, strV, strM, eVar, sVar, ((i12 << 15) & 3670016) | 6);
                }
                sVar.d0(-296369120);
                sVar.p(false);
                throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievement.getId()));
            }
            if (iHashCode2 == 159337103) {
                if (id3.equals(str)) {
                    strM = ep.a.m(sVar, -296394631, R.string.i_mastered_s_knowledge_points, sVar, false);
                    r(tVar, iR, strW, listU, strV, strM, eVar, sVar, ((i12 << 15) & 3670016) | 6);
                }
                sVar.d0(-296369120);
                sVar.p(false);
                throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievement.getId()));
            }
            if (iHashCode2 == 542228865 && id3.equals(AchievementLevelType.DAY_STREAK)) {
                strM = ep.a.m(sVar, -296378828, R.string.i_reached_a_s_day_streak, sVar, false);
                r(tVar, iR, strW, listU, strV, strM, eVar, sVar, ((i12 << 15) & 3670016) | 6);
            }
            sVar.d0(-296369120);
            sVar.p(false);
            throw new IllegalArgumentException(ep.a.e("wrong achievement type: ", achievement.getId()));
        }
        sVar.W();
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new y(achievement, i11, 3, eVar);
        }
    }

    public static final void u(AchievementLevel achievement, fz.a onBackClick, fz.f shareImage, fz.c shareMore, l1.n nVar, int i11) {
        y2.h hVar;
        y2.h hVar2;
        b1 b1Var;
        kotlin.jvm.internal.m.f(achievement, "achievement");
        kotlin.jvm.internal.m.f(onBackClick, "onBackClick");
        kotlin.jvm.internal.m.f(shareImage, "shareImage");
        kotlin.jvm.internal.m.f(shareMore, "shareMore");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(348708510);
        int i12 = i11 | (sVar.h(achievement) ? 4 : 2) | (sVar.h(onBackClick) ? 32 : 16) | (sVar.h(shareImage) ? 256 : 128) | (sVar.h(shareMore) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ);
            }
            b1 b1Var2 = (b1) objQ;
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF = sVar.f(null) | sVar.f(aVarC);
            Object objQ2 = sVar.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = w4.c.e(ur.a.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            ur.a aVar = (ur.a) objQ2;
            Context context = (Context) sVar.j(AndroidCompositionLocals_androidKt.f1200b);
            Object objQ3 = sVar.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.q(sVar);
                sVar.o0(objQ3);
            }
            rz.b0 b0Var = (rz.b0) objQ3;
            boolean zH = sVar.h(aVar) | sVar.h(achievement);
            Object objQ4 = sVar.Q();
            if (zH || objQ4 == gVar) {
                objQ4 = new n(aVar, achievement, (vy.d) null, 3);
                sVar.o0(objQ4);
            }
            int i13 = i12 & 14;
            l1.t.f((fz.e) objQ4, achievement, sVar);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarD = e2.d(oVar, 1.0f);
            l1.c3 c3Var = h1.v1.f31180a;
            z1.r rVarH = d0.n.h(rVarD, ((s1) sVar.j(c3Var)).f31033p, g2.f0.f28556b);
            z1.j jVar = z1.c.f58463a;
            q0 q0VarD = j0.o.d(jVar, false);
            int iHashCode = Long.hashCode(sVar.T);
            q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarH);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            y2.h hVar3 = y2.j.f56917f;
            l1.t.J(hVar3, q0VarD, sVar);
            y2.h hVar4 = y2.j.f56916e;
            l1.t.J(hVar4, q1VarL, sVar);
            y2.h hVar5 = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar5);
            }
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar);
            z1.r rVarG = e2.g(e2.e(oVar, 1.0f), 310);
            boolean zH2 = sVar.h(achievement);
            Object objQ5 = sVar.Q();
            if (zH2 || objQ5 == gVar) {
                objQ5 = new x(achievement, 1);
                sVar.o0(objQ5);
            }
            d0.n.b(6, (fz.c) objQ5, sVar, rVarG);
            z1.r rVarD2 = e2.d(j0.c.v(j0.c.F(oVar)), 1.0f);
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.P, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            q1 q1VarL2 = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarD2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, uVarA, sVar);
            l1.t.J(hVar4, q1VarL2, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar5);
            }
            l1.t.J(hVar6, rVarC2, sVar);
            j0.b bVar = j0.i.f35303a;
            z1.i iVar2 = z1.c.L;
            a2 a2VarA = z1.a(bVar, iVar2, sVar, 0);
            int iHashCode3 = Long.hashCode(sVar.T);
            q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, oVar);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA, sVar);
            l1.t.J(hVar4, q1VarL3, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode3))) {
                hVar = hVar5;
                defpackage.e.A(iHashCode3, sVar, iHashCode3, hVar);
            } else {
                hVar = hVar5;
            }
            l1.t.J(hVar6, rVarC3, sVar);
            int i14 = (i12 >> 3) & 14;
            y2.h hVar7 = hVar;
            k7.h(onBackClick, null, false, null, f47041k, sVar, i14 | 196608, 30);
            sVar = sVar;
            double d5 = 1.0f;
            if (d5 <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.c.g(sVar, new i1(1.0f, true));
            sVar.p(true);
            j0.c.g(sVar, e2.g(oVar, 32));
            a(achievement, qr.a.BIG, sVar, i13 | 48);
            float f5 = 52;
            ua.b(oz.x.q0(ve.i.w(achievement, sVar), OCBJEWZHh.NRGqSFWZvssIRe, w(achievement)), j0.c.E(oVar, f5, 48, f5, CropImageView.DEFAULT_ASPECT_RATIO, 8), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, y0.a((y0) sVar.j(ua.f31167a), 0L, j3.A(18), n3.s.L, null, null, 0L, null, null, 3, 0, 0L, null, 16744441), sVar, 0, 0, 65532);
            if (d5 <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            w4.c.r(1.0f, true, sVar);
            z1.r rVarC4 = j0.c.C(oVar, 30, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            a2 a2VarA2 = z1.a(bVar, iVar2, sVar, 0);
            int iHashCode4 = Long.hashCode(sVar.T);
            q1 q1VarL4 = sVar.l();
            z1.r rVarC5 = z1.a.c(sVar, rVarC4);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, a2VarA2, sVar);
            l1.t.J(hVar4, q1VarL4, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode4))) {
                hVar2 = hVar7;
                defpackage.e.A(iHashCode4, sVar, iHashCode4, hVar2);
            } else {
                hVar2 = hVar7;
            }
            l1.t.J(hVar6, rVarC5, sVar);
            float f11 = 22;
            z1.r rVarH2 = d0.n.h(e2.g(oVar, 45), g2.x.f28621h, r0.f.d(f11));
            y2.h hVar8 = hVar2;
            d0.v vVarA = d0.n.a(((s1) sVar.j(c3Var)).f31017a, (float) 1.5d);
            z1.r rVarB = d2.h.b(d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.d(f11), rVarH2), r0.f.d(f11));
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                b1Var = b1Var2;
                objQ6 = new z(0, b1Var);
                sVar.o0(objQ6);
            } else {
                b1Var = b1Var2;
            }
            z1.r rVarC6 = j0.c.C(d0.n.o(rVarB, false, null, (fz.a) objQ6, 15), 20, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            q0 q0VarD2 = j0.o.d(jVar, false);
            int iHashCode5 = Long.hashCode(sVar.T);
            q1 q1VarL5 = sVar.l();
            z1.r rVarC7 = z1.a.c(sVar, rVarC6);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar3, q0VarD2, sVar);
            l1.t.J(hVar4, q1VarL5, sVar);
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode5))) {
                defpackage.e.A(iHashCode5, sVar, iHashCode5, hVar8);
            }
            l1.t.J(hVar6, rVarC7, sVar);
            b1 b1Var3 = b1Var;
            d0.n.c(se.k.y(R.drawable.achievement_icon_share, sVar, 0), null, j0.r.f35391a.a(oVar, z1.c.f58467e), null, null, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(((s1) sVar.j(c3Var)).f31017a, 5), sVar, 48, 56);
            sVar.p(true);
            j0.c.g(sVar, e2.s(oVar, 24));
            iu.k.e(onBackClick, e2.e(oVar, 1.0f), false, 0L, null, f47042l, sVar, i14 | 196656, 28);
            sVar.p(true);
            j0.c.g(sVar, e2.g(oVar, 56));
            sVar.p(true);
            if (((Boolean) b1Var3.getValue()).booleanValue()) {
                sVar.d0(-1522930278);
                kotlin.jvm.internal.y yVar = new kotlin.jvm.internal.y();
                Object objQ7 = sVar.Q();
                if (objQ7 == gVar) {
                    sVar.o0(null);
                    objQ7 = null;
                }
                yVar.f38361a = (Uri) objQ7;
                kotlin.jvm.internal.y yVar2 = new kotlin.jvm.internal.y();
                Object objQ8 = sVar.Q();
                if (objQ8 == gVar) {
                    sVar.o0(null);
                    objQ8 = null;
                }
                yVar2.f38361a = (Bitmap) objQ8;
                tv.j.b(b1Var3, new i(yVar, shareImage, b0Var, achievement, aVar, 1), new j(yVar, shareMore, b0Var, achievement, aVar, 1), new k(yVar2, b0Var, context, achievement, aVar, 1), t1.e.d(-1692165061, new g(achievement, yVar2, yVar, 1), sVar), sVar, 24582);
            } else {
                sVar.d0(-1536685474);
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new t(achievement, onBackClick, shareImage, shareMore, i11, 3);
        }
    }
}
