package l5;

import a5.g;
import a5.j;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import ay.k0;
import cf.x;
import com.yalantis.ucrop.view.CropImageView;
import fr.p3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import y.s;
import y.u0;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends z4.b {
    public static final Rect P = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final k0 Q;
    public static final p3 R;
    public final AccessibilityManager H;
    public final View K;
    public a L;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f39738d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Rect f39739e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f39740f = new Rect();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f39741t = new int[2];
    public int M = Integer.MIN_VALUE;
    public int N = Integer.MIN_VALUE;
    public int O = Integer.MIN_VALUE;

    static {
        int i11 = 17;
        Q = new k0(i11);
        R = new p3(i11);
    }

    public b(View view) {
        this.K = view;
        this.H = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = s0.f58893a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // z4.b
    public final j b(View view) {
        if (this.L == null) {
            this.L = new a(this, 0);
        }
        return this.L;
    }

    @Override // z4.b
    public final void d(View view, g gVar) {
        this.f58810a.onInitializeAccessibilityNodeInfo(view, gVar.f380a);
        t(gVar);
    }

    public final boolean j(int i11) {
        if (this.N != i11) {
            return false;
        }
        this.N = Integer.MIN_VALUE;
        v(i11, false);
        x(i11, 8);
        return true;
    }

    public final AccessibilityEvent k(int i11, int i12) {
        View view = this.K;
        if (i11 == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i12);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i12);
        g gVarR = r(i11);
        accessibilityEventObtain2.getText().add(gVarR.g());
        AccessibilityNodeInfo accessibilityNodeInfo = gVarR.f380a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i11);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    public final g l(int i11) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        g gVar = new g(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        gVar.m("android.view.View");
        Rect rect = P;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        gVar.l(rect);
        gVar.f381b = -1;
        View view = this.K;
        accessibilityNodeInfoObtain.setParent(view);
        u(i11, gVar);
        if (gVar.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f39739e;
        gVar.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        gVar.f382c = i11;
        accessibilityNodeInfoObtain.setSource(view, i11);
        if (this.M == i11) {
            gVar.i(true);
            gVar.a(128);
        } else {
            gVar.i(false);
            gVar.a(64);
        }
        boolean z11 = this.N == i11;
        if (z11) {
            gVar.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            gVar.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z11);
        int[] iArr = this.f39741t;
        view.getLocationOnScreen(iArr);
        Rect rect3 = this.f39738d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            gVar.f(rect3);
            if (gVar.f381b != -1) {
                g gVar2 = new g(AccessibilityNodeInfo.obtain());
                for (int i12 = gVar.f381b; i12 != -1; i12 = gVar2.f381b) {
                    gVar2.f381b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = gVar2.f380a;
                    accessibilityNodeInfo.setParent(view, -1);
                    accessibilityNodeInfo.setBoundsInParent(rect);
                    u(i12, gVar2);
                    gVar2.f(rect2);
                    rect3.offset(rect2.left, rect2.top);
                }
            }
            rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
        }
        Rect rect4 = this.f39740f;
        if (view.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect4)) {
                gVar.l(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > CropImageView.DEFAULT_ASPECT_RATIO && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        gVar.y(true);
                    }
                }
            }
        }
        return gVar;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i11;
        AccessibilityManager accessibilityManager = this.H;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iN = n(motionEvent.getX(), motionEvent.getY());
            int i12 = this.O;
            if (i12 != iN) {
                this.O = iN;
                x(iN, 128);
                x(i12, 256);
            }
            if (iN == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i11 = this.O) == Integer.MIN_VALUE) {
                return false;
            }
            if (i11 != Integer.MIN_VALUE) {
                this.O = Integer.MIN_VALUE;
                x(Integer.MIN_VALUE, 128);
                x(i11, 256);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f5, float f11);

    public abstract void o(ArrayList arrayList);

    public final void p(int i11) {
        View view;
        ViewParent parent;
        if (i11 == Integer.MIN_VALUE || !this.H.isEnabled() || (parent = (view = this.K).getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventK = k(i11, 2048);
        accessibilityEventK.setContentChangeTypes(0);
        parent.requestSendAccessibilityEvent(view, accessibilityEventK);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:46:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:51:0x0106  */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:66:0x0131  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:89:0x01a9  */
    public final boolean q(int i11, Rect rect) {
        int i12;
        int i13;
        Object obj;
        g gVar;
        int i14;
        int iF;
        int i15;
        Rect rect2;
        int iH;
        Rect rect3;
        int i16;
        g gVar2;
        int i17;
        int iW;
        int iX;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        u0 u0Var = new u0(0);
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            u0Var.g(((Integer) arrayList.get(i18)).intValue(), l(((Integer) arrayList.get(i18)).intValue()));
        }
        int i19 = this.N;
        g gVar3 = i19 == Integer.MIN_VALUE ? null : (g) u0Var.d(i19);
        k0 k0Var = Q;
        p3 p3Var = R;
        View view = this.K;
        if (i11 == 1 || i11 == 2) {
            i12 = 0;
            i13 = -1;
            WeakHashMap weakHashMap = s0.f58893a;
            boolean z11 = view.getLayoutDirection() == 1;
            p3Var.getClass();
            int iH2 = u0Var.h();
            ArrayList arrayList2 = new ArrayList(iH2);
            for (int i21 = 0; i21 < iH2; i21++) {
                arrayList2.add((g) u0Var.i(i21));
            }
            Collections.sort(arrayList2, new c(z11, k0Var));
            if (i11 == 1) {
                int size = arrayList2.size();
                if (gVar3 != null) {
                    size = arrayList2.indexOf(gVar3);
                }
                int i22 = size - 1;
                if (i22 >= 0) {
                    obj = arrayList2.get(i22);
                } else {
                    obj = null;
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (gVar3 == null ? -1 : arrayList2.lastIndexOf(gVar3)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                } else {
                    obj = null;
                }
            }
            gVar = (g) obj;
        } else {
            if (i11 != 17 && i11 != 33 && i11 != 66 && i11 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i23 = this.N;
            if (i23 != Integer.MIN_VALUE) {
                r(i23).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = view.getWidth();
                    int height = view.getHeight();
                    if (i11 == 17) {
                        i15 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i11 == 33) {
                        i15 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i11 == 66) {
                        i15 = -1;
                        rect4.set(-1, 0, -1, height);
                    } else {
                        if (i11 != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        i15 = -1;
                        rect4.set(0, -1, width, -1);
                    }
                }
                rect2 = new Rect(rect4);
                if (i11 != 17) {
                    i12 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i11 != 33) {
                    i12 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i11 != 66) {
                    i12 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i11 == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i12 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                p3Var.getClass();
                iH = u0Var.h();
                rect3 = new Rect();
                gVar = null;
                for (i16 = i12; i16 < iH; i16++) {
                    gVar2 = (g) u0Var.i(i16);
                    if (gVar2 == gVar3) {
                        k0Var.getClass();
                        gVar2.f(rect3);
                        if (x.v(i11, rect4, rect3)) {
                            if (x.v(i11, rect4, rect2) || x.c(i11, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                gVar = gVar2;
                            } else if (x.c(i11, rect4, rect2, rect3)) {
                                int iW2 = x.w(i11, rect4, rect3);
                                int iX2 = x.x(i11, rect4, rect3);
                                i17 = (iX2 * iX2) + (iW2 * 13 * iW2);
                                iW = x.w(i11, rect4, rect2);
                                iX = x.x(i11, rect4, rect2);
                                if (i17 < (iX * iX) + (iW * 13 * iW)) {
                                    rect2.set(rect3);
                                    gVar = gVar2;
                                }
                            }
                        }
                    }
                }
                i13 = i15;
            }
            i15 = -1;
            rect2 = new Rect(rect4);
            if (i11 != 17) {
                i12 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i11 != 33) {
                i12 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i11 != 66) {
                i12 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i11 == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i12 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            p3Var.getClass();
            iH = u0Var.h();
            rect3 = new Rect();
            gVar = null;
            while (i16 < iH) {
                gVar2 = (g) u0Var.i(i16);
                if (gVar2 == gVar3) {
                    k0Var.getClass();
                    gVar2.f(rect3);
                    if (x.v(i11, rect4, rect3)) {
                        if (x.v(i11, rect4, rect2)) {
                            rect2.set(rect3);
                            gVar = gVar2;
                        } else if (x.c(i11, rect4, rect2, rect3)) {
                            int iW3 = x.w(i11, rect4, rect3);
                            int iX3 = x.x(i11, rect4, rect3);
                            i17 = (iX3 * iX3) + (iW3 * 13 * iW3);
                            iW = x.w(i11, rect4, rect2);
                            iX = x.x(i11, rect4, rect2);
                            if (i17 < (iX * iX) + (iW * 13 * iW)) {
                                rect2.set(rect3);
                                gVar = gVar2;
                            }
                        }
                    }
                }
            }
            i13 = i15;
        }
        g gVar4 = gVar;
        if (gVar4 == null) {
            iF = Integer.MIN_VALUE;
        } else {
            if (u0Var.f56770a) {
                s.a(u0Var);
            }
            int i24 = u0Var.f56773d;
            int i25 = i12;
            while (true) {
                if (i25 >= i24) {
                    i14 = i13;
                    break;
                }
                if (u0Var.f56772c[i25] == gVar4) {
                    i14 = i25;
                    break;
                }
                i25++;
            }
            iF = u0Var.f(i14);
        }
        return w(iF);
    }

    public final g r(int i11) {
        if (i11 != -1) {
            return l(i11);
        }
        View view = this.K;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        g gVar = new g(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = s0.f58893a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            gVar.f380a.addChild(view, ((Integer) arrayList.get(i12)).intValue());
        }
        return gVar;
    }

    public abstract boolean s(int i11, int i12, Bundle bundle);

    public abstract void u(int i11, g gVar);

    public final boolean w(int i11) {
        int i12;
        View view = this.K;
        if ((!view.isFocused() && !view.requestFocus()) || (i12 = this.N) == i11) {
            return false;
        }
        if (i12 != Integer.MIN_VALUE) {
            j(i12);
        }
        if (i11 == Integer.MIN_VALUE) {
            return false;
        }
        this.N = i11;
        v(i11, true);
        x(i11, 8);
        return true;
    }

    public final void x(int i11, int i12) {
        View view;
        ViewParent parent;
        if (i11 == Integer.MIN_VALUE || !this.H.isEnabled() || (parent = (view = this.K).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i11, i12));
    }

    public void t(g gVar) {
    }

    public void v(int i11, boolean z11) {
    }
}
