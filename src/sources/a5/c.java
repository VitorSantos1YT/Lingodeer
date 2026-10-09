package a5;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.alibaba.sdk.android.oss.common.OSSConstants;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f359e = new c(1, (String) null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f360f = new c(2, (String) null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f361g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f362h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f363i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f364j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f365k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f366l;
    public static final c m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final c f370q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final c f371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f372s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s f376d;

    static {
        new c(4, (String) null);
        new c(8, (String) null);
        f361g = new c(16, (String) null);
        new c(32, (String) null);
        f362h = new c(64, (String) null);
        f363i = new c(128, (String) null);
        new c(256, l.class);
        new c(512, l.class);
        new c(1024, m.class);
        new c(2048, m.class);
        f364j = new c(4096, (String) null);
        f365k = new c(OSSConstants.DEFAULT_BUFFER_SIZE, (String) null);
        new c(16384, (String) null);
        new c(32768, (String) null);
        new c(65536, (String) null);
        new c(OSSConstants.DEFAULT_STREAM_BUFFER_SIZE, q.class);
        f366l = new c(262144, (String) null);
        m = new c(524288, (String) null);
        f367n = new c(1048576, (String) null);
        new c(2097152, r.class);
        int i11 = Build.VERSION.SDK_INT;
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, o.class);
        f368o = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f369p = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f370q = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f371r = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new c(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new c(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new c(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new c(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        f372s = new c(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, p.class);
        new c(i11 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, n.class);
        new c(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new c(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new c(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new c(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new c(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new c(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new c(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new c(i11 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new c(i11 >= 34 ? b.c() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public c(int i11, String str) {
        this(null, i11, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f373a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        Object obj2 = ((c) obj).f373a;
        Object obj3 = this.f373a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f373a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strD = g.d(this.f374b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f373a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strD);
        return sb2.toString();
    }

    public c(int i11, Class cls) {
        this(null, i11, null, null, cls);
    }

    public c(Object obj, int i11, CharSequence charSequence, s sVar, Class cls) {
        this.f374b = i11;
        this.f376d = sVar;
        if (obj == null) {
            this.f373a = new AccessibilityNodeInfo.AccessibilityAction(i11, charSequence);
        } else {
            this.f373a = obj;
        }
        this.f375c = cls;
    }
}
