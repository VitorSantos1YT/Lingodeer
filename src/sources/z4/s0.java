package z4;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.appcompat.widget.AppCompatEditText;
import com.google.api.Service;
import com.lingodeer.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f58893a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f58894b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f58895c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f58896d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f58897e = new e0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g0 f58898f = new g0();

    public static void a(View view, ViewGroup viewGroup) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        kotlin.jvm.internal.m.f(view2, "<this>");
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static w0 b(View view) {
        if (f58893a == null) {
            f58893a = new WeakHashMap();
        }
        w0 w0Var = (w0) f58893a.get(view);
        if (w0Var != null) {
            return w0Var;
        }
        w0 w0Var2 = new w0(view);
        f58893a.put(view, w0Var2);
        return w0Var2;
    }

    public static v1 c(View view, v1 v1Var) {
        int i11 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsG = v1Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsA = i11 >= 30 ? p0.a(view, windowInsetsG) : h0.a(view, windowInsetsG);
            if (!windowInsetsA.equals(windowInsetsG)) {
                return v1.h(view, windowInsetsA);
            }
        }
        return v1Var;
    }

    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = r0.f58888d;
        r0 r0Var = (r0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (r0Var == null) {
            r0Var = new r0();
            r0Var.f58889a = null;
            r0Var.f58890b = null;
            r0Var.f58891c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, r0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = r0Var.f58889a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = r0.f58888d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (r0Var.f58889a == null) {
                            r0Var.f58889a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = r0.f58888d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                r0Var.f58889a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    r0Var.f58889a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        View viewA = r0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (r0Var.f58890b == null) {
                    r0Var.f58890b = new SparseArray();
                }
                r0Var.f58890b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate e(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return o0.a(view);
        }
        if (f58895c) {
            return null;
        }
        if (f58894b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f58894b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f58895c = true;
                return null;
            }
        }
        try {
            Object obj = f58894b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f58895c = true;
            return null;
        }
    }

    public static CharSequence f(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = n0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] h(AppCompatEditText appCompatEditText) {
        return Build.VERSION.SDK_INT >= 31 ? q0.a(appCompatEditText) : (String[]) appCompatEditText.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static b2 i(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return p0.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new b2(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static void j(View view, int i11) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z11 = f(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z11) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z11 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i11);
                if (z11) {
                    accessibilityEventObtain.getText().add(f(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i11 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i11);
                        return;
                    } catch (AbstractMethodError unused) {
                        view.getParent().getClass();
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i11);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    public static v1 k(View view, v1 v1Var) {
        WindowInsets windowInsetsG = v1Var.g();
        if (windowInsetsG != null) {
            WindowInsets windowInsetsB = h0.b(view, windowInsetsG);
            if (!windowInsetsB.equals(windowInsetsG)) {
                return v1.h(view, windowInsetsB);
            }
        }
        return v1Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002d  */
    /* JADX WARN: Code duplicated, block: B:25:0x002f  */
    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    public static void l(View view, int i11) {
        int i12;
        if (i11 == -1) {
            i12 = -1;
        } else {
            int i13 = Build.VERSION.SDK_INT;
            i12 = 6;
            if (i13 < 34) {
                switch (i11) {
                    case 21:
                    case 23:
                    case Service.BILLING_FIELD_NUMBER /* 26 */:
                        i11 = 6;
                        break;
                    case 22:
                    case Service.METRICS_FIELD_NUMBER /* 24 */:
                    case 27:
                        i11 = 4;
                        break;
                    case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                        i11 = 0;
                        break;
                }
            }
            if (i13 >= 30) {
                i12 = i11;
            } else if (i11 == 12) {
                i12 = 1;
            } else if (i11 != 13) {
                if (i11 == 16) {
                    i12 = 1;
                } else if (i11 != 17) {
                    i12 = i11;
                } else {
                    i12 = 0;
                }
            }
            if (i13 < 27 && (i12 == 7 || i12 == 8 || i12 == 9)) {
                i12 = -1;
            }
        }
        if (i12 == -1) {
            return;
        }
        view.performHapticFeedback(i12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h m(View view, h hVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(hVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return q0.b(view, hVar);
        }
        e5.p pVar = (e5.p) view.getTag(R.id.tag_on_receive_content_listener);
        v vVar = f58897e;
        if (pVar == null) {
            if (view instanceof v) {
                vVar = (v) view;
            }
            return vVar.a(hVar);
        }
        h hVarA = e5.p.a(view, hVar);
        if (hVarA == null) {
            return null;
        }
        if (view instanceof v) {
            vVar = (v) view;
        }
        return vVar.a(hVarA);
    }

    public static void n(View view, int i11) {
        ArrayList arrayListG = g(view);
        for (int i12 = 0; i12 < arrayListG.size(); i12++) {
            if (((a5.c) arrayListG.get(i12)).a() == i11) {
                arrayListG.remove(i12);
                return;
            }
        }
    }

    public static void o(View view, a5.c cVar, String str, a5.s sVar) {
        b bVar;
        if (sVar == null && str == null) {
            n(view, cVar.a());
            j(view, 0);
            return;
        }
        a5.c cVar2 = new a5.c(null, cVar.f374b, str, sVar, cVar.f375c);
        View.AccessibilityDelegate accessibilityDelegateE = e(view);
        if (accessibilityDelegateE == null) {
            bVar = null;
        } else {
            bVar = accessibilityDelegateE instanceof a ? ((a) accessibilityDelegateE).f58803a : new b(accessibilityDelegateE);
        }
        if (bVar == null) {
            bVar = new b();
        }
        q(view, bVar);
        n(view, cVar2.a());
        g(view).add(cVar2);
        j(view, 0);
    }

    public static void p(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            o0.b(view, context, iArr, attributeSet, typedArray, i11, 0);
        }
    }

    public static void q(View view, b bVar) {
        if (bVar == null && (e(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f58811b);
    }

    public static void r(View view, CharSequence charSequence) {
        new f0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).f(view, charSequence);
        g0 g0Var = f58898f;
        if (charSequence == null) {
            g0Var.f58838a.remove(view);
            view.removeOnAttachStateChangeListener(g0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(g0Var);
        } else {
            g0Var.f58838a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(g0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(g0Var);
            }
        }
    }

    public static void s(View view, androidx.datastore.preferences.protobuf.l lVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            e1.h(view, lVar);
            return;
        }
        PathInterpolator pathInterpolator = a1.f58805e;
        View.OnApplyWindowInsetsListener z0Var = lVar != null ? new z0(view, lVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, z0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(z0Var);
        }
    }
}
