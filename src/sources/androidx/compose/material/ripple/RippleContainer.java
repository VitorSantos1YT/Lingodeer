package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import com.lingodeer.R;
import g1.g;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;
import ns.o;
import ob.e;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f1117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f1118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f1119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1120e;

    public RippleContainer(Context context) {
        super(context);
        this.f1116a = 5;
        ArrayList arrayList = new ArrayList();
        this.f1117b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f1118c = arrayList2;
        this.f1119d = new e(10);
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.f1120e = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final RippleHostView a(g gVar) {
        e eVar = this.f1119d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) eVar.f44804b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) eVar.f44804b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) eVar.f44805c;
        RippleHostView rippleHostView = (RippleHostView) linkedHashMap.get(gVar);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        ArrayList arrayList = this.f1118c;
        m.f(arrayList, "<this>");
        RippleHostView rippleHostView2 = (RippleHostView) (arrayList.isEmpty() ? null : arrayList.remove(0));
        if (rippleHostView2 == null) {
            int i11 = this.f1120e;
            ArrayList arrayList2 = this.f1117b;
            if (i11 > o.A(arrayList2)) {
                rippleHostView2 = new RippleHostView(getContext());
                addView(rippleHostView2);
                arrayList2.add(rippleHostView2);
            } else {
                rippleHostView2 = (RippleHostView) arrayList2.get(this.f1120e);
                g gVar2 = (g) linkedHashMap3.get(rippleHostView2);
                if (gVar2 != null) {
                    gVar2.J();
                    RippleHostView rippleHostView3 = (RippleHostView) linkedHashMap2.get(gVar2);
                    if (rippleHostView3 != null) {
                    }
                    linkedHashMap2.remove(gVar2);
                    rippleHostView2.c();
                }
            }
            int i12 = this.f1120e;
            if (i12 < this.f1116a - 1) {
                this.f1120e = i12 + 1;
            } else {
                this.f1120e = 0;
            }
        }
        linkedHashMap2.put(gVar, rippleHostView2);
        linkedHashMap3.put(rippleHostView2, gVar);
        return rippleHostView2;
    }

    @Override // android.view.View
    public final void onMeasure(int i11, int i12) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }
}
