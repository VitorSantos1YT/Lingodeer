package d1;

import a0.b2;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import dt.t1;
import qp.v3;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f22907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f22908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f22910e;

    public /* synthetic */ g(int i11, Object obj, Object obj2, Object obj3, boolean z11) {
        this.f22906a = i11;
        this.f22908c = obj;
        this.f22907b = z11;
        this.f22909d = obj2;
        this.f22910e = obj3;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        int i11 = this.f22906a;
        boolean z11 = this.f22907b;
        qy.b0 b0Var = qy.b0.f48488a;
        Object obj2 = this.f22910e;
        Object obj3 = this.f22909d;
        Object obj4 = this.f22908c;
        switch (i11) {
            case 0:
                g2.h hVar = (g2.h) obj3;
                g2.p pVar = (g2.p) obj2;
                y2.k0 k0Var = (y2.k0) obj;
                k0Var.a();
                i2.b bVar = k0Var.f56937a;
                if (((Boolean) ((fz.a) obj4).invoke()).booleanValue()) {
                    if (z11) {
                        long jR0 = bVar.r0();
                        xq.c cVar = bVar.f34121b;
                        long jH = cVar.H();
                        cVar.x().e();
                        try {
                            ((b2) cVar.f56174b).n(jR0, -1.0f, 1.0f);
                            i2.d.A(k0Var, hVar, pVar, 46);
                        } finally {
                            com.google.android.material.datepicker.d.C(cVar, jH);
                        }
                    } else {
                        i2.d.A(k0Var, hVar, pVar, 46);
                    }
                }
                return b0Var;
            case 1:
                ((Boolean) obj).getClass();
                rz.e0.B((rz.b0) obj4, null, null, new t1(this.f22907b, (l1.b1) obj3, (l1.b1) obj2, null, 1), 3);
                return b0Var;
            default:
                v3 v3Var = (v3) obj4;
                Word word = (Word) obj3;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) obj2;
                View v11 = (View) obj;
                kotlin.jvm.internal.m.f(v11, "v");
                View view = (View) v3Var.f47818j;
                mp.b bVar2 = v3Var.f47881a;
                Env env = v3Var.f47884d;
                if (view != null) {
                    v3Var.r(view);
                    ((LinearLayout) view.findViewById(R.id.ll_word_info)).setVisibility(8);
                    ((TextView) view.findViewById(R.id.tv_word)).setVisibility(0);
                }
                v3Var.f47818j = v11;
                if (env.isAudioModel) {
                    qy.q qVar = fv.b.f28186a;
                    String path = fv.b.Y(word.getWordId(), null, null);
                    kotlin.jvm.internal.m.f(path, "path");
                    ((jp.p0) bVar2).I(path);
                }
                v3Var.s(v11);
                Object tag = v11.getTag();
                kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                LinearLayout linearLayout = (LinearLayout) v11.findViewById(R.id.ll_word_info);
                TextView textView = (TextView) linearLayout.findViewById(R.id.tv_top);
                TextView textView2 = (TextView) linearLayout.findViewById(R.id.tv_middle);
                TextView textView3 = (TextView) linearLayout.findViewById(R.id.tv_bottom);
                kotlin.jvm.internal.m.c(textView);
                kotlin.jvm.internal.m.c(textView2);
                kotlin.jvm.internal.m.c(textView3);
                v3Var.v((Word) tag, textView, textView2, textView3);
                linearLayout.setVisibility(0);
                ((TextView) v11.findViewById(R.id.tv_word)).setVisibility(4);
                ((jp.p0) bVar2).O(4);
                if (z11 && env.showAnim) {
                    int[] iArr = bq.r.f4959a;
                    int length = v3Var.u().length;
                    for (int i12 = 0; i12 < length; i12++) {
                        CardView cardView = v3Var.u()[i12];
                        kotlin.jvm.internal.m.e(cardView, "get(...)");
                        View viewFindViewById = cardView.findViewById(R.id.img_view);
                        kotlin.jvm.internal.m.e(viewFindViewById, "findViewById(...)");
                        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) viewFindViewById;
                        lottieAnimationView2.e();
                        lottieAnimationView2.setFrame(0);
                    }
                    lottieAnimationView.h();
                }
                return b0Var;
        }
    }

    public /* synthetic */ g(v3 v3Var, Word word, boolean z11, LottieAnimationView lottieAnimationView) {
        this.f22906a = 2;
        this.f22908c = v3Var;
        this.f22909d = word;
        this.f22907b = z11;
        this.f22910e = lottieAnimationView;
    }
}
