package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.lingodeer.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import r.d1;
import r.e1;
import r.f1;
import r.g1;
import r.h1;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class DropDownListView extends ListView {
    public boolean H;
    public final boolean K;
    public boolean L;
    public e5.f M;
    public e N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f950e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f951f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g1 f952t;

    public DropDownListView(Context context, boolean z11) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f946a = new Rect();
        this.f947b = 0;
        this.f948c = 0;
        this.f949d = 0;
        this.f950e = 0;
        this.K = z11;
        setCacheColorHint(0);
    }

    public int a(int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        View view = null;
        for (int i14 = 0; i14 < count; i14++) {
            int itemViewType = adapter.getItemViewType(i14);
            if (itemViewType != i13) {
                view = null;
                i13 = itemViewType;
            }
            view = adapter.getView(i14, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i15 = layoutParams.height;
            view.measure(i11, i15 > 0 ? View.MeasureSpec.makeMeasureSpec(i15, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i14 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i12) {
                return i12;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x014c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0162  */
    /* JADX WARN: Code duplicated, block: B:86:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x016b  */
    /* JADX WARN: Code duplicated, block: B:90:0x017d  */
    /* JADX WARN: Code duplicated, block: B:92:0x0181  */
    /* JADX WARN: Code duplicated, block: B:94:0x0185  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public boolean b(MotionEvent motionEvent, int i11) {
        boolean z11;
        boolean zA;
        View childAt;
        View childAt2;
        e5.f fVar;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z11 = true;
            } else if (actionMasked != 3) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || z12) {
                this.L = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f951f - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z11) {
                if (this.M == null) {
                    this.M = new e5.f(this);
                }
                e5.f fVar2 = this.M;
                boolean z13 = fVar2.R;
                fVar2.R = true;
                fVar2.onTouch(this, motionEvent);
            } else {
                fVar = this.M;
                if (fVar != null) {
                    if (fVar.R) {
                        fVar.j();
                    }
                    fVar.R = false;
                }
            }
            return z11;
        }
        z11 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i11);
        if (iFindPointerIndex < 0) {
            z11 = false;
        } else {
            int x11 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x11, y10);
            if (iPointToPosition == -1) {
                z12 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f5 = x11;
                float f11 = y10;
                this.L = true;
                int i12 = Build.VERSION.SDK_INT;
                d1.a(this, f5, f11);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i13 = this.f951f;
                if (i13 != -1 && (childAt = getChildAt(i13 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f951f = iPointToPosition;
                d1.a(childAt3, f5 - childAt3.getLeft(), f11 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z14 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z14) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f946a;
                rect.set(left, top, right, bottom);
                rect.left -= this.f947b;
                rect.top -= this.f948c;
                rect.right += this.f949d;
                rect.bottom += this.f950e;
                if (i12 >= 33) {
                    zA = f1.a(this);
                } else {
                    Field field = h1.f48571a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e8) {
                            e8.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z15 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        f1.b(this, z15);
                    } else {
                        Field field2 = h1.f48571a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z15));
                            } catch (IllegalAccessException e10) {
                                e10.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z14) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f5, f11);
                }
                g1 g1Var = this.f952t;
                if (g1Var != null) {
                    g1Var.f48569b = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z11 = true;
                z12 = false;
            }
        }
        if (z11) {
            this.L = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f951f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.L = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f951f - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z11) {
            if (this.M == null) {
                this.M = new e5.f(this);
            }
            e5.f fVar3 = this.M;
            boolean z16 = fVar3.R;
            fVar3.R = true;
            fVar3.onTouch(this, motionEvent);
        } else {
            fVar = this.M;
            if (fVar != null) {
                if (fVar.R) {
                    fVar.j();
                }
                fVar.R = false;
            }
        }
        return z11;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f946a;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.N != null) {
            return;
        }
        super.drawableStateChanged();
        g1 g1Var = this.f952t;
        if (g1Var != null) {
            g1Var.f48569b = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.L && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.K || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.K || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.K || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.K && this.H) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.N = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.N == null) {
            e eVar = new e(this, 0);
            this.N = eVar;
            post(eVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i11 < 30 || !e1.f48550d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        e1.f48547a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        e1.f48548b.invoke(this, Integer.valueOf(iPointToPosition));
                        e1.f48549c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e8) {
                        e8.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.L && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f951f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        e eVar = this.N;
        if (eVar != null) {
            DropDownListView dropDownListView = (DropDownListView) eVar.f1081b;
            dropDownListView.N = null;
            dropDownListView.removeCallbacks(eVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z11) {
        this.H = z11;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        g1 g1Var;
        if (drawable != null) {
            g1Var = new g1(drawable);
            g1Var.f48569b = true;
        } else {
            g1Var = null;
        }
        this.f952t = g1Var;
        super.setSelector(g1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f947b = rect.left;
        this.f948c = rect.top;
        this.f949d = rect.right;
        this.f950e = rect.bottom;
    }
}
