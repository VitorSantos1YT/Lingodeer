package um;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bc.i;
import bq.z;
import cf.x;
import com.lingo.lingoskill.object.BaseYintuIntel;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import fr.j3;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import pr.a0;
import qy.b0;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f53031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Env f53032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f53033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b7.c f53034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final fv.c f53035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f53036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final aj.e f53037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public fv.a f53038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f53039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final lc.d f53040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f53041k;

    public f(Context mContext, Env mEnv, i iVar, b7.c cVar, fv.c cVar2) {
        m.f(mContext, "mContext");
        m.f(mEnv, "mEnv");
        this.f53031a = mContext;
        this.f53032b = mEnv;
        this.f53033c = iVar;
        this.f53034d = cVar;
        this.f53035e = cVar2;
        View viewInflate = View.inflate(mContext, R.layout.popup_syllable, null);
        m.d(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        this.f53036f = linearLayout;
        this.f53037g = new aj.e(this, 23);
        aj.b bVar = new aj.b(this, 24);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.img_record);
        android.support.v4.media.session.a.H(imageView.getBackground());
        z.b(imageView, new a0(this, imageView, new t7.d(this, 3), 21));
        linearLayout.findViewById(R.id.tv_char).setOnClickListener(bVar);
        lc.d dVar = new lc.d(mContext);
        hz.b.t(dVar, null, linearLayout, false, 61);
        md.a.r(dVar, new e(this, 0));
        this.f53040j = dVar;
    }

    public final void a(BaseYintuIntel baseYintuIntel, final ArrayList arrayList) {
        LinearLayout linearLayout = this.f53036f;
        TextView textView = (TextView) linearLayout.findViewById(R.id.tv_char);
        TextView textView2 = (TextView) linearLayout.findViewById(R.id.tv_zhuyin);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.img_record);
        m.c(textView);
        c.a(textView);
        android.support.v4.media.session.a.H(imageView.getBackground());
        ViewParent parent = imageView.getParent();
        m.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) parent).setBackgroundResource(R.drawable.bg_lesson_index_start_btn_enable);
        if (this.f53032b.isPing) {
            textView.setText(baseYintuIntel.getPing());
        } else {
            textView.setText(baseYintuIntel.getPian());
        }
        textView2.setText(baseYintuIntel.getLuoMa());
        String luoMa = baseYintuIntel.getLuoMa();
        m.e(luoMa, "getLuoMa(...)");
        q qVar = fv.b.f28186a;
        String strA = fv.b.a(luoMa, null, null);
        File file = new File(defpackage.e.m(xt.b.a().b(), strA));
        this.f53039i = file.getPath();
        final int i11 = 0;
        if (file.exists()) {
            i iVar = this.f53033c;
            m.c(iVar);
            iVar.c();
            iVar.a(this.f53039i);
            iVar.d();
        } else {
            linearLayout.findViewById(R.id.pb_progress).setVisibility(0);
            this.f53038h = new fv.a(0L, fv.b.e(luoMa), strA);
            fv.c cVar = this.f53035e;
            m.c(cVar);
            fv.a aVar = this.f53038h;
            m.c(aVar);
            cVar.d(aVar, this.f53037g);
        }
        final int i12 = 1;
        final int iIndexOf = arrayList.indexOf(baseYintuIntel) - 1;
        Context context = this.f53031a;
        if (iIndexOf < 0) {
            View viewFindViewById = linearLayout.findViewById(R.id.img_left_anchor);
            m.e(viewFindViewById, "findViewById(...)");
            x.L((ImageView) viewFindViewById, R.drawable.ic_pinyin_arrow, ColorStateList.valueOf(j3.G(context, R.color.color_E3E3E3)));
            linearLayout.findViewById(R.id.img_left_anchor).setClickable(false);
        } else {
            View viewFindViewById2 = linearLayout.findViewById(R.id.img_left_anchor);
            m.e(viewFindViewById2, "findViewById(...)");
            x.L((ImageView) viewFindViewById2, R.drawable.ic_pinyin_arrow, ColorStateList.valueOf(j3.G(context, R.color.colorAccent)));
            linearLayout.findViewById(R.id.img_left_anchor).setClickable(true);
            View viewFindViewById3 = linearLayout.findViewById(R.id.img_left_anchor);
            m.e(viewFindViewById3, "findViewById(...)");
            z.b(viewFindViewById3, new fz.c(this) { // from class: um.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f53026b;

                {
                    this.f53026b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i11) {
                        case 0:
                            m.f(it, "it");
                            f fVar = this.f53026b;
                            b7.c cVar2 = fVar.f53034d;
                            if (cVar2 != null) {
                                bq.f fVar2 = (bq.f) cVar2.f3962e;
                                if (fVar2 != null ? fVar2.f4943a : false) {
                                    cVar2.g();
                                }
                            }
                            ArrayList arrayList2 = arrayList;
                            fVar.a((BaseYintuIntel) arrayList2.get(iIndexOf), arrayList2);
                            break;
                        default:
                            m.f(it, "it");
                            f fVar3 = this.f53026b;
                            b7.c cVar3 = fVar3.f53034d;
                            if (cVar3 != null) {
                                bq.f fVar4 = (bq.f) cVar3.f3962e;
                                if (fVar4 != null ? fVar4.f4943a : false) {
                                    cVar3.g();
                                }
                            }
                            ArrayList arrayList3 = arrayList;
                            fVar3.a((BaseYintuIntel) arrayList3.get(iIndexOf), arrayList3);
                            break;
                    }
                    return b0.f48488a;
                }
            });
        }
        final int iIndexOf2 = arrayList.indexOf(baseYintuIntel) + 1;
        if (iIndexOf2 >= arrayList.size()) {
            View viewFindViewById4 = linearLayout.findViewById(R.id.img_right_anchor);
            m.e(viewFindViewById4, "findViewById(...)");
            x.L((ImageView) viewFindViewById4, R.drawable.ic_pinyin_arrow, ColorStateList.valueOf(j3.G(context, R.color.color_E3E3E3)));
            linearLayout.findViewById(R.id.img_right_anchor).setClickable(false);
            return;
        }
        View viewFindViewById5 = linearLayout.findViewById(R.id.img_right_anchor);
        m.e(viewFindViewById5, "findViewById(...)");
        x.L((ImageView) viewFindViewById5, R.drawable.ic_pinyin_arrow, ColorStateList.valueOf(j3.G(context, R.color.colorAccent)));
        linearLayout.findViewById(R.id.img_right_anchor).setClickable(true);
        View viewFindViewById6 = linearLayout.findViewById(R.id.img_right_anchor);
        m.e(viewFindViewById6, "findViewById(...)");
        z.b(viewFindViewById6, new fz.c(this) { // from class: um.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f53026b;

            {
                this.f53026b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        m.f(it, "it");
                        f fVar = this.f53026b;
                        b7.c cVar2 = fVar.f53034d;
                        if (cVar2 != null) {
                            bq.f fVar2 = (bq.f) cVar2.f3962e;
                            if (fVar2 != null ? fVar2.f4943a : false) {
                                cVar2.g();
                            }
                        }
                        ArrayList arrayList2 = arrayList;
                        fVar.a((BaseYintuIntel) arrayList2.get(iIndexOf2), arrayList2);
                        break;
                    default:
                        m.f(it, "it");
                        f fVar3 = this.f53026b;
                        b7.c cVar3 = fVar3.f53034d;
                        if (cVar3 != null) {
                            bq.f fVar4 = (bq.f) cVar3.f3962e;
                            if (fVar4 != null ? fVar4.f4943a : false) {
                                cVar3.g();
                            }
                        }
                        ArrayList arrayList3 = arrayList;
                        fVar3.a((BaseYintuIntel) arrayList3.get(iIndexOf2), arrayList3);
                        break;
                }
                return b0.f48488a;
            }
        });
    }
}
