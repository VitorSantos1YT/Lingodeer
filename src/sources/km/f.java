package km;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.button.MaterialButton;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import fr.j3;
import hj.b4;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends ji.e {
    public int N;
    public final qy.q O;
    public h P;

    public f() {
        super(c.f38163a, BuildConfig.VERSION_NAME);
        this.N = 5;
        this.O = com.bumptech.glide.d.v(new a(this, 0));
    }

    @Override // ji.e
    public final void v(Bundle bundle) {
        ta.a aVar = this.f36400f;
        kotlin.jvm.internal.m.c(aVar);
        ((b4) aVar).m.setText(getString(R.string._s_xp, String.valueOf(((Number) this.O.getValue()).intValue())));
        ta.a aVar2 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar2);
        ((b4) aVar2).f32392j.setVisibility(4);
        ta.a aVar3 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar3);
        ((b4) aVar3).m.setVisibility(4);
        ta.a aVar4 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar4);
        ((b4) aVar4).f32385c.setVisibility(4);
        ta.a aVar5 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar5);
        ((b4) aVar5).f32391i.setVisibility(4);
        ta.a aVar6 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar6);
        ((b4) aVar6).f32387e.setVisibility(4);
        ta.a aVar7 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar7);
        ((b4) aVar7).f32390h.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar8 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar8);
        final int i11 = 0;
        bq.z.b(((b4) aVar8).f32388f, new fz.c(this) { // from class: km.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f38160b;

            {
                this.f38160b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i11) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f38160b.requireActivity().finish();
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        h hVar = this.f38160b.P;
                        if (hVar != null) {
                            hVar.a();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
        this.N = 5;
        l.m mVar = this.f36398d;
        if (mVar != null) {
            mVar.setResult(-1);
        }
        final int i12 = 1;
        int identifier = getResources().getIdentifier(nv.p.j(j3.N(1, 5), "star_five_prompt_"), "string", requireContext().getPackageName());
        ta.a aVar9 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar9);
        ((b4) aVar9).f32394l.setText(identifier);
        if (this.N < 3) {
            ta.a aVar10 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar10);
            ((b4) aVar10).f32389g.setImageResource(R.drawable.pic_lesson_finish_not_yet);
        } else {
            ta.a aVar11 = this.f36400f;
            kotlin.jvm.internal.m.c(aVar11);
            ImageView imageView = ((b4) aVar11).f32389g;
            Integer[] numArr = {Integer.valueOf(R.drawable.ic_billing_card_deer_2), Integer.valueOf(R.drawable.ic_billing_card_deer_3), Integer.valueOf(R.drawable.ic_billing_card_deer_4)};
            jz.d dVar = jz.e.f37397a;
            imageView.setImageResource(((Number) ry.l.d0(numArr)).intValue());
        }
        View view = this.f36399e;
        if (view != null) {
            view.postDelayed(new b2.c(4, view, new a(this, i12)), 0L);
        }
        ta.a aVar12 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar12);
        ((b4) aVar12).f32388f.setVisibility(8);
        ta.a aVar13 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar13);
        MaterialButton materialButton = ((b4) aVar13).f32384b;
        Context contextRequireContext = requireContext();
        kotlin.jvm.internal.m.e(contextRequireContext, "requireContext(...)");
        materialButton.setText(ff.h.y(contextRequireContext, R.string.test_finish));
        ta.a aVar14 = this.f36400f;
        kotlin.jvm.internal.m.c(aVar14);
        bq.z.b(((b4) aVar14).f32384b, new fz.c(this) { // from class: km.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f38160b;

            {
                this.f38160b = this;
            }

            @Override // fz.c
            public final Object invoke(Object obj) {
                View it = (View) obj;
                switch (i12) {
                    case 0:
                        kotlin.jvm.internal.m.f(it, "it");
                        this.f38160b.requireActivity().finish();
                        break;
                    default:
                        kotlin.jvm.internal.m.f(it, "it");
                        h hVar = this.f38160b.P;
                        if (hVar != null) {
                            hVar.a();
                        }
                        break;
                }
                return qy.b0.f48488a;
            }
        });
    }
}
