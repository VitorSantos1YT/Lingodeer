package qp;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f47891i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(mp.b bVar, long j11, List optionsIds) {
        super(bVar, j11);
        kotlin.jvm.internal.m.f(optionsIds, "optionsIds");
        this.f47891i = optionsIds;
    }

    @Override // hi.a
    public final boolean a() {
        return true;
    }

    @Override // hi.a
    public final String b() {
        return BuildConfig.VERSION_NAME;
    }

    @Override // hi.a
    public final String c() {
        return nv.p.m(this.f47882b, "-1;", ";0");
    }

    @Override // hi.a
    public final List g() {
        return ry.r.f50854a;
    }

    @Override // hi.a
    public final int i() {
        return -1;
    }

    @Override // qp.d
    public final fz.f n() {
        return c1.f47869a;
    }

    @Override // qp.d
    public final void p() {
        ((jp.p0) this.f47881a).O(3);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        dy.j jVar = ky.e.f38937b;
        xx.f fVarH = qx.h.m(2L, timeUnit, jVar).g(px.b.a()).h(new lp.b(this, 17), c.H);
        n9.q qVar = this.f47887g;
        th.j.a(fVarH, qVar);
        String strValueOf = String.valueOf(this.f47891i.size());
        long j11 = this.f47882b;
        Context context = this.f47883c;
        if (j11 == 0) {
            ta.a aVar = this.f47886f;
            kotlin.jvm.internal.m.c(aVar);
            ((hj.b) aVar).f32367e.setText(context.getString(R.string.encourage_title_0));
            SpannableString spannableString = new SpannableString(context.getString(R.string.encourage_subtitle_0, strValueOf));
            if (oz.q.I0(spannableString, strValueOf, 0, false, 6) != -1) {
                spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.color_FF6666)), oz.q.I0(spannableString, strValueOf, 0, false, 6), strValueOf.length() + oz.q.I0(spannableString, strValueOf, 0, false, 6), 33);
            }
            ta.a aVar2 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar2);
            ((hj.b) aVar2).f32366d.setText(spannableString);
            ta.a aVar3 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar3);
            ((hj.b) aVar3).f32365c.setImageResource(R.drawable.ic_encourage_deer_0);
        } else {
            ta.a aVar4 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar4);
            ((hj.b) aVar4).f32367e.setText(context.getString(R.string.encourage_title_1));
            SpannableString spannableString2 = new SpannableString(context.getString(R.string.encourage_subtitle_1, strValueOf));
            if (oz.q.I0(spannableString2, strValueOf, 0, false, 6) != -1) {
                spannableString2.setSpan(new ForegroundColorSpan(context.getColor(R.color.color_FF6666)), oz.q.I0(spannableString2, strValueOf, 0, false, 6), strValueOf.length() + oz.q.I0(spannableString2, strValueOf, 0, false, 6), 33);
            }
            ta.a aVar5 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar5);
            ((hj.b) aVar5).f32366d.setText(spannableString2);
            ta.a aVar6 = this.f47886f;
            kotlin.jvm.internal.m.c(aVar6);
            ((hj.b) aVar6).f32365c.setImageResource(R.drawable.ic_encourage_deer_1);
        }
        ta.a aVar7 = this.f47886f;
        kotlin.jvm.internal.m.c(aVar7);
        ((hj.b) aVar7).f32364b.setOnClickListener(new com.google.android.material.snackbar.a(3, fVarH, this));
        th.j.a(qx.h.m(2L, timeUnit, jVar).g(px.b.a()).h(new o20.w(this, 10), c.f47865t), qVar);
    }

    @Override // hi.a
    public final void j() {
    }

    @Override // hi.a
    public final void k() {
    }
}
