package ke;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.view.View;
import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.m;
import th.j;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements tx.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38132a;

    public b(ArrayList arrayList) {
        this.f38132a = arrayList;
    }

    @Override // tx.c
    public void accept(Object obj) {
        Long it = (Long) obj;
        m.f(it, "it");
        ArrayList arrayList = this.f38132a;
        Collections.shuffle(arrayList);
        Iterator it2 = arrayList.iterator();
        m.e(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next = it2.next();
            m.e(next, "next(...)");
            float fM = (j.m(10) / 10.0f) + 1.5f;
            ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder((View) next, PropertyValuesHolder.ofFloat("scaleX", CropImageView.DEFAULT_ASPECT_RATIO, fM), PropertyValuesHolder.ofFloat("scaleY", CropImageView.DEFAULT_ASPECT_RATIO, fM), PropertyValuesHolder.ofFloat("alpha", CropImageView.DEFAULT_ASPECT_RATIO, 1.0f, CropImageView.DEFAULT_ASPECT_RATIO)).setDuration((((long) j.m(10)) * 60) + 700);
            duration.setRepeatCount(2);
            duration.start();
        }
    }

    public b() {
        this.f38132a = new ArrayList();
    }
}
