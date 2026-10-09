package com.google.android.material.snackbar;

import android.view.View;
import androidx.recyclerview.widget.g2;
import cf.x;
import com.lingo.lingoskill.LingoSkillApplication;
import com.lingo.lingoskill.object.HwCharacter;
import com.youth.banner.adapter.BannerAdapter;
import defpackage.e;
import fv.f;
import hj.j6;
import jp.p0;
import kotlin.jvm.internal.m;
import lf.x0;
import pi.h;
import qp.d1;
import qp.f1;
import qy.q;
import xt.b;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f15510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f15511c;

    public /* synthetic */ a(int i11, Object obj, Object obj2) {
        this.f15509a = i11;
        this.f15510b = obj;
        this.f15511c = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f15509a;
        Object obj = this.f15511c;
        Object obj2 = this.f15510b;
        switch (i11) {
            case 0:
                Snackbar snackbar = (Snackbar) obj2;
                int[] iArr = Snackbar.B;
                snackbar.getClass();
                ((View.OnClickListener) obj).onClick(view);
                snackbar.b(1);
                return;
            case 1:
                ((BannerAdapter) obj2).lambda$onCreateViewHolder$1((g2) obj, view);
                return;
            case 2:
                HwCharacter hwCharacter = (HwCharacter) obj2;
                h hVar = (h) obj;
                LingoSkillApplication lingoSkillApplication = LingoSkillApplication.f21665b;
                if (x.n().isAudioModel) {
                    String strG = b.a().g();
                    q qVar = f.f28191a;
                    String pinyin = hwCharacter.getPinyin();
                    m.e(pinyin, "getPinyin(...)");
                    String strM = e.m(strG, f.b(pinyin));
                    th.e eVar = hVar.V;
                    if (eVar == null) {
                        m.n("audioPlayer");
                        throw null;
                    }
                    eVar.f52416c = new x0(hVar, 13);
                    eVar.h(strM);
                    j6 j6Var = hVar.W;
                    m.c(j6Var);
                    android.support.v4.media.session.a.K(j6Var.f32793b.getBackground());
                    return;
                }
                return;
            case 3:
                ((rx.b) obj2).dispose();
                ((p0) ((d1) obj).f47881a).X();
                return;
            case 4:
                ((p0) ((f1) obj2).f47881a).X();
                ((rx.b) obj).dispose();
                return;
            default:
                ((p0) ((f1) obj2).f47881a).X();
                ((rx.b) obj).dispose();
                return;
        }
    }
}
