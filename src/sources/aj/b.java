package aj;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateInterpolator;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.media3.ui.PlayerControlView;
import b0.h2;
import b7.e0;
import bq.u;
import com.facebook.FacebookButtonBase;
import com.google.api.Service;
import com.google.logging.type.LogSeverity;
import com.lingo.lingoskill.englishskill.ui.learn.ENSyllableIntroductionActivity;
import com.lingo.lingoskill.ptskill.ui.syllable.PTSyllableIntroductionActivity;
import com.lingo.lingoskill.ruskill.ui.learn.RUSyllableIndexActivity;
import com.lingo.lingoskill.ui.base.RemoteUrlActivity;
import com.lingo.lingoskill.ui.learn.DebugTestIndexActivity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import h9.k;
import h9.w;
import hh.c1;
import hh.p0;
import hj.l6;
import hj.q0;
import hj.u5;
import hj.w5;
import hj.x5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import jp.h0;
import jp.j1;
import kotlin.jvm.internal.m;
import lf.p1;
import ns.o;
import nv.p;
import oo.d0;
import oo.k0;
import oz.q;
import oz.x;
import qh.c0;
import re.i0;
import re.s;
import ry.r;
import th.j;
import y6.j0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f729b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f728a = i11;
        this.f729b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:265:0x0966  */
    /* JADX WARN: Code duplicated, block: B:64:0x0237  */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        List listK;
        int i11;
        List listT;
        String strA;
        List listK2;
        List listK3;
        List listT2;
        String strA2;
        List listK4;
        String strI;
        int i12 = this.f728a;
        List listT3 = r.f50854a;
        final int i13 = 0;
        Object obj = this.f729b;
        switch (i12) {
            case 0:
                f fVar = (f) obj;
                bc.i iVar = fVar.f739b;
                m.c(iVar);
                iVar.c();
                bc.i iVar2 = fVar.f739b;
                iVar2.f4122b = false;
                iVar2.a(fVar.f745h);
                iVar2.d();
                return;
            case 1:
                RUSyllableIndexActivity rUSyllableIndexActivity = (RUSyllableIndexActivity) obj;
                c20.a aVar = rUSyllableIndexActivity.R;
                int i14 = RUSyllableIndexActivity.Z;
                m.d(view, "null cannot be cast to non-null type android.widget.TextView");
                String strQ0 = x.q0(x.q0(x.q0(((TextView) view).getText().toString(), "Tокио", "токио"), "Путин", "путин"), "Фёдор", "фёдор");
                Matcher matcherW = p.w(0, " ", "compile(...)", strQ0);
                if (matcherW.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iC = 0;
                    do {
                        iC = p.c(matcherW, strQ0, iC, arrayList);
                    } while (matcherW.find());
                    p.B(iC, strQ0, arrayList);
                    listK = arrayList;
                } else {
                    listK = o.K(strQ0.toString());
                }
                if (listK.isEmpty()) {
                    i11 = 1;
                    listT = listT3;
                } else {
                    ListIterator listIterator = listK.listIterator(listK.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i11 = 1;
                            listT = listT3;
                        } else if (((String) listIterator.previous()).length() != 0) {
                            i11 = 1;
                            listT = e0.t(listIterator, 1, listK);
                        }
                    }
                }
                String[] strArr = (String[]) listT.toArray(new String[0]);
                if (strArr.length > i11) {
                    String strN = p0.n("getDefault(...)", strArr[0], "toLowerCase(...)");
                    String str = strArr[i11];
                    int i15 = i11;
                    Locale locale = Locale.getDefault();
                    m.e(locale, "getDefault(...)");
                    String lowerCase = str.toLowerCase(locale);
                    m.e(lowerCase, "toLowerCase(...)");
                    if (strN.equals(lowerCase) || x.s0(strArr[i15], "[", false) || x.s0(strArr[i15], "(", false)) {
                        Matcher matcherW2 = p.w(0, " ", "compile(...)", strQ0);
                        if (matcherW2.find()) {
                            ArrayList arrayList2 = new ArrayList(10);
                            int iC2 = 0;
                            do {
                                iC2 = p.c(matcherW2, strQ0, iC2, arrayList2);
                            } while (matcherW2.find());
                            p.B(iC2, strQ0, arrayList2);
                            listK2 = arrayList2;
                        } else {
                            listK2 = o.K(strQ0.toString());
                        }
                        if (!listK2.isEmpty()) {
                            ListIterator listIterator2 = listK2.listIterator(listK2.size());
                            while (listIterator2.hasPrevious()) {
                                if (((String) listIterator2.previous()).length() != 0) {
                                    listT3 = e0.t(listIterator2, 1, listK2);
                                }
                            }
                        }
                        String string = q.i1(((String[]) listT3.toArray(new String[0]))[0]).toString();
                        Locale locale2 = Locale.getDefault();
                        m.e(locale2, "getDefault(...)");
                        String lowerCase2 = string.toLowerCase(locale2);
                        m.e(lowerCase2, "toLowerCase(...)");
                        strA = aVar.a(lowerCase2);
                    } else {
                        String string2 = q.i1(strQ0).toString();
                        Locale locale3 = Locale.getDefault();
                        m.e(locale3, "getDefault(...)");
                        String lowerCase3 = string2.toLowerCase(locale3);
                        m.e(lowerCase3, "toLowerCase(...)");
                        strA = aVar.a(lowerCase3);
                    }
                } else {
                    String string3 = q.i1(strQ0).toString();
                    Locale locale4 = Locale.getDefault();
                    m.e(locale4, "getDefault(...)");
                    String lowerCase4 = string3.toLowerCase(locale4);
                    m.e(lowerCase4, "toLowerCase(...)");
                    strA = aVar.a(lowerCase4);
                }
                m.c(strA);
                Locale locale5 = Locale.getDefault();
                m.e(locale5, "getDefault(...)");
                m.e(strQ0.toLowerCase(locale5), "toLowerCase(...)");
                a9.i iVar3 = rUSyllableIndexActivity.S;
                qy.q qVar = fv.b.f28186a;
                iVar3.v(fv.b.c(strA, null, null));
                return;
            case 2:
                RemoteUrlActivity remoteUrlActivity = (RemoteUrlActivity) obj;
                int i16 = RemoteUrlActivity.R;
                if (((q0) remoteUrlActivity.j()).f33132c.canGoBack()) {
                    ((q0) remoteUrlActivity.j()).f33132c.goBack();
                    return;
                } else {
                    remoteUrlActivity.finish();
                    return;
                }
            case 3:
                ((lc.d) obj).dismiss();
                xt.b.d().c("jxz_close_ad", new u(i13));
                return;
            case 4:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                playerControlView.o(!playerControlView.S0);
                return;
            case 5:
                PlayerControlView playerControlView2 = ((h9.g) obj).f32036d;
                j0 j0Var = playerControlView2.R0;
                if (j0Var == null || !((h2) j0Var).e0(29)) {
                    return;
                }
                playerControlView2.R0.D(playerControlView2.R0.J().a().b(1).i(1, false).a());
                playerControlView2.N.f32078b[1] = playerControlView2.getResources().getString(R.string.exo_track_selection_auto);
                playerControlView2.S.dismiss();
                return;
            case 6:
                h9.m mVar = (h9.m) obj;
                PlayerControlView playerControlView3 = mVar.f32074d;
                int bindingAdapterPosition = mVar.getBindingAdapterPosition();
                View view2 = playerControlView3.f2247k0;
                if (bindingAdapterPosition == 0) {
                    k kVar = playerControlView3.O;
                    view2.getClass();
                    playerControlView3.e(kVar, view2);
                    return;
                } else {
                    if (bindingAdapterPosition != 1) {
                        playerControlView3.S.dismiss();
                        return;
                    }
                    h9.g gVar = playerControlView3.Q;
                    view2.getClass();
                    playerControlView3.e(gVar, view2);
                    return;
                }
            case 7:
                PlayerControlView playerControlView4 = ((h9.g) obj).f32036d;
                j0 j0Var2 = playerControlView4.R0;
                if (j0Var2 == null || !((h2) j0Var2).e0(29)) {
                    return;
                }
                playerControlView4.R0.D(playerControlView4.R0.J().a().b(3).d().f().h().a());
                playerControlView4.S.dismiss();
                return;
            case 8:
                w wVar = (w) obj;
                wVar.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    wVar.f32116q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        wVar.f32117r.start();
                        return;
                    }
                    return;
                }
            case 9:
                final c1 c1Var = (c1) obj;
                Integer numValueOf = Integer.valueOf(LogSeverity.NOTICE_VALUE);
                ta.a aVar2 = c1Var.f36400f;
                m.c(aVar2);
                if (((l6) aVar2).f32869d.getVisibility() == 4) {
                    ta.a aVar3 = c1Var.f36400f;
                    m.c(aVar3);
                    ((l6) aVar3).f32870e.animate().rotationBy(180.0f).setDuration(300L).start();
                    ta.a aVar4 = c1Var.f36400f;
                    m.c(aVar4);
                    ((l6) aVar4).f32869d.setVisibility(0);
                    ta.a aVar5 = c1Var.f36400f;
                    m.c(aVar5);
                    ViewPropertyAnimator viewPropertyAnimatorTranslationY = ((l6) aVar5).f32869d.animate().translationY(CropImageView.DEFAULT_ASPECT_RATIO);
                    viewPropertyAnimatorTranslationY.setInterpolator(new AccelerateInterpolator());
                    viewPropertyAnimatorTranslationY.setDuration(300L);
                    viewPropertyAnimatorTranslationY.start();
                    Context contextRequireContext = c1Var.requireContext();
                    m.e(contextRequireContext, "requireContext(...)");
                    int iZ = (int) j3.Z(numValueOf, contextRequireContext);
                    Context contextRequireContext2 = c1Var.requireContext();
                    m.e(contextRequireContext2, "requireContext(...)");
                    ValueAnimator duration = ValueAnimator.ofInt(iZ, (int) j3.Z(250, contextRequireContext2)).setDuration(300L);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hh.a1
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator it) {
                            switch (i13) {
                                case 0:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    Object animatedValue = it.getAnimatedValue();
                                    kotlin.jvm.internal.m.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                    int iIntValue = ((Integer) animatedValue).intValue();
                                    c1 c1Var2 = c1Var;
                                    ta.a aVar6 = c1Var2.f36400f;
                                    kotlin.jvm.internal.m.c(aVar6);
                                    ViewGroup.LayoutParams layoutParams = ((l6) aVar6).f32868c.getLayoutParams();
                                    layoutParams.height = iIntValue;
                                    ta.a aVar7 = c1Var2.f36400f;
                                    kotlin.jvm.internal.m.c(aVar7);
                                    ((l6) aVar7).f32868c.setLayoutParams(layoutParams);
                                    break;
                                default:
                                    kotlin.jvm.internal.m.f(it, "it");
                                    Object animatedValue2 = it.getAnimatedValue();
                                    kotlin.jvm.internal.m.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                    int iIntValue2 = ((Integer) animatedValue2).intValue();
                                    c1 c1Var3 = c1Var;
                                    ta.a aVar8 = c1Var3.f36400f;
                                    kotlin.jvm.internal.m.c(aVar8);
                                    ViewGroup.LayoutParams layoutParams2 = ((l6) aVar8).f32868c.getLayoutParams();
                                    layoutParams2.height = iIntValue2;
                                    ta.a aVar9 = c1Var3.f36400f;
                                    kotlin.jvm.internal.m.c(aVar9);
                                    ((l6) aVar9).f32868c.setLayoutParams(layoutParams2);
                                    break;
                            }
                        }
                    });
                    duration.start();
                    return;
                }
                ta.a aVar6 = c1Var.f36400f;
                m.c(aVar6);
                ((l6) aVar6).f32870e.animate().rotationBy(-180.0f).setDuration(300L).start();
                ta.a aVar7 = c1Var.f36400f;
                m.c(aVar7);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = ((l6) aVar7).f32869d.animate();
                Context contextRequireContext3 = c1Var.requireContext();
                m.e(contextRequireContext3, "requireContext(...)");
                ViewPropertyAnimator viewPropertyAnimatorTranslationYBy = viewPropertyAnimatorAnimate.translationYBy(j3.Z(-140, contextRequireContext3));
                viewPropertyAnimatorTranslationYBy.setInterpolator(new AccelerateInterpolator());
                viewPropertyAnimatorTranslationYBy.setDuration(300L);
                viewPropertyAnimatorTranslationYBy.start();
                j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new dm.a(c1Var, 15), vx.b.f54316e), c1Var.f36401t);
                Context contextRequireContext4 = c1Var.requireContext();
                m.e(contextRequireContext4, "requireContext(...)");
                int iZ2 = (int) j3.Z(250, contextRequireContext4);
                Context contextRequireContext5 = c1Var.requireContext();
                m.e(contextRequireContext5, "requireContext(...)");
                ValueAnimator duration2 = ValueAnimator.ofInt(iZ2, (int) j3.Z(numValueOf, contextRequireContext5)).setDuration(300L);
                final int i17 = 1;
                duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: hh.a1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator it) {
                        switch (i17) {
                            case 0:
                                kotlin.jvm.internal.m.f(it, "it");
                                Object animatedValue = it.getAnimatedValue();
                                kotlin.jvm.internal.m.d(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                                int iIntValue = ((Integer) animatedValue).intValue();
                                c1 c1Var2 = c1Var;
                                ta.a aVar8 = c1Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar8);
                                ViewGroup.LayoutParams layoutParams = ((l6) aVar8).f32868c.getLayoutParams();
                                layoutParams.height = iIntValue;
                                ta.a aVar9 = c1Var2.f36400f;
                                kotlin.jvm.internal.m.c(aVar9);
                                ((l6) aVar9).f32868c.setLayoutParams(layoutParams);
                                break;
                            default:
                                kotlin.jvm.internal.m.f(it, "it");
                                Object animatedValue2 = it.getAnimatedValue();
                                kotlin.jvm.internal.m.d(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                                int iIntValue2 = ((Integer) animatedValue2).intValue();
                                c1 c1Var3 = c1Var;
                                ta.a aVar10 = c1Var3.f36400f;
                                kotlin.jvm.internal.m.c(aVar10);
                                ViewGroup.LayoutParams layoutParams2 = ((l6) aVar10).f32868c.getLayoutParams();
                                layoutParams2.height = iIntValue2;
                                ta.a aVar11 = c1Var3.f36400f;
                                kotlin.jvm.internal.m.c(aVar11);
                                ((l6) aVar11).f32868c.setLayoutParams(layoutParams2);
                                break;
                        }
                    }
                });
                duration2.start();
                return;
            case 10:
                ((h0) obj).requireActivity().finish();
                return;
            case 11:
                ((jp.p0) obj).Y();
                return;
            case 12:
                DebugTestIndexActivity debugTestIndexActivity = (DebugTestIndexActivity) obj;
                int i18 = DebugTestIndexActivity.P;
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(debugTestIndexActivity), null, null, new gp.a(debugTestIndexActivity, null, 15), 3);
                return;
            case 13:
                ((j1) obj).v();
                return;
            case 14:
                p1 this$0 = (p1) obj;
                m.f(this$0, "this$0");
                this$0.cancel();
                return;
            case 15:
                ((d0) obj).C();
                return;
            case 16:
                ((k0) obj).F();
                return;
            case 17:
                qh.e eVar = (qh.e) obj;
                int id2 = view.getId();
                if (id2 == R.id.btn_resume) {
                    ta.a aVar8 = eVar.f36400f;
                    m.c(aVar8);
                    com.bumptech.glide.e.m(((u5) aVar8).f33419t);
                    ta.a aVar9 = eVar.f36400f;
                    m.c(aVar9);
                    ConstraintLayout constraintLayout = ((u5) aVar9).f33419t;
                    ta.a aVar10 = eVar.f36400f;
                    m.c(aVar10);
                    constraintLayout.removeViewAt(((u5) aVar10).f33419t.getChildCount() - 1);
                    eVar.z();
                    return;
                }
                if (id2 == R.id.btn_restart) {
                    ta.a aVar11 = eVar.f36400f;
                    m.c(aVar11);
                    com.bumptech.glide.e.m(((u5) aVar11).f33419t);
                    ta.a aVar12 = eVar.f36400f;
                    m.c(aVar12);
                    ConstraintLayout constraintLayout2 = ((u5) aVar12).f33419t;
                    ta.a aVar13 = eVar.f36400f;
                    m.c(aVar13);
                    constraintLayout2.removeViewAt(((u5) aVar13).f33419t.getChildCount() - 1);
                    eVar.y();
                    return;
                }
                if (id2 == R.id.btn_quit) {
                    l.m mVar2 = eVar.f36398d;
                    if (mVar2 != null) {
                        mVar2.finish();
                        return;
                    }
                    return;
                }
                ta.a aVar14 = eVar.f36400f;
                m.c(aVar14);
                com.bumptech.glide.e.m(((u5) aVar14).f33419t);
                ta.a aVar15 = eVar.f36400f;
                m.c(aVar15);
                ConstraintLayout constraintLayout3 = ((u5) aVar15).f33419t;
                ta.a aVar16 = eVar.f36400f;
                m.c(aVar16);
                constraintLayout3.removeViewAt(((u5) aVar16).f33419t.getChildCount() - 1);
                eVar.z();
                return;
            case 18:
                c0 c0Var = (c0) obj;
                int id3 = view.getId();
                if (id3 == R.id.btn_resume) {
                    ta.a aVar17 = c0Var.f36400f;
                    m.c(aVar17);
                    com.bumptech.glide.e.m(((w5) aVar17).f33540r);
                    ta.a aVar18 = c0Var.f36400f;
                    m.c(aVar18);
                    RelativeLayout relativeLayout = ((w5) aVar18).f33540r;
                    ta.a aVar19 = c0Var.f36400f;
                    m.c(aVar19);
                    relativeLayout.removeViewAt(((w5) aVar19).f33540r.getChildCount() - 1);
                    c0Var.B();
                    return;
                }
                if (id3 != R.id.btn_restart) {
                    if (id3 == R.id.btn_quit) {
                        l.m mVar3 = c0Var.f36398d;
                        if (mVar3 != null) {
                            mVar3.finish();
                            return;
                        }
                        return;
                    }
                    ta.a aVar20 = c0Var.f36400f;
                    m.c(aVar20);
                    com.bumptech.glide.e.m(((w5) aVar20).f33540r);
                    ta.a aVar21 = c0Var.f36400f;
                    m.c(aVar21);
                    RelativeLayout relativeLayout2 = ((w5) aVar21).f33540r;
                    ta.a aVar22 = c0Var.f36400f;
                    m.c(aVar22);
                    relativeLayout2.removeViewAt(((w5) aVar22).f33540r.getChildCount() - 1);
                    c0Var.B();
                    return;
                }
                ta.a aVar23 = c0Var.f36400f;
                m.c(aVar23);
                com.bumptech.glide.e.m(((w5) aVar23).f33540r);
                ta.a aVar24 = c0Var.f36400f;
                m.c(aVar24);
                RelativeLayout relativeLayout3 = ((w5) aVar24).f33540r;
                ta.a aVar25 = c0Var.f36400f;
                m.c(aVar25);
                relativeLayout3.removeViewAt(((w5) aVar25).f33540r.getChildCount() - 1);
                sh.c cVar = c0Var.S;
                if (cVar == null) {
                    m.n("viewModel");
                    throw null;
                }
                if (cVar.O) {
                    ta.a aVar26 = c0Var.f36400f;
                    m.c(aVar26);
                    ((w5) aVar26).f33527d.init(4);
                    ta.a aVar27 = c0Var.f36400f;
                    m.c(aVar27);
                    ((w5) aVar27).f33538p.setVisibility(0);
                    ta.a aVar28 = c0Var.f36400f;
                    m.c(aVar28);
                    ProgressBar progressBar = ((w5) aVar28).f33538p;
                    sh.c cVar2 = c0Var.S;
                    if (cVar2 == null) {
                        m.n("viewModel");
                        throw null;
                    }
                    progressBar.setMax(cVar2.c().size());
                    ta.a aVar29 = c0Var.f36400f;
                    m.c(aVar29);
                    ((w5) aVar29).f33538p.setProgress(0);
                } else {
                    ta.a aVar30 = c0Var.f36400f;
                    m.c(aVar30);
                    ((w5) aVar30).f33527d.setVisibility(8);
                    ta.a aVar31 = c0Var.f36400f;
                    m.c(aVar31);
                    ((w5) aVar31).f33538p.setVisibility(8);
                }
                th.e eVar2 = c0Var.N;
                if (eVar2 == null) {
                    m.n("player");
                    throw null;
                }
                eVar2.n();
                c0Var.z();
                sh.c cVar3 = c0Var.S;
                if (cVar3 == null) {
                    m.n("viewModel");
                    throw null;
                }
                cVar3.d();
                ta.a aVar32 = c0Var.f36400f;
                m.c(aVar32);
                TextView textView = ((w5) aVar32).f33542t;
                sh.c cVar4 = c0Var.S;
                if (cVar4 == null) {
                    m.n("viewModel");
                    throw null;
                }
                textView.setText("+" + c0Var.getString(R.string._s_xp, String.valueOf(cVar4.f51688c)));
                ta.a aVar33 = c0Var.f36400f;
                m.c(aVar33);
                ((w5) aVar33).f33531h.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
                ta.a aVar34 = c0Var.f36400f;
                m.c(aVar34);
                ((w5) aVar34).f33528e.setImageResource(R.drawable.ic_game_word_listen_btm);
                ta.a aVar35 = c0Var.f36400f;
                m.c(aVar35);
                ((w5) aVar35).f33539q.f32472c.setVisibility(8);
                c0Var.D();
                return;
            case 19:
                qh.k0 k0Var = (qh.k0) obj;
                int id4 = view.getId();
                if (id4 == R.id.btn_resume) {
                    ta.a aVar36 = k0Var.f36400f;
                    m.c(aVar36);
                    com.bumptech.glide.e.m(((x5) aVar36).f33600k);
                    ta.a aVar37 = k0Var.f36400f;
                    m.c(aVar37);
                    ConstraintLayout constraintLayout4 = ((x5) aVar37).f33600k;
                    ta.a aVar38 = k0Var.f36400f;
                    m.c(aVar38);
                    constraintLayout4.removeViewAt(((x5) aVar38).f33600k.getChildCount() - 1);
                    k0Var.z();
                    return;
                }
                if (id4 == R.id.btn_restart) {
                    ta.a aVar39 = k0Var.f36400f;
                    m.c(aVar39);
                    com.bumptech.glide.e.m(((x5) aVar39).f33600k);
                    ta.a aVar40 = k0Var.f36400f;
                    m.c(aVar40);
                    ConstraintLayout constraintLayout5 = ((x5) aVar40).f33600k;
                    ta.a aVar41 = k0Var.f36400f;
                    m.c(aVar41);
                    constraintLayout5.removeViewAt(((x5) aVar41).f33600k.getChildCount() - 1);
                    k0Var.y();
                    return;
                }
                if (id4 == R.id.btn_quit) {
                    l.m mVar4 = k0Var.f36398d;
                    if (mVar4 != null) {
                        mVar4.finish();
                        return;
                    }
                    return;
                }
                ta.a aVar42 = k0Var.f36400f;
                m.c(aVar42);
                com.bumptech.glide.e.m(((x5) aVar42).f33600k);
                ta.a aVar43 = k0Var.f36400f;
                m.c(aVar43);
                ConstraintLayout constraintLayout6 = ((x5) aVar43).f33600k;
                ta.a aVar44 = k0Var.f36400f;
                m.c(aVar44);
                constraintLayout6.removeViewAt(((x5) aVar44).f33600k.getChildCount() - 1);
                k0Var.z();
                return;
            case 20:
                FacebookButtonBase facebookButtonBase = (FacebookButtonBase) obj;
                int i19 = FacebookButtonBase.K;
                if (qf.a.b(FacebookButtonBase.class)) {
                    return;
                }
                try {
                    Context context = facebookButtonBase.getContext();
                    if (!qf.a.b(facebookButtonBase)) {
                        try {
                            se.m mVar5 = new se.m(context, (String) null);
                            String str2 = facebookButtonBase.f7709b;
                            s sVar = s.f49201a;
                            if (i0.c()) {
                                mVar5.g(str2, null);
                            }
                        } catch (Throwable th2) {
                            qf.a.a(facebookButtonBase, th2);
                        }
                        break;
                    }
                    View.OnClickListener onClickListener = facebookButtonBase.f7711d;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    View.OnClickListener onClickListener2 = facebookButtonBase.f7710c;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    qf.a.a(FacebookButtonBase.class, th3);
                    return;
                }
            case 21:
                ((fz.a) obj).invoke();
                return;
            case 22:
                tf.k this$1 = (tf.k) obj;
                m.f(this$1, "this$0");
                this$1.x();
                return;
            case 23:
                com.facebook.login.widget.b this$2 = (com.facebook.login.widget.b) obj;
                if (qf.a.b(com.facebook.login.widget.b.class)) {
                    return;
                }
                try {
                    m.f(this$2, "this$0");
                    this$2.a();
                    return;
                } catch (Throwable th4) {
                    qf.a.a(com.facebook.login.widget.b.class, th4);
                    return;
                }
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                um.f fVar2 = (um.f) obj;
                bc.i iVar4 = fVar2.f53033c;
                m.c(iVar4);
                iVar4.c();
                bc.i iVar5 = fVar2.f53033c;
                iVar5.f4122b = false;
                iVar5.a(fVar2.f53039i);
                iVar5.d();
                return;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                PTSyllableIntroductionActivity pTSyllableIntroductionActivity = (PTSyllableIntroductionActivity) obj;
                sj.a aVar45 = pTSyllableIntroductionActivity.f22000m0;
                int i21 = PTSyllableIntroductionActivity.f21987p0;
                m.d(view, "null cannot be cast to non-null type android.widget.TextView");
                String string4 = ((TextView) view).getText().toString();
                Matcher matcher = e0.u(0, " ", "compile(...)", string4, "input").matcher(string4);
                if (matcher.find()) {
                    ArrayList arrayList3 = new ArrayList(10);
                    int iC3 = 0;
                    do {
                        iC3 = p.c(matcher, string4, iC3, arrayList3);
                    } while (matcher.find());
                    p.B(iC3, string4, arrayList3);
                    listK3 = arrayList3;
                } else {
                    listK3 = o.K(string4.toString());
                }
                if (listK3.isEmpty()) {
                    listT2 = listT3;
                } else {
                    ListIterator listIterator3 = listK3.listIterator(listK3.size());
                    while (true) {
                        if (!listIterator3.hasPrevious()) {
                            listT2 = listT3;
                        } else if (((String) listIterator3.previous()).length() != 0) {
                            listT2 = e0.t(listIterator3, 1, listK3);
                        }
                    }
                }
                String[] strArr2 = (String[]) listT2.toArray(new String[0]);
                if (strArr2.length > 1) {
                    String strN2 = p0.n("getDefault(...)", strArr2[0], "toLowerCase(...)");
                    String str3 = strArr2[1];
                    int i22 = 1;
                    Locale locale6 = Locale.getDefault();
                    m.e(locale6, "getDefault(...)");
                    String lowerCase5 = str3.toLowerCase(locale6);
                    m.e(lowerCase5, "toLowerCase(...)");
                    if (strN2.equals(lowerCase5) || x.s0(strArr2[1], "[", false) || x.s0(strArr2[1], "(", false)) {
                        Matcher matcherW3 = p.w(0, " ", "compile(...)", string4);
                        if (matcherW3.find()) {
                            ArrayList arrayList4 = new ArrayList(10);
                            int iC4 = 0;
                            while (true) {
                                iC4 = p.c(matcherW3, string4, iC4, arrayList4);
                                if (matcherW3.find()) {
                                    i22 = 1;
                                } else {
                                    p.B(iC4, string4, arrayList4);
                                    listK4 = arrayList4;
                                }
                            }
                        } else {
                            listK4 = o.K(string4.toString());
                        }
                        if (!listK4.isEmpty()) {
                            ListIterator listIterator4 = listK4.listIterator(listK4.size());
                            while (listIterator4.hasPrevious()) {
                                if (((String) listIterator4.previous()).length() != 0) {
                                    listT3 = e0.t(listIterator4, i22, listK4);
                                }
                            }
                        }
                        String string5 = q.i1(((String[]) listT3.toArray(new String[0]))[0]).toString();
                        Locale locale7 = Locale.getDefault();
                        m.e(locale7, "getDefault(...)");
                        String lowerCase6 = string5.toLowerCase(locale7);
                        m.e(lowerCase6, "toLowerCase(...)");
                        strA2 = aVar45.a(lowerCase6);
                    } else {
                        String string6 = q.i1(string4).toString();
                        Locale locale8 = Locale.getDefault();
                        m.e(locale8, "getDefault(...)");
                        String lowerCase7 = string6.toLowerCase(locale8);
                        m.e(lowerCase7, "toLowerCase(...)");
                        strA2 = aVar45.a(lowerCase7);
                    }
                } else {
                    String string7 = q.i1(string4).toString();
                    Locale locale9 = Locale.getDefault();
                    m.e(locale9, "getDefault(...)");
                    String lowerCase8 = string7.toLowerCase(locale9);
                    m.e(lowerCase8, "toLowerCase(...)");
                    strA2 = aVar45.a(lowerCase8);
                }
                a9.i iVar6 = pTSyllableIntroductionActivity.f22001n0;
                qy.q qVar2 = fv.b.f28186a;
                iVar6.v(fv.b.b(strA2));
                return;
            default:
                ENSyllableIntroductionActivity eNSyllableIntroductionActivity = (ENSyllableIntroductionActivity) obj;
                ob.e eVar3 = eNSyllableIntroductionActivity.R;
                int i23 = ENSyllableIntroductionActivity.V;
                m.d(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView2 = (TextView) view;
                String string8 = textView2.getText().toString();
                List listW0 = q.W0(x.q0(string8, " [", "\n"), new String[]{"\n"}, 0, 6);
                Object tag = textView2.getTag(R.id.tag_is_bre);
                if (tag == null) {
                    tag = Boolean.FALSE;
                }
                boolean zBooleanValue = ((Boolean) tag).booleanValue();
                if (listW0.size() > 1) {
                    if (zBooleanValue) {
                        strI = p0.n("getDefault(...)", q.i1((String) listW0.get(0)).toString(), "toLowerCase(...)");
                        HashMap map = (HashMap) eVar3.f44805c;
                        if (map.containsKey(strI)) {
                            strI = (String) map.get(strI);
                        }
                    } else {
                        String string9 = q.i1((String) listW0.get(0)).toString();
                        Locale locale10 = Locale.getDefault();
                        m.e(locale10, "getDefault(...)");
                        String lowerCase9 = string9.toLowerCase(locale10);
                        m.e(lowerCase9, "toLowerCase(...)");
                        strI = eVar3.i(lowerCase9);
                    }
                } else if (zBooleanValue) {
                    strI = p0.n("getDefault(...)", q.i1(string8).toString(), "toLowerCase(...)");
                    HashMap map2 = (HashMap) eVar3.f44805c;
                    if (map2.containsKey(strI)) {
                        strI = (String) map2.get(strI);
                    }
                } else {
                    String string10 = q.i1(string8).toString();
                    Locale locale11 = Locale.getDefault();
                    m.e(locale11, "getDefault(...)");
                    String lowerCase10 = string10.toLowerCase(locale11);
                    m.e(lowerCase10, "toLowerCase(...)");
                    strI = eVar3.i(lowerCase10);
                }
                m.c(strI);
                String str4 = "enes-f-zy-" + strI + ".mp3";
                Locale locale12 = Locale.getDefault();
                m.e(locale12, "getDefault(...)");
                m.e(string8.toLowerCase(locale12), "toLowerCase(...)");
                eNSyllableIntroductionActivity.S.v(xt.b.a().b() + str4);
                return;
        }
    }
}
