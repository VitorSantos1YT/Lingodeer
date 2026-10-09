package com.lingo.lingoskill.chineseskill.ui.sc.adapter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.p0;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.recyclerview.widget.RecyclerView;
import au.d1;
import bq.f;
import bq.z;
import cf.x;
import cj.b;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.android.flexbox.FlexboxLayout;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView;
import com.lingo.lingoskill.object.TravelPhrase;
import com.lingo.lingoskill.object.Word;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.RxPermissions;
import ej.c;
import ff.h;
import fr.j3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.m;
import rz.e0;
import th.e;
import ur.a;
import vy.d;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class ScDetailAdapter extends BaseQuickAdapter<TravelPhrase, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f21759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f21760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f21761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f21762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LifecycleCoroutineScope f21763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vt.e f21764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f21765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f21766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f21767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f21768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f21770l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScDetailAdapter(ArrayList arrayList, e player, f audioRecorder, RecyclerView recyclerView, a eventTracker, LifecycleCoroutineScope lifecycleScope, vt.e bookmarkDataRepository, c cVar) {
        super(R.layout.item_cs_sc_detail, arrayList);
        m.f(player, "player");
        m.f(audioRecorder, "audioRecorder");
        m.f(eventTracker, "eventTracker");
        m.f(lifecycleScope, "lifecycleScope");
        m.f(bookmarkDataRepository, "bookmarkDataRepository");
        this.f21759a = player;
        this.f21760b = audioRecorder;
        this.f21761c = recyclerView;
        this.f21762d = eventTracker;
        this.f21763e = lifecycleScope;
        this.f21764f = bookmarkDataRepository;
        this.f21765g = cVar;
        this.f21770l = new LinkedHashMap();
        d dVar = null;
        e0.B(lifecycleScope, null, null, new b(arrayList, this, dVar, 0), 3);
        e0.B(lifecycleScope, null, null, new b1.c(23, this, arrayList, dVar), 3);
    }

    public static void a(ScDetailAdapter scDetailAdapter, BaseViewHolder baseViewHolder, TravelPhrase travelPhrase, View it) {
        m.f(it, "it");
        xq.c cVar = new xq.c(scDetailAdapter, baseViewHolder, travelPhrase, 5);
        Context context = scDetailAdapter.mContext;
        m.d(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        RxPermissions rxPermissions = new RxPermissions((p0) context);
        Context mContext = scDetailAdapter.mContext;
        m.e(mContext, "mContext");
        rxPermissions.setLogging(true);
        if (rxPermissions.isGranted("android.permission.RECORD_AUDIO") && rxPermissions.isGranted("android.permission.RECORD_AUDIO")) {
            cVar.m();
        } else {
            rxPermissions.request("android.permission.RECORD_AUDIO").h(new xq.c(cVar, mContext, rxPermissions, 17), vx.b.f54316e);
        }
    }

    public final void b(ImageView imageView, String str) {
        Boolean bool = (Boolean) this.f21770l.get(str);
        if (bool != null ? bool.booleanValue() : false) {
            imageView.setImageResource(R.drawable.sc_item_fav);
        } else {
            imageView.setImageResource(R.drawable.sc_item_not_fav_bmp);
        }
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public final void convert(BaseViewHolder helper, TravelPhrase travelPhrase) {
        TravelPhrase item = travelPhrase;
        m.f(helper, "helper");
        m.f(item, "item");
        helper.setText(R.id.tv_name, item.getTranslation());
        Context context = this.mContext;
        List<Word> sentenceWords = item.getSentenceWords();
        FlexboxLayout flexboxLayout = (FlexboxLayout) helper.getView(R.id.flex_sentence);
        m.c(context);
        m.c(sentenceWords);
        m.c(flexboxLayout);
        int i11 = 0;
        cj.c cVar = new cj.c(context, sentenceWords, flexboxLayout, i11);
        LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
        int i12 = 2;
        if (x.n().keyLanguage == 10 || x.n().keyLanguage == 51) {
            Context mContext = this.mContext;
            m.e(mContext, "mContext");
            cVar.f59274j = (int) j3.Z(2, mContext);
        } else {
            cVar.f59274j = 0;
        }
        cVar.f59277n = true;
        cVar.d();
        if (x.n().keyLanguage == 51 || x.n().keyLanguage == 57) {
            TextView textView = (TextView) helper.getView(R.id.tv_ara_luoma);
            if (textView != null) {
                textView.setVisibility(0);
                String phraseLuoma = item.getPhraseLuoma();
                m.e(phraseLuoma, "getPhraseLuoma(...)");
                textView.setText(oz.x.q0(phraseLuoma, "/", " "));
            }
        } else {
            TextView textView2 = (TextView) helper.getView(R.id.tv_ara_luoma);
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        View view = helper.getView(R.id.view_line);
        FrameLayout frameLayout = (FrameLayout) helper.getView(R.id.frame_score);
        helper.getView(R.id.view_score_line);
        SlowPlaySwitchBtn slowPlaySwitchBtn = (SlowPlaySwitchBtn) helper.getView(R.id.sps_btn);
        view.setVisibility(4);
        frameLayout.setVisibility(4);
        slowPlaySwitchBtn.setChecked(this.f21769k);
        z.a(slowPlaySwitchBtn, 0L, new av.d(slowPlaySwitchBtn, 27));
        z.b(slowPlaySwitchBtn, new d1(28, slowPlaySwitchBtn, this));
        helper.getView(R.id.iv_recorder).setBackgroundResource(R.drawable.bg_lesson_index_start_btn_enable);
        View view2 = helper.getView(R.id.wave_view);
        m.d(view2, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        ((WaveView) view2).b();
        View view3 = helper.getView(R.id.iv_recorder);
        m.e(view3, "getView(...)");
        Context mContext2 = this.mContext;
        m.e(mContext2, "mContext");
        x.L((ImageView) view3, R.drawable.record_new_white, ColorStateList.valueOf(mContext2.getColor(R.color.white)));
        int adapterPosition = helper.getAdapterPosition();
        int i13 = this.f21766h;
        f fVar = this.f21760b;
        if (adapterPosition == i13) {
            if (fVar.f4943a) {
                fVar.t();
            }
            helper.getView(R.id.rl_detail).setVisibility(0);
            this.f21765g.invoke(Long.valueOf(item.getID()));
        } else {
            helper.getView(R.id.rl_detail).setVisibility(8);
        }
        String strK = b7.e0.k(item.getID(), xt.d.k(x.n().keyLanguage), "_sc_");
        View view4 = helper.getView(R.id.iv_fav);
        m.e(view4, "getView(...)");
        b((ImageView) view4, strK);
        View view5 = helper.getView(R.id.iv_repeat);
        m.e(view5, "getView(...)");
        ImageView imageView = (ImageView) view5;
        if (this.f21767i) {
            imageView.setImageResource(R.drawable.sc_ic_repeat);
        } else {
            imageView.setImageResource(R.drawable.sc_ic_no_repeat);
        }
        View itemView = helper.itemView;
        m.e(itemView, "itemView");
        z.b(itemView, new cj.a(this, helper, item, i11));
        View view6 = helper.getView(R.id.iv_fav);
        m.e(view6, "getView(...)");
        z.b(view6, new cj.a(item, this, helper));
        View view7 = helper.getView(R.id.iv_repeat);
        m.e(view7, "getView(...)");
        z.b(view7, new d1(29, this, helper));
        View view8 = helper.getView(R.id.iv_recorder);
        m.e(view8, "getView(...)");
        z.b(view8, new br.b(25));
        View view9 = helper.getView(R.id.iv_play_recorder);
        m.e(view9, "getView(...)");
        z.b(view9, new br.b(26));
        av.d dVar = new av.d(helper, 28);
        fVar.getClass();
        fVar.f4944b = dVar;
        View view10 = helper.getView(R.id.iv_recorder);
        m.e(view10, "getView(...)");
        z.b(view10, new cj.a(this, helper, item, i12));
        android.support.v4.media.session.a.H(helper.getView(R.id.iv_play_recorder).getBackground());
        View view11 = helper.getView(R.id.iv_play_recorder);
        m.e(view11, "getView(...)");
        z.b(view11, new cj.a(this, helper, item, 3));
        View viewFindViewById = helper.itemView.findViewById(R.id.wave_view);
        m.d(viewFindViewById, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        ((WaveView) viewFindViewById).setDuration(2500L);
        View viewFindViewById2 = helper.itemView.findViewById(R.id.wave_view);
        m.d(viewFindViewById2, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        ((WaveView) viewFindViewById2).setInitialRadius(h.l(36.0f));
        View viewFindViewById3 = helper.itemView.findViewById(R.id.wave_view);
        m.d(viewFindViewById3, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        ((WaveView) viewFindViewById3).setStyle(Paint.Style.FILL);
        View viewFindViewById4 = helper.itemView.findViewById(R.id.wave_view);
        m.d(viewFindViewById4, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        ((WaveView) viewFindViewById4).setSpeed(500);
        View viewFindViewById5 = helper.itemView.findViewById(R.id.wave_view);
        m.d(viewFindViewById5, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        Context mContext3 = this.mContext;
        m.e(mContext3, "mContext");
        ((WaveView) viewFindViewById5).setColor(mContext3.getColor(R.color.color_FED068));
        View viewFindViewById6 = helper.itemView.findViewById(R.id.wave_view);
        m.d(viewFindViewById6, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        ((WaveView) viewFindViewById6).setMaxRadius(h.l(52.0f));
        View viewFindViewById7 = helper.itemView.findViewById(R.id.wave_view);
        m.d(viewFindViewById7, "null cannot be cast to non-null type com.lingo.lingoskill.chineseskill.ui.pinyin.widget.WaveView");
        ((WaveView) viewFindViewById7).setInterpolator(new AccelerateDecelerateInterpolator());
        ImageView imageView2 = (ImageView) helper.getView(R.id.iv_play_recorder);
        if (com.google.android.material.datepicker.d.D(x.n().tempDir + xt.d.k(x.n().keyLanguage) + "_sc_" + item.getCID() + "_" + item.getID() + "_recorder.mp3")) {
            imageView2.setVisibility(0);
            ViewParent parent = imageView2.getParent();
            m.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
            ((FrameLayout) parent).setVisibility(0);
            imageView2.setClickable(true);
            return;
        }
        imageView2.setVisibility(4);
        ViewParent parent2 = imageView2.getParent();
        m.d(parent2, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) parent2).setVisibility(4);
        imageView2.setClickable(false);
    }
}
