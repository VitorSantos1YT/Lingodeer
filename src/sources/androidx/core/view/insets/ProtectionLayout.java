package androidx.core.view.insets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.lingodeer.R;
import hh.p0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class ProtectionLayout extends FrameLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f1410c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f1411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c5.a f1412b;

    public ProtectionLayout(Context context) {
        super(context);
        this.f1411a = new ArrayList();
    }

    private a getOrInstallSystemBarStateMonitor() {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof a) {
            return (a) tag;
        }
        a aVar = new a(viewGroup);
        viewGroup.setTag(R.id.tag_system_bar_state_monitor, aVar);
        return aVar;
    }

    public final void a() {
        ArrayList arrayList = this.f1411a;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f1412b = new c5.a(getOrInstallSystemBarStateMonitor(), arrayList);
        getChildCount();
        if (this.f1412b.f6600a.size() <= 0) {
            return;
        }
        if (this.f1412b.f6600a.get(0) != null) {
            throw new ClassCastException();
        }
        getContext();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (view != null && view.getTag() != f1410c) {
            c5.a aVar = this.f1412b;
            int childCount = getChildCount() - (aVar != null ? aVar.f6600a.size() : 0);
            if (i11 > childCount || i11 < 0) {
                i11 = childCount;
            }
        }
        super.addView(view, i11, layoutParams);
    }

    public final void b() {
        if (this.f1412b != null) {
            removeViews(getChildCount() - this.f1412b.f6600a.size(), this.f1412b.f6600a.size());
            if (this.f1412b.f6600a.size() > 0) {
                throw p0.e(0, this.f1412b.f6600a);
            }
            c5.a aVar = this.f1412b;
            ArrayList arrayList = aVar.f6600a;
            if (!aVar.f6603d) {
                aVar.f6603d = true;
                aVar.f6601b.f1416b.remove(aVar);
                int size = arrayList.size() - 1;
                if (size >= 0) {
                    throw p0.e(size, arrayList);
                }
                arrayList.clear();
            }
            this.f1412b = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1412b != null) {
            b();
        }
        a();
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
        ViewGroup viewGroup = (ViewGroup) getRootView();
        Object tag = viewGroup.getTag(R.id.tag_system_bar_state_monitor);
        if (tag instanceof a) {
            a aVar = (a) tag;
            if (aVar.f1416b.isEmpty()) {
                aVar.f1415a.post(new b2.a(aVar, 3));
                viewGroup.setTag(R.id.tag_system_bar_state_monitor, null);
            }
        }
    }

    public void setProtections(List<Object> list) {
        ArrayList arrayList = this.f1411a;
        arrayList.clear();
        arrayList.addAll(list);
        if (isAttachedToWindow()) {
            b();
            a();
            requestApplyInsets();
        }
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ProtectionLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, 0);
        this.f1411a = new ArrayList();
    }
}
