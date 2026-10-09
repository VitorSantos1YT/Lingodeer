package ui;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonStudySimpleAdapter;
import com.lingo.lingoskill.chineseskill.ui.pinyin.adapter.PinyinLessonStudySimpleAdapter2;
import com.lingodeer.R;
import com.lingodeer.data.model.INTENTS;
import com.tbruyelle.rxpermissions3.BuildConfig;
import hj.r4;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class b0 extends bp.m implements a {
    public xi.c O;
    public PinyinLessonStudySimpleAdapter P;
    public PinyinLessonStudySimpleAdapter2 Q;
    public PinyinLessonStudySimpleAdapter2 R;
    public a9.i S;
    public ImageView T;

    public b0() {
        super(a0.f52974a, BuildConfig.VERSION_NAME);
    }

    @Override // ui.a
    public final HashMap k(xi.c pinyinLesson) {
        kotlin.jvm.internal.m.f(pinyinLesson, "pinyinLesson");
        HashMap map = new HashMap();
        map.put(fv.f.d("y"), fv.f.e("y"));
        map.put(fv.f.a(1, "j", "ü"), fv.f.c(1, "j", "ü"));
        map.put(fv.f.a(1, "y", "u"), fv.f.c(1, "y", "u"));
        map.put(fv.f.a(1, "y", "üe"), fv.f.c(1, "y", "üe"));
        map.put(fv.f.a(1, "y", "üan"), fv.f.c(1, "y", "üan"));
        map.put(fv.f.a(1, "y", "ün"), fv.f.c(1, "y", "ün"));
        e00.i iVarA = kotlin.jvm.internal.l.a(pinyinLesson.f56098d.split(";"));
        while (iVarA.hasNext()) {
            String str = (String) iVarA.next();
            qy.q qVar = fv.f.f28191a;
            kotlin.jvm.internal.m.c(str);
            map.put(fv.f.d(str), fv.f.e(str));
        }
        e00.i iVarA2 = kotlin.jvm.internal.l.a(pinyinLesson.f56099e.split(";"));
        while (iVarA2.hasNext()) {
            String str2 = (String) iVarA2.next();
            qy.q qVar2 = fv.f.f28191a;
            kotlin.jvm.internal.m.c(str2);
            map.put(fv.f.f(1, str2), fv.f.g(1, str2));
        }
        return map;
    }

    @Override // ji.e
    public final void q() {
        a9.i iVar = this.S;
        if (iVar != null) {
            kotlin.jvm.internal.m.c(iVar);
            iVar.l();
        }
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        xi.c cVar = (xi.c) requireArguments().getParcelable(INTENTS.EXTRA_OBJECT);
        this.O = cVar;
        kotlin.jvm.internal.m.c(cVar);
        String str = cVar.f56096b;
        kotlin.jvm.internal.m.e(str, "getLessonName(...)");
        l.m mVar = this.f36398d;
        kotlin.jvm.internal.m.c(mVar);
        View view = this.f36399e;
        kotlin.jvm.internal.m.c(view);
        ve.i.H(str, mVar, view);
        a9.i iVar = new a9.i(1);
        this.S = iVar;
        iVar.f521e = new k(this, 2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new xi.a("ü", getString(R.string.cn_alp_say_ee_with_rounded_lips_in_german_or_french)));
        arrayList.add(new xi.a("üe", getString(R.string.cn_alp_say_ee_with_round_lips_and_add_eh)));
        arrayList.add(new xi.a("üan", getString(R.string.cn_alp_say_ee_with_rounded_lips_and_an_in_woman)));
        arrayList.add(new xi.a("ün", getString(R.string.cn_alp_say_ee_with_rounded_lips_and_add_n)));
        final int i11 = 0;
        this.P = new PinyinLessonStudySimpleAdapter(arrayList, new fz.e(this) { // from class: ui.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f53016b;

            {
                this.f53016b = this;
            }

            @Override // fz.e
            public final Object invoke(Object obj, Object obj2) {
                ImageView imageView = (ImageView) obj;
                String audioPath = (String) obj2;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var = this.f53016b;
                        ImageView imageView2 = b0Var.T;
                        if (imageView2 != null) {
                            android.support.v4.media.session.a.H(imageView2.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar2 = b0Var.S;
                        if (iVar2 != null) {
                            iVar2.v(audioPath);
                        }
                        b0Var.T = imageView;
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var2 = this.f53016b;
                        ImageView imageView3 = b0Var2.T;
                        if (imageView3 != null) {
                            android.support.v4.media.session.a.H(imageView3.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar3 = b0Var2.S;
                        if (iVar3 != null) {
                            iVar3.v(audioPath);
                        }
                        b0Var2.T = imageView;
                        break;
                    default:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var3 = this.f53016b;
                        ImageView imageView4 = b0Var3.T;
                        if (imageView4 != null) {
                            android.support.v4.media.session.a.H(imageView4.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar4 = b0Var3.S;
                        if (iVar4 != null) {
                            iVar4.v(audioPath);
                        }
                        b0Var3.T = imageView;
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((r4) aVar).f33225c.setLayoutManager(new GridLayoutManager(4));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((r4) aVar2).f33225c.setAdapter(this.P);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new xi.d("j", "ü", "ju"));
        arrayList2.add(new xi.d("q", "üe", "que"));
        arrayList2.add(new xi.d("x", "üan", "xuan"));
        final int i12 = 1;
        this.Q = new PinyinLessonStudySimpleAdapter2(arrayList2, new fz.e(this) { // from class: ui.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f53016b;

            {
                this.f53016b = this;
            }

            @Override // fz.e
            public final Object invoke(Object obj, Object obj2) {
                ImageView imageView = (ImageView) obj;
                String audioPath = (String) obj2;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var = this.f53016b;
                        ImageView imageView2 = b0Var.T;
                        if (imageView2 != null) {
                            android.support.v4.media.session.a.H(imageView2.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar2 = b0Var.S;
                        if (iVar2 != null) {
                            iVar2.v(audioPath);
                        }
                        b0Var.T = imageView;
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var2 = this.f53016b;
                        ImageView imageView3 = b0Var2.T;
                        if (imageView3 != null) {
                            android.support.v4.media.session.a.H(imageView3.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar3 = b0Var2.S;
                        if (iVar3 != null) {
                            iVar3.v(audioPath);
                        }
                        b0Var2.T = imageView;
                        break;
                    default:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var3 = this.f53016b;
                        ImageView imageView4 = b0Var3.T;
                        if (imageView4 != null) {
                            android.support.v4.media.session.a.H(imageView4.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar4 = b0Var3.S;
                        if (iVar4 != null) {
                            iVar4.v(audioPath);
                        }
                        b0Var3.T = imageView;
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((r4) aVar3).f33226d.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((r4) aVar4).f33226d.setAdapter(this.Q);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new xi.d("y", "ü", "yu"));
        arrayList3.add(new xi.d("y", "üe", "yue"));
        arrayList3.add(new xi.d("y", "üan", "yuan"));
        arrayList3.add(new xi.d("y", "ün", "yun"));
        final int i13 = 2;
        this.R = new PinyinLessonStudySimpleAdapter2(arrayList3, new fz.e(this) { // from class: ui.z

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b0 f53016b;

            {
                this.f53016b = this;
            }

            @Override // fz.e
            public final Object invoke(Object obj, Object obj2) {
                ImageView imageView = (ImageView) obj;
                String audioPath = (String) obj2;
                switch (i13) {
                    case 0:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var = this.f53016b;
                        ImageView imageView2 = b0Var.T;
                        if (imageView2 != null) {
                            android.support.v4.media.session.a.H(imageView2.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar2 = b0Var.S;
                        if (iVar2 != null) {
                            iVar2.v(audioPath);
                        }
                        b0Var.T = imageView;
                        break;
                    case 1:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var2 = this.f53016b;
                        ImageView imageView3 = b0Var2.T;
                        if (imageView3 != null) {
                            android.support.v4.media.session.a.H(imageView3.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar3 = b0Var2.S;
                        if (iVar3 != null) {
                            iVar3.v(audioPath);
                        }
                        b0Var2.T = imageView;
                        break;
                    default:
                        kotlin.jvm.internal.m.f(imageView, "imageView");
                        kotlin.jvm.internal.m.f(audioPath, "audioPath");
                        b0 b0Var3 = this.f53016b;
                        ImageView imageView4 = b0Var3.T;
                        if (imageView4 != null) {
                            android.support.v4.media.session.a.H(imageView4.getBackground());
                        }
                        android.support.v4.media.session.a.K(imageView.getBackground());
                        a9.i iVar4 = b0Var3.S;
                        if (iVar4 != null) {
                            iVar4.v(audioPath);
                        }
                        b0Var3.T = imageView;
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((r4) aVar5).f33227e.setLayoutManager(new LinearLayoutManager(1));
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((r4) aVar6).f33227e.setAdapter(this.R);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        bq.z.b(((r4) aVar7).f33224b, new s0.a(this, 12));
    }
}
