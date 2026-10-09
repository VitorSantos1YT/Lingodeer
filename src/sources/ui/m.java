package ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.e1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bp.b1;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLearnActivity;
import com.lingo.lingoskill.chineseskill.ui.pinyin.PinyinLessonStudyActivity;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonIndexRecyclerAdapter;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.p4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends ji.f {
    public PinyinLessonIndexRecyclerAdapter O;
    public final ArrayList P;
    public final i.c Q;

    public m() {
        super(l.f53000a, "AlphabetLessonIndex");
        this.P = new ArrayList();
        com.bumptech.glide.d.u(qy.j.NONE, new b1(27, this, new tp.h0(this, 1)));
        i.c cVarRegisterForActivityResult = registerForActivityResult(new e1(4), new k(this, 0));
        kotlin.jvm.internal.m.e(cVarRegisterForActivityResult, "registerForActivityResult(...)");
        this.Q = cVarRegisterForActivityResult;
    }

    @f10.k(threadMode = ThreadMode.MAIN)
    public final void onRefreshEvent(np.b refreshEvent) {
        kotlin.jvm.internal.m.f(refreshEvent, "refreshEvent");
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        String string = getString(R.string.alphabet);
        kotlin.jvm.internal.m.e(string, "getString(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(string, mVar, view);
        new yi.a(this);
        this.O = new PinyinLessonIndexRecyclerAdapter(this.P, this);
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((p4) aVar).f33097d.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((p4) aVar2).f33097d.setAdapter(this.O);
        ii.a aVar3 = this.N;
        kotlin.jvm.internal.m.c(aVar3);
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        m mVar2 = ((yi.a) aVar3).f57845a;
        if (oi.a.f44920b == null) {
            synchronized (oi.a.class) {
                if (oi.a.f44920b == null) {
                    oi.a.f44920b = new oi.a(contextRequireContext);
                }
            }
        }
        oi.a aVar4 = oi.a.f44920b;
        kotlin.jvm.internal.m.c(aVar4);
        ArrayList arrayList = new ArrayList();
        Context context = aVar4.f44921a;
        arrayList.add(new xi.c(1L, ff.h.y(context, R.string.pinyin_what_is_pinyin)));
        xi.c cVar = new xi.c();
        cVar.f56096b = String.format(Locale.getDefault(), ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{1}, 1));
        cVar.f56095a = 2L;
        cVar.f56097c = String.format(Locale.getDefault(), ff.h.y(context, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “a”"}, 1));
        cVar.f56098d = "b;p;m;f;d;t;n;l;";
        cVar.f56099e = "a;ai;ao;an;ang;";
        cVar.K = "b_a_1;p_ai_1;m_ao_1;f_a_1;d_ai_1;t_an_1;n_ao_1;l_ao_1;b_ang_1;p_an_1;m_ang_1;f_ang_1;d_ang_1;";
        cVar.L = "b_a_1;b_ai_1;b_ao_1;b_an_1;b_ang_1;p_a_1;p_ai_1;p_ao_1;p_an_1;p_ang_1;m_a_1;m_ao_1;m_an_1;m_ang_1;f_a_1;f_an_1;f_ang_1;d_a_1;d_ai_1;d_ao_1;d_an_1;d_ang_1;t_a_1;t_ai_1;t_ao_1;t_an_1;t_ang_1;n_a_1;n_ao_1;n_an_1;n_ang_1;l_a_1;l_ao_1;l_ang_1;";
        arrayList.add(cVar);
        xi.c cVar2 = new xi.c();
        cVar2.f56096b = String.format(Locale.getDefault(), ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{2}, 1));
        cVar2.f56095a = 3L;
        cVar2.f56097c = String.format(Locale.getDefault(), ff.h.y(context, R.string._s_sound), Arrays.copyOf(new Object[]{"b, p, m, f, d, t, n, l + “o”"}, 1));
        cVar2.f56098d = "b;p;m;f;d;t;n;l;";
        cVar2.f56099e = "o;ou;ong;a;ai;ao;";
        cVar2.K = "b_o_1;p_o_1;m_o_1;d_ou_1;t_ong_1;l_ou_1;m_ou_1;p_ou_1;";
        cVar2.L = "b_o_1;p_o_1;p_ou_1;m_o_1;m_ou_1;d_ou_1;d_ong_1;t_ou_1;t_ong_1;l_ou_1;";
        arrayList.add(cVar2);
        xi.c cVar3 = new xi.c();
        cVar3.f56096b = String.format(Locale.getDefault(), ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{3}, 1));
        cVar3.f56095a = 4L;
        cVar3.f56097c = String.format(Locale.getDefault(), ff.h.y(context, R.string._s_sound), Arrays.copyOf(new Object[]{"g, k, h + “e”"}, 1));
        cVar3.f56098d = "g;k;h;b";
        cVar3.f56099e = "e;ei;en;eng;er;";
        cVar3.K = "g_e_1;k_e_1;h_e_1;k_ei_1;h_ei_1;g_en_1;g_eng_1;k_eng_1;h_eng_1;";
        cVar3.L = "g_e_1;g_en_1;g_eng_1;k_e_1;k_ei_1;k_eng_1;h_e_1;h_ei_1;h_eng_1;";
        arrayList.add(cVar3);
        xi.c cVar4 = new xi.c();
        cVar4.f56096b = String.format(Locale.getDefault(), ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{4}, 1));
        cVar4.f56095a = 5L;
        cVar4.f56097c = String.format(Locale.getDefault(), ff.h.y(context, R.string._s_sound), Arrays.copyOf(new Object[]{"j, q, x, y + “i”"}, 1));
        cVar4.f56098d = "j;q;x;y;";
        cVar4.f56099e = "i;ia;ian;iang;ie;iong;iu;in;ing;";
        cVar4.K = "j_i_1;q_i_1;x_i_1;j_ia_1;q_ia_1;j_ian_1;x_ian_1;q_iang_1;x_iang_1;j_ie_1;q_ie_1;j_iong_1;x_iong_1;q_iu_1;x_iu_1;j_in_1;x_in_1;j_ing_1;q_ing_1;y_a_1;y_an_1;y_ang_1;y_ong_1;y_ing_1;";
        cVar4.L = "j_i_1;j_ia_1;j_ian_1;j_iang_1;j_ie_1;j_iong_1;j_iu_1;j_in_1;j_ing_1;q_i_1;q_ia_1;q_ian_1;q_iang_1;q_ie_1;q_iu_1;q_in_1;q_ing_1;x_i_1;x_ia_1;x_ian_1;x_iang_1;x_ie_1;x_iong_1;x_iu_1;x_in_1;x_ing_1;y_i_1;y_in_1;y_ing_1;y_a_1;y_an_1;y_ang_1;y_e_1;y_ong_1;";
        arrayList.add(cVar4);
        xi.c cVar5 = new xi.c();
        cVar5.f56096b = String.format(Locale.getDefault(), ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{5}, 1));
        cVar5.f56095a = 6L;
        cVar5.f56097c = String.format(Locale.getDefault(), ff.h.y(context, R.string._s_sound), Arrays.copyOf(new Object[]{"z, c, s, zh, ch, sh, r, w + “u”"}, 1));
        cVar5.f56098d = "zh;ch;sh;r;z;c;s;w";
        cVar5.f56099e = "u;ua;uai;uan;uang;ui;un;uo;";
        cVar5.K = "zh_u_1;sh_ua_1;ch_uai_1;sh_uang_1;z_ui_1;c_un_1;s_uo_1;w_en_1;w_o_1;zh_uang_1;ch_un_1;z_u_1;s_uan_1;";
        cVar5.L = "zh_u_1;zh_ua_1;zh_uai_1;zh_uan_1;zh_uang_1;zh_ui_1;zh_un_1;zh_uo_1;ch_u_1;ch_ua_1;ch_uai_1;ch_uan_1;ch_uang_1;ch_ui_1;ch_un_1;ch_uo_1;sh_u_1;sh_ua_1;sh_uai_1;sh_uan_1;sh_uang_1;sh_uo_1;z_u_1;z_uan_1;z_ui_1;z_un_1;z_uo_1;c_u_1;c_uan_1;c_ui_1;c_un_1;c_uo_1;s_u_1;s_uan_1;s_ui_1;s_un_1;s_uo_1;w_u_1;w_a_1;w_ai_1;w_an_1;w_ang_1;w_eng_1;w_o_1;";
        arrayList.add(cVar5);
        xi.c cVar6 = new xi.c();
        cVar6.f56096b = String.format(Locale.getDefault(), ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{6}, 1));
        cVar6.f56095a = 7L;
        cVar6.f56097c = String.format(Locale.getDefault(), ff.h.y(context, R.string._s_sound), Arrays.copyOf(new Object[]{"j, q, x, n, l + “ü”"}, 1));
        cVar6.f56098d = "j;q;x;n;l;";
        cVar6.f56099e = "ü;üe;üan;ün;";
        cVar6.K = "j_ü o_1;q_ü_1;x_ü_1;j_üe_1;q_üe_1;x_üe_1;j_üan_1;q_üan_1;x_üan_1;j_ün_1;q_ün_1;x_ün_1;";
        cVar6.L = "j_ü_1;j_üe_1;j_üan_1;j_ün_1;q_ü_1;q_üe_1;q_üan_1;q_ün_1;x_ü_1;x_üe_1;x_üan_1;x_ün_1;";
        arrayList.add(cVar6);
        xi.c cVar7 = new xi.c();
        cVar7.f56096b = ep.a.D(String.format(Locale.getDefault(), ff.h.y(context, R.string.lesson_s), Arrays.copyOf(new Object[]{7}, 1)), " ", ff.h.y(context, R.string.tones));
        cVar7.f56095a = 8L;
        cVar7.f56097c = BuildConfig.VERSION_NAME;
        cVar7.f56098d = "b;p;m;f;d;t;n;l;g;k;h;j;q;x;z;c;s;zh;ch;sh;r;y;w;";
        cVar7.f56099e = "a;ai;an;ang;ao;i;ia;ian;iang;iao;ie;iong;iu;in;ing;u;ua;uai;uan;uang;ui;un;uo;e;ei;en;eng;er;o;ou;ong;ü;üe;üan;ün;";
        cVar7.K = "b_a_1;p_a_2;f_o_2;m_o_3;d_eng_1;t_ing_3;n_ü_3;g_uan_1;h_uo_3;k_uai_4;j_ia_1;q_ie_3;x_i_2;zh_ang_3;ch_a_4;sh_ua_1;r_i_4;z_u_1;c_an_3;s_e_4;w_o_3;y_ong_4;";
        cVar7.L = "sh_ui_3;c_eng_4;c_eng_3;c_eng_2;c_ou_4;c_eng_1;c_ong_1;c_en_2;c_ong_2;c_en_1;p_an_2;p_an_4;p_ang_1;p_ang_2;p_ang_3;p_ang_4;p_ao_1;p_ao_2;p_ao_3;p_ao_4;k_u_1;k_u_3;k_u_4;k_ua_1;k_ua_3;k_ua_4;k_uai_3;k_uai_4;t_uan_1;t_uan_2;t_uan_3;t_uan_4;t_ui_1;t_ui_2;t_ui_3;t_ui_4;t_un_1;t_un_2;x_üan_1;x_üe_1;x_ün_1;x_ü_1;z_a_1;z_a_2;z_a_3;z_ai_1;z_ai_3;z_ai_4;z_an_1;w_ang_4;w_ang_3;w_ang_2;w_ang_1;w_an_4;w_an_3;w_an_2;w_an_1;w_ai_4;w_ai_3;w_ai_2;ch_u_2;ch_u_1;ch_u_3;ch_u_4;ch_ua_1;ch_uai_1;ch_uai_2;f_u_1;f_u_2;f_u_3;f_u_4;f_ei_1;f_ei_2;f_ei_3;f_ei_4;f_en_1;f_en_2;f_en_3;w_o_1;w_eng_4;w_eng_2;w_eng_1;w_en_4;w_en_3;w_en_2;w_en_1;w_ei_4;w_ei_3;w_ei_2;w_ei_1;w_o_3;g_a_1;g_a_2;g_a_3;g_a_4;g_ai_1;g_ai_3;g_ai_4;s_u_1;s_i_4;s_u_2;";
        arrayList.add(cVar7);
        mVar2.P.clear();
        mVar2.P.addAll(arrayList);
        PinyinLessonIndexRecyclerAdapter pinyinLessonIndexRecyclerAdapter = mVar2.O;
        kotlin.jvm.internal.m.c(pinyinLessonIndexRecyclerAdapter);
        pinyinLessonIndexRecyclerAdapter.notifyDataSetChanged();
        mVar2.x();
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        if (b7.e0.d(ij.l.f34436b, 0) > 1) {
            ta.a aVar5 = mVar2.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            RecyclerView recyclerView = ((p4) aVar5).f33097d;
            recyclerView.postDelayed(new b2.c(4, recyclerView, new s0.u(mVar2, 12)), 0L);
        }
        View viewInflate = LayoutInflater.from(this.f36398d).inflate(R.layout.include_pinyin_lesson_index_header, (ViewGroup) null, false);
        kotlin.jvm.internal.m.d(viewInflate, "null cannot be cast to non-null type android.widget.ImageView");
        PinyinLessonIndexRecyclerAdapter pinyinLessonIndexRecyclerAdapter2 = this.O;
        kotlin.jvm.internal.m.c(pinyinLessonIndexRecyclerAdapter2);
        pinyinLessonIndexRecyclerAdapter2.addHeaderView((ImageView) viewInflate);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        bq.z.b(((p4) aVar6).f33096c, new j(this, 0));
    }

    public final void x() {
        if (ij.l.f34436b == null) {
            synchronized (ij.l.class) {
                if (ij.l.f34436b == null) {
                    ij.l.f34436b = new ij.l();
                }
            }
        }
        if (b7.e0.d(ij.l.f34436b, 0) > 1) {
            ta.a aVar = this.f36400f;
            kotlin.jvm.internal.m.c(aVar);
            ((p4) aVar).f33095b.setVisibility(0);
        } else {
            ta.a aVar2 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar2);
            ((p4) aVar2).f33095b.setVisibility(8);
        }
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        bq.z.b(((p4) aVar3).f33095b, new j(this, 1));
    }

    public final void y(xi.c pinyinLesson) {
        kotlin.jvm.internal.m.f(pinyinLesson, "pinyinLesson");
        r().hasEnterAlphabet = true;
        r().updateEntry("hasEnterAlphabet");
        long j11 = pinyinLesson.f56095a;
        if (j11 == -2) {
            z(pinyinLesson);
            return;
        }
        if (j11 == -3) {
            int[] iArr = bq.r.f4959a;
            Context contextRequireContext = requireContext();
            kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
            bq.m.C(contextRequireContext, BuildConfig.VERSION_NAME);
            return;
        }
        t().c("jxz_alphabet_click_lesson", new s0.u(pinyinLesson, 13));
        int i11 = PinyinLessonStudyActivity.S;
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        Intent intent = new Intent(mVar, (Class<?>) PinyinLessonStudyActivity.class);
        intent.putExtra(INTENTS.EXTRA_OBJECT, pinyinLesson);
        this.Q.a(intent);
    }

    public final void z(xi.c cVar) {
        String strM = BuildConfig.VERSION_NAME;
        Iterator it = this.P.iterator();
        kotlin.jvm.internal.m.e(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            kotlin.jvm.internal.m.e(next, "next(...)");
            xi.c cVar2 = (xi.c) next;
            long j11 = cVar2.f56095a;
            if (j11 > 1) {
                if (ij.l.f34436b == null) {
                    synchronized (ij.l.class) {
                        if (ij.l.f34436b == null) {
                            ij.l.f34436b = new ij.l();
                        }
                    }
                }
                if (j11 <= b7.e0.d(ij.l.f34436b, 0)) {
                    strM = defpackage.e.m(strM, cVar2.L);
                }
            }
        }
        cVar.f56098d = "b;p;m;f;d;t;n;l;g;k;h;j;q;x;z;c;s;zh;ch;sh;r;y;w;";
        cVar.f56099e = "a;ai;an;ang;ao;i;ia;ian;iang;iao;ie;iong;iu;in;ing;u;ua;uai;uan;uang;ui;un;uo;e;ei;en;eng;er;o;ou;ong;ü;üe;üan;ün;";
        cVar.L = strM;
        int i11 = PinyinLearnActivity.R;
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        startActivity(cf.x.A(mVar, cVar, 1));
    }
}
