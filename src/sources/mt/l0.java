package mt;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.lifecycle.ViewModelKt;
import com.google.api.Service;
import com.lingo.lingoskill.object.HwCharacter;
import com.lingodeer.R;
import com.lingodeer.course.stroke_order_view_new.old.HwView;
import com.lingodeer.data.model.AchievementLevel;
import com.lingodeer.data.model.SRSStatus;
import com.lingodeer.data.model.uistate.LeaderBoardUser;
import com.lingodeer.data.model.uistate.WordSentenceCharacterType;
import com.lingodeer.syllable_ko.model.KOSyllableLesson;
import com.yalantis.ucrop.view.CropImageView;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import okhttp3.Address;
import okhttp3.CertificatePinner;
import okhttp3.Handshake;
import okhttp3.internal.connection.ConnectPlan;
import okhttp3.internal.tls.CertificateChainCleaner;
import rt.be;
import rt.dd;
import rt.f8;
import rt.g8;
import rt.hc;
import rt.je;
import rt.kc;
import rt.mc;
import rt.me;
import rt.o8;
import rt.r8;
import rt.ud;
import rt.v7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l0 implements fz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f41611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f41612d;

    public /* synthetic */ l0(Object obj, Object obj2, Object obj3, int i11) {
        this.f41609a = i11;
        this.f41610b = obj;
        this.f41611c = obj2;
        this.f41612d = obj3;
    }

    @Override // fz.a
    public final Object invoke() {
        ud udVar;
        String word;
        String translation;
        int i11;
        int i12 = 2;
        int i13 = 3;
        int i14 = 0;
        int i15 = 1;
        switch (this.f41609a) {
            case 0:
                fz.c cVar = (fz.c) this.f41610b;
                je jeVar = (je) this.f41611c;
                cVar.invoke(jeVar != ((je) this.f41612d) ? jeVar : null);
                return qy.b0.f48488a;
            case 1:
                fz.c cVar2 = (fz.c) this.f41610b;
                me meVar = (me) this.f41611c;
                l1.b1 b1Var = (l1.b1) this.f41612d;
                cVar2.invoke(meVar);
                b1Var.setValue(Boolean.FALSE);
                return qy.b0.f48488a;
            case 2:
                rt.b4 b4Var = (rt.b4) this.f41610b;
                j9.v vVar = (j9.v) this.f41611c;
                ((l1.h1) ((l1.a1) this.f41612d)).m(0);
                bq.f fVar = b4Var.f49488b0;
                fVar.f4943a = true;
                nz.t tVarW = nz.n.W(ry.m.g0((Iterable) b4Var.V.getValue()), new ro.e(16));
                ro.e eVar = new ro.e(17);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                nz.b bVar = new nz.b(tVarW.iterator(), eVar);
                while (bVar.hasNext()) {
                    Object next = bVar.next();
                    linkedHashMap.put(((rt.n0) next).f50109b.getId(), next);
                }
                List<ot.i2> listU = fVar.u();
                ArrayList arrayList = new ArrayList();
                for (ot.i2 i2Var : listU) {
                    String str = i2Var.f45854a;
                    SRSStatus sRSStatus = i2Var.f45856c;
                    rt.n0 n0Var = (rt.n0) linkedHashMap.get(str);
                    if (n0Var == null) {
                        udVar = null;
                    } else {
                        WordSentenceCharacterType wordSentenceCharacterType = n0Var.f50110c;
                        String str2 = i2Var.f45854a;
                        String str3 = n0Var.f50108a;
                        LinkedHashMap linkedHashMap2 = be.f49548a;
                        boolean z11 = wordSentenceCharacterType instanceof WordSentenceCharacterType.CharacterType;
                        if (z11) {
                            word = ((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getCharacter();
                        } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                            word = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getSentence();
                        } else {
                            if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            word = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getWord();
                        }
                        String str4 = word;
                        if (z11) {
                            translation = ((WordSentenceCharacterType.CharacterType) wordSentenceCharacterType).getCharacter().getTranslation();
                        } else if (wordSentenceCharacterType instanceof WordSentenceCharacterType.SentenceType) {
                            translation = ((WordSentenceCharacterType.SentenceType) wordSentenceCharacterType).getSentence().getTranslation();
                        } else {
                            if (!(wordSentenceCharacterType instanceof WordSentenceCharacterType.WordType)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            translation = ((WordSentenceCharacterType.WordType) wordSentenceCharacterType).getWord().getTranslation();
                        }
                        udVar = new ud(str2, str3, str4, translation, i2Var.f45855b, sRSStatus.getNextReviewTime(), sRSStatus.getNextReviewTime(), true);
                    }
                    if (udVar != null) {
                        arrayList.add(udVar);
                    }
                }
                fVar.m(arrayList);
                vVar.a("customize_srs_suggestions", new lt.d(18));
                return qy.b0.f48488a;
            case 3:
                rt.b4 b4Var2 = (rt.b4) this.f41610b;
                l1.a1 a1Var = (l1.a1) this.f41611c;
                l1.b1 b1Var2 = (l1.b1) this.f41612d;
                ((l1.h1) a1Var).m(0);
                b4Var2.f49488b0.f4943a = true;
                b1Var2.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 4:
                fz.a aVar = (fz.a) this.f41610b;
                rt.q2 q2Var = (rt.q2) this.f41611c;
                fz.a aVar2 = (fz.a) this.f41612d;
                aVar.invoke();
                if (q2Var.f50276o != -1 && q2Var.f50279r == 2) {
                    aVar2.invoke();
                }
                return qy.b0.f48488a;
            case 5:
                rt.e3 e3Var = (rt.e3) this.f41610b;
                j9.v vVar2 = (j9.v) this.f41611c;
                ((l1.h1) ((l1.a1) this.f41612d)).m(0);
                e3Var.A0.f4943a = true;
                vVar2.a("customize_srs_suggestions", new lt.d(26));
                return qy.b0.f48488a;
            case 6:
                rt.e3 e3Var2 = (rt.e3) this.f41610b;
                l1.a1 a1Var2 = (l1.a1) this.f41611c;
                l1.b1 b1Var3 = (l1.b1) this.f41612d;
                ((l1.h1) a1Var2).m(0);
                e3Var2.A0.f4943a = true;
                b1Var3.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 7:
                g8 g8Var = (g8) this.f41610b;
                fz.e eVar2 = (fz.e) this.f41611c;
                l1.b1 b1Var4 = (l1.b1) this.f41612d;
                f8 f8Var = (f8) g8Var;
                eVar2.invoke(nz.n.Z(nz.n.R(nz.n.T(nz.n.R(ry.m.g0(f8Var.f49746e), new b6(i15)), new b6(i12)), new b6(i13))), f8Var.f49744c);
                b1Var4.setValue(Boolean.TRUE);
                return qy.b0.f48488a;
            case 8:
                o8 o8Var = (o8) this.f41611c;
                r8 r8Var = (r8) this.f41612d;
                fz.c cVar3 = (fz.c) this.f41610b;
                o8Var.getClass();
                if (o8Var.f50203f.contains(r8Var)) {
                    cVar3.invoke(r8Var);
                }
                return qy.b0.f48488a;
            case 9:
                ((fz.e) this.f41610b).invoke((x1.p) this.f41611c, (x1.p) this.f41612d);
                return qy.b0.f48488a;
            case 10:
                kotlin.jvm.internal.u uVar = (kotlin.jvm.internal.u) this.f41610b;
                x1.p pVar = (x1.p) this.f41611c;
                mh.d dVar = (mh.d) this.f41612d;
                if (uVar.f38357a) {
                    pVar.remove(dVar);
                } else {
                    pVar.add(dVar);
                }
                return qy.b0.f48488a;
            case 11:
                j9.v vVar3 = (j9.v) this.f41610b;
                sv.j jVar = (sv.j) this.f41611c;
                sv.h hVar = (sv.h) this.f41612d;
                vVar3.c();
                jVar.a(new sv.f(new sv.e((KOSyllableLesson) ry.m.q0(hVar.f51806b), false)));
                j9.v.b(vVar3, "syllable_test");
                return qy.b0.f48488a;
            case 12:
                CertificatePinner certificatePinner = (CertificatePinner) this.f41610b;
                Handshake handshake = (Handshake) this.f41611c;
                Address address = (Address) this.f41612d;
                int i16 = ConnectPlan.f45240a0;
                CertificateChainCleaner certificateChainCleaner = certificatePinner.f44968b;
                kotlin.jvm.internal.m.c(certificateChainCleaner);
                return certificateChainCleaner.a(address.f44940i.f45048d, handshake.a());
            case 13:
                p0.f fVar2 = (p0.f) this.f41610b;
                f2.c cVarT0 = p0.f.T0(fVar2, (y2.k1) this.f41611c, (d2.c) this.f41612d);
                if (cVarT0 == null) {
                    return null;
                }
                f0.i iVar = fVar2.Q;
                if (v3.l.a(iVar.Y, 0L)) {
                    i0.a.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return cVarT0.i(iVar.X0(cVarT0, iVar.Y) ^ (-9223372034707292160L));
            case 14:
                ImageView imageView = (ImageView) this.f41610b;
                kotlin.jvm.internal.v vVar4 = (kotlin.jvm.internal.v) this.f41611c;
                qh.k0 k0Var = (qh.k0) this.f41612d;
                float f5 = vVar4.f38358a;
                ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat("translationX", f5 - 4.0f, f5, 4.0f + f5), PropertyValuesHolder.ofFloat("rotation", -3.0f, CropImageView.DEFAULT_ASPECT_RATIO, 3.0f)).setDuration(1000L);
                kotlin.jvm.internal.m.e(duration, "setDuration(...)");
                duration.setRepeatMode(2);
                duration.setRepeatCount(-1);
                duration.start();
                k0Var.Q.add(duration);
                ta.a aVar3 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar3);
                TextView textView = ((hj.x5) aVar3).f33602n;
                sh.d dVar2 = k0Var.T;
                if (dVar2 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                textView.setText("+" + k0Var.getString(R.string._s_xp, String.valueOf(dVar2.K)));
                ta.a aVar4 = k0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar4);
                ObjectAnimator.ofPropertyValuesHolder(((hj.x5) aVar4).f33602n, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.4f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.4f, 1.0f)).setDuration(300L).start();
                sh.d dVar3 = k0Var.T;
                if (dVar3 == null) {
                    kotlin.jvm.internal.m.n("viewModel");
                    throw null;
                }
                if (dVar3.f51699t == 0) {
                    k0Var.C();
                } else {
                    k0Var.B();
                }
                return qy.b0.f48488a;
            case 15:
                qp.j jVar2 = (qp.j) this.f41610b;
                FrameLayout frameLayout = (FrameLayout) this.f41611c;
                View view = (View) this.f41612d;
                z4.w0 w0Var = jVar2.f47990q;
                if (w0Var != null) {
                    w0Var.b();
                    jVar2.f47990q = null;
                }
                ta.a aVar5 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.k1) aVar5).f32810e.setScaleX(1.0f);
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                TextView textView2 = (TextView) frameLayout.findViewById(R.id.tv_middle);
                ta.a aVar6 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                ((hj.k1) aVar6).f32810e.getLocationOnScreen(iArr);
                frameLayout.getLocationOnScreen(iArr2);
                textView2.getLocationOnScreen(new int[2]);
                int i17 = iArr2[0] - iArr[0];
                int i18 = iArr2[1] - iArr[1];
                ta.a aVar7 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar7);
                ((hj.k1) aVar7).f32810e.setTranslationX(i17);
                ta.a aVar8 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar8);
                ((hj.k1) aVar8).f32810e.setTranslationY(i18);
                ta.a aVar9 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar9);
                ((hj.k1) aVar9).f32810e.setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar10 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar10);
                ((hj.k1) aVar10).f32810e.setVisibility(0);
                ta.a aVar11 = jVar2.f47886f;
                kotlin.jvm.internal.m.c(aVar11);
                z4.w0 w0VarB = z4.s0.b(((hj.k1) aVar11).f32810e);
                w0VarB.c(1.0f);
                w0VarB.e(400L);
                jVar2.f47990q = w0VarB;
                w0VarB.i();
                view.setEnabled(false);
                th.j.a(qx.h.m(400L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new qp.i(view), qp.c.f47861c), jVar2.f47887g);
                ((jp.p0) jVar2.f47881a).O(4);
                return qy.b0.f48488a;
            case 16:
                qp.q1 q1Var = (qp.q1) this.f41610b;
                FrameLayout frameLayout2 = (FrameLayout) this.f41611c;
                View view2 = (View) this.f41612d;
                z4.w0 w0Var2 = q1Var.f48134p;
                if (w0Var2 != null) {
                    w0Var2.b();
                    q1Var.f48134p = null;
                }
                ta.a aVar12 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar12);
                ((hj.h2) aVar12).f32654d.setScaleX(1.0f);
                int[] iArr3 = new int[2];
                int[] iArr4 = new int[2];
                TextView textView3 = (TextView) frameLayout2.findViewById(R.id.tv_middle);
                ta.a aVar13 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar13);
                ((hj.h2) aVar13).f32654d.getLocationOnScreen(iArr3);
                frameLayout2.getLocationOnScreen(iArr4);
                textView3.getLocationOnScreen(new int[2]);
                int i19 = iArr4[0] - iArr3[0];
                int i21 = iArr4[1] - iArr3[1];
                ta.a aVar14 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar14);
                ((hj.h2) aVar14).f32654d.setTranslationX(i19);
                ta.a aVar15 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar15);
                ((hj.h2) aVar15).f32654d.setTranslationY(i21);
                ta.a aVar16 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar16);
                ((hj.h2) aVar16).f32654d.setScaleX(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar17 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar17);
                ((hj.h2) aVar17).f32654d.setScaleY(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar18 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar18);
                ((hj.h2) aVar18).f32654d.setPivotX(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar19 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar19);
                ((hj.h2) aVar19).f32654d.setPivotY(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar20 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar20);
                ((hj.h2) aVar20).f32654d.setVisibility(0);
                ta.a aVar21 = q1Var.f47886f;
                kotlin.jvm.internal.m.c(aVar21);
                z4.w0 w0VarB2 = z4.s0.b(((hj.h2) aVar21).f32654d);
                w0VarB2.c(1.0f);
                w0VarB2.d(1.0f);
                w0VarB2.e(300L);
                q1Var.f48134p = w0VarB2;
                w0VarB2.i();
                view2.setEnabled(false);
                TextView textView4 = (TextView) view2.findViewById(R.id.tv_top);
                if (textView4 != null) {
                    textView4.setAlpha(0.5f);
                }
                TextView textView5 = (TextView) view2.findViewById(R.id.tv_middle);
                if (textView5 != null) {
                    textView5.setAlpha(0.5f);
                }
                TextView textView6 = (TextView) view2.findViewById(R.id.tv_bottom);
                if (textView6 != null) {
                    textView6.setAlpha(0.5f);
                }
                th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.i(view2, 12), qp.c.N), q1Var.f47887g);
                ((jp.p0) q1Var.f47881a).O(4);
                return qy.b0.f48488a;
            case 17:
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f41610b;
                LinearLayout linearLayout = (LinearLayout) this.f41611c;
                ImageView imageView2 = (ImageView) this.f41612d;
                horizontalScrollView.getWidth();
                linearLayout.getWidth();
                if (horizontalScrollView.getWidth() < linearLayout.getWidth()) {
                    imageView2.setVisibility(0);
                } else {
                    imageView2.setVisibility(4);
                }
                return qy.b0.f48488a;
            case 18:
                View view3 = (View) this.f41610b;
                View view4 = (View) this.f41611c;
                qp.s2 s2Var = (qp.s2) this.f41612d;
                ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                layoutParams.width = view4.getWidth();
                view3.setLayoutParams(layoutParams);
                view3.requestLayout();
                view3.postDelayed(new b2.c(4, view3, new qp.l2(s2Var, i15)), 0L);
                return qy.b0.f48488a;
            case 19:
                tu.h hVar2 = (tu.h) this.f41610b;
                fz.a aVar22 = (fz.a) this.f41611c;
                fz.a aVar23 = (fz.a) this.f41612d;
                tu.k kVar = ((tu.g) hVar2).f52568c;
                if (kVar == null || !kVar.f52596c) {
                    aVar23.invoke();
                } else {
                    aVar22.invoke();
                }
                return qy.b0.f48488a;
            case 20:
                z1.o oVar = z1.o.f58481a;
                wb.i iVar2 = (wb.i) this.f41610b;
                j0.s sVar = (j0.s) this.f41611c;
                v3.c cVar4 = (v3.c) this.f41612d;
                k2.b bVarA = ((wb.g) iVar2.T.getValue()).a();
                f2.e eVar3 = bVarA != null ? new f2.e(bVarA.h()) : null;
                if (eVar3 != null) {
                    long j11 = eVar3.f26584a;
                    if (j11 != 9205357640488583168L) {
                        int i22 = (int) (j11 >> 32);
                        if (Float.intBitsToFloat(i22) != Float.POSITIVE_INFINITY) {
                            int i23 = (int) (j11 & 4294967295L);
                            if (Float.intBitsToFloat(i23) != Float.POSITIVE_INFINITY) {
                                float fIntBitsToFloat = Float.intBitsToFloat(i22);
                                float fIntBitsToFloat2 = Float.intBitsToFloat(i23);
                                float fH = fIntBitsToFloat > ((float) v3.a.h(sVar.f35407b)) ? v3.a.h(sVar.f35407b) / fIntBitsToFloat : 1.0f;
                                return j0.e2.p(oVar, cVar4.T(fIntBitsToFloat * fH), cVar4.T(fIntBitsToFloat2 * fH));
                            }
                        }
                    }
                }
                return j0.e2.n(oVar, rg.e.f49258a);
            case 21:
                AchievementLevel achievementLevel = (AchievementLevel) this.f41610b;
                String str5 = (String) this.f41611c;
                String str6 = (String) this.f41612d;
                Bundle bundle = new Bundle();
                bundle.putString("type", ve.i.A(achievementLevel));
                bundle.putString("level", String.valueOf(achievementLevel.getLevel()));
                bundle.putString("source", str5);
                bundle.putString("mode", str6);
                return bundle;
            case 22:
                rt.e3 e3Var3 = (rt.e3) this.f41610b;
                rz.e0.B(ViewModelKt.getViewModelScope(e3Var3), null, null, new jr.i0(e3Var3, (vt.n0) this.f41611c, (List) this.f41612d, (vy.d) null, 22), 3);
                return qy.b0.f48488a;
            case 23:
                mc mcVar = (mc) this.f41610b;
                kc kcVar = (kc) this.f41611c;
                hc hcVar = (hc) this.f41612d;
                synchronized (mcVar.f50090h) {
                    i14 = ((LinkedHashMap) mcVar.f50091i).get(kcVar) == hcVar ? 1 : 0;
                }
                if (i14 != 0) {
                    if (((Boolean) ((v7) mcVar.f50084b).invoke(kcVar.f49991b)).booleanValue()) {
                        mcVar.d(kcVar);
                    } else {
                        ((os.a) mcVar.f50085c).invoke(ns.o.K(hcVar.f49846a), (aj.e) mcVar.f50093k);
                    }
                }
                return qy.b0.f48488a;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                dd ddVar = (dd) this.f41610b;
                rz.e0.B(ViewModelKt.getViewModelScope(ddVar), null, null, new jr.i0(ddVar, (vt.n0) this.f41611c, (List) this.f41612d, (vy.d) null, 25), 3);
                return qy.b0.f48488a;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                t1.b bVar2 = (t1.b) this.f41610b;
                a9.i iVar3 = (a9.i) this.f41611c;
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.f41612d;
                bVar2.a();
                t1.a aVar24 = (t1.a) iVar3.f519c;
                int i24 = wVar.f38359a;
                do {
                    i11 = aVar24.get();
                } while (!aVar24.compareAndSet(i11, ((i11 >>> 27) & 15) == i24 ? i11 - 1 : i11));
                return qy.b0.f48488a;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                tp.i0 i0Var = (tp.i0) this.f41610b;
                HwCharacter hwCharacter = (HwCharacter) this.f41611c;
                qy.l lVar = (qy.l) this.f41612d;
                ta.a aVar25 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar25);
                HwView hwView = ((hj.t3) aVar25).f33330d;
                String showCharPath = hwCharacter.getShowCharPath();
                List list = (List) lVar.f48495a;
                List list2 = (List) lVar.f48496b;
                hwCharacter.getCharId();
                hwView.e(showCharPath, list, list2);
                ta.a aVar26 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar26);
                ((hj.t3) aVar26).f33330d.setTimeGap(100);
                ta.a aVar27 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar27);
                ((hj.t3) aVar27).f33330d.setWritingListener(new tp.d0(i0Var, i14));
                ta.a aVar28 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar28);
                ((hj.t3) aVar28).f33330d.setAnimListener(new tp.d0(i0Var, i15));
                ta.a aVar29 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar29);
                bq.z.b(((hj.t3) aVar29).f33332f, new tp.c0(i0Var, i15));
                ta.a aVar30 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar30);
                bq.z.b(((hj.t3) aVar30).f33333g, new tp.c0(i0Var, i12));
                ta.a aVar31 = i0Var.f36400f;
                kotlin.jvm.internal.m.c(aVar31);
                bq.z.b(((hj.t3) aVar31).f33334h, new tp.c0(i0Var, i13));
                return qy.b0.f48488a;
            case 27:
                Context context = (Context) this.f41610b;
                g.j jVar3 = (g.j) this.f41611c;
                l1.b1 b1Var5 = (l1.b1) this.f41612d;
                Uri uriD = FileProvider.d(context, context.getPackageName() + ".fileprovider", File.createTempFile("ocr_capture_", ".jpg", context.getExternalFilesDir(Environment.DIRECTORY_PICTURES)));
                b1Var5.setValue(uriD);
                kotlin.jvm.internal.m.c(uriD);
                jVar3.a(uriD);
                return qy.b0.f48488a;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                fz.c cVar5 = (fz.c) this.f41610b;
                LeaderBoardUser leaderBoardUser = (LeaderBoardUser) this.f41611c;
                ((l1.b1) this.f41612d).setValue(Boolean.FALSE);
                cVar5.invoke(leaderBoardUser);
                return qy.b0.f48488a;
            default:
                ((fz.c) this.f41610b).invoke(Integer.valueOf(ry.l.Z((String[]) this.f41611c, (String) this.f41612d)));
                return qy.b0.f48488a;
        }
    }

    public /* synthetic */ l0(o8 o8Var, r8 r8Var, fz.c cVar) {
        this.f41609a = 8;
        this.f41611c = o8Var;
        this.f41612d = r8Var;
        this.f41610b = cVar;
    }
}
