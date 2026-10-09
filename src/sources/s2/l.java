package s2;

import android.os.Build;
import android.view.MotionEvent;
import java.util.List;
import qp.o2;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f51328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ie.o f51329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f51330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51332e;

    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public l(List list, ie.o oVar) {
        int classification;
        this.f51328a = list;
        this.f51329b = oVar;
        int i11 = 0;
        if (Build.VERSION.SDK_INT < 29) {
            classification = 0;
        } else {
            MotionEvent motionEvent = oVar != null ? (MotionEvent) ((o2) oVar.f34407d).f48096c : null;
            if (motionEvent != null) {
                classification = motionEvent.getClassification();
            } else {
                classification = 0;
            }
        }
        this.f51330c = classification;
        MotionEvent motionEvent2 = oVar != null ? (MotionEvent) ((o2) oVar.f34407d).f48096c : null;
        this.f51331d = motionEvent2 != null ? motionEvent2.getButtonState() : 0;
        MotionEvent motionEvent3 = oVar != null ? (MotionEvent) ((o2) oVar.f34407d).f48096c : null;
        if (motionEvent3 != null) {
            motionEvent3.getMetaState();
        }
        MotionEvent motionEvent4 = oVar != null ? (MotionEvent) ((o2) oVar.f34407d).f48096c : null;
        if (motionEvent4 != null) {
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked == 0) {
                i11 = 1;
            } else if (actionMasked == 1) {
                i11 = 2;
            } else if (actionMasked != 2) {
                switch (actionMasked) {
                    case 5:
                        i11 = 1;
                        break;
                    case 6:
                        i11 = 2;
                        break;
                    case 7:
                        i11 = 3;
                        break;
                    case 8:
                        i11 = 6;
                        break;
                    case 9:
                        i11 = 4;
                        break;
                    case 10:
                        i11 = 5;
                        break;
                }
            } else {
                i11 = 3;
            }
        } else {
            int size = list.size();
            while (true) {
                if (i11 < size) {
                    t tVar = (t) list.get(i11);
                    if (s.c(tVar)) {
                        i11 = 2;
                    } else if (s.a(tVar)) {
                        i11 = 1;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = 3;
                }
            }
        }
        this.f51332e = i11;
    }
}
