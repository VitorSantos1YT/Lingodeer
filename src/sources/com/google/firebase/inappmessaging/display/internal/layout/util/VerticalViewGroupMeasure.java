package com.google.firebase.inappmessaging.display.internal.layout.util;

import com.yalantis.ucrop.view.CropImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class VerticalViewGroupMeasure {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f19943a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19944b = 0;

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.layout.util.VerticalViewGroupMeasure$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass1 implements Comparator<ViewMeasure> {
        @Override // java.util.Comparator
        public final int compare(ViewMeasure viewMeasure, ViewMeasure viewMeasure2) {
            ViewMeasure viewMeasure3 = viewMeasure;
            ViewMeasure viewMeasure4 = viewMeasure2;
            if (viewMeasure3.a() > viewMeasure4.a()) {
                return -1;
            }
            return viewMeasure3.a() < viewMeasure4.a() ? 1 : 0;
        }
    }

    public final void a(int i11) {
        float f5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f19943a;
        int size = arrayList2.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            ViewMeasure viewMeasure = (ViewMeasure) obj;
            if (viewMeasure.f19946b) {
                arrayList.add(viewMeasure);
            }
        }
        Collections.sort(arrayList, new AnonymousClass1());
        int size2 = arrayList.size();
        int iA = 0;
        int i14 = 0;
        while (i14 < size2) {
            Object obj2 = arrayList.get(i14);
            i14++;
            iA += ((ViewMeasure) obj2).a();
        }
        int size3 = arrayList.size();
        if (size3 >= 6) {
            throw new IllegalStateException("VerticalViewGroupMeasure only supports up to 5 children");
        }
        float f11 = 1.0f - ((size3 - 1) * 0.2f);
        int size4 = arrayList.size();
        float f12 = CropImageView.DEFAULT_ASPECT_RATIO;
        while (i12 < size4) {
            Object obj3 = arrayList.get(i12);
            i12++;
            ViewMeasure viewMeasure2 = (ViewMeasure) obj3;
            float fA = viewMeasure2.a() / iA;
            if (fA > f11) {
                f12 += fA - f11;
                f5 = f11;
            } else {
                f5 = fA;
            }
            if (fA < 0.2f) {
                float fMin = Math.min(0.2f - fA, f12);
                f12 -= fMin;
                f5 = fA + fMin;
            }
            viewMeasure2.f19947c = (int) (f5 * i11);
        }
    }
}
