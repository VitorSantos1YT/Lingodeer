package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 {
    private static final /* synthetic */ q2[] $VALUES;
    public static final o2 Companion;
    public static final q2 GONE;
    public static final q2 INVISIBLE;
    public static final q2 REMOVED;
    public static final q2 VISIBLE;

    static {
        q2 q2Var = new q2("REMOVED", 0);
        REMOVED = q2Var;
        q2 q2Var2 = new q2("VISIBLE", 1);
        VISIBLE = q2Var2;
        q2 q2Var3 = new q2("GONE", 2);
        GONE = q2Var3;
        q2 q2Var4 = new q2("INVISIBLE", 3);
        INVISIBLE = q2Var4;
        $VALUES = new q2[]{q2Var, q2Var2, q2Var3, q2Var4};
        Companion = new o2();
    }

    public static q2 valueOf(String str) {
        return (q2) Enum.valueOf(q2.class, str);
    }

    public static q2[] values() {
        return (q2[]) $VALUES.clone();
    }

    public final void a(View view, ViewGroup container) {
        kotlin.jvm.internal.m.f(view, "view");
        kotlin.jvm.internal.m.f(container, "container");
        int i11 = p2.f1787a[ordinal()];
        if (i11 == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (k1.L(2)) {
                    view.toString();
                    viewGroup.toString();
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i11 == 2) {
            if (k1.L(2)) {
                view.toString();
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (k1.L(2)) {
                    view.toString();
                    container.toString();
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i11 == 3) {
            if (k1.L(2)) {
                view.toString();
            }
            view.setVisibility(8);
        } else {
            if (i11 != 4) {
                return;
            }
            if (k1.L(2)) {
                view.toString();
            }
            view.setVisibility(4);
        }
    }
}
