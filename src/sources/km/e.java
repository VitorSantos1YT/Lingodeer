package km;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.google.logging.type.LogSeverity;
import hj.b4;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends ve.i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f38174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView f38175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f38176f;

    public e(f fVar, ImageView imageView, int i11) {
        this.f38174d = fVar;
        this.f38175e = imageView;
        this.f38176f = i11;
    }

    @Override // z4.x0
    public final void b(View view) {
        int i11;
        kotlin.jvm.internal.m.f(view, "view");
        f fVar = this.f38174d;
        if (fVar.f36398d == null) {
            return;
        }
        com.plattysoft.leonids.a aVar = new com.plattysoft.leonids.a(fVar.requireActivity());
        gw.a aVar2 = new gw.a(2);
        ArrayList arrayList = aVar.f22405k;
        arrayList.add(aVar2);
        float f5 = aVar.m;
        gw.c cVar = new gw.c();
        cVar.f29882a = 0.1f * f5;
        cVar.f29883b = 0.25f * f5;
        cVar.f29884c = 0;
        cVar.f29885d = 360;
        while (true) {
            int i12 = cVar.f29884c;
            if (i12 >= 0) {
                break;
            } else {
                cVar.f29884c = i12 + 360;
            }
        }
        while (true) {
            i11 = cVar.f29885d;
            if (i11 >= 0) {
                break;
            } else {
                cVar.f29885d = i11 + 360;
            }
        }
        int i13 = cVar.f29884c;
        if (i13 > i11) {
            cVar.f29884c = i11;
            cVar.f29885d = i13;
        }
        arrayList.add(cVar);
        arrayList.add(new gw.a(0));
        arrayList.add(new gw.a(1));
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        long j11 = aVar.f22401g;
        long j12 = j11 - 200;
        hw.a aVar3 = new hw.a();
        aVar3.f33821a = j12;
        aVar3.f33822b = j11;
        aVar3.f33823c = j11 - j12;
        aVar3.f33824d = -255;
        aVar3.f33825e = accelerateInterpolator;
        aVar.f22404j.add(aVar3);
        aVar.c(this.f38175e);
        if (this.f38176f == fVar.N - 1) {
            ta.a aVar4 = fVar.f36400f;
            kotlin.jvm.internal.m.c(aVar4);
            ((b4) aVar4).f32391i.setVisibility(0);
            LinearInterpolator linearInterpolator = new LinearInterpolator();
            ta.a aVar5 = fVar.f36400f;
            kotlin.jvm.internal.m.c(aVar5);
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(((b4) aVar5).f32391i, PropertyValuesHolder.ofFloat("scaleX", 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f));
            objectAnimatorOfPropertyValuesHolder.setDuration(LogSeverity.EMERGENCY_VALUE);
            objectAnimatorOfPropertyValuesHolder.setRepeatMode(2);
            objectAnimatorOfPropertyValuesHolder.setRepeatCount(-1);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(linearInterpolator);
            objectAnimatorOfPropertyValuesHolder.start();
            if (fVar.r().showAnim) {
                int[] iArr = bq.r.f4959a;
                ta.a aVar6 = fVar.f36400f;
                kotlin.jvm.internal.m.c(aVar6);
                ((b4) aVar6).f32386d.h();
            }
        }
    }
}
