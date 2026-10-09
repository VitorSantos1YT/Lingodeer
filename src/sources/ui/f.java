package ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLessonStudyActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LearnType;
import com.stkouyu.util.CommandUtil;
import hj.o4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import rt.m9;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends bp.m implements a {
    public a9.i O;
    public final String[] P;
    public final String[] Q;
    public final String[] R;

    public f() {
        super(e.f52985a, "AlphabetIntro");
        LearnType learnType = LearnType.LEARN;
        this.P = new String[]{"b", "p", "m", "f", "d", "t", "n", "l", "g", "k", "h", "j", "q", "x", "r", "z", "c", "s", "y", "w", "zh", "ch", CommandUtil.COMMAND_SH};
        this.Q = new String[]{"a", "o", "e", "i", "u", "ü"};
        this.R = new String[]{"ai", "ao", "an", "ang", "ou", "ong", "ei", "en", "eng", "er", "ia", "iao", "ian", "iang", "ie", "iu", "in", "ing", "iong", "ua", "uai", "uan", "uang", "uo", "ui", "un", "üe", "üan", "ün"};
    }

    @Override // ui.a
    public final HashMap k(xi.c pinyinLesson) {
        kotlin.jvm.internal.m.f(pinyinLesson, "pinyinLesson");
        HashMap map = new HashMap();
        map.put(fv.f.a(3, "m", "a"), fv.f.c(3, "m", "a"));
        map.put(fv.f.f(2, "a"), fv.f.g(2, "a"));
        map.put(fv.f.f(3, "a"), fv.f.g(3, "a"));
        map.put(fv.f.f(4, "a"), fv.f.g(4, "a"));
        for (String str : this.P) {
            map.put(fv.f.d(str), fv.f.e(str));
        }
        for (String str2 : this.Q) {
            map.put(fv.f.f(1, str2), fv.f.g(1, str2));
        }
        for (String str3 : this.R) {
            map.put(fv.f.f(1, str3), fv.f.g(1, str3));
        }
        return map;
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        t().c("jxz_alphabet_click_intro", new m9(26));
        this.O = new a9.i(1);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        String strY = ff.h.y(contextRequireContext, R.string.introduction);
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(strY, mVar, view);
        for (final String str : this.P) {
            View viewInflate = LayoutInflater.from(this.f36398d).inflate(R.layout.item_pinyin_lesson_study_text, (ViewGroup) null, false);
            kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) viewInflate;
            textView.setText(str);
            final int i11 = 1;
            bq.z.b(textView, new fz.c(this) { // from class: ui.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f52981b;

                {
                    this.f52981b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i11) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar);
                            iVar.v(com.bumptech.glide.f.r(1, str));
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar2 = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar2);
                            iVar2.v(com.bumptech.glide.f.r(1, str));
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar3 = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar3);
                            iVar3.v(com.bumptech.glide.f.r(1, str));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((o4) aVar).f33023d.addView(textView);
        }
        for (final String str2 : this.Q) {
            View viewInflate2 = LayoutInflater.from(this.f36398d).inflate(R.layout.item_pinyin_lesson_study_text, (ViewGroup) null, false);
            kotlin.jvm.internal.m.d(viewInflate2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) viewInflate2;
            textView2.setText(str2);
            final int i12 = 2;
            bq.z.b(textView2, new fz.c(this) { // from class: ui.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f52981b;

                {
                    this.f52981b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i12) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar);
                            iVar.v(com.bumptech.glide.f.r(1, str2));
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar2 = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar2);
                            iVar2.v(com.bumptech.glide.f.r(1, str2));
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar3 = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar3);
                            iVar3.v(com.bumptech.glide.f.r(1, str2));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((o4) aVar2).f33024e.addView(textView2);
        }
        for (final String str3 : this.R) {
            View viewInflate3 = LayoutInflater.from(this.f36398d).inflate(R.layout.item_pinyin_lesson_study_text, (ViewGroup) null, false);
            kotlin.jvm.internal.m.d(viewInflate3, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView3 = (TextView) viewInflate3;
            textView3.setText(str3);
            final int i13 = 0;
            bq.z.b(textView3, new fz.c(this) { // from class: ui.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f52981b;

                {
                    this.f52981b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i13) {
                        case 0:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar);
                            iVar.v(com.bumptech.glide.f.r(1, str3));
                            break;
                        case 1:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar2 = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar2);
                            iVar2.v(com.bumptech.glide.f.r(1, str3));
                            break;
                        default:
                            kotlin.jvm.internal.m.f(it, "it");
                            a9.i iVar3 = this.f52981b.O;
                            kotlin.jvm.internal.m.c(iVar3);
                            iVar3.v(com.bumptech.glide.f.r(1, str3));
                            break;
                    }
                    return qy.b0.f48488a;
                }
            });
            ta.a aVar3 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar3);
            ((o4) aVar3).f33025f.addView(textView3);
        }
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        final int i14 = 10;
        bq.z.b(((o4) aVar4).f33029j, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i15 = i14;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i15) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i16 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        final int i15 = 1;
        bq.z.b(((o4) aVar5).f33027h, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i16 = i15;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i16) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i17 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        final int i16 = 2;
        bq.z.b(((o4) aVar6).f33026g, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i17 = i16;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i17) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i18 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        final int i17 = 3;
        bq.z.b(((o4) aVar7).f33038t, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i18 = i17;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i18) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i19 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        final int i18 = 4;
        bq.z.b(((o4) aVar8).f33036r, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i19 = i18;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i19) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i110 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        final int i19 = 5;
        bq.z.b(((o4) aVar9).f33037s, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i19;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar10 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar10);
        final int i21 = 6;
        bq.z.b(((o4) aVar10).f33034p, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i21;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar11 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar11);
        final int i22 = 7;
        bq.z.b(((o4) aVar11).f33035q, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i22;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        final int i23 = 8;
        bq.z.b(((o4) aVar12).f33031l, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i23;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        final int i24 = 9;
        bq.z.b(((o4) aVar13).m, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i24;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        final int i25 = 11;
        bq.z.b(((o4) aVar14).f33032n, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i25;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar15 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar15);
        final int i26 = 12;
        bq.z.b(((o4) aVar15).f33033o, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i26;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar16 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar16);
        final int i27 = 13;
        bq.z.b(((o4) aVar16).f33030k, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i27;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar17 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar17);
        final int i28 = 14;
        bq.z.b(((o4) aVar17).f33021b, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i28;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        ta.a aVar18 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar18);
        final int i29 = 0;
        bq.z.b(((o4) aVar18).f33022c, new fz.c(this) { // from class: ui.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f52977b;

            {
                this.f52977b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                int i110 = i29;
                qy.b0 b0Var = qy.b0.f48488a;
                f fVar = this.f52977b;
                View it = (View) obj;
                switch (i110) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        xi.c cVar = new xi.c();
                        Locale locale = Locale.getDefault();
                        Context contextRequireContext2 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext2, "requireContext(...)");
                        cVar.f56096b = String.format(locale, ff.h.y(contextRequireContext2, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
                        cVar.f56095a = 2L;
                        Locale locale2 = Locale.getDefault();
                        Context contextRequireContext3 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext3, "requireContext(...)");
                        cVar.f56097c = String.format(locale2, ff.h.y(contextRequireContext3, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
                        cVar.f56098d = "b;p;m;f;d;t;n;l;";
                        cVar.f56099e = "a;ai;ao;an;ang;";
                        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
                        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
                        fVar.requireActivity().finish();
                        int i111 = PinyinLessonStudyActivity.S;
                        Context contextRequireContext4 = fVar.requireContext();
                        kotlin.jvm.internal.m.e(contextRequireContext4, "requireContext(...)");
                        Intent intent = new Intent(contextRequireContext4, (Class<?>) PinyinLessonStudyActivity.class);
                        intent.putExtra(INTENTS.EXTRA_OBJECT, cVar);
                        fVar.startActivity(intent);
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar = fVar.O;
                        kotlin.jvm.internal.m.c(iVar);
                        new xi.b(3, "m", "a", true);
                        String strA = fv.f.a(3, "m", "a");
                        iVar.v(xt.b.a().b() + strA);
                        break;
                    case 2:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar2 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar2);
                        new xi.b(3, "m", "a", true);
                        String strA2 = fv.f.a(3, "m", "a");
                        iVar2.v(xt.b.a().b() + strA2);
                        break;
                    case 3:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar3 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar3);
                        new xi.b(3, "m", "a", true);
                        String strA3 = fv.f.a(3, "m", "a");
                        iVar3.v(xt.b.a().b() + strA3);
                        break;
                    case 4:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar4 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar4);
                        iVar4.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 5:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar5 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar5);
                        iVar5.v(com.bumptech.glide.f.r(1, "m"));
                        break;
                    case 6:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar6 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar6);
                        iVar6.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 7:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar7 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar7);
                        iVar7.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 8:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar8 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar8);
                        iVar8.v(com.bumptech.glide.f.r(1, "a"));
                        break;
                    case 9:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar9 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar9);
                        iVar9.v(com.bumptech.glide.f.r(2, "a"));
                        break;
                    case 10:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar10 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar10);
                        new xi.b(3, "m", "a", true);
                        String strA4 = fv.f.a(3, "m", "a");
                        iVar10.v(xt.b.a().b() + strA4);
                        break;
                    case 11:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar11 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar11);
                        iVar11.v(com.bumptech.glide.f.r(3, "a"));
                        break;
                    case 12:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar12 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar12);
                        iVar12.v(com.bumptech.glide.f.r(4, "a"));
                        break;
                    case 13:
                        kotlin.jvm.internal.m.f(it, "it");
                        a9.i iVar13 = fVar.O;
                        kotlin.jvm.internal.m.c(iVar13);
                        iVar13.v(com.bumptech.glide.f.r(0, "a"));
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        l.m mVar2 = fVar.f36398d;
                        kotlin.jvm.internal.m.c(mVar2);
                        mVar2.finish();
                        break;
                }
                return b0Var;
            }
        });
        if (oz.q.v0("release", "debug", false)) {
            ta.a aVar19 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar19);
            ((o4) aVar19).f33028i.setOnLongClickListener(new fk.c(this, 7));
        }
    }
}
