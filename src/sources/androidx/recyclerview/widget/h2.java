package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 extends z4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2 f2468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final WeakHashMap f2469e = new WeakHashMap();

    public h2(i2 i2Var) {
        this.f2468d = i2Var;
    }

    @Override // z4.b
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.f2469e.get(view);
        return bVar != null ? bVar.a(view, accessibilityEvent) : this.f58810a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // z4.b
    public final a5.j b(View view) {
        z4.b bVar = (z4.b) this.f2469e.get(view);
        return bVar != null ? bVar.b(view) : super.b(view);
    }

    @Override // z4.b
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.f2469e.get(view);
        if (bVar != null) {
            bVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // z4.b
    public final void d(View view, a5.g gVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f380a;
        i2 i2Var = this.f2468d;
        RecyclerView recyclerView = i2Var.f2483d;
        RecyclerView recyclerView2 = i2Var.f2483d;
        boolean zHasPendingAdapterUpdates = recyclerView.hasPendingAdapterUpdates();
        View.AccessibilityDelegate accessibilityDelegate = this.f58810a;
        if (zHasPendingAdapterUpdates || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().onInitializeAccessibilityNodeInfoForItem(view, gVar);
        z4.b bVar = (z4.b) this.f2469e.get(view);
        if (bVar != null) {
            bVar.d(view, gVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // z4.b
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.f2469e.get(view);
        if (bVar != null) {
            bVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // z4.b
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.f2469e.get(viewGroup);
        return bVar != null ? bVar.f(viewGroup, view, accessibilityEvent) : this.f58810a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // z4.b
    public final boolean g(View view, int i11, Bundle bundle) {
        i2 i2Var = this.f2468d;
        RecyclerView recyclerView = i2Var.f2483d;
        RecyclerView recyclerView2 = i2Var.f2483d;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i11, bundle);
        }
        z4.b bVar = (z4.b) this.f2469e.get(view);
        if (bVar != null) {
            if (bVar.g(view, i11, bundle)) {
                return true;
            }
        } else if (super.g(view, i11, bundle)) {
            return true;
        }
        return recyclerView2.getLayoutManager().performAccessibilityActionForItem(view, i11, bundle);
    }

    @Override // z4.b
    public final void h(View view, int i11) {
        z4.b bVar = (z4.b) this.f2469e.get(view);
        if (bVar != null) {
            bVar.h(view, i11);
        } else {
            super.h(view, i11);
        }
    }

    @Override // z4.b
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        z4.b bVar = (z4.b) this.f2469e.get(view);
        if (bVar != null) {
            bVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
