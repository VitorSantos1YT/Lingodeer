package ad;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f635e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f636f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f637g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f638h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f639i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f640j;

    public t(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((v) obj).f643a instanceof Integer) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (((v) obj2).f643a instanceof PointF) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : list) {
            if (((v) obj3).f643a instanceof Float) {
                arrayList3.add(obj3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : list) {
            if (((v) obj4).f643a instanceof ld.c) {
                arrayList4.add(obj4);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj5 : list) {
            if (((v) obj5).f643a instanceof ColorFilter) {
                arrayList5.add(obj5);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        for (Object obj6 : list) {
            if (((v) obj6).f643a instanceof Object[]) {
                arrayList6.add(obj6);
            }
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj7 : list) {
            if (((v) obj7).f643a instanceof Typeface) {
                arrayList7.add(obj7);
            }
        }
        ArrayList arrayList8 = new ArrayList();
        for (Object obj8 : list) {
            if (((v) obj8).f643a instanceof Bitmap) {
                arrayList8.add(obj8);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        for (Object obj9 : list) {
            if (((v) obj9).f643a instanceof CharSequence) {
                arrayList9.add(obj9);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        for (Object obj10 : list) {
            if (((v) obj10).f643a instanceof Path) {
                arrayList10.add(obj10);
            }
        }
        this.f631a = arrayList;
        this.f632b = arrayList2;
        this.f633c = arrayList3;
        this.f634d = arrayList4;
        this.f635e = arrayList5;
        this.f636f = arrayList6;
        this.f637g = arrayList7;
        this.f638h = arrayList8;
        this.f639i = arrayList9;
        this.f640j = arrayList10;
    }
}
