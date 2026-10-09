package qp;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.Word;
import com.lingodeer.R;
import com.lingodeer.data.env.Env;
import com.tbruyelle.rxpermissions3.BuildConfig;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class w2 implements fz.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z2 f48247b;

    public /* synthetic */ w2(z2 z2Var, int i11) {
        this.f48246a = i11;
        this.f48247b = z2Var;
    }

    @Override // fz.c
    public final Object invoke(Object obj) {
        String strT;
        int i11 = this.f48246a;
        int i12 = 0;
        qy.b0 b0Var = qy.b0.f48488a;
        z2 z2Var = this.f48247b;
        View it = (View) obj;
        switch (i11) {
            case 0:
                kotlin.jvm.internal.m.f(it, "it");
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                cf.x.n().isKeyboard = !cf.x.n().isKeyboard;
                cf.x.n().updateEntry("isKeyboard");
                ((jp.p0) z2Var.f47881a).A().l();
                break;
            case 1:
                kotlin.jvm.internal.m.f(it, "it");
                mp.b bVar = z2Var.f47881a;
                String strB = z2Var.b();
                ta.a aVar = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar);
                ImageView ivAudio = (ImageView) ((hj.c2) aVar).f32448f.f32408d;
                kotlin.jvm.internal.m.e(ivAudio, "ivAudio");
                ((jp.p0) bVar).H(ivAudio, strB);
                break;
            case 2:
                kotlin.jvm.internal.m.f(it, "it");
                mp.b bVar2 = z2Var.f47881a;
                String strB2 = z2Var.b();
                ta.a aVar2 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar2);
                ImageView ivAudio2 = (ImageView) ((hj.c2) aVar2).f32448f.f32408d;
                kotlin.jvm.internal.m.e(ivAudio2, "ivAudio");
                ((jp.p0) bVar2).H(ivAudio2, strB2);
                break;
            case 3:
                kotlin.jvm.internal.m.f(it, "it");
                mp.b bVar3 = z2Var.f47881a;
                String strB3 = z2Var.b();
                ta.a aVar3 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar3);
                ImageView ivAudioSmall = ((hj.c2) aVar3).f32449g;
                kotlin.jvm.internal.m.e(ivAudioSmall, "ivAudioSmall");
                ((jp.p0) bVar3).H(ivAudioSmall, strB3);
                break;
            case 4:
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar4 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar4);
                ((hj.c2) aVar4).f32454l.setVisibility(4);
                ta.a aVar5 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar5);
                ((hj.c2) aVar5).m.setVisibility(0);
                rx.b bVar4 = z2Var.f48293q;
                if (bVar4 != null) {
                    bVar4.dispose();
                }
                xx.f fVarH = qx.h.m(3L, TimeUnit.SECONDS, ky.e.f38937b).g(px.b.a()).h(new o20.w(z2Var, 14), c.P);
                th.j.a(fVarH, z2Var.f47887g);
                z2Var.f48293q = fVarH;
                break;
            case 5:
                kotlin.jvm.internal.m.f(it, "it");
                ta.a aVar6 = z2Var.f47886f;
                kotlin.jvm.internal.m.c(aVar6);
                try {
                    z2Var.s(((hj.c2) aVar6).f32446d.getSelectionStart());
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
                z2Var.B();
                break;
            case 6:
                kotlin.jvm.internal.m.f(it, "it");
                ArrayList arrayList = z2Var.f48292p;
                Context context = z2Var.f47883c;
                try {
                    strT = z2Var.t();
                } catch (Exception e10) {
                    e10.printStackTrace();
                    strT = BuildConfig.VERSION_NAME;
                }
                if (!strT.equals(BuildConfig.VERSION_NAME)) {
                    ArrayList arrayList2 = z2Var.m;
                    int size = arrayList2.size();
                    while (i12 < size) {
                        Object obj2 = arrayList2.get(i12);
                        i12++;
                        FrameLayout frameLayout = (FrameLayout) obj2;
                        Object tag = frameLayout.getTag();
                        kotlin.jvm.internal.m.d(tag, "null cannot be cast to non-null type com.lingo.lingoskill.object.Word");
                        String strB4 = fr.j3.B((Word) tag);
                        if (frameLayout.getVisibility() == 0 && strB4.equalsIgnoreCase(strT)) {
                            frameLayout.setScaleX(1.0f);
                            frameLayout.setScaleY(1.0f);
                            Iterator it2 = arrayList.iterator();
                            kotlin.jvm.internal.m.e(it2, "iterator(...)");
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                kotlin.jvm.internal.m.e(next, "next(...)");
                                ((ValueAnimator) next).cancel();
                            }
                            arrayList.clear();
                            ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(fr.j3.G(context, R.color.white), context.getColor(R.color.colorAccent));
                            valueAnimatorOfArgb.addUpdateListener(new x(frameLayout, 7));
                            valueAnimatorOfArgb.setDuration(600L);
                            valueAnimatorOfArgb.start();
                            arrayList.add(valueAnimatorOfArgb);
                            ValueAnimator valueAnimatorOfArgb2 = ValueAnimator.ofArgb(context.getColor(R.color.primary_black), context.getColor(R.color.white));
                            valueAnimatorOfArgb2.addUpdateListener(new x(frameLayout, 4));
                            valueAnimatorOfArgb2.setDuration(600L);
                            valueAnimatorOfArgb2.start();
                            arrayList.add(valueAnimatorOfArgb2);
                            ValueAnimator valueAnimatorOfArgb3 = ValueAnimator.ofArgb(context.getColor(R.color.colorAccent), context.getColor(R.color.white));
                            valueAnimatorOfArgb3.addUpdateListener(new x(frameLayout, 5));
                            valueAnimatorOfArgb3.setStartDelay(1000L);
                            valueAnimatorOfArgb3.setDuration(600L);
                            valueAnimatorOfArgb3.start();
                            arrayList.add(valueAnimatorOfArgb3);
                            ValueAnimator valueAnimatorOfArgb4 = ValueAnimator.ofArgb(context.getColor(R.color.white), context.getColor(R.color.primary_black));
                            valueAnimatorOfArgb4.addUpdateListener(new x(frameLayout, 6));
                            valueAnimatorOfArgb4.setStartDelay(1000L);
                            valueAnimatorOfArgb4.setDuration(600L);
                            valueAnimatorOfArgb4.start();
                            arrayList.add(valueAnimatorOfArgb4);
                            break;
                        }
                    }
                } else {
                    ta.a aVar7 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar7);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(((hj.c2) aVar7).f32451i, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                    if (objectAnimatorOfFloat != null) {
                        objectAnimatorOfFloat.setDuration(300L);
                        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        objectAnimatorOfFloat.start();
                        ta.a aVar8 = z2Var.f47886f;
                        kotlin.jvm.internal.m.c(aVar8);
                        z2Var.f48287j = ObjectAnimator.ofFloat(((hj.c2) aVar8).f32446d, "translationX", CropImageView.DEFAULT_ASPECT_RATIO, 15.0f, -15.0f, CropImageView.DEFAULT_ASPECT_RATIO);
                        objectAnimatorOfFloat.setDuration(300L);
                        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                        objectAnimatorOfFloat.start();
                    } else {
                        objectAnimatorOfFloat = null;
                    }
                    z2Var.f48287j = objectAnimatorOfFloat;
                    ta.a aVar9 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar9);
                    ((hj.c2) aVar9).f32446d.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, context.getApplicationContext().getDrawable(R.drawable.line_wrong));
                    ta.a aVar10 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar10);
                    ((hj.c2) aVar10).f32446d.setTextColor(context.getColor(R.color.color_FF6666));
                    th.j.a(qx.h.m(300L, TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new lp.b(z2Var, 21), c.Q), z2Var.f47887g);
                }
                break;
            default:
                kotlin.jvm.internal.m.f(it, "it");
                Env env = z2Var.f47884d;
                ArrayList arrayList3 = z2Var.m;
                boolean z11 = env.examCharAudioSwitch;
                env.examCharAudioSwitch = !z11;
                if (!z11) {
                    ta.a aVar11 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar11);
                    ((hj.c2) aVar11).f32450h.setImageResource(R.drawable.ic_hint_audio);
                    int size2 = arrayList3.size();
                    int i13 = 0;
                    while (i13 < size2) {
                        Object obj3 = arrayList3.get(i13);
                        i13++;
                        FrameLayout frameLayout2 = (FrameLayout) obj3;
                        TextView textView = (TextView) frameLayout2.findViewById(R.id.tv_char);
                        ImageView imageView = (ImageView) frameLayout2.findViewById(R.id.iv_hint_audio);
                        if (kotlin.jvm.internal.m.a(textView.getText().toString(), " ")) {
                            imageView.setVisibility(8);
                        } else {
                            imageView.setVisibility(0);
                        }
                    }
                } else {
                    ta.a aVar12 = z2Var.f47886f;
                    kotlin.jvm.internal.m.c(aVar12);
                    ((hj.c2) aVar12).f32450h.setImageResource(R.drawable.ic_hint_audio_close);
                    int size3 = arrayList3.size();
                    while (i12 < size3) {
                        Object obj4 = arrayList3.get(i12);
                        i12++;
                        ((ImageView) ((FrameLayout) obj4).findViewById(R.id.iv_hint_audio)).setVisibility(8);
                    }
                }
                break;
        }
        return b0Var;
    }
}
