package aj;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bq.z;
import cf.x;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fr.j3;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.jvm.internal.m;
import qy.b0;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bc.i f739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b7.c f740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fv.c f741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fv.a f744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String[] f747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f749l;
    public final lc.d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f750n;

    public f(Context mContext, Env mEnv, bc.i iVar, b7.c cVar, fv.c cVar2) {
        m.f(mContext, "mContext");
        m.f(mEnv, "mEnv");
        this.f738a = mContext;
        this.f739b = iVar;
        this.f740c = cVar;
        this.f741d = cVar2;
        View viewInflate = View.inflate(mContext, R.layout.popup_pinyin, null);
        m.d(viewInflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) viewInflate;
        this.f742e = linearLayout;
        this.f743f = new e(this, 0);
        b bVar = new b(this, 0);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.img_record);
        android.support.v4.media.session.a.H(imageView.getBackground());
        z.b(imageView, new c(this, imageView, new hd.d(this, 2), 0));
        linearLayout.findViewById(R.id.txt_pinyin).setOnClickListener(bVar);
        lc.d dVar = new lc.d(mContext);
        hz.b.t(dVar, null, linearLayout, false, 61);
        md.a.r(dVar, new d(this, 0));
        this.m = dVar;
    }

    public final void a() {
        lc.d dVar = this.m;
        if (dVar == null) {
            return;
        }
        m.c(dVar);
        if (dVar.isShowing()) {
            m.c(dVar);
            dVar.dismiss();
            b7.c cVar = this.f740c;
            if (cVar != null) {
                cVar.g();
            }
            bc.i iVar = this.f739b;
            if (iVar != null) {
                iVar.g();
            }
        }
    }

    public final void b(int i11, String str, String str2) {
        String strL;
        String strL2;
        LinearLayout linearLayout = this.f742e;
        TextView textView = (TextView) linearLayout.findViewById(R.id.txt_pinyin);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.img_record);
        android.support.v4.media.session.a.H(imageView.getBackground());
        ViewParent parent = imageView.getParent();
        m.d(parent, "null cannot be cast to non-null type android.widget.FrameLayout");
        ((FrameLayout) parent).setBackgroundResource(R.drawable.bg_lesson_index_start_btn_enable);
        int i12 = 1;
        int i13 = i11 > 1 ? i11 : 1;
        while (i13 <= 4) {
            q qVar = fv.f.f28191a;
            m.c(str);
            m.c(str2);
            if (!m.a(fv.f.l(i13, str, str2), BuildConfig.VERSION_NAME)) {
                break;
            } else {
                i13++;
            }
        }
        q qVar2 = fv.f.f28191a;
        m.c(str);
        m.c(str2);
        textView.setText(fv.f.l(i13, str, str2));
        this.f746i = str2;
        String[] strArr = fv.f.f28194d;
        this.f747j = strArr;
        m.c(strArr);
        this.f748k = Arrays.asList(Arrays.copyOf(strArr, strArr.length)).indexOf(str);
        this.f749l = i11;
        String strA = fv.f.a(i13, str, str2);
        File file = new File(defpackage.e.m(xt.b.a().b(), strA));
        this.f745h = file.getPath();
        final int i14 = 0;
        if (file.exists()) {
            bc.i iVar = this.f739b;
            m.c(iVar);
            iVar.c();
            iVar.a(this.f745h);
            iVar.d();
        } else {
            linearLayout.findViewById(R.id.pb_progress).setVisibility(0);
            this.f744g = new fv.a(0L, fv.f.c(i13, str, str2), strA);
            fv.c cVar = this.f741d;
            m.c(cVar);
            fv.a aVar = this.f744g;
            m.c(aVar);
            cVar.d(aVar, this.f743f);
        }
        int i15 = this.f748k;
        String str3 = this.f746i;
        String[] strArr2 = this.f747j;
        m.c(strArr2);
        int i16 = this.f749l;
        final int i17 = -1;
        if (i15 - 1 >= 0) {
            while (true) {
                i15--;
                if (i15 < 0) {
                    break;
                }
                String str4 = strArr2[i15];
                HashSet hashSet = fv.f.f28200j;
                m.c(str3);
                if (hashSet.contains(fv.f.k(str4, str3)) && (strL2 = fv.f.l(i16, str4, str3)) != null && !strL2.equals(BuildConfig.VERSION_NAME)) {
                    break;
                }
            }
            i17 = i15;
        }
        Context context = this.f738a;
        if (i17 < 0) {
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
            z.b(viewFindViewById3, new fz.c(this) { // from class: aj.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ f f726b;

                {
                    this.f726b = this;
                }

                @Override // fz.c
                public final Object invoke(Object obj) {
                    View it = (View) obj;
                    switch (i14) {
                        case 0:
                            m.f(it, "it");
                            f fVar = this.f726b;
                            b7.c cVar2 = fVar.f740c;
                            if (cVar2 != null) {
                                bq.f fVar2 = (bq.f) cVar2.f3962e;
                                if (fVar2 != null ? fVar2.f4943a : false) {
                                    cVar2.g();
                                }
                            }
                            fVar.f748k = i17;
                            String[] strArr3 = fVar.f747j;
                            m.c(strArr3);
                            fVar.b(fVar.f749l, strArr3[fVar.f748k], fVar.f746i);
                            break;
                        default:
                            m.f(it, "it");
                            f fVar3 = this.f726b;
                            b7.c cVar3 = fVar3.f740c;
                            if (cVar3 != null) {
                                bq.f fVar4 = (bq.f) cVar3.f3962e;
                                if (fVar4 != null ? fVar4.f4943a : false) {
                                    cVar3.g();
                                }
                            }
                            fVar3.f748k = i17;
                            String[] strArr4 = fVar3.f747j;
                            m.c(strArr4);
                            fVar3.b(fVar3.f749l, strArr4[fVar3.f748k], fVar3.f746i);
                            break;
                    }
                    return b0.f48488a;
                }
            });
        }
        final int length = this.f748k;
        String str5 = this.f746i;
        String[] strArr3 = this.f747j;
        m.c(strArr3);
        int i18 = this.f749l;
        if (length + 1 >= strArr3.length) {
            length = strArr3.length;
        } else {
            while (true) {
                length += i12;
                if (length >= strArr3.length) {
                    break;
                }
                String str6 = strArr3[length];
                HashSet hashSet2 = fv.f.f28200j;
                m.c(str5);
                if (hashSet2.contains(fv.f.k(str6, str5)) && (strL = fv.f.l(i18, str6, str5)) != null && !strL.equals(BuildConfig.VERSION_NAME)) {
                    break;
                } else {
                    i12 = 1;
                }
            }
        }
        String[] strArr4 = this.f747j;
        m.c(strArr4);
        if (length >= strArr4.length) {
            View viewFindViewById4 = linearLayout.findViewById(R.id.img_right_anchor);
            m.e(viewFindViewById4, "findViewById(...)");
            x.L((ImageView) viewFindViewById4, R.drawable.ic_pinyin_arrow, ColorStateList.valueOf(j3.G(context, R.color.color_E3E3E3)));
            linearLayout.findViewById(R.id.img_right_anchor).setClickable(false);
            return;
        }
        View viewFindViewById5 = linearLayout.findViewById(R.id.img_right_anchor);
        m.e(viewFindViewById5, "findViewById(...)");
        x.L((ImageView) viewFindViewById5, R.drawable.ic_pinyin_arrow, ColorStateList.valueOf(j3.G(context, R.color.colorAccent)));
        final int i19 = 1;
        linearLayout.findViewById(R.id.img_right_anchor).setClickable(true);
        View viewFindViewById6 = linearLayout.findViewById(R.id.img_right_anchor);
        m.e(viewFindViewById6, "findViewById(...)");
        z.b(viewFindViewById6, new fz.c(this) { // from class: aj.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f726b;

            {
                this.f726b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i19) {
                    case 0:
                        m.f(it, "it");
                        f fVar = this.f726b;
                        b7.c cVar2 = fVar.f740c;
                        if (cVar2 != null) {
                            bq.f fVar2 = (bq.f) cVar2.f3962e;
                            if (fVar2 != null ? fVar2.f4943a : false) {
                                cVar2.g();
                            }
                        }
                        fVar.f748k = length;
                        String[] strArr5 = fVar.f747j;
                        m.c(strArr5);
                        fVar.b(fVar.f749l, strArr5[fVar.f748k], fVar.f746i);
                        break;
                    default:
                        m.f(it, "it");
                        f fVar3 = this.f726b;
                        b7.c cVar3 = fVar3.f740c;
                        if (cVar3 != null) {
                            bq.f fVar4 = (bq.f) cVar3.f3962e;
                            if (fVar4 != null ? fVar4.f4943a : false) {
                                cVar3.g();
                            }
                        }
                        fVar3.f748k = length;
                        String[] strArr6 = fVar3.f747j;
                        m.c(strArr6);
                        fVar3.b(fVar3.f749l, strArr6[fVar3.f748k], fVar3.f746i);
                        break;
                }
                return b0.f48488a;
            }
        });
    }
}
