package z4;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f58883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f58884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f58885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f58886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f58887e;

    public r(View view) {
        this.f58885c = view;
    }

    public final boolean a(float f5, float f11, boolean z11) {
        ViewParent viewParentE;
        if (this.f58886d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedFling(this.f58885c, f5, f11, z11);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        return false;
    }

    public final boolean b(float f5, float f11) {
        ViewParent viewParentE;
        if (this.f58886d && (viewParentE = e(0)) != null) {
            try {
                return viewParentE.onNestedPreFling(this.f58885c, f5, f11);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        return false;
    }

    public final boolean c(int i11, int i12, int[] iArr, int[] iArr2, int i13) {
        ViewParent viewParentE;
        int i14;
        int i15;
        if (!this.f58886d || (viewParentE = e(i13)) == null) {
            return false;
        }
        if (i11 == 0 && i12 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f58885c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i14 = iArr2[0];
            i15 = iArr2[1];
        } else {
            i14 = 0;
            i15 = 0;
        }
        if (iArr == null) {
            if (this.f58887e == null) {
                this.f58887e = new int[2];
            }
            iArr = this.f58887e;
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z11 = viewParentE instanceof s;
        View view2 = this.f58885c;
        if (z11) {
            ((s) viewParentE).i(view2, i11, i12, iArr3, i13);
        } else if (i13 == 0) {
            try {
                viewParentE.onNestedPreScroll(view2, i11, i12, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(viewParentE);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i14;
            iArr2[1] = iArr2[1] - i15;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i11, int i12, int i13, int i14, int[] iArr, int i15, int[] iArr2) {
        ViewParent viewParentE;
        int i16;
        int i17;
        int[] iArr3;
        if (this.f58886d && (viewParentE = e(i15)) != null) {
            if (i11 != 0 || i12 != 0 || i13 != 0 || i14 != 0) {
                View view = this.f58885c;
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    i16 = iArr[0];
                    i17 = iArr[1];
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                if (iArr2 == null) {
                    if (this.f58887e == null) {
                        this.f58887e = new int[2];
                    }
                    int[] iArr4 = this.f58887e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                boolean z11 = viewParentE instanceof t;
                View view2 = this.f58885c;
                if (z11) {
                    ((t) viewParentE).c(view2, i11, i12, i13, i14, i15, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i13;
                    iArr3[1] = iArr3[1] + i14;
                    if (viewParentE instanceof s) {
                        ((s) viewParentE).d(view2, i11, i12, i13, i14, i15);
                    } else if (i15 == 0) {
                        try {
                            viewParentE.onNestedScroll(view2, i11, i12, i13, i14);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(viewParentE);
                        }
                    }
                }
                if (iArr != null) {
                    view.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i16;
                    iArr[1] = iArr[1] - i17;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i11) {
        if (i11 == 0) {
            return this.f58883a;
        }
        if (i11 != 1) {
            return null;
        }
        return this.f58884b;
    }

    public final boolean f(int i11) {
        return e(i11) != null;
    }

    public final void g(boolean z11) {
        if (this.f58886d) {
            WeakHashMap weakHashMap = s0.f58893a;
            j0.o(this.f58885c);
        }
        this.f58886d = z11;
    }

    public final boolean h(int i11, int i12) {
        boolean zOnStartNestedScroll;
        if (!f(i12)) {
            if (this.f58886d) {
                View view = this.f58885c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z11 = parent instanceof s;
                    if (z11) {
                        zOnStartNestedScroll = ((s) parent).f(view2, view, i11, i12);
                    } else if (i12 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i11);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i12 == 0) {
                            this.f58883a = parent;
                        } else if (i12 == 1) {
                            this.f58884b = parent;
                        }
                        if (z11) {
                            ((s) parent).g(view2, view, i11, i12);
                        } else if (i12 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i11);
                            } catch (AbstractMethodError unused2) {
                                Objects.toString(parent);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void i(int i11) {
        ViewParent viewParentE = e(i11);
        if (viewParentE != null) {
            boolean z11 = viewParentE instanceof s;
            View view = this.f58885c;
            if (z11) {
                ((s) viewParentE).h(view, i11);
            } else if (i11 == 0) {
                try {
                    viewParentE.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(viewParentE);
                }
            }
            if (i11 == 0) {
                this.f58883a = null;
            } else {
                if (i11 != 1) {
                    return;
                }
                this.f58884b = null;
            }
        }
    }
}
