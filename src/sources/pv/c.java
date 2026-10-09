package pv;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassification;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewModelKt;
import b7.e0;
import bq.r;
import bw.ORXQ.ADSb;
import com.google.android.flexbox.FlexboxLayout;
import com.google.api.Service;
import com.lingo.lingoskill.ui.review.FlashCardFinishActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.AchievementLeaderBoard;
import com.lingodeer.data.model.AchievementLeaderBoardType;
import com.lingodeer.data.model.AchievementRecord;
import com.lingodeer.data.model.AchievementRecordType;
import com.lingodeer.data.model.SyllableWriteCharacter;
import com.lingodeer.ui.ShareMedalView;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import hj.b3;
import hj.u2;
import hj.w2;
import ht.o;
import hu.i;
import j3.f;
import j3.h;
import j3.u;
import j3.v;
import j3.x0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.y;
import l1.b1;
import l1.g2;
import l1.l2;
import l1.m2;
import l1.o2;
import l1.s;
import mv.f0;
import o3.w;
import qp.a4;
import qp.p4;
import qp.v1;
import qp.v3;
import qp.x3;
import qy.b0;
import rt.dd;
import rt.jd;
import rt.m9;
import rz.z1;
import s0.q1;
import s0.w0;
import uu.e;
import uz.i1;
import v3.j;
import w2.x;
import x1.p;
import z0.d;
import z2.r0;
import zr.g;
import zu.d2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f47194c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f47192a = i11;
        this.f47193b = obj;
        this.f47194c = obj2;
    }

    public /* synthetic */ c(int i11, v3 v3Var, CardView cardView) {
        this.f47192a = 2;
        this.f47193b = v3Var;
        this.f47194c = cardView;
    }

    /* JADX WARN: Code duplicated, block: B:156:0x033f A[PHI: r10
      0x033f: PHI (r10v10 java.lang.String) = (r10v9 java.lang.String), (r10v11 java.lang.String), (r10v12 java.lang.String) binds: [B:161:0x0350, B:158:0x0347, B:155:0x033d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:70:0x0149  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // fz.a
    public final Object invoke() throws PendingIntent.CanceledException {
        String str;
        h hVar;
        e eVar;
        List listH0;
        l2 l2VarE;
        Bitmap bitmap;
        int i11 = this.f47192a;
        String str2 = BuildConfig.VERSION_NAME;
        y1.h hVar2 = null;
        b0 b0Var = b0.f48488a;
        Object obj = this.f47194c;
        Object obj2 = this.f47193b;
        switch (i11) {
            case 0:
                ((fz.c) obj2).invoke((SyllableWriteCharacter) obj);
                return b0Var;
            case 1:
                CardView cardView = (CardView) obj2;
                v1 v1Var = (v1) obj;
                FlexboxLayout.LayoutParams layoutParams = (FlexboxLayout.LayoutParams) cardView.getLayoutParams();
                if (layoutParams != null) {
                    View viewO = v1Var.o();
                    Context context = v1Var.f47883c;
                    float f5 = 2;
                    int width = (int) ((((FlexboxLayout) viewO.findViewById(R.id.flex_option)).getWidth() - j3.Z(48, context)) / f5);
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = width;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = width;
                    if (j3.Z(48, context) + (width * 2) > ((FlexboxLayout) v1Var.o().findViewById(R.id.flex_option)).getHeight()) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = (int) ((((FlexboxLayout) v1Var.o().findViewById(R.id.flex_option)).getHeight() - j3.Z(48, context)) / f5);
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = (int) ((((FlexboxLayout) v1Var.o().findViewById(R.id.flex_option)).getWidth() - j3.Z(48, context)) / f5);
                    }
                    cardView.setLayoutParams(layoutParams);
                }
                return b0Var;
            case 2:
                v3 v3Var = (v3) obj2;
                CardView cardView2 = (CardView) obj;
                ta.a aVar = v3Var.f47886f;
                Context context2 = v3Var.f47883c;
                m.c(aVar);
                ((u2) aVar).f33383b.getWidth();
                FlexboxLayout.LayoutParams layoutParams2 = (FlexboxLayout.LayoutParams) cardView2.getLayoutParams();
                if (layoutParams2 != null) {
                    ta.a aVar2 = v3Var.f47886f;
                    m.c(aVar2);
                    float f11 = 2;
                    int width2 = (int) ((((u2) aVar2).f33383b.getWidth() - j3.Z(48, context2)) / f11);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).width = width2;
                    int i12 = (int) (width2 * 1.2780269f);
                    ((ViewGroup.MarginLayoutParams) layoutParams2).height = i12;
                    if (j3.Z(48, context2) + (i12 * 2) > ((FlexboxLayout) v3Var.o().findViewById(R.id.flex_option)).getHeight()) {
                        ta.a aVar3 = v3Var.f47886f;
                        m.c(aVar3);
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = (int) ((((u2) aVar3).f33383b.getHeight() - j3.Z(48, context2)) / f11);
                        ta.a aVar4 = v3Var.f47886f;
                        m.c(aVar4);
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) ((((u2) aVar4).f33383b.getWidth() - j3.Z(48, context2)) / f11);
                    }
                    cardView2.setLayoutParams(layoutParams2);
                }
                return b0Var;
            case 3:
                CardView cardView3 = (CardView) obj2;
                x3 x3Var = (x3) obj;
                FlexboxLayout.LayoutParams layoutParams3 = (FlexboxLayout.LayoutParams) cardView3.getLayoutParams();
                if (layoutParams3 != null) {
                    View viewO2 = x3Var.o();
                    Context context3 = x3Var.f47883c;
                    float f12 = 2;
                    int width3 = (int) ((((FlexboxLayout) viewO2.findViewById(R.id.flex_option)).getWidth() - j3.Z(48, context3)) / f12);
                    ((ViewGroup.MarginLayoutParams) layoutParams3).width = width3;
                    ((ViewGroup.MarginLayoutParams) layoutParams3).height = width3;
                    if (j3.Z(48, context3) + (width3 * 2) > ((FlexboxLayout) x3Var.o().findViewById(R.id.flex_option)).getHeight()) {
                        ((ViewGroup.MarginLayoutParams) layoutParams3).height = (int) ((((FlexboxLayout) x3Var.o().findViewById(R.id.flex_option)).getHeight() - j3.Z(48, context3)) / f12);
                        ((ViewGroup.MarginLayoutParams) layoutParams3).width = (int) ((((FlexboxLayout) x3Var.o().findViewById(R.id.flex_option)).getWidth() - j3.Z(48, context3)) / f12);
                    }
                    cardView3.setLayoutParams(layoutParams3);
                }
                return b0Var;
            case 4:
                v10.c.F((TextView) obj2, (int) ff.h.x(((x3) obj).f47883c, 24), 0);
                return b0Var;
            case 5:
                v10.c.F((TextView) obj2, (int) ff.h.x(((a4) obj).f47883c, 24), 0);
                return b0Var;
            case 6:
                CardView cardView4 = (CardView) obj2;
                a4 a4Var = (a4) obj;
                FlexboxLayout.LayoutParams layoutParams4 = (FlexboxLayout.LayoutParams) cardView4.getLayoutParams();
                if (layoutParams4 != null) {
                    ta.a aVar5 = a4Var.f47886f;
                    Context context4 = a4Var.f47883c;
                    m.c(aVar5);
                    float f13 = 2;
                    int width4 = (int) ((((w2) aVar5).f33513b.getWidth() - j3.Z(48, context4)) / f13);
                    ((ViewGroup.MarginLayoutParams) layoutParams4).width = width4;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).height = width4;
                    if (j3.Z(48, context4) + (width4 * 2) > ((FlexboxLayout) a4Var.o().findViewById(R.id.flex_option)).getHeight()) {
                        ta.a aVar6 = a4Var.f47886f;
                        m.c(aVar6);
                        ((ViewGroup.MarginLayoutParams) layoutParams4).height = (int) ((((w2) aVar6).f33513b.getHeight() - j3.Z(48, context4)) / f13);
                        ta.a aVar7 = a4Var.f47886f;
                        m.c(aVar7);
                        ((ViewGroup.MarginLayoutParams) layoutParams4).width = (int) ((((w2) aVar7).f33513b.getWidth() - j3.Z(48, context4)) / f13);
                    }
                    cardView4.setLayoutParams(layoutParams4);
                }
                return b0Var;
            case 7:
                CardView cardView5 = (CardView) obj2;
                p4 p4Var = (p4) obj;
                FlexboxLayout.LayoutParams layoutParams5 = (FlexboxLayout.LayoutParams) cardView5.getLayoutParams();
                if (layoutParams5 != null) {
                    ta.a aVar8 = p4Var.f47886f;
                    Context context5 = p4Var.f47883c;
                    m.c(aVar8);
                    float f14 = 2;
                    int width5 = (int) ((((b3) aVar8).f32381b.getWidth() - j3.Z(48, context5)) / f14);
                    ((ViewGroup.MarginLayoutParams) layoutParams5).width = width5;
                    ((ViewGroup.MarginLayoutParams) layoutParams5).height = width5;
                    if (j3.Z(48, context5) + (width5 * 2) > ((FlexboxLayout) p4Var.o().findViewById(R.id.flex_option)).getHeight()) {
                        ta.a aVar9 = p4Var.f47886f;
                        m.c(aVar9);
                        ((ViewGroup.MarginLayoutParams) layoutParams5).height = (int) ((((b3) aVar9).f32381b.getHeight() - j3.Z(48, context5)) / f14);
                        ta.a aVar10 = p4Var.f47886f;
                        m.c(aVar10);
                        ((ViewGroup.MarginLayoutParams) layoutParams5).width = (int) ((((b3) aVar10).f32381b.getWidth() - j3.Z(48, context5)) / f14);
                    }
                    cardView5.setLayoutParams(layoutParams5);
                }
                return b0Var;
            case 8:
                AchievementLeaderBoard achievementLeaderBoard = (AchievementLeaderBoard) obj2;
                String str3 = (String) obj;
                Bundle bundle = new Bundle();
                m.f(achievementLeaderBoard, "<this>");
                String id2 = achievementLeaderBoard.getId();
                switch (id2.hashCode()) {
                    case 2020897257:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_A)) {
                            str2 = "class_a";
                        }
                        break;
                    case 2020897258:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_B)) {
                            str2 = "class_b";
                        }
                        break;
                    case 2020897259:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_C)) {
                            str2 = "class_c";
                        }
                        break;
                    case 2020897260:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_D)) {
                            str2 = "class_d";
                        }
                        break;
                    case 2020897261:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_E)) {
                            str2 = "class_e";
                        }
                        break;
                    case 2020897262:
                        if (id2.equals(AchievementLeaderBoardType.LEADERBOARD_CLASS_F)) {
                            str2 = "class_f";
                        }
                        break;
                }
                bundle.putString("type", str2);
                bundle.putString("value", String.valueOf(achievementLeaderBoard.getCount()));
                bundle.putString("source", "me_achievement_detail");
                bundle.putString("mode", str3);
                return bundle;
            case 9:
                AchievementRecord achievementRecord = (AchievementRecord) obj2;
                String str4 = (String) obj;
                Bundle bundle2 = new Bundle();
                m.f(achievementRecord, "<this>");
                String id3 = achievementRecord.getId();
                int iHashCode = id3.hashCode();
                if (iHashCode == -1706072195) {
                    str = AchievementRecordType.LEADERBOARD;
                    if (id3.equals(AchievementRecordType.LEADERBOARD)) {
                        str2 = str;
                    }
                } else if (iHashCode == -739364438) {
                    str = AchievementRecordType.PERFECT_LESSON;
                    if (id3.equals(AchievementRecordType.PERFECT_LESSON)) {
                        str2 = str;
                    }
                } else if (iHashCode == 3832) {
                    str = "xp";
                    if (id3.equals("xp")) {
                        str2 = str;
                    }
                }
                bundle2.putString("type", str2);
                bundle2.putString("value", String.valueOf(achievementRecord.getRecord()));
                bundle2.putString("source", "me_achievement_detail");
                bundle2.putString("mode", str4);
                return bundle2;
            case 10:
                Bundle bundleE = e0.e("status", (String) obj2);
                bundleE.putString("unit", "U" + ((jd) obj).f49944d);
                return bundleE;
            case 11:
                w wVar = (w) obj2;
                b1 b1Var = (b1) obj;
                if (!x0.b(wVar.f44705b, ((w) b1Var.getValue()).f44705b) || !m.a(wVar.f44706c, ((w) b1Var.getValue()).f44706c)) {
                    b1Var.setValue(wVar);
                }
                return b0Var;
            case 12:
                q1 q1Var = (q1) obj2;
                h hVar3 = (h) obj;
                if (q1Var == null) {
                    return hVar3;
                }
                p pVar = q1Var.f51145c;
                if (pVar.isEmpty()) {
                    hVar = q1Var.f51144b;
                } else {
                    w0 w0Var = new w0(q1Var.f51144b);
                    int size = pVar.size();
                    for (int i13 = 0; i13 < size; i13++) {
                        ((fz.c) pVar.get(i13)).invoke(w0Var);
                    }
                    hVar = w0Var.f51245b;
                }
                q1Var.f51144b = hVar;
                return hVar == null ? hVar3 : hVar;
            case 13:
                r0 r0Var = (r0) obj;
                j3.w wVar2 = (j3.w) ((f) obj2).f35689a;
                if (wVar2 instanceof v) {
                    try {
                        String str5 = ((v) wVar2).f35803a;
                        r0Var.getClass();
                        try {
                            r0Var.f58659a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str5)));
                        } catch (ActivityNotFoundException e8) {
                            throw new IllegalArgumentException(nv.p.q("Can't open ", str5, '.'), e8);
                        }
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                } else if ((wVar2 instanceof u) && (eVar = ((u) wVar2).f35796c) != null) {
                    eVar.a(wVar2);
                }
                return b0Var;
            case 14:
                sm.c cVar = (sm.c) obj2;
                cVar.requireActivity().finish();
                if (!((Boolean) ((l1.b3) obj).getValue()).booleanValue()) {
                    int[] iArr = r.f4959a;
                    Context contextRequireContext = cVar.requireContext();
                    m.e(contextRequireContext, "requireContext(...)");
                    bq.m.C(contextRequireContext, "syllable_lesson_finish");
                }
                return b0Var;
            case 15:
                FlashCardFinishActivity flashCardFinishActivity = (FlashCardFinishActivity) obj2;
                int i14 = FlashCardFinishActivity.K;
                flashCardFinishActivity.m().c(ADSb.gAPSilIriELGpB, new m9(26));
                flashCardFinishActivity.finish();
                if (!((Boolean) ((l1.b3) obj).getValue()).booleanValue()) {
                    int[] iArr2 = r.f4959a;
                    bq.m.C(flashCardFinishActivity, "flash_card_finish");
                }
                return b0Var;
            case 16:
                tp.b0 b0Var2 = (tp.b0) obj2;
                b0Var2.requireActivity().finish();
                if (!((Boolean) ((l1.b3) obj).getValue()).booleanValue()) {
                    int[] iArr3 = r.f4959a;
                    Context contextRequireContext2 = b0Var2.requireContext();
                    m.e(contextRequireContext2, "requireContext(...)");
                    bq.m.C(contextRequireContext2, "handwrite_lesson_finish");
                }
                return b0Var;
            case 17:
                int i15 = ShareMedalView.R;
                ((fz.c) obj2).invoke(vc.a.h((ComposeView) obj));
                return b0Var;
            case 18:
                ((fz.c) obj2).invoke(((g) ((zr.h) obj)).f59299b);
                return b0Var;
            case 19:
                ((y) obj2).f38361a = ((fz.a) obj).invoke();
                return b0Var;
            case 20:
                return new j(ew.a.B(((d) obj2).h0((x) ((fz.a) obj).invoke())));
            case 21:
                ((v0.d) obj2).f53456d.invoke((v0.g) obj);
                return b0Var;
            case 22:
                z6.c.o((Context) obj2, (TextClassification) obj);
                return b0Var;
            case 23:
                fz.a aVar11 = (fz.a) obj;
                if (((i) ((hu.j) obj2)).f33790d) {
                    aVar11.invoke();
                }
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                ((fz.c) obj2).invoke(Boolean.valueOf(((d2) obj).f59392c));
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                s sVar = ((y1.d) obj2).f56815a;
                m2 m2Var = sVar.f39436c;
                l2 l2VarE2 = m2Var.e();
                int i16 = 0;
                while (true) {
                    try {
                        if (i16 < m2Var.f39359b) {
                            if (l2VarE2.l(i16)) {
                                Object objN = l2VarE2.n(i16);
                                if (objN != obj) {
                                    g2 g2Var = objN instanceof g2 ? (g2) objN : null;
                                    if ((g2Var != null ? g2Var.f39309a : null) == obj) {
                                    }
                                }
                                y1.h hVar4 = new y1.h(i16, null);
                                l2VarE2.c();
                                hVar2 = hVar4;
                                if (hVar2 != null) {
                                    int i17 = hVar2.f56818a;
                                    Integer num = hVar2.f56819b;
                                    l2VarE = m2Var.e();
                                    try {
                                        ArrayList arrayListW = gb.r.W(l2VarE, i17, num);
                                        l2VarE.c();
                                        listH0 = ry.m.H0(arrayListW, sVar.J());
                                    } catch (Throwable th2) {
                                        l2VarE.c();
                                        throw th2;
                                    }
                                } else {
                                    listH0 = ry.r.f50854a;
                                }
                                return new y1.a(listH0);
                            }
                            int[] iArr4 = l2VarE2.f39341b;
                            int i18 = i16 + 1;
                            int iC = (i18 < l2VarE2.f39342c ? iArr4[(i18 * 5) + 4] : l2VarE2.f39344e) - o2.c(iArr4, i16);
                            int i19 = 0;
                            while (true) {
                                if (i19 >= iC) {
                                    i16 = i18;
                                } else {
                                    Object objH = l2VarE2.h(i16, i19);
                                    if (objH != obj) {
                                        g2 g2Var2 = objH instanceof g2 ? (g2) objH : null;
                                        if ((g2Var2 != null ? g2Var2.f39309a : null) != obj) {
                                            i19++;
                                        }
                                    }
                                    hVar2 = new y1.h(i16, Integer.valueOf(i19));
                                }
                            }
                        }
                        l2VarE2.c();
                        if (hVar2 != null) {
                            int i110 = hVar2.f56818a;
                            Integer num2 = hVar2.f56819b;
                            l2VarE = m2Var.e();
                            ArrayList arrayListW2 = gb.r.W(l2VarE, i110, num2);
                            l2VarE.c();
                            listH0 = ry.m.H0(arrayListW2, sVar.J());
                        } else {
                            listH0 = ry.r.f50854a;
                        }
                        return new y1.a(listH0);
                    } catch (Throwable th3) {
                        l2VarE2.c();
                        throw th3;
                    }
                }
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                ((fz.c) obj2).invoke((o) obj);
                return b0Var;
            case 27:
                zs.f fVar = (zs.f) obj2;
                Context context6 = (Context) obj;
                m.f(context6, "context");
                i1 i1Var = fVar.f59368d;
                zs.c cVar2 = (zs.c) i1Var.getValue();
                zs.a aVar12 = cVar2.f59354j;
                if (aVar12 != null && (bitmap = cVar2.f59346b) != null && (cVar2.f59348d.length() != 0 || cVar2.f59349e)) {
                    i1Var.l(null, zs.c.a((zs.c) i1Var.getValue(), null, false, null, false, false, true, null, false, null, 831));
                    rz.e0.B(ViewModelKt.getViewModelScope(fVar), null, null, new b0.x0(fVar, context6, bitmap, aVar12, cVar2, (vy.d) null, 26), 3);
                }
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                dd ddVar = (dd) obj2;
                ddVar.getClass();
                rz.e0.B(ViewModelKt.getViewModelScope(ddVar), null, null, new f0(ddVar, null == true ? 1 : 0, 19), 3);
                ((fz.a) obj).invoke();
                return b0Var;
            default:
                jd jdVar = (jd) obj2;
                fz.a aVar13 = (fz.a) obj;
                boolean z11 = jdVar.M;
                z1 z1Var = jdVar.K;
                if (z1Var != null) {
                    z1Var.cancel(null);
                }
                jdVar.K = null;
                jdVar.f49941a.a();
                if (!z11) {
                    jdVar.a("cancel");
                }
                jdVar.L = false;
                aVar13.invoke();
                return b0Var;
        }
    }

    public /* synthetic */ c(q1 q1Var, f fVar, r0 r0Var) {
        this.f47192a = 13;
        this.f47193b = fVar;
        this.f47194c = r0Var;
    }
}
