package zi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import hj.v1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import jp.p0;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f59238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f59239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f59240c;

    public f(View view, g gVar, long j11) {
        this.f59238a = view;
        this.f59239b = gVar;
        this.f59240c = j11;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        m.f(animation, "animation");
        super.onAnimationEnd(animation);
        this.f59238a.findViewById(R.id.ll_elem).setVisibility(0);
        g gVar = this.f59239b;
        ta.a aVar = gVar.f59227f;
        m.c(aVar);
        ((v1) aVar).f33451e.setTranslationX(CropImageView.DEFAULT_ASPECT_RATIO);
        ta.a aVar2 = gVar.f59227f;
        m.c(aVar2);
        ((v1) aVar2).f33451e.setTranslationY(CropImageView.DEFAULT_ASPECT_RATIO);
        int i11 = gVar.f59243k + 1;
        gVar.f59243k = i11;
        ArrayList arrayList = gVar.f59242j;
        if (i11 < arrayList.size()) {
            ta.a aVar3 = gVar.f59227f;
            m.c(aVar3);
            ((v1) aVar3).f33451e.setText((CharSequence) arrayList.get(gVar.f59243k));
            return;
        }
        ta.a aVar4 = gVar.f59227f;
        m.c(aVar4);
        ((v1) aVar4).f33451e.setOnClickListener(null);
        ta.a aVar5 = gVar.f59227f;
        m.c(aVar5);
        ((v1) aVar5).f33451e.setVisibility(8);
        ((p0) gVar.f59222a).O(5);
        ta.a aVar6 = gVar.f59227f;
        m.c(aVar6);
        ((v1) aVar6).f33452f.b();
        long j11 = this.f59240c;
        if (j11 > 300) {
            th.j.a(qx.h.m(j11 - ((long) LogSeverity.NOTICE_VALUE), TimeUnit.MILLISECONDS, ky.e.f38937b).g(px.b.a()).h(new tp.g(gVar, 11), a.f59216c), gVar.f59228g);
        }
    }
}
