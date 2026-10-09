package p9;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b1;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends z4.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f46657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f46658e;

    public /* synthetic */ e0(Object obj, int i11) {
        this.f46657d = i11;
        this.f46658e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    @Override // z4.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z11;
        ua.a aVar;
        switch (this.f46657d) {
            case 1:
                ViewPager viewPager = (ViewPager) this.f46658e;
                super.c(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                ua.a aVar2 = viewPager.f2750e;
                if (aVar2 != null) {
                    z11 = aVar2.c() > 1;
                }
                accessibilityEvent.setScrollable(z11);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = viewPager.f2750e) != null) {
                    accessibilityEvent.setItemCount(aVar.c());
                    accessibilityEvent.setFromIndex(viewPager.f2752f);
                    accessibilityEvent.setToIndex(viewPager.f2752f);
                    break;
                }
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // z4.b
    public final void d(View view, a5.g gVar) {
        switch (this.f46657d) {
            case 0:
                f0 f0Var = (f0) this.f46658e;
                f0Var.f46661t.d(view, gVar);
                RecyclerView recyclerView = f0Var.f46660f;
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
                b1 adapter = recyclerView.getAdapter();
                if (adapter instanceof y) {
                    ((y) adapter).c(childAdapterPosition);
                    break;
                }
                break;
            default:
                this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
                gVar.m(ViewPager.class.getName());
                ViewPager viewPager = (ViewPager) this.f46658e;
                ua.a aVar = viewPager.f2750e;
                gVar.u(aVar != null && aVar.c() > 1);
                if (viewPager.canScrollHorizontally(1)) {
                    gVar.a(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    gVar.a(OSSConstants.DEFAULT_BUFFER_SIZE);
                }
                break;
        }
    }

    @Override // z4.b
    public final boolean g(View view, int i11, Bundle bundle) {
        switch (this.f46657d) {
            case 0:
                return ((f0) this.f46658e).f46661t.g(view, i11, bundle);
            default:
                ViewPager viewPager = (ViewPager) this.f46658e;
                if (super.g(view, i11, bundle)) {
                    return true;
                }
                if (i11 != 4096) {
                    if (i11 == 8192 && viewPager.canScrollHorizontally(-1)) {
                        viewPager.setCurrentItem(viewPager.f2752f - 1);
                        return true;
                    }
                } else if (viewPager.canScrollHorizontally(1)) {
                    viewPager.setCurrentItem(viewPager.f2752f + 1);
                    return true;
                }
                return false;
        }
    }
}
