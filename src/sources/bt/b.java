package bt;

import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bw.ORXQ.ADSb;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.accompanist.permissions.PermissionState;
import com.google.accompanist.permissions.PermissionStateKt;
import com.google.accompanist.permissions.PermissionStatus;
import com.google.accompanist.permissions.PermissionsUtilKt;
import com.google.android.gms.measurement.zfxB.ypOOxsaJG;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.lingodeer.data.model.AchievementLevelType;
import com.lingodeer.data.model.CourseCharacter;
import com.lingodeer.data.model.CourseSentence;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.DisplayType;
import com.lingodeer.data.model.OptionItemSelectedState;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import h1.dc;
import h1.fc;
import h1.ua;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import lt.AJC.PQgum;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t1.d f5177a = new t1.d(new bp.h1(5), false, -607824495);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final t1.d f5178b = new t1.d(new bp.h1(6), false, -742407184);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t1.d f5179c = new t1.d(new a(0), false, 1975815040);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t1.d f5180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final t1.d f5181e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d f5182f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final t1.d f5183g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final t1.d f5184h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final t1.d f5185i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d f5186j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final t1.d f5187k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t1.d f5188l;
    public static final t1.d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final t1.d f5189n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final t1.d f5190o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final t1.d f5191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final t1.d f5192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final t1.d f5193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final t1.d f5194s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final t1.d f5195t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final t1.d f5196u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t1.d f5197v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final t1.d f5198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final t1.d f5199x;

    static {
        new t1.d(new bp.h1(7), false, 335955134);
        new t1.d(new bp.h1(8), false, -2084322427);
        f5180d = new t1.d(new at.a(13), false, -1790461472);
        f5181e = new t1.d(new at.a(14), false, -1384530679);
        f5182f = new t1.d(new a(2), false, -1773564112);
        f5183g = new t1.d(new bp.h1(9), false, 595891741);
        f5184h = new t1.d(new at.a(15), false, -387126159);
        f5185i = new t1.d(new at.a(16), false, -2125343175);
        f5186j = new t1.d(new bp.h1(10), false, 2057717898);
        f5187k = new t1.d(new bp.h1(11), false, 339945039);
        f5188l = new t1.d(new bp.h1(12), false, 1186545477);
        m = new t1.d(new bp.h1(13), false, 1580122295);
        f5189n = new t1.d(new at.a(17), false, -667853717);
        f5190o = new t1.d(new at.a(18), false, -1578100516);
        f5191p = new t1.d(new d(0), false, -1169064835);
        f5192q = new t1.d(new a(3), false, 475964408);
        f5193r = new t1.d(new bp.h1(14), false, -1431131517);
        f5194s = new t1.d(new at.a(19), false, -522127953);
        f5195t = new t1.d(new at.a(20), false, -1503987944);
        f5196u = new t1.d(new bp.h1(15), false, 37894418);
        f5197v = new t1.d(new bp.h1(16), false, 381168072);
        f5198w = new t1.d(new bp.h1(17), false, 1029395529);
        f5199x = new t1.d(new a(4), false, 565391033);
    }

    public static final void A(ht.o oVar, l1.b1 b1Var, ys.d0 d0Var, jt.s0 s0Var, List list, ht.l lVar) {
        if (oVar.f33762j) {
            b1Var.setValue(Long.valueOf(((Number) b1Var.getValue()).longValue() + 1));
        }
        if (d0Var != null) {
            jh.h.m(d0Var, list, lVar, new x3(s0Var, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0204  */
    /* JADX WARN: Code duplicated, block: B:129:0x0222  */
    /* JADX WARN: Code duplicated, block: B:132:0x0261  */
    /* JADX WARN: Code duplicated, block: B:133:0x026e  */
    /* JADX WARN: Code duplicated, block: B:136:0x0282  */
    /* JADX WARN: Code duplicated, block: B:137:0x0285  */
    /* JADX WARN: Code duplicated, block: B:140:0x0292  */
    /* JADX WARN: Code duplicated, block: B:141:0x0295  */
    /* JADX WARN: Code duplicated, block: B:145:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:155:0x032e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0345  */
    /* JADX WARN: Code duplicated, block: B:165:0x0359  */
    /* JADX WARN: Code duplicated, block: B:169:0x036d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0382  */
    /* JADX WARN: Code duplicated, block: B:177:0x039f  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:183:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:187:0x0404  */
    /* JADX WARN: Code duplicated, block: B:193:0x0455  */
    /* JADX WARN: Code duplicated, block: B:199:0x0489  */
    /* JADX WARN: Code duplicated, block: B:205:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:211:0x0540  */
    /* JADX WARN: Code duplicated, block: B:215:0x0579  */
    /* JADX WARN: Code duplicated, block: B:219:0x0597  */
    /* JADX WARN: Code duplicated, block: B:223:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:227:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:231:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:234:0x0629  */
    /* JADX WARN: Code duplicated, block: B:235:0x062d  */
    /* JADX WARN: Code duplicated, block: B:240:0x064e  */
    /* JADX WARN: Code duplicated, block: B:244:0x0662  */
    /* JADX WARN: Code duplicated, block: B:249:0x0679  */
    /* JADX WARN: Code duplicated, block: B:252:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:254:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:255:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:259:0x06cc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:262:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:265:0x07a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:266:0x07a8  */
    /* JADX WARN: Code duplicated, block: B:269:0x07bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:270:0x07c1  */
    /* JADX WARN: Code duplicated, block: B:273:0x07d8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:274:0x07da  */
    /* JADX WARN: Code duplicated, block: B:277:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:278:0x07ee  */
    /* JADX WARN: Code duplicated, block: B:281:0x07fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:282:0x07fc  */
    /* JADX WARN: Code duplicated, block: B:285:0x081b  */
    /* JADX WARN: Code duplicated, block: B:286:0x081d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0829  */
    /* JADX WARN: Code duplicated, block: B:291:0x082f  */
    /* JADX WARN: Code duplicated, block: B:297:0x083d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:300:0x0845  */
    /* JADX WARN: Code duplicated, block: B:303:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:307:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:310:0x08e8  */
    /* JADX WARN: Code duplicated, block: B:312:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:315:0x092c  */
    /* JADX WARN: Code duplicated, block: B:317:0x0938  */
    public static final void B(final CourseSentence sentenceItem, final jt.s0 state, final ht.o courseTestParams, final String hintText, final String str, final boolean z11, final boolean z12, final t1.d dVar, final t1.d dVar2, final fz.a getComboCount, final fz.e onClickPlayAudio, final fz.c onClickChecked, fz.a aVar, final fz.a onClickContinue, final fz.a onClickSkipListen, final fz.c onClickBugReport, l1.n nVar, final int i11, final int i12) {
        int i13;
        l1.s sVar;
        final fz.a aVar2;
        fz.a aVar3;
        Configuration configuration;
        int i14;
        boolean zD;
        Object objQ;
        qy.l lVar;
        Object objQ2;
        rz.b0 b0Var;
        l1.b1 b1Var;
        final l1.b1 b1Var2;
        x1.p pVar;
        boolean z13;
        fz.a aVar4;
        String strU;
        String strU2;
        ns.z zVarJ;
        Boolean boolValueOf;
        boolean z14;
        int i15;
        vy.d dVar3;
        boolean z15;
        boolean zH;
        Object s1Var;
        Boolean bool;
        int i16;
        l1.s sVar2;
        j3.y0 y0VarB;
        long jC;
        boolean zE;
        Object objQ3;
        boolean zE2;
        Object objQ4;
        int i17;
        l1.a1 a1Var;
        boolean zE3;
        Object objQ5;
        l1.a1 a1Var2;
        boolean zE4;
        Object objQ6;
        l1.a1 a1Var3;
        boolean zE5;
        Object objQ7;
        l1.b1 b1Var3;
        boolean zE6;
        Object objQ8;
        l1.a1 a1Var4;
        boolean zF;
        Object objQ9;
        l1.b1 b1Var4;
        Object objQ10;
        l1.b1 b1Var5;
        Object objQ11;
        l1.b1 b1Var6;
        boolean zF2;
        Object objQ12;
        l1.b3 b3Var;
        boolean zG;
        Object objS;
        l1.b3 b3Var2;
        boolean zG2;
        Object objQ13;
        l1.b3 b3Var3;
        boolean zF3;
        Object objQ14;
        l1.b1 b1Var7;
        l1.a1 a1Var5;
        l1.a1 a1Var6;
        boolean z16;
        boolean zF4;
        Object objQ15;
        l1.b1 b1Var8;
        boolean zF5;
        Object objQ16;
        boolean zE7;
        Object objQ17;
        l1.b1 b1Var9;
        boolean zF6;
        Object objQ18;
        boolean zE8;
        Object objQ19;
        l1.b1 b1Var10;
        boolean zF7;
        Object objQ20;
        int iHashCode;
        y2.i iVar;
        y2.h hVar;
        boolean zE9;
        Object objQ21;
        String translation;
        char c11;
        boolean zH2;
        Object objQ22;
        l1.g gVar;
        ht.o oVar;
        l1.s sVar3;
        l1.b1 b1Var11;
        boolean zF8;
        Object objQ23;
        boolean zF9;
        Object objQ24;
        boolean zF10;
        Object objQ25;
        boolean z17;
        boolean zH3;
        Object objQ26;
        boolean z18;
        boolean z19;
        Object objQ27;
        rz.b0 b0Var2;
        l1.b1 b1Var12;
        boolean z20;
        boolean zF11;
        Object objQ28;
        jt.h2 h2Var;
        boolean z21;
        kotlin.jvm.internal.m.f(sentenceItem, "sentenceItem");
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(hintText, "hintText");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickSkipListen, "onClickSkipListen");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(1054561028);
        if ((i11 & 6) == 0) {
            i13 = i11 | (sVar4.h(sentenceItem) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= sVar4.h(state) ? 32 : 16;
        }
        int i18 = 128;
        if ((i11 & 384) == 0) {
            i13 |= sVar4.f(courseTestParams) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= sVar4.f(hintText) ? 2048 : 1024;
        }
        int i19 = i11 & 24576;
        int i21 = OSSConstants.DEFAULT_BUFFER_SIZE;
        if (i19 == 0) {
            i13 |= sVar4.f(str) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= sVar4.g(z11) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar4.g(z12) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar4.h(dVar) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar4.h(dVar2) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar4.h(getComboCount) ? 536870912 : 268435456;
        }
        int i22 = i13;
        int i23 = (sVar4.h(onClickPlayAudio) ? 4 : 2) | (sVar4.h(onClickChecked) ? 32 : 16);
        if ((i12 & 4096) == 0 && sVar4.h(aVar)) {
            i18 = 256;
        }
        int i24 = i23 | i18 | (sVar4.h(onClickContinue) ? 2048 : 1024);
        if (sVar4.h(onClickSkipListen)) {
            i21 = 16384;
        }
        int i25 = i24 | i21 | (sVar4.h(onClickBugReport) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536);
        if (sVar4.T(i22 & 1, ((i22 & 306783379) == 306783378 && (74899 & i25) == 74898) ? false : true)) {
            sVar4.Y();
            int i26 = i11 & 1;
            l1.g gVar2 = l1.m.f39353a;
            if (i26 == 0 || sVar4.C()) {
                if ((i12 & 4096) != 0) {
                    boolean z22 = (i25 & 112) == 32;
                    Object objQ29 = sVar4.Q();
                    if (z22 || objQ29 == gVar2) {
                        objQ29 = new g(onClickChecked, 4);
                        sVar4.o0(objQ29);
                    }
                    i25 &= -897;
                    aVar3 = (fz.a) objQ29;
                }
                sVar4.q();
                long j11 = courseTestParams.f33756d;
                final boolean zBooleanValue = ((Boolean) sVar4.j(ju.f.f37374h)).booleanValue();
                configuration = (Configuration) sVar4.j(AndroidCompositionLocals_androidKt.f1199a);
                i14 = i25;
                zD = sVar4.d(configuration.screenWidthDp) | sVar4.d(configuration.screenHeightDp);
                objQ = sVar4.Q();
                if (zD || objQ == gVar2) {
                    objQ = new qy.l(Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp));
                    sVar4.o0(objQ);
                }
                lVar = (qy.l) objQ;
                objQ2 = sVar4.Q();
                if (objQ2 == gVar2) {
                    objQ2 = l1.t.q(sVar4);
                    sVar4.o0(objQ2);
                }
                b0Var = (rz.b0) objQ2;
                b1Var = state.f37167j;
                b1Var2 = state.f37168k;
                final l1.b1 b1Var13 = state.f37173q;
                pVar = state.f37172p;
                final boolean z23 = state.f37162e;
                z13 = state.f37163f;
                aVar4 = aVar3;
                final l1.b1 b1Var14 = state.f37171o;
                strU = se.k.u(" ", pVar);
                strU2 = se.k.u(BuildConfig.VERSION_NAME, sentenceItem.getDisplayCourseWords());
                if (b1Var.getValue() == ht.q.WRONG) {
                    zVarJ = se.k.j(courseTestParams, str, sentenceItem.getTranslation(), strU2, strU);
                } else {
                    zVarJ = null;
                }
                Long lValueOf = Long.valueOf(j11);
                boolValueOf = Boolean.valueOf(z11);
                if ((i22 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean zF12 = z14 | sVar4.f(b1Var2);
                i15 = i14 & 14;
                dVar3 = null;
                if (i15 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                zH = zF12 | z15 | sVar4.h(sentenceItem);
                Object objQ30 = sVar4.Q();
                if (!zH || objQ30 == gVar2) {
                    bool = boolValueOf;
                    i16 = i15;
                    sVar2 = sVar4;
                    s1Var = new s1(z11, b1Var2, onClickPlayAudio, sentenceItem, null, 2);
                    sVar2.o0(s1Var);
                } else {
                    bool = boolValueOf;
                    i16 = i15;
                    s1Var = objQ30;
                    sVar2 = sVar4;
                }
                l1.t.g(lValueOf, bool, (fz.e) s1Var, sVar2);
                y0VarB = ct.c.b(sVar2);
                jC = ct.c.c(sVar2);
                zE = sVar2.e(jC);
                objQ3 = sVar2.Q();
                if (zE || objQ3 == gVar2) {
                    objQ3 = l1.t.B(j3.y0.a(y0VarB, 0L, jC, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                    sVar2.o0(objQ3);
                }
                final l1.b1 b1Var15 = (l1.b1) objQ3;
                zE2 = sVar2.e(j11);
                objQ4 = sVar2.Q();
                if (!zE2 || objQ4 == gVar2) {
                    i17 = 0;
                    objQ4 = defpackage.e.v(0, sVar2);
                } else {
                    i17 = 0;
                }
                a1Var = (l1.a1) objQ4;
                zE3 = sVar2.e(j11);
                objQ5 = sVar2.Q();
                if (zE3 || objQ5 == gVar2) {
                    objQ5 = defpackage.e.v(i17, sVar2);
                }
                a1Var2 = (l1.a1) objQ5;
                zE4 = sVar2.e(j11);
                objQ6 = sVar2.Q();
                if (zE4 || objQ6 == gVar2) {
                    objQ6 = defpackage.e.v(i17, sVar2);
                }
                a1Var3 = (l1.a1) objQ6;
                zE5 = sVar2.e(j11);
                objQ7 = sVar2.Q();
                if (zE5 || objQ7 == gVar2) {
                    objQ7 = l1.t.B(null);
                    sVar2.o0(objQ7);
                }
                b1Var3 = (l1.b1) objQ7;
                zE6 = sVar2.e(j11);
                objQ8 = sVar2.Q();
                if (zE6 || objQ8 == gVar2) {
                    objQ8 = defpackage.e.v(0, sVar2);
                }
                a1Var4 = (l1.a1) objQ8;
                Object[] objArr = {Long.valueOf(j11)};
                zF = sVar2.f(lVar);
                objQ9 = sVar2.Q();
                if (zF || objQ9 == gVar2) {
                    objQ9 = new av.d(lVar, 16);
                    sVar2.o0(objQ9);
                }
                b1Var4 = (l1.b1) w1.j.c(objArr, (fz.a) objQ9, sVar2, 0);
                Object[] objArr2 = {Long.valueOf(j11)};
                objQ10 = sVar2.Q();
                if (objQ10 == gVar2) {
                    objQ10 = new bq.u(6);
                    sVar2.o0(objQ10);
                }
                b1Var5 = (l1.b1) w1.j.c(objArr2, (fz.a) objQ10, sVar2, 48);
                Object[] objArr3 = {Long.valueOf(j11)};
                objQ11 = sVar2.Q();
                if (objQ11 == gVar2) {
                    objQ11 = new bq.u(7);
                    sVar2.o0(objQ11);
                }
                b1Var6 = (l1.b1) w1.j.c(objArr3, (fz.a) objQ11, sVar2, 48);
                zF2 = sVar2.f((f2.c) b1Var3.getValue());
                objQ12 = sVar2.Q();
                if (zF2 || objQ12 == gVar2) {
                    objQ12 = l1.t.s(new bp.p(15, b1Var3));
                    sVar2.o0(objQ12);
                }
                b3Var = (l1.b3) objQ12;
                l1.h1 h1Var = (l1.h1) a1Var2;
                l1.h1 h1Var2 = (l1.h1) a1Var3;
                zG = sVar2.g(z13) | sVar2.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar2.d(h1Var.l()) | sVar2.d(h1Var2.l());
                Object objQ31 = sVar2.Q();
                if (!zG || objQ31 == gVar2) {
                    objS = l1.t.s(new e4(0, b3Var, a1Var2, a1Var3, z13));
                    sVar2.o0(objS);
                } else {
                    objS = objQ31;
                }
                b3Var2 = (l1.b3) objS;
                zG2 = sVar2.g(((Boolean) b1Var5.getValue()).booleanValue());
                objQ13 = sVar2.Q();
                if (zG2 || objQ13 == gVar2) {
                    objQ13 = l1.t.s(new bp.p(16, b1Var5));
                    sVar2.o0(objQ13);
                }
                b3Var3 = (l1.b3) objQ13;
                Long lValueOf2 = Long.valueOf(j11);
                Boolean bool2 = (Boolean) b3Var2.getValue();
                bool2.getClass();
                Object[] objArr4 = {lValueOf2, bool2, Integer.valueOf(h1Var.l()), Integer.valueOf(h1Var2.l()), (f2.c) b1Var3.getValue()};
                zF3 = sVar2.f(b3Var2) | sVar2.f(b1Var3) | sVar2.g(z13) | sVar2.f(a1Var2) | sVar2.f(a1Var3) | sVar2.f(b1Var5);
                objQ14 = sVar2.Q();
                if (!zF3 || objQ14 == gVar2) {
                    objQ14 = new u4(z13, b3Var2, b1Var3, a1Var2, a1Var3, b1Var5, null);
                    b1Var7 = b1Var3;
                    a1Var5 = a1Var2;
                    a1Var6 = a1Var3;
                    z16 = z13;
                    sVar2.o0(objQ14);
                } else {
                    a1Var5 = a1Var2;
                    a1Var6 = a1Var3;
                    z16 = z13;
                    b1Var7 = b1Var3;
                }
                l1.t.i(objArr4, (fz.e) objQ14, sVar2);
                zF4 = sVar2.f(b1Var4) | sVar2.f(lVar) | sVar2.f(b1Var5) | sVar2.f(b1Var6);
                objQ15 = sVar2.Q();
                if (!zF4 || objQ15 == gVar2) {
                    objQ15 = new ad.x(lVar, b1Var4, b1Var5, b1Var6, null, 4);
                    b1Var8 = b1Var6;
                    sVar2.o0(objQ15);
                } else {
                    b1Var8 = b1Var6;
                }
                l1.t.f((fz.e) objQ15, lVar, sVar2);
                Boolean bool3 = (Boolean) b3Var3.getValue();
                bool3.getClass();
                zF5 = sVar2.f(b3Var3) | sVar2.f(b1Var8);
                objQ16 = sVar2.Q();
                if (zF5 || objQ16 == gVar2) {
                    objQ16 = new v4(b3Var3, b1Var8, dVar3, 0);
                    sVar2.o0(objQ16);
                }
                l1.t.f((fz.e) objQ16, bool3, sVar2);
                zE7 = sVar2.e(j11);
                objQ17 = sVar2.Q();
                if (zE7 || objQ17 == gVar2) {
                    objQ17 = l1.t.B(null);
                    sVar2.o0(objQ17);
                }
                b1Var9 = (l1.b1) objQ17;
                Long lValueOf3 = Long.valueOf(j11);
                zF6 = sVar2.f(pVar) | sVar2.f(b1Var9);
                objQ18 = sVar2.Q();
                if (zF6 || objQ18 == gVar2) {
                    objQ18 = new b1.c(17, pVar, b1Var9, (vy.d) null);
                    sVar2.o0(objQ18);
                }
                l1.t.f((fz.e) objQ18, lValueOf3, sVar2);
                zE8 = sVar2.e(j11);
                objQ19 = sVar2.Q();
                if (zE8 || objQ19 == gVar2) {
                    objQ19 = l1.t.B(new f2.b(0L));
                    sVar2.o0(objQ19);
                }
                b1Var10 = (l1.b1) objQ19;
                zF7 = sVar2.f(b1Var10);
                objQ20 = sVar2.Q();
                if (zF7 || objQ20 == gVar2) {
                    objQ20 = new bp.h0(4, b1Var10);
                    sVar2.o0(objQ20);
                }
                z1.r rVarN = w2.a0.n(z1.o.f58481a, (fz.c) objQ20);
                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL = sVar2.l();
                z1.r rVarC = z1.a.c(sVar2, rVarN);
                y2.k.J.getClass();
                iVar = y2.j.f56913b;
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(y2.j.f56917f, q0VarD, sVar2);
                l1.t.J(y2.j.f56916e, q1VarL, sVar2);
                hVar = y2.j.f56918g;
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
                }
                l1.t.J(y2.j.f56915d, rVarC, sVar2);
                zE9 = sVar2.e(j11);
                objQ21 = sVar2.Q();
                if (zE9 || objQ21 == gVar2) {
                    objQ21 = l1.t.B(null);
                    sVar2.o0(objQ21);
                }
                l1.b1 b1Var16 = (l1.b1) objQ21;
                if (z16 && z12) {
                    translation = sentenceItem.getTranslation();
                } else {
                    translation = BuildConfig.VERSION_NAME;
                }
                ht.q qVar = (ht.q) b1Var.getValue();
                boolean z24 = !((Boolean) state.m.getValue()).booleanValue();
                ht.l lVar2 = (ht.l) b1Var2.getValue();
                boolean z25 = !((Boolean) b3Var3.getValue()).booleanValue();
                if (courseTestParams.f33768q) {
                    c11 = 4;
                    boolean z26 = courseTestParams.f33755c == 4;
                    ns.s sVar5 = (ns.s) state.f37170n.getValue();
                    zH2 = sVar2.h(state);
                    objQ22 = sVar2.Q();
                    if (!zH2 || objQ22 == gVar2) {
                        gVar = gVar2;
                        oVar = courseTestParams;
                        y2 y2Var = new y2(0, state, jt.s0.class, "onRetry", "onRetry()V", 0, 1);
                        sVar2.o0(y2Var);
                        objQ22 = y2Var;
                    } else {
                        gVar = gVar2;
                        oVar = courseTestParams;
                    }
                    mz.e eVar = (mz.e) objQ22;
                    t1.d dVarD = t1.e.d(1409198604, new l0(dVar, hintText, oVar), sVar2);
                    t1.d dVarD2 = t1.e.d(1720589675, new f4(dVar2, b1Var13, pVar, b1Var15, z23, b0Var, state, b1Var14, b1Var16, b1Var9, a1Var), sVar2);
                    sVar3 = sVar2;
                    w1 w1Var = new w1(b3Var3, b1Var8, b1Var13, b1Var15, z23, b1Var14, a1Var5, a1Var6, b0Var, state, z16, b1Var2, oVar, zBooleanValue, onClickPlayAudio, b1Var7, a1Var4);
                    b1Var11 = b1Var7;
                    t1.d dVarD3 = t1.e.d(2031980746, w1Var, sVar3);
                    t1.d dVarD4 = t1.e.d(-1951595479, new g4(b1Var13, b1Var15, 0), sVar3);
                    final boolean z27 = z16;
                    t1.d dVarD5 = t1.e.d(353309947, new i4(b1Var, z27, sentenceItem, state, pVar, onClickPlayAudio, 0), sVar3);
                    zF8 = sVar3.f(a1Var);
                    objQ23 = sVar3.Q();
                    l1.g gVar3 = gVar;
                    if (zF8 || objQ23 == gVar3) {
                        objQ23 = new a2(a1Var, 2);
                        sVar3.o0(objQ23);
                    }
                    fz.c cVar = (fz.c) objQ23;
                    zF9 = sVar3.f(b1Var11);
                    objQ24 = sVar3.Q();
                    if (zF9 || objQ24 == gVar3) {
                        objQ24 = new bp.h0(7, b1Var11);
                        sVar3.o0(objQ24);
                    }
                    fz.c cVar2 = (fz.c) objQ24;
                    zF10 = sVar3.f(a1Var4);
                    objQ25 = sVar3.Q();
                    if (zF10 || objQ25 == gVar3) {
                        objQ25 = new a2(a1Var4, 4);
                        sVar3.o0(objQ25);
                    }
                    fz.c cVar3 = (fz.c) objQ25;
                    if (i16 == 4) {
                        z17 = true;
                    } else {
                        z17 = false;
                    }
                    zH3 = z17 | sVar3.h(sentenceItem);
                    objQ26 = sVar3.Q();
                    if (zH3 || objQ26 == gVar3) {
                        objQ26 = new m0(onClickPlayAudio, sentenceItem, 9);
                        sVar3.o0(objQ26);
                    }
                    fz.a aVar5 = (fz.a) objQ26;
                    boolean zH4 = sVar3.h(b0Var) | sVar3.h(state);
                    if ((i14 & 112) == 32) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    z19 = zH4 | z18 | ((((i14 & 896) ^ 384) <= 256 && sVar3.f(aVar4)) || (i14 & 384) == 256);
                    objQ27 = sVar3.Q();
                    if (!z19 || objQ27 == gVar3) {
                        b0.k0 k0Var = new b0.k0(b0Var, state, onClickChecked, aVar4, 5);
                        b0Var2 = b0Var;
                        sVar3.o0(k0Var);
                        objQ27 = k0Var;
                    } else {
                        b0Var2 = b0Var;
                    }
                    int i27 = (3670016 & (i14 << 6)) | ((i14 << 9) & 234881024) | (i22 & 1879048192);
                    int i28 = i14 & 7168;
                    b1Var12 = b1Var8;
                    dt.k3.e(translation, qVar, lVar2, z24, z25, false, z26, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, dVarD4, null, dVarD5, zVarJ, cVar, null, cVar2, cVar3, null, onClickSkipListen, aVar5, onClickBugReport, getComboCount, (fz.a) objQ27, sVar5, (fz.a) eVar, onClickContinue, sVar3, 0, 819683328, i27, i28, 38027088, 0);
                    sVar = sVar3;
                    if (((Boolean) b3Var3.getValue()).booleanValue() || !((Boolean) b1Var12.getValue()).booleanValue()) {
                        z20 = false;
                    } else {
                        z20 = true;
                    }
                    zF11 = sVar.f(b1Var12);
                    objQ28 = sVar.Q();
                    if (zF11 || objQ28 == gVar3) {
                        objQ28 = new bp.p(18, b1Var12);
                        sVar.o0(objQ28);
                    }
                    final rz.b0 b0Var3 = b0Var2;
                    dt.e.K(z20, (fz.a) objQ28, null, t1.e.d(-527803163, new fz.e() { // from class: bt.c4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            l1.n nVar2 = (l1.n) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            l1.s sVar6 = (l1.s) nVar2;
                            if (sVar6.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                z1.r rVarB = j0.c.B(d0.n.y(j0.e2.i(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 320, 1), d0.n.u(sVar6), false, 14), 12, 16);
                                j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar6, 0);
                                int iHashCode2 = Long.hashCode(sVar6.T);
                                l1.q1 q1VarL2 = sVar6.l();
                                z1.r rVarC2 = z1.a.c(sVar6, rVarB);
                                y2.k.J.getClass();
                                y2.i iVar2 = y2.j.f56913b;
                                sVar6.h0();
                                if (sVar6.S) {
                                    sVar6.k(iVar2);
                                } else {
                                    sVar6.r0();
                                }
                                l1.t.J(y2.j.f56917f, uVarA, sVar6);
                                l1.t.J(y2.j.f56916e, q1VarL2, sVar6);
                                y2.h hVar2 = y2.j.f56918g;
                                if (sVar6.S || !kotlin.jvm.internal.m.a(sVar6.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar6, iHashCode2, hVar2);
                                }
                                l1.t.J(y2.j.f56915d, rVarC2, sVar6);
                                List list = (List) b1Var13.getValue();
                                rz.b0 b0Var4 = b0Var3;
                                boolean zH5 = sVar6.h(b0Var4);
                                jt.s0 s0Var = state;
                                boolean zH6 = zH5 | sVar6.h(s0Var);
                                boolean z28 = z27;
                                boolean zG3 = zH6 | sVar6.g(z28);
                                l1.b1 b1Var17 = b1Var2;
                                boolean zF13 = zG3 | sVar6.f(b1Var17);
                                ht.o oVar2 = courseTestParams;
                                boolean zF14 = zF13 | sVar6.f(oVar2);
                                boolean z29 = zBooleanValue;
                                boolean zG4 = zF14 | sVar6.g(z29);
                                fz.e eVar2 = onClickPlayAudio;
                                boolean zF15 = zG4 | sVar6.f(eVar2);
                                Object objQ32 = sVar6.Q();
                                if (zF15 || objQ32 == l1.m.f39353a) {
                                    j4 j4Var = new j4(b0Var4, s0Var, z28, b1Var17, oVar2, z29, eVar2, 0);
                                    sVar6.o0(j4Var);
                                    objQ32 = j4Var;
                                }
                                b.y(list, b1Var15, z23, null, b1Var14, true, null, 0, false, null, (fz.c) objQ32, sVar6, 1769472, 0, 904);
                                sVar6.p(true);
                            } else {
                                sVar6.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar), sVar, 3072);
                    h2Var = (jt.h2) b1Var16.getValue();
                    if (h2Var == null) {
                        sVar.d0(-2053145062);
                        z21 = false;
                    } else {
                        z21 = false;
                        sVar.d0(-2053145061);
                        l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-1495265777, new at.h(19, h2Var, b1Var10), sVar), sVar, 56);
                    }
                    sVar.p(z21);
                    sVar.p(true);
                    aVar2 = aVar4;
                } else {
                    c11 = 4;
                }
                ns.s sVar6 = (ns.s) state.f37170n.getValue();
                zH2 = sVar2.h(state);
                objQ22 = sVar2.Q();
                if (zH2) {
                    gVar = gVar2;
                    oVar = courseTestParams;
                    y2 y2Var2 = new y2(0, state, jt.s0.class, "onRetry", "onRetry()V", 0, 1);
                    sVar2.o0(y2Var2);
                    objQ22 = y2Var2;
                } else {
                    gVar = gVar2;
                    oVar = courseTestParams;
                    y2 y2Var3 = new y2(0, state, jt.s0.class, "onRetry", "onRetry()V", 0, 1);
                    sVar2.o0(y2Var3);
                    objQ22 = y2Var3;
                }
                mz.e eVar2 = (mz.e) objQ22;
                t1.d dVarD6 = t1.e.d(1409198604, new l0(dVar, hintText, oVar), sVar2);
                t1.d dVarD7 = t1.e.d(1720589675, new f4(dVar2, b1Var13, pVar, b1Var15, z23, b0Var, state, b1Var14, b1Var16, b1Var9, a1Var), sVar2);
                sVar3 = sVar2;
                w1 w1Var2 = new w1(b3Var3, b1Var8, b1Var13, b1Var15, z23, b1Var14, a1Var5, a1Var6, b0Var, state, z16, b1Var2, oVar, zBooleanValue, onClickPlayAudio, b1Var7, a1Var4);
                b1Var11 = b1Var7;
                t1.d dVarD8 = t1.e.d(2031980746, w1Var2, sVar3);
                t1.d dVarD9 = t1.e.d(-1951595479, new g4(b1Var13, b1Var15, 0), sVar3);
                final boolean z28 = z16;
                t1.d dVarD10 = t1.e.d(353309947, new i4(b1Var, z28, sentenceItem, state, pVar, onClickPlayAudio, 0), sVar3);
                zF8 = sVar3.f(a1Var);
                objQ23 = sVar3.Q();
                l1.g gVar4 = gVar;
                if (zF8) {
                    objQ23 = new a2(a1Var, 2);
                    sVar3.o0(objQ23);
                } else {
                    objQ23 = new a2(a1Var, 2);
                    sVar3.o0(objQ23);
                }
                fz.c cVar4 = (fz.c) objQ23;
                zF9 = sVar3.f(b1Var11);
                objQ24 = sVar3.Q();
                if (zF9) {
                    objQ24 = new bp.h0(7, b1Var11);
                    sVar3.o0(objQ24);
                } else {
                    objQ24 = new bp.h0(7, b1Var11);
                    sVar3.o0(objQ24);
                }
                fz.c cVar5 = (fz.c) objQ24;
                zF10 = sVar3.f(a1Var4);
                objQ25 = sVar3.Q();
                if (zF10) {
                    objQ25 = new a2(a1Var4, 4);
                    sVar3.o0(objQ25);
                } else {
                    objQ25 = new a2(a1Var4, 4);
                    sVar3.o0(objQ25);
                }
                fz.c cVar6 = (fz.c) objQ25;
                if (i16 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zH3 = z17 | sVar3.h(sentenceItem);
                objQ26 = sVar3.Q();
                if (zH3) {
                    objQ26 = new m0(onClickPlayAudio, sentenceItem, 9);
                    sVar3.o0(objQ26);
                } else {
                    objQ26 = new m0(onClickPlayAudio, sentenceItem, 9);
                    sVar3.o0(objQ26);
                }
                fz.a aVar6 = (fz.a) objQ26;
                boolean zH5 = sVar3.h(b0Var) | sVar3.h(state);
                if ((i14 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zH5 | z18 | ((((i14 & 896) ^ 384) <= 256 && sVar3.f(aVar4)) || (i14 & 384) == 256);
                objQ27 = sVar3.Q();
                if (z19) {
                    b0.k0 k0Var2 = new b0.k0(b0Var, state, onClickChecked, aVar4, 5);
                    b0Var2 = b0Var;
                    sVar3.o0(k0Var2);
                    objQ27 = k0Var2;
                } else {
                    b0.k0 k0Var3 = new b0.k0(b0Var, state, onClickChecked, aVar4, 5);
                    b0Var2 = b0Var;
                    sVar3.o0(k0Var3);
                    objQ27 = k0Var3;
                }
                int i29 = (3670016 & (i14 << 6)) | ((i14 << 9) & 234881024) | (i22 & 1879048192);
                int i210 = i14 & 7168;
                b1Var12 = b1Var8;
                dt.k3.e(translation, qVar, lVar2, z24, z25, false, z26, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD6, dVarD7, dVarD8, dVarD9, null, dVarD10, zVarJ, cVar4, null, cVar5, cVar6, null, onClickSkipListen, aVar6, onClickBugReport, getComboCount, (fz.a) objQ27, sVar6, (fz.a) eVar2, onClickContinue, sVar3, 0, 819683328, i29, i210, 38027088, 0);
                sVar = sVar3;
                if (((Boolean) b3Var3.getValue()).booleanValue()) {
                    z20 = false;
                } else {
                    z20 = false;
                }
                zF11 = sVar.f(b1Var12);
                objQ28 = sVar.Q();
                if (zF11) {
                    objQ28 = new bp.p(18, b1Var12);
                    sVar.o0(objQ28);
                } else {
                    objQ28 = new bp.p(18, b1Var12);
                    sVar.o0(objQ28);
                }
                final rz.b0 b0Var4 = b0Var2;
                dt.e.K(z20, (fz.a) objQ28, null, t1.e.d(-527803163, new fz.e() { // from class: bt.c4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        l1.n nVar2 = (l1.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        l1.s sVar7 = (l1.s) nVar2;
                        if (sVar7.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            z1.r rVarB = j0.c.B(d0.n.y(j0.e2.i(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 320, 1), d0.n.u(sVar7), false, 14), 12, 16);
                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar7, 0);
                            int iHashCode2 = Long.hashCode(sVar7.T);
                            l1.q1 q1VarL2 = sVar7.l();
                            z1.r rVarC2 = z1.a.c(sVar7, rVarB);
                            y2.k.J.getClass();
                            y2.i iVar2 = y2.j.f56913b;
                            sVar7.h0();
                            if (sVar7.S) {
                                sVar7.k(iVar2);
                            } else {
                                sVar7.r0();
                            }
                            l1.t.J(y2.j.f56917f, uVarA, sVar7);
                            l1.t.J(y2.j.f56916e, q1VarL2, sVar7);
                            y2.h hVar2 = y2.j.f56918g;
                            if (sVar7.S || !kotlin.jvm.internal.m.a(sVar7.Q(), Integer.valueOf(iHashCode2))) {
                                defpackage.e.A(iHashCode2, sVar7, iHashCode2, hVar2);
                            }
                            l1.t.J(y2.j.f56915d, rVarC2, sVar7);
                            List list = (List) b1Var13.getValue();
                            rz.b0 b0Var5 = b0Var4;
                            boolean zH6 = sVar7.h(b0Var5);
                            jt.s0 s0Var = state;
                            boolean zH7 = zH6 | sVar7.h(s0Var);
                            boolean z29 = z28;
                            boolean zG3 = zH7 | sVar7.g(z29);
                            l1.b1 b1Var17 = b1Var2;
                            boolean zF13 = zG3 | sVar7.f(b1Var17);
                            ht.o oVar2 = courseTestParams;
                            boolean zF14 = zF13 | sVar7.f(oVar2);
                            boolean z210 = zBooleanValue;
                            boolean zG4 = zF14 | sVar7.g(z210);
                            fz.e eVar3 = onClickPlayAudio;
                            boolean zF15 = zG4 | sVar7.f(eVar3);
                            Object objQ32 = sVar7.Q();
                            if (zF15 || objQ32 == l1.m.f39353a) {
                                j4 j4Var = new j4(b0Var5, s0Var, z29, b1Var17, oVar2, z210, eVar3, 0);
                                sVar7.o0(j4Var);
                                objQ32 = j4Var;
                            }
                            b.y(list, b1Var15, z23, null, b1Var14, true, null, 0, false, null, (fz.c) objQ32, sVar7, 1769472, 0, 904);
                            sVar7.p(true);
                        } else {
                            sVar7.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar), sVar, 3072);
                h2Var = (jt.h2) b1Var16.getValue();
                if (h2Var == null) {
                    sVar.d0(-2053145062);
                    z21 = false;
                } else {
                    z21 = false;
                    sVar.d0(-2053145061);
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-1495265777, new at.h(19, h2Var, b1Var10), sVar), sVar, 56);
                }
                sVar.p(z21);
                sVar.p(true);
                aVar2 = aVar4;
            } else {
                sVar4.W();
                if ((i12 & 4096) != 0) {
                    i25 &= -897;
                }
            }
            aVar3 = aVar;
            sVar4.q();
            long j12 = courseTestParams.f33756d;
            final boolean zBooleanValue2 = ((Boolean) sVar4.j(ju.f.f37374h)).booleanValue();
            configuration = (Configuration) sVar4.j(AndroidCompositionLocals_androidKt.f1199a);
            i14 = i25;
            zD = sVar4.d(configuration.screenWidthDp) | sVar4.d(configuration.screenHeightDp);
            objQ = sVar4.Q();
            if (zD) {
                objQ = new qy.l(Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp));
                sVar4.o0(objQ);
            } else {
                objQ = new qy.l(Integer.valueOf(configuration.screenWidthDp), Integer.valueOf(configuration.screenHeightDp));
                sVar4.o0(objQ);
            }
            lVar = (qy.l) objQ;
            objQ2 = sVar4.Q();
            if (objQ2 == gVar2) {
                objQ2 = l1.t.q(sVar4);
                sVar4.o0(objQ2);
            }
            b0Var = (rz.b0) objQ2;
            b1Var = state.f37167j;
            b1Var2 = state.f37168k;
            final l1.b1 b1Var17 = state.f37173q;
            pVar = state.f37172p;
            final boolean z29 = state.f37162e;
            z13 = state.f37163f;
            aVar4 = aVar3;
            final l1.b1 b1Var18 = state.f37171o;
            strU = se.k.u(" ", pVar);
            strU2 = se.k.u(BuildConfig.VERSION_NAME, sentenceItem.getDisplayCourseWords());
            if (b1Var.getValue() == ht.q.WRONG) {
                zVarJ = se.k.j(courseTestParams, str, sentenceItem.getTranslation(), strU2, strU);
            } else {
                zVarJ = null;
            }
            Long lValueOf4 = Long.valueOf(j12);
            boolValueOf = Boolean.valueOf(z11);
            if ((i22 & 458752) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean zF13 = z14 | sVar4.f(b1Var2);
            i15 = i14 & 14;
            dVar3 = null;
            if (i15 == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            zH = zF13 | z15 | sVar4.h(sentenceItem);
            Object objQ32 = sVar4.Q();
            if (zH) {
                bool = boolValueOf;
                i16 = i15;
                sVar2 = sVar4;
                s1Var = new s1(z11, b1Var2, onClickPlayAudio, sentenceItem, null, 2);
                sVar2.o0(s1Var);
            } else {
                bool = boolValueOf;
                i16 = i15;
                sVar2 = sVar4;
                s1Var = new s1(z11, b1Var2, onClickPlayAudio, sentenceItem, null, 2);
                sVar2.o0(s1Var);
            }
            l1.t.g(lValueOf4, bool, (fz.e) s1Var, sVar2);
            y0VarB = ct.c.b(sVar2);
            jC = ct.c.c(sVar2);
            zE = sVar2.e(jC);
            objQ3 = sVar2.Q();
            if (zE) {
                objQ3 = l1.t.B(j3.y0.a(y0VarB, 0L, jC, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                sVar2.o0(objQ3);
            } else {
                objQ3 = l1.t.B(j3.y0.a(y0VarB, 0L, jC, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                sVar2.o0(objQ3);
            }
            final l1.b1 b1Var19 = (l1.b1) objQ3;
            zE2 = sVar2.e(j12);
            objQ4 = sVar2.Q();
            if (zE2) {
                i17 = 0;
                objQ4 = defpackage.e.v(0, sVar2);
            } else {
                i17 = 0;
                objQ4 = defpackage.e.v(0, sVar2);
            }
            a1Var = (l1.a1) objQ4;
            zE3 = sVar2.e(j12);
            objQ5 = sVar2.Q();
            if (zE3) {
                objQ5 = defpackage.e.v(i17, sVar2);
            } else {
                objQ5 = defpackage.e.v(i17, sVar2);
            }
            a1Var2 = (l1.a1) objQ5;
            zE4 = sVar2.e(j12);
            objQ6 = sVar2.Q();
            if (zE4) {
                objQ6 = defpackage.e.v(i17, sVar2);
            } else {
                objQ6 = defpackage.e.v(i17, sVar2);
            }
            a1Var3 = (l1.a1) objQ6;
            zE5 = sVar2.e(j12);
            objQ7 = sVar2.Q();
            if (zE5) {
                objQ7 = l1.t.B(null);
                sVar2.o0(objQ7);
            } else {
                objQ7 = l1.t.B(null);
                sVar2.o0(objQ7);
            }
            b1Var3 = (l1.b1) objQ7;
            zE6 = sVar2.e(j12);
            objQ8 = sVar2.Q();
            if (zE6) {
                objQ8 = defpackage.e.v(0, sVar2);
            } else {
                objQ8 = defpackage.e.v(0, sVar2);
            }
            a1Var4 = (l1.a1) objQ8;
            Object[] objArr5 = {Long.valueOf(j12)};
            zF = sVar2.f(lVar);
            objQ9 = sVar2.Q();
            if (zF) {
                objQ9 = new av.d(lVar, 16);
                sVar2.o0(objQ9);
            } else {
                objQ9 = new av.d(lVar, 16);
                sVar2.o0(objQ9);
            }
            b1Var4 = (l1.b1) w1.j.c(objArr5, (fz.a) objQ9, sVar2, 0);
            Object[] objArr6 = {Long.valueOf(j12)};
            objQ10 = sVar2.Q();
            if (objQ10 == gVar2) {
                objQ10 = new bq.u(6);
                sVar2.o0(objQ10);
            }
            b1Var5 = (l1.b1) w1.j.c(objArr6, (fz.a) objQ10, sVar2, 48);
            Object[] objArr7 = {Long.valueOf(j12)};
            objQ11 = sVar2.Q();
            if (objQ11 == gVar2) {
                objQ11 = new bq.u(7);
                sVar2.o0(objQ11);
            }
            b1Var6 = (l1.b1) w1.j.c(objArr7, (fz.a) objQ11, sVar2, 48);
            zF2 = sVar2.f((f2.c) b1Var3.getValue());
            objQ12 = sVar2.Q();
            if (zF2) {
                objQ12 = l1.t.s(new bp.p(15, b1Var3));
                sVar2.o0(objQ12);
            } else {
                objQ12 = l1.t.s(new bp.p(15, b1Var3));
                sVar2.o0(objQ12);
            }
            b3Var = (l1.b3) objQ12;
            l1.h1 h1Var3 = (l1.h1) a1Var2;
            l1.h1 h1Var4 = (l1.h1) a1Var3;
            zG = sVar2.g(z13) | sVar2.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar2.d(h1Var3.l()) | sVar2.d(h1Var4.l());
            Object objQ33 = sVar2.Q();
            if (zG) {
                objS = l1.t.s(new e4(0, b3Var, a1Var2, a1Var3, z13));
                sVar2.o0(objS);
            } else {
                objS = l1.t.s(new e4(0, b3Var, a1Var2, a1Var3, z13));
                sVar2.o0(objS);
            }
            b3Var2 = (l1.b3) objS;
            zG2 = sVar2.g(((Boolean) b1Var5.getValue()).booleanValue());
            objQ13 = sVar2.Q();
            if (zG2) {
                objQ13 = l1.t.s(new bp.p(16, b1Var5));
                sVar2.o0(objQ13);
            } else {
                objQ13 = l1.t.s(new bp.p(16, b1Var5));
                sVar2.o0(objQ13);
            }
            b3Var3 = (l1.b3) objQ13;
            Long lValueOf5 = Long.valueOf(j12);
            Boolean bool4 = (Boolean) b3Var2.getValue();
            bool4.getClass();
            Object[] objArr8 = {lValueOf5, bool4, Integer.valueOf(h1Var3.l()), Integer.valueOf(h1Var4.l()), (f2.c) b1Var3.getValue()};
            zF3 = sVar2.f(b3Var2) | sVar2.f(b1Var3) | sVar2.g(z13) | sVar2.f(a1Var2) | sVar2.f(a1Var3) | sVar2.f(b1Var5);
            objQ14 = sVar2.Q();
            if (zF3) {
                objQ14 = new u4(z13, b3Var2, b1Var3, a1Var2, a1Var3, b1Var5, null);
                b1Var7 = b1Var3;
                a1Var5 = a1Var2;
                a1Var6 = a1Var3;
                z16 = z13;
                sVar2.o0(objQ14);
            } else {
                objQ14 = new u4(z13, b3Var2, b1Var3, a1Var2, a1Var3, b1Var5, null);
                b1Var7 = b1Var3;
                a1Var5 = a1Var2;
                a1Var6 = a1Var3;
                z16 = z13;
                sVar2.o0(objQ14);
            }
            l1.t.i(objArr8, (fz.e) objQ14, sVar2);
            zF4 = sVar2.f(b1Var4) | sVar2.f(lVar) | sVar2.f(b1Var5) | sVar2.f(b1Var6);
            objQ15 = sVar2.Q();
            if (zF4) {
                objQ15 = new ad.x(lVar, b1Var4, b1Var5, b1Var6, null, 4);
                b1Var8 = b1Var6;
                sVar2.o0(objQ15);
            } else {
                objQ15 = new ad.x(lVar, b1Var4, b1Var5, b1Var6, null, 4);
                b1Var8 = b1Var6;
                sVar2.o0(objQ15);
            }
            l1.t.f((fz.e) objQ15, lVar, sVar2);
            Boolean bool5 = (Boolean) b3Var3.getValue();
            bool5.getClass();
            zF5 = sVar2.f(b3Var3) | sVar2.f(b1Var8);
            objQ16 = sVar2.Q();
            if (zF5) {
                objQ16 = new v4(b3Var3, b1Var8, dVar3, 0);
                sVar2.o0(objQ16);
            } else {
                objQ16 = new v4(b3Var3, b1Var8, dVar3, 0);
                sVar2.o0(objQ16);
            }
            l1.t.f((fz.e) objQ16, bool5, sVar2);
            zE7 = sVar2.e(j12);
            objQ17 = sVar2.Q();
            if (zE7) {
                objQ17 = l1.t.B(null);
                sVar2.o0(objQ17);
            } else {
                objQ17 = l1.t.B(null);
                sVar2.o0(objQ17);
            }
            b1Var9 = (l1.b1) objQ17;
            Long lValueOf6 = Long.valueOf(j12);
            zF6 = sVar2.f(pVar) | sVar2.f(b1Var9);
            objQ18 = sVar2.Q();
            if (zF6) {
                objQ18 = new b1.c(17, pVar, b1Var9, (vy.d) null);
                sVar2.o0(objQ18);
            } else {
                objQ18 = new b1.c(17, pVar, b1Var9, (vy.d) null);
                sVar2.o0(objQ18);
            }
            l1.t.f((fz.e) objQ18, lValueOf6, sVar2);
            zE8 = sVar2.e(j12);
            objQ19 = sVar2.Q();
            if (zE8) {
                objQ19 = l1.t.B(new f2.b(0L));
                sVar2.o0(objQ19);
            } else {
                objQ19 = l1.t.B(new f2.b(0L));
                sVar2.o0(objQ19);
            }
            b1Var10 = (l1.b1) objQ19;
            zF7 = sVar2.f(b1Var10);
            objQ20 = sVar2.Q();
            if (zF7) {
                objQ20 = new bp.h0(4, b1Var10);
                sVar2.o0(objQ20);
            } else {
                objQ20 = new bp.h0(4, b1Var10);
                sVar2.o0(objQ20);
            }
            z1.r rVarN2 = w2.a0.n(z1.o.f58481a, (fz.c) objQ20);
            w2.q0 q0VarD2 = j0.o.d(z1.c.f58463a, false);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarN2);
            y2.k.J.getClass();
            iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(y2.j.f56917f, q0VarD2, sVar2);
            l1.t.J(y2.j.f56916e, q1VarL2, sVar2);
            hVar = y2.j.f56918g;
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC2, sVar2);
            zE9 = sVar2.e(j12);
            objQ21 = sVar2.Q();
            if (zE9) {
                objQ21 = l1.t.B(null);
                sVar2.o0(objQ21);
            } else {
                objQ21 = l1.t.B(null);
                sVar2.o0(objQ21);
            }
            l1.b1 b1Var110 = (l1.b1) objQ21;
            if (z16) {
                translation = BuildConfig.VERSION_NAME;
            } else {
                translation = BuildConfig.VERSION_NAME;
            }
            ht.q qVar2 = (ht.q) b1Var.getValue();
            boolean z210 = !((Boolean) state.m.getValue()).booleanValue();
            ht.l lVar3 = (ht.l) b1Var2.getValue();
            boolean z211 = !((Boolean) b3Var3.getValue()).booleanValue();
            if (courseTestParams.f33768q) {
                c11 = 4;
                if (courseTestParams.f33755c == 4) {
                }
                ns.s sVar7 = (ns.s) state.f37170n.getValue();
                zH2 = sVar2.h(state);
                objQ22 = sVar2.Q();
                if (zH2) {
                    gVar = gVar2;
                    oVar = courseTestParams;
                    y2 y2Var4 = new y2(0, state, jt.s0.class, "onRetry", "onRetry()V", 0, 1);
                    sVar2.o0(y2Var4);
                    objQ22 = y2Var4;
                } else {
                    gVar = gVar2;
                    oVar = courseTestParams;
                    y2 y2Var5 = new y2(0, state, jt.s0.class, "onRetry", "onRetry()V", 0, 1);
                    sVar2.o0(y2Var5);
                    objQ22 = y2Var5;
                }
                mz.e eVar3 = (mz.e) objQ22;
                t1.d dVarD11 = t1.e.d(1409198604, new l0(dVar, hintText, oVar), sVar2);
                t1.d dVarD12 = t1.e.d(1720589675, new f4(dVar2, b1Var17, pVar, b1Var19, z29, b0Var, state, b1Var18, b1Var110, b1Var9, a1Var), sVar2);
                sVar3 = sVar2;
                w1 w1Var3 = new w1(b3Var3, b1Var8, b1Var17, b1Var19, z29, b1Var18, a1Var5, a1Var6, b0Var, state, z16, b1Var2, oVar, zBooleanValue2, onClickPlayAudio, b1Var7, a1Var4);
                b1Var11 = b1Var7;
                t1.d dVarD13 = t1.e.d(2031980746, w1Var3, sVar3);
                t1.d dVarD14 = t1.e.d(-1951595479, new g4(b1Var17, b1Var19, 0), sVar3);
                final boolean z212 = z16;
                t1.d dVarD15 = t1.e.d(353309947, new i4(b1Var, z212, sentenceItem, state, pVar, onClickPlayAudio, 0), sVar3);
                zF8 = sVar3.f(a1Var);
                objQ23 = sVar3.Q();
                l1.g gVar5 = gVar;
                if (zF8) {
                    objQ23 = new a2(a1Var, 2);
                    sVar3.o0(objQ23);
                } else {
                    objQ23 = new a2(a1Var, 2);
                    sVar3.o0(objQ23);
                }
                fz.c cVar7 = (fz.c) objQ23;
                zF9 = sVar3.f(b1Var11);
                objQ24 = sVar3.Q();
                if (zF9) {
                    objQ24 = new bp.h0(7, b1Var11);
                    sVar3.o0(objQ24);
                } else {
                    objQ24 = new bp.h0(7, b1Var11);
                    sVar3.o0(objQ24);
                }
                fz.c cVar8 = (fz.c) objQ24;
                zF10 = sVar3.f(a1Var4);
                objQ25 = sVar3.Q();
                if (zF10) {
                    objQ25 = new a2(a1Var4, 4);
                    sVar3.o0(objQ25);
                } else {
                    objQ25 = new a2(a1Var4, 4);
                    sVar3.o0(objQ25);
                }
                fz.c cVar9 = (fz.c) objQ25;
                if (i16 == 4) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                zH3 = z17 | sVar3.h(sentenceItem);
                objQ26 = sVar3.Q();
                if (zH3) {
                    objQ26 = new m0(onClickPlayAudio, sentenceItem, 9);
                    sVar3.o0(objQ26);
                } else {
                    objQ26 = new m0(onClickPlayAudio, sentenceItem, 9);
                    sVar3.o0(objQ26);
                }
                fz.a aVar7 = (fz.a) objQ26;
                boolean zH6 = sVar3.h(b0Var) | sVar3.h(state);
                if ((i14 & 112) == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                z19 = zH6 | z18 | ((((i14 & 896) ^ 384) <= 256 && sVar3.f(aVar4)) || (i14 & 384) == 256);
                objQ27 = sVar3.Q();
                if (z19) {
                    b0.k0 k0Var4 = new b0.k0(b0Var, state, onClickChecked, aVar4, 5);
                    b0Var2 = b0Var;
                    sVar3.o0(k0Var4);
                    objQ27 = k0Var4;
                } else {
                    b0.k0 k0Var5 = new b0.k0(b0Var, state, onClickChecked, aVar4, 5);
                    b0Var2 = b0Var;
                    sVar3.o0(k0Var5);
                    objQ27 = k0Var5;
                }
                int i211 = (3670016 & (i14 << 6)) | ((i14 << 9) & 234881024) | (i22 & 1879048192);
                int i212 = i14 & 7168;
                b1Var12 = b1Var8;
                dt.k3.e(translation, qVar2, lVar3, z210, z211, false, z26, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD11, dVarD12, dVarD13, dVarD14, null, dVarD15, zVarJ, cVar7, null, cVar8, cVar9, null, onClickSkipListen, aVar7, onClickBugReport, getComboCount, (fz.a) objQ27, sVar7, (fz.a) eVar3, onClickContinue, sVar3, 0, 819683328, i211, i212, 38027088, 0);
                sVar = sVar3;
                if (((Boolean) b3Var3.getValue()).booleanValue()) {
                    z20 = false;
                } else {
                    z20 = false;
                }
                zF11 = sVar.f(b1Var12);
                objQ28 = sVar.Q();
                if (zF11) {
                    objQ28 = new bp.p(18, b1Var12);
                    sVar.o0(objQ28);
                } else {
                    objQ28 = new bp.p(18, b1Var12);
                    sVar.o0(objQ28);
                }
                final rz.b0 b0Var5 = b0Var2;
                dt.e.K(z20, (fz.a) objQ28, null, t1.e.d(-527803163, new fz.e() { // from class: bt.c4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        l1.n nVar2 = (l1.n) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        l1.s sVar8 = (l1.s) nVar2;
                        if (sVar8.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                            z1.r rVarB = j0.c.B(d0.n.y(j0.e2.i(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 320, 1), d0.n.u(sVar8), false, 14), 12, 16);
                            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar8, 0);
                            int iHashCode2 = Long.hashCode(sVar8.T);
                            l1.q1 q1VarL3 = sVar8.l();
                            z1.r rVarC3 = z1.a.c(sVar8, rVarB);
                            y2.k.J.getClass();
                            y2.i iVar2 = y2.j.f56913b;
                            sVar8.h0();
                            if (sVar8.S) {
                                sVar8.k(iVar2);
                            } else {
                                sVar8.r0();
                            }
                            l1.t.J(y2.j.f56917f, uVarA, sVar8);
                            l1.t.J(y2.j.f56916e, q1VarL3, sVar8);
                            y2.h hVar2 = y2.j.f56918g;
                            if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode2))) {
                                defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar2);
                            }
                            l1.t.J(y2.j.f56915d, rVarC3, sVar8);
                            List list = (List) b1Var17.getValue();
                            rz.b0 b0Var6 = b0Var5;
                            boolean zH7 = sVar8.h(b0Var6);
                            jt.s0 s0Var = state;
                            boolean zH8 = zH7 | sVar8.h(s0Var);
                            boolean z213 = z212;
                            boolean zG3 = zH8 | sVar8.g(z213);
                            l1.b1 b1Var111 = b1Var2;
                            boolean zF14 = zG3 | sVar8.f(b1Var111);
                            ht.o oVar2 = courseTestParams;
                            boolean zF15 = zF14 | sVar8.f(oVar2);
                            boolean z214 = zBooleanValue2;
                            boolean zG4 = zF15 | sVar8.g(z214);
                            fz.e eVar4 = onClickPlayAudio;
                            boolean zF16 = zG4 | sVar8.f(eVar4);
                            Object objQ34 = sVar8.Q();
                            if (zF16 || objQ34 == l1.m.f39353a) {
                                j4 j4Var = new j4(b0Var6, s0Var, z213, b1Var111, oVar2, z214, eVar4, 0);
                                sVar8.o0(j4Var);
                                objQ34 = j4Var;
                            }
                            b.y(list, b1Var19, z29, null, b1Var18, true, null, 0, false, null, (fz.c) objQ34, sVar8, 1769472, 0, 904);
                            sVar8.p(true);
                        } else {
                            sVar8.W();
                        }
                        return qy.b0.f48488a;
                    }
                }, sVar), sVar, 3072);
                h2Var = (jt.h2) b1Var110.getValue();
                if (h2Var == null) {
                    sVar.d0(-2053145062);
                    z21 = false;
                } else {
                    z21 = false;
                    sVar.d0(-2053145061);
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-1495265777, new at.h(19, h2Var, b1Var10), sVar), sVar, 56);
                }
                sVar.p(z21);
                sVar.p(true);
                aVar2 = aVar4;
            } else {
                c11 = 4;
            }
            ns.s sVar8 = (ns.s) state.f37170n.getValue();
            zH2 = sVar2.h(state);
            objQ22 = sVar2.Q();
            if (zH2) {
                gVar = gVar2;
                oVar = courseTestParams;
                y2 y2Var6 = new y2(0, state, jt.s0.class, "onRetry", "onRetry()V", 0, 1);
                sVar2.o0(y2Var6);
                objQ22 = y2Var6;
            } else {
                gVar = gVar2;
                oVar = courseTestParams;
                y2 y2Var7 = new y2(0, state, jt.s0.class, "onRetry", "onRetry()V", 0, 1);
                sVar2.o0(y2Var7);
                objQ22 = y2Var7;
            }
            mz.e eVar4 = (mz.e) objQ22;
            t1.d dVarD16 = t1.e.d(1409198604, new l0(dVar, hintText, oVar), sVar2);
            t1.d dVarD17 = t1.e.d(1720589675, new f4(dVar2, b1Var17, pVar, b1Var19, z29, b0Var, state, b1Var18, b1Var110, b1Var9, a1Var), sVar2);
            sVar3 = sVar2;
            w1 w1Var4 = new w1(b3Var3, b1Var8, b1Var17, b1Var19, z29, b1Var18, a1Var5, a1Var6, b0Var, state, z16, b1Var2, oVar, zBooleanValue2, onClickPlayAudio, b1Var7, a1Var4);
            b1Var11 = b1Var7;
            t1.d dVarD18 = t1.e.d(2031980746, w1Var4, sVar3);
            t1.d dVarD19 = t1.e.d(-1951595479, new g4(b1Var17, b1Var19, 0), sVar3);
            final boolean z213 = z16;
            t1.d dVarD110 = t1.e.d(353309947, new i4(b1Var, z213, sentenceItem, state, pVar, onClickPlayAudio, 0), sVar3);
            zF8 = sVar3.f(a1Var);
            objQ23 = sVar3.Q();
            l1.g gVar6 = gVar;
            if (zF8) {
                objQ23 = new a2(a1Var, 2);
                sVar3.o0(objQ23);
            } else {
                objQ23 = new a2(a1Var, 2);
                sVar3.o0(objQ23);
            }
            fz.c cVar10 = (fz.c) objQ23;
            zF9 = sVar3.f(b1Var11);
            objQ24 = sVar3.Q();
            if (zF9) {
                objQ24 = new bp.h0(7, b1Var11);
                sVar3.o0(objQ24);
            } else {
                objQ24 = new bp.h0(7, b1Var11);
                sVar3.o0(objQ24);
            }
            fz.c cVar11 = (fz.c) objQ24;
            zF10 = sVar3.f(a1Var4);
            objQ25 = sVar3.Q();
            if (zF10) {
                objQ25 = new a2(a1Var4, 4);
                sVar3.o0(objQ25);
            } else {
                objQ25 = new a2(a1Var4, 4);
                sVar3.o0(objQ25);
            }
            fz.c cVar12 = (fz.c) objQ25;
            if (i16 == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            zH3 = z17 | sVar3.h(sentenceItem);
            objQ26 = sVar3.Q();
            if (zH3) {
                objQ26 = new m0(onClickPlayAudio, sentenceItem, 9);
                sVar3.o0(objQ26);
            } else {
                objQ26 = new m0(onClickPlayAudio, sentenceItem, 9);
                sVar3.o0(objQ26);
            }
            fz.a aVar8 = (fz.a) objQ26;
            boolean zH7 = sVar3.h(b0Var) | sVar3.h(state);
            if ((i14 & 112) == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            z19 = zH7 | z18 | ((((i14 & 896) ^ 384) <= 256 && sVar3.f(aVar4)) || (i14 & 384) == 256);
            objQ27 = sVar3.Q();
            if (z19) {
                b0.k0 k0Var6 = new b0.k0(b0Var, state, onClickChecked, aVar4, 5);
                b0Var2 = b0Var;
                sVar3.o0(k0Var6);
                objQ27 = k0Var6;
            } else {
                b0.k0 k0Var7 = new b0.k0(b0Var, state, onClickChecked, aVar4, 5);
                b0Var2 = b0Var;
                sVar3.o0(k0Var7);
                objQ27 = k0Var7;
            }
            int i213 = (3670016 & (i14 << 6)) | ((i14 << 9) & 234881024) | (i22 & 1879048192);
            int i214 = i14 & 7168;
            b1Var12 = b1Var8;
            dt.k3.e(translation, qVar2, lVar3, z210, z211, false, z26, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD16, dVarD17, dVarD18, dVarD19, null, dVarD110, zVarJ, cVar10, null, cVar11, cVar12, null, onClickSkipListen, aVar8, onClickBugReport, getComboCount, (fz.a) objQ27, sVar8, (fz.a) eVar4, onClickContinue, sVar3, 0, 819683328, i213, i214, 38027088, 0);
            sVar = sVar3;
            if (((Boolean) b3Var3.getValue()).booleanValue()) {
                z20 = false;
            } else {
                z20 = false;
            }
            zF11 = sVar.f(b1Var12);
            objQ28 = sVar.Q();
            if (zF11) {
                objQ28 = new bp.p(18, b1Var12);
                sVar.o0(objQ28);
            } else {
                objQ28 = new bp.p(18, b1Var12);
                sVar.o0(objQ28);
            }
            final rz.b0 b0Var6 = b0Var2;
            dt.e.K(z20, (fz.a) objQ28, null, t1.e.d(-527803163, new fz.e() { // from class: bt.c4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    l1.s sVar9 = (l1.s) nVar2;
                    if (sVar9.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        z1.r rVarB = j0.c.B(d0.n.y(j0.e2.i(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 320, 1), d0.n.u(sVar9), false, 14), 12, 16);
                        j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar9, 0);
                        int iHashCode2 = Long.hashCode(sVar9.T);
                        l1.q1 q1VarL3 = sVar9.l();
                        z1.r rVarC3 = z1.a.c(sVar9, rVarB);
                        y2.k.J.getClass();
                        y2.i iVar2 = y2.j.f56913b;
                        sVar9.h0();
                        if (sVar9.S) {
                            sVar9.k(iVar2);
                        } else {
                            sVar9.r0();
                        }
                        l1.t.J(y2.j.f56917f, uVarA, sVar9);
                        l1.t.J(y2.j.f56916e, q1VarL3, sVar9);
                        y2.h hVar2 = y2.j.f56918g;
                        if (sVar9.S || !kotlin.jvm.internal.m.a(sVar9.Q(), Integer.valueOf(iHashCode2))) {
                            defpackage.e.A(iHashCode2, sVar9, iHashCode2, hVar2);
                        }
                        l1.t.J(y2.j.f56915d, rVarC3, sVar9);
                        List list = (List) b1Var17.getValue();
                        rz.b0 b0Var7 = b0Var6;
                        boolean zH8 = sVar9.h(b0Var7);
                        jt.s0 s0Var = state;
                        boolean zH9 = zH8 | sVar9.h(s0Var);
                        boolean z214 = z213;
                        boolean zG3 = zH9 | sVar9.g(z214);
                        l1.b1 b1Var111 = b1Var2;
                        boolean zF14 = zG3 | sVar9.f(b1Var111);
                        ht.o oVar2 = courseTestParams;
                        boolean zF15 = zF14 | sVar9.f(oVar2);
                        boolean z215 = zBooleanValue2;
                        boolean zG4 = zF15 | sVar9.g(z215);
                        fz.e eVar5 = onClickPlayAudio;
                        boolean zF16 = zG4 | sVar9.f(eVar5);
                        Object objQ34 = sVar9.Q();
                        if (zF16 || objQ34 == l1.m.f39353a) {
                            j4 j4Var = new j4(b0Var7, s0Var, z214, b1Var111, oVar2, z215, eVar5, 0);
                            sVar9.o0(j4Var);
                            objQ34 = j4Var;
                        }
                        b.y(list, b1Var19, z29, null, b1Var18, true, null, 0, false, null, (fz.c) objQ34, sVar9, 1769472, 0, 904);
                        sVar9.p(true);
                    } else {
                        sVar9.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, 3072);
            h2Var = (jt.h2) b1Var110.getValue();
            if (h2Var == null) {
                sVar.d0(-2053145062);
                z21 = false;
            } else {
                z21 = false;
                sVar.d0(-2053145061);
                l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-1495265777, new at.h(19, h2Var, b1Var10), sVar), sVar, 56);
            }
            sVar.p(z21);
            sVar.p(true);
            aVar2 = aVar4;
        } else {
            sVar = sVar4;
            sVar.W();
            aVar2 = aVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: bt.d4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    b.B(sentenceItem, state, courseTestParams, hintText, str, z11, z12, dVar, dVar2, getComboCount, onClickPlayAudio, onClickChecked, aVar2, onClickContinue, onClickSkipListen, onClickBugReport, (l1.n) obj, iM, i12);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01ed A[EDGE_INSN: B:110:0x01ed->B:111:0x01ee BREAK  A[LOOP:0: B:73:0x0156->B:104:0x01d0]] */
    /* JADX WARN: Code duplicated, block: B:96:0x01b9  */
    public static final void C(final List optionWords, final x1.p displayWords, final l1.b1 currentTextStyle, final boolean z11, final fz.c onClickStem, final fz.c onResortStems, final l1.b1 optionItemState, final fz.c updateDragState, final boolean z12, final Integer num, final int i11, l1.n nVar, final int i12) {
        x1.s sVar;
        float f5;
        i8 i8Var;
        v3.m mVar;
        i8 i8Var2;
        i8 i8Var3;
        kotlin.jvm.internal.m.f(optionWords, "optionWords");
        kotlin.jvm.internal.m.f(displayWords, "displayWords");
        kotlin.jvm.internal.m.f(currentTextStyle, "currentTextStyle");
        kotlin.jvm.internal.m.f(onClickStem, "onClickStem");
        kotlin.jvm.internal.m.f(onResortStems, "onResortStems");
        kotlin.jvm.internal.m.f(updateDragState, "updateDragState");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1319479242);
        int i13 = i12 | (sVar2.h(optionWords) ? 4 : 2) | (sVar2.f(displayWords) ? 32 : 16) | (sVar2.f(currentTextStyle) ? 256 : 128) | (sVar2.g(z11) ? 2048 : 1024) | (sVar2.h(onClickStem) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onResortStems) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.f(optionItemState) ? 1048576 : 524288) | (sVar2.h(updateDragState) ? 8388608 : 4194304) | (sVar2.f(num) ? 536870912 : 268435456);
        if (sVar2.T(i13 & 1, ((306783379 & i13) == 306783378 && ((sVar2.d(i11) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            sVar2.Y();
            if ((i12 & 1) != 0 && !sVar2.C()) {
                sVar2.W();
            }
            sVar2.q();
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new HashMap();
                sVar2.o0(objQ);
            }
            final HashMap displayWordLayoutCoordinates = (HashMap) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new x1.s();
                sVar2.o0(objQ2);
            }
            x1.s sVar3 = (x1.s) objQ2;
            v3.m layoutDirection = dt.d4.g(sVar2);
            v3.c cVar = (v3.c) sVar2.j(z2.g1.f58547h);
            boolean zF = sVar2.f(cVar);
            Object objQ3 = sVar2.Q();
            if (zF || objQ3 == gVar) {
                objQ3 = Float.valueOf(cVar.e0(12));
                sVar2.o0(objQ3);
            }
            float fFloatValue = ((Number) objQ3).floatValue();
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = new p0.c();
                sVar2.o0(objQ4);
            }
            final p0.c cVar2 = (p0.c) objQ4;
            if (num != null) {
                int iIntValue = num.intValue();
                ListIterator listIterator = displayWords.listIterator();
                int iMax = 0;
                boolean z13 = false;
                Integer numValueOf = null;
                while (true) {
                    sy.a aVar = (sy.a) listIterator;
                    if (!aVar.hasNext()) {
                        sVar = sVar3;
                        f5 = fFloatValue;
                        if (numValueOf == null) {
                            i8Var2 = null;
                            break;
                        }
                        int iIntValue2 = numValueOf.intValue();
                        if (!z13) {
                            i8Var2 = null;
                            break;
                        } else {
                            i8Var2 = new i8(iIntValue2, iMax);
                            break;
                        }
                    }
                    CourseWord courseWord = (CourseWord) aVar.next();
                    f5 = fFloatValue;
                    h8 h8Var = (h8) sVar3.get(Integer.valueOf(courseWord.getRandomId()));
                    sVar = sVar3;
                    if (h8Var != null) {
                        int i14 = h8Var.f5502b;
                        int i15 = h8Var.f5501a;
                        if (numValueOf == null || Math.abs(i15 - numValueOf.intValue()) > 8) {
                            if (numValueOf != null) {
                                int iIntValue3 = numValueOf.intValue();
                                if (z13) {
                                    i8Var3 = new i8(iIntValue3, iMax);
                                } else {
                                    i8Var3 = null;
                                }
                            } else {
                                i8Var3 = null;
                            }
                            if (i8Var3 != null) {
                                i8Var2 = i8Var3;
                                break;
                            } else {
                                numValueOf = Integer.valueOf(i15);
                                z13 = courseWord.getRandomId() == iIntValue;
                                iMax = i14;
                            }
                        } else {
                            iMax = Math.max(iMax, i14);
                            z13 = z13 || courseWord.getRandomId() == iIntValue;
                        }
                    }
                    fFloatValue = f5;
                    sVar3 = sVar;
                }
                i8Var = i8Var2;
            } else {
                sVar = sVar3;
                f5 = fFloatValue;
                i8Var = null;
            }
            int i16 = ((i13 >> 3) & 14) | ((i13 >> 15) & 112) | ((i13 >> 6) & 7168) | 24576;
            kotlin.jvm.internal.m.f(displayWords, "displayWords");
            kotlin.jvm.internal.m.f(optionItemState, "optionItemState");
            kotlin.jvm.internal.m.f(displayWordLayoutCoordinates, "displayWordLayoutCoordinates");
            kotlin.jvm.internal.m.f(onResortStems, "onResortStems");
            kotlin.jvm.internal.m.f(layoutDirection, "layoutDirection");
            Object objQ5 = sVar2.Q();
            if (objQ5 == l1.m.f39353a) {
                mVar = layoutDirection;
                objQ5 = new jt.i2(l1.t.B(null), l1.t.B(new f2.b(9205357640488583168L)), l1.t.B(new f2.b(9205357640488583168L)), l1.t.B(null), mVar);
                sVar2.o0(objQ5);
            } else {
                mVar = layoutDirection;
            }
            final jt.i2 i2Var = (jt.i2) objQ5;
            int i17 = (i16 & 14) | 3072 | (i16 & 112) | (i16 & 896);
            int i18 = i16 << 3;
            hz.b.c(displayWords, optionItemState, displayWordLayoutCoordinates, i2Var, onResortStems, z12, sVar2, (i18 & 458752) | i17 | (57344 & i18));
            final i8 i8Var4 = i8Var;
            final v3.m mVar2 = mVar;
            final float f11 = f5;
            final x1.s sVar4 = sVar;
            sVar2 = sVar2;
            l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-333247242, new fz.e() { // from class: bt.m4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    Object b5Var;
                    l1.a1 a1Var;
                    qy.b0 b0Var;
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue4 = ((Integer) obj2).intValue();
                    l1.s sVar5 = (l1.s) nVar2;
                    boolean zT = sVar5.T(iIntValue4 & 1, (iIntValue4 & 3) != 2);
                    qy.b0 b0Var2 = qy.b0.f48488a;
                    if (!zT) {
                        sVar5.W();
                        return b0Var2;
                    }
                    Object objQ6 = sVar5.Q();
                    l1.g gVar2 = l1.m.f39353a;
                    if (objQ6 == gVar2) {
                        objQ6 = defpackage.e.v(0, sVar5);
                    }
                    final l1.a1 a1Var2 = (l1.a1) objQ6;
                    Object objQ7 = sVar5.Q();
                    if (objQ7 == gVar2) {
                        objQ7 = defpackage.e.v(0, sVar5);
                    }
                    final l1.a1 a1Var3 = (l1.a1) objQ7;
                    Object objQ8 = sVar5.Q();
                    if (objQ8 == gVar2) {
                        objQ8 = defpackage.e.v(0, sVar5);
                    }
                    l1.a1 a1Var4 = (l1.a1) objQ8;
                    final jt.i2 i2Var2 = i2Var;
                    boolean zF2 = sVar5.f(i2Var2);
                    Object objQ9 = sVar5.Q();
                    if (zF2 || objQ9 == gVar2) {
                        objQ9 = new p4(i2Var2, 0);
                        sVar5.o0(objQ9);
                    }
                    z1.o oVar = z1.o.f58481a;
                    z1.r rVarN = w2.a0.n(oVar, (fz.c) objQ9);
                    z1.j jVar = z1.c.f58463a;
                    w2.q0 q0VarD = j0.o.d(jVar, false);
                    int iHashCode = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL = sVar5.l();
                    z1.r rVarC = z1.a.c(sVar5, rVarN);
                    y2.k.J.getClass();
                    y2.i iVar = y2.j.f56913b;
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    y2.h hVar = y2.j.f56917f;
                    l1.t.J(hVar, q0VarD, sVar5);
                    y2.h hVar2 = y2.j.f56916e;
                    l1.t.J(hVar2, q1VarL, sVar5);
                    y2.h hVar3 = y2.j.f56918g;
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode))) {
                        defpackage.e.A(iHashCode, sVar5, iHashCode, hVar3);
                    }
                    y2.h hVar4 = y2.j.f56915d;
                    l1.t.J(hVar4, rVarC, sVar5);
                    Object objQ10 = sVar5.Q();
                    if (objQ10 == gVar2) {
                        objQ10 = new a2(a1Var2, 3);
                        sVar5.o0(objQ10);
                    }
                    z1.r rVarN2 = w2.a0.n(oVar, (fz.c) objQ10);
                    w2.q0 q0VarD2 = j0.o.d(jVar, false);
                    int iHashCode2 = Long.hashCode(sVar5.T);
                    l1.q1 q1VarL2 = sVar5.l();
                    z1.r rVarC2 = z1.a.c(sVar5, rVarN2);
                    sVar5.h0();
                    if (sVar5.S) {
                        sVar5.k(iVar);
                    } else {
                        sVar5.r0();
                    }
                    l1.t.J(hVar, q0VarD2, sVar5);
                    l1.t.J(hVar2, q1VarL2, sVar5);
                    if (sVar5.S || !kotlin.jvm.internal.m.a(sVar5.Q(), Integer.valueOf(iHashCode2))) {
                        defpackage.e.A(iHashCode2, sVar5, iHashCode2, hVar3);
                    }
                    l1.t.J(hVar4, rVarC2, sVar5);
                    Object objQ11 = sVar5.Q();
                    if (objQ11 == gVar2) {
                        objQ11 = new br.b(14);
                        sVar5.o0(objQ11);
                    }
                    z1.r rVarV = dt.a0.v(g2.f0.q(oVar, (fz.c) objQ11));
                    CourseWord courseWord2 = (CourseWord) ry.m.q0(optionWords);
                    final l1.b1 b1Var = currentTextStyle;
                    z1.r rVarA = oVar;
                    dt.g4.b(courseWord2, (j3.y0) b1Var.getValue(), rVarV, false, null, false, false, false, 0, null, sVar5, 0, 1016);
                    sVar5.p(true);
                    final long j11 = ((h1.s1) sVar5.j(h1.v1.f31180a)).A;
                    jt.h2 h2Var = (jt.h2) i2Var2.f36976a.getValue();
                    fz.c cVar3 = updateDragState;
                    if (h2Var != null) {
                        cVar3.invoke(h2Var);
                    } else {
                        cVar3.invoke(null);
                    }
                    Integer numValueOf2 = Integer.valueOf(((l1.h1) a1Var4).l());
                    Integer numValueOf3 = Integer.valueOf(i11);
                    Integer num2 = num;
                    i8 i8Var5 = i8Var4;
                    Object[] objArr = {num2, i8Var5, numValueOf2, numValueOf3};
                    boolean zF3 = sVar5.f(i8Var5);
                    final p0.c cVar4 = cVar2;
                    boolean zH = zF3 | sVar5.h(cVar4);
                    float f12 = f11;
                    boolean zC = zH | sVar5.c(f12);
                    Object objQ12 = sVar5.Q();
                    if (zC || objQ12 == gVar2) {
                        a1Var = a1Var4;
                        b5Var = new b5(i8Var5, cVar4, f12, a1Var, (vy.d) null);
                        sVar5.o0(b5Var);
                    } else {
                        b5Var = objQ12;
                        a1Var = a1Var4;
                    }
                    l1.t.i(objArr, (fz.e) b5Var, sVar5);
                    final boolean z14 = z11;
                    if (z14) {
                        sVar5.d0(770608176);
                        boolean zF4 = sVar5.f(i2Var2);
                        Object objQ13 = sVar5.Q();
                        if (zF4 || objQ13 == gVar2) {
                            objQ13 = new a1.d(i2Var2, 1);
                            sVar5.o0(objQ13);
                        }
                        b0Var = b0Var2;
                        rVarA = s2.g0.a(rVarA, b0Var, (PointerInputEventHandler) objQ13);
                        sVar5.p(false);
                    } else {
                        b0Var = b0Var2;
                        sVar5.d0(771743582);
                        sVar5.p(false);
                    }
                    l1.w1 w1VarA = z2.g1.f58552n.a(mVar2);
                    final x1.p pVar = displayWords;
                    final fz.c cVar5 = onClickStem;
                    final HashMap map = displayWordLayoutCoordinates;
                    final z1.r rVar = rVarA;
                    final x1.s sVar6 = sVar4;
                    final l1.a1 a1Var5 = a1Var;
                    l1.t.a(w1VarA, t1.e.d(1290506556, new fz.e() { // from class: bt.q4
                        @Override // fz.e
                        public final Object invoke(Object obj3, Object obj4) {
                            l1.a1 a1Var6;
                            l1.n nVar3 = (l1.n) obj3;
                            int iIntValue5 = ((Integer) obj4).intValue();
                            l1.s sVar7 = (l1.s) nVar3;
                            if (sVar7.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                float f13 = 8;
                                j0.g gVarG = j0.i.g(f13);
                                j0.g gVarG2 = j0.i.g(f13);
                                z1.r rVarE = j0.e2.e(p0.d.a(rVar, cVar4), 1.0f);
                                Object objQ14 = sVar7.Q();
                                l1.a1 a1Var7 = a1Var3;
                                l1.g gVar3 = l1.m.f39353a;
                                if (objQ14 == gVar3) {
                                    objQ14 = new au.d1(19, a1Var7, a1Var5);
                                    sVar7.o0(objQ14);
                                }
                                z1.r rVarN3 = w2.a0.n(rVarE, (fz.c) objQ14);
                                long j12 = j11;
                                boolean zE = sVar7.e(j12);
                                Object objQ15 = sVar7.Q();
                                l1.a1 a1Var8 = a1Var2;
                                if (zE || objQ15 == gVar3) {
                                    a1Var6 = a1Var8;
                                    au.j jVar2 = new au.j(1, j12, a1Var6, a1Var7);
                                    sVar7.o0(jVar2);
                                    objQ15 = jVar2;
                                } else {
                                    a1Var6 = a1Var8;
                                }
                                z1.r rVarE2 = j0.c.E(d2.h.d(rVarN3, (fz.c) objQ15), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 16, 7);
                                int iL = ((l1.h1) a1Var6).l() * 2;
                                v3.c cVar6 = (v3.c) sVar7.j(z2.g1.f58547h);
                                kotlin.jvm.internal.m.f(cVar6, "<this>");
                                j0.c.c(j0.e2.i(rVarE2, cVar6.Q(iL) + f13, CropImageView.DEFAULT_ASPECT_RATIO, 2), gVarG, gVarG2, null, 0, 0, t1.e.d(1841884897, new y1(pVar, i2Var2, z14, cVar5, map, sVar6, b1Var), sVar7), sVar7, 1573296, 56);
                            } else {
                                sVar7.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar5), sVar5, 56);
                    sVar5.p(true);
                    return b0Var;
                }
            }, sVar2), sVar2, 56);
        } else {
            sVar2.W();
        }
        l1.x1 x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(optionWords, displayWords, currentTextStyle, z11, onClickStem, onResortStems, optionItemState, updateDragState, z12, num, i11, i12) { // from class: bt.n4
                public final /* synthetic */ fz.c H;
                public final /* synthetic */ boolean K;
                public final /* synthetic */ Integer L;
                public final /* synthetic */ int M;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f5757a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x1.p f5758b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ l1.b1 f5759c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f5760d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ fz.c f5761e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.c f5762f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ l1.b1 f5763t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(100663297);
                    b.C(this.f5757a, this.f5758b, this.f5759c, this.f5760d, this.f5761e, this.f5762f, this.f5763t, this.H, this.K, this.L, this.M, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void D(ot.s data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-900975807);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            jt.j0 j0VarT = jh.h.t(data.f45981a, data.f45983c, data.f45982b, sVar);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new o5(d0Var, 2);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean zH = (i13 == 256) | sVar.h(j0VarT);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new k3(d0Var, j0VarT, 1);
                sVar.o0(objQ2);
            }
            fz.e eVar = (fz.e) objQ2;
            boolean z12 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z12 || objQ3 == gVar) {
                objQ3 = new v(d0Var, 8);
                sVar.o0(objQ3);
            }
            fz.c cVar = (fz.c) objQ3;
            boolean z13 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z13 || objQ4 == gVar) {
                objQ4 = new o5(d0Var, 3);
                sVar.o0(objQ4);
            }
            fz.a aVar2 = (fz.a) objQ4;
            int i14 = i12 & 112;
            boolean z14 = (i13 == 256) | (i14 == 32);
            Object objQ5 = sVar.Q();
            if (z14 || objQ5 == gVar) {
                objQ5 = new e0(d0Var, courseTestParams, 10);
                sVar.o0(objQ5);
            }
            E(j0VarT, courseTestParams, aVar, eVar, cVar, aVar2, (fz.c) objQ5, sVar, i14);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var, i11, 15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v26 */
    public static final void E(jt.j0 state, ht.o courseTestParams, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickChecked, fz.a onClickContinue, fz.c onClickBugReport, l1.n nVar, int i11) {
        l1.s sVar;
        boolean z11;
        Object next;
        int i12;
        ns.z zVarJ;
        Object next2;
        ?? r9;
        String sentence;
        kotlin.jvm.internal.m.f(state, "state");
        l1.b1 b1Var = state.f36994f;
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(229026328);
        int i13 = i11 | (sVar2.h(state) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.h(getComboCount) ? 256 : 128) | (sVar2.h(onClickPlayAudio) ? 2048 : 1024) | (sVar2.h(onClickChecked) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickContinue) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickBugReport) ? 1048576 : 524288);
        if (sVar2.T(i13 & 1, (599187 & i13) != 599186)) {
            boolean zBooleanValue = ((Boolean) sVar2.j(ju.f.f37372f)).booleanValue();
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            boolean z12 = state.f36991c;
            l1.b1 b1Var2 = state.f36992d;
            l1.b1 b1Var3 = state.f36993e;
            List list = (List) b1Var.getValue();
            boolean zF = sVar2.f(list);
            Object objQ2 = sVar2.Q();
            if (zF || objQ2 == gVar) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = z12;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        z11 = z12;
                        if (((CourseSentence) next).getSentenceId() == state.f36990b) {
                            break;
                        } else {
                            z12 = z11;
                        }
                    }
                }
                kotlin.jvm.internal.m.c(next);
                objQ2 = (CourseSentence) next;
                sVar2.o0(objQ2);
            } else {
                z11 = z12;
            }
            CourseSentence courseSentence = (CourseSentence) objQ2;
            CourseSentence courseSentence2 = state.f36989a;
            int i14 = i13 & 7168;
            boolean zG = (i14 == 2048) | sVar2.g(zBooleanValue) | sVar2.h(state);
            Object objQ3 = sVar2.Q();
            if (zG || objQ3 == gVar) {
                i12 = i14;
                t5 t5Var = new t5(zBooleanValue, onClickPlayAudio, state, (vy.d) null, 0);
                zVarJ = null;
                sVar2.o0(t5Var);
                objQ3 = t5Var;
            } else {
                i12 = i14;
                zVarJ = null;
            }
            l1.t.f((fz.e) objQ3, courseSentence2, sVar2);
            boolean zF2 = sVar2.f((List) b1Var.getValue());
            Object objQ4 = sVar2.Q();
            if (zF2 || objQ4 == gVar) {
                Iterator it2 = ((Iterable) b1Var.getValue()).iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = zVarJ;
                        break;
                    }
                    next2 = it2.next();
                } while (((CourseSentence) next2).getSelectedState() == OptionItemSelectedState.DEFAULT);
                objQ4 = (CourseSentence) next2;
                sVar2.o0(objQ4);
            }
            CourseSentence courseSentence3 = (CourseSentence) objQ4;
            if (b1Var2.getValue() == ht.q.WRONG) {
                String translation = courseSentence.getTranslation();
                String sentence2 = courseSentence.getSentence();
                if (courseSentence3 != null) {
                    sentence = courseSentence3.getSentence();
                } else {
                    r9 = zVarJ;
                }
                if (r9 == 0) {
                    r9 = sentence;
                    r9 = BuildConfig.VERSION_NAME;
                }
                r9 = sentence;
                zVarJ = se.k.j(courseTestParams, "sent_m8_qa_select_sent", translation, sentence2, r9);
            }
            ht.q qVar = (ht.q) b1Var2.getValue();
            ht.l lVar = (ht.l) b1Var3.getValue();
            t1.d dVarD = t1.e.d(-842545066, new b0(courseTestParams, 4), sVar2);
            t1.d dVarD2 = t1.e.d(710542295, new bp.f0(b1Var2, state, b1Var3, courseTestParams, onClickPlayAudio, courseSentence3, 2), sVar2);
            t1.d dVarD3 = t1.e.d(-2031337640, new bp.b0(state, z11, b0Var, 4), sVar2);
            t1.d dVarD4 = t1.e.d(1235963463, new f3(b1Var2, courseSentence, onClickPlayAudio, 2), sVar2);
            boolean zH = (i12 == 2048) | sVar2.h(courseSentence);
            Object objQ5 = sVar2.Q();
            if (zH || objQ5 == gVar) {
                objQ5 = new m0(onClickPlayAudio, courseSentence, 10);
                sVar2.o0(objQ5);
            }
            fz.a aVar = (fz.a) objQ5;
            boolean zH2 = sVar2.h(b0Var) | sVar2.h(state) | ((57344 & i13) == 16384) | sVar2.f(b1Var2);
            Object objQ6 = sVar2.Q();
            if (zH2 || objQ6 == gVar) {
                g3 g3Var = new g3(b0Var, state, onClickChecked, b1Var2, 1);
                sVar2.o0(g3Var);
                objQ6 = g3Var;
            }
            sVar = sVar2;
            dt.k3.e(null, qVar, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, null, aVar, onClickBugReport, getComboCount, (fz.a) objQ6, null, null, onClickContinue, sVar, 0, 807100416, ((i13 << 6) & 234881024) | ((i13 << 21) & 1879048192), (i13 >> 6) & 7168, 132530169, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h3(state, courseTestParams, getComboCount, onClickPlayAudio, onClickChecked, onClickContinue, onClickBugReport, i11, 1);
        }
    }

    public static final void F(ot.u data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(653763998);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            jt.m1 m1VarU = md.a.u(data.f46006a, data.f46007b, data.f46008c, Long.valueOf(courseTestParams.f33756d), sVar, 6, 1048544);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new o5(d0Var, 4);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean zH = (i13 == 256) | sVar.h(m1VarU);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new d2(d0Var, m1VarU, 1);
                sVar.o0(objQ2);
            }
            fz.e eVar = (fz.e) objQ2;
            boolean z12 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z12 || objQ3 == gVar) {
                objQ3 = new v(d0Var, 9);
                sVar.o0(objQ3);
            }
            fz.c cVar = (fz.c) objQ3;
            boolean z13 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z13 || objQ4 == gVar) {
                objQ4 = new o5(d0Var, 5);
                sVar.o0(objQ4);
            }
            fz.a aVar2 = (fz.a) objQ4;
            int i14 = i12 & 112;
            boolean z14 = (i13 == 256) | (i14 == 32);
            Object objQ5 = sVar.Q();
            if (z14 || objQ5 == gVar) {
                objQ5 = new e0(d0Var, courseTestParams, 11);
                sVar.o0(objQ5);
            }
            G(m1VarU, courseTestParams, aVar, eVar, cVar, aVar2, (fz.c) objQ5, sVar, i14);
            sVar = sVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var, i11, 16);
        }
    }

    public static final void G(final jt.m1 state, ht.o courseTestParams, fz.a getComboCount, final fz.e onClickPlayAudio, fz.c onClickChecked, fz.a onClickContinue, fz.c onClickBugReport, l1.n nVar, int i11) {
        l1.s sVar;
        l1.b1 b1Var;
        fz.e eVar;
        CourseSentence courseSentence;
        kotlin.jvm.internal.m.f(state, "state");
        l1.b1 b1Var2 = state.f37062p;
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-921258512);
        int i12 = i11 | (sVar2.h(state) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.h(getComboCount) ? 256 : 128) | (sVar2.h(onClickPlayAudio) ? 2048 : 1024) | (sVar2.h(onClickChecked) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickContinue) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickBugReport) ? 1048576 : 524288);
        if (sVar2.T(i12 & 1, (599187 & i12) != 599186)) {
            boolean zBooleanValue = ((Boolean) sVar2.j(ju.f.f37372f)).booleanValue();
            e2.l lVar = (e2.l) sVar2.j(z2.g1.f58548i);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            final l1.b1 b1Var3 = state.f37055h;
            l1.b1 b1Var4 = state.f37056i;
            CourseSentence courseSentence2 = (CourseSentence) state.f37048a;
            l1.b1 b1Var5 = state.f37061o;
            final x1.p pVar = state.f37058k;
            x1.p pVar2 = state.f37059l;
            l1.b1 b1Var6 = state.f37060n;
            boolean z11 = state.f37054g;
            vy.d dVar = null;
            ns.z zVarJ = b1Var3.getValue() == ht.q.WRONG ? se.k.j(courseTestParams, "sent_m3_cloze_single", courseSentence2.getTranslation(), courseSentence2.getSentence(), (!((Boolean) b1Var5.getValue()).booleanValue() || oz.q.K0((CharSequence) b1Var2.getValue())) ? se.k.u(" ", pVar) : (String) b1Var2.getValue()) : null;
            l1.b1 b1Var7 = state.f37068v;
            int i13 = i12 & 7168;
            boolean zG = sVar2.g(zBooleanValue) | (i13 == 2048) | sVar2.h(courseSentence2);
            Object objQ2 = sVar2.Q();
            if (zG || objQ2 == gVar) {
                b1Var = b1Var7;
                eVar = onClickPlayAudio;
                t5 t5Var = new t5(zBooleanValue, eVar, courseSentence2, dVar, 1);
                courseSentence = courseSentence2;
                sVar2.o0(t5Var);
                objQ2 = t5Var;
            } else {
                eVar = onClickPlayAudio;
                courseSentence = courseSentence2;
                b1Var = b1Var7;
            }
            l1.t.f((fz.e) objQ2, courseSentence, sVar2);
            String translation = courseSentence.getTranslation();
            ht.q qVar = (ht.q) b1Var3.getValue();
            ht.l lVar2 = (ht.l) r20.getValue();
            t1.d dVarD = t1.e.d(-1992829906, new p1(courseTestParams, b1Var4, eVar, courseSentence), sVar2);
            final CourseSentence courseSentence3 = courseSentence;
            t1.d dVarD2 = t1.e.d(-439742545, new v5(b1Var5, pVar, z11, b0Var, state, lVar, courseTestParams, eVar), sVar2);
            t1.d dVarD3 = t1.e.d(1113344816, new v5(b1Var5, pVar2, b1Var6, b1Var, z11, courseTestParams, b0Var, state), sVar2);
            t1.d dVarD4 = t1.e.d(85678623, new fz.h() { // from class: bt.w5
                @Override // fz.h
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    j0.q CourseTestModelScreen = (j0.q) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                    l1.n nVar2 = (l1.n) obj4;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                    int i14 = (iIntValue2 & 6) == 0 ? (((l1.s) nVar2).f(CourseTestModelScreen) ? 4 : 2) | iIntValue2 : iIntValue2;
                    if ((iIntValue2 & 48) == 0) {
                        i14 |= ((l1.s) nVar2).d(iIntValue) ? 32 : 16;
                    }
                    if ((iIntValue2 & 384) == 0) {
                        i14 |= ((l1.s) nVar2).g(zBooleanValue2) ? 256 : 128;
                    }
                    l1.s sVar3 = (l1.s) nVar2;
                    if (sVar3.T(i14 & 1, (i14 & 1171) != 1170)) {
                        ht.q qVar2 = (ht.q) b1Var3.getValue();
                        CourseSentence courseSentence4 = courseSentence3;
                        List<CourseWord> displaySpellWords = courseSentence4.getDisplaySpellWords();
                        ArrayList arrayList = new ArrayList();
                        ListIterator listIterator = pVar.listIterator();
                        while (true) {
                            sy.a aVar = (sy.a) listIterator;
                            if (!aVar.hasNext()) {
                                break;
                            }
                            ry.m.d0(arrayList, ((CourseWord) aVar.next()).getDisplayCharWords());
                        }
                        List<CourseWord> courseWords = courseSentence4.getCourseWords();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj6 : courseWords) {
                            if (((CourseWord) obj6).getWordType() != 1) {
                                arrayList2.add(obj6);
                            }
                        }
                        String translation2 = courseSentence4.getTranslation();
                        boolean zBooleanValue3 = ((Boolean) state.f37064r.getValue()).booleanValue();
                        fz.e eVar2 = onClickPlayAudio;
                        boolean zF = sVar3.f(eVar2);
                        Object objQ3 = sVar3.Q();
                        if (zF || objQ3 == l1.m.f39353a) {
                            objQ3 = new b0.p1(12, eVar2);
                            sVar3.o0(objQ3);
                        }
                        int i15 = i14 & 14;
                        int i16 = i14 << 15;
                        dt.v2.k(CourseTestModelScreen, qVar2, displaySpellWords, null, null, translation2, iIntValue, zBooleanValue2, arrayList, arrayList2, false, false, false, zBooleanValue3, true, (fz.c) objQ3, sVar3, i15 | (3670016 & i16) | (i16 & 29360128), 24576, 3596);
                    } else {
                        sVar3.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar2);
            boolean zH = (i13 == 2048) | sVar2.h(courseSentence3);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new m0(onClickPlayAudio, courseSentence3, 11);
                sVar2.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean zH2 = sVar2.h(lVar) | sVar2.h(b0Var) | sVar2.h(state) | sVar2.h(courseSentence3) | ((i12 & 57344) == 16384);
            Object objQ4 = sVar2.Q();
            if (zH2 || objQ4 == gVar) {
                bp.x1 x1Var = new bp.x1(lVar, b0Var, state, courseSentence3, onClickChecked, 3);
                sVar2.o0(x1Var);
                objQ4 = x1Var;
            }
            sVar = sVar2;
            dt.k3.e(translation, qVar, lVar2, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, null, aVar, onClickBugReport, getComboCount, (fz.a) objQ4, null, null, onClickContinue, sVar, 196608, 807100416, ((i12 << 6) & 234881024) | ((i12 << 21) & 1879048192), (i12 >> 6) & 7168, 132530136, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b1(state, courseTestParams, getComboCount, onClickPlayAudio, onClickChecked, onClickContinue, onClickBugReport, i11, 3);
        }
    }

    public static final void H(ot.w data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        ys.d0 d0Var2;
        ht.o oVar;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1556827307);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean z11 = data.f46027a;
            CourseSentence questionCourseSentence = data.f46028b;
            CourseSentence answerCourseSentence = data.f46029c;
            ArrayList arrayList = data.f46030d;
            List list = data.f46031e;
            kotlin.jvm.internal.m.f(questionCourseSentence, "questionCourseSentence");
            kotlin.jvm.internal.m.f(answerCourseSentence, "answerCourseSentence");
            boolean zF = sVar.f(questionCourseSentence) | sVar.f(answerCourseSentence);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(questionCourseSentence) | sVar.f(answerCourseSentence);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zF3 = sVar.f(questionCourseSentence) | sVar.f(answerCourseSentence);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            boolean zF4 = sVar.f(questionCourseSentence) | sVar.f(answerCourseSentence);
            Object objQ4 = sVar.Q();
            if (zF4 || objQ4 == gVar) {
                objQ4 = l1.t.B(arrayList);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            boolean zF5 = sVar.f(questionCourseSentence) | sVar.f(answerCourseSentence);
            Object objQ5 = sVar.Q();
            if (zF5 || objQ5 == gVar) {
                objQ5 = l1.t.B(list);
                sVar.o0(objQ5);
            }
            l1.b1 b1Var5 = (l1.b1) objQ5;
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.s(new jt.i0(7, b1Var));
                sVar.o0(objQ6);
            }
            l1.b3 b3Var = (l1.b3) objQ6;
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF6 = sVar.f(null) | sVar.f(aVarC);
            Object objQ7 = sVar.Q();
            if (zF6 || objQ7 == gVar) {
                objQ7 = w4.c.e(vt.n0.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            vt.n0 n0Var = (vt.n0) objQ7;
            e20.a aVarC2 = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF7 = sVar.f(null) | sVar.f(aVarC2);
            Object objQ8 = sVar.Q();
            if (zF7 || objQ8 == gVar) {
                objQ8 = w4.c.e(ns.l.class, aVarC2, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            ns.l lVar = (ns.l) objQ8;
            fr.o0 o0Var = (fr.o0) n0Var;
            int i13 = o0Var.f27733a.keyLanguage;
            boolean zG = sVar.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar.g(z11) | sVar.f(questionCourseSentence) | sVar.f(answerCourseSentence) | sVar.d(i13) | sVar.f(b1Var) | sVar.f(b1Var2) | sVar.f(b1Var3) | sVar.f(b1Var4) | sVar.f(b1Var5);
            Object objQ9 = sVar.Q();
            if (zG || objQ9 == gVar) {
                jt.q1 q1Var = new jt.q1(z11, questionCourseSentence, answerCourseSentence, o0Var.f27733a.keyLanguage, ((Boolean) b3Var.getValue()).booleanValue(), b1Var, b1Var2, b1Var3, b1Var4, b1Var5, new jt.r1(n0Var, lVar, null));
                sVar.o0(q1Var);
                objQ9 = q1Var;
            }
            jt.q1 q1Var2 = (jt.q1) objQ9;
            int i14 = i12 & 896;
            boolean z12 = i14 == 256;
            Object objQ10 = sVar.Q();
            if (z12 || objQ10 == gVar) {
                d0Var2 = d0Var;
                objQ10 = new o5(d0Var2, 6);
                sVar.o0(objQ10);
            } else {
                d0Var2 = d0Var;
            }
            fz.a aVar = (fz.a) objQ10;
            boolean zH = (i14 == 256) | sVar.h(q1Var2);
            Object objQ11 = sVar.Q();
            if (zH || objQ11 == gVar) {
                objQ11 = new at.h(20, d0Var2, q1Var2);
                sVar.o0(objQ11);
            }
            fz.e eVar = (fz.e) objQ11;
            boolean z13 = i14 == 256;
            Object objQ12 = sVar.Q();
            if (z13 || objQ12 == gVar) {
                objQ12 = new v(d0Var2, 10);
                sVar.o0(objQ12);
            }
            fz.c cVar = (fz.c) objQ12;
            boolean z14 = i14 == 256;
            Object objQ13 = sVar.Q();
            if (z14 || objQ13 == gVar) {
                objQ13 = new o5(d0Var2, 7);
                sVar.o0(objQ13);
            }
            fz.a aVar2 = (fz.a) objQ13;
            int i15 = i12 & 112;
            boolean z15 = (i14 == 256) | (i15 == 32);
            Object objQ14 = sVar.Q();
            if (z15 || objQ14 == gVar) {
                oVar = courseTestParams;
                objQ14 = new e0(d0Var2, oVar, 12);
                sVar.o0(objQ14);
            } else {
                oVar = courseTestParams;
            }
            I(q1Var2, oVar, aVar, eVar, cVar, aVar2, (fz.c) objQ14, sVar, i15);
        } else {
            d0Var2 = d0Var;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var2, i11, 17);
        }
    }

    public static final void I(jt.q1 state, ht.o courseTestParams, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickChecked, fz.a onClickContinue, fz.c onClickBugReport, l1.n nVar, int i11) {
        l1.s sVar;
        CourseSentence courseSentence;
        CourseSentence courseSentence2;
        Object s1Var;
        l1.b1 b1Var;
        CourseSentence courseSentence3;
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1894248122);
        int i12 = i11 | (sVar2.h(state) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.h(getComboCount) ? 256 : 128) | (sVar2.h(onClickPlayAudio) ? 2048 : 1024) | (sVar2.h(onClickChecked) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickContinue) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickBugReport) ? 1048576 : 524288);
        if (sVar2.T(i12 & 1, (599187 & i12) != 599186)) {
            Boolean bool = (Boolean) sVar2.j(ju.f.f37372f);
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = ((Boolean) sVar2.j(ju.f.f37374h)).booleanValue();
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            boolean z11 = state.f37127e;
            l1.b1 b1Var2 = state.f37128f;
            l1.b1 b1Var3 = state.f37129g;
            l1.b1 b1Var4 = state.f37131i;
            l1.b1 b1Var5 = state.f37132j;
            boolean z12 = state.f37123a;
            CourseSentence courseSentence4 = state.f37124b;
            CourseSentence courseSentence5 = state.f37125c;
            if (z12) {
                courseSentence = courseSentence5;
                courseSentence2 = courseSentence;
            } else {
                courseSentence = courseSentence4;
                courseSentence2 = courseSentence5;
            }
            String strE0 = ub.a.e0(sVar2, R.string.sentence_m8_hint);
            ns.z zVarJ = b1Var2.getValue() == ht.q.WRONG ? se.k.j(courseTestParams, "sent_mqa_assemble_qa", courseSentence.getTranslation(), se.k.u(BuildConfig.VERSION_NAME, courseSentence.getDisplayCourseWords()), se.k.u(" ", (List) b1Var4.getValue())) : null;
            int i13 = i12 & 7168;
            boolean zG = sVar2.g(zBooleanValue) | sVar2.f(b1Var3) | (i13 == 2048) | sVar2.h(courseSentence4);
            Object objQ2 = sVar2.Q();
            if (zG || objQ2 == gVar) {
                b1Var = b1Var3;
                s1Var = new s1(zBooleanValue, b1Var, onClickPlayAudio, courseSentence4, null, 3);
                courseSentence3 = courseSentence4;
                sVar2.o0(s1Var);
            } else {
                s1Var = objQ2;
                courseSentence3 = courseSentence4;
                b1Var = b1Var3;
            }
            l1.t.g(courseSentence3, bool, (fz.e) s1Var, sVar2);
            ht.q qVar = (ht.q) b1Var2.getValue();
            ht.l lVar = (ht.l) b1Var.getValue();
            t1.d dVarD = t1.e.d(-1388677768, new a6(strE0, courseTestParams, 0), sVar2);
            l1.b1 b1Var6 = b1Var;
            CourseSentence courseSentence6 = courseSentence3;
            t1.d dVarD2 = t1.e.d(774624441, new y5(z12, courseSentence6, b1Var4, b1Var6, courseTestParams, onClickPlayAudio, z11, b0Var, state, courseSentence2), sVar2);
            t1.d dVarD3 = t1.e.d(-1357040646, new r1(b1Var5, z11, zBooleanValue2, b1Var6, onClickPlayAudio, b0Var, state, 1), sVar2);
            CourseSentence courseSentence7 = courseSentence2;
            t1.d dVarD4 = t1.e.d(-1101774039, new i4(b1Var2, z12, courseSentence7, courseSentence6, state, onClickPlayAudio, 1), sVar2);
            boolean zG2 = sVar2.g(z12) | sVar2.h(courseSentence7) | sVar2.h(courseSentence6) | (i13 == 2048);
            Object objQ3 = sVar2.Q();
            if (zG2 || objQ3 == gVar) {
                e4 e4Var = new e4(1, courseSentence7, courseSentence6, onClickPlayAudio, z12);
                sVar2.o0(e4Var);
                objQ3 = e4Var;
            }
            fz.a aVar = (fz.a) objQ3;
            boolean zH = sVar2.h(b0Var) | sVar2.h(state) | ((i12 & 57344) == 16384) | sVar2.f(b1Var2);
            Object objQ4 = sVar2.Q();
            if (zH || objQ4 == gVar) {
                b0.k0 k0Var = new b0.k0(b0Var, state, onClickChecked, b1Var2, 6);
                sVar2.o0(k0Var);
                objQ4 = k0Var;
            }
            sVar = sVar2;
            dt.k3.e(null, qVar, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, null, aVar, onClickBugReport, getComboCount, (fz.a) objQ4, null, null, onClickContinue, sVar, 0, 807100416, ((i12 << 6) & 234881024) | ((i12 << 21) & 1879048192), (i12 >> 6) & 7168, 132530169, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b1(state, courseTestParams, getComboCount, onClickPlayAudio, onClickChecked, onClickContinue, onClickBugReport, i11, 4);
        }
    }

    public static final void J(ot.t1 data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(561284120);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean zF = sVar.f(data);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(data);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            int i13 = i12 & 896;
            boolean zH = (i13 == 256) | sVar.h(data) | sVar.f(b1Var2);
            Object objQ3 = sVar.Q();
            if (zH || objQ3 == gVar) {
                ad.y yVar = new ad.y(data, b1Var2, d0Var, (vy.d) null, 1);
                sVar.o0(yVar);
                objQ3 = yVar;
            }
            l1.t.f((fz.e) objQ3, data, sVar);
            ht.q qVar = (ht.q) b1Var.getValue();
            ht.l lVar = (ht.l) b1Var2.getValue();
            boolean zF3 = (i13 == 256) | sVar.f(b1Var2);
            Object objQ4 = sVar.Q();
            if (zF3 || objQ4 == gVar) {
                objQ4 = new au.d1(22, b1Var2, d0Var);
                sVar.o0(objQ4);
            }
            fz.c cVar = (fz.c) objQ4;
            boolean zF4 = sVar.f(b1Var) | sVar.h(data) | (i13 == 256);
            Object objQ5 = sVar.Q();
            if (zF4 || objQ5 == gVar) {
                objQ5 = new aj.c(data, d0Var2, b1Var, 16);
                sVar.o0(objQ5);
            }
            fz.c cVar2 = (fz.c) objQ5;
            Object objQ6 = sVar.Q();
            if (objQ6 == gVar) {
                objQ6 = new ju.d(25);
                sVar.o0(objQ6);
            }
            fz.a aVar = (fz.a) objQ6;
            boolean z11 = i13 == 256;
            Object objQ7 = sVar.Q();
            if (z11 || objQ7 == gVar) {
                objQ7 = new o5(d0Var2, 8);
                sVar.o0(objQ7);
            }
            int i14 = i12 << 6;
            K(qVar, lVar, data, courseTestParams, cVar, cVar2, aVar, (fz.a) objQ7, sVar, (i14 & 7168) | (i14 & 896) | 1572864);
        } else {
            d0Var2 = d0Var;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var2, i11, 18);
        }
    }

    public static final void K(ht.q courseTestState, ht.l audioPlayingState, ot.t1 data, ht.o courseTestParams, fz.c onClickPlayAudio, fz.c onClickedOption, fz.a onClickChecked, fz.a onClickContinue, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickedOption, "onClickedOption");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2124764896);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.d(courseTestState.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(audioPlayingState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(data) ? 256 : 128;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(onClickPlayAudio) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onClickedOption) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onClickChecked) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onClickContinue) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if (sVar2.T(i13 & 1, (4792467 & i13) != 4792466)) {
            sVar2.d0(-1789568252);
            List listW0 = oz.q.W0(data.f45997a.getChineseToneMetaData().getShengDiao(), new String[]{" "}, 0, 6);
            ArrayList arrayList = new ArrayList(ry.n.W(listW0, 10));
            Iterator it = listW0.iterator();
            while (it.hasNext()) {
                arrayList.add(L(sVar2, Integer.parseInt((String) it.next())));
            }
            sVar2.p(false);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = new br.b(16);
                sVar2.o0(objQ);
            }
            String strY0 = ry.m.y0(arrayList, " + ", null, null, (fz.c) objQ, 30);
            String strE0 = ub.a.e0(sVar2, R.string.test_continue);
            t1.d dVarD = t1.e.d(913988190, new bp.e0(strY0, 2), sVar2);
            t1.d dVarD2 = t1.e.d(-1433248673, new bp.t(3, onClickPlayAudio, courseTestState, audioPlayingState, data), sVar2);
            t1.d dVarD3 = t1.e.d(514481760, new e6(onClickedOption, 0), sVar2);
            t1.d dVarD4 = t1.e.d(-1852342577, new h6(data, courseTestState), sVar2);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = new ju.d(25);
                sVar2.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            Object objQ3 = sVar2.Q();
            if (objQ3 == gVar) {
                objQ3 = new br.b(27);
                sVar2.o0(objQ3);
            }
            fz.c cVar = (fz.c) objQ3;
            Object objQ4 = sVar2.Q();
            if (objQ4 == gVar) {
                objQ4 = new ys.d(3);
                sVar2.o0(objQ4);
            }
            fz.a aVar2 = (fz.a) objQ4;
            int i14 = i13 << 3;
            sVar = sVar2;
            dt.k3.e(BuildConfig.VERSION_NAME, courseTestState, audioPlayingState, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, strE0, dVarD, dVarD2, dVarD3, null, null, dVarD4, null, null, null, null, null, null, null, aVar, cVar, aVar2, onClickChecked, null, null, onClickContinue, sVar, (i14 & 112) | 196614 | (i14 & 896), 807100416, 918552576, ((i13 >> 18) & 14) | ((i13 >> 12) & 7168), 133570520, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m1(courseTestState, audioPlayingState, data, courseTestParams, onClickPlayAudio, onClickedOption, onClickChecked, onClickContinue, i11);
        }
    }

    public static final String L(l1.n nVar, int i11) {
        l1.s sVar;
        int i12;
        int i13;
        if (i11 == 1) {
            sVar = (l1.s) nVar;
            i12 = R.string.chinese_tone_ordinal_1st;
            i13 = 25523365;
        } else if (i11 == 2) {
            sVar = (l1.s) nVar;
            i12 = R.string.chinese_tone_ordinal_2nd;
            i13 = 25526053;
        } else if (i11 == 3) {
            sVar = (l1.s) nVar;
            i12 = R.string.chinese_tone_ordinal_3rd;
            i13 = 25528741;
        } else if (i11 != 4) {
            sVar = (l1.s) nVar;
            i12 = R.string.chinese_tone_ordinal_neutral;
            i13 = 25534217;
        } else {
            sVar = (l1.s) nVar;
            i12 = R.string.chinese_tone_ordinal_4th;
            i13 = 25531429;
        }
        return ep.a.m(sVar, i13, i12, sVar, false);
    }

    public static final void M(final CourseWord word, final boolean z11, final ht.l audioPlayingState, List options, ht.q courseTestState, final ht.o courseTestParams, final fz.c onClickOption, final fz.c onPlayingAudio, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        kotlin.jvm.internal.m.f(onPlayingAudio, "onPlayingAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-807636995);
        int i12 = i11 | (sVar.h(word) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(audioPlayingState) ? 256 : 128) | (sVar.h(options) ? 2048 : 1024) | (sVar.d(courseTestState.ordinal()) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.f(courseTestParams) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onClickOption) ? 1048576 : 524288) | (sVar.h(onPlayingAudio) ? 8388608 : 4194304);
        if (sVar.T(i12 & 1, (4793491 & i12) != 4793490)) {
            final boolean z12 = courseTestState == ht.q.CORRECT || courseTestState == ht.q.WRONG;
            final boolean z13 = z12 && !(courseTestParams.f33759g && (word.getSoundChangePronunciation().length() > 0));
            dt.g4.a(options, t1.e.d(1885036020, new fz.g() { // from class: bt.i6
                @Override // fz.g
                public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                    j0.b2 CourseTestLargeOptionsColumn = (j0.b2) obj;
                    CourseWord option = (CourseWord) obj2;
                    l1.n nVar2 = (l1.n) obj3;
                    ((Integer) obj4).getClass();
                    kotlin.jvm.internal.m.f(CourseTestLargeOptionsColumn, "$this$CourseTestLargeOptionsColumn");
                    kotlin.jvm.internal.m.f(option, "option");
                    OptionItemSelectedState selectedState = option.getSelectedState();
                    boolean z14 = z13;
                    boolean z15 = z11;
                    ht.o oVar = courseTestParams;
                    CourseWord courseWord = word;
                    ht.l lVar = audioPlayingState;
                    boolean z16 = z12;
                    fz.c cVar = onPlayingAudio;
                    fz.c cVar2 = onClickOption;
                    t1.d dVarD = t1.e.d(-1995925068, new k4(z14, option, z15, oVar, courseWord, lVar, z16, cVar, cVar2), nVar2);
                    l1.s sVar2 = (l1.s) nVar2;
                    boolean zF = sVar2.f(cVar2) | sVar2.h(option);
                    Object objQ = sVar2.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new s0(cVar2, option, 8);
                        sVar2.o0(objQ);
                    }
                    dt.a0.e(selectedState, z15, dVarD, (fz.a) objQ, j0.c.j(CourseTestLargeOptionsColumn.a(z1.o.f58481a, 1.0f), 1.0f), sVar2, 384);
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, ((i12 >> 9) & 14) | 48);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new v5(word, z11, audioPlayingState, options, courseTestState, courseTestParams, onClickOption, onPlayingAudio, i11);
        }
    }

    public static final void N(ot.u1 data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1540041071);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean zF = sVar.f(data);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(data);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(data.f46013b);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zF3 = sVar.f(data.f46012a);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            ht.q qVar = (ht.q) b1Var.getValue();
            ht.l lVar = (ht.l) b1Var3.getValue();
            CourseWord courseWord = data.f46012a;
            List list = (List) b1Var2.getValue();
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z11 || objQ4 == gVar) {
                objQ4 = new o5(d0Var, 9);
                sVar.o0(objQ4);
            }
            fz.a aVar = (fz.a) objQ4;
            boolean zF4 = (i13 == 256) | sVar.f(b1Var3);
            Object objQ5 = sVar.Q();
            if (zF4 || objQ5 == gVar) {
                objQ5 = new at.h(23, d0Var, b1Var3);
                sVar.o0(objQ5);
            }
            fz.e eVar = (fz.e) objQ5;
            boolean zF5 = sVar.f(b1Var2) | sVar.f(b1Var);
            Object objQ6 = sVar.Q();
            if (zF5 || objQ6 == gVar) {
                objQ6 = new bp.i2(b1Var2, b1Var, 2);
                sVar.o0(objQ6);
            }
            fz.c cVar = (fz.c) objQ6;
            boolean zF6 = (i13 == 256) | sVar.f(b1Var2) | sVar.h(data) | sVar.f(b1Var);
            Object objQ7 = sVar.Q();
            if (zF6 || objQ7 == gVar) {
                d0Var2 = d0Var;
                l6 l6Var = new l6(d0Var2, b1Var2, data, b1Var, 0);
                sVar.o0(l6Var);
                objQ7 = l6Var;
            } else {
                d0Var2 = d0Var;
            }
            fz.a aVar2 = (fz.a) objQ7;
            boolean z12 = i13 == 256;
            Object objQ8 = sVar.Q();
            if (z12 || objQ8 == gVar) {
                objQ8 = new o5(d0Var2, 10);
                sVar.o0(objQ8);
            }
            fz.a aVar3 = (fz.a) objQ8;
            int i14 = i12 & 112;
            boolean z13 = (i13 == 256) | (i14 == 32);
            Object objQ9 = sVar.Q();
            if (z13 || objQ9 == gVar) {
                objQ9 = new k(d0Var2, courseTestParams, 6);
                sVar.o0(objQ9);
            }
            fz.a aVar4 = (fz.a) objQ9;
            boolean z14 = (i13 == 256) | (i14 == 32);
            Object objQ10 = sVar.Q();
            if (z14 || objQ10 == gVar) {
                objQ10 = new e0(d0Var2, courseTestParams, 13);
                sVar.o0(objQ10);
            }
            O(qVar, lVar, courseWord, list, courseTestParams, aVar, eVar, cVar, aVar2, aVar3, aVar4, (fz.c) objQ10, sVar, (i12 << 9) & 57344);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m6(data, courseTestParams, d0Var, i11, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void O(ht.q courseTestState, ht.l audioPlayingState, CourseWord word, List options, ht.o courseTestParams, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickOption, fz.a onClickCheck, fz.a onClickContinue, fz.a onClickSkipListen, fz.c onClickBugReport, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        boolean z11;
        int i13;
        int i14;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(audioPlayingState, "audioPlayingState");
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        kotlin.jvm.internal.m.f(onClickCheck, "onClickCheck");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickSkipListen, "onClickSkipListen");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(70347783);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.d(courseTestState.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(audioPlayingState) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(word) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(options) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.f(courseTestParams) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i11 & 196608) == 0) {
            i12 |= sVar2.h(getComboCount) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onClickPlayAudio) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= sVar2.h(onClickOption) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i12 |= sVar2.h(onClickCheck) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i12 |= sVar2.h(onClickContinue) ? 536870912 : 268435456;
        }
        int i15 = i12;
        int i16 = (sVar2.h(onClickSkipListen) ? 4 : 2) | (sVar2.h(onClickBugReport) ? 32 : 16);
        if (sVar2.T(i15 & 1, ((i15 & 306783379) == 306783378 && (i16 & 19) == 18) ? false : true)) {
            l1.b1 b1VarH = l1.t.H(courseTestState, sVar2);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.s(new bp.p(23, b1VarH));
                sVar2.o0(objQ);
            }
            l1.b3 b3Var = (l1.b3) objQ;
            if (courseTestParams.f33760h && courseTestParams.f33755c == 3) {
                i13 = -212395474;
                i14 = R.string.chinese_tone_which_tone_is_different;
                z11 = false;
            } else {
                z11 = false;
                i13 = -212313510;
                i14 = R.string.choose_the_correct_audio;
            }
            String strM = ep.a.m(sVar2, i13, i14, sVar2, z11);
            Object word2 = null;
            if (courseTestState == ht.q.WRONG) {
                CourseWord courseWordC = se.k.C(options);
                String translation = word.getTranslation();
                String word3 = word.getWord();
                word2 = courseWordC != null ? courseWordC.getWord() : null;
                if (word2 == null) {
                    word2 = BuildConfig.VERSION_NAME;
                }
                word2 = se.k.j(courseTestParams, "vocab_m3_select_word_by_audio", translation, word3, word2);
            }
            boolean z12 = courseTestParams.f33768q;
            t1.d dVarD = t1.e.d(1858595781, new a6(strM, courseTestParams, 1), sVar2);
            t1.d dVarD2 = t1.e.d(1347583622, new at.h(22, courseTestParams, word), sVar2);
            t1.d dVarD3 = t1.e.d(836571463, new g6(word, audioPlayingState, options, courseTestState, courseTestParams, onClickOption, onClickPlayAudio, b3Var, 0), sVar2);
            t1.d dVarD4 = t1.e.d(-1563921162, new h6(courseTestState, word, 0), sVar2);
            boolean zH = sVar2.h(word) | ((i15 & 3670016) == 1048576);
            Object objQ2 = sVar2.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new at.f(17, onClickPlayAudio, word);
                sVar2.o0(objQ2);
            }
            int i17 = i15 << 3;
            sVar = sVar2;
            dt.k3.e(null, courseTestState, audioPlayingState, false, false, false, z12, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, word2, null, null, null, null, null, onClickSkipListen, (fz.a) objQ2, onClickBugReport, getComboCount, onClickCheck, null, null, onClickContinue, sVar, (i17 & 112) | 196608 | (i17 & 896), 807100416, (3670016 & (i16 << 18)) | ((i16 << 21) & 234881024) | ((i15 << 12) & 1879048192), ((i15 >> 24) & 14) | ((i15 >> 18) & 7168), 65421145, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n0(courseTestState, audioPlayingState, word, options, courseTestParams, getComboCount, onClickPlayAudio, onClickOption, onClickCheck, onClickContinue, onClickSkipListen, onClickBugReport, i11);
        }
    }

    public static final void Q(ot.u1 data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        int i12;
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-838502879);
        int i13 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            boolean zF = sVar.f(data);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(data);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(data.f46013b);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            ht.q qVar = (ht.q) b1Var.getValue();
            CourseWord courseWord = data.f46012a;
            List list = (List) b1Var2.getValue();
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == gVar) {
                objQ3 = new o5(d0Var, 11);
                sVar.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean z12 = i14 == 256;
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == gVar) {
                objQ4 = new t6(d0Var, 0);
                sVar.o0(objQ4);
            }
            fz.e eVar = (fz.e) objQ4;
            boolean z13 = (i14 == 256) | ((i13 & 112) == 32);
            Object objQ5 = sVar.Q();
            if (z13 || objQ5 == gVar) {
                objQ5 = new e0(d0Var, courseTestParams, 14);
                sVar.o0(objQ5);
            }
            fz.c cVar = (fz.c) objQ5;
            boolean zF3 = sVar.f(b1Var2) | sVar.f(b1Var);
            Object objQ6 = sVar.Q();
            if (zF3 || objQ6 == gVar) {
                objQ6 = new bp.i2(b1Var2, b1Var, 3);
                sVar.o0(objQ6);
            }
            fz.c cVar2 = (fz.c) objQ6;
            boolean zF4 = sVar.f(b1Var2) | sVar.h(data) | sVar.f(b1Var) | (i14 == 256);
            Object objQ7 = sVar.Q();
            if (zF4 || objQ7 == gVar) {
                i12 = i14;
                d0Var2 = d0Var;
                l6 l6Var = new l6(d0Var2, b1Var2, data, b1Var, 1);
                sVar.o0(l6Var);
                objQ7 = l6Var;
            } else {
                d0Var2 = d0Var;
                i12 = i14;
            }
            fz.a aVar2 = (fz.a) objQ7;
            boolean z14 = i12 == 256;
            Object objQ8 = sVar.Q();
            if (z14 || objQ8 == gVar) {
                objQ8 = new o5(d0Var2, 12);
                sVar.o0(objQ8);
            }
            R((i13 << 6) & 7168, courseWord, aVar, aVar2, (fz.a) objQ8, cVar, cVar2, eVar, courseTestParams, qVar, list, sVar);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m6(data, courseTestParams, d0Var, i11, 1);
        }
    }

    public static final void R(int i11, CourseWord word, fz.a getComboCount, fz.a onClickCheck, fz.a onClickContinue, fz.c onClickBugReport, fz.c onClickOption, fz.e onClickPlayAudio, ht.o courseTestParams, ht.q courseTestState, List options, l1.n nVar) {
        int i12;
        l1.s sVar;
        ns.z zVarJ;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        kotlin.jvm.internal.m.f(onClickCheck, "onClickCheck");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1141369492);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.d(courseTestState.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(word) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(options) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.f(courseTestParams) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(getComboCount) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i11 & 196608) == 0) {
            i12 |= sVar2.h(onClickPlayAudio) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onClickBugReport) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onClickOption) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar2.h(onClickCheck) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar2.h(onClickContinue) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if (sVar2.T(i13 & 1, (i13 & 306783379) != 306783378)) {
            boolean zBooleanValue = ((Boolean) sVar2.j(ju.f.f37374h)).booleanValue();
            boolean zF = sVar2.f(word);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.a.f33722e);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            l1.b1 b1VarH = l1.t.H(courseTestState, sVar2);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.s(new bp.p(27, b1VarH));
                sVar2.o0(objQ2);
            }
            l1.b3 b3Var = (l1.b3) objQ2;
            if (courseTestState == ht.q.WRONG) {
                CourseWord courseWordC = se.k.C(options);
                String translation = word.getTranslation();
                String word2 = word.getWord();
                String word3 = courseWordC != null ? courseWordC.getWord() : null;
                if (word3 == null) {
                    word3 = BuildConfig.VERSION_NAME;
                }
                zVarJ = se.k.j(courseTestParams, "vocab_m1_select_pic_by_trans", translation, word2, word3);
            } else {
                zVarJ = null;
            }
            ht.l lVar = (ht.l) b1Var.getValue();
            t1.d dVarD = t1.e.d(-1196550742, new b0(courseTestParams, 5), sVar2);
            t1.d dVarD2 = t1.e.d(-548323285, new u3(word, 1), sVar2);
            t1.d dVarD3 = t1.e.d(99904172, new n6(courseTestParams, zBooleanValue, options, onClickOption, onClickPlayAudio, b1Var, word, b3Var), sVar2);
            t1.d dVarD4 = t1.e.d(-1012327781, new h6(courseTestState, word, 1), sVar2);
            boolean zH = ((i13 & 458752) == 131072) | sVar2.h(word) | sVar2.f(b1Var);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new o6(onClickPlayAudio, word, b1Var, 0);
                sVar2.o0(objQ3);
            }
            sVar = sVar2;
            dt.k3.e(null, courseTestState, lVar, false, true, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, null, (fz.a) objQ3, onClickBugReport, getComboCount, onClickCheck, null, null, onClickContinue, sVar, ((i13 << 3) & 112) | 196608, 807100416, (234881024 & (i13 << 6)) | ((i13 << 15) & 1879048192), ((i13 >> 24) & 14) | ((i13 >> 18) & 7168), 132530137, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p6(courseTestState, word, options, courseTestParams, getComboCount, onClickPlayAudio, onClickBugReport, onClickOption, onClickCheck, onClickContinue, i11);
        }
    }

    public static final void S(final List options, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final long j11, final fz.c onClickOption, final fz.c onPlayingAudio, l1.n nVar, final int i11) {
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        kotlin.jvm.internal.m.f(onPlayingAudio, "onPlayingAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(242045768);
        int i12 = i11 | (sVar.h(options) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.g(z13) ? 2048 : 1024) | (sVar.g(z14) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.g(z15) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.e(j11) ? 1048576 : 524288) | (sVar.h(onClickOption) ? 8388608 : 4194304) | (sVar.h(onPlayingAudio) ? 67108864 : 33554432);
        if (sVar.T(i12 & 1, (38347923 & i12) != 38347922)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            dt.g4.a(options, t1.e.d(2140892081, new fz.g() { // from class: bt.a7
                @Override // fz.g
                public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                    j0.b2 CourseTestLargeOptionsColumn = (j0.b2) obj;
                    final CourseWord option = (CourseWord) obj2;
                    l1.n nVar2 = (l1.n) obj3;
                    ((Integer) obj4).getClass();
                    kotlin.jvm.internal.m.f(CourseTestLargeOptionsColumn, "$this$CourseTestLargeOptionsColumn");
                    kotlin.jvm.internal.m.f(option, "option");
                    OptionItemSelectedState selectedState = option.getSelectedState();
                    final boolean z16 = z11;
                    final boolean z17 = z14;
                    final boolean z18 = z15;
                    final boolean z19 = z12;
                    final boolean z20 = z13;
                    final long j12 = j11;
                    final fz.c cVar = onPlayingAudio;
                    t1.d dVarD = t1.e.d(2115930097, new fz.e(z16, z17, z18, z19, z20, j12, cVar) { // from class: bt.c7

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ boolean f5280b;

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ boolean f5281c;

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ boolean f5282d;

                        /* JADX INFO: renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ boolean f5283e;

                        /* JADX INFO: renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ long f5284f;

                        /* JADX INFO: renamed from: t, reason: collision with root package name */
                        public final /* synthetic */ fz.c f5285t;

                        {
                            this.f5280b = z17;
                            this.f5281c = z18;
                            this.f5282d = z19;
                            this.f5283e = z20;
                            this.f5284f = j12;
                            this.f5285t = cVar;
                        }

                        @Override // fz.e
                        public final Object invoke(Object obj5, Object obj6) {
                            long j13;
                            CourseWord courseWord;
                            l1.s sVar2;
                            l1.n nVar3 = (l1.n) obj5;
                            int iIntValue = ((Integer) obj6).intValue();
                            z1.j jVar = z1.c.f58467e;
                            l1.s sVar3 = (l1.s) nVar3;
                            if (sVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                                z1.o oVar = z1.o.f58481a;
                                z1.r rVarA = j0.c.A(j0.e2.d(oVar, 1.0f), 8);
                                w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
                                int iHashCode = Long.hashCode(sVar3.T);
                                l1.q1 q1VarL = sVar3.l();
                                z1.r rVarC = z1.a.c(sVar3, rVarA);
                                y2.k.J.getClass();
                                y2.i iVar = y2.j.f56913b;
                                sVar3.h0();
                                if (sVar3.S) {
                                    sVar3.k(iVar);
                                } else {
                                    sVar3.r0();
                                }
                                l1.t.J(y2.j.f56917f, q0VarD, sVar3);
                                l1.t.J(y2.j.f56916e, q1VarL, sVar3);
                                y2.h hVar = y2.j.f56918g;
                                if (sVar3.S || !kotlin.jvm.internal.m.a(sVar3.Q(), Integer.valueOf(iHashCode))) {
                                    defpackage.e.A(iHashCode, sVar3, iHashCode, hVar);
                                }
                                l1.t.J(y2.j.f56915d, rVarC, sVar3);
                                CourseWord courseWord2 = this.f5279a;
                                j3.y0 y0VarY = dt.a0.y(courseWord2.getSelectedState(), sVar3);
                                boolean z21 = this.f5280b;
                                boolean z22 = this.f5282d;
                                if (z21 || this.f5281c) {
                                    sVar3.d0(1902968325);
                                    j13 = ((ct.b) sVar3.j(ct.c.f22476a)).f22470e;
                                    sVar3.p(false);
                                } else if (z22) {
                                    sVar3.d0(1903064766);
                                    j13 = ((ct.b) sVar3.j(ct.c.f22476a)).f22471f;
                                    sVar3.p(false);
                                } else {
                                    sVar3.d0(1903146761);
                                    j13 = ((ct.b) sVar3.j(ct.c.f22476a)).f22472g;
                                    sVar3.p(false);
                                }
                                long j14 = j13;
                                j0.r rVar = j0.r.f35391a;
                                if (z22 || z21) {
                                    courseWord = courseWord2;
                                    sVar3.d0(1903281518);
                                    ua.b(z22 ? courseWord.getTranslation() : courseWord.getWord(), rVar.a(oVar, jVar), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a(y0VarY, 0L, j14, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), sVar3, 0, 0, 65532);
                                    sVar2 = sVar3;
                                    sVar2.p(false);
                                } else {
                                    sVar3.d0(1903787810);
                                    dt.g4.b(courseWord2, j3.y0.a(y0VarY, 0L, j14, null, null, null, 0L, null, null, 0, 0, 0L, null, 16777213), rVar.a(oVar, jVar), false, null, false, false, false, 0, null, sVar3, 0, 1016);
                                    courseWord = courseWord2;
                                    sVar2 = sVar3;
                                    sVar2.p(false);
                                }
                                if (this.f5283e) {
                                    sVar2.d0(1904185912);
                                    boolean z23 = this.f5284f == courseWord.getWordId();
                                    long j15 = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                                    z1.r rVarA2 = rVar.a(j0.e2.n(oVar, 24), z1.c.f58465c);
                                    fz.c cVar2 = this.f5285t;
                                    boolean zF = sVar2.f(cVar2) | sVar2.h(courseWord);
                                    Object objQ = sVar2.Q();
                                    if (zF || objQ == l1.m.f39353a) {
                                        objQ = new s0(cVar2, courseWord, 12);
                                        sVar2.o0(objQ);
                                    }
                                    dt.a0.a(z23, rVarA2, j15, (fz.a) objQ, sVar2, 0, 0);
                                } else {
                                    sVar2.d0(1890324107);
                                }
                                sVar2.p(false);
                                sVar2.p(true);
                            } else {
                                sVar3.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, nVar2);
                    l1.s sVar2 = (l1.s) nVar2;
                    fz.c cVar2 = onClickOption;
                    boolean zF = sVar2.f(cVar2) | sVar2.h(option);
                    Object objQ = sVar2.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new s0(cVar2, option, 11);
                        sVar2.o0(objQ);
                    }
                    dt.a0.e(selectedState, z16, dVarD, (fz.a) objQ, j0.c.j(CourseTestLargeOptionsColumn.a(z1.o.f58481a, 1.0f), 1.0f), sVar2, 384);
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, (i12 & 14) | 48);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(options, z11, z12, z13, z14, z15, j11, onClickOption, onPlayingAudio, i11) { // from class: bt.b7
                public final /* synthetic */ fz.c H;
                public final /* synthetic */ fz.c K;

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ List f5232a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f5233b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f5234c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f5235d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f5236e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ boolean f5237f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ long f5238t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(385);
                    b.S(this.f5232a, this.f5233b, this.f5234c, this.f5235d, this.f5236e, this.f5237f, this.f5238t, this.H, this.K, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void T(ot.u1 data, ht.o oVar, ys.d0 d0Var, l1.n nVar, int i11) {
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1983849503);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(oVar) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            boolean zBooleanValue = ((Boolean) sVar.j(ju.f.f37372f)).booleanValue();
            boolean zF = sVar.f(data);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(data);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(data.f46013b);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            ht.q qVar = (ht.q) b1Var.getValue();
            CourseWord courseWord = data.f46012a;
            List list = (List) b1Var2.getValue();
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == gVar) {
                objQ3 = new o5(d0Var, 13);
                sVar.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean z12 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == gVar) {
                objQ4 = new t6(d0Var, 1);
                sVar.o0(objQ4);
            }
            fz.e eVar = (fz.e) objQ4;
            boolean zF3 = sVar.f(b1Var2) | sVar.f(b1Var);
            Object objQ5 = sVar.Q();
            if (zF3 || objQ5 == gVar) {
                objQ5 = new bp.i2(b1Var2, b1Var, 4);
                sVar.o0(objQ5);
            }
            fz.c cVar = (fz.c) objQ5;
            int i14 = i12 & 112;
            boolean zF4 = (i13 == 256) | sVar.f(b1Var2) | sVar.h(data) | sVar.f(b1Var) | (i14 == 32) | sVar.g(zBooleanValue);
            Object objQ6 = sVar.Q();
            if (zF4 || objQ6 == gVar) {
                d0Var2 = d0Var;
                objQ6 = new u(d0Var2, oVar, zBooleanValue, data, b1Var2, b1Var);
                sVar.o0(objQ6);
            } else {
                d0Var2 = d0Var;
            }
            fz.a aVar2 = (fz.a) objQ6;
            boolean z13 = i13 == 256;
            Object objQ7 = sVar.Q();
            if (z13 || objQ7 == gVar) {
                objQ7 = new o5(d0Var2, 14);
                sVar.o0(objQ7);
            }
            fz.a aVar3 = (fz.a) objQ7;
            boolean z14 = (i13 == 256) | (i14 == 32);
            Object objQ8 = sVar.Q();
            if (z14 || objQ8 == gVar) {
                objQ8 = new e0(d0Var2, oVar, 15);
                sVar.o0(objQ8);
            }
            U((i12 << 6) & 7168, courseWord, aVar, aVar2, aVar3, cVar, (fz.c) objQ8, eVar, oVar, qVar, list, sVar);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m6(data, oVar, d0Var, i11, 2);
        }
    }

    public static final void U(int i11, CourseWord word, fz.a getComboCount, fz.a onClickChecked, fz.a onClickContinue, fz.c onClickedOption, fz.c onClickBugReport, fz.e onClickPlayAudio, ht.o oVar, ht.q courseTestState, List options, l1.n nVar) {
        int i12;
        l1.s sVar;
        ns.z zVarJ;
        Object next;
        String word2;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickedOption, "onClickedOption");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-231303092);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.d(courseTestState.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(word) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.h(options) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.f(oVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(getComboCount) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onClickPlayAudio) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onClickedOption) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onClickChecked) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= sVar2.h(onClickContinue) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= sVar2.h(onClickBugReport) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if (sVar2.T(i13 & 1, (i13 & 306783379) != 306783378)) {
            boolean zBooleanValue = ((Boolean) sVar2.j(ju.f.f37374h)).booleanValue();
            boolean zF = sVar2.f(word);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.a.f33722e);
                sVar2.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            l1.b1 b1VarH = l1.t.H(courseTestState, sVar2);
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.s(new z6(1, b1VarH));
                sVar2.o0(objQ2);
            }
            l1.b3 b3Var = (l1.b3) objQ2;
            if (courseTestState == ht.q.WRONG) {
                CourseWord courseWordC = se.k.C(options);
                Iterator it = options.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((CourseWord) next).getWordId() != word.getWordId());
                CourseWord courseWord = (CourseWord) next;
                if (courseWord == null || (word2 = courseWord.getWord()) == null) {
                    word2 = word.getWord();
                }
                String str = word2;
                String translation = word.getTranslation();
                String word3 = courseWordC != null ? courseWordC.getWord() : null;
                if (word3 == null) {
                    word3 = BuildConfig.VERSION_NAME;
                }
                zVarJ = se.k.j(oVar, "vocab_m2_select_word_by_trans", translation, str, word3);
            } else {
                zVarJ = null;
            }
            ht.l lVar = (ht.l) b1Var.getValue();
            t1.d dVarD = t1.e.d(-286484342, new b0(oVar, 6), sVar2);
            t1.d dVarD2 = t1.e.d(361743115, new u3(word, 2), sVar2);
            t1.d dVarD3 = t1.e.d(1009970572, new n6(options, oVar, zBooleanValue, onClickedOption, onClickPlayAudio, b1Var, word, b3Var), sVar2);
            t1.d dVarD4 = t1.e.d(-102261381, new h6(courseTestState, word, 2), sVar2);
            boolean zH = ((i13 & 458752) == 131072) | sVar2.h(word) | sVar2.f(b1Var);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new o6(onClickPlayAudio, word, b1Var, 1);
                sVar2.o0(objQ3);
            }
            sVar = sVar2;
            dt.k3.e(null, courseTestState, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, null, (fz.a) objQ3, onClickBugReport, getComboCount, onClickChecked, null, null, onClickContinue, sVar, (i13 << 3) & 112, 807100416, (234881024 & (i13 >> 3)) | ((i13 << 15) & 1879048192), ((i13 >> 21) & 14) | ((i13 >> 15) & 7168), 132530169, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p6(courseTestState, word, options, oVar, getComboCount, onClickPlayAudio, onClickedOption, onClickChecked, onClickContinue, onClickBugReport, i11);
        }
    }

    public static final void V(ot.u1 data, ht.o oVar, ys.d0 d0Var, l1.n nVar, int i11) {
        int i12;
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(511234589);
        int i13 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(oVar) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            boolean zF = sVar.f(data);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(data);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(data.f46013b);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            ht.q qVar = (ht.q) b1Var.getValue();
            CourseWord courseWord = data.f46012a;
            List list = (List) b1Var2.getValue();
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == gVar) {
                objQ3 = new o5(d0Var, 15);
                sVar.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean z12 = i14 == 256;
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == gVar) {
                objQ4 = new t6(d0Var, 2);
                sVar.o0(objQ4);
            }
            fz.e eVar = (fz.e) objQ4;
            boolean z13 = i14 == 256;
            Object objQ5 = sVar.Q();
            if (z13 || objQ5 == gVar) {
                objQ5 = new o5(d0Var, 16);
                sVar.o0(objQ5);
            }
            fz.a aVar2 = (fz.a) objQ5;
            boolean zF3 = sVar.f(b1Var2) | sVar.f(b1Var);
            Object objQ6 = sVar.Q();
            if (zF3 || objQ6 == gVar) {
                objQ6 = new bp.i2(b1Var2, b1Var, 5);
                sVar.o0(objQ6);
            }
            fz.c cVar = (fz.c) objQ6;
            boolean zF4 = (i14 == 256) | sVar.f(b1Var2) | sVar.h(data) | sVar.f(b1Var);
            Object objQ7 = sVar.Q();
            if (zF4 || objQ7 == gVar) {
                i12 = i14;
                d0Var2 = d0Var;
                l6 l6Var = new l6(d0Var2, b1Var2, data, b1Var, 2);
                sVar.o0(l6Var);
                objQ7 = l6Var;
            } else {
                d0Var2 = d0Var;
                i12 = i14;
            }
            fz.a aVar3 = (fz.a) objQ7;
            boolean z14 = i12 == 256;
            Object objQ8 = sVar.Q();
            if (z14 || objQ8 == gVar) {
                objQ8 = new o5(d0Var2, 17);
                sVar.o0(objQ8);
            }
            fz.a aVar4 = (fz.a) objQ8;
            boolean z15 = i12 == 256;
            Object objQ9 = sVar.Q();
            if (z15 || objQ9 == gVar) {
                objQ9 = new o5(d0Var2, 18);
                sVar.o0(objQ9);
            }
            fz.a aVar5 = (fz.a) objQ9;
            int i15 = i13 & 112;
            boolean z16 = (i12 == 256) | (i15 == 32);
            Object objQ10 = sVar.Q();
            if (z16 || objQ10 == gVar) {
                objQ10 = new k(d0Var2, oVar, 7);
                sVar.o0(objQ10);
            }
            fz.a aVar6 = (fz.a) objQ10;
            boolean z17 = (i12 == 256) | (i15 == 32);
            Object objQ11 = sVar.Q();
            if (z17 || objQ11 == gVar) {
                objQ11 = new e0(d0Var2, oVar, 16);
                sVar.o0(objQ11);
            }
            W(qVar, courseWord, list, oVar, aVar, eVar, aVar2, cVar, aVar3, aVar4, aVar5, aVar6, (fz.c) objQ11, sVar, (i13 << 6) & 7168);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m6(data, oVar, d0Var, i11, 3);
        }
    }

    public static final void W(final ht.q courseTestState, final CourseWord word, final List options, final ht.o oVar, final fz.a getComboCount, final fz.e onClickPlayAudio, final fz.a onStopPlayAudio, final fz.c onClickOption, final fz.a onClickChecked, final fz.a onClickContinue, final fz.a getAudioTime, final fz.a onClickSkipListen, final fz.c onClickBugReport, l1.n nVar, final int i11) {
        int i12;
        int i13;
        int i14;
        l1.s sVar;
        ns.z zVarJ;
        Object h7Var;
        int i15;
        l1.b1 b1Var;
        l1.s sVar2;
        int i16;
        CourseWord courseWord;
        ht.o oVar2;
        kotlin.jvm.internal.m.f(courseTestState, "courseTestState");
        kotlin.jvm.internal.m.f(word, "word");
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onStopPlayAudio, "onStopPlayAudio");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        kotlin.jvm.internal.m.f(onClickSkipListen, "onClickSkipListen");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(-1618832184);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.d(courseTestState.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar3.h(word) ? 32 : 16;
        }
        int i17 = i12;
        if ((i11 & 384) == 0) {
            i13 = i17 | (sVar3.h(options) ? 256 : 128);
        } else {
            i13 = i17;
        }
        int i18 = i13;
        if ((i11 & 3072) == 0) {
            i14 = i18 | (sVar3.f(oVar) ? 2048 : 1024);
        } else {
            i14 = i18;
        }
        if ((i11 & 24576) == 0) {
            i14 |= sVar3.h(getComboCount) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i14 |= sVar3.h(onClickPlayAudio) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i14 |= sVar3.h(onStopPlayAudio) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i14 |= sVar3.h(onClickOption) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i14 |= sVar3.h(onClickChecked) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i14 |= sVar3.h(onClickContinue) ? 536870912 : 268435456;
        }
        int i19 = i14;
        int i21 = (sVar3.h(getAudioTime) ? 4 : 2) | (sVar3.h(onClickSkipListen) ? 32 : 16) | (sVar3.h(onClickBugReport) ? 256 : 128);
        if (sVar3.T(i19 & 1, ((i19 & 306783379) == 306783378 && (i21 & 147) == 146) ? false : true)) {
            l1.b1 b1VarH = l1.t.H(courseTestState, sVar3);
            Object objQ = sVar3.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.s(new z6(2, b1VarH));
                sVar3.o0(objQ);
            }
            l1.b3 b3Var = (l1.b3) objQ;
            if (courseTestState == ht.q.WRONG) {
                CourseWord courseWordC = se.k.C(options);
                String translation = word.getTranslation();
                String word2 = word.getWord();
                String word3 = courseWordC != null ? courseWordC.getWord() : null;
                if (word3 == null) {
                    word3 = BuildConfig.VERSION_NAME;
                }
                zVarJ = se.k.j(oVar, "vocab_m3_select_word_by_audio", translation, word2, word3);
            } else {
                zVarJ = null;
            }
            boolean zF = sVar3.f(word);
            Object objQ2 = sVar3.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = l1.t.B(ht.a.f33722e);
                sVar3.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            Boolean bool = (Boolean) sVar3.j(ju.f.f37373g);
            boolean zBooleanValue = bool.booleanValue();
            Object objQ3 = sVar3.Q();
            if (objQ3 == gVar) {
                objQ3 = l1.t.B(0L);
                sVar3.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            Boolean boolValueOf = Boolean.valueOf(oVar.f33762j);
            int i22 = i19 & 7168;
            int i23 = i19 & 458752;
            boolean zH = (i22 == 2048) | (i23 == 131072) | sVar3.h(word) | sVar3.f(b1Var2);
            Object objQ4 = sVar3.Q();
            if (zH || objQ4 == gVar) {
                i15 = i23;
                b1Var = b1Var3;
                sVar2 = sVar3;
                i16 = 2048;
                courseWord = word;
                oVar2 = oVar;
                h7Var = new h7(oVar2, courseWord, b1Var2, b1Var, onClickPlayAudio, null, 0);
                sVar2.o0(h7Var);
            } else {
                b1Var = b1Var3;
                sVar2 = sVar3;
                i15 = i23;
                i16 = 2048;
                courseWord = word;
                h7Var = objQ4;
                oVar2 = oVar;
            }
            l1.t.h(courseWord, boolValueOf, bool, (fz.e) h7Var, sVar2);
            ht.l lVar = (ht.l) b1Var2.getValue();
            boolean z11 = oVar2.f33768q;
            l1.b1 b1Var4 = b1Var;
            t1.d dVarD = t1.e.d(169415814, new v1(oVar2, onClickPlayAudio, courseWord, b1Var2, b1Var4), sVar2);
            t1.d dVarD2 = t1.e.d(-341596345, new d7(oVar, word, b1Var4, b1Var2, onStopPlayAudio, zBooleanValue, courseTestState, getAudioTime, onClickPlayAudio), sVar2);
            t1.d dVarD3 = t1.e.d(-852608504, new g6(oVar, options, onClickOption, onClickPlayAudio, b1Var2, word, b3Var, b1Var4), sVar2);
            t1.d dVarD4 = t1.e.d(1041866167, new h6(courseTestState, word, 3), sVar2);
            boolean zH2 = (i22 == i16) | (i15 == 131072) | sVar2.h(word) | sVar2.f(b1Var2);
            Object objQ5 = sVar2.Q();
            if (zH2 || objQ5 == gVar) {
                e7 e7Var = new e7(word, b1Var2, oVar, b1Var4, onClickPlayAudio, 0);
                sVar2.o0(e7Var);
                objQ5 = e7Var;
            }
            sVar = sVar2;
            dt.k3.e(null, courseTestState, lVar, false, false, false, z11, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, onClickSkipListen, (fz.a) objQ5, onClickBugReport, getComboCount, onClickChecked, null, null, onClickContinue, sVar, (r53 << 3) & 112, 807100416, ((i21 << 15) & 3670016) | (234881024 & (i21 << 18)) | (1879048192 & (r53 << 15)), ((r53 >> 24) & 14) | ((i19 >> 18) & 7168), 65421177, 3);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: bt.f7
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i11 | 1);
                    b.W(courseTestState, word, options, oVar, getComboCount, onClickPlayAudio, onStopPlayAudio, onClickOption, onClickChecked, onClickContinue, getAudioTime, onClickSkipListen, onClickBugReport, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void X(ht.o oVar, l1.b1 b1Var, fz.e eVar, String str, fz.a aVar) {
        if (oVar.f33762j) {
            b1Var.setValue(Long.valueOf(((Number) b1Var.getValue()).longValue() + 1));
        }
        eVar.invoke(str, aVar);
    }

    public static final void Y(ot.u1 data, ht.o oVar, ys.d0 d0Var, l1.n nVar, int i11) {
        Object l6Var;
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(355171789);
        int i12 = (sVar.h(data) ? 4 : 2) | i11 | (sVar.f(oVar) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(d0Var) ? 256 : 128;
        }
        int i13 = i12;
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            boolean zF = sVar.f(data);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(data);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(data.f46013b);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            ht.q qVar = (ht.q) b1Var.getValue();
            CourseWord courseWord = data.f46012a;
            List list = (List) b1Var2.getValue();
            int i14 = i13 & 896;
            boolean z11 = i14 == 256;
            Object objQ3 = sVar.Q();
            if (z11 || objQ3 == gVar) {
                objQ3 = new o5(d0Var, 19);
                sVar.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean z12 = i14 == 256;
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == gVar) {
                objQ4 = new t6(d0Var, 3);
                sVar.o0(objQ4);
            }
            fz.e eVar = (fz.e) objQ4;
            boolean zF3 = sVar.f(b1Var2) | sVar.f(b1Var);
            Object objQ5 = sVar.Q();
            if (zF3 || objQ5 == gVar) {
                objQ5 = new bp.i2(b1Var2, b1Var, 6);
                sVar.o0(objQ5);
            }
            fz.c cVar = (fz.c) objQ5;
            boolean zF4 = (i14 == 256) | sVar.f(b1Var2) | sVar.h(data) | sVar.f(b1Var);
            Object objQ6 = sVar.Q();
            if (zF4 || objQ6 == gVar) {
                d0Var2 = d0Var;
                l6Var = new l6(d0Var2, b1Var2, data, b1Var, 3);
                sVar.o0(l6Var);
            } else {
                d0Var2 = d0Var;
                l6Var = objQ6;
            }
            fz.a aVar2 = (fz.a) l6Var;
            boolean z13 = i14 == 256;
            Object objQ7 = sVar.Q();
            if (z13 || objQ7 == gVar) {
                objQ7 = new o5(d0Var2, 20);
                sVar.o0(objQ7);
            }
            fz.a aVar3 = (fz.a) objQ7;
            boolean z14 = i14 == 256;
            Object objQ8 = sVar.Q();
            if (z14 || objQ8 == gVar) {
                objQ8 = new o5(d0Var2, 21);
                sVar.o0(objQ8);
            }
            fz.a aVar4 = (fz.a) objQ8;
            boolean z15 = i14 == 256;
            int i15 = i13 & 112;
            boolean z16 = (i15 == 32) | z15;
            Object objQ9 = sVar.Q();
            if (z16 || objQ9 == gVar) {
                objQ9 = new k(d0Var2, oVar, 8);
                sVar.o0(objQ9);
            }
            fz.a aVar5 = (fz.a) objQ9;
            boolean z17 = (i14 == 256) | (i15 == 32);
            Object objQ10 = sVar.Q();
            if (z17 || objQ10 == gVar) {
                objQ10 = new e0(d0Var2, oVar, 17);
                sVar.o0(objQ10);
            }
            Z(qVar, courseWord, list, oVar, aVar, eVar, cVar, aVar2, aVar3, aVar4, aVar5, (fz.c) objQ10, sVar, (i13 << 6) & 7168);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(data, oVar, d0Var, i11, 4);
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r1v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v13 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r1v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v6 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v5 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r5v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v12 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v12 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v13 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v24 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v24 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v26 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v33 ??, new type: boolean
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v34 ??, new type: l1.s
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v2 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public static final void Z(ht.q r40, com.lingodeer.data.model.CourseWord r41, java.util.List r42, ht.o r43, fz.a r44, fz.e r45, fz.c r46, fz.a r47, fz.a r48, fz.a r49, fz.a r50, fz.c r51, l1.n r52, int r53) {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bt.b.Z(ht.q, com.lingodeer.data.model.CourseWord, java.util.List, ht.o, fz.a, fz.e, fz.c, fz.a, fz.a, fz.a, fz.a, fz.c, l1.n, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0138  */
    /* JADX WARN: Code duplicated, block: B:37:0x013c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0157  */
    /* JADX WARN: Code duplicated, block: B:45:0x015f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0161  */
    /* JADX WARN: Code duplicated, block: B:49:0x0168  */
    /* JADX WARN: Code duplicated, block: B:50:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0175  */
    /* JADX WARN: Code duplicated, block: B:57:0x0190  */
    /* JADX WARN: Code duplicated, block: B:59:0x0194  */
    /* JADX WARN: Code duplicated, block: B:61:0x0198  */
    /* JADX WARN: Code duplicated, block: B:62:0x019a  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01be  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ff  */
    public static final void a(int i11, int i12, fz.c onSelectionChange, l1.n nVar, z1.r rVar) {
        int i13;
        z1.r rVar2;
        l1.b3 b3Var;
        int iHashCode;
        boolean z11;
        int i14;
        boolean z12;
        Object objQ;
        boolean z13;
        boolean z14;
        Object objQ2;
        boolean z15;
        boolean z16;
        Object objQ3;
        boolean z17;
        boolean z18;
        Object objQ4;
        kotlin.jvm.internal.m.f(onSelectionChange, "onSelectionChange");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(553218538);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= sVar.h(onSelectionChange) ? 32 : 16;
        }
        int i15 = i13 | 384;
        if (sVar.T(i15 & 1, (i15 & 147) != 146)) {
            float f5 = 4;
            float f11 = 46 - f5;
            l1.b3 b3VarB = b0.h.b((f11 + f5) * i11, b0.e.q(0.8f, 400.0f, null, 4), "background_offset", sVar, 3120, 20);
            l1.c3 c3Var = h1.v1.f31180a;
            long jC = g2.x.c(((h1.s1) sVar.j(c3Var)).f31035r, 0.4f);
            r0.e eVarD = r0.f.d(14);
            rVar2 = z1.o.f58481a;
            z1.r rVarH = d0.n.h(rVar2, jC, eVarD);
            float f12 = 2;
            z1.r rVarS = j0.e2.s(j0.c.A(rVarH, f12), (f12 * f5) + (f11 * f5));
            w2.q0 q0VarD = j0.o.d(z1.c.f58463a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC = z1.a.c(sVar, rVarS);
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
            if (sVar.S) {
                b3Var = b3VarB;
            } else {
                b3Var = b3VarB;
                if (!kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode2))) {
                }
                y2.h hVar4 = y2.j.f56915d;
                l1.t.J(hVar4, rVarC, sVar);
                j0.o.a(d0.n.h(j0.c.y(j0.e2.p(rVar2, f11, f11), ((Number) b3Var.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar.j(c3Var)).f31021c, r0.f.d(12)), sVar, 0);
                j0.a2 a2VarA = j0.z1.a(j0.i.g(f5), z1.c.L, sVar, 6);
                iHashCode = Long.hashCode(sVar.T);
                l1.q1 q1VarL2 = sVar.l();
                z1.r rVarC2 = z1.a.c(sVar, rVar2);
                sVar.h0();
                if (sVar.S) {
                    sVar.k(iVar);
                } else {
                    sVar.r0();
                }
                l1.t.J(hVar, a2VarA, sVar);
                l1.t.J(hVar2, q1VarL2, sVar);
                if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
                }
                l1.t.J(hVar4, rVarC2, sVar);
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                i14 = i15 & 112;
                if (i14 == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ = sVar.Q();
                l1.g gVar = l1.m.f39353a;
                if (z12 || objQ == gVar) {
                    objQ = new g(onSelectionChange, 0);
                    sVar.o0(objQ);
                }
                f0(R.drawable.hand_write_stroke, 3072, (fz.a) objQ, sVar, j0.e2.p(rVar2, f11, f11), z11);
                if (i11 == 1) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i14 == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objQ2 = sVar.Q();
                if (z14 || objQ2 == gVar) {
                    objQ2 = new g(onSelectionChange, 1);
                    sVar.o0(objQ2);
                }
                f0(R.drawable.hand_write_line, 3072, (fz.a) objQ2, sVar, j0.e2.p(rVar2, f11, f11), z13);
                if (i11 == 2) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (i14 == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objQ3 = sVar.Q();
                if (z16 || objQ3 == gVar) {
                    objQ3 = new g(onSelectionChange, 2);
                    sVar.o0(objQ3);
                }
                f0(R.drawable.hand_write_bg_show, 3072, (fz.a) objQ3, sVar, j0.e2.p(rVar2, f11, f11), z15);
                if (i11 == 3) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (i14 == 32) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                objQ4 = sVar.Q();
                if (z18 || objQ4 == gVar) {
                    objQ4 = new g(onSelectionChange, 3);
                    sVar.o0(objQ4);
                }
                f0(R.drawable.hand_write_bg_hide, 3072, (fz.a) objQ4, sVar, j0.e2.p(rVar2, f11, f11), z17);
                sVar.p(true);
                sVar.p(true);
            }
            defpackage.e.A(iHashCode2, sVar, iHashCode2, hVar3);
            y2.h hVar5 = y2.j.f56915d;
            l1.t.J(hVar5, rVarC, sVar);
            j0.o.a(d0.n.h(j0.c.y(j0.e2.p(rVar2, f11, f11), ((Number) b3Var.getValue()).floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 2), ((h1.s1) sVar.j(c3Var)).f31021c, r0.f.d(12)), sVar, 0);
            j0.a2 a2VarA2 = j0.z1.a(j0.i.g(f5), z1.c.L, sVar, 6);
            iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL3 = sVar.l();
            z1.r rVarC3 = z1.a.c(sVar, rVar2);
            sVar.h0();
            if (sVar.S) {
                sVar.k(iVar);
            } else {
                sVar.r0();
            }
            l1.t.J(hVar, a2VarA2, sVar);
            l1.t.J(hVar2, q1VarL3, sVar);
            if (sVar.S) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            } else {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar3);
            }
            l1.t.J(hVar5, rVarC3, sVar);
            if (i11 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            i14 = i15 & 112;
            if (i14 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            objQ = sVar.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (z12) {
                objQ = new g(onSelectionChange, 0);
                sVar.o0(objQ);
            } else {
                objQ = new g(onSelectionChange, 0);
                sVar.o0(objQ);
            }
            f0(R.drawable.hand_write_stroke, 3072, (fz.a) objQ, sVar, j0.e2.p(rVar2, f11, f11), z11);
            if (i11 == 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i14 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            objQ2 = sVar.Q();
            if (z14) {
                objQ2 = new g(onSelectionChange, 1);
                sVar.o0(objQ2);
            } else {
                objQ2 = new g(onSelectionChange, 1);
                sVar.o0(objQ2);
            }
            f0(R.drawable.hand_write_line, 3072, (fz.a) objQ2, sVar, j0.e2.p(rVar2, f11, f11), z13);
            if (i11 == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (i14 == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            objQ3 = sVar.Q();
            if (z16) {
                objQ3 = new g(onSelectionChange, 2);
                sVar.o0(objQ3);
            } else {
                objQ3 = new g(onSelectionChange, 2);
                sVar.o0(objQ3);
            }
            f0(R.drawable.hand_write_bg_show, 3072, (fz.a) objQ3, sVar, j0.e2.p(rVar2, f11, f11), z15);
            if (i11 == 3) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i14 == 32) {
                z18 = true;
            } else {
                z18 = false;
            }
            objQ4 = sVar.Q();
            if (z18) {
                objQ4 = new g(onSelectionChange, 3);
                sVar.o0(objQ4);
            } else {
                objQ4 = new g(onSelectionChange, 3);
                sVar.o0(objQ4);
            }
            f0(R.drawable.hand_write_bg_hide, 3072, (fz.a) objQ4, sVar, j0.e2.p(rVar2, f11, f11), z17);
            sVar.p(true);
            sVar.p(true);
        } else {
            sVar.W();
            rVar2 = rVar;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new i(i11, onSelectionChange, rVar2, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0310  */
    /* JADX WARN: Code duplicated, block: B:110:0x0312  */
    /* JADX WARN: Code duplicated, block: B:226:0x0881  */
    /* JADX WARN: Code duplicated, block: B:236:0x0897  */
    public static final void a0(ot.x1 data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        ys.d0 d0Var2;
        l1.s sVar;
        boolean z11;
        Integer num;
        Integer num2;
        l1.b1 b1Var;
        Integer num3;
        Object obj;
        ArrayList arrayList;
        ht.r rVar;
        Integer num4;
        int i12;
        String zhuYin;
        Integer num5;
        ht.r rVar2;
        Object obj2;
        ArrayList arrayList2;
        Integer num6;
        Integer num7;
        boolean zD;
        boolean z12;
        boolean z13;
        Object objS;
        Object m1Var;
        char c11;
        boolean z14;
        ht.o oVar;
        kotlin.jvm.internal.m.f(data, "data");
        CourseWord courseWord = data.f46042a;
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-324298347);
        int i13 = i11 | (sVar2.h(data) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.f(d0Var) ? 256 : 128);
        if (sVar2.T(i13 & 1, (i13 & 147) != 146)) {
            boolean zH = sVar2.h(data);
            Object objQ = sVar2.Q();
            vy.d dVar = null;
            l1.g gVar = l1.m.f39353a;
            if (zH || objQ == gVar) {
                objQ = new av.p(data, dVar, 10);
                sVar2.o0(objQ);
            }
            l1.t.f((fz.e) objQ, courseWord, sVar2);
            boolean z15 = courseTestParams.f33759g;
            ht.r wordSpellType = courseTestParams.f33770s;
            List stemWords = data.f46043b;
            List optionWords = data.f46044c;
            List<CourseWord> zhuyinStemWords = data.f46045d;
            List zhuyinOptionWords = data.f46046e;
            Long lValueOf = Long.valueOf(courseTestParams.f33756d);
            int i14 = 5;
            Integer num8 = 2;
            kotlin.jvm.internal.m.f(courseWord, "courseWord");
            kotlin.jvm.internal.m.f(wordSpellType, "wordSpellType");
            kotlin.jvm.internal.m.f(stemWords, "stemWords");
            kotlin.jvm.internal.m.f(optionWords, "optionWords");
            kotlin.jvm.internal.m.f(zhuyinStemWords, "zhuyinStemWords");
            kotlin.jvm.internal.m.f(zhuyinOptionWords, "zhuyinOptionWords");
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = l1.t.q(sVar2);
                sVar2.o0(objQ2);
            }
            rz.b0 b0Var = (rz.b0) objQ2;
            boolean zF = sVar2.f(courseWord);
            Object objQ3 = sVar2.Q();
            if (zF || objQ3 == gVar) {
                objQ3 = l1.t.B(ht.q.DEFAULT);
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var2 = (l1.b1) objQ3;
            boolean zF2 = sVar2.f(courseWord);
            Object objQ4 = sVar2.Q();
            if (zF2 || objQ4 == gVar) {
                objQ4 = l1.t.B(ht.a.f33722e);
                sVar2.o0(objQ4);
            }
            l1.b1 b1Var3 = (l1.b1) objQ4;
            boolean zF3 = sVar2.f(courseWord);
            Object objQ5 = sVar2.Q();
            if (zF3 || objQ5 == gVar) {
                objQ5 = new x1.p();
                sVar2.o0(objQ5);
            }
            x1.p pVar = (x1.p) objQ5;
            boolean zF4 = sVar2.f(courseWord);
            Object objQ6 = sVar2.Q();
            if (zF4 || objQ6 == gVar) {
                objQ6 = defpackage.e.v(-1, sVar2);
            }
            l1.a1 a1Var = (l1.a1) objQ6;
            boolean zF5 = sVar2.f(courseWord);
            Object objQ7 = sVar2.Q();
            if (zF5 || objQ7 == gVar) {
                objQ7 = l1.t.B(BuildConfig.VERSION_NAME);
                sVar2.o0(objQ7);
            }
            l1.b1 b1Var4 = (l1.b1) objQ7;
            boolean zF6 = sVar2.f(courseWord);
            Object objQ8 = sVar2.Q();
            ht.r rVar3 = wordSpellType;
            if (zF6 || objQ8 == gVar) {
                objQ8 = l1.t.B(new o3.w(BuildConfig.VERSION_NAME, 0L, 6));
                sVar2.o0(objQ8);
            }
            l1.b1 b1Var5 = (l1.b1) objQ8;
            boolean zF7 = sVar2.f(courseWord);
            Object objQ9 = sVar2.Q();
            if (zF7 || objQ9 == gVar) {
                objQ9 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ9);
            }
            l1.b1 b1Var6 = (l1.b1) objQ9;
            Object[] objArr = {lValueOf};
            Object objQ10 = sVar2.Q();
            if (objQ10 == gVar) {
                objQ10 = new hh.y(22);
                sVar2.o0(objQ10);
            }
            l1.b1 b1Var7 = (l1.b1) w1.j.c(objArr, (fz.a) objQ10, sVar2, 48);
            boolean zF8 = sVar2.f(courseWord);
            Object objQ11 = sVar2.Q();
            if (zF8 || objQ11 == gVar) {
                objQ11 = l1.t.B(ns.s.NONE);
                sVar2.o0(objQ11);
            }
            l1.b1 b1Var8 = (l1.b1) objQ11;
            boolean zF9 = sVar2.f(courseWord);
            Object objQ12 = sVar2.Q();
            if (zF9 || objQ12 == gVar) {
                objQ12 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ12);
            }
            l1.b1 b1Var9 = (l1.b1) objQ12;
            int i15 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
            e20.a aVarC = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF10 = sVar2.f(null) | sVar2.f(aVarC);
            Object objQ13 = sVar2.Q();
            if (zF10 || objQ13 == gVar) {
                objQ13 = w4.c.e(ns.l.class, aVarC, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            ns.l lVar = (ns.l) objQ13;
            e20.a aVarC2 = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF11 = sVar2.f(null) | sVar2.f(aVarC2);
            Object objQ14 = sVar2.Q();
            if (zF11 || objQ14 == gVar) {
                objQ14 = w4.c.e(vt.n0.class, aVarC2, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            fr.o0 o0Var = (fr.o0) ((vt.n0) objQ14);
            Env env = o0Var.f27733a;
            boolean zF12 = sVar2.f(courseWord) | sVar2.g(env.isKeyboard) | sVar2.g(z15);
            Object objQ15 = sVar2.Q();
            if (zF12 || objQ15 == gVar) {
                objQ15 = z15 ? l1.t.B(Boolean.FALSE) : l1.t.B(Boolean.valueOf(env.isKeyboard));
                sVar2.o0(objQ15);
            }
            l1.b1 b1Var10 = (l1.b1) objQ15;
            Object objQ16 = sVar2.Q();
            if (objQ16 == gVar) {
                objQ16 = l1.t.s(new jt.i0(8, b1Var2));
                sVar2.o0(objQ16);
            }
            l1.b3 b3Var = (l1.b3) objQ16;
            boolean zD2 = sVar2.d(rVar3.ordinal()) | sVar2.f(courseWord) | sVar2.d(i15);
            Object objQ17 = sVar2.Q();
            if (zD2 || objQ17 == gVar) {
                int i16 = env.keyLanguage;
                String word = courseWord.getWord();
                kotlin.jvm.internal.m.f(word, "word");
                int i17 = jt.s1.f37180a[rVar3.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2 && i17 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i16)) || (i15 == 0 && !ns.o.G(word))) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                } else if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(i16)) && (ry.l.D(new Integer[]{1, num8, 5}, Integer.valueOf(i15)) || ns.o.G(word))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objQ17 = Boolean.valueOf(z11);
                sVar2.o0(objQ17);
            }
            boolean zBooleanValue = ((Boolean) objQ17).booleanValue();
            boolean zF13 = sVar2.f(courseWord) | sVar2.d(i15) | sVar2.d(rVar3.ordinal());
            Object objQ18 = sVar2.Q();
            if (zF13 || objQ18 == gVar) {
                if (jt.s1.f37180a[rVar3.ordinal()] == 1) {
                    num = r1;
                    num2 = r0;
                    b1Var = b1Var2;
                    num3 = 5;
                    obj = ry.l.D(new Integer[]{num, num2}, Integer.valueOf(env.keyLanguage)) ? i15 == 0 ? DisplayType.ZHUYIN : DisplayType.WORD : DisplayType.BOTH;
                } else {
                    num = r1;
                    num2 = r0;
                    b1Var = b1Var2;
                    num3 = 5;
                    obj = DisplayType.BOTH;
                }
                sVar2.o0(obj);
            } else {
                b1Var = b1Var2;
                obj = objQ18;
                num2 = 0;
                num = 11;
                num3 = 5;
            }
            DisplayType displayType = (DisplayType) obj;
            boolean zF14 = sVar2.f(courseWord) | sVar2.g(zBooleanValue) | sVar2.d(displayType.ordinal());
            Object objQ19 = sVar2.Q();
            int i18 = 10;
            if (zF14 || objQ19 == gVar) {
                if (zBooleanValue) {
                    arrayList = new ArrayList(ry.n.W(zhuyinStemWords, 10));
                    for (CourseWord courseWord2 : zhuyinStemWords) {
                        List<CourseWord> displayCharWords = courseWord2.getDisplayCharWords();
                        ArrayList arrayList3 = new ArrayList(ry.n.W(displayCharWords, 10));
                        Iterator<T> it = displayCharWords.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(CourseWord.copy$default((CourseWord) it.next(), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, displayType, null, null, null, null, null, 0, Integer.MAX_VALUE, 63, null));
                        }
                        arrayList.add(CourseWord.copy$default(courseWord2, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList3, null, null, null, null, 0, -1, 62, null));
                    }
                } else {
                    ArrayList arrayList4 = new ArrayList(ry.n.W(stemWords, 10));
                    Iterator it2 = stemWords.iterator();
                    while (it2.hasNext()) {
                        CourseWord courseWord3 = (CourseWord) it2.next();
                        Iterator it3 = it2;
                        List<CourseWord> displayCharWords2 = courseWord3.getDisplayCharWords();
                        Integer num9 = num8;
                        ArrayList arrayList5 = new ArrayList(ry.n.W(displayCharWords2, i18));
                        for (CourseWord courseWord4 : displayCharWords2) {
                            if (ry.l.D(new Integer[]{num, num2}, Integer.valueOf(env.keyLanguage))) {
                                rVar = rVar3;
                                if (rVar == ht.r.M9) {
                                    num4 = num;
                                    i12 = i14;
                                }
                                zhuYin = BuildConfig.VERSION_NAME;
                                arrayList5.add(CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, zhuYin, null, null, false, false, false, false, false, displayType, null, null, null, null, null, 0, 2139095039, 63, null));
                                i14 = i12;
                                num = num4;
                                rVar3 = rVar;
                            } else {
                                rVar = rVar3;
                            }
                            num4 = num;
                            if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(env.keyLanguage)) && rVar == ht.r.M9) {
                                i12 = i14;
                                if (i15 != i12) {
                                    zhuYin = BuildConfig.VERSION_NAME;
                                }
                                arrayList5.add(CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, zhuYin, null, null, false, false, false, false, false, displayType, null, null, null, null, null, 0, 2139095039, 63, null));
                                i14 = i12;
                                num = num4;
                                rVar3 = rVar;
                            } else {
                                i12 = i14;
                            }
                            zhuYin = courseWord4.getZhuYin();
                            arrayList5.add(CourseWord.copy$default(courseWord4, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, zhuYin, null, null, false, false, false, false, false, displayType, null, null, null, null, null, 0, 2139095039, 63, null));
                            i14 = i12;
                            num = num4;
                            rVar3 = rVar;
                        }
                        arrayList4.add(CourseWord.copy$default(courseWord3, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList5, null, null, null, null, 0, -1, 62, null));
                        it2 = it3;
                        num = num;
                        i18 = 10;
                        rVar3 = rVar3;
                        num8 = num9;
                    }
                    arrayList = arrayList4;
                }
                num5 = num8;
                rVar2 = rVar3;
                x1.p pVar2 = new x1.p();
                pVar2.addAll(arrayList);
                sVar2.o0(pVar2);
                obj2 = pVar2;
            } else {
                num5 = num8;
                rVar2 = rVar3;
                obj2 = objQ19;
            }
            x1.p pVar3 = (x1.p) obj2;
            boolean zF15 = sVar2.f(courseWord) | sVar2.g(zBooleanValue) | sVar2.d(displayType.ordinal());
            Object objQ20 = sVar2.Q();
            Object obj3 = objQ20;
            if (zF15 || objQ20 == gVar) {
                if (zBooleanValue) {
                    arrayList2 = new ArrayList(ry.n.W(zhuyinOptionWords, 10));
                    Iterator it4 = zhuyinOptionWords.iterator();
                    while (it4.hasNext()) {
                        arrayList2.add(CourseWord.copy$default((CourseWord) it4.next(), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, displayType, null, null, null, null, null, 0, Integer.MAX_VALUE, 63, null));
                    }
                } else {
                    arrayList2 = new ArrayList(ry.n.W(optionWords, 10));
                    Iterator it5 = optionWords.iterator();
                    while (it5.hasNext()) {
                        arrayList2.add(CourseWord.copy$default((CourseWord) it5.next(), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, displayType, null, null, null, null, null, 0, Integer.MAX_VALUE, 63, null));
                    }
                }
                x1.p pVar4 = new x1.p();
                pVar4.addAll(arrayList2);
                sVar2.o0(pVar4);
                obj3 = pVar4;
            }
            x1.p pVar5 = (x1.p) obj3;
            boolean zF16 = sVar2.f(courseWord) | sVar2.g(zBooleanValue) | sVar2.d(displayType.ordinal());
            Object objQ21 = sVar2.Q();
            if (zF16 || objQ21 == gVar) {
                List<CourseWord> displayZhuyinCharWords = zBooleanValue ? courseWord.getDisplayZhuyinCharWords() : courseWord.getDisplayCharWords();
                ArrayList arrayList6 = new ArrayList(ry.n.W(displayZhuyinCharWords, 10));
                Iterator<T> it6 = displayZhuyinCharWords.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(CourseWord.copy$default((CourseWord) it6.next(), 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, displayType, null, null, null, null, null, 0, Integer.MAX_VALUE, 63, null));
                }
                objQ21 = ns.o.K(arrayList6);
                sVar2.o0(objQ21);
            }
            List list = (List) objQ21;
            boolean zG = sVar2.g(env.examCharAudioSwitch) | sVar2.d(env.keyLanguage) | sVar2.g(z15);
            Object objQ22 = sVar2.Q();
            if (zG || objQ22 == gVar) {
                objQ22 = ep.a.s(env.examCharAudioSwitch && xt.d.u(env.keyLanguage) && !z15, sVar2);
            }
            l1.b1 b1Var11 = (l1.b1) objQ22;
            boolean zG2 = sVar2.g(env.enableM13OptionLuoma) | sVar2.d(env.keyLanguage) | sVar2.d(o0Var.t()) | sVar2.g(z15);
            Object objQ23 = sVar2.Q();
            if (zG2 || objQ23 == gVar) {
                if (xt.d.u(env.keyLanguage)) {
                    if (xt.d.w(env.keyLanguage)) {
                        num6 = 4;
                        num7 = num5;
                        zD = ry.l.D(new Integer[]{num7, 4}, Integer.valueOf(o0Var.t()));
                    } else {
                        num6 = 4;
                        num7 = num5;
                        if (o0Var.t() == 0) {
                            zD = true;
                        }
                    }
                    if (zD && !(env.enableM13OptionLuoma && xt.d.u(env.keyLanguage))) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    if (z12 || z15) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    objS = ep.a.s(z13, sVar2);
                } else {
                    num6 = 4;
                    num7 = num5;
                }
                zD = false;
                if (zD) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    z13 = false;
                } else {
                    z13 = false;
                }
                objS = ep.a.s(z13, sVar2);
            } else {
                objS = objQ23;
                num6 = 4;
                num7 = num5;
            }
            l1.b1 b1Var12 = (l1.b1) objS;
            boolean zD3 = sVar2.d(env.keyLanguage) | sVar2.g(z15);
            Object objQ24 = sVar2.Q();
            if (zD3 || objQ24 == gVar) {
                objQ24 = Boolean.valueOf((!xt.d.u(env.keyLanguage) || z15 || (xt.d.w(env.keyLanguage) && rVar2 == ht.r.M9)) ? false : true);
                sVar2.o0(objQ24);
            }
            boolean zBooleanValue2 = ((Boolean) objQ24).booleanValue();
            boolean zD4 = sVar2.d(env.keyLanguage) | sVar2.d(o0Var.t());
            Object objQ25 = sVar2.Q();
            if (zD4 || objQ25 == gVar) {
                objQ25 = ep.a.s((xt.d.u(env.keyLanguage) ? xt.d.w(env.keyLanguage) ? ry.l.D(new Integer[]{num3, 6}, Integer.valueOf(o0Var.t())) : ry.l.D(new Integer[]{num7}, Integer.valueOf(o0Var.t())) : false) && !z15, sVar2);
            }
            l1.b1 b1Var13 = (l1.b1) objQ25;
            boolean zD5 = sVar2.d(o0Var.t()) | sVar2.d(env.keyLanguage);
            Object objQ26 = sVar2.Q();
            if (zD5 || objQ26 == gVar) {
                objQ26 = Boolean.valueOf(ry.l.D(new Integer[]{12, 1}, Integer.valueOf(env.keyLanguage)) && ry.l.D(new Integer[]{num7, num6}, Integer.valueOf(o0Var.t())));
                sVar2.o0(objQ26);
            }
            boolean zBooleanValue3 = ((Boolean) objQ26).booleanValue();
            boolean zD6 = sVar2.d(env.keyLanguage) | sVar2.f(courseWord) | sVar2.f(b1Var11) | sVar2.f(b1Var12) | sVar2.g(zBooleanValue2) | sVar2.f(b1Var13) | sVar2.g(zBooleanValue3) | sVar2.f(list) | sVar2.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar2.f(b0Var);
            l1.b1 b1Var14 = b1Var;
            boolean zF17 = zD6 | sVar2.f(b1Var14) | sVar2.f(b1Var3) | sVar2.f(pVar3) | sVar2.f(pVar5) | sVar2.f(pVar) | sVar2.f(a1Var) | sVar2.f(b1Var10) | sVar2.f(b1Var4) | sVar2.f(b1Var5) | sVar2.f(b1Var6) | sVar2.f(b1Var7) | sVar2.f(b1Var8) | sVar2.f(b1Var9);
            Object objQ27 = sVar2.Q();
            if (zF17 || objQ27 == gVar) {
                c11 = 256;
                z14 = true;
                m1Var = new jt.m1(courseWord, env.keyLanguage, b1Var11, b1Var12, zBooleanValue2, b1Var13, ((Boolean) b3Var.getValue()).booleanValue(), b0Var, b1Var14, b1Var3, list, pVar3, pVar5, pVar, a1Var, b1Var10, b1Var4, b1Var5, b1Var6, b1Var7, b1Var8, true, b1Var9, new jt.u1(o0Var, b1Var10, zBooleanValue3, lVar, null), new jt.o1(o0Var, b1Var10, b1Var14, b1Var4, pVar, null, 1), new jt.v1(b1Var11, o0Var, (vy.d) null), new jt.v1(o0Var, b1Var12, (vy.d) null), zBooleanValue3);
                sVar2.o0(m1Var);
            } else {
                m1Var = objQ27;
                c11 = 256;
                z14 = true;
            }
            jt.m1 m1Var2 = (jt.m1) m1Var;
            int i19 = r22 & 896;
            boolean z16 = i19 != c11 ? false : z14;
            Object objQ28 = sVar2.Q();
            if (z16 || objQ28 == gVar) {
                d0Var2 = d0Var;
                objQ28 = new o5(d0Var2, 22);
                sVar2.o0(objQ28);
            } else {
                d0Var2 = d0Var;
            }
            fz.a aVar = (fz.a) objQ28;
            boolean zH2 = sVar2.h(m1Var2) | (i19 != c11 ? false : z14);
            Object objQ29 = sVar2.Q();
            if (zH2 || objQ29 == gVar) {
                objQ29 = new d2(d0Var2, m1Var2, 2);
                sVar2.o0(objQ29);
            }
            fz.e eVar = (fz.e) objQ29;
            boolean z17 = i19 != c11 ? false : z14;
            Object objQ30 = sVar2.Q();
            if (z17 || objQ30 == gVar) {
                objQ30 = new o5(d0Var2, 23);
                sVar2.o0(objQ30);
            }
            fz.a aVar2 = (fz.a) objQ30;
            boolean z18 = i19 != c11 ? false : z14;
            Object objQ31 = sVar2.Q();
            if (z18 || objQ31 == gVar) {
                objQ31 = new v(d0Var2, 11);
                sVar2.o0(objQ31);
            }
            fz.c cVar = (fz.c) objQ31;
            boolean z19 = i19 != c11 ? false : z14;
            Object objQ32 = sVar2.Q();
            if (z19 || objQ32 == gVar) {
                objQ32 = new o5(d0Var2, 24);
                sVar2.o0(objQ32);
            }
            fz.a aVar3 = (fz.a) objQ32;
            boolean z20 = i19 != c11 ? false : z14;
            Object objQ33 = sVar2.Q();
            if (z20 || objQ33 == gVar) {
                objQ33 = new o5(d0Var2, 25);
                sVar2.o0(objQ33);
            }
            fz.a aVar4 = (fz.a) objQ33;
            boolean z21 = i19 != c11 ? false : z14;
            Object objQ34 = sVar2.Q();
            if (z21 || objQ34 == gVar) {
                objQ34 = new o5(d0Var2, 26);
                sVar2.o0(objQ34);
            }
            fz.a aVar5 = (fz.a) objQ34;
            int i21 = i13 & 112;
            boolean z22 = (i21 == 32 ? z14 : false) | (i19 != c11 ? false : z14);
            Object objQ35 = sVar2.Q();
            if (z22 || objQ35 == gVar) {
                oVar = courseTestParams;
                objQ35 = new k(d0Var2, oVar, 9);
                sVar2.o0(objQ35);
            } else {
                oVar = courseTestParams;
            }
            fz.a aVar6 = (fz.a) objQ35;
            boolean z23 = i19 != 256 ? false : z14;
            if (i21 != 32) {
                z14 = false;
            }
            boolean z24 = z23 | z14;
            Object objQ36 = sVar2.Q();
            if (z24 || objQ36 == gVar) {
                objQ36 = new e0(d0Var2, oVar, 18);
                sVar2.o0(objQ36);
            }
            l1.s sVar3 = sVar2;
            b0(m1Var2, oVar, aVar, eVar, aVar2, cVar, aVar3, aVar4, aVar5, aVar6, (fz.c) objQ36, sVar3, i21);
            sVar = sVar3;
        } else {
            d0Var2 = d0Var;
            l1.s sVar4 = sVar2;
            sVar4.W();
            sVar = sVar4;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var2, i11, 19);
        }
    }

    public static final void b(CourseCharacter data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        l1.s sVar;
        Object nVar2;
        Boolean bool;
        String str;
        Object objL;
        boolean z11;
        boolean z12;
        ys.d0 d0Var2 = d0Var;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(890117172);
        int i12 = i11 | (sVar2.h(data) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.f(d0Var2) ? 256 : 128);
        if (sVar2.T(i12 & 1, (i12 & 147) != 146)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            e20.a aVarC = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF = sVar2.f(null) | sVar2.f(aVarC);
            Object objQ2 = sVar2.Q();
            if (zF || objQ2 == gVar) {
                objQ2 = w4.c.e(vt.n0.class, aVarC, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            vt.n0 n0Var = (vt.n0) objQ2;
            boolean z13 = sVar2.j(dt.k3.f23943a) != null;
            boolean zF2 = sVar2.f(data);
            Object objQ3 = sVar2.Q();
            if (zF2 || objQ3 == gVar) {
                objQ3 = l1.t.B(ht.q.DEFAULT);
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var = (l1.b1) objQ3;
            boolean zF3 = sVar2.f(data);
            Object objQ4 = sVar2.Q();
            if (zF3 || objQ4 == gVar) {
                objQ4 = l1.t.B(ht.a.f33722e);
                sVar2.o0(objQ4);
            }
            l1.b1 b1Var2 = (l1.b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = defpackage.e.v(((fr.o0) n0Var).f27733a.handWriteBgType, sVar2);
            }
            l1.a1 a1Var = (l1.a1) objQ5;
            Object[] objArr = {data.getCharacter()};
            boolean zH = sVar2.h(n0Var);
            Object objQ6 = sVar2.Q();
            if (zH || objQ6 == gVar) {
                objQ6 = new av.d(n0Var, 13);
                sVar2.o0(objQ6);
            }
            l1.b1 b1Var3 = (l1.b1) w1.j.c(objArr, (fz.a) objQ6, sVar2, 0);
            Boolean bool2 = (Boolean) sVar2.j(ju.f.f37372f);
            boolean zBooleanValue = bool2.booleanValue();
            String character = data.getCharacter();
            int i13 = i12 & 896;
            boolean zG = sVar2.g(zBooleanValue) | (i13 == 256) | sVar2.h(data) | sVar2.f(b1Var2);
            Object objQ7 = sVar2.Q();
            if (zG || objQ7 == gVar) {
                bool = bool2;
                str = character;
                nVar2 = new n(zBooleanValue, d0Var2, data, b1Var2, null, 0);
                d0Var2 = d0Var2;
                sVar2.o0(nVar2);
            } else {
                bool = bool2;
                str = character;
                nVar2 = objQ7;
            }
            l1.t.g(str, bool, (fz.e) nVar2, sVar2);
            boolean zF4 = sVar2.f(data.getDrillJson());
            Object objQ8 = sVar2.Q();
            if (zF4 || objQ8 == gVar) {
                try {
                    h00.s sVar3 = xt.c.f56291a;
                    String drillJson = data.getDrillJson();
                    sVar3.getClass();
                    objL = (ou.c) sVar3.b(ou.c.Companion.serializer(), drillJson);
                } catch (Throwable th2) {
                    objL = com.bumptech.glide.e.l(th2);
                }
                objQ8 = qy.o.a(objL) == null ? (ou.c) objL : null;
                sVar2.o0(objQ8);
            }
            ou.c cVar = (ou.c) objQ8;
            boolean zH2 = sVar2.h(cVar) | (i13 == 256);
            Object objQ9 = sVar2.Q();
            if (zH2 || objQ9 == gVar) {
                objQ9 = new av.f0(8, cVar, d0Var2, null);
                sVar2.o0(objQ9);
            }
            ou.b bVar = ou.c.Companion;
            l1.t.f((fz.e) objQ9, cVar, sVar2);
            if (cVar != null) {
                sVar2.d0(354443411);
                ht.q qVar = (ht.q) b1Var.getValue();
                ht.l lVar = (ht.l) b1Var2.getValue();
                boolean z14 = !courseTestParams.f33757e;
                String strE0 = ub.a.e0(sVar2, R.string.test_continue);
                boolean z15 = z13;
                t1.d dVarD = t1.e.d(-876989873, new h(cVar, z15, d0Var2, b1Var, b0Var, n0Var, a1Var, data, b1Var2, b1Var3), sVar2);
                boolean z16 = ((i12 & 112) == 32) | (i13 == 256);
                Object objQ10 = sVar2.Q();
                if (z16 || objQ10 == gVar) {
                    objQ10 = new k(d0Var2, courseTestParams, 0);
                    sVar2.o0(objQ10);
                }
                fz.a aVar = (fz.a) objQ10;
                Object objQ11 = sVar2.Q();
                if (objQ11 == gVar) {
                    objQ11 = new ju.d(25);
                    sVar2.o0(objQ11);
                }
                fz.a aVar2 = (fz.a) objQ11;
                Object objQ12 = sVar2.Q();
                if (objQ12 == gVar) {
                    objQ12 = new br.b(27);
                    sVar2.o0(objQ12);
                }
                fz.c cVar2 = (fz.c) objQ12;
                boolean z17 = i13 == 256;
                Object objQ13 = sVar2.Q();
                if (z17 || objQ13 == gVar) {
                    objQ13 = new l(d0Var2, 0);
                    sVar2.o0(objQ13);
                }
                fz.a aVar3 = (fz.a) objQ13;
                boolean zG2 = sVar2.g(z15) | sVar2.f(b1Var) | (i13 == 256);
                Object objQ14 = sVar2.Q();
                if (zG2 || objQ14 == gVar) {
                    z12 = false;
                    objQ14 = new m(z15, d0Var2, b1Var, 0);
                    sVar2.o0(objQ14);
                } else {
                    z12 = false;
                }
                fz.a aVar4 = (fz.a) objQ14;
                Object objQ15 = sVar2.Q();
                if (objQ15 == gVar) {
                    objQ15 = new ju.d(25);
                    sVar2.o0(objQ15);
                }
                z11 = z12;
                dt.k3.e(null, qVar, lVar, false, false, false, false, z14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, strE0, f5177a, f5178b, dVarD, null, null, f5179c, null, null, null, null, null, aVar, null, aVar2, cVar2, aVar3, aVar4, null, null, (fz.a) objQ15, sVar2, 196608, 807100416, 113246208, 3072, 100015833, 3);
                sVar = sVar2;
            } else {
                sVar = sVar2;
                z11 = false;
                sVar.d0(347827918);
            }
            sVar.p(z11);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var2, i11, 5);
        }
    }

    public static final void c(ys.d0 d0Var, CourseCharacter courseCharacter, l1.b1 b1Var) {
        if (d0Var != null) {
            jh.h.m(d0Var, ns.o.K(courseCharacter.getAudioUri().toString()), (ht.l) b1Var.getValue(), new bp.h0(2, b1Var));
        }
        b1Var.setValue(new ht.c(ry.r.f50854a, 0, 1.0f));
    }

    public static final void c0(ht.o oVar, l1.i1 i1Var, fz.e eVar, String str, ht.l lVar) {
        if (oVar.f33762j) {
            i1Var.n(i1Var.getValue().longValue() + 1);
        }
        eVar.invoke(str, lVar);
    }

    public static final void d(jt.u state, boolean z11, fz.c onClickOption, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1731231321);
        int i12 = i11 | (sVar.h(state) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(onClickOption) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j3.y0 y0VarB = ct.c.b(sVar);
            long jC = ct.c.c(sVar);
            boolean zE = sVar.e(jC);
            Object objQ = sVar.Q();
            if (zE || objQ == l1.m.f39353a) {
                objQ = l1.t.B(j3.y0.a(y0VarB, 0L, jC, n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209));
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            z1.r rVarC = j0.c.C(j0.e2.e(z1.o.f58481a, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 16, 1);
            j0.u uVarA = j0.t.a(j0.i.g(24), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
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
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            int i13 = ((i12 << 6) & 7168) | 6 | ((i12 << 9) & 458752);
            g0("声母 (Initials)", (List) state.f37197i.getValue(), b1Var, z11, state.f37194f.getValue() != null, onClickOption, sVar, i13);
            g0("韵母 (Finals)", (List) state.f37198j.getValue(), b1Var, z11, state.f37195g.getValue() != null, onClickOption, sVar, i13);
            g0("声调 (Tone Marks)", (List) state.f37199k.getValue(), b1Var, z11, state.f37196h.getValue() != null, onClickOption, sVar, i13);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p0(state, z11, onClickOption, i11, 0);
        }
    }

    public static final void d0(final f8 displayType, final CourseWord option, final long j11, final float f5, boolean z11, l1.n nVar, final int i11) {
        l1.s sVar;
        final boolean z12;
        int i12;
        boolean zContains;
        boolean z13;
        boolean z14;
        boolean z15;
        kotlin.jvm.internal.m.f(displayType, "displayType");
        kotlin.jvm.internal.m.f(option, "option");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1753489160);
        int i13 = (sVar2.d(displayType.ordinal()) ? 4 : 2) | i11 | (sVar2.h(option) ? 32 : 16) | (sVar2.e(j11) ? 256 : 128);
        if ((i11 & 3072) == 0) {
            i13 |= sVar2.c(f5) ? 2048 : 1024;
        }
        int i14 = i13 | OSSConstants.DEFAULT_BUFFER_SIZE;
        if (sVar2.T(i14 & 1, (i14 & 9363) != 9362)) {
            sVar2.Y();
            if ((i11 & 1) == 0 || sVar2.C()) {
                i12 = i14 & (-57345);
                zContains = ry.l.m0(new Integer[]{4, 14, 47, 48, 5, 15, 53, 54}).contains(Integer.valueOf(((Number) sVar2.j(ju.f.f37370d)).intValue()));
            } else {
                sVar2.W();
                i12 = i14 & (-57345);
                zContains = z11;
            }
            int i15 = i12;
            sVar2.q();
            long jC = ct.c.c(sVar2);
            z1.h hVar = z1.c.P;
            z1.o oVar = z1.o.f58481a;
            z1.r rVarB = j0.c.B(oVar, 4, 8);
            j0.u uVarA = j0.t.a(j0.i.f35305c, hVar, sVar2, 48);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarB);
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
            y2.h hVar2 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar2);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar2);
            if (displayType == f8.PIC_TRANSLATION) {
                sVar2.d0(825613567);
                ua.b(option.getTranslation(), d2.h.a(j0.e2.e(oVar, 1.0f), f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), j11, jC, n3.s.H, null, null, 0L, null, null, 3, 0, 0L, null, 16744440), sVar2, 0, 0, 65532);
                sVar2.p(false);
                sVar = sVar2;
                z13 = false;
            } else {
                sVar2.d0(826061734);
                z1.r rVarA = d2.h.a(j0.e2.e(oVar, 1.0f), f5);
                z13 = false;
                sVar = sVar2;
                dt.g4.b(option, j3.y0.a(ct.c.b(sVar2), j11, jC, null, null, null, 0L, null, null, 3, 0, 0L, null, 16744444), rVarA, false, null, false, false, false, 0, null, sVar, (i15 >> 3) & 14, 1016);
                sVar.p(false);
            }
            if (!zContains || option.getPos().length() <= 0) {
                z14 = z13;
                z15 = true;
                sVar.d0(809263392);
            } else {
                sVar.d0(826452024);
                z15 = true;
                l1.s sVar3 = sVar;
                z14 = z13;
                ua.b(option.getPos(), null, g2.x.c(j11, 0.5f), fr.j3.A(12), new n3.o(1), null, n3.i.f43155c, 0L, null, 0L, 0, false, 0, 0, null, sVar3, 3072, 0, 130978);
                sVar = sVar3;
            }
            sVar.p(z14);
            sVar.p(z15);
            z12 = zContains;
        } else {
            sVar = sVar2;
            sVar.W();
            z12 = z11;
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: bt.x6
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b.d0(displayType, option, j11, f5, z12, (l1.n) obj, l1.t.M(i11 | 1));
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void e(ot.a data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        ot.a aVar;
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1135480038);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            CourseSentence courseSentence = data.f45734a;
            List list = data.f45735b;
            List list2 = data.f45736c;
            ArrayList arrayList = data.f45737d;
            List list3 = data.f45738e;
            kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
            boolean zF = sVar.f(courseSentence);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(courseSentence);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zF3 = sVar.f(courseSentence);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = l1.t.B(null);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            boolean zF4 = sVar.f(courseSentence);
            Object objQ4 = sVar.Q();
            if (zF4 || objQ4 == gVar) {
                objQ4 = l1.t.B(null);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            boolean zF5 = sVar.f(courseSentence);
            Object objQ5 = sVar.Q();
            if (zF5 || objQ5 == gVar) {
                objQ5 = l1.t.B(null);
                sVar.o0(objQ5);
            }
            l1.b1 b1Var5 = (l1.b1) objQ5;
            boolean zF6 = sVar.f(courseSentence);
            Object objQ6 = sVar.Q();
            if (zF6 || objQ6 == gVar) {
                objQ6 = l1.t.B(list);
                sVar.o0(objQ6);
            }
            l1.b1 b1Var6 = (l1.b1) objQ6;
            boolean zF7 = sVar.f(courseSentence);
            Object objQ7 = sVar.Q();
            if (zF7 || objQ7 == gVar) {
                objQ7 = l1.t.B(list2);
                sVar.o0(objQ7);
            }
            l1.b1 b1Var7 = (l1.b1) objQ7;
            boolean zF8 = sVar.f(courseSentence);
            Object objQ8 = sVar.Q();
            if (zF8 || objQ8 == gVar) {
                objQ8 = l1.t.B(arrayList);
                sVar.o0(objQ8);
            }
            l1.b1 b1Var8 = (l1.b1) objQ8;
            Object objQ9 = sVar.Q();
            if (objQ9 == gVar) {
                objQ9 = l1.t.s(new dt.h2(28, b1Var));
                sVar.o0(objQ9);
            }
            l1.b3 b3Var = (l1.b3) objQ9;
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF9 = sVar.f(null) | sVar.f(aVarC);
            Object objQ10 = sVar.Q();
            if (zF9 || objQ10 == gVar) {
                objQ10 = w4.c.e(vt.n0.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            vt.n0 n0Var = (vt.n0) objQ10;
            boolean zF10 = sVar.f(b1Var3) | sVar.f(b1Var4) | sVar.f(b1Var5);
            Object objQ11 = sVar.Q();
            Object obj = objQ11;
            if (zF10 || objQ11 == gVar) {
                x1.p pVar = new x1.p();
                CourseWord courseWord = (CourseWord) b1Var3.getValue();
                if (courseWord != null) {
                    pVar.add(courseWord);
                }
                CourseWord courseWord2 = (CourseWord) b1Var4.getValue();
                if (courseWord2 != null) {
                    pVar.add(courseWord2);
                }
                CourseWord courseWord3 = (CourseWord) b1Var5.getValue();
                if (courseWord3 != null) {
                    pVar.add(courseWord3);
                }
                sVar.o0(pVar);
                obj = pVar;
            }
            x1.p pVar2 = (x1.p) obj;
            boolean zG = sVar.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar.f(courseSentence) | sVar.f(b1Var) | sVar.f(b1Var2) | sVar.f(b1Var3) | sVar.f(b1Var4) | sVar.f(b1Var5) | sVar.f(b1Var6) | sVar.f(b1Var7) | sVar.f(b1Var8);
            Object objQ12 = sVar.Q();
            if (zG || objQ12 == gVar) {
                String sentence = courseSentence.getSentence();
                boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
                Env env = ((fr.o0) n0Var).f27733a;
                jt.u uVar = new jt.u(sentence, list3, zBooleanValue, b1Var, b1Var2, pVar2, b1Var3, b1Var4, b1Var5, b1Var6, b1Var7, b1Var8);
                sVar.o0(uVar);
                objQ12 = uVar;
            }
            jt.u uVar2 = (jt.u) objQ12;
            CourseSentence courseSentence2 = data.f45734a;
            String strE0 = ub.a.e0(sVar, R.string.sentence_m4_hint);
            d0Var2 = d0Var;
            aVar = data;
            t1.d dVarD = t1.e.d(1656982597, new bp.t(courseTestParams, uVar2, d0Var, data, 2), sVar);
            t1.d dVarD2 = t1.e.d(-1147415994, new at.i(uVar2, d0Var2, aVar, 6), sVar);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ13 = sVar.Q();
            if (z11 || objQ13 == gVar) {
                objQ13 = new l(d0Var2, 4);
                sVar.o0(objQ13);
            }
            fz.a aVar2 = (fz.a) objQ13;
            boolean zH = (i13 == 256) | sVar.h(uVar2);
            Object objQ14 = sVar.Q();
            if (zH || objQ14 == gVar) {
                objQ14 = new at.h(15, d0Var2, uVar2);
                sVar.o0(objQ14);
            }
            fz.e eVar = (fz.e) objQ14;
            boolean z12 = i13 == 256;
            Object objQ15 = sVar.Q();
            if (z12 || objQ15 == gVar) {
                objQ15 = new v(d0Var2, 1);
                sVar.o0(objQ15);
            }
            fz.c cVar = (fz.c) objQ15;
            boolean z13 = i13 == 256;
            Object objQ16 = sVar.Q();
            if (z13 || objQ16 == gVar) {
                objQ16 = new l(d0Var2, 5);
                sVar.o0(objQ16);
            }
            fz.a aVar3 = (fz.a) objQ16;
            int i14 = i12 & 112;
            boolean z14 = (i13 == 256) | (i14 == 32);
            Object objQ17 = sVar.Q();
            if (z14 || objQ17 == gVar) {
                objQ17 = new k(d0Var2, courseTestParams, 1);
                sVar.o0(objQ17);
            }
            fz.a aVar4 = (fz.a) objQ17;
            boolean z15 = (i13 == 256) | (i14 == 32);
            Object objQ18 = sVar.Q();
            if (z15 || objQ18 == gVar) {
                objQ18 = new e0(d0Var2, courseTestParams, 1);
                sVar.o0(objQ18);
            }
            f(courseSentence2, uVar2, courseTestParams, strE0, dVarD, dVarD2, aVar2, eVar, cVar, aVar3, aVar4, (fz.c) objQ18, sVar, ((i12 << 3) & 896) | 1794048);
        } else {
            aVar = data;
            d0Var2 = d0Var;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(aVar, courseTestParams, d0Var2, i11, 7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02be  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:109:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:110:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:115:0x0317  */
    /* JADX WARN: Code duplicated, block: B:118:0x032e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0330  */
    /* JADX WARN: Code duplicated, block: B:123:0x033b  */
    /* JADX WARN: Code duplicated, block: B:126:0x038f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0393  */
    /* JADX WARN: Code duplicated, block: B:132:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:135:0x0504  */
    /* JADX WARN: Code duplicated, block: B:136:0x0508  */
    /* JADX WARN: Code duplicated, block: B:141:0x0523  */
    /* JADX WARN: Code duplicated, block: B:147:0x055a  */
    /* JADX WARN: Code duplicated, block: B:150:0x058b  */
    /* JADX WARN: Code duplicated, block: B:151:0x058f  */
    /* JADX WARN: Code duplicated, block: B:156:0x05aa  */
    /* JADX WARN: Code duplicated, block: B:159:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:160:0x05f3  */
    /* JADX WARN: Code duplicated, block: B:162:0x0605  */
    /* JADX WARN: Code duplicated, block: B:164:0x061c  */
    /* JADX WARN: Code duplicated, block: B:167:0x0646  */
    /* JADX WARN: Code duplicated, block: B:168:0x0649  */
    /* JADX WARN: Code duplicated, block: B:173:0x065e  */
    /* JADX WARN: Code duplicated, block: B:176:0x068e  */
    /* JADX WARN: Code duplicated, block: B:177:0x0692  */
    /* JADX WARN: Code duplicated, block: B:182:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:87:0x025b  */
    /* JADX WARN: Code duplicated, block: B:88:0x025f  */
    /* JADX WARN: Code duplicated, block: B:93:0x027a  */
    /* JADX WARN: Code duplicated, block: B:96:0x029f  */
    /* JADX WARN: Code duplicated, block: B:97:0x02a3  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v35, types: [java.lang.Object, java.util.List] */
    public static final void e0(ou.c cVar, int i11, z1.r rVar, fz.a onWriterEnd, fz.e eVar, fz.e eVar2, fz.c updateHandWriteBgType, l1.n nVar, int i12) {
        l1.s sVar;
        Boolean bool;
        int i13;
        int i14;
        pu.b bVar;
        Object fVar;
        l1.b1 b1Var;
        l1.b1 b1Var2;
        Integer num;
        int i15;
        boolean z11;
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        boolean z12;
        Object objQ;
        int iHashCode4;
        int iHashCode5;
        boolean zH;
        Object objQ2;
        boolean z13;
        int iHashCode6;
        boolean zBooleanValue;
        boolean z14;
        long j11;
        long j12;
        float f5;
        boolean zH2;
        Object objQ3;
        int iHashCode7;
        kotlin.jvm.internal.m.f(onWriterEnd, "onWriterEnd");
        kotlin.jvm.internal.m.f(updateHandWriteBgType, "updateHandWriteBgType");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1929958383);
        int i16 = i12 | (sVar2.h(cVar) ? 4 : 2) | (sVar2.d(i11) ? 32 : 16) | (sVar2.f(rVar) ? 256 : 128) | (sVar2.h(onWriterEnd) ? 2048 : 1024) | (sVar2.h(updateHandWriteBgType) ? 1048576 : 524288);
        if (sVar2.T(i16 & 1, (i16 & 599187) != 599186)) {
            Object objQ4 = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ4 == gVar) {
                objQ4 = l1.t.B(ou.f.Writer);
                sVar2.o0(objQ4);
            }
            l1.b1 b1Var3 = (l1.b1) objQ4;
            Object objQ5 = sVar2.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ5);
            }
            l1.b1 b1Var4 = (l1.b1) objQ5;
            Object objQ6 = sVar2.Q();
            if (objQ6 == gVar) {
                objQ6 = l1.t.B(Boolean.TRUE);
                sVar2.o0(objQ6);
            }
            l1.b1 b1Var5 = (l1.b1) objQ6;
            Boolean bool2 = (Boolean) sVar2.j(ju.f.f37373g);
            boolean zBooleanValue2 = bool2.booleanValue();
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = new pu.b();
                sVar2.o0(objQ7);
            }
            pu.b bVar2 = (pu.b) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = l1.t.q(sVar2);
                sVar2.o0(objQ8);
            }
            rz.b0 b0Var = (rz.b0) objQ8;
            int i17 = i16 & 14;
            boolean zF = (i17 == 4 || sVar2.f(cVar)) | sVar2.f(b0Var);
            Object objQ9 = sVar2.Q();
            if (zF || objQ9 == gVar) {
                ou.e eVar3 = new ou.e(0L, 0L, 0L, 0L, 0L, false, false, zBooleanValue2, 1023);
                androidx.lifecycle.compose.a aVar = new androidx.lifecycle.compose.a(3, onWriterEnd, bVar2, b1Var3);
                at.f fVar2 = new at.f(11, bVar2, b1Var3);
                bool = bool2;
                i13 = 32;
                i14 = 16;
                bVar = bVar2;
                nu.e eVar4 = new nu.e(bVar, cVar, b0Var, eVar3, aVar, fVar2);
                sVar2.o0(eVar4);
                objQ9 = eVar4;
            } else {
                bool = bool2;
                bVar = bVar2;
                i13 = 32;
                i14 = 16;
            }
            nu.e eVar5 = (nu.e) objQ9;
            Integer numValueOf = Integer.valueOf(i11);
            boolean zH3 = sVar2.h(bVar) | ((i16 & 112) == i13) | sVar2.h(eVar5);
            Object objQ10 = sVar2.Q();
            if (zH3 || objQ10 == gVar) {
                b1Var = b1Var4;
                b1Var2 = b1Var5;
                num = numValueOf;
                pu.b bVar3 = bVar;
                fVar = new b0.f(i11, bVar3, eVar5, b1Var, b1Var2, (vy.d) null);
                i15 = i11;
                bVar = bVar3;
                sVar2.o0(fVar);
            } else {
                i15 = i11;
                b1Var2 = b1Var5;
                num = numValueOf;
                fVar = objQ10;
                b1Var = b1Var4;
            }
            int i18 = (i16 >> 3) & 14;
            l1.t.f((fz.e) fVar, num, sVar2);
            ou.f fVar3 = (ou.f) b1Var3.getValue();
            boolean zH4 = sVar2.h(eVar5);
            pu.b bVar4 = bVar;
            Object objQ11 = sVar2.Q();
            l1.b1 b1Var6 = b1Var;
            vy.d dVar = null;
            if (zH4 || objQ11 == gVar) {
                objQ11 = new av.f0(9, eVar5, b1Var3, dVar);
                sVar2.o0(objQ11);
            }
            l1.t.f((fz.e) objQ11, fVar3, sVar2);
            boolean zH5 = sVar2.h(eVar5) | sVar2.g(zBooleanValue2);
            Object objQ12 = sVar2.Q();
            if (zH5 || objQ12 == gVar) {
                objQ12 = new o(eVar5, zBooleanValue2, (vy.d) null);
                sVar2.o0(objQ12);
            }
            l1.t.f((fz.e) objQ12, bool, sVar2);
            z1.h hVar = z1.c.P;
            j0.d dVar2 = j0.i.f35305c;
            j0.u uVarA = j0.t.a(dVar2, hVar, sVar2, 48);
            int iHashCode8 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVar);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar2 = y2.j.f56917f;
            l1.t.J(hVar2, uVarA, sVar2);
            y2.h hVar3 = y2.j.f56916e;
            l1.t.J(hVar3, q1VarL, sVar2);
            y2.h hVar4 = y2.j.f56918g;
            l1.b1 b1Var7 = b1Var2;
            if (sVar2.S) {
                z11 = zBooleanValue2;
            } else {
                if (!kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode8))) {
                }
                z11 = zBooleanValue2;
                y2.h hVar5 = y2.j.f56915d;
                l1.t.J(hVar5, rVarC, sVar2);
                z1.o oVar = z1.o.f58481a;
                j0.c.g(sVar2, j0.v.a(oVar, 0.5f));
                j0.u uVarA2 = j0.t.a(dVar2, z1.c.O, sVar2, 0);
                iHashCode = Long.hashCode(sVar2.T);
                l1.q1 q1VarL2 = sVar2.l();
                z1.r rVarC2 = z1.a.c(sVar2, oVar);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar2, uVarA2, sVar2);
                l1.t.J(hVar3, q1VarL2, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                    defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
                }
                l1.t.J(hVar5, rVarC2, sVar2);
                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
                iHashCode2 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL3 = sVar2.l();
                z1.r rVarC3 = z1.a.c(sVar2, oVar);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar2, a2VarA, sVar2);
                l1.t.J(hVar3, q1VarL3, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                    defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
                }
                l1.t.J(hVar5, rVarC3, sVar2);
                if (1.0f <= 0.0d) {
                    k0.a.a("invalid weight; must be greater than zero");
                }
                j0.i1 i1Var = new j0.i1(1.0f, true);
                z1.j jVar = z1.c.f58463a;
                w2.q0 q0VarD = j0.o.d(jVar, false);
                iHashCode3 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL4 = sVar2.l();
                z1.r rVarC4 = z1.a.c(sVar2, i1Var);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar2, q0VarD, sVar2);
                l1.t.J(hVar3, q1VarL4, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                    defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
                }
                l1.t.J(hVar5, rVarC4, sVar2);
                eVar.invoke(sVar2, 6);
                sVar2.p(true);
                if ((i16 & 3670016) == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objQ = sVar2.Q();
                if (z12 || objQ == gVar) {
                    objQ = new b0.o1(updateHandWriteBgType, 2);
                    sVar2.o0(objQ);
                }
                a(i15, i18, (fz.c) objQ, sVar2, null);
                sVar2.p(true);
                j0.c.g(sVar2, j0.e2.g(oVar, 4));
                eVar2.invoke(sVar2, 6);
                float f11 = 8;
                ep.a.C(oVar, f11, sVar2, true);
                j0.c.g(sVar2, j0.v.a(oVar, 1.0f));
                z1.r rVarJ = j0.c.j(j0.e2.e(oVar, 1.0f), 1.0f);
                w2.q0 q0VarD2 = j0.o.d(jVar, false);
                iHashCode4 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL5 = sVar2.l();
                z1.r rVarC5 = z1.a.c(sVar2, rVarJ);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar2, q0VarD2, sVar2);
                l1.t.J(hVar3, q1VarL5, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode4))) {
                    defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar4);
                }
                l1.t.J(hVar5, rVarC5, sVar2);
                d0.n.c(se.k.y(R.drawable.strokes_order_tian, sVar2, 0), null, d2.h.a(j0.e2.d(oVar, 1.0f), 0.8f), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(h1.k7.t(sVar2).B, 5), sVar2, 25008, 40);
                ou.e eVar6 = new ou.e(ob.f.p(h1.k7.t(sVar2), sVar2), ob.f.l(h1.k7.t(sVar2), sVar2), ob.f.o(h1.k7.t(sVar2), sVar2), ob.f.m(h1.k7.t(sVar2), sVar2), ob.f.n(h1.k7.t(sVar2), sVar2), ((Boolean) b1Var6.getValue()).booleanValue(), ((Boolean) b1Var7.getValue()).booleanValue(), z11, LogSeverity.EMERGENCY_VALUE);
                ou.b bVar5 = ou.c.Companion;
                ub.a.J(cVar, eVar5, null, eVar6, sVar2, i17 | 72);
                sVar2.p(true);
                ua.b(bVar4.e() + "/" + cVar.f46072e.size(), j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, f11, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, fr.j3.A(i14), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199728, 0, 131028);
                j0.c.g(sVar2, j0.v.a(oVar, 1.0f));
                j0.a2 a2VarA2 = j0.z1.a(j0.i.g((float) i14), z1.c.L, sVar2, 6);
                iHashCode5 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL6 = sVar2.l();
                z1.r rVarC6 = z1.a.c(sVar2, oVar);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar2, a2VarA2, sVar2);
                l1.t.J(hVar3, q1VarL6, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode5))) {
                    defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVar4);
                }
                l1.t.J(hVar5, rVarC6, sVar2);
                float f12 = 52;
                float f13 = 12;
                z1.r rVarB = d2.h.b(d0.n.h(j0.e2.n(oVar, f12), h1.k7.t(sVar2).f31021c, r0.f.d(f13)), r0.f.d(f13));
                zH = sVar2.h(eVar5);
                objQ2 = sVar2.Q();
                if (!zH || objQ2 == gVar) {
                    z13 = false;
                    objQ2 = new f(eVar5, null == true ? 1 : 0);
                    sVar2.o0(objQ2);
                } else {
                    z13 = false;
                }
                z1.r rVarA = j0.c.A(d0.n.o(rVarB, z13, null, (fz.a) objQ2, 15), f13);
                w2.q0 q0VarD3 = j0.o.d(jVar, z13);
                iHashCode6 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL7 = sVar2.l();
                z1.r rVarC7 = z1.a.c(sVar2, rVarA);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar2, q0VarD3, sVar2);
                l1.t.J(hVar3, q1VarL7, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode6))) {
                    defpackage.e.A(iHashCode6, sVar2, iHashCode6, hVar4);
                }
                l1.t.J(hVar5, rVarC7, sVar2);
                h1.r4.b(se.k.y(R.drawable.hand_write_clear, sVar2, 0), null, null, h1.k7.t(sVar2).f31017a, sVar2, 48, 4);
                sVar2.p(true);
                zBooleanValue = ((Boolean) bVar4.E.getValue()).booleanValue();
                boolean z15 = !zBooleanValue;
                if (zBooleanValue) {
                    z14 = false;
                    sVar2.d0(110344849);
                    j11 = h1.k7.t(sVar2).f31035r;
                    sVar2.p(false);
                } else {
                    sVar2.d0(110265551);
                    j11 = h1.k7.t(sVar2).f31021c;
                    z14 = false;
                    sVar2.p(false);
                }
                if (zBooleanValue) {
                    sVar2.d0(110538351);
                    j12 = h1.k7.t(sVar2).f31036s;
                    sVar2.p(z14);
                } else {
                    sVar2.d0(110467640);
                    j12 = h1.k7.t(sVar2).f31017a;
                    sVar2.p(z14);
                }
                long j13 = j12;
                z1.r rVarB2 = d2.h.b(d0.n.h(j0.e2.n(oVar, f12), j11, r0.f.d(f13)), r0.f.d(f13));
                if (zBooleanValue) {
                    f5 = 0.4f;
                } else {
                    f5 = 1.0f;
                }
                z1.r rVarA2 = d2.h.a(rVarB2, f5);
                zH2 = sVar2.h(eVar5);
                objQ3 = sVar2.Q();
                if (zH2 || objQ3 == gVar) {
                    objQ3 = new f(eVar5, 1);
                    sVar2.o0(objQ3);
                }
                z1.r rVarA3 = j0.c.A(d0.n.o(rVarA2, z15, null, (fz.a) objQ3, 14), f13);
                w2.q0 q0VarD4 = j0.o.d(jVar, false);
                iHashCode7 = Long.hashCode(sVar2.T);
                l1.q1 q1VarL8 = sVar2.l();
                z1.r rVarC8 = z1.a.c(sVar2, rVarA3);
                sVar2.h0();
                if (sVar2.S) {
                    sVar2.k(iVar);
                } else {
                    sVar2.r0();
                }
                l1.t.J(hVar2, q0VarD4, sVar2);
                l1.t.J(hVar3, q1VarL8, sVar2);
                if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode7))) {
                    defpackage.e.A(iHashCode7, sVar2, iHashCode7, hVar4);
                }
                l1.t.J(hVar5, rVarC8, sVar2);
                h1.r4.b(se.k.y(R.drawable.hand_write_stroke_hint, sVar2, 0), null, null, j13, sVar2, 48, 4);
                sVar = sVar2;
                sVar.p(true);
                sVar.p(true);
                j0.c.g(sVar, j0.v.a(oVar, 1.0f));
                sVar.p(true);
            }
            z11 = zBooleanValue2;
            defpackage.e.A(iHashCode8, sVar2, iHashCode8, hVar4);
            z11 = zBooleanValue2;
            y2.h hVar6 = y2.j.f56915d;
            l1.t.J(hVar6, rVarC, sVar2);
            z1.o oVar2 = z1.o.f58481a;
            j0.c.g(sVar2, j0.v.a(oVar2, 0.5f));
            j0.u uVarA3 = j0.t.a(dVar2, z1.c.O, sVar2, 0);
            iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL9 = sVar2.l();
            z1.r rVarC9 = z1.a.c(sVar2, oVar2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, uVarA3, sVar2);
            l1.t.J(hVar3, q1VarL9, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            } else {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar4);
            }
            l1.t.J(hVar6, rVarC9, sVar2);
            j0.a2 a2VarA3 = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
            iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL10 = sVar2.l();
            z1.r rVarC10 = z1.a.c(sVar2, oVar2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, a2VarA3, sVar2);
            l1.t.J(hVar3, q1VarL10, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
            } else {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar4);
            }
            l1.t.J(hVar6, rVarC10, sVar2);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            j0.i1 i1Var2 = new j0.i1(1.0f, true);
            z1.j jVar2 = z1.c.f58463a;
            w2.q0 q0VarD5 = j0.o.d(jVar2, false);
            iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL11 = sVar2.l();
            z1.r rVarC11 = z1.a.c(sVar2, i1Var2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD5, sVar2);
            l1.t.J(hVar3, q1VarL11, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
            } else {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar4);
            }
            l1.t.J(hVar6, rVarC11, sVar2);
            eVar.invoke(sVar2, 6);
            sVar2.p(true);
            if ((i16 & 3670016) == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            objQ = sVar2.Q();
            if (z12) {
                objQ = new b0.o1(updateHandWriteBgType, 2);
                sVar2.o0(objQ);
            } else {
                objQ = new b0.o1(updateHandWriteBgType, 2);
                sVar2.o0(objQ);
            }
            a(i15, i18, (fz.c) objQ, sVar2, null);
            sVar2.p(true);
            j0.c.g(sVar2, j0.e2.g(oVar2, 4));
            eVar2.invoke(sVar2, 6);
            float f14 = 8;
            ep.a.C(oVar2, f14, sVar2, true);
            j0.c.g(sVar2, j0.v.a(oVar2, 1.0f));
            z1.r rVarJ2 = j0.c.j(j0.e2.e(oVar2, 1.0f), 1.0f);
            w2.q0 q0VarD6 = j0.o.d(jVar2, false);
            iHashCode4 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL12 = sVar2.l();
            z1.r rVarC12 = z1.a.c(sVar2, rVarJ2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD6, sVar2);
            l1.t.J(hVar3, q1VarL12, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar4);
            } else {
                defpackage.e.A(iHashCode4, sVar2, iHashCode4, hVar4);
            }
            l1.t.J(hVar6, rVarC12, sVar2);
            d0.n.c(se.k.y(R.drawable.strokes_order_tian, sVar2, 0), null, d2.h.a(j0.e2.d(oVar2, 1.0f), 0.8f), null, w2.i.f54520g, CropImageView.DEFAULT_ASPECT_RATIO, new g2.p(h1.k7.t(sVar2).B, 5), sVar2, 25008, 40);
            ou.e eVar7 = new ou.e(ob.f.p(h1.k7.t(sVar2), sVar2), ob.f.l(h1.k7.t(sVar2), sVar2), ob.f.o(h1.k7.t(sVar2), sVar2), ob.f.m(h1.k7.t(sVar2), sVar2), ob.f.n(h1.k7.t(sVar2), sVar2), ((Boolean) b1Var6.getValue()).booleanValue(), ((Boolean) b1Var7.getValue()).booleanValue(), z11, LogSeverity.EMERGENCY_VALUE);
            ou.b bVar6 = ou.c.Companion;
            ub.a.J(cVar, eVar5, null, eVar7, sVar2, i17 | 72);
            sVar2.p(true);
            ua.b(bVar4.e() + "/" + cVar.f46072e.size(), j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, f14, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, fr.j3.A(i14), null, n3.s.H, null, 0L, null, 0L, 0, false, 0, 0, null, sVar2, 199728, 0, 131028);
            j0.c.g(sVar2, j0.v.a(oVar2, 1.0f));
            j0.a2 a2VarA4 = j0.z1.a(j0.i.g((float) i14), z1.c.L, sVar2, 6);
            iHashCode5 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL13 = sVar2.l();
            z1.r rVarC13 = z1.a.c(sVar2, oVar2);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, a2VarA4, sVar2);
            l1.t.J(hVar3, q1VarL13, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVar4);
            } else {
                defpackage.e.A(iHashCode5, sVar2, iHashCode5, hVar4);
            }
            l1.t.J(hVar6, rVarC13, sVar2);
            float f15 = 52;
            float f16 = 12;
            z1.r rVarB3 = d2.h.b(d0.n.h(j0.e2.n(oVar2, f15), h1.k7.t(sVar2).f31021c, r0.f.d(f16)), r0.f.d(f16));
            zH = sVar2.h(eVar5);
            objQ2 = sVar2.Q();
            if (zH) {
                z13 = false;
                objQ2 = new f(eVar5, null == true ? 1 : 0);
                sVar2.o0(objQ2);
            } else {
                z13 = false;
                objQ2 = new f(eVar5, null == true ? 1 : 0);
                sVar2.o0(objQ2);
            }
            z1.r rVarA4 = j0.c.A(d0.n.o(rVarB3, z13, null, (fz.a) objQ2, 15), f16);
            w2.q0 q0VarD7 = j0.o.d(jVar2, z13);
            iHashCode6 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL14 = sVar2.l();
            z1.r rVarC14 = z1.a.c(sVar2, rVarA4);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD7, sVar2);
            l1.t.J(hVar3, q1VarL14, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode6, sVar2, iHashCode6, hVar4);
            } else {
                defpackage.e.A(iHashCode6, sVar2, iHashCode6, hVar4);
            }
            l1.t.J(hVar6, rVarC14, sVar2);
            h1.r4.b(se.k.y(R.drawable.hand_write_clear, sVar2, 0), null, null, h1.k7.t(sVar2).f31017a, sVar2, 48, 4);
            sVar2.p(true);
            zBooleanValue = ((Boolean) bVar4.E.getValue()).booleanValue();
            boolean z16 = !zBooleanValue;
            if (zBooleanValue) {
                sVar2.d0(110265551);
                j11 = h1.k7.t(sVar2).f31021c;
                z14 = false;
                sVar2.p(false);
            } else {
                z14 = false;
                sVar2.d0(110344849);
                j11 = h1.k7.t(sVar2).f31035r;
                sVar2.p(false);
            }
            if (zBooleanValue) {
                sVar2.d0(110467640);
                j12 = h1.k7.t(sVar2).f31017a;
                sVar2.p(z14);
            } else {
                sVar2.d0(110538351);
                j12 = h1.k7.t(sVar2).f31036s;
                sVar2.p(z14);
            }
            long j14 = j12;
            z1.r rVarB4 = d2.h.b(d0.n.h(j0.e2.n(oVar2, f15), j11, r0.f.d(f16)), r0.f.d(f16));
            if (zBooleanValue) {
                f5 = 1.0f;
            } else {
                f5 = 0.4f;
            }
            z1.r rVarA5 = d2.h.a(rVarB4, f5);
            zH2 = sVar2.h(eVar5);
            objQ3 = sVar2.Q();
            if (zH2) {
                objQ3 = new f(eVar5, 1);
                sVar2.o0(objQ3);
            } else {
                objQ3 = new f(eVar5, 1);
                sVar2.o0(objQ3);
            }
            z1.r rVarA6 = j0.c.A(d0.n.o(rVarA5, z16, null, (fz.a) objQ3, 14), f16);
            w2.q0 q0VarD8 = j0.o.d(jVar2, false);
            iHashCode7 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL15 = sVar2.l();
            z1.r rVarC15 = z1.a.c(sVar2, rVarA6);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar2, q0VarD8, sVar2);
            l1.t.J(hVar3, q1VarL15, sVar2);
            if (sVar2.S) {
                defpackage.e.A(iHashCode7, sVar2, iHashCode7, hVar4);
            } else {
                defpackage.e.A(iHashCode7, sVar2, iHashCode7, hVar4);
            }
            l1.t.J(hVar6, rVarC15, sVar2);
            h1.r4.b(se.k.y(R.drawable.hand_write_stroke_hint, sVar2, 0), null, null, j14, sVar2, 48, 4);
            sVar = sVar2;
            sVar.p(true);
            sVar.p(true);
            j0.c.g(sVar, j0.v.a(oVar2, 1.0f));
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new br.d(cVar, i11, rVar, onWriterEnd, eVar, eVar2, updateHandWriteBgType, i12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:128:0x0248  */
    /* JADX WARN: Code duplicated, block: B:134:0x025c  */
    public static final void f(CourseSentence sentenceItem, jt.u state, ht.o courseTestParams, String hintText, t1.d dVar, t1.d dVar2, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickChecked, fz.a onClickContinue, fz.a onClickSkipListen, fz.c onClickBugReport, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        l1.g gVar;
        boolean zH;
        Object objQ;
        l1.s sVar2;
        kotlin.jvm.internal.m.f(sentenceItem, "sentenceItem");
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(hintText, "hintText");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickSkipListen, "onClickSkipListen");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar3 = (l1.s) nVar;
        sVar3.f0(2106605692);
        if ((i11 & 6) == 0) {
            i12 = (sVar3.h(sentenceItem) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar3.h(state) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar3.f(courseTestParams) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar3.f(hintText) ? 2048 : 1024;
        }
        int i13 = i12;
        if ((i11 & 24576) == 0) {
            i13 |= sVar3.g(true) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((i11 & 196608) == 0) {
            i13 |= sVar3.h(dVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= sVar3.h(dVar2) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= sVar3.h(getComboCount) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= sVar3.h(onClickPlayAudio) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= sVar3.h(onClickChecked) ? 536870912 : 268435456;
        }
        int i14 = (sVar3.h(onClickContinue) ? 4 : 2) | (sVar3.h(onClickSkipListen) ? 32 : 16) | (sVar3.h(onClickBugReport) ? 256 : 128);
        if (sVar3.T(i13 & 1, ((i13 & 306783379) == 306783378 && (i14 & 147) == 146) ? false : true)) {
            Object objQ2 = sVar3.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ2 == gVar2) {
                objQ2 = l1.t.q(sVar3);
                sVar3.o0(objQ2);
            }
            rz.b0 b0Var = (rz.b0) objQ2;
            l1.b1 b1Var = state.f37191c;
            l1.b1 b1Var2 = state.f37192d;
            x1.p pVar = state.f37193e;
            boolean z11 = state.f37190b;
            Boolean bool = Boolean.TRUE;
            int i15 = i13 & 234881024;
            boolean zH2 = ((i13 & 57344) == 16384) | (i15 == 67108864) | sVar3.h(sentenceItem);
            Object objQ3 = sVar3.Q();
            if (zH2 || objQ3 == gVar2) {
                objQ3 = new av.f0(11, onClickPlayAudio, sentenceItem, null);
                sVar3.o0(objQ3);
            }
            l1.t.f((fz.e) objQ3, bool, sVar3);
            ht.q qVar = (ht.q) b1Var.getValue();
            ht.l lVar = (ht.l) b1Var2.getValue();
            boolean z12 = courseTestParams.f33768q && courseTestParams.f33755c == 4;
            t1.d dVarD = t1.e.d(-1030622210, new l0(hintText, courseTestParams, dVar), sVar3);
            t1.d dVarD2 = t1.e.d(-1860271203, new at.d(dVar2, state, z11, b0Var), sVar3);
            t1.d dVarD3 = t1.e.d(1605047100, new bp.b0(state, z11, b0Var, 2), sVar3);
            t1.d dVarD4 = t1.e.d(-1079748819, new f3(b1Var, sentenceItem, pVar, 3), sVar3);
            boolean zH3 = (i15 == 67108864) | sVar3.h(sentenceItem);
            Object objQ4 = sVar3.Q();
            if (zH3) {
                gVar = gVar2;
            } else {
                gVar = gVar2;
                if (objQ4 == gVar) {
                }
                fz.a aVar = (fz.a) objQ4;
                zH = sVar3.h(b0Var) | sVar3.h(state) | ((i13 & 1879048192) == 536870912) | sVar3.f(b1Var);
                objQ = sVar3.Q();
                if (!zH || objQ == gVar) {
                    sVar2 = sVar3;
                    b0.k0 k0Var = new b0.k0(b0Var, state, onClickChecked, b1Var, 1);
                    sVar2.o0(k0Var);
                    objQ = k0Var;
                } else {
                    sVar2 = sVar3;
                }
                sVar = sVar2;
                dt.k3.e(BuildConfig.VERSION_NAME, qVar, lVar, false, true, false, z12, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, null, null, null, null, null, null, onClickSkipListen, aVar, onClickBugReport, getComboCount, (fz.a) objQ, null, null, onClickContinue, sVar, 196614, 807100416, ((i14 << 15) & 3670016) | ((i14 << 18) & 234881024) | ((i13 << 6) & 1879048192), (i14 << 9) & 7168, 66469720, 3);
            }
            objQ4 = new m0(onClickPlayAudio, sentenceItem, 0);
            sVar3.o0(objQ4);
            fz.a aVar2 = (fz.a) objQ4;
            zH = sVar3.h(b0Var) | sVar3.h(state) | ((i13 & 1879048192) == 536870912) | sVar3.f(b1Var);
            objQ = sVar3.Q();
            if (zH) {
                sVar2 = sVar3;
                b0.k0 k0Var2 = new b0.k0(b0Var, state, onClickChecked, b1Var, 1);
                sVar2.o0(k0Var2);
                objQ = k0Var2;
            } else {
                sVar2 = sVar3;
                b0.k0 k0Var3 = new b0.k0(b0Var, state, onClickChecked, b1Var, 1);
                sVar2.o0(k0Var3);
                objQ = k0Var3;
            }
            sVar = sVar2;
            dt.k3.e(BuildConfig.VERSION_NAME, qVar, lVar, false, true, false, z12, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, null, null, null, null, null, null, onClickSkipListen, aVar2, onClickBugReport, getComboCount, (fz.a) objQ, null, null, onClickContinue, sVar, 196614, 807100416, ((i14 << 15) & 3670016) | ((i14 << 18) & 234881024) | ((i13 << 6) & 1879048192), (i14 << 9) & 7168, 66469720, 3);
        } else {
            sVar = sVar3;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new n0(sentenceItem, state, courseTestParams, hintText, dVar, dVar2, getComboCount, onClickPlayAudio, onClickChecked, onClickContinue, onClickSkipListen, onClickBugReport, i11);
        }
    }

    public static final void f0(int i11, int i12, fz.a aVar, l1.n nVar, z1.r rVar, boolean z11) {
        l1.s sVar;
        long jC;
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1815583807);
        int i13 = i12 | (sVar2.d(i11) ? 4 : 2) | (sVar2.g(z11) ? 32 : 16) | (sVar2.h(aVar) ? 256 : 128);
        if (sVar2.T(i13 & 1, (i13 & 1171) != 1170)) {
            boolean z12 = (i13 & 896) == 256;
            Object objQ = sVar2.Q();
            if (z12 || objQ == l1.m.f39353a) {
                objQ = new at.r(15, aVar);
                sVar2.o0(objQ);
            }
            z1.r rVarQ = iu.k.q(6, 7, (fz.a) objQ, sVar2, rVar, false);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.r rVarC = z1.a.c(sVar2, rVarQ);
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
            k2.b bVarY = se.k.y(i11, sVar2, i13 & 14);
            if (z11) {
                sVar2.d0(-78556484);
                jC = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31017a;
                sVar2.p(false);
            } else {
                sVar2.d0(-78485401);
                jC = g2.x.c(((h1.s1) sVar2.j(h1.v1.f31180a)).f31034q, 0.8f);
                sVar2.p(false);
            }
            h1.r4.b(bVarY, null, j0.e2.n(z1.o.f58481a, 24), jC, sVar2, 432, 0);
            sVar = sVar2;
            sVar.p(true);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new j(i11, i12, aVar, rVar, z11);
        }
    }

    public static final void g(jt.u state, boolean z11, fz.c onClickStem, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(onClickStem, "onClickStem");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-745866387);
        int i12 = i11 | (sVar.h(state) ? 4 : 2) | (sVar.g(z11) ? 32 : 16) | (sVar.h(onClickStem) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j3.y0 y0VarA = j3.y0.a(ct.c.b(sVar), 0L, ct.c.c(sVar), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209);
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = j0.c.C(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 20, 1);
            w2.q0 q0VarD = j0.o.d(z1.c.f58467e, false);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
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
            l1.t.J(y2.j.f56915d, rVarC2, sVar);
            float f5 = 16;
            z1.r rVarC3 = j0.c.C(oVar, f5, CropImageView.DEFAULT_ASPECT_RATIO, 2);
            l1.c3 c3Var = h1.v1.f31180a;
            h1.k7.d(rVarC3, r0.f.d(f5), h1.k7.p(g2.x.c(((h1.s1) sVar.j(c3Var)).f31035r, 0.3f), sVar, 0), null, d0.n.a(g2.x.c(((h1.s1) sVar.j(c3Var)).A, 0.2f), 1), t1.e.d(955071077, new q0(state, y0VarA, z11, onClickStem, 0), sVar), sVar, 196614, 8);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new p0(state, z11, onClickStem, i11, 1);
        }
    }

    public static final void g0(String str, List list, l1.b1 b1Var, boolean z11, boolean z12, fz.c cVar, l1.n nVar, int i11) {
        int i12;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(773300620);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(str) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(list) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(b1Var) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.g(z11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.g(z12) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(cVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536;
        }
        if (sVar.T(i12 & 1, (74899 & i12) != 74898)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar, 0);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            ua.b(str, j0.c.E(oVar, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 8, 7), ((h1.s1) sVar.j(h1.v1.f31180a)).f31036s, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((dc) sVar.j(fc.f30256a)).f30180n, sVar, (i12 & 14) | 48, 0, 65528);
            sVar = sVar;
            dt.a0.d(b1Var, null, j0.i.f35303a, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, t1.e.d(-1336244039, new mt.n0(list, z11, z12, cVar), sVar), sVar, ((i12 >> 6) & 14) | 1573248, 58);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new r0(str, list, b1Var, z11, z12, cVar, i11);
        }
    }

    public static final void h(List stemWords, fz.c onClick, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(stemWords, "stemWords");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(545712520);
        int i12 = (sVar.h(stemWords) ? 4 : 2) | i11 | (sVar.h(onClick) ? 32 : 16);
        if (sVar.T(i12 & 1, (i12 & 19) != 18)) {
            j0.c.c(null, null, j0.i.g(16), null, 0, 0, t1.e.d(-280952829, new p3(stemWords, onClick), sVar), sVar, 1573248, 59);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new q3(i11, 0, onClick, stemWords);
        }
    }

    public static final void h0(final CourseWord courseWord, final j3.y0 y0Var, final boolean z11, final fz.c cVar, final boolean z12, final float f5, l1.n nVar, final int i11) {
        long jX;
        long jT;
        long jW;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1980896991);
        int i12 = i11 | (sVar.h(courseWord) ? 4 : 2) | (sVar.f(y0Var) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (66707 & i12) != 66706)) {
            z1.o oVar = z1.o.f58481a;
            if (courseWord != null) {
                sVar.d0(51882814);
                OptionItemSelectedState selectedState = courseWord.getSelectedState();
                int[] iArr = y0.f6204a;
                int i13 = iArr[selectedState.ordinal()];
                if (i13 == 1) {
                    sVar.d0(971508051);
                    jX = ob.f.x((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else if (i13 != 2) {
                    sVar.d0(971513062);
                    jX = ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p;
                    sVar.p(false);
                } else {
                    sVar.d0(971510993);
                    jX = ob.f.z((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                }
                int i14 = iArr[courseWord.getSelectedState().ordinal()];
                if (i14 == 1) {
                    sVar.d0(971517685);
                    jT = ob.f.t((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else if (i14 != 2) {
                    sVar.d0(971522824);
                    jT = ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q;
                    sVar.p(false);
                } else {
                    sVar.d0(971520691);
                    jT = ob.f.u((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                }
                long j11 = jT;
                int i15 = iArr[courseWord.getSelectedState().ordinal()];
                if (i15 == 1) {
                    sVar.d0(971527562);
                    jW = ob.f.w((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else if (i15 != 2) {
                    sVar.d0(971532006);
                    jW = ((h1.s1) sVar.j(h1.v1.f31180a)).A;
                    sVar.p(false);
                } else {
                    sVar.d0(971530216);
                    jW = ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                }
                z1.r rVarP = j0.e2.p(oVar, f5, 44);
                boolean zH = sVar.h(courseWord) | ((i12 & 7168) == 2048);
                Object objQ = sVar.Q();
                if (zH || objQ == l1.m.f39353a) {
                    objQ = new s0(cVar, courseWord, 1);
                    sVar.o0(objQ);
                }
                h1.k7.d(iu.k.q((i12 >> 3) & 112, 6, (fz.a) objQ, sVar, rVarP, z11), r0.f.d(12), h1.k7.p(jX, sVar, 0), null, d0.n.a(jW, (float) 1.5d), t1.e.d(1265811186, new t0(courseWord, y0Var, j11, 1), sVar), sVar, 196608, 8);
                sVar.p(false);
            } else {
                sVar.d0(53599718);
                z1.r rVarP2 = j0.e2.p(oVar, f5, 44);
                l1.c3 c3Var = h1.v1.f31180a;
                h1.k7.d(rVarP2, r0.f.d(12), h1.k7.p(((h1.s1) sVar.j(c3Var)).f31033p, sVar, 0), null, d0.n.a(((h1.s1) sVar.j(c3Var)).A, 1), f5181e, sVar, 196608, 8);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(y0Var, z11, cVar, z12, f5, i11) { // from class: bt.u0

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ j3.y0 f6048b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ boolean f6049c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ fz.c f6050d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f6051e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ float f6052f;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(221185);
                    b.h0(this.f6047a, this.f6048b, this.f6049c, this.f6050d, this.f6051e, this.f6052f, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void i(ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        ht.o oVar;
        ys.d0 d0Var2;
        l1.s sVar;
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-630828537);
        int i12 = i11 | (sVar2.f(courseTestParams) ? 4 : 2) | (sVar2.f(d0Var) ? 32 : 16);
        if (sVar2.T(i12 & 1, (i12 & 19) != 18)) {
            j0.u uVarA = j0.t.a(j0.i.f35305c, z1.c.O, sVar2, 0);
            int iHashCode = Long.hashCode(sVar2.T);
            l1.q1 q1VarL = sVar2.l();
            z1.o oVar2 = z1.o.f58481a;
            z1.r rVarC = z1.a.c(sVar2, oVar2);
            y2.k.J.getClass();
            y2.i iVar = y2.j.f56913b;
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            y2.h hVar = y2.j.f56917f;
            l1.t.J(hVar, uVarA, sVar2);
            y2.h hVar2 = y2.j.f56916e;
            l1.t.J(hVar2, q1VarL, sVar2);
            y2.h hVar3 = y2.j.f56918g;
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar2, iHashCode, hVar3);
            }
            y2.h hVar4 = y2.j.f56915d;
            l1.t.J(hVar4, rVarC, sVar2);
            if (1.0f <= 0.0d) {
                k0.a.a("invalid weight; must be greater than zero");
            }
            float f5 = 16;
            z1.r rVarE = j0.c.E(new j0.i1(1.0f, true), CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, f5, CropImageView.DEFAULT_ASPECT_RATIO, 11);
            j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, z1.c.M, sVar2, 48);
            int iHashCode2 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL2 = sVar2.l();
            z1.r rVarC2 = z1.a.c(sVar2, rVarE);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, a2VarA, sVar2);
            l1.t.J(hVar2, q1VarL2, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode2))) {
                defpackage.e.A(iHashCode2, sVar2, iHashCode2, hVar3);
            }
            l1.t.J(hVar4, rVarC2, sVar2);
            d0.n.c(se.k.y(R.drawable.ic_testout_intro_deer, sVar2, 0), null, null, null, null, CropImageView.DEFAULT_ASPECT_RATIO, null, sVar2, 48, 124);
            z1.r rVarE2 = j0.e2.e(j0.c.E(oVar2, CropImageView.DEFAULT_ASPECT_RATIO, 52, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 1.0f);
            l1.c3 c3Var = h1.v1.f31180a;
            long j11 = ((h1.s1) sVar2.j(c3Var)).f31033p;
            float f11 = 0;
            float f12 = 12;
            z1.r rVarH = d0.n.h(rVarE2, j11, r0.f.e(f11, f12, f12, f12));
            d0.v vVarA = d0.n.a(((h1.s1) sVar2.j(c3Var)).A, 2);
            z1.r rVarK = d0.n.k(vVarA.f22811a, vVarA.f22812b, r0.f.e(f11, f12, f12, f12), rVarH);
            w2.q0 q0VarD = j0.o.d(z1.c.f58466d, false);
            int iHashCode3 = Long.hashCode(sVar2.T);
            l1.q1 q1VarL3 = sVar2.l();
            z1.r rVarC3 = z1.a.c(sVar2, rVarK);
            sVar2.h0();
            if (sVar2.S) {
                sVar2.k(iVar);
            } else {
                sVar2.r0();
            }
            l1.t.J(hVar, q0VarD, sVar2);
            l1.t.J(hVar2, q1VarL3, sVar2);
            if (sVar2.S || !kotlin.jvm.internal.m.a(sVar2.Q(), Integer.valueOf(iHashCode3))) {
                defpackage.e.A(iHashCode3, sVar2, iHashCode3, hVar3);
            }
            l1.t.J(hVar4, rVarC3, sVar2);
            boolean z11 = false;
            ua.b(ub.a.e0(sVar2, R.string.test_out_intro_info), j0.c.B(oVar2, f5, f5), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar2.j(ua.f31167a), 0L, fr.j3.A(18), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar2, 48, 0, 65532);
            sVar = sVar2;
            sVar.p(true);
            sVar.p(true);
            ht.q qVar = ht.q.SELECTED;
            String strE0 = ub.a.e0(sVar, R.string.test_continue);
            boolean z12 = (i12 & 112) == 32;
            if ((i12 & 14) == 4) {
                z11 = true;
            }
            boolean z13 = z12 | z11;
            Object objQ = sVar.Q();
            if (z13 || objQ == l1.m.f39353a) {
                oVar = courseTestParams;
                d0Var2 = d0Var;
                objQ = new k(d0Var2, oVar, 5);
                sVar.o0(objQ);
            } else {
                oVar = courseTestParams;
                d0Var2 = d0Var;
            }
            dt.a0.g(qVar, null, strE0, (fz.a) objQ, sVar, 6, 2);
            sVar.p(true);
        } else {
            oVar = courseTestParams;
            d0Var2 = d0Var;
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.h(oVar, i11, 21, d0Var2);
        }
    }

    public static final void i0(CourseWord courseWord, j3.y0 y0Var, boolean z11, fz.c cVar, l1.n nVar, int i11) {
        long jX;
        long jT;
        long jW;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1348130358);
        int i12 = i11 | (sVar.h(courseWord) ? 4 : 2) | (sVar.f(y0Var) ? 32 : 16) | (sVar.g(z11) ? 256 : 128) | (sVar.h(cVar) ? 2048 : 1024);
        if (sVar.T(i12 & 1, (i12 & 1171) != 1170)) {
            z1.o oVar = z1.o.f58481a;
            if (courseWord != null) {
                sVar.d0(87926095);
                OptionItemSelectedState selectedState = courseWord.getSelectedState();
                int[] iArr = y0.f6204a;
                int i13 = iArr[selectedState.ordinal()];
                if (i13 == 1) {
                    sVar.d0(1526859742);
                    jX = ob.f.x((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else if (i13 != 2) {
                    sVar.d0(1526864753);
                    jX = ((h1.s1) sVar.j(h1.v1.f31180a)).f31033p;
                    sVar.p(false);
                } else {
                    sVar.d0(1526862684);
                    jX = ob.f.z((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                }
                int i14 = iArr[courseWord.getSelectedState().ordinal()];
                if (i14 == 1) {
                    sVar.d0(1526869376);
                    jT = ob.f.t((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else if (i14 != 2) {
                    sVar.d0(1526874515);
                    jT = ((h1.s1) sVar.j(h1.v1.f31180a)).f31034q;
                    sVar.p(false);
                } else {
                    sVar.d0(1526872382);
                    jT = ob.f.u((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                }
                z1.r rVarP = j0.e2.p(oVar, 70, 22);
                boolean zH = ((i12 & 7168) == 2048) | sVar.h(courseWord);
                Object objQ = sVar.Q();
                if (zH || objQ == l1.m.f39353a) {
                    objQ = new s0(cVar, courseWord, 0);
                    sVar.o0(objQ);
                }
                long j11 = jX;
                z1.r rVarQ = iu.k.q(((i12 >> 3) & 112) | 6, 6, (fz.a) objQ, sVar, rVarP, z11);
                h1.t0 t0VarP = h1.k7.p(j11, sVar, 0);
                r0.e eVarD = r0.f.d(10);
                float f5 = (float) 1.5d;
                int i15 = iArr[courseWord.getSelectedState().ordinal()];
                if (i15 == 1) {
                    sVar.d0(1526892885);
                    jW = ob.f.w((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                } else if (i15 != 2) {
                    sVar.d0(1526897841);
                    jW = ((h1.s1) sVar.j(h1.v1.f31180a)).A;
                    sVar.p(false);
                } else {
                    sVar.d0(1526895795);
                    jW = ob.f.y((h1.s1) sVar.j(h1.v1.f31180a), sVar);
                    sVar.p(false);
                }
                d0.v vVarA = d0.n.a(jW, f5);
                t1.d dVarD = t1.e.d(-21180521, new t0(courseWord, y0Var, jT, 0), sVar);
                sVar = sVar;
                h1.k7.d(rVarQ, eVarD, t0VarP, null, vVarA, dVarD, sVar, 196608, 8);
                sVar.p(false);
            } else {
                sVar.d0(89769851);
                z1.r rVarP2 = j0.e2.p(oVar, 70, 22);
                l1.c3 c3Var = h1.v1.f31180a;
                h1.t0 t0VarP2 = h1.k7.p(((h1.s1) sVar.j(c3Var)).f31033p, sVar, 0);
                r0.e eVarD2 = r0.f.d(10);
                long j12 = ((h1.s1) sVar.j(c3Var)).A;
                sVar = sVar;
                h1.k7.d(rVarP2, eVarD2, t0VarP2, null, d0.n.a(j12, (float) 1.5d), f5180d, sVar, 196614, 8);
                sVar.p(false);
            }
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.d(courseWord, y0Var, z11, cVar, i11, 2);
        }
    }

    public static final void j(CourseSentence courseSentence, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        l1.s sVar;
        l1.b1 b1Var;
        boolean z11;
        vy.d dVar;
        rz.b0 b0Var;
        PermissionState permissionState;
        l1.b1 b1Var2;
        av.b bVar;
        l1.b1 b1Var3;
        l1.b1 b1Var4;
        int i12;
        l1.a1 a1Var;
        l1.b1 b1Var5;
        Boolean bool;
        l1.b1 b1Var6;
        l1.b1 b1Var7;
        l1.b1 b1Var8;
        l1.a1 a1Var2;
        CourseSentence courseSentence2 = courseSentence;
        ys.d0 d0Var2 = d0Var;
        kotlin.jvm.internal.m.f(courseSentence2, "courseSentence");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-2006946047);
        int i13 = (sVar2.h(courseSentence2) ? 4 : 2) | i11;
        if ((i11 & 384) == 0) {
            i13 |= sVar2.f(d0Var2) ? 256 : 128;
        }
        if (sVar2.T(i13 & 1, (i13 & 131) != 130)) {
            e20.a aVarC = w4.c.c(sVar2, -1168520582, sVar2, -1633490746);
            boolean zF = sVar2.f(null) | sVar2.f(aVarC);
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = w4.c.e(vt.n0.class, aVarC, null, null, sVar2);
            }
            sVar2.p(false);
            sVar2.p(false);
            vt.n0 n0Var = (vt.n0) objQ;
            Object objQ2 = sVar2.Q();
            if (objQ2 == gVar) {
                objQ2 = ((fr.o0) n0Var).v() + "recorder_temp.mp3";
                sVar2.o0(objQ2);
            }
            String str = (String) objQ2;
            boolean zF2 = sVar2.f(courseSentence2);
            Object objQ3 = sVar2.Q();
            if (zF2 || objQ3 == gVar) {
                objQ3 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ3);
            }
            l1.b1 b1Var9 = (l1.b1) objQ3;
            boolean zF3 = sVar2.f(courseSentence2);
            Object objQ4 = sVar2.Q();
            if (zF3 || objQ4 == gVar) {
                objQ4 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ4);
            }
            l1.b1 b1Var10 = (l1.b1) objQ4;
            boolean zF4 = sVar2.f(courseSentence2);
            Object objQ5 = sVar2.Q();
            if (zF4 || objQ5 == gVar) {
                objQ5 = l1.t.B(ht.q.DEFAULT);
                sVar2.o0(objQ5);
            }
            l1.b1 b1Var11 = (l1.b1) objQ5;
            boolean zF5 = sVar2.f(courseSentence2);
            Object objQ6 = sVar2.Q();
            if (zF5 || objQ6 == gVar) {
                objQ6 = l1.t.B(ht.a.f33722e);
                sVar2.o0(objQ6);
            }
            l1.b1 b1Var12 = (l1.b1) objQ6;
            Object objQ7 = sVar2.Q();
            if (objQ7 == gVar) {
                objQ7 = l1.t.q(sVar2);
                sVar2.o0(objQ7);
            }
            rz.b0 b0Var2 = (rz.b0) objQ7;
            Object objQ8 = sVar2.Q();
            if (objQ8 == gVar) {
                objQ8 = new av.b();
                sVar2.o0(objQ8);
            }
            av.b bVar2 = (av.b) objQ8;
            boolean zH = sVar2.h(bVar2);
            Object objQ9 = sVar2.Q();
            if (zH || objQ9 == gVar) {
                objQ9 = new a00.c(bVar2, 13);
                sVar2.o0(objQ9);
            }
            l1.t.c(qy.b0.f48488a, (fz.c) objQ9, sVar2);
            boolean zF6 = sVar2.f(courseSentence2);
            Object objQ10 = sVar2.Q();
            if (zF6 || objQ10 == gVar) {
                objQ10 = ks.b.n(courseSentence2.getSentenceNotice());
                sVar2.o0(objQ10);
            }
            List list = (List) objQ10;
            PermissionState permissionStateA = PermissionStateKt.a(sVar2);
            Object objQ11 = sVar2.Q();
            if (objQ11 == gVar) {
                objQ11 = l1.t.B(Boolean.valueOf(PermissionsUtilKt.b(permissionStateA.getStatus())));
                sVar2.o0(objQ11);
            }
            l1.b1 b1Var13 = (l1.b1) objQ11;
            Object objQ12 = sVar2.Q();
            if (objQ12 == gVar) {
                objQ12 = defpackage.e.v(-1, sVar2);
            }
            l1.a1 a1Var3 = (l1.a1) objQ12;
            PermissionStatus status = permissionStateA.getStatus();
            int i14 = i13 & 896;
            boolean zF7 = sVar2.f(permissionStateA) | (i14 == 256) | sVar2.f(b1Var12) | sVar2.h(bVar2) | sVar2.f(b1Var9) | sVar2.f(b1Var10);
            Object objQ13 = sVar2.Q();
            if (zF7 || objQ13 == gVar) {
                b1Var = b1Var12;
                z11 = false;
                dVar = null;
                b0Var = b0Var2;
                objQ13 = new g1(permissionStateA, b1Var13, d0Var, bVar2, str, b1Var, b1Var9, b1Var10, (vy.d) null);
                permissionState = permissionStateA;
                b1Var2 = b1Var13;
                bVar = bVar2;
                b1Var3 = b1Var10;
                sVar2.o0(objQ13);
            } else {
                bVar = bVar2;
                b1Var3 = b1Var10;
                b1Var2 = b1Var13;
                b1Var = b1Var12;
                permissionState = permissionStateA;
                z11 = false;
                dVar = null;
                b0Var = b0Var2;
            }
            l1.t.f((fz.e) objQ13, status, sVar2);
            Object objQ14 = sVar2.Q();
            if (objQ14 == gVar) {
                objQ14 = l1.t.B(Boolean.FALSE);
                sVar2.o0(objQ14);
            }
            l1.b1 b1Var14 = (l1.b1) objQ14;
            ht.l lVar = (ht.l) b1Var.getValue();
            boolean zF8 = sVar2.f(b1Var) | sVar2.f(b1Var11);
            Object objQ15 = sVar2.Q();
            if (zF8 || objQ15 == gVar) {
                l1.b1 b1Var15 = b1Var;
                h1 h1Var = new h1(b1Var15, b1Var14, b1Var11, dVar, 0);
                b1Var = b1Var15;
                sVar2.o0(h1Var);
                objQ15 = h1Var;
            }
            l1.t.f((fz.e) objQ15, lVar, sVar2);
            Boolean bool2 = (Boolean) b1Var14.getValue();
            bool2.getClass();
            boolean zH2 = (i14 != 256 ? z11 : true) | sVar2.h(courseSentence2);
            Object objQ16 = sVar2.Q();
            if (zH2 || objQ16 == gVar) {
                b1Var4 = b1Var3;
                i12 = i14;
                b0.f fVar = new b0.f(d0Var, courseSentence2, b1Var14, a1Var3, (vy.d) null, 7);
                courseSentence2 = courseSentence2;
                a1Var = a1Var3;
                sVar2.o0(fVar);
                objQ16 = fVar;
            } else {
                i12 = i14;
                b1Var4 = b1Var3;
                a1Var = a1Var3;
            }
            l1.t.f((fz.e) objQ16, bool2, sVar2);
            Boolean bool3 = (Boolean) sVar2.j(ju.f.f37372f);
            boolean zBooleanValue = bool3.booleanValue();
            rz.b0 b0Var3 = b0Var;
            boolean zG = sVar2.g(zBooleanValue) | sVar2.f(b1Var9) | sVar2.f(b1Var4) | (i12 != 256 ? z11 : true) | sVar2.h(b0Var3) | sVar2.h(courseSentence2) | sVar2.f(b1Var);
            Object objQ17 = sVar2.Q();
            if (zG || objQ17 == gVar) {
                b1Var5 = b1Var4;
                CourseSentence courseSentence3 = courseSentence2;
                l1.a1 a1Var4 = a1Var;
                bool = bool3;
                b1Var6 = b1Var9;
                i1 i1Var = new i1(zBooleanValue, courseSentence3, d0Var, b1Var6, b1Var5, b0Var3, a1Var4, b1Var, b1Var14, null);
                b1Var7 = b1Var14;
                b1Var8 = b1Var11;
                courseSentence2 = courseSentence3;
                a1Var2 = a1Var4;
                sVar2.o0(i1Var);
                objQ17 = i1Var;
            } else {
                b1Var6 = b1Var9;
                b1Var5 = b1Var4;
                a1Var2 = a1Var;
                b1Var8 = b1Var11;
                bool = bool3;
                b1Var7 = b1Var14;
            }
            l1.t.g(courseSentence2, bool, (fz.e) objQ17, sVar2);
            String translation = !((Boolean) sVar2.j(ju.f.f37373g)).booleanValue() ? courseSentence2.getTranslation() : BuildConfig.VERSION_NAME;
            ht.q qVar = (ht.q) b1Var8.getValue();
            ht.l lVar2 = (ht.l) b1Var.getValue();
            String strE0 = ub.a.e0(sVar2, R.string.test_continue);
            l1.b1 b1Var16 = b1Var6;
            l1.b1 b1Var17 = b1Var5;
            l1.a1 a1Var5 = a1Var2;
            t1.d dVarD = t1.e.d(-1978006209, new b1(courseSentence2, a1Var2, b1Var16, b1Var17, b1Var, b0Var3, d0Var), sVar2);
            l1.b1 b1Var18 = b1Var;
            t1.d dVarD2 = t1.e.d(-692943680, new c1(courseSentence, list, d0Var, b1Var18, b1Var16, b1Var17, b0Var3, b1Var8, a1Var5), sVar2);
            d1 d1Var = new d1(d0Var, b1Var18, bVar, b1Var16, b1Var17, permissionState, b0Var3, courseSentence, b1Var2, str, a1Var5, b1Var7);
            d0Var2 = d0Var;
            t1.d dVarD3 = t1.e.d(592118849, d1Var, sVar2);
            Object objQ18 = sVar2.Q();
            if (objQ18 == gVar) {
                objQ18 = new ju.d(25);
                sVar2.o0(objQ18);
            }
            fz.a aVar = (fz.a) objQ18;
            Object objQ19 = sVar2.Q();
            if (objQ19 == gVar) {
                objQ19 = new br.b(27);
                sVar2.o0(objQ19);
            }
            fz.c cVar = (fz.c) objQ19;
            Object objQ20 = sVar2.Q();
            if (objQ20 == gVar) {
                objQ20 = new ys.d(3);
                sVar2.o0(objQ20);
            }
            fz.a aVar2 = (fz.a) objQ20;
            boolean z12 = i12 != 256 ? z11 : true;
            Object objQ21 = sVar2.Q();
            if (z12 || objQ21 == gVar) {
                objQ21 = new l(d0Var2, 8);
                sVar2.o0(objQ21);
            }
            fz.a aVar3 = (fz.a) objQ21;
            Object objQ22 = sVar2.Q();
            if (objQ22 == gVar) {
                objQ22 = new ju.d(25);
                sVar2.o0(objQ22);
            }
            sVar = sVar2;
            dt.k3.e(translation, qVar, lVar2, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, strE0, dVarD, dVarD2, dVarD3, null, null, f5182f, null, null, null, null, null, null, null, aVar, cVar, aVar2, aVar3, null, null, (fz.a) objQ22, sVar, 196608, 807100416, 918552576, 3072, 133570520, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(courseSentence, courseTestParams, d0Var2, i11, 2);
        }
    }

    public static final void j0(l1.b1 b1Var, fz.a aVar, dt.z4 z4Var) {
        if (z4Var != dt.z4.Idle) {
            aVar.invoke();
            b1Var.setValue(new ht.j());
        } else if (b1Var.getValue() instanceof ht.j) {
            b1Var.setValue(ht.a.f33722e);
        }
    }

    public static final void k(ys.d0 d0Var, l1.b1 b1Var, l1.b1 b1Var2, rz.b0 b0Var, CourseSentence courseSentence, l1.a1 a1Var, l1.b1 b1Var3, List list, ht.l lVar) {
        if (((Boolean) b1Var.getValue()).booleanValue()) {
            Boolean bool = Boolean.FALSE;
            b1Var.setValue(bool);
            b1Var2.setValue(bool);
        }
        if (d0Var != null) {
            jh.h.m(d0Var, list, lVar, new b0.a(b0Var, courseSentence, a1Var, b1Var3, 5));
        }
    }

    public static final String k0(String str) {
        String lowerCase = dt.a0.D(str).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m.e(lowerCase, "toLowerCase(...)");
        return nv.p.s("[\\p{P}+~$`^=|<>～｀＄＾＋＝｜＜＞￥×…]", "compile(...)", oz.x.q0(oz.q.i1(oz.x.q0(lowerCase, "ç", "c")).toString(), " ", BuildConfig.VERSION_NAME), BuildConfig.VERSION_NAME, "replaceAll(...)");
    }

    public static final void l(ys.d0 d0Var, av.b bVar, String str, l1.b1 b1Var, l1.b1 b1Var2, l1.b1 b1Var3) {
        if (d0Var != null) {
            d0Var.h();
        }
        b1Var.setValue(ht.a.f33722e);
        if (!bVar.f3111d) {
            bVar.a(str);
            b1Var2.setValue(Boolean.TRUE);
        } else {
            bVar.b();
            b1Var2.setValue(Boolean.FALSE);
            b1Var3.setValue(Boolean.TRUE);
        }
    }

    public static final void m(ot.c data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-2078285604);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            CourseSentence courseSentence = data.f45761a;
            List list = data.f45762b;
            List list2 = data.f45763c;
            kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
            boolean zF = sVar.f(courseSentence);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(courseSentence);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zF3 = sVar.f(courseSentence);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = l1.t.B(list);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            boolean zF4 = sVar.f(courseSentence);
            Object objQ4 = sVar.Q();
            if (zF4 || objQ4 == gVar) {
                objQ4 = l1.t.B(list2);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.s(new jt.i0(0, b1Var));
                sVar.o0(objQ5);
            }
            l1.b3 b3Var = (l1.b3) objQ5;
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF5 = sVar.f(null) | sVar.f(aVarC);
            Object objQ6 = sVar.Q();
            if (zF5 || objQ6 == gVar) {
                objQ6 = w4.c.e(vt.n0.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            fr.o0 o0Var = (fr.o0) ((vt.n0) objQ6);
            boolean zF6 = sVar.f(courseSentence) | sVar.d(o0Var.f27733a.keyLanguage) | sVar.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar.f(b1Var) | sVar.f(b1Var2) | sVar.f(b1Var3) | sVar.f(b1Var4);
            Object objQ7 = sVar.Q();
            if (zF6 || objQ7 == gVar) {
                jt.h0 h0Var = new jt.h0(o0Var.f27733a.keyLanguage, ((Boolean) b3Var.getValue()).booleanValue(), courseSentence.getCourseWords(), b1Var, b1Var2, b1Var3, b1Var4);
                sVar.o0(h0Var);
                objQ7 = h0Var;
            }
            jt.h0 h0Var2 = (jt.h0) objQ7;
            CourseSentence courseSentence2 = data.f45761a;
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ8 = sVar.Q();
            if (z11 || objQ8 == gVar) {
                objQ8 = new l(d0Var, 9);
                sVar.o0(objQ8);
            }
            fz.a aVar = (fz.a) objQ8;
            boolean zH = (i13 == 256) | sVar.h(h0Var2);
            Object objQ9 = sVar.Q();
            if (zH || objQ9 == gVar) {
                objQ9 = new at.h(16, d0Var, h0Var2);
                sVar.o0(objQ9);
            }
            fz.e eVar = (fz.e) objQ9;
            boolean z12 = i13 == 256;
            Object objQ10 = sVar.Q();
            if (z12 || objQ10 == gVar) {
                objQ10 = new v(d0Var, 2);
                sVar.o0(objQ10);
            }
            fz.c cVar = (fz.c) objQ10;
            boolean z13 = i13 == 256;
            Object objQ11 = sVar.Q();
            if (z13 || objQ11 == gVar) {
                objQ11 = new l(d0Var, 10);
                sVar.o0(objQ11);
            }
            fz.a aVar2 = (fz.a) objQ11;
            boolean z14 = (i13 == 256) | ((i12 & 112) == 32);
            Object objQ12 = sVar.Q();
            if (z14 || objQ12 == gVar) {
                objQ12 = new e0(d0Var, courseTestParams, 2);
                sVar.o0(objQ12);
            }
            n(courseSentence2, h0Var2, courseTestParams, aVar, eVar, cVar, aVar2, (fz.c) objQ12, sVar, (i12 << 3) & 896);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var, i11, 8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025c  */
    /* JADX WARN: Code duplicated, block: B:96:0x024b  */
    public static final void n(CourseSentence sentenceItem, jt.h0 state, ht.o courseTestParams, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickChecked, fz.a onClickContinue, fz.c onClickBugReport, l1.n nVar, int i11) {
        int i12;
        l1.s sVar;
        l1.g gVar;
        l1.g gVar2;
        boolean zH;
        Object objQ;
        kotlin.jvm.internal.m.f(sentenceItem, "sentenceItem");
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(1627709162);
        if ((i11 & 6) == 0) {
            i12 = (sVar2.h(sentenceItem) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar2.h(state) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= sVar2.f(courseTestParams) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar2.h(getComboCount) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar2.h(onClickPlayAudio) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar2.h(onClickChecked) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar2.h(onClickContinue) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar2.h(onClickBugReport) ? 8388608 : 4194304;
        }
        int i13 = i12;
        if (sVar2.T(i13 & 1, (i13 & 4793491) != 4793490)) {
            Boolean bool = (Boolean) sVar2.j(ju.f.f37372f);
            boolean zBooleanValue = bool.booleanValue();
            boolean zBooleanValue2 = ((Boolean) sVar2.j(ju.f.f37374h)).booleanValue();
            Object objQ2 = sVar2.Q();
            l1.g gVar3 = l1.m.f39353a;
            if (objQ2 == gVar3) {
                objQ2 = l1.t.q(sVar2);
                sVar2.o0(objQ2);
            }
            rz.b0 b0Var = (rz.b0) objQ2;
            l1.b1 b1Var = state.f36958d;
            l1.b1 b1Var2 = state.f36959e;
            l1.b1 b1Var3 = state.f36960f;
            l1.b1 b1Var4 = state.f36961g;
            boolean z11 = state.f36956b;
            ns.z zVarJ = b1Var.getValue() == ht.q.WRONG ? se.k.j(courseTestParams, "sent_m10_cloze_multi", sentenceItem.getTranslation(), se.k.u(BuildConfig.VERSION_NAME, sentenceItem.getDisplayCourseWords()), se.k.u(BuildConfig.VERSION_NAME, (List) b1Var3.getValue())) : null;
            int i14 = i13 & 57344;
            boolean zG = sVar2.g(zBooleanValue) | sVar2.f(b1Var2) | (i14 == 16384) | sVar2.h(sentenceItem);
            Object objQ3 = sVar2.Q();
            if (zG || objQ3 == gVar3) {
                gVar = gVar3;
                s1 s1Var = new s1(zBooleanValue, b1Var2, onClickPlayAudio, sentenceItem, null, 0);
                sVar2.o0(s1Var);
                objQ3 = s1Var;
            } else {
                gVar = gVar3;
            }
            l1.t.g(sentenceItem, bool, (fz.e) objQ3, sVar2);
            String translation = sentenceItem.getTranslation();
            ht.q qVar = (ht.q) b1Var.getValue();
            ht.l lVar = (ht.l) b1Var2.getValue();
            t1.d dVarD = t1.e.d(-2120341080, new p1(b1Var2, courseTestParams, onClickPlayAudio, sentenceItem, 0), sVar2);
            t1.d dVarD2 = t1.e.d(-2062358807, new q1(b1Var3, courseTestParams, z11, b0Var, state, onClickPlayAudio), sVar2);
            t1.d dVarD3 = t1.e.d(-2004376534, new r1(b1Var4, z11, zBooleanValue2, b1Var2, onClickPlayAudio, b0Var, state, 0), sVar2);
            t1.d dVarD4 = t1.e.d(217085273, new l1(b1Var, sentenceItem, b1Var3, onClickPlayAudio, 0), sVar2);
            boolean zH2 = (i14 == 16384) | sVar2.h(sentenceItem);
            Object objQ4 = sVar2.Q();
            if (zH2) {
                gVar2 = gVar;
            } else {
                gVar2 = gVar;
                if (objQ4 == gVar2) {
                }
                fz.a aVar = (fz.a) objQ4;
                zH = sVar2.h(b0Var) | sVar2.h(state) | ((i13 & 458752) == 131072) | sVar2.f(b1Var);
                objQ = sVar2.Q();
                if (zH || objQ == gVar2) {
                    b0.k0 k0Var = new b0.k0(b0Var, state, onClickChecked, b1Var, 2);
                    sVar2.o0(k0Var);
                    objQ = k0Var;
                }
                sVar = sVar2;
                dt.k3.e(translation, qVar, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, null, aVar, onClickBugReport, getComboCount, (fz.a) objQ, null, null, onClickContinue, sVar, 0, 807100416, ((i13 << 3) & 234881024) | ((i13 << 18) & 1879048192), (i13 >> 9) & 7168, 132530168, 3);
            }
            objQ4 = new m0(onClickPlayAudio, sentenceItem, 1);
            sVar2.o0(objQ4);
            fz.a aVar2 = (fz.a) objQ4;
            zH = sVar2.h(b0Var) | sVar2.h(state) | ((i13 & 458752) == 131072) | sVar2.f(b1Var);
            objQ = sVar2.Q();
            if (zH) {
                b0.k0 k0Var2 = new b0.k0(b0Var, state, onClickChecked, b1Var, 2);
                sVar2.o0(k0Var2);
                objQ = k0Var2;
            } else {
                b0.k0 k0Var3 = new b0.k0(b0Var, state, onClickChecked, b1Var, 2);
                sVar2.o0(k0Var3);
                objQ = k0Var3;
            }
            sVar = sVar2;
            dt.k3.e(translation, qVar, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVarJ, null, null, null, null, null, null, aVar2, onClickBugReport, getComboCount, (fz.a) objQ, null, null, onClickContinue, sVar, 0, 807100416, ((i13 << 3) & 234881024) | ((i13 << 18) & 1879048192), (i13 >> 9) & 7168, 132530168, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new m1(sentenceItem, state, courseTestParams, getComboCount, onClickPlayAudio, onClickChecked, onClickContinue, onClickBugReport, i11);
        }
    }

    public static final void o(List options, boolean z11, fz.c onClick, l1.n nVar, int i11) {
        boolean z12 = z11;
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-393630591);
        int i12 = i11 | (sVar.h(options) ? 4 : 2);
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z12) ? 32 : 16;
        }
        int i13 = i12 | (sVar.h(onClick) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            z1.o oVar = z1.o.f58481a;
            z1.r rVarC = j0.c.C(j0.e2.e(oVar, 1.0f), CropImageView.DEFAULT_ASPECT_RATIO, 16, 1);
            j0.u uVarA = j0.t.a(j0.i.g(10), z1.c.O, sVar, 6);
            int iHashCode = Long.hashCode(sVar.T);
            l1.q1 q1VarL = sVar.l();
            z1.r rVarC2 = z1.a.c(sVar, rVarC);
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
            Iterator itO = com.google.android.material.datepicker.d.o(sVar, rVarC2, y2.j.f56915d, -1838266387, options);
            while (itO.hasNext()) {
                CourseSentence courseSentence = (CourseSentence) itO.next();
                OptionItemSelectedState selectedState = courseSentence.getSelectedState();
                t1.d dVarD = t1.e.d(-1901370092, new e3(courseSentence, z12), sVar);
                boolean zH = ((i13 & 896) == 256) | sVar.h(courseSentence);
                Object objQ = sVar.Q();
                if (zH || objQ == l1.m.f39353a) {
                    objQ = new at.f(14, onClick, courseSentence);
                    sVar.o0(objQ);
                }
                dt.a0.e(selectedState, z12, dVarD, (fz.a) objQ, j0.e2.e(oVar, 1.0f), sVar, (i13 & 112) | 24960);
                z12 = z11;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new l3(options, z11, onClick, i11, 0);
        }
    }

    public static final void p(ot.h data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        ys.d0 d0Var2;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1100747446);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            jt.j0 j0VarT = jh.h.t(data.f45828a, data.f45830c, data.f45829b, sVar);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (z11 || objQ == gVar) {
                objQ = new l(d0Var, 16);
                sVar.o0(objQ);
            }
            fz.a aVar = (fz.a) objQ;
            boolean zH = (i13 == 256) | sVar.h(j0VarT);
            Object objQ2 = sVar.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new k3(d0Var, j0VarT, 0);
                sVar.o0(objQ2);
            }
            fz.e eVar = (fz.e) objQ2;
            int i14 = i12 & 112;
            boolean zH2 = (i14 == 32) | (i13 == 256) | sVar.h(data) | sVar.h(j0VarT);
            Object objQ3 = sVar.Q();
            if (zH2 || objQ3 == gVar) {
                d0Var2 = d0Var;
                b0.a aVar2 = new b0.a(d0Var2, courseTestParams, data, j0VarT, 6);
                sVar.o0(aVar2);
                objQ3 = aVar2;
            } else {
                d0Var2 = d0Var;
            }
            fz.c cVar = (fz.c) objQ3;
            boolean z12 = i13 == 256;
            Object objQ4 = sVar.Q();
            if (z12 || objQ4 == gVar) {
                objQ4 = new l(d0Var2, 17);
                sVar.o0(objQ4);
            }
            fz.a aVar3 = (fz.a) objQ4;
            boolean z13 = (i13 == 256) | (i14 == 32);
            Object objQ5 = sVar.Q();
            if (z13 || objQ5 == gVar) {
                objQ5 = new e0(d0Var2, courseTestParams, 4);
                sVar.o0(objQ5);
            }
            q(j0VarT, courseTestParams, aVar, eVar, cVar, aVar3, (fz.c) objQ5, sVar, i14);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var, i11, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(jt.j0 state, ht.o courseTestParams, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickChecked, fz.a onClickContinue, fz.c onClickBugReport, l1.n nVar, int i11) {
        l1.s sVar;
        List<CourseWord> displayCourseWords;
        String strU;
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-387798536);
        int i12 = i11 | (sVar2.h(state) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.h(getComboCount) ? 256 : 128) | (sVar2.h(onClickPlayAudio) ? 2048 : 1024) | (sVar2.h(onClickChecked) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickContinue) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickBugReport) ? 1048576 : 524288);
        if (sVar2.T(i12 & 1, (599187 & i12) != 599186)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            l1.b1 b1Var = state.f36992d;
            l1.b1 b1Var2 = state.f36993e;
            CourseSentence courseSentence = state.f36989a;
            l1.b1 b1Var3 = state.f36994f;
            boolean z11 = state.f36991c;
            Object objJ = null;
            if (b1Var.getValue() == ht.q.WRONG) {
                List list = (List) b1Var3.getValue();
                kotlin.jvm.internal.m.f(list, "<this>");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    CourseSentence courseSentence2 = (CourseSentence) next;
                    Iterator it2 = it;
                    if (courseSentence2.getSelectedState() == OptionItemSelectedState.SELECTED || courseSentence2.getSelectedState() == OptionItemSelectedState.WRONG) {
                        objJ = next;
                        break;
                    }
                    it = it2;
                }
                CourseSentence courseSentence3 = (CourseSentence) objJ;
                String translation = courseSentence.getTranslation();
                List<CourseWord> displayCourseWords2 = courseSentence.getDisplayCourseWords();
                String str = BuildConfig.VERSION_NAME;
                String strU2 = se.k.u(BuildConfig.VERSION_NAME, displayCourseWords2);
                if (courseSentence3 != null && (displayCourseWords = courseSentence3.getDisplayCourseWords()) != null && (strU = se.k.u(BuildConfig.VERSION_NAME, displayCourseWords)) != null) {
                    str = strU;
                }
                objJ = se.k.j(courseTestParams, "sent_m1_select_sent_by_trans", translation, strU2, str);
            }
            ns.z zVar = objJ;
            ht.q qVar = (ht.q) b1Var.getValue();
            ht.l lVar = (ht.l) b1Var2.getValue();
            t1.d dVarD = t1.e.d(-1459369930, new b0(courseTestParams, 1), sVar2);
            t1.d dVarD2 = t1.e.d(93717431, new e3(courseSentence), sVar2);
            t1.d dVarD3 = t1.e.d(1646804792, new at.d(3, b1Var3, b0Var, state, z11), sVar2);
            t1.d dVarD4 = t1.e.d(619138599, new f3(b1Var, courseSentence, onClickPlayAudio, 0), sVar2);
            boolean zH = ((i12 & 7168) == 2048) | sVar2.h(courseSentence);
            Object objQ2 = sVar2.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new m0(onClickPlayAudio, courseSentence, 4);
                sVar2.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            boolean zH2 = sVar2.h(b0Var) | sVar2.h(state) | ((57344 & i12) == 16384) | sVar2.f(b1Var);
            Object objQ3 = sVar2.Q();
            if (zH2 || objQ3 == gVar) {
                g3 g3Var = new g3(b0Var, state, onClickChecked, b1Var, 0);
                sVar2.o0(g3Var);
                objQ3 = g3Var;
            }
            sVar = sVar2;
            dt.k3.e(null, qVar, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVar, null, null, null, null, null, null, aVar, onClickBugReport, getComboCount, (fz.a) objQ3, null, null, onClickContinue, sVar, 0, 807100416, ((i12 << 6) & 234881024) | ((i12 << 21) & 1879048192), (i12 >> 6) & 7168, 132530169, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new h3(state, courseTestParams, getComboCount, onClickPlayAudio, onClickChecked, onClickContinue, onClickBugReport, i11, 0);
        }
    }

    public static final void s(jt.k0 state, ht.o courseTestParams, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickChecked, fz.a onClickContinue, fz.c onClickBugReport, l1.n nVar, int i11) {
        l1.s sVar;
        boolean z11;
        ns.z zVarJ;
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-454481033);
        int i12 = i11 | (sVar2.h(state) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.h(getComboCount) ? 256 : 128) | (sVar2.h(onClickPlayAudio) ? 2048 : 1024) | (sVar2.h(onClickChecked) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickContinue) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickBugReport) ? 1048576 : 524288);
        if (sVar2.T(i12 & 1, (599187 & i12) != 599186)) {
            Object objQ = sVar2.Q();
            l1.g gVar = l1.m.f39353a;
            if (objQ == gVar) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            l1.b1 b1Var = state.f37005d;
            l1.b1 b1Var2 = state.f37006e;
            CourseSentence courseSentence = state.f37002a;
            l1.b1 b1Var3 = state.f37007f;
            boolean z12 = state.f37004c;
            if (b1Var.getValue() == ht.q.WRONG) {
                Iterable iterable = (Iterable) b1Var3.getValue();
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    Iterator it2 = it;
                    Object next = it2.next();
                    boolean z13 = z12;
                    if (((CourseWord) next).getSelectedState() != OptionItemSelectedState.SELECTED) {
                        arrayList.add(next);
                    }
                    it = it2;
                    z12 = z13;
                }
                z11 = z12;
                zVarJ = se.k.j(courseTestParams, "sent_m2_remove_extra_word", courseSentence.getTranslation(), se.k.u(BuildConfig.VERSION_NAME, courseSentence.getDisplayCourseWords()), se.k.u(BuildConfig.VERSION_NAME, arrayList));
            } else {
                z11 = z12;
                zVarJ = null;
            }
            ns.z zVar = zVarJ;
            String translation = courseSentence.getTranslation();
            ht.l lVar = (ht.l) b1Var2.getValue();
            ht.q qVar = (ht.q) b1Var.getValue();
            t1.d dVarD = t1.e.d(-1526052427, new b0(courseTestParams, 2), sVar2);
            t1.d dVarD2 = t1.e.d(27034934, new o3(b1Var3, z11, b0Var, state, 1), sVar2);
            t1.d dVarD3 = t1.e.d(552456102, new f3(b1Var, courseSentence, onClickPlayAudio, 1), sVar2);
            boolean zH = ((i12 & 7168) == 2048) | sVar2.h(courseSentence);
            Object objQ2 = sVar2.Q();
            if (zH || objQ2 == gVar) {
                objQ2 = new m0(onClickPlayAudio, courseSentence, 5);
                sVar2.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            boolean zH2 = sVar2.h(b0Var) | sVar2.h(state) | ((57344 & i12) == 16384) | sVar2.f(b1Var);
            Object objQ3 = sVar2.Q();
            if (zH2 || objQ3 == gVar) {
                b0.k0 k0Var = new b0.k0(b0Var, state, onClickChecked, b1Var, 3);
                sVar2.o0(k0Var);
                objQ3 = k0Var;
            }
            sVar = sVar2;
            dt.k3.e(translation, qVar, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, m, null, null, dVarD3, zVar, null, null, null, null, null, null, aVar, onClickBugReport, getComboCount, (fz.a) objQ3, null, null, onClickContinue, sVar, 0, 807100416, ((i12 << 6) & 234881024) | ((i12 << 21) & 1879048192), (i12 >> 6) & 7168, 132530168, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b1(state, courseTestParams, getComboCount, onClickPlayAudio, onClickChecked, onClickContinue, onClickBugReport, i11, 1);
        }
    }

    public static final void t(List optionWords, boolean z11, fz.c onClick, l1.n nVar, int i11) {
        boolean z12 = z11;
        kotlin.jvm.internal.m.f(optionWords, "optionWords");
        kotlin.jvm.internal.m.f(onClick, "onClick");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1118824701);
        int i12 = i11 | (sVar.h(optionWords) ? 4 : 2) | (sVar.g(z12) ? 32 : 16) | (sVar.h(onClick) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            j0.u uVarA = j0.t.a(j0.i.g(10), z1.c.O, sVar, 6);
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
            l1.t.J(y2.j.f56917f, uVarA, sVar);
            l1.t.J(y2.j.f56916e, q1VarL, sVar);
            y2.h hVar = y2.j.f56918g;
            if (sVar.S || !kotlin.jvm.internal.m.a(sVar.Q(), Integer.valueOf(iHashCode))) {
                defpackage.e.A(iHashCode, sVar, iHashCode, hVar);
            }
            l1.t.J(y2.j.f56915d, rVarC, sVar);
            sVar.d0(-67677213);
            Iterator it = optionWords.iterator();
            while (it.hasNext()) {
                CourseWord courseWord = (CourseWord) it.next();
                OptionItemSelectedState selectedState = courseWord.getSelectedState();
                t1.d dVarD = t1.e.d(-578204139, new u3(courseWord, z12), sVar);
                boolean zH = ((i12 & 896) == 256) | sVar.h(courseWord);
                Object objQ = sVar.Q();
                if (zH || objQ == l1.m.f39353a) {
                    objQ = new s0(onClick, courseWord, 5);
                    sVar.o0(objQ);
                }
                dt.a0.e(selectedState, z12, dVarD, (fz.a) objQ, j0.e2.e(oVar, 1.0f), sVar, (i12 & 112) | 24960);
                z12 = z11;
            }
            sVar.p(false);
            sVar.p(true);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new bp.b0(optionWords, z11, onClick, i11, 3);
        }
    }

    public static final void u(ot.l data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-84740240);
        int i12 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            CourseSentence courseSentence = data.f45878a;
            List list = data.f45880c;
            List list2 = data.f45881d;
            List answerWords = data.f45879b;
            kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
            kotlin.jvm.internal.m.f(answerWords, "answerWords");
            boolean zF = sVar.f(courseSentence);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(courseSentence);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zF3 = sVar.f(courseSentence);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = l1.t.B(list);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            boolean zF4 = sVar.f(courseSentence);
            Object objQ4 = sVar.Q();
            if (zF4 || objQ4 == gVar) {
                objQ4 = l1.t.B(list2);
                sVar.o0(objQ4);
            }
            l1.b1 b1Var4 = (l1.b1) objQ4;
            Object objQ5 = sVar.Q();
            if (objQ5 == gVar) {
                objQ5 = l1.t.s(new jt.i0(3, b1Var));
                sVar.o0(objQ5);
            }
            l1.b3 b3Var = (l1.b3) objQ5;
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF5 = sVar.f(null) | sVar.f(aVarC);
            Object objQ6 = sVar.Q();
            if (zF5 || objQ6 == gVar) {
                objQ6 = w4.c.e(vt.n0.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            boolean zBooleanValue = ((Boolean) b3Var.getValue()).booleanValue();
            fr.o0 o0Var = (fr.o0) ((vt.n0) objQ6);
            boolean zD = sVar.d(o0Var.f27733a.keyLanguage) | sVar.f(courseSentence) | sVar.f(answerWords) | sVar.g(zBooleanValue) | sVar.f(b1Var) | sVar.f(b1Var2) | sVar.f(b1Var3) | sVar.f(b1Var4);
            Object objQ7 = sVar.Q();
            if (zD || objQ7 == gVar) {
                jt.l0 l0Var = new jt.l0(courseSentence, answerWords, ((Boolean) b3Var.getValue()).booleanValue(), o0Var.f27733a.keyLanguage, b1Var, b1Var2, b1Var3, b1Var4);
                sVar.o0(l0Var);
                objQ7 = l0Var;
            }
            jt.l0 l0Var2 = (jt.l0) objQ7;
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ8 = sVar.Q();
            if (z11 || objQ8 == gVar) {
                objQ8 = new l(d0Var, 20);
                sVar.o0(objQ8);
            }
            fz.a aVar = (fz.a) objQ8;
            boolean zH = (i13 == 256) | sVar.h(l0Var2);
            Object objQ9 = sVar.Q();
            if (zH || objQ9 == gVar) {
                objQ9 = new at.h(18, d0Var, l0Var2);
                sVar.o0(objQ9);
            }
            fz.e eVar = (fz.e) objQ9;
            boolean z12 = i13 == 256;
            Object objQ10 = sVar.Q();
            if (z12 || objQ10 == gVar) {
                objQ10 = new v(d0Var, 4);
                sVar.o0(objQ10);
            }
            fz.c cVar = (fz.c) objQ10;
            boolean z13 = i13 == 256;
            Object objQ11 = sVar.Q();
            if (z13 || objQ11 == gVar) {
                objQ11 = new l(d0Var, 21);
                sVar.o0(objQ11);
            }
            fz.a aVar2 = (fz.a) objQ11;
            int i14 = i12 & 112;
            boolean z14 = (i13 == 256) | (i14 == 32);
            Object objQ12 = sVar.Q();
            if (z14 || objQ12 == gVar) {
                objQ12 = new e0(d0Var, courseTestParams, 6);
                sVar.o0(objQ12);
            }
            v(l0Var2, courseTestParams, aVar, eVar, cVar, aVar2, (fz.c) objQ12, sVar, i14);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new at.i(data, courseTestParams, d0Var, i11, 11);
        }
    }

    public static final void v(jt.l0 state, ht.o courseTestParams, fz.a getComboCount, fz.e onClickPlayAudio, fz.c onClickChecked, fz.a onClickContinue, fz.c onClickBugReport, l1.n nVar, int i11) {
        l1.s sVar;
        ns.z zVarJ;
        l1.g gVar;
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-521163530);
        int i12 = i11 | (sVar2.h(state) ? 4 : 2) | (sVar2.f(courseTestParams) ? 32 : 16) | (sVar2.h(getComboCount) ? 256 : 128) | (sVar2.h(onClickPlayAudio) ? 2048 : 1024) | (sVar2.h(onClickChecked) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar2.h(onClickContinue) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar2.h(onClickBugReport) ? 1048576 : 524288);
        if (sVar2.T(i12 & 1, (599187 & i12) != 599186)) {
            Boolean bool = (Boolean) sVar2.j(ju.f.f37372f);
            boolean zBooleanValue = bool.booleanValue();
            Object objQ = sVar2.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = l1.t.q(sVar2);
                sVar2.o0(objQ);
            }
            rz.b0 b0Var = (rz.b0) objQ;
            l1.b1 b1Var = state.f37027e;
            l1.b1 b1Var2 = state.f37028f;
            CourseSentence courseSentence = state.f37023a;
            l1.b1 b1Var3 = state.f37029g;
            l1.b1 b1Var4 = state.f37030h;
            if (b1Var.getValue() == ht.q.WRONG) {
                zVarJ = se.k.j(courseTestParams, "sent_m3_cloze_single", courseSentence.getTranslation(), se.k.u(BuildConfig.VERSION_NAME, courseSentence.getDisplayCourseWords()), se.k.u(BuildConfig.VERSION_NAME, (List) b1Var3.getValue()));
            } else {
                zVarJ = null;
            }
            ns.z zVar = zVarJ;
            int i13 = i12 & 7168;
            boolean zG = sVar2.g(zBooleanValue) | sVar2.f(b1Var2) | (i13 == 2048) | sVar2.h(courseSentence);
            Object objQ2 = sVar2.Q();
            if (zG || objQ2 == gVar2) {
                gVar = gVar2;
                objQ2 = new s1(zBooleanValue, b1Var2, onClickPlayAudio, courseSentence, null, 1);
                sVar2.o0(objQ2);
            } else {
                gVar = gVar2;
            }
            l1.t.g(courseSentence, bool, (fz.e) objQ2, sVar2);
            String translation = courseSentence.getTranslation();
            ht.q qVar = (ht.q) b1Var.getValue();
            ht.l lVar = (ht.l) b1Var2.getValue();
            int i14 = 1;
            t1.d dVarD = t1.e.d(-1592734924, new p1(b1Var2, courseTestParams, onClickPlayAudio, courseSentence, i14), sVar2);
            t1.d dVarD2 = t1.e.d(-39647563, new at.i(b1Var3, courseTestParams, onClickPlayAudio, 12), sVar2);
            t1.d dVarD3 = t1.e.d(1513439798, new at.i(b1Var4, state, r19, 13), sVar2);
            t1.d dVarD4 = t1.e.d(485773605, new l1(b1Var, courseSentence, b1Var3, onClickPlayAudio, i14), sVar2);
            boolean zH = (i13 == 2048) | sVar2.h(courseSentence);
            Object objQ3 = sVar2.Q();
            if (zH || objQ3 == gVar) {
                objQ3 = new m0(onClickPlayAudio, courseSentence, 6);
                sVar2.o0(objQ3);
            }
            fz.a aVar = (fz.a) objQ3;
            boolean zH2 = sVar2.h(r19) | sVar2.h(state) | ((57344 & i12) == 16384) | sVar2.f(b1Var);
            Object objQ4 = sVar2.Q();
            if (zH2 || objQ4 == gVar) {
                b0.k0 k0Var = new b0.k0(b0Var, state, onClickChecked, b1Var, 4);
                sVar2.o0(k0Var);
                objQ4 = k0Var;
            }
            sVar = sVar2;
            dt.k3.e(translation, qVar, lVar, false, false, false, false, false, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, false, false, null, dVarD, dVarD2, dVarD3, null, null, dVarD4, zVar, null, null, null, null, null, null, aVar, onClickBugReport, getComboCount, (fz.a) objQ4, null, null, onClickContinue, sVar, 0, 807100416, ((i12 << 6) & 234881024) | ((i12 << 21) & 1879048192), (i12 >> 6) & 7168, 132530168, 3);
        } else {
            sVar = sVar2;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b1(state, courseTestParams, getComboCount, onClickPlayAudio, onClickChecked, onClickContinue, onClickBugReport, i11, 2);
        }
    }

    public static final void w(ot.n data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        Object a4Var;
        int i12;
        ht.o oVar;
        ys.d0 d0Var2;
        jt.s0 s0Var;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        long j11 = courseTestParams.f33756d;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1943518508);
        int i13 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            jt.s0 s0VarD = jt.w0.d(data.f45907a, data.f45908b, data.f45909c, Long.valueOf(j11), sVar, 221184, 65472);
            boolean zE = sVar.e(j11);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zE || objQ == gVar) {
                objQ = l1.t.B(0L);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            CourseSentence courseSentence = data.f45907a;
            String strE0 = ub.a.e0(sVar, R.string.sentence_m4_hint);
            boolean z11 = !courseTestParams.f33762j;
            t1.d dVarD = t1.e.d(1608165540, new w3(courseTestParams, s0VarD, b1Var, d0Var, data), sVar);
            t1.d dVarD2 = t1.e.d(-1176779931, new w3(1, courseTestParams, s0VarD, b1Var, data, d0Var), sVar);
            int i14 = i13 & 896;
            boolean z12 = i14 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new l(d0Var, 23);
                sVar.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            int i15 = i13 & 112;
            boolean zF = (i15 == 32) | sVar.f(b1Var) | (i14 == 256) | sVar.h(s0VarD);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar) {
                i12 = i14;
                a4Var = new a4(courseTestParams, b1Var, d0Var, s0VarD, 0);
                oVar = courseTestParams;
                d0Var2 = d0Var;
                s0Var = s0VarD;
                sVar.o0(a4Var);
            } else {
                i12 = i14;
                a4Var = objQ3;
                s0Var = s0VarD;
                d0Var2 = d0Var;
                oVar = courseTestParams;
            }
            fz.e eVar = (fz.e) a4Var;
            boolean z13 = i12 == 256;
            Object objQ4 = sVar.Q();
            if (z13 || objQ4 == gVar) {
                objQ4 = new v(d0Var2, 5);
                sVar.o0(objQ4);
            }
            fz.c cVar = (fz.c) objQ4;
            boolean z14 = i12 == 256;
            Object objQ5 = sVar.Q();
            if (z14 || objQ5 == gVar) {
                objQ5 = new l(d0Var2, 24);
                sVar.o0(objQ5);
            }
            fz.a aVar2 = (fz.a) objQ5;
            boolean z15 = i12 == 256;
            Object objQ6 = sVar.Q();
            if (z15 || objQ6 == gVar) {
                objQ6 = new l(d0Var2, 25);
                sVar.o0(objQ6);
            }
            fz.a aVar3 = (fz.a) objQ6;
            boolean z16 = (i12 == 256) | (i15 == 32);
            Object objQ7 = sVar.Q();
            if (z16 || objQ7 == gVar) {
                objQ7 = new k(d0Var2, oVar, 3);
                sVar.o0(objQ7);
            }
            fz.a aVar4 = (fz.a) objQ7;
            boolean z17 = (i12 == 256) | (i15 == 32);
            Object objQ8 = sVar.Q();
            if (z17 || objQ8 == gVar) {
                objQ8 = new e0(d0Var2, oVar, 7);
                sVar.o0(objQ8);
            }
            B(courseSentence, s0Var, oVar, strE0, "sent_m4_assemble_by_audio", z11, false, dVarD, dVarD2, aVar, eVar, cVar, aVar2, aVar3, aVar4, (fz.c) objQ8, sVar, ((i13 << 3) & 896) | 114843648, 0);
            sVar = sVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b4(data, courseTestParams, d0Var, i11, 0);
        }
    }

    public static final void x(ht.o oVar, l1.b1 b1Var, ys.d0 d0Var, jt.s0 s0Var, List list, ht.l lVar) {
        if (oVar.f33762j) {
            b1Var.setValue(Long.valueOf(((Number) b1Var.getValue()).longValue() + 1));
        }
        if (d0Var != null) {
            jh.h.m(d0Var, list, lVar, new x3(s0Var, 0));
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0146  */
    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:111:0x016b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x016d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0174  */
    /* JADX WARN: Code duplicated, block: B:117:0x017d  */
    /* JADX WARN: Code duplicated, block: B:119:0x0181  */
    /* JADX WARN: Code duplicated, block: B:121:0x0185  */
    /* JADX WARN: Code duplicated, block: B:122:0x0188  */
    /* JADX WARN: Code duplicated, block: B:124:0x018c  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:127:0x0193  */
    /* JADX WARN: Code duplicated, block: B:129:0x0199  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:136:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:147:0x0206  */
    /* JADX WARN: Code duplicated, block: B:150:0x0216  */
    /* JADX WARN: Code duplicated, block: B:151:0x022b  */
    /* JADX WARN: Code duplicated, block: B:155:0x023b  */
    /* JADX WARN: Code duplicated, block: B:159:0x0249 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:175:0x0288  */
    /* JADX WARN: Code duplicated, block: B:178:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:179:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:183:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:186:0x02de A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:189:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:191:0x0338  */
    /* JADX WARN: Code duplicated, block: B:194:0x034c  */
    /* JADX WARN: Code duplicated, block: B:204:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:56:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x0102  */
    /* JADX WARN: Code duplicated, block: B:82:0x010a  */
    /* JADX WARN: Code duplicated, block: B:83:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0115  */
    /* JADX WARN: Code duplicated, block: B:89:0x011b  */
    /* JADX WARN: Code duplicated, block: B:90:0x011e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0123  */
    /* JADX WARN: Code duplicated, block: B:95:0x0133  */
    /* JADX WARN: Code duplicated, block: B:99:0x013c  */
    public static final void y(final List optionWords, final l1.b1 currentTextStyle, final boolean z11, z1.r rVar, l1.b1 b1Var, boolean z12, f2.c cVar, int i11, boolean z13, fz.e eVar, final fz.c onClickOption, l1.n nVar, final int i12, final int i13, final int i14) {
        z1.r rVar2;
        l1.b1 b1VarB;
        int i15;
        int i16;
        int i17;
        boolean z14;
        int i18;
        int i19;
        f2.c cVar2;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        boolean z15;
        final boolean z16;
        final z1.r rVar3;
        final l1.b1 b1Var2;
        final boolean z17;
        final int i31;
        final fz.e eVar2;
        final f2.c cVar3;
        l1.x1 x1VarT;
        int i32;
        l1.g gVar;
        int i33;
        boolean z18;
        fz.e eVar3;
        int i34;
        Object objQ;
        boolean zF;
        Object objQ2;
        x1.s sVar;
        List list;
        fz.e eVar4;
        int size;
        int i35;
        boolean z19;
        boolean zD;
        Object objQ3;
        boolean z20;
        fz.e eVar5;
        x1.m mVar;
        ArrayList arrayList;
        Iterator it;
        h8 h8Var;
        h8 h8Var2;
        z1.r rVar4;
        int i36;
        int i37;
        kotlin.jvm.internal.m.f(optionWords, "optionWords");
        kotlin.jvm.internal.m.f(currentTextStyle, "currentTextStyle");
        kotlin.jvm.internal.m.f(onClickOption, "onClickOption");
        l1.s sVar2 = (l1.s) nVar;
        sVar2.f0(-1598769189);
        int i38 = (sVar2.h(optionWords) ? 4 : 2) | i12;
        if ((i12 & 48) == 0) {
            i38 |= sVar2.f(currentTextStyle) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i38 |= sVar2.g(z11) ? 256 : 128;
        }
        int i39 = i14 & 8;
        if (i39 == 0) {
            if ((i12 & 3072) == 0) {
                rVar2 = rVar;
                i38 |= sVar2.f(rVar2) ? 2048 : 1024;
            }
            if ((i14 & 16) == 0) {
                b1VarB = b1Var;
                if (sVar2.f(b1VarB)) {
                    i15 = 16384;
                }
                i16 = i38 | i15;
                i17 = i14 & 32;
                if (i17 != 0) {
                    if ((196608 & i12) == 0) {
                        z14 = z12;
                        if (sVar2.g(z14)) {
                            i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                        } else {
                            i18 = 65536;
                        }
                        i16 |= i18;
                    }
                    i19 = i14 & 64;
                    if (i19 != 0) {
                        i16 |= 1572864;
                        cVar2 = cVar;
                    } else {
                        cVar2 = cVar;
                        if ((i12 & 1572864) == 0) {
                            if (sVar2.f(cVar2)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i16 |= i21;
                        }
                    }
                    i22 = i14 & 128;
                    if (i22 != 0) {
                        i24 = i16 | 12582912;
                    } else {
                        int i40 = i16;
                        if (sVar2.d(i11)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i24 = i40 | i23;
                    }
                    i25 = i14 & 256;
                    if (i25 != 0) {
                        i24 |= 100663296;
                    } else if ((i12 & 100663296) == 0) {
                        if (sVar2.g(z13)) {
                            i26 = 67108864;
                        } else {
                            i26 = 33554432;
                        }
                        i24 |= i26;
                    }
                    i27 = i14 & 512;
                    if (i27 != 0) {
                        i29 = i24 | 805306368;
                    } else {
                        if (sVar2.h(eVar)) {
                            i28 = 536870912;
                        } else {
                            i28 = 268435456;
                        }
                        i29 = i24 | i28;
                    }
                    if ((i13 & 6) == 0) {
                        if (sVar2.h(onClickOption)) {
                            i37 = 4;
                        } else {
                            i37 = 2;
                        }
                        i30 = i13 | i37;
                    } else {
                        i30 = i13;
                    }
                    if ((i29 & 306783379) == 306783378 || (i30 & 3) != 2) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if (sVar2.T(i29 & 1, z15)) {
                        sVar2.Y();
                        i32 = i12 & 1;
                        gVar = l1.m.f39353a;
                        if (i32 != 0 || sVar2.C()) {
                            if (i39 != 0) {
                                rVar2 = z1.o.f58481a;
                            }
                            if ((i14 & 16) != 0) {
                                i29 &= -57345;
                                b1VarB = l1.t.B(null);
                            }
                            if (i17 != 0) {
                                z14 = false;
                            }
                            if (i19 != 0) {
                                cVar2 = null;
                            }
                            if (i22 != 0) {
                                i33 = 0;
                            } else {
                                i33 = i11;
                            }
                            if (i25 != 0) {
                                z18 = true;
                            } else {
                                z18 = z13;
                            }
                            if (i27 != 0) {
                                objQ = sVar2.Q();
                                if (objQ == gVar) {
                                    objQ = new bp.h1(19);
                                    sVar2.o0(objQ);
                                }
                                eVar3 = (fz.e) objQ;
                            } else {
                                eVar3 = eVar;
                            }
                            i34 = i33;
                        } else {
                            sVar2.W();
                            if ((i14 & 16) != 0) {
                                i29 &= -57345;
                            }
                            i34 = i11;
                            z18 = z13;
                            eVar3 = eVar;
                        }
                        sVar2.q();
                        zF = sVar2.f(optionWords);
                        objQ2 = sVar2.Q();
                        if (zF || objQ2 == gVar) {
                            objQ2 = new x1.s();
                            sVar2.o0(objQ2);
                        }
                        sVar = (x1.s) objQ2;
                        list = ry.r.f50854a;
                        if (z18) {
                            mVar = sVar.f55711d;
                            if (mVar.f55700a.isEmpty()) {
                                list = list;
                            } else {
                                List listS0 = ry.m.S0(mVar, new b4.e(1));
                                arrayList = new ArrayList();
                                it = listS0.iterator();
                                while (it.hasNext()) {
                                    h8Var = (h8) it.next();
                                    Iterator it2 = it;
                                    h8Var2 = (h8) ry.m.A0(arrayList);
                                    fz.e eVar6 = eVar3;
                                    if (h8Var2 != null) {
                                        i36 = h8Var2.f5501a;
                                        rVar4 = rVar2;
                                        if (Math.abs(h8Var.f5501a - i36) > 8) {
                                            arrayList.set(ns.o.A(arrayList), new h8(i36, Math.max(h8Var2.f5502b, h8Var.f5502b)));
                                        }
                                        it = it2;
                                        eVar3 = eVar6;
                                        rVar2 = rVar4;
                                    } else {
                                        rVar4 = rVar2;
                                    }
                                    arrayList.add(h8Var);
                                    it = it2;
                                    eVar3 = eVar6;
                                    rVar2 = rVar4;
                                }
                                list = arrayList;
                            }
                            eVar4 = eVar3;
                            z1.r rVar5 = rVar2;
                            size = list.size();
                            if (z18 != 0 || cVar2 == null) {
                                i35 = 0;
                            } else {
                                int iQ = hz.b.Q(cVar2.f26573b);
                                int iQ2 = hz.b.Q(cVar2.f26575d);
                                if (list.isEmpty()) {
                                    i35 = 0;
                                } else {
                                    Iterator it3 = list.iterator();
                                    i35 = 0;
                                    while (it3.hasNext()) {
                                        h8 h8Var3 = (h8) it3.next();
                                        Iterator it4 = it3;
                                        int i41 = h8Var3.f5501a + i34;
                                        int i42 = h8Var3.f5502b + i34;
                                        if (i41 >= iQ && i42 <= iQ2 && (i35 = i35 + 1) < 0) {
                                            ns.o.U();
                                            throw null;
                                        }
                                        it3 = it4;
                                    }
                                }
                            }
                            f2.c cVar4 = cVar2;
                            Object[] objArr = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar4, Integer.valueOf(i34)};
                            if ((i29 & 234881024) == 67108864) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                            objQ3 = sVar2.Q();
                            if (!zD || objQ3 == gVar) {
                                boolean z21 = z18;
                                objQ3 = new r4(z21, eVar4, size, i35, null);
                                z20 = z21;
                                eVar5 = eVar4;
                                sVar2.o0(objQ3);
                            } else {
                                z20 = z18;
                                eVar5 = eVar4;
                            }
                            l1.t.i(objArr, (fz.e) objQ3, sVar2);
                            boolean z22 = z20;
                            boolean z23 = z14;
                            l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar5, optionWords, z22, sVar, z11, z23, b1VarB, onClickOption), sVar2), sVar2, 56);
                            z16 = z22;
                            rVar3 = rVar5;
                            z17 = z23;
                            b1Var2 = b1VarB;
                            i31 = i34;
                            cVar3 = cVar4;
                            eVar2 = eVar5;
                        }
                        eVar4 = eVar3;
                        z1.r rVar6 = rVar2;
                        size = list.size();
                        if (z18 != 0) {
                            i35 = 0;
                        } else {
                            i35 = 0;
                        }
                        f2.c cVar5 = cVar2;
                        Object[] objArr2 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar5, Integer.valueOf(i34)};
                        if ((i29 & 234881024) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                        objQ3 = sVar2.Q();
                        if (zD) {
                            boolean z24 = z18;
                            objQ3 = new r4(z24, eVar4, size, i35, null);
                            z20 = z24;
                            eVar5 = eVar4;
                            sVar2.o0(objQ3);
                        } else {
                            boolean z25 = z18;
                            objQ3 = new r4(z25, eVar4, size, i35, null);
                            z20 = z25;
                            eVar5 = eVar4;
                            sVar2.o0(objQ3);
                        }
                        l1.t.i(objArr2, (fz.e) objQ3, sVar2);
                        boolean z26 = z20;
                        boolean z27 = z14;
                        l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar6, optionWords, z26, sVar, z11, z27, b1VarB, onClickOption), sVar2), sVar2, 56);
                        z16 = z26;
                        rVar3 = rVar6;
                        z17 = z27;
                        b1Var2 = b1VarB;
                        i31 = i34;
                        cVar3 = cVar5;
                        eVar2 = eVar5;
                    } else {
                        sVar2.W();
                        z16 = z13;
                        rVar3 = rVar2;
                        b1Var2 = b1VarB;
                        z17 = z14;
                        i31 = i11;
                        eVar2 = eVar;
                        cVar3 = cVar2;
                    }
                    x1VarT = sVar2.t();
                    if (x1VarT != null) {
                        x1VarT.f39502d = new fz.e() { // from class: bt.l4
                            @Override // fz.e
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM = l1.t.M(i12 | 1);
                                int iM2 = l1.t.M(i13);
                                b.y(optionWords, currentTextStyle, z11, rVar3, b1Var2, z17, cVar3, i31, z16, eVar2, onClickOption, (l1.n) obj, iM, iM2, i14);
                                return qy.b0.f48488a;
                            }
                        };
                    }
                }
                i16 |= 196608;
                z14 = z12;
                i19 = i14 & 64;
                if (i19 != 0) {
                    i16 |= 1572864;
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                    if ((i12 & 1572864) == 0) {
                        if (sVar2.f(cVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i16 |= i21;
                    }
                }
                i22 = i14 & 128;
                if (i22 != 0) {
                    i24 = i16 | 12582912;
                } else {
                    int i43 = i16;
                    if (sVar2.d(i11)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i24 = i43 | i23;
                }
                i25 = i14 & 256;
                if (i25 != 0) {
                    i24 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (sVar2.g(z13)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i24 |= i26;
                }
                i27 = i14 & 512;
                if (i27 != 0) {
                    i29 = i24 | 805306368;
                } else {
                    if (sVar2.h(eVar)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i29 = i24 | i28;
                }
                if ((i13 & 6) == 0) {
                    if (sVar2.h(onClickOption)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i30 = i13 | i37;
                } else {
                    i30 = i13;
                }
                if ((i29 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (sVar2.T(i29 & 1, z15)) {
                    sVar2.Y();
                    i32 = i12 & 1;
                    gVar = l1.m.f39353a;
                    if (i32 != 0) {
                        if (i39 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if ((i14 & 16) != 0) {
                            i29 &= -57345;
                            b1VarB = l1.t.B(null);
                        }
                        if (i17 != 0) {
                            z14 = false;
                        }
                        if (i19 != 0) {
                            cVar2 = null;
                        }
                        if (i22 != 0) {
                            i33 = 0;
                        } else {
                            i33 = i11;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i27 != 0) {
                            objQ = sVar2.Q();
                            if (objQ == gVar) {
                                objQ = new bp.h1(19);
                                sVar2.o0(objQ);
                            }
                            eVar3 = (fz.e) objQ;
                        } else {
                            eVar3 = eVar;
                        }
                        i34 = i33;
                    } else {
                        if (i39 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if ((i14 & 16) != 0) {
                            i29 &= -57345;
                            b1VarB = l1.t.B(null);
                        }
                        if (i17 != 0) {
                            z14 = false;
                        }
                        if (i19 != 0) {
                            cVar2 = null;
                        }
                        if (i22 != 0) {
                            i33 = 0;
                        } else {
                            i33 = i11;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i27 != 0) {
                            objQ = sVar2.Q();
                            if (objQ == gVar) {
                                objQ = new bp.h1(19);
                                sVar2.o0(objQ);
                            }
                            eVar3 = (fz.e) objQ;
                        } else {
                            eVar3 = eVar;
                        }
                        i34 = i33;
                    }
                    sVar2.q();
                    zF = sVar2.f(optionWords);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = new x1.s();
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new x1.s();
                        sVar2.o0(objQ2);
                    }
                    sVar = (x1.s) objQ2;
                    list = ry.r.f50854a;
                    if (z18) {
                        mVar = sVar.f55711d;
                        if (mVar.f55700a.isEmpty()) {
                            list = list;
                        } else {
                            List listS1 = ry.m.S0(mVar, new b4.e(1));
                            arrayList = new ArrayList();
                            it = listS1.iterator();
                            while (it.hasNext()) {
                                h8Var = (h8) it.next();
                                Iterator it5 = it;
                                h8Var2 = (h8) ry.m.A0(arrayList);
                                fz.e eVar7 = eVar3;
                                if (h8Var2 != null) {
                                    i36 = h8Var2.f5501a;
                                    rVar4 = rVar2;
                                    if (Math.abs(h8Var.f5501a - i36) > 8) {
                                        arrayList.set(ns.o.A(arrayList), new h8(i36, Math.max(h8Var2.f5502b, h8Var.f5502b)));
                                    }
                                    it = it5;
                                    eVar3 = eVar7;
                                    rVar2 = rVar4;
                                } else {
                                    rVar4 = rVar2;
                                }
                                arrayList.add(h8Var);
                                it = it5;
                                eVar3 = eVar7;
                                rVar2 = rVar4;
                            }
                            list = arrayList;
                        }
                        eVar4 = eVar3;
                        z1.r rVar7 = rVar2;
                        size = list.size();
                        if (z18 != 0) {
                            i35 = 0;
                        } else {
                            i35 = 0;
                        }
                        f2.c cVar6 = cVar2;
                        Object[] objArr3 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar6, Integer.valueOf(i34)};
                        if ((i29 & 234881024) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                        objQ3 = sVar2.Q();
                        if (zD) {
                            boolean z28 = z18;
                            objQ3 = new r4(z28, eVar4, size, i35, null);
                            z20 = z28;
                            eVar5 = eVar4;
                            sVar2.o0(objQ3);
                        } else {
                            boolean z29 = z18;
                            objQ3 = new r4(z29, eVar4, size, i35, null);
                            z20 = z29;
                            eVar5 = eVar4;
                            sVar2.o0(objQ3);
                        }
                        l1.t.i(objArr3, (fz.e) objQ3, sVar2);
                        boolean z210 = z20;
                        boolean z211 = z14;
                        l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar7, optionWords, z210, sVar, z11, z211, b1VarB, onClickOption), sVar2), sVar2, 56);
                        z16 = z210;
                        rVar3 = rVar7;
                        z17 = z211;
                        b1Var2 = b1VarB;
                        i31 = i34;
                        cVar3 = cVar6;
                        eVar2 = eVar5;
                    }
                    eVar4 = eVar3;
                    z1.r rVar8 = rVar2;
                    size = list.size();
                    if (z18 != 0) {
                        i35 = 0;
                    } else {
                        i35 = 0;
                    }
                    f2.c cVar7 = cVar2;
                    Object[] objArr4 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar7, Integer.valueOf(i34)};
                    if ((i29 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                    objQ3 = sVar2.Q();
                    if (zD) {
                        boolean z212 = z18;
                        objQ3 = new r4(z212, eVar4, size, i35, null);
                        z20 = z212;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    } else {
                        boolean z213 = z18;
                        objQ3 = new r4(z213, eVar4, size, i35, null);
                        z20 = z213;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    }
                    l1.t.i(objArr4, (fz.e) objQ3, sVar2);
                    boolean z214 = z20;
                    boolean z215 = z14;
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar8, optionWords, z214, sVar, z11, z215, b1VarB, onClickOption), sVar2), sVar2, 56);
                    z16 = z214;
                    rVar3 = rVar8;
                    z17 = z215;
                    b1Var2 = b1VarB;
                    i31 = i34;
                    cVar3 = cVar7;
                    eVar2 = eVar5;
                } else {
                    sVar2.W();
                    z16 = z13;
                    rVar3 = rVar2;
                    b1Var2 = b1VarB;
                    z17 = z14;
                    i31 = i11;
                    eVar2 = eVar;
                    cVar3 = cVar2;
                }
                x1VarT = sVar2.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: bt.l4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i12 | 1);
                            int iM2 = l1.t.M(i13);
                            b.y(optionWords, currentTextStyle, z11, rVar3, b1Var2, z17, cVar3, i31, z16, eVar2, onClickOption, (l1.n) obj, iM, iM2, i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            b1VarB = b1Var;
            i15 = OSSConstants.DEFAULT_BUFFER_SIZE;
            i16 = i38 | i15;
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((196608 & i12) == 0) {
                    z14 = z12;
                    if (sVar2.g(z14)) {
                        i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                i19 = i14 & 64;
                if (i19 != 0) {
                    i16 |= 1572864;
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                    if ((i12 & 1572864) == 0) {
                        if (sVar2.f(cVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i16 |= i21;
                    }
                }
                i22 = i14 & 128;
                if (i22 != 0) {
                    i24 = i16 | 12582912;
                } else {
                    int i44 = i16;
                    if (sVar2.d(i11)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i24 = i44 | i23;
                }
                i25 = i14 & 256;
                if (i25 != 0) {
                    i24 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (sVar2.g(z13)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i24 |= i26;
                }
                i27 = i14 & 512;
                if (i27 != 0) {
                    i29 = i24 | 805306368;
                } else {
                    if (sVar2.h(eVar)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i29 = i24 | i28;
                }
                if ((i13 & 6) == 0) {
                    if (sVar2.h(onClickOption)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i30 = i13 | i37;
                } else {
                    i30 = i13;
                }
                if ((i29 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (sVar2.T(i29 & 1, z15)) {
                    sVar2.Y();
                    i32 = i12 & 1;
                    gVar = l1.m.f39353a;
                    if (i32 != 0) {
                        if (i39 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if ((i14 & 16) != 0) {
                            i29 &= -57345;
                            b1VarB = l1.t.B(null);
                        }
                        if (i17 != 0) {
                            z14 = false;
                        }
                        if (i19 != 0) {
                            cVar2 = null;
                        }
                        if (i22 != 0) {
                            i33 = 0;
                        } else {
                            i33 = i11;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i27 != 0) {
                            objQ = sVar2.Q();
                            if (objQ == gVar) {
                                objQ = new bp.h1(19);
                                sVar2.o0(objQ);
                            }
                            eVar3 = (fz.e) objQ;
                        } else {
                            eVar3 = eVar;
                        }
                        i34 = i33;
                    } else {
                        if (i39 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if ((i14 & 16) != 0) {
                            i29 &= -57345;
                            b1VarB = l1.t.B(null);
                        }
                        if (i17 != 0) {
                            z14 = false;
                        }
                        if (i19 != 0) {
                            cVar2 = null;
                        }
                        if (i22 != 0) {
                            i33 = 0;
                        } else {
                            i33 = i11;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i27 != 0) {
                            objQ = sVar2.Q();
                            if (objQ == gVar) {
                                objQ = new bp.h1(19);
                                sVar2.o0(objQ);
                            }
                            eVar3 = (fz.e) objQ;
                        } else {
                            eVar3 = eVar;
                        }
                        i34 = i33;
                    }
                    sVar2.q();
                    zF = sVar2.f(optionWords);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = new x1.s();
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new x1.s();
                        sVar2.o0(objQ2);
                    }
                    sVar = (x1.s) objQ2;
                    list = ry.r.f50854a;
                    if (z18) {
                        mVar = sVar.f55711d;
                        if (mVar.f55700a.isEmpty()) {
                            list = list;
                        } else {
                            List listS2 = ry.m.S0(mVar, new b4.e(1));
                            arrayList = new ArrayList();
                            it = listS2.iterator();
                            while (it.hasNext()) {
                                h8Var = (h8) it.next();
                                Iterator it6 = it;
                                h8Var2 = (h8) ry.m.A0(arrayList);
                                fz.e eVar8 = eVar3;
                                if (h8Var2 != null) {
                                    i36 = h8Var2.f5501a;
                                    rVar4 = rVar2;
                                    if (Math.abs(h8Var.f5501a - i36) > 8) {
                                        arrayList.set(ns.o.A(arrayList), new h8(i36, Math.max(h8Var2.f5502b, h8Var.f5502b)));
                                    }
                                    it = it6;
                                    eVar3 = eVar8;
                                    rVar2 = rVar4;
                                } else {
                                    rVar4 = rVar2;
                                }
                                arrayList.add(h8Var);
                                it = it6;
                                eVar3 = eVar8;
                                rVar2 = rVar4;
                            }
                            list = arrayList;
                        }
                        eVar4 = eVar3;
                        z1.r rVar9 = rVar2;
                        size = list.size();
                        if (z18 != 0) {
                            i35 = 0;
                        } else {
                            i35 = 0;
                        }
                        f2.c cVar8 = cVar2;
                        Object[] objArr5 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar8, Integer.valueOf(i34)};
                        if ((i29 & 234881024) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                        objQ3 = sVar2.Q();
                        if (zD) {
                            boolean z216 = z18;
                            objQ3 = new r4(z216, eVar4, size, i35, null);
                            z20 = z216;
                            eVar5 = eVar4;
                            sVar2.o0(objQ3);
                        } else {
                            boolean z217 = z18;
                            objQ3 = new r4(z217, eVar4, size, i35, null);
                            z20 = z217;
                            eVar5 = eVar4;
                            sVar2.o0(objQ3);
                        }
                        l1.t.i(objArr5, (fz.e) objQ3, sVar2);
                        boolean z218 = z20;
                        boolean z219 = z14;
                        l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar9, optionWords, z218, sVar, z11, z219, b1VarB, onClickOption), sVar2), sVar2, 56);
                        z16 = z218;
                        rVar3 = rVar9;
                        z17 = z219;
                        b1Var2 = b1VarB;
                        i31 = i34;
                        cVar3 = cVar8;
                        eVar2 = eVar5;
                    }
                    eVar4 = eVar3;
                    z1.r rVar10 = rVar2;
                    size = list.size();
                    if (z18 != 0) {
                        i35 = 0;
                    } else {
                        i35 = 0;
                    }
                    f2.c cVar9 = cVar2;
                    Object[] objArr6 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar9, Integer.valueOf(i34)};
                    if ((i29 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                    objQ3 = sVar2.Q();
                    if (zD) {
                        boolean z2110 = z18;
                        objQ3 = new r4(z2110, eVar4, size, i35, null);
                        z20 = z2110;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    } else {
                        boolean z2111 = z18;
                        objQ3 = new r4(z2111, eVar4, size, i35, null);
                        z20 = z2111;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    }
                    l1.t.i(objArr6, (fz.e) objQ3, sVar2);
                    boolean z2112 = z20;
                    boolean z2113 = z14;
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar10, optionWords, z2112, sVar, z11, z2113, b1VarB, onClickOption), sVar2), sVar2, 56);
                    z16 = z2112;
                    rVar3 = rVar10;
                    z17 = z2113;
                    b1Var2 = b1VarB;
                    i31 = i34;
                    cVar3 = cVar9;
                    eVar2 = eVar5;
                } else {
                    sVar2.W();
                    z16 = z13;
                    rVar3 = rVar2;
                    b1Var2 = b1VarB;
                    z17 = z14;
                    i31 = i11;
                    eVar2 = eVar;
                    cVar3 = cVar2;
                }
                x1VarT = sVar2.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: bt.l4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i12 | 1);
                            int iM2 = l1.t.M(i13);
                            b.y(optionWords, currentTextStyle, z11, rVar3, b1Var2, z17, cVar3, i31, z16, eVar2, onClickOption, (l1.n) obj, iM, iM2, i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 196608;
            z14 = z12;
            i19 = i14 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if ((i12 & 1572864) == 0) {
                    if (sVar2.f(cVar2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i16 |= i21;
                }
            }
            i22 = i14 & 128;
            if (i22 != 0) {
                i24 = i16 | 12582912;
            } else {
                int i45 = i16;
                if (sVar2.d(i11)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i24 = i45 | i23;
            }
            i25 = i14 & 256;
            if (i25 != 0) {
                i24 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (sVar2.g(z13)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i24 |= i26;
            }
            i27 = i14 & 512;
            if (i27 != 0) {
                i29 = i24 | 805306368;
            } else {
                if (sVar2.h(eVar)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i29 = i24 | i28;
            }
            if ((i13 & 6) == 0) {
                if (sVar2.h(onClickOption)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i30 = i13 | i37;
            } else {
                i30 = i13;
            }
            if ((i29 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (sVar2.T(i29 & 1, z15)) {
                sVar2.Y();
                i32 = i12 & 1;
                gVar = l1.m.f39353a;
                if (i32 != 0) {
                    if (i39 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if ((i14 & 16) != 0) {
                        i29 &= -57345;
                        b1VarB = l1.t.B(null);
                    }
                    if (i17 != 0) {
                        z14 = false;
                    }
                    if (i19 != 0) {
                        cVar2 = null;
                    }
                    if (i22 != 0) {
                        i33 = 0;
                    } else {
                        i33 = i11;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i27 != 0) {
                        objQ = sVar2.Q();
                        if (objQ == gVar) {
                            objQ = new bp.h1(19);
                            sVar2.o0(objQ);
                        }
                        eVar3 = (fz.e) objQ;
                    } else {
                        eVar3 = eVar;
                    }
                    i34 = i33;
                } else {
                    if (i39 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if ((i14 & 16) != 0) {
                        i29 &= -57345;
                        b1VarB = l1.t.B(null);
                    }
                    if (i17 != 0) {
                        z14 = false;
                    }
                    if (i19 != 0) {
                        cVar2 = null;
                    }
                    if (i22 != 0) {
                        i33 = 0;
                    } else {
                        i33 = i11;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i27 != 0) {
                        objQ = sVar2.Q();
                        if (objQ == gVar) {
                            objQ = new bp.h1(19);
                            sVar2.o0(objQ);
                        }
                        eVar3 = (fz.e) objQ;
                    } else {
                        eVar3 = eVar;
                    }
                    i34 = i33;
                }
                sVar2.q();
                zF = sVar2.f(optionWords);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new x1.s();
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new x1.s();
                    sVar2.o0(objQ2);
                }
                sVar = (x1.s) objQ2;
                list = ry.r.f50854a;
                if (z18) {
                    mVar = sVar.f55711d;
                    if (mVar.f55700a.isEmpty()) {
                        list = list;
                    } else {
                        List listS3 = ry.m.S0(mVar, new b4.e(1));
                        arrayList = new ArrayList();
                        it = listS3.iterator();
                        while (it.hasNext()) {
                            h8Var = (h8) it.next();
                            Iterator it7 = it;
                            h8Var2 = (h8) ry.m.A0(arrayList);
                            fz.e eVar9 = eVar3;
                            if (h8Var2 != null) {
                                i36 = h8Var2.f5501a;
                                rVar4 = rVar2;
                                if (Math.abs(h8Var.f5501a - i36) > 8) {
                                    arrayList.set(ns.o.A(arrayList), new h8(i36, Math.max(h8Var2.f5502b, h8Var.f5502b)));
                                }
                                it = it7;
                                eVar3 = eVar9;
                                rVar2 = rVar4;
                            } else {
                                rVar4 = rVar2;
                            }
                            arrayList.add(h8Var);
                            it = it7;
                            eVar3 = eVar9;
                            rVar2 = rVar4;
                        }
                        list = arrayList;
                    }
                    eVar4 = eVar3;
                    z1.r rVar11 = rVar2;
                    size = list.size();
                    if (z18 != 0) {
                        i35 = 0;
                    } else {
                        i35 = 0;
                    }
                    f2.c cVar10 = cVar2;
                    Object[] objArr7 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar10, Integer.valueOf(i34)};
                    if ((i29 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                    objQ3 = sVar2.Q();
                    if (zD) {
                        boolean z2114 = z18;
                        objQ3 = new r4(z2114, eVar4, size, i35, null);
                        z20 = z2114;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    } else {
                        boolean z2115 = z18;
                        objQ3 = new r4(z2115, eVar4, size, i35, null);
                        z20 = z2115;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    }
                    l1.t.i(objArr7, (fz.e) objQ3, sVar2);
                    boolean z2116 = z20;
                    boolean z2117 = z14;
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar11, optionWords, z2116, sVar, z11, z2117, b1VarB, onClickOption), sVar2), sVar2, 56);
                    z16 = z2116;
                    rVar3 = rVar11;
                    z17 = z2117;
                    b1Var2 = b1VarB;
                    i31 = i34;
                    cVar3 = cVar10;
                    eVar2 = eVar5;
                }
                eVar4 = eVar3;
                z1.r rVar12 = rVar2;
                size = list.size();
                if (z18 != 0) {
                    i35 = 0;
                } else {
                    i35 = 0;
                }
                f2.c cVar11 = cVar2;
                Object[] objArr8 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar11, Integer.valueOf(i34)};
                if ((i29 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                objQ3 = sVar2.Q();
                if (zD) {
                    boolean z2118 = z18;
                    objQ3 = new r4(z2118, eVar4, size, i35, null);
                    z20 = z2118;
                    eVar5 = eVar4;
                    sVar2.o0(objQ3);
                } else {
                    boolean z2119 = z18;
                    objQ3 = new r4(z2119, eVar4, size, i35, null);
                    z20 = z2119;
                    eVar5 = eVar4;
                    sVar2.o0(objQ3);
                }
                l1.t.i(objArr8, (fz.e) objQ3, sVar2);
                boolean z21110 = z20;
                boolean z21111 = z14;
                l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar12, optionWords, z21110, sVar, z11, z21111, b1VarB, onClickOption), sVar2), sVar2, 56);
                z16 = z21110;
                rVar3 = rVar12;
                z17 = z21111;
                b1Var2 = b1VarB;
                i31 = i34;
                cVar3 = cVar11;
                eVar2 = eVar5;
            } else {
                sVar2.W();
                z16 = z13;
                rVar3 = rVar2;
                b1Var2 = b1VarB;
                z17 = z14;
                i31 = i11;
                eVar2 = eVar;
                cVar3 = cVar2;
            }
            x1VarT = sVar2.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: bt.l4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i12 | 1);
                        int iM2 = l1.t.M(i13);
                        b.y(optionWords, currentTextStyle, z11, rVar3, b1Var2, z17, cVar3, i31, z16, eVar2, onClickOption, (l1.n) obj, iM, iM2, i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i38 |= 3072;
        rVar2 = rVar;
        if ((i14 & 16) == 0) {
            b1VarB = b1Var;
            if (sVar2.f(b1VarB)) {
                i15 = 16384;
            }
            i16 = i38 | i15;
            i17 = i14 & 32;
            if (i17 != 0) {
                if ((196608 & i12) == 0) {
                    z14 = z12;
                    if (sVar2.g(z14)) {
                        i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                    } else {
                        i18 = 65536;
                    }
                    i16 |= i18;
                }
                i19 = i14 & 64;
                if (i19 != 0) {
                    i16 |= 1572864;
                    cVar2 = cVar;
                } else {
                    cVar2 = cVar;
                    if ((i12 & 1572864) == 0) {
                        if (sVar2.f(cVar2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i16 |= i21;
                    }
                }
                i22 = i14 & 128;
                if (i22 != 0) {
                    i24 = i16 | 12582912;
                } else {
                    int i46 = i16;
                    if (sVar2.d(i11)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i24 = i46 | i23;
                }
                i25 = i14 & 256;
                if (i25 != 0) {
                    i24 |= 100663296;
                } else if ((i12 & 100663296) == 0) {
                    if (sVar2.g(z13)) {
                        i26 = 67108864;
                    } else {
                        i26 = 33554432;
                    }
                    i24 |= i26;
                }
                i27 = i14 & 512;
                if (i27 != 0) {
                    i29 = i24 | 805306368;
                } else {
                    if (sVar2.h(eVar)) {
                        i28 = 536870912;
                    } else {
                        i28 = 268435456;
                    }
                    i29 = i24 | i28;
                }
                if ((i13 & 6) == 0) {
                    if (sVar2.h(onClickOption)) {
                        i37 = 4;
                    } else {
                        i37 = 2;
                    }
                    i30 = i13 | i37;
                } else {
                    i30 = i13;
                }
                if ((i29 & 306783379) == 306783378) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (sVar2.T(i29 & 1, z15)) {
                    sVar2.Y();
                    i32 = i12 & 1;
                    gVar = l1.m.f39353a;
                    if (i32 != 0) {
                        if (i39 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if ((i14 & 16) != 0) {
                            i29 &= -57345;
                            b1VarB = l1.t.B(null);
                        }
                        if (i17 != 0) {
                            z14 = false;
                        }
                        if (i19 != 0) {
                            cVar2 = null;
                        }
                        if (i22 != 0) {
                            i33 = 0;
                        } else {
                            i33 = i11;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i27 != 0) {
                            objQ = sVar2.Q();
                            if (objQ == gVar) {
                                objQ = new bp.h1(19);
                                sVar2.o0(objQ);
                            }
                            eVar3 = (fz.e) objQ;
                        } else {
                            eVar3 = eVar;
                        }
                        i34 = i33;
                    } else {
                        if (i39 != 0) {
                            rVar2 = z1.o.f58481a;
                        }
                        if ((i14 & 16) != 0) {
                            i29 &= -57345;
                            b1VarB = l1.t.B(null);
                        }
                        if (i17 != 0) {
                            z14 = false;
                        }
                        if (i19 != 0) {
                            cVar2 = null;
                        }
                        if (i22 != 0) {
                            i33 = 0;
                        } else {
                            i33 = i11;
                        }
                        if (i25 != 0) {
                            z18 = true;
                        } else {
                            z18 = z13;
                        }
                        if (i27 != 0) {
                            objQ = sVar2.Q();
                            if (objQ == gVar) {
                                objQ = new bp.h1(19);
                                sVar2.o0(objQ);
                            }
                            eVar3 = (fz.e) objQ;
                        } else {
                            eVar3 = eVar;
                        }
                        i34 = i33;
                    }
                    sVar2.q();
                    zF = sVar2.f(optionWords);
                    objQ2 = sVar2.Q();
                    if (zF) {
                        objQ2 = new x1.s();
                        sVar2.o0(objQ2);
                    } else {
                        objQ2 = new x1.s();
                        sVar2.o0(objQ2);
                    }
                    sVar = (x1.s) objQ2;
                    list = ry.r.f50854a;
                    if (z18) {
                        mVar = sVar.f55711d;
                        if (mVar.f55700a.isEmpty()) {
                            list = list;
                        } else {
                            List listS4 = ry.m.S0(mVar, new b4.e(1));
                            arrayList = new ArrayList();
                            it = listS4.iterator();
                            while (it.hasNext()) {
                                h8Var = (h8) it.next();
                                Iterator it8 = it;
                                h8Var2 = (h8) ry.m.A0(arrayList);
                                fz.e eVar10 = eVar3;
                                if (h8Var2 != null) {
                                    i36 = h8Var2.f5501a;
                                    rVar4 = rVar2;
                                    if (Math.abs(h8Var.f5501a - i36) > 8) {
                                        arrayList.set(ns.o.A(arrayList), new h8(i36, Math.max(h8Var2.f5502b, h8Var.f5502b)));
                                    }
                                    it = it8;
                                    eVar3 = eVar10;
                                    rVar2 = rVar4;
                                } else {
                                    rVar4 = rVar2;
                                }
                                arrayList.add(h8Var);
                                it = it8;
                                eVar3 = eVar10;
                                rVar2 = rVar4;
                            }
                            list = arrayList;
                        }
                        eVar4 = eVar3;
                        z1.r rVar13 = rVar2;
                        size = list.size();
                        if (z18 != 0) {
                            i35 = 0;
                        } else {
                            i35 = 0;
                        }
                        f2.c cVar12 = cVar2;
                        Object[] objArr9 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar12, Integer.valueOf(i34)};
                        if ((i29 & 234881024) == 67108864) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                        objQ3 = sVar2.Q();
                        if (zD) {
                            boolean z21112 = z18;
                            objQ3 = new r4(z21112, eVar4, size, i35, null);
                            z20 = z21112;
                            eVar5 = eVar4;
                            sVar2.o0(objQ3);
                        } else {
                            boolean z21113 = z18;
                            objQ3 = new r4(z21113, eVar4, size, i35, null);
                            z20 = z21113;
                            eVar5 = eVar4;
                            sVar2.o0(objQ3);
                        }
                        l1.t.i(objArr9, (fz.e) objQ3, sVar2);
                        boolean z21114 = z20;
                        boolean z21115 = z14;
                        l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar13, optionWords, z21114, sVar, z11, z21115, b1VarB, onClickOption), sVar2), sVar2, 56);
                        z16 = z21114;
                        rVar3 = rVar13;
                        z17 = z21115;
                        b1Var2 = b1VarB;
                        i31 = i34;
                        cVar3 = cVar12;
                        eVar2 = eVar5;
                    }
                    eVar4 = eVar3;
                    z1.r rVar14 = rVar2;
                    size = list.size();
                    if (z18 != 0) {
                        i35 = 0;
                    } else {
                        i35 = 0;
                    }
                    f2.c cVar13 = cVar2;
                    Object[] objArr10 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar13, Integer.valueOf(i34)};
                    if ((i29 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                    objQ3 = sVar2.Q();
                    if (zD) {
                        boolean z21116 = z18;
                        objQ3 = new r4(z21116, eVar4, size, i35, null);
                        z20 = z21116;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    } else {
                        boolean z21117 = z18;
                        objQ3 = new r4(z21117, eVar4, size, i35, null);
                        z20 = z21117;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    }
                    l1.t.i(objArr10, (fz.e) objQ3, sVar2);
                    boolean z21118 = z20;
                    boolean z21119 = z14;
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar14, optionWords, z21118, sVar, z11, z21119, b1VarB, onClickOption), sVar2), sVar2, 56);
                    z16 = z21118;
                    rVar3 = rVar14;
                    z17 = z21119;
                    b1Var2 = b1VarB;
                    i31 = i34;
                    cVar3 = cVar13;
                    eVar2 = eVar5;
                } else {
                    sVar2.W();
                    z16 = z13;
                    rVar3 = rVar2;
                    b1Var2 = b1VarB;
                    z17 = z14;
                    i31 = i11;
                    eVar2 = eVar;
                    cVar3 = cVar2;
                }
                x1VarT = sVar2.t();
                if (x1VarT != null) {
                    x1VarT.f39502d = new fz.e() { // from class: bt.l4
                        @Override // fz.e
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM = l1.t.M(i12 | 1);
                            int iM2 = l1.t.M(i13);
                            b.y(optionWords, currentTextStyle, z11, rVar3, b1Var2, z17, cVar3, i31, z16, eVar2, onClickOption, (l1.n) obj, iM, iM2, i14);
                            return qy.b0.f48488a;
                        }
                    };
                }
            }
            i16 |= 196608;
            z14 = z12;
            i19 = i14 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if ((i12 & 1572864) == 0) {
                    if (sVar2.f(cVar2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i16 |= i21;
                }
            }
            i22 = i14 & 128;
            if (i22 != 0) {
                i24 = i16 | 12582912;
            } else {
                int i47 = i16;
                if (sVar2.d(i11)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i24 = i47 | i23;
            }
            i25 = i14 & 256;
            if (i25 != 0) {
                i24 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (sVar2.g(z13)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i24 |= i26;
            }
            i27 = i14 & 512;
            if (i27 != 0) {
                i29 = i24 | 805306368;
            } else {
                if (sVar2.h(eVar)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i29 = i24 | i28;
            }
            if ((i13 & 6) == 0) {
                if (sVar2.h(onClickOption)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i30 = i13 | i37;
            } else {
                i30 = i13;
            }
            if ((i29 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (sVar2.T(i29 & 1, z15)) {
                sVar2.Y();
                i32 = i12 & 1;
                gVar = l1.m.f39353a;
                if (i32 != 0) {
                    if (i39 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if ((i14 & 16) != 0) {
                        i29 &= -57345;
                        b1VarB = l1.t.B(null);
                    }
                    if (i17 != 0) {
                        z14 = false;
                    }
                    if (i19 != 0) {
                        cVar2 = null;
                    }
                    if (i22 != 0) {
                        i33 = 0;
                    } else {
                        i33 = i11;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i27 != 0) {
                        objQ = sVar2.Q();
                        if (objQ == gVar) {
                            objQ = new bp.h1(19);
                            sVar2.o0(objQ);
                        }
                        eVar3 = (fz.e) objQ;
                    } else {
                        eVar3 = eVar;
                    }
                    i34 = i33;
                } else {
                    if (i39 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if ((i14 & 16) != 0) {
                        i29 &= -57345;
                        b1VarB = l1.t.B(null);
                    }
                    if (i17 != 0) {
                        z14 = false;
                    }
                    if (i19 != 0) {
                        cVar2 = null;
                    }
                    if (i22 != 0) {
                        i33 = 0;
                    } else {
                        i33 = i11;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i27 != 0) {
                        objQ = sVar2.Q();
                        if (objQ == gVar) {
                            objQ = new bp.h1(19);
                            sVar2.o0(objQ);
                        }
                        eVar3 = (fz.e) objQ;
                    } else {
                        eVar3 = eVar;
                    }
                    i34 = i33;
                }
                sVar2.q();
                zF = sVar2.f(optionWords);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new x1.s();
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new x1.s();
                    sVar2.o0(objQ2);
                }
                sVar = (x1.s) objQ2;
                list = ry.r.f50854a;
                if (z18) {
                    mVar = sVar.f55711d;
                    if (mVar.f55700a.isEmpty()) {
                        list = list;
                    } else {
                        List listS5 = ry.m.S0(mVar, new b4.e(1));
                        arrayList = new ArrayList();
                        it = listS5.iterator();
                        while (it.hasNext()) {
                            h8Var = (h8) it.next();
                            Iterator it9 = it;
                            h8Var2 = (h8) ry.m.A0(arrayList);
                            fz.e eVar11 = eVar3;
                            if (h8Var2 != null) {
                                i36 = h8Var2.f5501a;
                                rVar4 = rVar2;
                                if (Math.abs(h8Var.f5501a - i36) > 8) {
                                    arrayList.set(ns.o.A(arrayList), new h8(i36, Math.max(h8Var2.f5502b, h8Var.f5502b)));
                                }
                                it = it9;
                                eVar3 = eVar11;
                                rVar2 = rVar4;
                            } else {
                                rVar4 = rVar2;
                            }
                            arrayList.add(h8Var);
                            it = it9;
                            eVar3 = eVar11;
                            rVar2 = rVar4;
                        }
                        list = arrayList;
                    }
                    eVar4 = eVar3;
                    z1.r rVar15 = rVar2;
                    size = list.size();
                    if (z18 != 0) {
                        i35 = 0;
                    } else {
                        i35 = 0;
                    }
                    f2.c cVar14 = cVar2;
                    Object[] objArr11 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar14, Integer.valueOf(i34)};
                    if ((i29 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                    objQ3 = sVar2.Q();
                    if (zD) {
                        boolean z211110 = z18;
                        objQ3 = new r4(z211110, eVar4, size, i35, null);
                        z20 = z211110;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    } else {
                        boolean z211111 = z18;
                        objQ3 = new r4(z211111, eVar4, size, i35, null);
                        z20 = z211111;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    }
                    l1.t.i(objArr11, (fz.e) objQ3, sVar2);
                    boolean z211112 = z20;
                    boolean z211113 = z14;
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar15, optionWords, z211112, sVar, z11, z211113, b1VarB, onClickOption), sVar2), sVar2, 56);
                    z16 = z211112;
                    rVar3 = rVar15;
                    z17 = z211113;
                    b1Var2 = b1VarB;
                    i31 = i34;
                    cVar3 = cVar14;
                    eVar2 = eVar5;
                }
                eVar4 = eVar3;
                z1.r rVar16 = rVar2;
                size = list.size();
                if (z18 != 0) {
                    i35 = 0;
                } else {
                    i35 = 0;
                }
                f2.c cVar15 = cVar2;
                Object[] objArr12 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar15, Integer.valueOf(i34)};
                if ((i29 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                objQ3 = sVar2.Q();
                if (zD) {
                    boolean z211114 = z18;
                    objQ3 = new r4(z211114, eVar4, size, i35, null);
                    z20 = z211114;
                    eVar5 = eVar4;
                    sVar2.o0(objQ3);
                } else {
                    boolean z211115 = z18;
                    objQ3 = new r4(z211115, eVar4, size, i35, null);
                    z20 = z211115;
                    eVar5 = eVar4;
                    sVar2.o0(objQ3);
                }
                l1.t.i(objArr12, (fz.e) objQ3, sVar2);
                boolean z211116 = z20;
                boolean z211117 = z14;
                l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar16, optionWords, z211116, sVar, z11, z211117, b1VarB, onClickOption), sVar2), sVar2, 56);
                z16 = z211116;
                rVar3 = rVar16;
                z17 = z211117;
                b1Var2 = b1VarB;
                i31 = i34;
                cVar3 = cVar15;
                eVar2 = eVar5;
            } else {
                sVar2.W();
                z16 = z13;
                rVar3 = rVar2;
                b1Var2 = b1VarB;
                z17 = z14;
                i31 = i11;
                eVar2 = eVar;
                cVar3 = cVar2;
            }
            x1VarT = sVar2.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: bt.l4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i12 | 1);
                        int iM2 = l1.t.M(i13);
                        b.y(optionWords, currentTextStyle, z11, rVar3, b1Var2, z17, cVar3, i31, z16, eVar2, onClickOption, (l1.n) obj, iM, iM2, i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        b1VarB = b1Var;
        i15 = OSSConstants.DEFAULT_BUFFER_SIZE;
        i16 = i38 | i15;
        i17 = i14 & 32;
        if (i17 != 0) {
            if ((196608 & i12) == 0) {
                z14 = z12;
                if (sVar2.g(z14)) {
                    i18 = OSSConstants.DEFAULT_STREAM_BUFFER_SIZE;
                } else {
                    i18 = 65536;
                }
                i16 |= i18;
            }
            i19 = i14 & 64;
            if (i19 != 0) {
                i16 |= 1572864;
                cVar2 = cVar;
            } else {
                cVar2 = cVar;
                if ((i12 & 1572864) == 0) {
                    if (sVar2.f(cVar2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i16 |= i21;
                }
            }
            i22 = i14 & 128;
            if (i22 != 0) {
                i24 = i16 | 12582912;
            } else {
                int i48 = i16;
                if (sVar2.d(i11)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i24 = i48 | i23;
            }
            i25 = i14 & 256;
            if (i25 != 0) {
                i24 |= 100663296;
            } else if ((i12 & 100663296) == 0) {
                if (sVar2.g(z13)) {
                    i26 = 67108864;
                } else {
                    i26 = 33554432;
                }
                i24 |= i26;
            }
            i27 = i14 & 512;
            if (i27 != 0) {
                i29 = i24 | 805306368;
            } else {
                if (sVar2.h(eVar)) {
                    i28 = 536870912;
                } else {
                    i28 = 268435456;
                }
                i29 = i24 | i28;
            }
            if ((i13 & 6) == 0) {
                if (sVar2.h(onClickOption)) {
                    i37 = 4;
                } else {
                    i37 = 2;
                }
                i30 = i13 | i37;
            } else {
                i30 = i13;
            }
            if ((i29 & 306783379) == 306783378) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (sVar2.T(i29 & 1, z15)) {
                sVar2.Y();
                i32 = i12 & 1;
                gVar = l1.m.f39353a;
                if (i32 != 0) {
                    if (i39 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if ((i14 & 16) != 0) {
                        i29 &= -57345;
                        b1VarB = l1.t.B(null);
                    }
                    if (i17 != 0) {
                        z14 = false;
                    }
                    if (i19 != 0) {
                        cVar2 = null;
                    }
                    if (i22 != 0) {
                        i33 = 0;
                    } else {
                        i33 = i11;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i27 != 0) {
                        objQ = sVar2.Q();
                        if (objQ == gVar) {
                            objQ = new bp.h1(19);
                            sVar2.o0(objQ);
                        }
                        eVar3 = (fz.e) objQ;
                    } else {
                        eVar3 = eVar;
                    }
                    i34 = i33;
                } else {
                    if (i39 != 0) {
                        rVar2 = z1.o.f58481a;
                    }
                    if ((i14 & 16) != 0) {
                        i29 &= -57345;
                        b1VarB = l1.t.B(null);
                    }
                    if (i17 != 0) {
                        z14 = false;
                    }
                    if (i19 != 0) {
                        cVar2 = null;
                    }
                    if (i22 != 0) {
                        i33 = 0;
                    } else {
                        i33 = i11;
                    }
                    if (i25 != 0) {
                        z18 = true;
                    } else {
                        z18 = z13;
                    }
                    if (i27 != 0) {
                        objQ = sVar2.Q();
                        if (objQ == gVar) {
                            objQ = new bp.h1(19);
                            sVar2.o0(objQ);
                        }
                        eVar3 = (fz.e) objQ;
                    } else {
                        eVar3 = eVar;
                    }
                    i34 = i33;
                }
                sVar2.q();
                zF = sVar2.f(optionWords);
                objQ2 = sVar2.Q();
                if (zF) {
                    objQ2 = new x1.s();
                    sVar2.o0(objQ2);
                } else {
                    objQ2 = new x1.s();
                    sVar2.o0(objQ2);
                }
                sVar = (x1.s) objQ2;
                list = ry.r.f50854a;
                if (z18) {
                    mVar = sVar.f55711d;
                    if (mVar.f55700a.isEmpty()) {
                        list = list;
                    } else {
                        List listS6 = ry.m.S0(mVar, new b4.e(1));
                        arrayList = new ArrayList();
                        it = listS6.iterator();
                        while (it.hasNext()) {
                            h8Var = (h8) it.next();
                            Iterator it10 = it;
                            h8Var2 = (h8) ry.m.A0(arrayList);
                            fz.e eVar12 = eVar3;
                            if (h8Var2 != null) {
                                i36 = h8Var2.f5501a;
                                rVar4 = rVar2;
                                if (Math.abs(h8Var.f5501a - i36) > 8) {
                                    arrayList.set(ns.o.A(arrayList), new h8(i36, Math.max(h8Var2.f5502b, h8Var.f5502b)));
                                }
                                it = it10;
                                eVar3 = eVar12;
                                rVar2 = rVar4;
                            } else {
                                rVar4 = rVar2;
                            }
                            arrayList.add(h8Var);
                            it = it10;
                            eVar3 = eVar12;
                            rVar2 = rVar4;
                        }
                        list = arrayList;
                    }
                    eVar4 = eVar3;
                    z1.r rVar17 = rVar2;
                    size = list.size();
                    if (z18 != 0) {
                        i35 = 0;
                    } else {
                        i35 = 0;
                    }
                    f2.c cVar16 = cVar2;
                    Object[] objArr13 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar16, Integer.valueOf(i34)};
                    if ((i29 & 234881024) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                    objQ3 = sVar2.Q();
                    if (zD) {
                        boolean z211118 = z18;
                        objQ3 = new r4(z211118, eVar4, size, i35, null);
                        z20 = z211118;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    } else {
                        boolean z211119 = z18;
                        objQ3 = new r4(z211119, eVar4, size, i35, null);
                        z20 = z211119;
                        eVar5 = eVar4;
                        sVar2.o0(objQ3);
                    }
                    l1.t.i(objArr13, (fz.e) objQ3, sVar2);
                    boolean z2111110 = z20;
                    boolean z2111111 = z14;
                    l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar17, optionWords, z2111110, sVar, z11, z2111111, b1VarB, onClickOption), sVar2), sVar2, 56);
                    z16 = z2111110;
                    rVar3 = rVar17;
                    z17 = z2111111;
                    b1Var2 = b1VarB;
                    i31 = i34;
                    cVar3 = cVar16;
                    eVar2 = eVar5;
                }
                eVar4 = eVar3;
                z1.r rVar18 = rVar2;
                size = list.size();
                if (z18 != 0) {
                    i35 = 0;
                } else {
                    i35 = 0;
                }
                f2.c cVar17 = cVar2;
                Object[] objArr14 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar17, Integer.valueOf(i34)};
                if ((i29 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                objQ3 = sVar2.Q();
                if (zD) {
                    boolean z2111112 = z18;
                    objQ3 = new r4(z2111112, eVar4, size, i35, null);
                    z20 = z2111112;
                    eVar5 = eVar4;
                    sVar2.o0(objQ3);
                } else {
                    boolean z2111113 = z18;
                    objQ3 = new r4(z2111113, eVar4, size, i35, null);
                    z20 = z2111113;
                    eVar5 = eVar4;
                    sVar2.o0(objQ3);
                }
                l1.t.i(objArr14, (fz.e) objQ3, sVar2);
                boolean z2111114 = z20;
                boolean z2111115 = z14;
                l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar18, optionWords, z2111114, sVar, z11, z2111115, b1VarB, onClickOption), sVar2), sVar2, 56);
                z16 = z2111114;
                rVar3 = rVar18;
                z17 = z2111115;
                b1Var2 = b1VarB;
                i31 = i34;
                cVar3 = cVar17;
                eVar2 = eVar5;
            } else {
                sVar2.W();
                z16 = z13;
                rVar3 = rVar2;
                b1Var2 = b1VarB;
                z17 = z14;
                i31 = i11;
                eVar2 = eVar;
                cVar3 = cVar2;
            }
            x1VarT = sVar2.t();
            if (x1VarT != null) {
                x1VarT.f39502d = new fz.e() { // from class: bt.l4
                    @Override // fz.e
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM = l1.t.M(i12 | 1);
                        int iM2 = l1.t.M(i13);
                        b.y(optionWords, currentTextStyle, z11, rVar3, b1Var2, z17, cVar3, i31, z16, eVar2, onClickOption, (l1.n) obj, iM, iM2, i14);
                        return qy.b0.f48488a;
                    }
                };
            }
        }
        i16 |= 196608;
        z14 = z12;
        i19 = i14 & 64;
        if (i19 != 0) {
            i16 |= 1572864;
            cVar2 = cVar;
        } else {
            cVar2 = cVar;
            if ((i12 & 1572864) == 0) {
                if (sVar2.f(cVar2)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i16 |= i21;
            }
        }
        i22 = i14 & 128;
        if (i22 != 0) {
            i24 = i16 | 12582912;
        } else {
            int i49 = i16;
            if (sVar2.d(i11)) {
                i23 = 8388608;
            } else {
                i23 = 4194304;
            }
            i24 = i49 | i23;
        }
        i25 = i14 & 256;
        if (i25 != 0) {
            i24 |= 100663296;
        } else if ((i12 & 100663296) == 0) {
            if (sVar2.g(z13)) {
                i26 = 67108864;
            } else {
                i26 = 33554432;
            }
            i24 |= i26;
        }
        i27 = i14 & 512;
        if (i27 != 0) {
            i29 = i24 | 805306368;
        } else {
            if (sVar2.h(eVar)) {
                i28 = 536870912;
            } else {
                i28 = 268435456;
            }
            i29 = i24 | i28;
        }
        if ((i13 & 6) == 0) {
            if (sVar2.h(onClickOption)) {
                i37 = 4;
            } else {
                i37 = 2;
            }
            i30 = i13 | i37;
        } else {
            i30 = i13;
        }
        if ((i29 & 306783379) == 306783378) {
            z15 = true;
        } else {
            z15 = true;
        }
        if (sVar2.T(i29 & 1, z15)) {
            sVar2.Y();
            i32 = i12 & 1;
            gVar = l1.m.f39353a;
            if (i32 != 0) {
                if (i39 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if ((i14 & 16) != 0) {
                    i29 &= -57345;
                    b1VarB = l1.t.B(null);
                }
                if (i17 != 0) {
                    z14 = false;
                }
                if (i19 != 0) {
                    cVar2 = null;
                }
                if (i22 != 0) {
                    i33 = 0;
                } else {
                    i33 = i11;
                }
                if (i25 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i27 != 0) {
                    objQ = sVar2.Q();
                    if (objQ == gVar) {
                        objQ = new bp.h1(19);
                        sVar2.o0(objQ);
                    }
                    eVar3 = (fz.e) objQ;
                } else {
                    eVar3 = eVar;
                }
                i34 = i33;
            } else {
                if (i39 != 0) {
                    rVar2 = z1.o.f58481a;
                }
                if ((i14 & 16) != 0) {
                    i29 &= -57345;
                    b1VarB = l1.t.B(null);
                }
                if (i17 != 0) {
                    z14 = false;
                }
                if (i19 != 0) {
                    cVar2 = null;
                }
                if (i22 != 0) {
                    i33 = 0;
                } else {
                    i33 = i11;
                }
                if (i25 != 0) {
                    z18 = true;
                } else {
                    z18 = z13;
                }
                if (i27 != 0) {
                    objQ = sVar2.Q();
                    if (objQ == gVar) {
                        objQ = new bp.h1(19);
                        sVar2.o0(objQ);
                    }
                    eVar3 = (fz.e) objQ;
                } else {
                    eVar3 = eVar;
                }
                i34 = i33;
            }
            sVar2.q();
            zF = sVar2.f(optionWords);
            objQ2 = sVar2.Q();
            if (zF) {
                objQ2 = new x1.s();
                sVar2.o0(objQ2);
            } else {
                objQ2 = new x1.s();
                sVar2.o0(objQ2);
            }
            sVar = (x1.s) objQ2;
            list = ry.r.f50854a;
            if (z18) {
                mVar = sVar.f55711d;
                if (mVar.f55700a.isEmpty()) {
                    list = list;
                } else {
                    List listS7 = ry.m.S0(mVar, new b4.e(1));
                    arrayList = new ArrayList();
                    it = listS7.iterator();
                    while (it.hasNext()) {
                        h8Var = (h8) it.next();
                        Iterator it11 = it;
                        h8Var2 = (h8) ry.m.A0(arrayList);
                        fz.e eVar13 = eVar3;
                        if (h8Var2 != null) {
                            i36 = h8Var2.f5501a;
                            rVar4 = rVar2;
                            if (Math.abs(h8Var.f5501a - i36) > 8) {
                                arrayList.set(ns.o.A(arrayList), new h8(i36, Math.max(h8Var2.f5502b, h8Var.f5502b)));
                            }
                            it = it11;
                            eVar3 = eVar13;
                            rVar2 = rVar4;
                        } else {
                            rVar4 = rVar2;
                        }
                        arrayList.add(h8Var);
                        it = it11;
                        eVar3 = eVar13;
                        rVar2 = rVar4;
                    }
                    list = arrayList;
                }
                eVar4 = eVar3;
                z1.r rVar19 = rVar2;
                size = list.size();
                if (z18 != 0) {
                    i35 = 0;
                } else {
                    i35 = 0;
                }
                f2.c cVar18 = cVar2;
                Object[] objArr15 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar18, Integer.valueOf(i34)};
                if ((i29 & 234881024) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
                objQ3 = sVar2.Q();
                if (zD) {
                    boolean z2111116 = z18;
                    objQ3 = new r4(z2111116, eVar4, size, i35, null);
                    z20 = z2111116;
                    eVar5 = eVar4;
                    sVar2.o0(objQ3);
                } else {
                    boolean z2111117 = z18;
                    objQ3 = new r4(z2111117, eVar4, size, i35, null);
                    z20 = z2111117;
                    eVar5 = eVar4;
                    sVar2.o0(objQ3);
                }
                l1.t.i(objArr15, (fz.e) objQ3, sVar2);
                boolean z2111118 = z20;
                boolean z2111119 = z14;
                l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar19, optionWords, z2111118, sVar, z11, z2111119, b1VarB, onClickOption), sVar2), sVar2, 56);
                z16 = z2111118;
                rVar3 = rVar19;
                z17 = z2111119;
                b1Var2 = b1VarB;
                i31 = i34;
                cVar3 = cVar18;
                eVar2 = eVar5;
            }
            eVar4 = eVar3;
            z1.r rVar110 = rVar2;
            size = list.size();
            if (z18 != 0) {
                i35 = 0;
            } else {
                i35 = 0;
            }
            f2.c cVar19 = cVar2;
            Object[] objArr16 = {Boolean.valueOf(z18), Integer.valueOf(size), Integer.valueOf(i35), Integer.valueOf(optionWords.size()), cVar19, Integer.valueOf(i34)};
            if ((i29 & 234881024) == 67108864) {
                z19 = true;
            } else {
                z19 = false;
            }
            zD = z19 | ((i29 & 1879048192) == 536870912) | sVar2.d(size) | sVar2.d(i35);
            objQ3 = sVar2.Q();
            if (zD) {
                boolean z21111110 = z18;
                objQ3 = new r4(z21111110, eVar4, size, i35, null);
                z20 = z21111110;
                eVar5 = eVar4;
                sVar2.o0(objQ3);
            } else {
                boolean z21111111 = z18;
                objQ3 = new r4(z21111111, eVar4, size, i35, null);
                z20 = z21111111;
                eVar5 = eVar4;
                sVar2.o0(objQ3);
            }
            l1.t.i(objArr16, (fz.e) objQ3, sVar2);
            boolean z21111112 = z20;
            boolean z21111113 = z14;
            l1.t.a(z2.g1.f58552n.a(v3.m.Ltr), t1.e.d(-555864933, new k4(currentTextStyle, rVar110, optionWords, z21111112, sVar, z11, z21111113, b1VarB, onClickOption), sVar2), sVar2, 56);
            z16 = z21111112;
            rVar3 = rVar110;
            z17 = z21111113;
            b1Var2 = b1VarB;
            i31 = i34;
            cVar3 = cVar19;
            eVar2 = eVar5;
        } else {
            sVar2.W();
            z16 = z13;
            rVar3 = rVar2;
            b1Var2 = b1VarB;
            z17 = z14;
            i31 = i11;
            eVar2 = eVar;
            cVar3 = cVar2;
        }
        x1VarT = sVar2.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e() { // from class: bt.l4
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(i12 | 1);
                    int iM2 = l1.t.M(i13);
                    b.y(optionWords, currentTextStyle, z11, rVar3, b1Var2, z17, cVar3, i31, z16, eVar2, onClickOption, (l1.n) obj, iM, iM2, i14);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    public static final void z(ot.n data, ht.o courseTestParams, ys.d0 d0Var, l1.n nVar, int i11) {
        Object a4Var;
        int i12;
        ht.o oVar;
        ys.d0 d0Var2;
        jt.s0 s0Var;
        kotlin.jvm.internal.m.f(data, "data");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        long j11 = courseTestParams.f33756d;
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1270227926);
        int i13 = i11 | (sVar.h(data) ? 4 : 2) | (sVar.f(courseTestParams) ? 32 : 16) | (sVar.f(d0Var) ? 256 : 128);
        if (sVar.T(i13 & 1, (i13 & 147) != 146)) {
            jt.s0 s0VarD = jt.w0.d(data.f45907a, data.f45908b, data.f45909c, Long.valueOf(j11), sVar, 221184, 65472);
            boolean zE = sVar.e(j11);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zE || objQ == gVar) {
                objQ = l1.t.B(0L);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            CourseSentence courseSentence = data.f45907a;
            String strE0 = ub.a.e0(sVar, R.string.sentence_m5_hint);
            boolean z11 = ((Boolean) sVar.j(ju.f.f37372f)).booleanValue() && !courseTestParams.f33762j;
            t1.d dVarD = t1.e.d(-1605580894, new w3(s0VarD, courseTestParams, b1Var, d0Var, data), sVar);
            t1.d dVarD2 = t1.e.d(-95559069, new w3(3, courseTestParams, s0VarD, b1Var, data, d0Var), sVar);
            int i14 = i13 & 896;
            boolean z12 = i14 == 256;
            Object objQ2 = sVar.Q();
            if (z12 || objQ2 == gVar) {
                objQ2 = new l(d0Var, 26);
                sVar.o0(objQ2);
            }
            fz.a aVar = (fz.a) objQ2;
            int i15 = i13 & 112;
            boolean zF = (i15 == 32) | sVar.f(b1Var) | (i14 == 256) | sVar.h(s0VarD);
            Object objQ3 = sVar.Q();
            if (zF || objQ3 == gVar) {
                i12 = i14;
                a4Var = new a4(courseTestParams, b1Var, d0Var, s0VarD, 1);
                oVar = courseTestParams;
                d0Var2 = d0Var;
                s0Var = s0VarD;
                sVar.o0(a4Var);
            } else {
                i12 = i14;
                a4Var = objQ3;
                s0Var = s0VarD;
                d0Var2 = d0Var;
                oVar = courseTestParams;
            }
            fz.e eVar = (fz.e) a4Var;
            boolean z13 = i12 == 256;
            Object objQ4 = sVar.Q();
            if (z13 || objQ4 == gVar) {
                objQ4 = new v(d0Var2, 6);
                sVar.o0(objQ4);
            }
            fz.c cVar = (fz.c) objQ4;
            boolean z14 = i12 == 256;
            Object objQ5 = sVar.Q();
            if (z14 || objQ5 == gVar) {
                objQ5 = new l(d0Var2, 27);
                sVar.o0(objQ5);
            }
            fz.a aVar2 = (fz.a) objQ5;
            boolean z15 = i12 == 256;
            Object objQ6 = sVar.Q();
            if (z15 || objQ6 == gVar) {
                objQ6 = new l(d0Var2, 28);
                sVar.o0(objQ6);
            }
            fz.a aVar3 = (fz.a) objQ6;
            boolean z16 = (i12 == 256) | (i15 == 32);
            Object objQ7 = sVar.Q();
            if (z16 || objQ7 == gVar) {
                objQ7 = new k(d0Var2, oVar, 4);
                sVar.o0(objQ7);
            }
            fz.a aVar4 = (fz.a) objQ7;
            boolean z17 = (i12 == 256) | (i15 == 32);
            Object objQ8 = sVar.Q();
            if (z17 || objQ8 == gVar) {
                objQ8 = new e0(d0Var2, oVar, 8);
                sVar.o0(objQ8);
            }
            B(courseSentence, s0Var, oVar, strE0, "sent_m5_assemble_by_trans", z11, true, dVarD, dVarD2, aVar, eVar, cVar, aVar2, aVar3, aVar4, (fz.c) objQ8, sVar, ((i13 << 3) & 896) | 114843648, 0);
            sVar = sVar;
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new b4(data, courseTestParams, d0Var, i11, 1);
        }
    }

    public static final void P(final f8 displayType, final boolean z11, final List options, final boolean z12, final long j11, final fz.c cVar, final fz.c onPlayingAudio, l1.n nVar, final int i11) {
        kotlin.jvm.internal.m.f(displayType, "displayType");
        kotlin.jvm.internal.m.f(options, "options");
        kotlin.jvm.internal.m.f(cVar, ypOOxsaJG.RWyXEgV);
        kotlin.jvm.internal.m.f(onPlayingAudio, "onPlayingAudio");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(1228820601);
        int i12 = i11 | (sVar.g(z11) ? 32 : 16) | (sVar.h(options) ? 256 : 128) | (sVar.g(z12) ? 2048 : 1024) | (sVar.e(j11) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar.h(cVar) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar.h(onPlayingAudio) ? 1048576 : 524288);
        if (sVar.T(i12 & 1, (599187 & i12) != 599186)) {
            sVar.Y();
            if ((i11 & 1) != 0 && !sVar.C()) {
                sVar.W();
            }
            sVar.q();
            dt.g4.a(options, t1.e.d(206311856, new fz.g() { // from class: bt.s6
                @Override // fz.g
                public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
                    long jC;
                    long jT;
                    long jW;
                    j0.b2 CourseTestLargeOptionsColumn = (j0.b2) obj;
                    final CourseWord option = (CourseWord) obj2;
                    l1.n nVar2 = (l1.n) obj3;
                    ((Integer) obj4).getClass();
                    kotlin.jvm.internal.m.f(CourseTestLargeOptionsColumn, "$this$CourseTestLargeOptionsColumn");
                    kotlin.jvm.internal.m.f(option, "option");
                    OptionItemSelectedState selectedState = option.getSelectedState();
                    int[] iArr = y6.f6227a;
                    int i13 = iArr[selectedState.ordinal()];
                    if (i13 == 1) {
                        l1.s sVar2 = (l1.s) nVar2;
                        sVar2.d0(1264785744);
                        jC = ((h1.s1) sVar2.j(h1.v1.f31180a)).f31033p;
                        sVar2.p(false);
                    } else if (i13 == 2) {
                        l1.s sVar3 = (l1.s) nVar2;
                        sVar3.d0(1264788953);
                        jC = g2.x.c(((h1.s1) sVar3.j(h1.v1.f31180a)).f31021c, 0.5f);
                        sVar3.p(false);
                    } else if (i13 == 3) {
                        l1.s sVar4 = (l1.s) nVar2;
                        sVar4.d0(1264793529);
                        jC = g2.x.c(ob.f.x((h1.s1) sVar4.j(h1.v1.f31180a), sVar4), 0.5f);
                        sVar4.p(false);
                    } else {
                        if (i13 != 4) {
                            throw nv.p.x((l1.s) nVar2, 1264782983, false);
                        }
                        l1.s sVar5 = (l1.s) nVar2;
                        sVar5.d0(1264797977);
                        jC = g2.x.c(ob.f.z((h1.s1) sVar5.j(h1.v1.f31180a), sVar5), 0.5f);
                        sVar5.p(false);
                    }
                    l1.b3 b3VarA = a0.t1.a(jC, null, "backgroundColor", nVar2, 384, 10);
                    int i14 = iArr[option.getSelectedState().ordinal()];
                    if (i14 == 1) {
                        l1.s sVar6 = (l1.s) nVar2;
                        sVar6.d0(1264806258);
                        jT = ((h1.s1) sVar6.j(h1.v1.f31180a)).f31034q;
                        sVar6.p(false);
                    } else if (i14 == 2) {
                        l1.s sVar7 = (l1.s) nVar2;
                        sVar7.d0(1264808955);
                        jT = ((h1.s1) sVar7.j(h1.v1.f31180a)).f31022d;
                        sVar7.p(false);
                    } else if (i14 == 3) {
                        l1.s sVar8 = (l1.s) nVar2;
                        sVar8.d0(1264811903);
                        jT = ob.f.t((h1.s1) sVar8.j(h1.v1.f31180a), sVar8);
                        sVar8.p(false);
                    } else {
                        if (i14 != 4) {
                            throw nv.p.x((l1.s) nVar2, 1264803356, false);
                        }
                        l1.s sVar9 = (l1.s) nVar2;
                        sVar9.d0(1264814909);
                        jT = ob.f.u((h1.s1) sVar9.j(h1.v1.f31180a), sVar9);
                        sVar9.p(false);
                    }
                    l1.b3 b3VarA2 = a0.t1.a(jT, null, "textColor", nVar2, 384, 10);
                    final long j12 = ((g2.x) b3VarA.getValue()).f28624a;
                    final long j13 = ((g2.x) b3VarA2.getValue()).f28624a;
                    int i15 = iArr[option.getSelectedState().ordinal()];
                    if (i15 == 1) {
                        l1.s sVar10 = (l1.s) nVar2;
                        sVar10.d0(-1223363009);
                        jW = ((h1.s1) sVar10.j(h1.v1.f31180a)).A;
                        sVar10.p(false);
                    } else if (i15 == 2) {
                        l1.s sVar11 = (l1.s) nVar2;
                        sVar11.d0(-1223360385);
                        jW = ((h1.s1) sVar11.j(h1.v1.f31180a)).f31017a;
                        sVar11.p(false);
                    } else if (i15 == 3) {
                        l1.s sVar12 = (l1.s) nVar2;
                        sVar12.d0(-1223357789);
                        jW = ob.f.w((h1.s1) sVar12.j(h1.v1.f31180a), sVar12);
                        sVar12.p(false);
                    } else {
                        if (i15 != 4) {
                            throw nv.p.x((l1.s) nVar2, -1223365944, false);
                        }
                        l1.s sVar13 = (l1.s) nVar2;
                        sVar13.d0(-1223355135);
                        jW = ob.f.y((h1.s1) sVar13.j(h1.v1.f31180a), sVar13);
                        sVar13.p(false);
                    }
                    long j14 = ((g2.x) a0.t1.a(jW, null, "borderColor", nVar2, 384, 10).getValue()).f28624a;
                    z1.r rVarA = CourseTestLargeOptionsColumn.a(z1.o.f58481a, 1.0f);
                    f8 f8Var = f8.PIC;
                    final f8 f8Var2 = displayType;
                    z1.r rVarJ = j0.c.j(rVarA, f8Var2 == f8Var ? 1.0f : 0.8433735f);
                    float f5 = 14;
                    z1.r rVarB = d2.h.b(rVarJ, r0.f.d(f5));
                    l1.s sVar14 = (l1.s) nVar2;
                    fz.c cVar2 = cVar;
                    boolean zF = sVar14.f(cVar2) | sVar14.h(option);
                    Object objQ = sVar14.Q();
                    if (zF || objQ == l1.m.f39353a) {
                        objQ = new s0(cVar2, option, 9);
                        sVar14.o0(objQ);
                    }
                    z1.r rVarQ = iu.k.q(0, 6, (fz.a) objQ, sVar14, rVarB, z11);
                    r0.e eVarD = r0.f.d(f5);
                    h1.t0 t0VarP = h1.k7.p(g2.x.f28621h, sVar14, 6);
                    d0.v vVarA = d0.n.a(j14, 2);
                    final boolean z13 = z12;
                    final long j15 = j11;
                    final fz.c cVar3 = onPlayingAudio;
                    h1.k7.d(rVarQ, eVarD, t0VarP, null, vVarA, t1.e.d(1886568958, new fz.f() { // from class: bt.v6
                        @Override // fz.f
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            boolean zBooleanValue;
                            y2.h hVar;
                            y2.h hVar2;
                            y2.i iVar;
                            y2.h hVar3;
                            l1.g gVar;
                            boolean z14;
                            j0.r rVar;
                            int i16;
                            boolean z15;
                            boolean z16;
                            boolean z17;
                            j0.v Card = (j0.v) obj5;
                            l1.n nVar3 = (l1.n) obj6;
                            int iIntValue = ((Integer) obj7).intValue();
                            kotlin.jvm.internal.m.f(Card, "$this$Card");
                            l1.s sVar15 = (l1.s) nVar3;
                            if (sVar15.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                                z1.o oVar = z1.o.f58481a;
                                z1.r rVarD = j0.e2.d(oVar, 1.0f);
                                z1.j jVar = z1.c.f58463a;
                                w2.q0 q0VarD = j0.o.d(jVar, false);
                                int iHashCode = Long.hashCode(sVar15.T);
                                l1.q1 q1VarL = sVar15.l();
                                z1.r rVarC = z1.a.c(sVar15, rVarD);
                                y2.k.J.getClass();
                                y2.i iVar2 = y2.j.f56913b;
                                sVar15.h0();
                                if (sVar15.S) {
                                    sVar15.k(iVar2);
                                } else {
                                    sVar15.r0();
                                }
                                y2.h hVar4 = y2.j.f56917f;
                                l1.t.J(hVar4, q0VarD, sVar15);
                                y2.h hVar5 = y2.j.f56916e;
                                l1.t.J(hVar5, q1VarL, sVar15);
                                y2.h hVar6 = y2.j.f56918g;
                                if (sVar15.S || !kotlin.jvm.internal.m.a(sVar15.Q(), Integer.valueOf(iHashCode))) {
                                    defpackage.e.A(iHashCode, sVar15, iHashCode, hVar6);
                                }
                                y2.h hVar7 = y2.j.f56915d;
                                l1.t.J(hVar7, rVarC, sVar15);
                                sVar15.d0(-301609219);
                                z1.h hVar8 = z1.c.P;
                                j0.u uVarA = j0.t.a(j0.i.f35305c, hVar8, sVar15, 48);
                                int iHashCode2 = Long.hashCode(sVar15.T);
                                l1.q1 q1VarL2 = sVar15.l();
                                z1.r rVarC2 = z1.a.c(sVar15, oVar);
                                sVar15.h0();
                                if (sVar15.S) {
                                    sVar15.k(iVar2);
                                } else {
                                    sVar15.r0();
                                }
                                l1.t.J(hVar4, uVarA, sVar15);
                                l1.t.J(hVar5, q1VarL2, sVar15);
                                if (sVar15.S || !kotlin.jvm.internal.m.a(sVar15.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar15, iHashCode2, hVar6);
                                }
                                l1.t.J(hVar7, rVarC2, sVar15);
                                sVar15.d0(-1357182905);
                                if (1.0f <= 0.0d) {
                                    k0.a.a("invalid weight; must be greater than zero");
                                }
                                z1.r rVarE = j0.e2.e(new j0.i1(1.0f, true), 1.0f);
                                w2.q0 q0VarD2 = j0.o.d(jVar, false);
                                int iHashCode3 = Long.hashCode(sVar15.T);
                                l1.q1 q1VarL3 = sVar15.l();
                                z1.r rVarC3 = z1.a.c(sVar15, rVarE);
                                sVar15.h0();
                                if (sVar15.S) {
                                    sVar15.k(iVar2);
                                } else {
                                    sVar15.r0();
                                }
                                l1.t.J(hVar4, q0VarD2, sVar15);
                                l1.t.J(hVar5, q1VarL3, sVar15);
                                if (sVar15.S || !kotlin.jvm.internal.m.a(sVar15.Q(), Integer.valueOf(iHashCode3))) {
                                    defpackage.e.A(iHashCode3, sVar15, iHashCode3, hVar6);
                                }
                                l1.t.J(hVar7, rVarC3, sVar15);
                                CourseWord courseWord = option;
                                String string = courseWord.getAnimationUri().toString();
                                kotlin.jvm.internal.m.e(string, "toString(...)");
                                if (string.length() > 0) {
                                    sVar15.d0(349103619);
                                    zBooleanValue = ((Boolean) sVar15.j(ju.f.f37373g)).booleanValue();
                                    sVar15.p(false);
                                } else {
                                    sVar15.d0(-2062688462);
                                    sVar15.p(false);
                                    zBooleanValue = false;
                                }
                                l1.g gVar2 = l1.m.f39353a;
                                if (zBooleanValue) {
                                    sVar15.d0(-2062631200);
                                    String string2 = courseWord.getAnimationUri().toString();
                                    kotlin.jvm.internal.m.e(string2, "toString(...)");
                                    ad.p pVarL = gb.r.L(new ad.q(string2), sVar15);
                                    ad.i iVarE = ff.h.e((wc.h) pVarL.getValue(), courseWord.getSelectedState() == OptionItemSelectedState.SELECTED, CropImageView.DEFAULT_ASPECT_RATIO, sVar15, 1020);
                                    wc.h hVar9 = (wc.h) pVarL.getValue();
                                    boolean zF2 = sVar15.f(iVarE);
                                    Object objQ2 = sVar15.Q();
                                    if (zF2 || objQ2 == gVar2) {
                                        objQ2 = new w6(iVarE, 0);
                                        sVar15.o0(objQ2);
                                    }
                                    hVar = hVar7;
                                    hVar2 = hVar6;
                                    hVar3 = hVar4;
                                    gVar = gVar2;
                                    iVar = iVar2;
                                    fr.j3.a(hVar9, (fz.a) objQ2, j0.e2.d(oVar, 1.0f), null, null, null, sVar15, 384, 0, 131064);
                                    z14 = false;
                                    sVar15.p(false);
                                } else {
                                    hVar = hVar7;
                                    hVar2 = hVar6;
                                    iVar = iVar2;
                                    hVar3 = hVar4;
                                    gVar = gVar2;
                                    z14 = false;
                                    sVar15.d0(-2061842033);
                                    wb.k.c(courseWord.getImageUri(), j0.e2.d(oVar, 1.0f), null, sVar15, 432, 4088);
                                    sVar15.p(false);
                                }
                                sVar15.p(true);
                                f8 f8Var3 = f8.PIC;
                                f8 f8Var4 = f8Var2;
                                if (f8Var4 == f8Var3) {
                                    sVar15.p(z14);
                                } else {
                                    b.d0(f8Var4, courseWord, ((h1.s1) sVar15.j(h1.v1.f31180a)).f31034q, courseWord.getSelectedState() != OptionItemSelectedState.DEFAULT ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f, false, sVar15, 0);
                                    sVar15.p(false);
                                }
                                sVar15.p(true);
                                boolean z18 = z13;
                                j0.r rVar2 = j0.r.f35391a;
                                if (z18) {
                                    sVar15.d0(-299636876);
                                    boolean z19 = j15 == courseWord.getWordId();
                                    long j16 = ((h1.s1) sVar15.j(h1.v1.f31180a)).f31017a;
                                    z1.r rVarA2 = rVar2.a(j0.e2.n(j0.c.A(oVar, 8), 24), z1.c.f58465c);
                                    fz.c cVar4 = cVar3;
                                    boolean zF3 = sVar15.f(cVar4) | sVar15.h(courseWord);
                                    boolean z20 = z19;
                                    Object objQ3 = sVar15.Q();
                                    if (zF3 || objQ3 == gVar) {
                                        objQ3 = new s0(cVar4, courseWord, 10);
                                        sVar15.o0(objQ3);
                                    }
                                    rVar = rVar2;
                                    i16 = -314033462;
                                    dt.a0.a(z20, rVarA2, j16, (fz.a) objQ3, sVar15, 0, 0);
                                    sVar15 = sVar15;
                                    z15 = false;
                                } else {
                                    rVar = rVar2;
                                    i16 = -314033462;
                                    z15 = false;
                                    sVar15.d0(-314033462);
                                }
                                sVar15.p(z15);
                                if (f8Var4 == f8Var3) {
                                    sVar15.p(z15);
                                    z16 = true;
                                } else {
                                    if (courseWord.getSelectedState() != OptionItemSelectedState.DEFAULT) {
                                        sVar15.d0(-298964548);
                                        z1.r rVarA3 = rVar.a(d0.n.h(j0.e2.i(j0.e2.e(oVar, 1.0f), 50, CropImageView.DEFAULT_ASPECT_RATIO, 2), j12, g2.f0.f28556b), z1.c.H);
                                        j0.u uVarA2 = j0.t.a(j0.i.f35307e, hVar8, sVar15, 54);
                                        int iHashCode4 = Long.hashCode(sVar15.T);
                                        l1.q1 q1VarL4 = sVar15.l();
                                        z1.r rVarC4 = z1.a.c(sVar15, rVarA3);
                                        sVar15.h0();
                                        if (sVar15.S) {
                                            sVar15.k(iVar);
                                        } else {
                                            sVar15.r0();
                                        }
                                        l1.t.J(hVar3, uVarA2, sVar15);
                                        l1.t.J(hVar5, q1VarL4, sVar15);
                                        if (sVar15.S || !kotlin.jvm.internal.m.a(sVar15.Q(), Integer.valueOf(iHashCode4))) {
                                            defpackage.e.A(iHashCode4, sVar15, iHashCode4, hVar2);
                                        }
                                        l1.t.J(hVar, rVarC4, sVar15);
                                        b.d0(f8Var4, courseWord, j13, 1.0f, false, sVar15, 3072);
                                        z16 = true;
                                        sVar15.p(true);
                                        z17 = false;
                                    } else {
                                        z16 = true;
                                        z17 = false;
                                        sVar15.d0(i16);
                                    }
                                    sVar15.p(z17);
                                    sVar15.p(z17);
                                }
                                sVar15.p(z16);
                            } else {
                                sVar15.W();
                            }
                            return qy.b0.f48488a;
                        }
                    }, sVar14), sVar14, 196608, 8);
                    return qy.b0.f48488a;
                }
            }, sVar), sVar, ((i12 >> 6) & 14) | 48);
        } else {
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new fz.e(z11, options, z12, j11, cVar, onPlayingAudio, i11) { // from class: bt.u6

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ boolean f6073b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ List f6074c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ boolean f6075d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f6076e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public final /* synthetic */ fz.c f6077f;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ fz.c f6078t;

                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM = l1.t.M(7);
                    b.P(this.f6072a, this.f6073b, this.f6074c, this.f6075d, this.f6076e, this.f6077f, this.f6078t, (l1.n) obj, iM);
                    return qy.b0.f48488a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:214:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:85:0x0207  */
    public static final void b0(final jt.m1 state, final ht.o courseTestParams, fz.a getComboCount, final fz.e onClickPlayAudio, final fz.a onStopPlayAudio, fz.c onClickChecked, fz.a aVar, fz.a onClickContinue, final fz.a getAudioTime, fz.a onClickSkipListen, fz.c onClickBugReport, l1.n nVar, int i11) {
        l1.s sVar;
        boolean z11;
        l1.s sVar2;
        int i12;
        l1.i1 i1Var;
        l1.g gVar;
        l1.b1 b1Var;
        ht.o oVar;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        String str;
        ht.r rVar;
        l1.s sVar3;
        Object l7Var;
        l1.i1 i1Var2;
        boolean z14;
        kotlin.jvm.internal.m.f(state, "state");
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        ht.r rVar2 = courseTestParams.f33770s;
        kotlin.jvm.internal.m.f(getComboCount, "getComboCount");
        kotlin.jvm.internal.m.f(onClickPlayAudio, "onClickPlayAudio");
        kotlin.jvm.internal.m.f(onStopPlayAudio, "onStopPlayAudio");
        kotlin.jvm.internal.m.f(onClickChecked, "onClickChecked");
        kotlin.jvm.internal.m.f(onClickContinue, "onClickContinue");
        kotlin.jvm.internal.m.f(getAudioTime, "getAudioTime");
        kotlin.jvm.internal.m.f(onClickSkipListen, "onClickSkipListen");
        kotlin.jvm.internal.m.f(onClickBugReport, "onClickBugReport");
        l1.s sVar4 = (l1.s) nVar;
        sVar4.f0(724593824);
        int i15 = i11 | (sVar4.h(state) ? 4 : 2) | (sVar4.f(courseTestParams) ? 32 : 16) | (sVar4.h(getComboCount) ? 256 : 128) | (sVar4.h(onClickPlayAudio) ? 2048 : 1024) | (sVar4.h(onStopPlayAudio) ? 16384 : OSSConstants.DEFAULT_BUFFER_SIZE) | (sVar4.h(onClickChecked) ? OSSConstants.DEFAULT_STREAM_BUFFER_SIZE : 65536) | (sVar4.h(aVar) ? 1048576 : 524288) | (sVar4.h(onClickContinue) ? 8388608 : 4194304) | (sVar4.h(getAudioTime) ? 67108864 : 33554432) | (sVar4.h(onClickSkipListen) ? 536870912 : 268435456);
        int i16 = sVar4.h(onClickBugReport) ? 4 : 2;
        if (sVar4.T(i15 & 1, ((306783379 & i15) == 306783378 && (i16 & 3) == 2) ? false : true)) {
            sVar4.Y();
            if ((i11 & 1) != 0 && !sVar4.C()) {
                sVar4.W();
            }
            sVar4.q();
            Boolean bool = (Boolean) sVar4.j(ju.f.f37372f);
            final boolean zBooleanValue = bool.booleanValue();
            Object objQ = sVar4.Q();
            l1.g gVar2 = l1.m.f39353a;
            if (objQ == gVar2) {
                objQ = l1.t.q(sVar4);
                sVar4.o0(objQ);
            }
            final rz.b0 b0Var = (rz.b0) objQ;
            final e2.l lVar = (e2.l) sVar4.j(z2.g1.f58548i);
            final CourseWord courseWord = (CourseWord) state.f37048a;
            final l1.b1 b1Var2 = state.f37055h;
            l1.b1 b1Var3 = state.f37056i;
            l1.b1 b1Var4 = state.f37050c;
            boolean z15 = state.f37052e;
            l1.b1 b1Var5 = state.f37053f;
            final l1.b1 b1Var6 = state.f37061o;
            WeakHashMap weakHashMap = j0.o2.f35353v;
            j0.a aVar2 = j0.b.e(sVar4).f35356c;
            l1.c3 c3Var = z2.g1.f58547h;
            boolean z16 = aVar2.e().f48796d > 0;
            final x1.p pVar = state.f37058k;
            x1.p pVar2 = state.f37059l;
            l1.b1 b1Var7 = state.f37060n;
            final boolean z17 = state.f37054g;
            l1.b1 b1Var8 = state.f37051d;
            l1.b1 b1Var9 = state.f37068v;
            final l1.b1 b1Var10 = state.f37062p;
            boolean z18 = z16;
            int iIntValue = ((Number) sVar4.j(ju.f.f37370d)).intValue();
            boolean zF = sVar4.f(courseWord) | sVar4.g(((Boolean) b1Var6.getValue()).booleanValue());
            Object objQ2 = sVar4.Q();
            if (zF || objQ2 == gVar2) {
                objQ2 = defpackage.e.v(0, sVar4);
            }
            final l1.a1 a1Var = (l1.a1) objQ2;
            if (((Boolean) b1Var6.getValue()).booleanValue() && z18) {
                l1.h1 h1Var = (l1.h1) a1Var;
                if (h1Var.l() > 0) {
                    sVar4.d0(550018367);
                    boolean z19 = v3.f.a(((v3.c) sVar4.j(c3Var)).Q(h1Var.l()), d3.f5309a) < 0;
                    sVar4.p(false);
                    z11 = z19;
                } else {
                    sVar4.d0(-129298570);
                    sVar4.p(false);
                    z11 = false;
                }
            } else {
                sVar4.d0(-129298570);
                sVar4.p(false);
                z11 = false;
            }
            boolean zE = sVar4.e(courseTestParams.f33756d);
            Object objQ3 = sVar4.Q();
            if (zE || objQ3 == gVar2) {
                objQ3 = new l1.i1(0L);
                sVar4.o0(objQ3);
            }
            l1.i1 i1Var3 = (l1.i1) objQ3;
            Object[] objArr = {courseWord, Boolean.valueOf(courseTestParams.f33762j), b1Var6.getValue(), bool};
            int i17 = i15 & 112;
            boolean zH = sVar4.h(courseWord) | (i17 == 32) | sVar4.g(zBooleanValue) | sVar4.f(b1Var3) | sVar4.f(i1Var3);
            int i18 = i15 & 7168;
            boolean z20 = zH | (i18 == 2048);
            Object objQ4 = sVar4.Q();
            if (z20 || objQ4 == gVar2) {
                sVar2 = sVar4;
                i12 = 2;
                i1Var = i1Var3;
                gVar = gVar2;
                o7 o7Var = new o7(courseWord, courseTestParams, zBooleanValue, b1Var3, i1Var, onClickPlayAudio, null);
                b1Var = b1Var3;
                oVar = courseTestParams;
                sVar2.o0(o7Var);
                objQ4 = o7Var;
            } else {
                oVar = courseTestParams;
                sVar2 = sVar4;
                i12 = 2;
                i1Var = i1Var3;
                gVar = gVar2;
                b1Var = b1Var3;
            }
            l1.t.i(objArr, (fz.e) objQ4, sVar2);
            int i19 = ((ct.b) sVar2.j(ct.c.f22476a)).f22473h;
            boolean zF2 = sVar2.f(courseWord.getWord()) | sVar2.d(i19) | sVar2.d(r38) | sVar2.d(r23.ordinal()) | sVar2.f(courseWord.getZhuYin());
            Object objQ5 = sVar2.Q();
            if (zF2 || objQ5 == gVar) {
                int i21 = p7.f5851a[r23.ordinal()];
                if (i21 != 1) {
                    z12 = i21 == i12;
                } else {
                    String word = courseWord.getWord();
                    String zhuYin = courseWord.getZhuYin();
                    kotlin.jvm.internal.m.f(word, PQgum.cFVcu);
                    kotlin.jvm.internal.m.f(zhuYin, "zhuYin");
                    if (r23 == ht.r.M9) {
                        if (!ns.o.J(r23, i19, r38)) {
                            if (ry.l.D(new Integer[]{12, 1}, Integer.valueOf(iIntValue))) {
                                String strK0 = k0(word);
                                String strK1 = k0(zhuYin);
                                if (strK0.length() <= 0 || !strK0.equals(strK1)) {
                                }
                            }
                        }
                    }
                }
                objQ5 = Boolean.valueOf(z12);
                sVar2.o0(objQ5);
            }
            final boolean zBooleanValue2 = ((Boolean) objQ5).booleanValue();
            if (courseWord.getSoundChangePronunciation().length() > 0) {
                i13 = -127011261;
                i14 = R.string.type_the_pronunciation;
                z13 = false;
            } else {
                z13 = false;
                if (oVar.f33755c == 5) {
                    i13 = -126906233;
                    i14 = R.string.type_what_you_hear;
                } else {
                    i13 = -126841939;
                    i14 = R.string.word_m5_hint;
                }
            }
            String strM = ep.a.m(sVar2, i13, i14, sVar2, z13);
            int i22 = p7.f5851a[r23.ordinal()];
            if (i22 == 1 || i22 == i12) {
                str = "vocab_m9_spell_word_by_trans";
            } else {
                if (i22 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "vocab_m5_spell_word_by_audio";
            }
            ns.z zVarJ = b1Var2.getValue() == ht.q.WRONG ? se.k.j(oVar, str, courseWord.getTranslation(), oz.q.i1(courseWord.getZhuYin() + "\n" + courseWord.getWord()).toString(), !oz.q.K0((CharSequence) b1Var10.getValue()) ? (String) b1Var10.getValue() : se.k.t(pVar)) : null;
            ht.q qVar = (ht.q) b1Var2.getValue();
            boolean z21 = !((Boolean) state.f37065s.getValue()).booleanValue();
            boolean z22 = (oVar.f33753a != 0 || oVar.f33757e) ? z13 : true;
            boolean z23 = !((Boolean) b1Var6.getValue()).booleanValue();
            float f5 = ((Boolean) b1Var6.getValue()).booleanValue() ? CropImageView.DEFAULT_ASPECT_RATIO : 1.0f;
            String translation = zBooleanValue2 ? courseWord.getTranslation() : BuildConfig.VERSION_NAME;
            ns.s sVar5 = (ns.s) state.f37066t.getValue();
            boolean zH2 = sVar2.h(state);
            Object objQ6 = sVar2.Q();
            if (zH2 || objQ6 == gVar) {
                rVar = r23;
                sVar3 = sVar2;
                y2 y2Var = new y2(0, state, jt.m1.class, "onRetry", "onRetry()V", 0, 2);
                sVar3.o0(y2Var);
                objQ6 = y2Var;
            } else {
                rVar = rVar2;
                sVar3 = sVar2;
            }
            mz.e eVar = (mz.e) objQ6;
            ht.l lVar2 = (ht.l) b1Var.getValue();
            boolean z24 = (oVar.f33768q && rVar == ht.r.M5 && courseWord.getSoundChangePronunciation().length() == 0) ? true : z13;
            final l1.i1 i1Var4 = i1Var;
            t1.d dVarD = t1.e.d(-375844130, new bp.f0(strM, oVar, b1Var, i1Var4, onClickPlayAudio, courseWord, 3), sVar3);
            l1.s sVar6 = sVar3;
            final l1.b1 b1Var11 = b1Var;
            l1.g gVar3 = gVar;
            final boolean z25 = z11;
            t1.d dVarD2 = t1.e.d(-1607136673, new fz.e() { // from class: bt.j7
                /* JADX WARN: Code duplicated, block: B:102:0x045c  */
                /* JADX WARN: Code duplicated, block: B:103:0x0460  */
                /* JADX WARN: Code duplicated, block: B:108:0x047b  */
                /* JADX WARN: Code duplicated, block: B:114:0x0494  */
                /* JADX WARN: Code duplicated, block: B:115:0x0496  */
                /* JADX WARN: Code duplicated, block: B:117:0x0499  */
                /* JADX WARN: Code duplicated, block: B:118:0x050d  */
                /* JADX WARN: Code duplicated, block: B:120:0x0514  */
                /* JADX WARN: Code duplicated, block: B:122:0x051a  */
                /* JADX WARN: Code duplicated, block: B:125:0x0582  */
                /* JADX WARN: Code duplicated, block: B:129:0x05ba  */
                /* JADX WARN: Code duplicated, block: B:130:0x05be  */
                /* JADX WARN: Code duplicated, block: B:137:0x05dd  */
                /* JADX WARN: Code duplicated, block: B:140:0x05ee  */
                /* JADX WARN: Code duplicated, block: B:141:0x05f0  */
                /* JADX WARN: Code duplicated, block: B:144:0x05f6  */
                /* JADX WARN: Code duplicated, block: B:146:0x0651  */
                /* JADX WARN: Code duplicated, block: B:149:0x0666  */
                /* JADX WARN: Code duplicated, block: B:151:0x0677  */
                /* JADX WARN: Code duplicated, block: B:154:0x06d9  */
                /* JADX WARN: Code duplicated, block: B:155:0x06db  */
                /* JADX WARN: Code duplicated, block: B:157:0x06de  */
                /* JADX WARN: Code duplicated, block: B:159:0x0734  */
                /* JADX WARN: Code duplicated, block: B:162:0x0741  */
                /* JADX WARN: Code duplicated, block: B:164:0x074f  */
                /* JADX WARN: Code duplicated, block: B:80:0x0345  */
                /* JADX WARN: Code duplicated, block: B:90:0x03e4  */
                /* JADX WARN: Code duplicated, block: B:92:0x03f7  */
                /* JADX WARN: Code duplicated, block: B:93:0x040f  */
                /* JADX WARN: Code duplicated, block: B:97:0x0429 A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:98:0x042b  */
                /* JADX WARN: Code duplicated, block: B:99:0x042d  */
                @Override // fz.e
                public final Object invoke(Object obj, Object obj2) {
                    y2.i iVar;
                    y2.h hVar;
                    ht.r rVar3;
                    ht.r rVar4;
                    CourseWord courseWord2;
                    l1.i1 i1Var5;
                    ht.r rVar5;
                    y2.h hVar2;
                    int i23;
                    ht.o oVar2;
                    boolean z26;
                    ht.r rVar6;
                    boolean z27;
                    boolean z28;
                    z1.o oVar3;
                    z1.r rVarY;
                    int iHashCode;
                    y2.h hVar3;
                    boolean z29;
                    y2.h hVar4;
                    j7 j7Var;
                    boolean z30;
                    int iHashCode2;
                    boolean z31;
                    boolean z32;
                    l1.d0 d0Var;
                    ht.o oVar4;
                    long jC;
                    l1.s sVar7;
                    boolean z33;
                    boolean z34;
                    float f11;
                    ht.r rVar7;
                    ht.o oVar5;
                    y2.h hVar5;
                    Object l7Var2;
                    CourseWord courseWord3;
                    ht.o oVar6;
                    boolean z35;
                    int i24;
                    int i25;
                    l1.n nVar2 = (l1.n) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    l1.s sVar8 = (l1.s) nVar2;
                    if (sVar8.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        l1.b1 b1Var12 = b1Var6;
                        boolean zBooleanValue3 = ((Boolean) b1Var12.getValue()).booleanValue();
                        z1.o oVar7 = z1.o.f58481a;
                        ht.o oVar8 = courseTestParams;
                        CourseWord courseWord4 = courseWord;
                        l1.b1 b1Var13 = b1Var11;
                        l1.i1 i1Var6 = i1Var4;
                        fz.e eVar2 = onClickPlayAudio;
                        l1.g gVar4 = l1.m.f39353a;
                        if (zBooleanValue3) {
                            sVar8.d0(2086878135);
                            if (oVar8.f33770s == ht.r.M5 && courseWord4.getSoundChangePronunciation().length() == 0 && !oVar8.f33762j) {
                                sVar8.d0(2087006878);
                                j0.c.g(sVar8, j0.e2.g(oVar7, 12));
                                z1.r rVarN = j0.e2.n(oVar7, 72);
                                boolean z36 = b1Var13.getValue() instanceof ht.c;
                                boolean zF3 = sVar8.f(oVar8) | sVar8.f(i1Var6) | sVar8.f(eVar2) | sVar8.h(courseWord4);
                                Object objQ7 = sVar8.Q();
                                if (zF3 || objQ7 == gVar4) {
                                    i25 = 12;
                                    l7 l7Var3 = new l7(courseWord4, oVar8, i1Var6, eVar2, 2);
                                    sVar8.o0(l7Var3);
                                    objQ7 = l7Var3;
                                } else {
                                    i25 = 12;
                                }
                                i24 = 26;
                                dt.a0.f(rVarN, CropImageView.DEFAULT_ASPECT_RATIO, z36, (fz.a) objQ7, sVar8, 6, 2);
                            } else {
                                i24 = 26;
                                i25 = 12;
                                sVar8.d0(2072206083);
                            }
                            sVar8.p(false);
                            j0.c.g(sVar8, j0.e2.g(oVar7, i25));
                            jt.m1 m1Var = state;
                            String str2 = (String) m1Var.f37062p.getValue();
                            o3.w wVar = (o3.w) m1Var.f37063q.getValue();
                            boolean z37 = z25;
                            float f12 = z37 ? 0.97f : 0.8f;
                            rz.b0 b0Var2 = b0Var;
                            boolean zH3 = sVar8.h(b0Var2) | sVar8.h(m1Var) | sVar8.f(b1Var12);
                            e2.l lVar3 = lVar;
                            boolean zH4 = zH3 | sVar8.h(lVar3);
                            Object objQ8 = sVar8.Q();
                            if (zH4 || objQ8 == gVar4) {
                                objQ8 = new h2(b0Var2, b1Var12, lVar3, m1Var, 2);
                                sVar8.o0(objQ8);
                            }
                            fz.a aVar3 = (fz.a) objQ8;
                            boolean zH5 = sVar8.h(m1Var);
                            Object objQ9 = sVar8.Q();
                            if (zH5 || objQ9 == gVar4) {
                                a3 a3Var = new a3(1, m1Var, jt.m1.class, "onTextChange", "onTextChange(Ljava/lang/String;)V", 0, 7);
                                sVar8.o0(a3Var);
                                objQ9 = a3Var;
                            }
                            fz.c cVar = (fz.c) ((mz.e) objQ9);
                            boolean zH6 = sVar8.h(m1Var);
                            Object objQ10 = sVar8.Q();
                            if (zH6 || objQ10 == gVar4) {
                                a3 a3Var2 = new a3(1, m1Var, jt.m1.class, "onTextFieldValueChange", "onTextFieldValueChange(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0, 8);
                                sVar8.o0(a3Var2);
                                objQ10 = a3Var2;
                            }
                            d3.a(ry.r.f50854a, str2, wVar, f12, z17, aVar3, cVar, (fz.c) ((mz.e) objQ10), sVar8, 6, 0);
                            ep.a.C(oVar7, z37 ? 0 : i24, sVar8, false);
                        } else {
                            sVar8.d0(2088693495);
                            z1.r rVarI = j0.e2.i(j0.e2.e(oVar7, 1.0f), ((v3.c) sVar8.j(z2.g1.f58547h)).Q(((l1.h1) a1Var).l()), CropImageView.DEFAULT_ASPECT_RATIO, 2);
                            z1.h hVar6 = z1.c.P;
                            j0.d dVar = j0.i.f35305c;
                            j0.u uVarA = j0.t.a(dVar, hVar6, sVar8, 54);
                            int iHashCode3 = Long.hashCode(sVar8.T);
                            l1.q1 q1VarL = sVar8.l();
                            z1.r rVarC = z1.a.c(sVar8, rVarI);
                            y2.k.J.getClass();
                            y2.i iVar2 = y2.j.f56913b;
                            sVar8.h0();
                            if (sVar8.S) {
                                sVar8.k(iVar2);
                            } else {
                                sVar8.r0();
                            }
                            y2.h hVar7 = y2.j.f56917f;
                            l1.t.J(hVar7, uVarA, sVar8);
                            y2.h hVar8 = y2.j.f56916e;
                            l1.t.J(hVar8, q1VarL, sVar8);
                            y2.h hVar9 = y2.j.f56918g;
                            if (sVar8.S) {
                                iVar = iVar2;
                            } else {
                                iVar = iVar2;
                                if (!kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode3))) {
                                }
                                hVar = y2.j.f56915d;
                                l1.t.J(hVar, rVarC, sVar8);
                                rVar3 = oVar8.f33770s;
                                boolean z38 = oVar8.f33762j;
                                rVar4 = ht.r.M5;
                                if (rVar3 == rVar4 || courseWord4.getSoundChangePronunciation().length() != 0 || z38) {
                                    courseWord2 = courseWord4;
                                    i1Var5 = i1Var6;
                                    rVar5 = rVar4;
                                    hVar2 = hVar8;
                                    i23 = 915238909;
                                    oVar2 = oVar8;
                                    z26 = false;
                                    sVar8.d0(915238909);
                                } else {
                                    sVar8.d0(932091408);
                                    if (((Boolean) sVar8.j(ju.f.f37373g)).booleanValue()) {
                                        sVar8.d0(932126717);
                                        ht.q qVar2 = (ht.q) b1Var2.getValue();
                                        ht.l lVar4 = (ht.l) b1Var13.getValue();
                                        boolean zF4 = sVar8.f(oVar8) | sVar8.f(i1Var6) | sVar8.f(eVar2) | sVar8.h(courseWord4);
                                        Object objQ11 = sVar8.Q();
                                        if (zF4 || objQ11 == gVar4) {
                                            hVar5 = hVar8;
                                            courseWord3 = courseWord4;
                                            i1Var5 = i1Var6;
                                            oVar6 = oVar8;
                                            z35 = false;
                                            l7Var2 = new l7(courseWord3, oVar6, i1Var5, eVar2, 3);
                                            sVar8.o0(l7Var2);
                                        } else {
                                            l7Var2 = objQ11;
                                            hVar5 = hVar8;
                                            courseWord3 = courseWord4;
                                            i1Var5 = i1Var6;
                                            oVar6 = oVar8;
                                            z35 = false;
                                        }
                                        CourseWord courseWord5 = courseWord3;
                                        hVar2 = hVar5;
                                        rVar5 = rVar4;
                                        dt.e.o(qVar2, lVar4, getAudioTime, (fz.a) l7Var2, sVar8, 0);
                                        z26 = false;
                                        sVar8.p(false);
                                        courseWord2 = courseWord5;
                                        i23 = 915238909;
                                        oVar2 = oVar6;
                                    } else {
                                        hVar2 = hVar8;
                                        sVar8.d0(932737479);
                                        j0.c.g(sVar8, j0.e2.g(oVar7, 12));
                                        z1.r rVarN2 = j0.e2.n(oVar7, 72);
                                        boolean z39 = b1Var13.getValue() instanceof ht.c;
                                        boolean zF5 = sVar8.f(oVar8) | sVar8.f(i1Var6) | sVar8.f(eVar2) | sVar8.h(courseWord4);
                                        Object objQ12 = sVar8.Q();
                                        if (zF5 || objQ12 == gVar4) {
                                            i1Var5 = i1Var6;
                                            rVar7 = rVar4;
                                            oVar5 = oVar8;
                                            l7 l7Var4 = new l7(courseWord4, oVar5, i1Var5, eVar2, 4);
                                            courseWord2 = courseWord4;
                                            sVar8.o0(l7Var4);
                                            objQ12 = l7Var4;
                                        } else {
                                            oVar5 = oVar8;
                                            courseWord2 = courseWord4;
                                            i1Var5 = i1Var6;
                                            rVar7 = rVar4;
                                        }
                                        rVar5 = rVar7;
                                        oVar2 = oVar5;
                                        i23 = 915238909;
                                        dt.a0.f(rVarN2, CropImageView.DEFAULT_ASPECT_RATIO, z39, (fz.a) objQ12, sVar8, 6, 2);
                                        z26 = false;
                                        sVar8.p(false);
                                    }
                                }
                                sVar8.p(z26);
                                if (r25 != 0 || ((Boolean) b1Var12.getValue()).booleanValue()) {
                                    rVar6 = rVar5;
                                    z27 = false;
                                    sVar8.d0(i23);
                                } else {
                                    sVar8.d0(933492949);
                                    Uri videoUri = courseWord2.getVideoUri();
                                    z1.r rVarB = d2.h.b(j0.e2.n(z1.a.d(oVar7, 1.0f), AchievementLevelType.DAY_STREAK_LV_8), r0.f.d(12));
                                    long jLongValue = i1Var5.getValue().longValue();
                                    Long lValueOf = Long.valueOf(oVar2.f33756d);
                                    boolean zF6 = sVar8.f(r22);
                                    fz.a aVar4 = onStopPlayAudio;
                                    boolean zF7 = zF6 | sVar8.f(aVar4);
                                    Object objQ13 = sVar8.Q();
                                    if (zF7 || objQ13 == gVar4) {
                                        objQ13 = new b3(2, aVar4, b1Var13);
                                        sVar8.o0(objQ13);
                                    }
                                    rVar6 = rVar5;
                                    dt.y4.a(videoUri, rVarB, null, zBooleanValue, jLongValue, lValueOf, (fz.c) ((mz.e) objQ13), sVar8, 0, 4);
                                    sVar8 = sVar8;
                                    z27 = false;
                                }
                                sVar8.p(z27);
                                if (rVar3 == rVar6) {
                                    sVar8.d0(1415610892);
                                    boolean zBooleanValue4 = ((Boolean) sVar8.j(ju.f.f37373g)).booleanValue();
                                    sVar8.p(z27);
                                    z28 = zBooleanValue4;
                                } else {
                                    sVar8.d0(934265929);
                                    sVar8.p(z27);
                                    z28 = false;
                                }
                                if (!z28 && !z38) {
                                    oVar3 = oVar7;
                                    rVarY = j0.c.y(oVar7, CropImageView.DEFAULT_ASPECT_RATIO, -10, 1);
                                } else if (r25 != 0) {
                                    oVar3 = oVar7;
                                    rVarY = oVar7;
                                } else {
                                    z1.o oVar9 = oVar7;
                                    rVarY = j0.c.E(oVar9, CropImageView.DEFAULT_ASPECT_RATIO, 38, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    oVar3 = oVar9;
                                }
                                j0.u uVarA2 = j0.t.a(dVar, hVar6, sVar8, 48);
                                iHashCode = Long.hashCode(sVar8.T);
                                l1.q1 q1VarL2 = sVar8.l();
                                z1.r rVarC2 = z1.a.c(sVar8, rVarY);
                                sVar8.h0();
                                if (sVar8.S) {
                                    sVar8.k(iVar);
                                } else {
                                    sVar8.r0();
                                }
                                l1.t.J(hVar7, uVarA2, sVar8);
                                l1.t.J(hVar2, q1VarL2, sVar8);
                                if (sVar8.S && kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode))) {
                                    hVar3 = hVar9;
                                } else {
                                    hVar3 = hVar9;
                                    defpackage.e.A(iHashCode, sVar8, iHashCode, hVar3);
                                }
                                l1.t.J(hVar, rVarC2, sVar8);
                                if (courseWord2.getSoundChangePronunciation().length() > 0) {
                                    z29 = true;
                                } else {
                                    z29 = false;
                                }
                                if (z29) {
                                    sVar8.d0(1719934315);
                                    l1.s sVar9 = sVar8;
                                    ua.b(courseWord2.getWord(), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar8.j(ua.f31167a), 0L, ct.c.c(sVar8), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar9, 48, 0, 65532);
                                    sVar8 = sVar9;
                                    sVar8.p(false);
                                    j7Var = this;
                                    hVar4 = hVar;
                                } else {
                                    hVar4 = hVar;
                                    if (rVar3 == ht.r.M9) {
                                        j7Var = this;
                                        if (!zBooleanValue2) {
                                            sVar8.d0(1720446776);
                                            l1.s sVar10 = sVar8;
                                            dt.d4.a(courseWord2.getDisplayZhuyinCharWords(), null, null, false, false, j3.y0.a((j3.y0) sVar8.j(ua.f31167a), 0L, ct.c.c(sVar8), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar10, 0, 0, 0, 4194270);
                                            sVar8 = sVar10;
                                            z30 = false;
                                        }
                                        sVar8.p(z30);
                                    } else {
                                        j7Var = this;
                                    }
                                    z30 = false;
                                    sVar8.d0(1700326195);
                                    sVar8.p(z30);
                                }
                                z1.i iVar3 = z1.c.M;
                                z1.o oVar10 = oVar3;
                                z1.r rVarE = j0.c.E(oVar10, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                j0.a2 a2VarA = j0.z1.a(j0.i.f35303a, iVar3, sVar8, 48);
                                iHashCode2 = Long.hashCode(sVar8.T);
                                l1.q1 q1VarL3 = sVar8.l();
                                z1.r rVarC3 = z1.a.c(sVar8, rVarE);
                                sVar8.h0();
                                if (sVar8.S) {
                                    sVar8.k(iVar);
                                } else {
                                    sVar8.r0();
                                }
                                l1.t.J(hVar7, a2VarA, sVar8);
                                l1.t.J(hVar2, q1VarL3, sVar8);
                                if (sVar8.S || !kotlin.jvm.internal.m.a(sVar8.Q(), Integer.valueOf(iHashCode2))) {
                                    defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar3);
                                }
                                l1.t.J(hVar4, rVarC3, sVar8);
                                if (courseWord2.getSoundChangePronunciation().length() > 0) {
                                    z31 = true;
                                } else {
                                    z31 = false;
                                }
                                if (z31) {
                                    sVar8.d0(563325319);
                                    l1.s sVar11 = sVar8;
                                    ua.b("[", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar8.j(ua.f31167a), 0L, ct.c.c(sVar8), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar11, 6, 0, 65534);
                                    sVar8 = sVar11;
                                    z32 = false;
                                } else {
                                    z32 = false;
                                    sVar8.d0(542486871);
                                }
                                sVar8.p(z32);
                                d0Var = ua.f31167a;
                                j3.y0 y0Var = (j3.y0) sVar8.j(d0Var);
                                oVar4 = oVar2;
                                if (oVar4.f33763k) {
                                    sVar8.d0(563839082);
                                    sVar8.p(z32);
                                    jC = fr.j3.A(28);
                                } else {
                                    sVar8.d0(563921790);
                                    jC = ct.c.c(sVar8);
                                    sVar8.p(z32);
                                }
                                l1.s sVar12 = sVar8;
                                dt.d4.a(pVar, null, null, false, false, j3.y0.a(y0Var, 0L, jC, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, oVar4.f33763k, null, false, false, false, null, null, null, sVar12, 0, 0, 0, 4177886);
                                sVar7 = sVar12;
                                if (courseWord2.getSoundChangePronunciation().length() > 0) {
                                    z33 = true;
                                } else {
                                    z33 = false;
                                }
                                if (z33) {
                                    sVar7.d0(564464135);
                                    ua.b("]", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar7.j(d0Var), 0L, ct.c.c(sVar7), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar7, 6, 0, 65534);
                                    sVar7 = sVar7;
                                    z34 = false;
                                } else {
                                    z34 = false;
                                    sVar7.d0(542486871);
                                }
                                sVar7.p(z34);
                                sVar7.p(true);
                                sVar7.p(true);
                                if (r25 != 0) {
                                    sVar7.d0(937676740);
                                    f11 = 12;
                                } else {
                                    sVar7.d0(937770980);
                                    f11 = 26;
                                }
                                ep.a.C(oVar10, f11, sVar7, z34);
                                sVar7.p(true);
                                sVar7.p(z34);
                            }
                            defpackage.e.A(iHashCode3, sVar8, iHashCode3, hVar9);
                            hVar = y2.j.f56915d;
                            l1.t.J(hVar, rVarC, sVar8);
                            rVar3 = oVar8.f33770s;
                            boolean z310 = oVar8.f33762j;
                            rVar4 = ht.r.M5;
                            if (rVar3 == rVar4) {
                                courseWord2 = courseWord4;
                                i1Var5 = i1Var6;
                                rVar5 = rVar4;
                                hVar2 = hVar8;
                                i23 = 915238909;
                                oVar2 = oVar8;
                                z26 = false;
                                sVar8.d0(915238909);
                            } else {
                                courseWord2 = courseWord4;
                                i1Var5 = i1Var6;
                                rVar5 = rVar4;
                                hVar2 = hVar8;
                                i23 = 915238909;
                                oVar2 = oVar8;
                                z26 = false;
                                sVar8.d0(915238909);
                            }
                            sVar8.p(z26);
                            if (r25 != 0) {
                                rVar6 = rVar5;
                                z27 = false;
                                sVar8.d0(i23);
                            } else {
                                rVar6 = rVar5;
                                z27 = false;
                                sVar8.d0(i23);
                            }
                            sVar8.p(z27);
                            if (rVar3 == rVar6) {
                                sVar8.d0(1415610892);
                                boolean zBooleanValue5 = ((Boolean) sVar8.j(ju.f.f37373g)).booleanValue();
                                sVar8.p(z27);
                                z28 = zBooleanValue5;
                            } else {
                                sVar8.d0(934265929);
                                sVar8.p(z27);
                                z28 = false;
                            }
                            if (!z28) {
                                if (r25 != 0) {
                                    oVar3 = oVar7;
                                    rVarY = oVar7;
                                } else {
                                    z1.o oVar11 = oVar7;
                                    rVarY = j0.c.E(oVar11, CropImageView.DEFAULT_ASPECT_RATIO, 38, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                    oVar3 = oVar11;
                                }
                            } else if (r25 != 0) {
                                oVar3 = oVar7;
                                rVarY = oVar7;
                            } else {
                                z1.o oVar12 = oVar7;
                                rVarY = j0.c.E(oVar12, CropImageView.DEFAULT_ASPECT_RATIO, 38, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                                oVar3 = oVar12;
                            }
                            j0.u uVarA3 = j0.t.a(dVar, hVar6, sVar8, 48);
                            iHashCode = Long.hashCode(sVar8.T);
                            l1.q1 q1VarL4 = sVar8.l();
                            z1.r rVarC4 = z1.a.c(sVar8, rVarY);
                            sVar8.h0();
                            if (sVar8.S) {
                                sVar8.k(iVar);
                            } else {
                                sVar8.r0();
                            }
                            l1.t.J(hVar7, uVarA3, sVar8);
                            l1.t.J(hVar2, q1VarL4, sVar8);
                            if (sVar8.S) {
                                hVar3 = hVar9;
                                defpackage.e.A(iHashCode, sVar8, iHashCode, hVar3);
                            } else {
                                hVar3 = hVar9;
                                defpackage.e.A(iHashCode, sVar8, iHashCode, hVar3);
                            }
                            l1.t.J(hVar, rVarC4, sVar8);
                            if (courseWord2.getSoundChangePronunciation().length() > 0) {
                                z29 = true;
                            } else {
                                z29 = false;
                            }
                            if (z29) {
                                sVar8.d0(1719934315);
                                l1.s sVar13 = sVar8;
                                ua.b(courseWord2.getWord(), j0.c.E(oVar3, CropImageView.DEFAULT_ASPECT_RATIO, 12, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13), 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar8.j(ua.f31167a), 0L, ct.c.c(sVar8), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar13, 48, 0, 65532);
                                sVar8 = sVar13;
                                sVar8.p(false);
                                j7Var = this;
                                hVar4 = hVar;
                            } else {
                                hVar4 = hVar;
                                if (rVar3 == ht.r.M9) {
                                    j7Var = this;
                                    if (!zBooleanValue2) {
                                        sVar8.d0(1720446776);
                                        l1.s sVar14 = sVar8;
                                        dt.d4.a(courseWord2.getDisplayZhuyinCharWords(), null, null, false, false, j3.y0.a((j3.y0) sVar8.j(ua.f31167a), 0L, ct.c.c(sVar8), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, false, null, false, false, false, null, null, null, sVar14, 0, 0, 0, 4194270);
                                        sVar8 = sVar14;
                                        z30 = false;
                                    }
                                    sVar8.p(z30);
                                } else {
                                    j7Var = this;
                                }
                                z30 = false;
                                sVar8.d0(1700326195);
                                sVar8.p(z30);
                            }
                            z1.i iVar4 = z1.c.M;
                            z1.o oVar13 = oVar3;
                            z1.r rVarE2 = j0.c.E(oVar13, CropImageView.DEFAULT_ASPECT_RATIO, 4, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 13);
                            j0.a2 a2VarA2 = j0.z1.a(j0.i.f35303a, iVar4, sVar8, 48);
                            iHashCode2 = Long.hashCode(sVar8.T);
                            l1.q1 q1VarL5 = sVar8.l();
                            z1.r rVarC5 = z1.a.c(sVar8, rVarE2);
                            sVar8.h0();
                            if (sVar8.S) {
                                sVar8.k(iVar);
                            } else {
                                sVar8.r0();
                            }
                            l1.t.J(hVar7, a2VarA2, sVar8);
                            l1.t.J(hVar2, q1VarL5, sVar8);
                            if (sVar8.S) {
                                defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar3);
                            } else {
                                defpackage.e.A(iHashCode2, sVar8, iHashCode2, hVar3);
                            }
                            l1.t.J(hVar4, rVarC5, sVar8);
                            if (courseWord2.getSoundChangePronunciation().length() > 0) {
                                z31 = true;
                            } else {
                                z31 = false;
                            }
                            if (z31) {
                                sVar8.d0(563325319);
                                l1.s sVar15 = sVar8;
                                ua.b("[", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar8.j(ua.f31167a), 0L, ct.c.c(sVar8), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar15, 6, 0, 65534);
                                sVar8 = sVar15;
                                z32 = false;
                            } else {
                                z32 = false;
                                sVar8.d0(542486871);
                            }
                            sVar8.p(z32);
                            d0Var = ua.f31167a;
                            j3.y0 y0Var2 = (j3.y0) sVar8.j(d0Var);
                            oVar4 = oVar2;
                            if (oVar4.f33763k) {
                                sVar8.d0(563839082);
                                sVar8.p(z32);
                                jC = fr.j3.A(28);
                            } else {
                                sVar8.d0(563921790);
                                jC = ct.c.c(sVar8);
                                sVar8.p(z32);
                            }
                            l1.s sVar16 = sVar8;
                            dt.d4.a(pVar, null, null, false, false, j3.y0.a(y0Var2, 0L, jC, n3.s.K, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), null, false, false, 0, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, 0, 0L, oVar4.f33763k, null, false, false, false, null, null, null, sVar16, 0, 0, 0, 4177886);
                            sVar7 = sVar16;
                            if (courseWord2.getSoundChangePronunciation().length() > 0) {
                                z33 = true;
                            } else {
                                z33 = false;
                            }
                            if (z33) {
                                sVar7.d0(564464135);
                                ua.b("]", null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, j3.y0.a((j3.y0) sVar7.j(d0Var), 0L, ct.c.c(sVar7), n3.s.H, null, null, 0L, null, null, 0, 0, 0L, null, 16777209), sVar7, 6, 0, 65534);
                                sVar7 = sVar7;
                                z34 = false;
                            } else {
                                z34 = false;
                                sVar7.d0(542486871);
                            }
                            sVar7.p(z34);
                            sVar7.p(true);
                            sVar7.p(true);
                            if (r25 != 0) {
                                sVar7.d0(937676740);
                                f11 = 12;
                            } else {
                                sVar7.d0(937770980);
                                f11 = 26;
                            }
                            ep.a.C(oVar13, f11, sVar7, z34);
                            sVar7.p(true);
                            sVar7.p(z34);
                        }
                    } else {
                        sVar8.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar6);
            t1.d dVarD3 = t1.e.d(1456538080, new x1(b1Var6, courseTestParams, b1Var4, b1Var8, b1Var5, b1Var7, b1Var9, pVar2, z17, z15, b1Var11, i1Var4, onClickPlayAudio, b0Var, state), sVar6);
            final CourseWord courseWord2 = courseWord;
            t1.d dVarD4 = t1.e.d(-55826965, new y1(courseTestParams, b1Var6, courseWord2, i1Var4, b1Var11, onStopPlayAudio, zBooleanValue, 2), sVar6);
            t1.d dVarD5 = t1.e.d(-1505717041, new fz.h() { // from class: bt.k7
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v17 */
                @Override // fz.h
                public final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    int i23;
                    boolean z26;
                    int i24;
                    l1.b1 b1Var12;
                    ?? arrayList;
                    OptionItemSelectedState optionItemSelectedState;
                    List listK;
                    j0.q CourseTestModelScreen = (j0.q) obj;
                    int iIntValue2 = ((Integer) obj2).intValue();
                    boolean zBooleanValue3 = ((Boolean) obj3).booleanValue();
                    l1.n nVar2 = (l1.n) obj4;
                    int iIntValue3 = ((Integer) obj5).intValue();
                    kotlin.jvm.internal.m.f(CourseTestModelScreen, "$this$CourseTestModelScreen");
                    int i25 = (iIntValue3 & 6) == 0 ? (((l1.s) nVar2).f(CourseTestModelScreen) ? 4 : 2) | iIntValue3 : iIntValue3;
                    if ((iIntValue3 & 48) == 0) {
                        i25 |= ((l1.s) nVar2).d(iIntValue2) ? 32 : 16;
                    }
                    if ((iIntValue3 & 384) == 0) {
                        i25 |= ((l1.s) nVar2).g(zBooleanValue3) ? 256 : 128;
                    }
                    l1.s sVar7 = (l1.s) nVar2;
                    if (sVar7.T(i25 & 1, (i25 & 1171) != 1170)) {
                        ht.o oVar2 = courseTestParams;
                        ht.r rVar3 = oVar2.f33770s;
                        ht.r rVar4 = ht.r.M9;
                        l1.b1 b1Var13 = b1Var2;
                        CourseWord wordItem = courseWord2;
                        if (rVar3 == rVar4 || oVar2.f33759g || oVar2.f33763k) {
                            int i26 = i25;
                            sVar7.d0(-177744028);
                            int i27 = i26 << 6;
                            dt.v2.l(CourseTestModelScreen, (ht.q) b1Var13.getValue(), wordItem, iIntValue2, zBooleanValue3, sVar7, (i26 & 14) | (i27 & 7168) | (i27 & 57344));
                            sVar7.p(false);
                        } else {
                            sVar7.d0(-177432075);
                            jt.m1 m1Var = state;
                            boolean zF3 = sVar7.f(m1Var.f37057j);
                            Object objQ7 = sVar7.Q();
                            l1.g gVar4 = l1.m.f39353a;
                            ry.r rVar5 = ry.r.f50854a;
                            if (zF3 || objQ7 == gVar4) {
                                List list = (List) ry.m.s0(m1Var.f37057j);
                                objQ7 = list == null ? rVar5 : list;
                                sVar7.o0(objQ7);
                            }
                            List<CourseWord> currentDisplayCharWords = (List) objQ7;
                            boolean zF4 = sVar7.f(currentDisplayCharWords);
                            Object objQ8 = sVar7.Q();
                            if (zF4 || objQ8 == gVar4) {
                                objQ8 = ry.m.y0(currentDisplayCharWords, BuildConfig.VERSION_NAME, null, null, new br.b(18), 30);
                                sVar7.o0(objQ8);
                            }
                            String str2 = (String) objQ8;
                            x1.p pVar3 = pVar;
                            pVar3.getClass();
                            p1.c stemWords = x1.q.e(pVar3).f55734c;
                            String userInputSentenceString = (String) b1Var10.getValue();
                            boolean zBooleanValue4 = ((Boolean) b1Var6.getValue()).booleanValue();
                            int i28 = m1Var.f37049b;
                            kotlin.jvm.internal.m.f(wordItem, "wordItem");
                            kotlin.jvm.internal.m.f(currentDisplayCharWords, "currentDisplayCharWords");
                            kotlin.jvm.internal.m.f(stemWords, "stemWords");
                            kotlin.jvm.internal.m.f(userInputSentenceString, "userInputSentenceString");
                            if (currentDisplayCharWords.isEmpty()) {
                                currentDisplayCharWords = wordItem.getDisplayCharWords();
                            }
                            if (currentDisplayCharWords.isEmpty()) {
                                listK = ns.o.K(wordItem);
                                i23 = iIntValue2;
                                z26 = zBooleanValue3;
                                i24 = i25;
                                b1Var12 = b1Var13;
                            } else {
                                ArrayList arrayList2 = new ArrayList(ry.n.W(currentDisplayCharWords, 10));
                                Iterator it = currentDisplayCharWords.iterator();
                                while (it.hasNext()) {
                                    CourseWord courseWord3 = (CourseWord) it.next();
                                    arrayList2.add(new jt.m2(courseWord3.getWordType(), courseWord3.getWord(), ns.o.L(courseWord3.getWord(), courseWord3.getZhuYin(), courseWord3.getLuoMa(), courseWord3.getKunreiShikiLuoMa(), courseWord3.getHepburnLuoMa())));
                                    it = it;
                                    i25 = i25;
                                    stemWords = stemWords;
                                    wordItem = wordItem;
                                    iIntValue2 = iIntValue2;
                                    zBooleanValue3 = zBooleanValue3;
                                    b1Var13 = b1Var13;
                                }
                                i23 = iIntValue2;
                                z26 = zBooleanValue3;
                                i24 = i25;
                                b1Var12 = b1Var13;
                                CourseWord courseWord4 = wordItem;
                                CourseWord courseWord5 = (CourseWord) ry.m.s0(stemWords);
                                List<CourseWord> displayCharWords = courseWord5 != null ? courseWord5.getDisplayCharWords() : null;
                                if (displayCharWords == null) {
                                    displayCharWords = rVar5;
                                }
                                ArrayList arrayList3 = new ArrayList(ry.n.W(displayCharWords, 10));
                                Iterator it2 = displayCharWords.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(((CourseWord) it2.next()).getSelectedState());
                                }
                                if (zBooleanValue4) {
                                    arrayList = (List) ry.m.s0(o00.a.f(i28, userInputSentenceString, ns.o.K(arrayList2)));
                                    if (arrayList == 0) {
                                        arrayList = rVar5;
                                    }
                                } else {
                                    arrayList = new ArrayList(ry.n.W(arrayList2, 10));
                                    int size = arrayList2.size();
                                    int i29 = 0;
                                    int i30 = 0;
                                    while (i30 < size) {
                                        Object obj6 = arrayList2.get(i30);
                                        i30++;
                                        int i31 = i29 + 1;
                                        if (i29 < 0) {
                                            ns.o.V();
                                            throw null;
                                        }
                                        jt.m2 m2Var = (jt.m2) obj6;
                                        if (m2Var.f37074b == 1 || kotlin.jvm.internal.m.a(m2Var.f37073a, " ")) {
                                            optionItemSelectedState = OptionItemSelectedState.DEFAULT;
                                        } else {
                                            optionItemSelectedState = (OptionItemSelectedState) ry.m.t0(i29, arrayList3);
                                            if (optionItemSelectedState == null) {
                                                optionItemSelectedState = OptionItemSelectedState.DEFAULT;
                                            }
                                        }
                                        arrayList.add(optionItemSelectedState);
                                        i29 = i31;
                                    }
                                }
                                ArrayList arrayList4 = new ArrayList(ry.n.W(currentDisplayCharWords, 10));
                                int i32 = 0;
                                for (Object obj7 : currentDisplayCharWords) {
                                    int i33 = i32 + 1;
                                    if (i32 < 0) {
                                        ns.o.V();
                                        throw null;
                                    }
                                    CourseWord courseWordCopy$default = (CourseWord) obj7;
                                    OptionItemSelectedState optionItemSelectedState2 = (OptionItemSelectedState) ry.m.t0(i32, arrayList);
                                    if (optionItemSelectedState2 == null) {
                                        optionItemSelectedState2 = OptionItemSelectedState.DEFAULT;
                                    }
                                    if (optionItemSelectedState2 != OptionItemSelectedState.DEFAULT) {
                                        courseWordCopy$default = CourseWord.copy$default(courseWordCopy$default, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, null, null, optionItemSelectedState2, null, null, 0, -1, 59, null);
                                    }
                                    arrayList4.add(courseWordCopy$default);
                                    i32 = i33;
                                }
                                wordItem = courseWord4;
                                listK = ns.o.K(CourseWord.copy$default(wordItem, 0L, null, null, null, null, null, 0, 0, null, null, null, null, null, null, null, null, null, null, 0, null, false, false, null, null, null, null, false, false, false, false, false, null, arrayList4, null, null, null, null, 0, -1, 62, null));
                            }
                            ht.q qVar2 = (ht.q) b1Var12.getValue();
                            boolean zBooleanValue5 = ((Boolean) m1Var.f37064r.getValue()).booleanValue();
                            int i34 = i24 << 15;
                            dt.v2.k(CourseTestModelScreen, qVar2, listK, null, (!ry.l.D(new Integer[]{12, 1}, Integer.valueOf(((Number) sVar7.j(ju.f.f37370d)).intValue())) || kotlin.jvm.internal.m.a(wordItem.getWord(), str2)) ? BuildConfig.VERSION_NAME : wordItem.getWord(), wordItem.getTranslation(), i23, z26, rVar5, null, false, false, false, zBooleanValue5, false, null, sVar7, (i24 & 14) | 100663296 | (3670016 & i34) | (i34 & 29360128), 384, 26372);
                            sVar7.p(false);
                        }
                    } else {
                        sVar7.W();
                    }
                    return qy.b0.f48488a;
                }
            }, sVar6);
            boolean zF3 = sVar6.f(a1Var);
            Object objQ7 = sVar6.Q();
            if (zF3 || objQ7 == gVar3) {
                objQ7 = new a2(a1Var, 5);
                sVar6.o0(objQ7);
            }
            fz.c cVar = (fz.c) objQ7;
            boolean zF4 = sVar6.f(i1Var4) | (i17 == 32 ? true : z13) | (i18 == 2048 ? true : z13) | sVar6.h(courseWord2);
            Object objQ8 = sVar6.Q();
            if (zF4 || objQ8 == gVar3) {
                l7Var = new l7(courseWord2, courseTestParams, i1Var4, onClickPlayAudio, 0);
                i1Var2 = i1Var4;
                courseWord2 = courseWord2;
                sVar6.o0(l7Var);
            } else {
                l7Var = objQ8;
                i1Var2 = i1Var4;
            }
            fz.a aVar3 = (fz.a) l7Var;
            boolean zH3 = sVar6.h(lVar) | sVar6.h(b0Var) | sVar6.h(state) | sVar6.h(courseWord2) | ((i15 & 458752) == 131072 ? true : z13);
            if (((i15 & 3670016) ^ 1572864) > 1048576 && sVar6.f(aVar)) {
                z14 = true;
            } else if ((i15 & 1572864) == 1048576) {
                z14 = true;
            } else {
                z14 = z13;
            }
            boolean zF5 = zH3 | z14 | (i17 == 32 ? true : z13) | sVar6.f(i1Var2) | (i18 != 2048 ? z13 : true);
            Object objQ9 = sVar6.Q();
            if (zF5 || objQ9 == gVar3) {
                m7 m7Var = new m7(lVar, b0Var, state, courseWord2, onClickChecked, aVar, courseTestParams, i1Var2, onClickPlayAudio, 0);
                sVar6.o0(m7Var);
                objQ9 = m7Var;
            }
            int i23 = i15 >> 12;
            dt.k3.e(translation, qVar, lVar2, z21, false, z23, z24, z22, CropImageView.DEFAULT_ASPECT_RATIO, f5, z25, z25, null, dVarD, dVarD2, dVarD3, null, dVarD4, dVarD5, zVarJ, null, cVar, null, null, onClickSkipListen, onClickSkipListen, aVar3, onClickBugReport, getComboCount, (fz.a) objQ9, sVar5, (fz.a) eVar, onClickContinue, sVar6, 196608, 907763712, (i23 & 458752) | ((i15 >> 9) & 3670016) | ((i16 << 24) & 234881024) | ((i15 << 21) & 1879048192), i23 & 7168, 27402768, 0);
            sVar = sVar6;
        } else {
            sVar = sVar4;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new u1(state, courseTestParams, getComboCount, onClickPlayAudio, onStopPlayAudio, onClickChecked, aVar, onClickContinue, getAudioTime, onClickSkipListen, onClickBugReport, i11, 1);
        }
    }

    public static final void r(ot.j jVar, ht.o oVar, ys.d0 d0Var, l1.n nVar, int i11) {
        ys.d0 d0Var2;
        Object k0Var;
        jt.k0 k0Var2;
        ht.o courseTestParams = oVar;
        kotlin.jvm.internal.m.f(jVar, ADSb.TatBeKfmti);
        kotlin.jvm.internal.m.f(courseTestParams, "courseTestParams");
        l1.s sVar = (l1.s) nVar;
        sVar.f0(-1639480045);
        int i12 = (sVar.h(jVar) ? 4 : 2) | i11 | (sVar.f(courseTestParams) ? 32 : 16);
        if ((i11 & 384) == 0) {
            i12 |= sVar.f(d0Var) ? 256 : 128;
        }
        if (sVar.T(i12 & 1, (i12 & 147) != 146)) {
            CourseSentence courseSentence = jVar.f45858a;
            List list = jVar.f45859b;
            kotlin.jvm.internal.m.f(courseSentence, "courseSentence");
            boolean zF = sVar.f(courseSentence);
            Object objQ = sVar.Q();
            l1.g gVar = l1.m.f39353a;
            if (zF || objQ == gVar) {
                objQ = l1.t.B(ht.q.DEFAULT);
                sVar.o0(objQ);
            }
            l1.b1 b1Var = (l1.b1) objQ;
            boolean zF2 = sVar.f(courseSentence);
            Object objQ2 = sVar.Q();
            if (zF2 || objQ2 == gVar) {
                objQ2 = l1.t.B(ht.a.f33722e);
                sVar.o0(objQ2);
            }
            l1.b1 b1Var2 = (l1.b1) objQ2;
            boolean zF3 = sVar.f(courseSentence);
            Object objQ3 = sVar.Q();
            if (zF3 || objQ3 == gVar) {
                objQ3 = l1.t.B(list);
                sVar.o0(objQ3);
            }
            l1.b1 b1Var3 = (l1.b1) objQ3;
            Object objQ4 = sVar.Q();
            if (objQ4 == gVar) {
                objQ4 = l1.t.s(new jt.i0(2, b1Var));
                sVar.o0(objQ4);
            }
            l1.b3 b3Var = (l1.b3) objQ4;
            e20.a aVarC = w4.c.c(sVar, -1168520582, sVar, -1633490746);
            boolean zF4 = sVar.f(null) | sVar.f(aVarC);
            Object objQ5 = sVar.Q();
            if (zF4 || objQ5 == gVar) {
                objQ5 = w4.c.e(vt.n0.class, aVarC, null, null, sVar);
            }
            sVar.p(false);
            sVar.p(false);
            fr.o0 o0Var = (fr.o0) ((vt.n0) objQ5);
            boolean zF5 = sVar.f(courseSentence) | sVar.f(list) | sVar.d(o0Var.f27733a.keyLanguage) | sVar.g(((Boolean) b3Var.getValue()).booleanValue()) | sVar.f(b1Var) | sVar.f(b1Var2) | sVar.f(b1Var3);
            Object objQ6 = sVar.Q();
            if (zF5 || objQ6 == gVar) {
                k0Var = new jt.k0(courseSentence, o0Var.f27733a.keyLanguage, ((Boolean) b3Var.getValue()).booleanValue(), b1Var, b1Var2, b1Var3);
                sVar.o0(k0Var);
            } else {
                k0Var = objQ6;
            }
            jt.k0 k0Var3 = (jt.k0) k0Var;
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objQ7 = sVar.Q();
            if (z11 || objQ7 == gVar) {
                objQ7 = new l(d0Var, 18);
                sVar.o0(objQ7);
            }
            fz.a aVar = (fz.a) objQ7;
            boolean zH = (i13 == 256) | sVar.h(k0Var3);
            Object objQ8 = sVar.Q();
            if (zH || objQ8 == gVar) {
                objQ8 = new at.h(17, d0Var, k0Var3);
                sVar.o0(objQ8);
            }
            fz.e eVar = (fz.e) objQ8;
            int i14 = i12 & 112;
            boolean zH2 = (i14 == 32) | (i13 == 256) | sVar.h(k0Var3) | sVar.h(jVar);
            Object objQ9 = sVar.Q();
            if (zH2 || objQ9 == gVar) {
                b0.a aVar2 = new b0.a(d0Var, k0Var3, courseTestParams, jVar, 7);
                d0Var2 = d0Var;
                k0Var2 = k0Var3;
                courseTestParams = courseTestParams;
                sVar.o0(aVar2);
                objQ9 = aVar2;
            } else {
                k0Var2 = k0Var3;
                d0Var2 = d0Var;
            }
            fz.c cVar = (fz.c) objQ9;
            boolean z12 = i13 == 256;
            Object objQ10 = sVar.Q();
            if (z12 || objQ10 == gVar) {
                objQ10 = new l(d0Var2, 19);
                sVar.o0(objQ10);
            }
            fz.a aVar3 = (fz.a) objQ10;
            boolean z13 = (i13 == 256) | (i14 == 32);
            Object objQ11 = sVar.Q();
            if (z13 || objQ11 == gVar) {
                objQ11 = new e0(d0Var2, courseTestParams, 5);
                sVar.o0(objQ11);
            }
            s(k0Var2, courseTestParams, aVar, eVar, cVar, aVar3, (fz.c) objQ11, sVar, i14);
        } else {
            d0Var2 = d0Var;
            sVar.W();
        }
        l1.x1 x1VarT = sVar.t();
        if (x1VarT != null) {
            x1VarT.f39502d = new androidx.lifecycle.compose.h(jVar, oVar, d0Var2, i11, 3);
        }
    }
}
