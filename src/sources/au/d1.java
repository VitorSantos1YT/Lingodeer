package au;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import b0.a2;
import b0.b2;
import b0.c2;
import b0.v1;
import b0.y1;
import bp.g4;
import bp.i4;
import bp.r2;
import bt.a3;
import bt.b6;
import bt.c3;
import bt.h8;
import com.chad.library.adapter.base.BaseViewHolder;
import com.google.api.Service;
import com.lingo.course.ui.CourseReviewListActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTestActivity;
import com.lingo.lingoskill.ar.ui.syllable.ARSyllableTestIndexActivity;
import com.lingo.lingoskill.chineseskill.ui.sc.adapter.ScDetailAdapter;
import com.lingo.lingoskill.ui.base.NewsFeedActivity;
import com.lingo.lingoskill.widget.SlowPlaySwitchBtn;
import com.lingo.main.ui.MainComposeActivity;
import com.lingodeer.R;
import com.lingodeer.data.model.CourseWord;
import com.lingodeer.data.model.INTENTS;
import com.lingodeer.data.model.LoginHistory;
import com.lingodeer.database.model.SubLearnProgressEntity;
import com.lingodeer.database.model.UnitFinishStatusEntity;
import com.lingodeer.database.model.UserInfoEntity;
import dt.z4;
import i0.pKy.shrCcjmOhAmRC;
import java.util.ArrayList;
import java.util.List;
import jt.m1;
import jt.q1;
import rt.m8;
import rt.p7;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d1 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2974c;

    public /* synthetic */ d1(int i11, Object obj, Object obj2) {
        this.f2972a = i11;
        this.f2973b = obj;
        this.f2974c = obj2;
    }

    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Object, qy.h] */
    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f2972a;
        int i12 = 2;
        int i13 = 4;
        int i14 = 0;
        int i15 = 3;
        vy.d dVar = null;
        int i16 = 1;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f2974c;
        Object obj3 = this.f2973b;
        switch (i11) {
            case 0:
                ja.a _connection = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection, "_connection");
                ((e1) obj3).f2985b.D(_connection, (SubLearnProgressEntity) obj2);
                return b0Var;
            case 1:
                ja.a _connection2 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection2, "_connection");
                ((e1) obj3).f2985b.C(_connection2, (ArrayList) obj2);
                return b0Var;
            case 2:
                ja.a _connection3 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection3, "_connection");
                ((f1) obj3).f2992b.D(_connection3, (UnitFinishStatusEntity) obj2);
                return b0Var;
            case 3:
                ja.a _connection4 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection4, "_connection");
                ((f1) obj3).f2992b.C(_connection4, (ArrayList) obj2);
                return b0Var;
            case 4:
                ja.a _connection5 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection5, "_connection");
                ((j1) obj3).f3030b.C(_connection5, (List) obj2);
                return b0Var;
            case 5:
                ja.a _connection6 = (ja.a) obj;
                kotlin.jvm.internal.m.f(_connection6, "_connection");
                ((j1) obj3).f3030b.D(_connection6, (UserInfoEntity) obj2);
                return b0Var;
            case 6:
                b0.j0 j0Var = (b0.j0) obj3;
                b0.h0 h0Var = (b0.h0) obj2;
                j0Var.f3569a.c(h0Var);
                j0Var.f3570b.setValue(Boolean.TRUE);
                return new b0.l0(i14, j0Var, h0Var);
            case 7:
                rz.e0.B((rz.b0) obj3, null, rz.d0.UNDISPATCHED, new a2((c2) obj2, null), 1);
                return new b2();
            case 8:
                c2 c2Var = (c2) obj3;
                c2 c2Var2 = (c2) obj2;
                c2Var.f3467j.add(c2Var2);
                return new b0.l0(i16, c2Var, c2Var2);
            case 9:
                return new b0.l0(i12, (c2) obj3, (v1) obj2);
            case 10:
                c2 c2Var3 = (c2) obj3;
                y1 y1Var = (y1) obj2;
                c2Var3.f3466i.add(y1Var);
                return new b0.l0(i15, c2Var3, y1Var);
            case 11:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) obj3;
                kotlin.jvm.internal.w wVar2 = (kotlin.jvm.internal.w) obj2;
                oz.l lVar = (oz.l) obj;
                if (wVar.f38359a == -1) {
                    wVar.f38359a = lVar.b().f40532a;
                }
                wVar2.f38359a = lVar.b().f40533b + 1;
                return shrCcjmOhAmRC.yYg;
            case 12:
                r2 r2Var = (r2) obj3;
                View it = (View) obj;
                kotlin.jvm.internal.m.f(it, "it");
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(r2Var), null, null, new a0.e0(i13, r2Var, (LoginHistory) obj2, dVar), 3);
                return b0Var;
            case 13:
                NewsFeedActivity newsFeedActivity = (NewsFeedActivity) obj2;
                lc.d it2 = (lc.d) obj;
                int i17 = NewsFeedActivity.R;
                kotlin.jvm.internal.m.f(it2, "it");
                ((lc.d) obj3).dismiss();
                rz.e0.B(LifecycleOwnerKt.getLifecycleScope(newsFeedActivity), null, null, new b1.c(newsFeedActivity, dVar, 9), 3);
                return b0Var;
            case 14:
                i4 i4Var = (i4) obj3;
                lc.d it3 = (lc.d) obj;
                kotlin.jvm.internal.m.f(it3, "it");
                g4 g4Var = new g4((String[]) obj2, i14);
                int i18 = qx.d.f48466a;
                th.j.a(new zx.c(g4Var).f(ky.e.f38937b).b(px.b.a()).c(new a0.b2(i4Var, i12), bp.h.f4609d), i4Var.f36401t);
                return b0Var;
            case 15:
                MainComposeActivity mainComposeActivity = (MainComposeActivity) obj3;
                l1.a1 a1Var = (l1.a1) obj2;
                String resStr = (String) obj;
                kotlin.jvm.internal.m.f(resStr, "resStr");
                if (resStr.length() > 0) {
                    ((l1.h1) a1Var).m(((xt.u) mainComposeActivity.N.getValue()).a(resStr));
                }
                return b0Var;
            case 16:
                CourseWord it4 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it4, "it");
                bt.i0.f((jt.g) obj3, (ys.d0) obj2, ns.o.K(it4.getAudioUri().toString()), new ht.e(it4.getVisemedMap()));
                return b0Var;
            case 17:
                CourseWord option = (CourseWord) obj;
                kotlin.jvm.internal.m.f(option, "option");
                rz.e0.B((rz.b0) obj3, null, null, new b1.c(16, (jt.l0) obj2, option, dVar), 3);
                return b0Var;
            case 18:
                w2.x it5 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it5, "it");
                int iQ = hz.b.Q(Float.intBitsToFloat((int) (it5.c(0L) & 4294967295L)));
                ((x1.s) obj3).put(Integer.valueOf(((CourseWord) obj2).getRandomId()), new h8(iQ, ((int) (4294967295L & it5.m())) + iQ));
                return b0Var;
            case 19:
                w2.x it6 = (w2.x) obj;
                kotlin.jvm.internal.m.f(it6, "it");
                ((l1.h1) ((l1.a1) obj3)).m((int) (it6.m() & 4294967295L));
                ((l1.h1) ((l1.a1) obj2)).m((int) (it6.m() >> 32));
                return b0Var;
            case 20:
                CourseWord it7 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it7, "it");
                rz.e0.B((rz.b0) obj3, null, null, new c3((m1) obj2, it7, dVar, i16), 3);
                return b0Var;
            case 21:
                CourseWord it8 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it8, "it");
                rz.e0.B((rz.b0) obj3, null, null, new b6((q1) obj2, it8, dVar, i16), 3);
                return b0Var;
            case 22:
                l1.b1 b1Var = (l1.b1) obj3;
                ys.d0 d0Var = (ys.d0) obj2;
                String it9 = (String) obj;
                kotlin.jvm.internal.m.f(it9, "it");
                bp.p pVar = new bp.p(21, b1Var);
                if (d0Var != null) {
                    ys.d0.e(d0Var, it9, new a3(1, pVar, kotlin.jvm.internal.l.class, "suspendConversion1", "CourseTestWordJudgeRoute$onClickPlayAudio$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 4);
                }
                b1Var.setValue(new ht.c(ry.r.f50854a, 0, 1.0f));
                return b0Var;
            case 23:
                CourseWord it10 = (CourseWord) obj;
                kotlin.jvm.internal.m.f(it10, "it");
                ((fz.c) obj3).invoke(it10);
                String string = it10.getAudioUri().toString();
                kotlin.jvm.internal.m.e(string, "toString(...)");
                ((fz.e) obj2).invoke(string, new ht.d(it10.getWordId(), it10.getVisemedMap()));
                return b0Var;
            case Service.METRICS_FIELD_NUMBER /* 24 */:
                fz.a aVar = (fz.a) obj3;
                l1.b1 b1Var2 = (l1.b1) obj2;
                z4 videoState = (z4) obj;
                kotlin.jvm.internal.m.f(videoState, "videoState");
                if (videoState != z4.Idle) {
                    aVar.invoke();
                    b1Var2.setValue(new ht.j());
                } else if (((ht.l) b1Var2.getValue()) instanceof ht.j) {
                    b1Var2.setValue(ht.a.f33722e);
                }
                return b0Var;
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                ((fz.e) obj3).invoke(b7.e0.m((CourseWord) obj, "it", "toString(...)"), new ju.d(25));
                ((l1.b1) obj2).setValue(ht.a.f33722e);
                return b0Var;
            case Service.BILLING_FIELD_NUMBER /* 26 */:
                m8 m8Var = (m8) obj3;
                String folderId = (String) obj;
                int i19 = CourseReviewListActivity.L;
                kotlin.jvm.internal.m.f(folderId, "folderId");
                m8Var.getClass();
                m8Var.f(new p7(folderId));
                ((l1.b1) obj2).setValue(Boolean.FALSE);
                return b0Var;
            case 27:
                ARSyllableTestIndexActivity aRSyllableTestIndexActivity = (ARSyllableTestIndexActivity) obj3;
                View it11 = (View) obj;
                int i21 = ARSyllableTestIndexActivity.Q;
                kotlin.jvm.internal.m.f(it11, "it");
                aRSyllableTestIndexActivity.finish();
                Intent intent = new Intent(aRSyllableTestIndexActivity, (Class<?>) ARSyllableTestActivity.class);
                intent.putExtra(INTENTS.EXTRA_OBJECT, (bi.a) obj2);
                aRSyllableTestIndexActivity.startActivity(intent);
                return b0Var;
            case Service.MONITORING_FIELD_NUMBER /* 28 */:
                SlowPlaySwitchBtn slowPlaySwitchBtn = (SlowPlaySwitchBtn) obj3;
                View it12 = (View) obj;
                kotlin.jvm.internal.m.f(it12, "it");
                slowPlaySwitchBtn.c();
                ((ScDetailAdapter) obj2).f21769k = slowPlaySwitchBtn.f22150c;
                return b0Var;
            default:
                ScDetailAdapter scDetailAdapter = (ScDetailAdapter) obj3;
                View it13 = (View) obj;
                kotlin.jvm.internal.m.f(it13, "it");
                scDetailAdapter.f21767i = !scDetailAdapter.f21767i;
                View view = ((BaseViewHolder) obj2).getView(R.id.iv_repeat);
                kotlin.jvm.internal.m.e(view, "getView(...)");
                ImageView imageView = (ImageView) view;
                if (scDetailAdapter.f21767i) {
                    imageView.setImageResource(R.drawable.sc_ic_repeat);
                } else {
                    imageView.setImageResource(R.drawable.sc_ic_no_repeat);
                }
                return b0Var;
        }
    }
}
