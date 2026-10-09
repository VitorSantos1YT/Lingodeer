package fi;

import a0.b2;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import bq.z;
import com.google.logging.type.LogSeverity;
import com.lingo.lingoskill.object.ARChar;
import com.yalantis.ucrop.view.CropImageView;
import hj.h1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import qy.q;
import z4.s0;
import z4.w0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f27310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f27311b;

    public h(i iVar, long j11) {
        this.f27310a = iVar;
        this.f27311b = j11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        m.f(animation, "animation");
        super.onAnimationEnd(animation);
        StringBuilder sb2 = new StringBuilder();
        i iVar = this.f27310a;
        gi.h hVar = iVar.f27312e;
        int i11 = iVar.f27314t;
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                ArrayList arrayList = iVar.N;
                if (arrayList == null) {
                    m.n("charList");
                    throw null;
                }
                if (i12 < arrayList.size()) {
                    ArrayList arrayList2 = iVar.N;
                    if (arrayList2 == null) {
                        m.n("charList");
                        throw null;
                    }
                    sb2.append(((ARChar) arrayList2.get(i12)).getCharacter());
                }
                if (i12 == i11) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        ta.a aVar = iVar.f45600c;
        m.c(aVar);
        ((h1) aVar).f32648e.setText(sb2);
        ta.a aVar2 = iVar.f45600c;
        m.c(aVar2);
        ((h1) aVar2).f32647d.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar3 = iVar.f45600c;
        m.c(aVar3);
        ((h1) aVar3).f32647d.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar4 = iVar.f45600c;
        m.c(aVar4);
        ((h1) aVar4).f32646c.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar5 = iVar.f45600c;
        m.c(aVar5);
        ((h1) aVar5).f32646c.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        int i13 = iVar.f27314t + 1;
        iVar.f27314t = i13;
        ArrayList arrayList3 = iVar.N;
        if (arrayList3 == null) {
            m.n("charList");
            throw null;
        }
        if (i13 < arrayList3.size()) {
            iVar.j();
            return;
        }
        ta.a aVar6 = iVar.f45600c;
        m.c(aVar6);
        TextView textView = ((h1) aVar6).f32649f;
        ARChar aRChar = iVar.M;
        if (aRChar == null) {
            m.n("curChar");
            throw null;
        }
        textView.setText(aRChar.getZhuyin());
        ta.a aVar7 = iVar.f45600c;
        m.c(aVar7);
        ((h1) aVar7).f32647d.setOnClickListener(null);
        ta.a aVar8 = iVar.f45600c;
        m.c(aVar8);
        ((h1) aVar8).f32647d.setVisibility(8);
        ta.a aVar9 = iVar.f45600c;
        m.c(aVar9);
        ((h1) aVar9).f32646c.setVisibility(8);
        hVar.f29271a.x(2);
        ta.a aVar10 = iVar.f45600c;
        m.c(aVar10);
        ((h1) aVar10).f32650g.b();
        long j11 = this.f27311b;
        if (j11 > 300) {
            th.j.a(qx.h.m(j11 - ((long) LogSeverity.NOTICE_VALUE), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new b2(iVar, 11), g.f27305b), iVar.f45601d);
            return;
        }
        q qVar = fv.b.f28186a;
        ARChar aRChar2 = iVar.M;
        if (aRChar2 == null) {
            m.n("curChar");
            throw null;
        }
        String strD = fv.b.d(aRChar2.getAudioName() + ".mp3");
        ta.a aVar11 = iVar.f45600c;
        m.c(aVar11);
        hVar.a((ImageView) ((h1) aVar11).f32645b.f32408d, strD);
        ta.a aVar12 = iVar.f45600c;
        m.c(aVar12);
        w0 w0VarB = s0.b(((h1) aVar12).f32648e);
        ta.a aVar13 = iVar.f45600c;
        m.c(aVar13);
        w0VarB.l(-((h1) aVar13).f32648e.getHeight());
        w0VarB.e(300L);
        w0VarB.i();
        ta.a aVar14 = iVar.f45600c;
        m.c(aVar14);
        w0 w0VarB2 = s0.b(((h1) aVar14).f32649f);
        ta.a aVar15 = iVar.f45600c;
        m.c(aVar15);
        w0VarB2.l(-((h1) aVar15).f32648e.getHeight());
        w0VarB2.e(300L);
        w0VarB2.i();
        z.b(iVar.d(), new e(iVar, 2));
    }
}
