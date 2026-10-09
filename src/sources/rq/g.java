package rq;

import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import hj.w1;
import i0.pKy.shrCcjmOhAmRC;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jp.p0;
import kotlin.jvm.internal.m;
import qy.q;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f49375j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final cm.a f49376k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f49377l;
    public bq.f m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ij.d f49378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f49379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public rx.b f49380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final q f49381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q f49382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final q f49383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f49384t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(mp.b view, pq.a elem) {
        super(view, elem);
        m.f(view, "view");
        m.f(elem, "elem");
        this.f49375j = new ArrayList();
        this.f49376k = new cm.a();
        this.f49379o = BuildConfig.VERSION_NAME;
        this.f49381q = com.bumptech.glide.d.v(new d(this, 0));
        this.f49382r = com.bumptech.glide.d.v(new d(this, 1));
        this.f49383s = com.bumptech.glide.d.v(new d(this, 2));
        this.f49384t = BuildConfig.VERSION_NAME;
    }

    public static boolean p(FrameLayout frameLayout, String str) {
        if (com.google.android.material.datepicker.d.D(str)) {
            frameLayout.setClickable(true);
            frameLayout.setBackgroundResource(R.drawable.bg_speak_btn_enable);
        } else {
            frameLayout.setClickable(false);
            frameLayout.setBackgroundResource(R.drawable.point_grey);
        }
        return com.google.android.material.datepicker.d.D(str);
    }

    @Override // hi.a
    public final boolean a() {
        return false;
    }

    @Override // hi.a
    public final String b() {
        return this.f49384t;
    }

    @Override // hi.a
    public final void f() {
        this.f49364h.f();
        r();
        bq.f fVar = this.m;
        if (fVar != null) {
            fVar.t();
        }
        rx.b bVar = this.f49380p;
        if (bVar != null) {
            bVar.dispose();
        }
        ij.d dVar = this.f49378n;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // hi.a
    public final int i() {
        return 1;
    }

    @Override // hi.a
    public final void j() {
    }

    @Override // hi.a
    public final void k() {
    }

    @Override // rq.b
    public final fz.f n() {
        return f.f49374a;
    }

    @Override // rq.b
    public final void o() {
        this.m = new bq.f(0, false);
        this.f49379o = defpackage.e.m(this.f49360d.tempDir, "recorder_temp.mp3");
        if (new File(this.f49379o).exists()) {
            new File(this.f49379o).delete();
        }
        ((p0) this.f49357a).O(1);
        ArrayList arrayList = this.f49375j;
        arrayList.clear();
        pq.a aVar = this.f49358b;
        String str = aVar.f46984b;
        m.e(str, "getInitialElem(...)");
        arrayList.add(str);
        String str2 = aVar.f46985c;
        m.e(str2, "getFinalElem(...)");
        arrayList.add(str2);
        ta.a aVar2 = this.f49363g;
        m.c(aVar2);
        ((w1) aVar2).f33508i.setText((CharSequence) arrayList.get(0));
        ta.a aVar3 = this.f49363g;
        m.c(aVar3);
        ((w1) aVar3).f33509j.setText((CharSequence) arrayList.get(1));
        ta.a aVar4 = this.f49363g;
        m.c(aVar4);
        ((ImageView) ((w1) aVar4).f33503d.f32490c).setVisibility(8);
        ta.a aVar5 = this.f49363g;
        m.c(aVar5);
        ((w1) aVar5).f33504e.setVisibility(4);
        ta.a aVar6 = this.f49363g;
        m.c(aVar6);
        ((w1) aVar6).f33505f.setVisibility(4);
        ta.a aVar7 = this.f49363g;
        m.c(aVar7);
        ((w1) aVar7).f33504e.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar8 = this.f49363g;
        m.c(aVar8);
        ((w1) aVar8).f33504e.setVisibility(0);
        ta.a aVar9 = this.f49363g;
        m.c(aVar9);
        ConstraintLayout constraintLayout = ((w1) aVar9).f33504e;
        constraintLayout.postDelayed(new b2.c(4, constraintLayout, new d(this, 3)), 0L);
    }

    public final void q() {
        try {
            ta.a aVar = this.f49363g;
            m.c(aVar);
            ((w1) aVar).f33502c.setBackgroundResource(R.drawable.bg_speak_btn_enable);
            ta.a aVar2 = this.f49363g;
            m.c(aVar2);
            ((w1) aVar2).f33501b.setBackgroundResource(R.drawable.bg_speak_btn_enable);
            ta.a aVar3 = this.f49363g;
            m.c(aVar3);
            ((w1) aVar3).m.b();
            ta.a aVar4 = this.f49363g;
            m.c(aVar4);
            android.support.v4.media.session.a.H(((w1) aVar4).f33506g.getBackground());
            ta.a aVar5 = this.f49363g;
            m.c(aVar5);
            ((w1) aVar5).f33507h.setVisibility(8);
            ij.d dVar = this.f49378n;
            if (dVar != null) {
                dVar.d();
            }
            ta.a aVar6 = this.f49363g;
            m.c(aVar6);
            p(((w1) aVar6).f33501b, this.f49379o);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void r() {
        try {
            rx.b bVar = this.f49380p;
            if (bVar != null) {
                bVar.dispose();
            }
            th.e eVar = ((p0) this.f49357a).V;
            if (eVar != null) {
                eVar.n();
            }
            ta.a aVar = this.f49363g;
            m.c(aVar);
            android.support.v4.media.session.a.H(((ImageView) ((w1) aVar).f33503d.f32490c).getBackground());
            bq.f fVar = this.m;
            if (fVar != null && fVar.f4943a) {
                fVar.t();
            }
            q();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // hi.a
    public final List g() {
        pq.a aVar = this.f49358b;
        String str = aVar.f46983a;
        ArrayList arrayList = new ArrayList();
        q qVar = fv.b.f28186a;
        String str2 = aVar.f46984b;
        cm.a aVar2 = this.f49376k;
        String strA = aVar2.a(str2);
        String str3 = shrCcjmOhAmRC.DdrAFlj;
        m.e(strA, str3);
        String strE = fv.b.e(strA);
        String strA2 = aVar2.a(str2);
        m.e(strA2, str3);
        arrayList.add(new fv.a(0L, strE, fv.b.a(strA2, null, null)));
        String str4 = aVar.f46985c;
        String strA3 = aVar2.a(str4);
        m.e(strA3, str3);
        String strE2 = fv.b.e(strA3);
        String strA4 = aVar2.a(str4);
        m.e(strA4, str3);
        arrayList.add(new fv.a(0L, strE2, fv.b.a(strA4, null, null)));
        String strA5 = aVar2.a(aVar.f46983a);
        m.e(strA5, str3);
        String strE3 = fv.b.e(strA5);
        String strA6 = aVar2.a(aVar.f46983a);
        m.e(strA6, str3);
        arrayList.add(new fv.a(0L, strE3, fv.b.a(strA6, null, null)));
        return arrayList;
    }
}
