package z4;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.lingodeer.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f58809c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f58810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f58811b;

    public b() {
        this(f58809c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f58810a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a5.j b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f58810a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a5.j(accessibilityNodeProvider, 0);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f58810a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, a5.g gVar) {
        this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f58810a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f58810a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i11, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            if (i12 < list.size()) {
                a5.c cVar = (a5.c) list.get(i12);
                if (cVar.a() == i11) {
                    Class cls = cVar.f375c;
                    a5.s sVar = cVar.f376d;
                    if (sVar != null) {
                        if (cls != null) {
                            try {
                                if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                    throw null;
                                }
                                throw new ClassCastException();
                            } catch (Exception unused) {
                            }
                        }
                        zPerformAccessibilityAction = sVar.perform(view, null);
                        break;
                    }
                } else {
                    i12++;
                }
            }
            zPerformAccessibilityAction = false;
            break;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f58810a.performAccessibilityAction(view, i11, bundle);
        }
        if (zPerformAccessibilityAction || i11 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i13 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i13)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i14 = 0; clickableSpanArr != null && i14 < clickableSpanArr.length; i14++) {
                if (clickableSpan.equals(clickableSpanArr[i14])) {
                    clickableSpan.onClick(view);
                    z11 = true;
                    break;
                }
            }
        }
        return z11;
    }

    public void h(View view, int i11) {
        this.f58810a.sendAccessibilityEvent(view, i11);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f58810a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f58810a = accessibilityDelegate;
        this.f58811b = new a(this);
    }
}
