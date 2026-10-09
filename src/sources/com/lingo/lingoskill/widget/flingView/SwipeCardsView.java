package com.lingo.lingoskill.widget.flingView;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Scroller;
import com.google.logging.type.LogSeverity;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import h9.l0;
import hh.p0;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l5.d;
import yq.a;
import yq.b;
import yq.c;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SwipeCardsView extends LinearLayout {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final d f22195k0 = new d(2);
    public final int H;
    public final float K;
    public final int L;
    public b M;
    public int N;
    public int O;
    public final l0 P;
    public a Q;
    public final Scroller R;
    public final int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f22196a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f22197a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f22198b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public VelocityTracker f22199b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f22200c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final float f22201c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f22202d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final float f22203d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22204e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f22205e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f22206f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f22207f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f22208g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f22209h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public MotionEvent f22210i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f22211j0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f22212t;

    public SwipeCardsView(Context context) {
        this(context, null);
    }

    public static int e(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i11 : size;
        }
        return size < i11 ? 16777216 | size : i11;
    }

    private View getTopView() {
        ArrayList arrayList = this.f22196a;
        if (arrayList.size() > 0) {
            return (View) arrayList.get(0);
        }
        return null;
    }

    private void setOnItemClickListener(View view) {
        if (this.M != null) {
            view.setOnClickListener(this.P);
        }
    }

    public final void a(View view, int i11) {
        a aVar = this.Q;
        if (aVar != null) {
            aVar.a(view);
            view.setTag(Integer.valueOf(i11));
        }
        view.setVisibility(0);
    }

    public final boolean b(MotionEvent motionEvent) {
        View topView = getTopView();
        if (topView == null || topView.getVisibility() != 0) {
            return false;
        }
        Rect rect = new Rect();
        topView.getGlobalVisibleRect(rect);
        return rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
    }

    public final void c(int i11, int i12) {
        View topView = getTopView();
        if (topView == null) {
            return;
        }
        topView.offsetLeftAndRight(i11);
        topView.offsetTopAndBottom(i12);
        float fAbs = (Math.abs(topView.getLeft() - this.f22200c) + Math.abs(topView.getTop() - this.f22202d)) / 400.0f;
        int i13 = 1;
        while (true) {
            ArrayList arrayList = this.f22196a;
            if (i13 >= arrayList.size()) {
                return;
            }
            float f5 = i13;
            float f11 = fAbs - (0.2f * f5);
            if (f11 > 1.0f) {
                f11 = 1.0f;
            } else if (f11 < CropImageView.DEFAULT_ASPECT_RATIO) {
                f11 = 0.0f;
            }
            int iIndexOf = arrayList.indexOf(topView);
            int i14 = this.H;
            int i15 = i14 * i13;
            float f12 = this.K;
            float f13 = 1.0f - (f5 * f12);
            int i16 = this.L;
            float f14 = ((100 - (i16 * i13)) * 1.0f) / 100.0f;
            int i17 = i13 - 1;
            float f15 = ((i14 * i17) - i15) * f11;
            float fA = p0.a(1.0f - (f12 * i17), f13, f11, f13);
            float fA2 = p0.a(((100 - (i16 * i17)) * 1.0f) / 100.0f, f14, f11, f14);
            View view = (View) arrayList.get(iIndexOf + i13);
            view.offsetTopAndBottom((((int) (f15 + i15)) - view.getTop()) + this.f22202d);
            view.setScaleX(fA);
            view.setScaleY(fA);
            view.setAlpha(fA2);
            i13++;
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        Scroller scroller = this.R;
        if (!scroller.computeScrollOffset()) {
            this.f22208g0 = false;
            if (scroller.computeScrollOffset() || this.f22207f0) {
                return;
            }
            d();
            return;
        }
        View topView = getTopView();
        if (topView == null) {
            return;
        }
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        int left = currX - topView.getLeft();
        int top = currY - topView.getTop();
        if (currX != scroller.getFinalX() || currY != scroller.getFinalY()) {
            c(left, top);
        }
        WeakHashMap weakHashMap = s0.f58893a;
        postInvalidateOnAnimation();
    }

    public final void d() {
        View topView;
        ArrayList arrayList = this.f22198b;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f22196a;
        if (size == 0) {
            this.f22208g0 = false;
            if (arrayList2.size() == 0 || (topView = getTopView()) == null) {
                return;
            }
            if (topView.getLeft() == this.f22200c && topView.getTop() == this.f22202d) {
                return;
            }
            topView.offsetLeftAndRight(this.f22200c - topView.getLeft());
            topView.offsetTopAndBottom(this.f22202d - topView.getTop());
            return;
        }
        View view = (View) arrayList.get(0);
        if (view.getLeft() == this.f22200c) {
            arrayList.remove(0);
            this.f22208g0 = false;
            return;
        }
        arrayList2.remove(view);
        arrayList2.add(view);
        this.f22208g0 = false;
        int size2 = arrayList2.size();
        removeViewInLayout(view);
        addViewInLayout(view, 0, view.getLayoutParams(), true);
        requestLayout();
        int i11 = this.O + size2;
        if (i11 < this.N) {
            a(view, i11);
        } else {
            view.setVisibility(8);
        }
        int i12 = this.O + 1;
        if (i12 < this.N) {
            this.O = i12;
        } else {
            this.O = -1;
        }
        arrayList.remove(0);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    /* JADX WARN: Code duplicated, block: B:66:0x012d  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e A[PHI: r3
      0x013e: PHI (r3v7 int) = (r3v2 int), (r3v4 int) binds: [B:68:0x013c, B:71:0x0142] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x014e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0152  */
    /* JADX WARN: Code duplicated, block: B:82:0x0166  */
    /* JADX WARN: Code duplicated, block: B:91:0x018a  */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f5;
        float xVelocity;
        float fAbs;
        View topView;
        VelocityTracker velocityTracker;
        int i11;
        int i12;
        c cVar;
        int i13;
        int i14;
        int i15;
        c cVar2;
        int i16;
        View topView2;
        int left;
        int top;
        b bVar;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f22199b0 == null) {
            this.f22199b0 = VelocityTracker.obtain();
        }
        this.f22199b0.addMovement(motionEvent);
        Scroller scroller = this.R;
        if (actionMasked == 0) {
            scroller.abortAnimation();
            d();
            if (b(motionEvent) && this.f22209h0) {
                this.f22207f0 = true;
            }
            this.f22197a0 = false;
            this.T = (int) motionEvent.getRawY();
            int rawX = (int) motionEvent.getRawX();
            this.U = rawX;
            this.V = this.T;
            this.W = rawX;
        } else if (actionMasked == 1) {
            this.f22197a0 = false;
            this.f22207f0 = false;
            this.f22205e0 = false;
            this.f22211j0 = false;
            VelocityTracker velocityTracker2 = this.f22199b0;
            f5 = this.f22201c0;
            velocityTracker2.computeCurrentVelocity(1000, f5);
            xVelocity = this.f22199b0.getXVelocity();
            float yVelocity = this.f22199b0.getYVelocity();
            fAbs = Math.abs(xVelocity);
            if (fAbs < this.f22203d0) {
                f5 = 0.0f;
            } else if (fAbs > f5) {
                f5 = xVelocity;
            } else if (xVelocity <= CropImageView.DEFAULT_ASPECT_RATIO) {
                f5 = -f5;
            }
            Math.abs(yVelocity);
            this.f22208g0 = true;
            topView = getTopView();
            if (topView != null && this.f22209h0) {
                i11 = this.f22200c;
                i12 = this.f22202d;
                cVar = c.NONE;
                int left2 = topView.getLeft() - this.f22200c;
                int top2 = topView.getTop();
                i13 = this.f22202d;
                i14 = top2 - i13;
                i15 = left2 != 0 ? left2 : 1;
                if (i15 <= 300 || (f5 > 900.0f && i15 > 0)) {
                    i11 = this.f22204e;
                    i12 = (((this.f22212t + this.f22200c) * i14) / i15) + i13;
                    cVar2 = c.RIGHT;
                } else if (i15 < -300 || (f5 < -900.0f && i15 < 0)) {
                    int i17 = this.f22212t;
                    i12 = (((i17 + this.f22200c) * i14) / (-i15)) + i14 + i13;
                    cVar2 = c.LEFT;
                    i11 = -i17;
                } else {
                    cVar2 = cVar;
                }
                i16 = this.f22206f;
                if (i12 <= i16 || i12 < (i16 = (-i16) / 2)) {
                    i12 = i16;
                }
                topView2 = getTopView();
                if (topView2 == null) {
                    this.f22208g0 = false;
                } else {
                    if (i11 != this.f22200c) {
                        this.f22198b.add(topView2);
                    }
                    left = i11 - topView2.getLeft();
                    top = i12 - topView2.getTop();
                    if (left == 0 || top != 0) {
                        scroller.startScroll(topView2.getLeft(), topView2.getTop(), left, top, LogSeverity.NOTICE_VALUE);
                        WeakHashMap weakHashMap = s0.f58893a;
                        postInvalidateOnAnimation();
                    } else {
                        this.f22208g0 = false;
                    }
                    if (cVar2 != cVar && (bVar = this.M) != null) {
                        bVar.l(cVar2);
                    }
                }
            }
            velocityTracker = this.f22199b0;
            if (velocityTracker != null) {
                velocityTracker.clear();
                this.f22199b0.recycle();
                this.f22199b0 = null;
            }
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                this.f22197a0 = false;
                this.f22207f0 = false;
                this.f22205e0 = false;
                this.f22211j0 = false;
                VelocityTracker velocityTracker3 = this.f22199b0;
                f5 = this.f22201c0;
                velocityTracker3.computeCurrentVelocity(1000, f5);
                xVelocity = this.f22199b0.getXVelocity();
                float yVelocity2 = this.f22199b0.getYVelocity();
                fAbs = Math.abs(xVelocity);
                if (fAbs < this.f22203d0) {
                    f5 = 0.0f;
                } else if (fAbs > f5) {
                    f5 = xVelocity;
                } else if (xVelocity <= CropImageView.DEFAULT_ASPECT_RATIO) {
                    f5 = -f5;
                }
                Math.abs(yVelocity2);
                this.f22208g0 = true;
                topView = getTopView();
                if (topView != null) {
                    i11 = this.f22200c;
                    i12 = this.f22202d;
                    cVar = c.NONE;
                    int left3 = topView.getLeft() - this.f22200c;
                    int top3 = topView.getTop();
                    i13 = this.f22202d;
                    i14 = top3 - i13;
                    if (left3 != 0) {
                    }
                    if (i15 <= 300) {
                        i11 = this.f22204e;
                        i12 = (((this.f22212t + this.f22200c) * i14) / i15) + i13;
                        cVar2 = c.RIGHT;
                    } else {
                        i11 = this.f22204e;
                        i12 = (((this.f22212t + this.f22200c) * i14) / i15) + i13;
                        cVar2 = c.RIGHT;
                    }
                    i16 = this.f22206f;
                    if (i12 <= i16) {
                        i12 = i16;
                    } else {
                        i12 = i16;
                    }
                    topView2 = getTopView();
                    if (topView2 == null) {
                        this.f22208g0 = false;
                    } else {
                        if (i11 != this.f22200c) {
                            this.f22198b.add(topView2);
                        }
                        left = i11 - topView2.getLeft();
                        top = i12 - topView2.getTop();
                        if (left == 0) {
                            scroller.startScroll(topView2.getLeft(), topView2.getTop(), left, top, LogSeverity.NOTICE_VALUE);
                            WeakHashMap weakHashMap2 = s0.f58893a;
                            postInvalidateOnAnimation();
                        } else {
                            scroller.startScroll(topView2.getLeft(), topView2.getTop(), left, top, LogSeverity.NOTICE_VALUE);
                            WeakHashMap weakHashMap3 = s0.f58893a;
                            postInvalidateOnAnimation();
                        }
                        if (cVar2 != cVar) {
                            bVar.l(cVar2);
                        }
                    }
                }
                velocityTracker = this.f22199b0;
                if (velocityTracker != null) {
                    velocityTracker.clear();
                    this.f22199b0.recycle();
                    this.f22199b0 = null;
                }
            }
        } else {
            if (!this.f22209h0) {
                return super.dispatchTouchEvent(motionEvent);
            }
            this.f22210i0 = motionEvent;
            int rawY = (int) motionEvent.getRawY();
            int rawX2 = (int) motionEvent.getRawX();
            int i18 = rawY - this.T;
            int i19 = rawX2 - this.U;
            this.T = rawY;
            this.U = rawX2;
            if (!this.f22205e0) {
                int iAbs = Math.abs(rawX2 - this.W);
                int iAbs2 = Math.abs(rawY - this.V);
                int i21 = (iAbs * iAbs) + iAbs2 + iAbs2;
                int i22 = this.S;
                if (i21 < i22 * i22) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                this.f22205e0 = true;
            }
            if (this.f22205e0 && (this.f22197a0 || b(motionEvent))) {
                this.f22197a0 = true;
                c(i19, i18);
                if (!this.f22211j0) {
                    this.f22211j0 = true;
                    MotionEvent motionEvent2 = this.f22210i0;
                    super.dispatchTouchEvent(MotionEvent.obtain(motionEvent2.getDownTime(), ((long) ViewConfiguration.getLongPressTimeout()) + motionEvent2.getEventTime(), 3, motionEvent2.getX(), motionEvent2.getY(), motionEvent2.getMetaState()));
                }
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007a  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ArrayList arrayList;
        int size;
        int paddingLeft;
        int i15;
        int paddingLeft2;
        int paddingTop;
        if (this.f22197a0 || this.f22208g0 || (size = (arrayList = this.f22196a).size()) == 0) {
            return;
        }
        for (int i16 = 0; i16 < size; i16++) {
            View view = (View) arrayList.get(i16);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i17 = layoutParams.gravity;
            if (i17 == -1) {
                i17 = 8388659;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(i17, getLayoutDirection());
            int i18 = i17 & 112;
            int i19 = absoluteGravity & 7;
            if (i19 != 1) {
                if (i19 != 8388613) {
                    paddingLeft2 = getPaddingLeft() + layoutParams.leftMargin;
                } else {
                    paddingLeft = (getPaddingRight() + getWidth()) - measuredWidth;
                    i15 = layoutParams.rightMargin;
                }
                if (i18 != 16) {
                    paddingTop = (((((getPaddingTop() + getHeight()) - getPaddingBottom()) - measuredHeight) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
                } else if (i18 != 80) {
                    paddingTop = getPaddingTop() + layoutParams.topMargin;
                } else {
                    paddingTop = ((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin;
                }
                view.layout(paddingLeft2, paddingTop, measuredWidth + paddingLeft2, measuredHeight + paddingTop);
                int i21 = this.H * i16;
                float f5 = 1.0f - (this.K * i16);
                float f11 = ((100 - (this.L * i16)) * 1.0f) / 100.0f;
                view.offsetTopAndBottom(i21);
                view.setScaleX(f5);
                view.setScaleY(f5);
                view.setAlpha(f11);
            } else {
                paddingLeft = ((((getPaddingLeft() + getWidth()) - getPaddingRight()) - measuredWidth) / 2) + layoutParams.leftMargin;
                i15 = layoutParams.rightMargin;
            }
            paddingLeft2 = paddingLeft - i15;
            if (i18 != 16) {
                paddingTop = (((((getPaddingTop() + getHeight()) - getPaddingBottom()) - measuredHeight) / 2) + layoutParams.topMargin) - layoutParams.bottomMargin;
            } else if (i18 != 80) {
                paddingTop = getPaddingTop() + layoutParams.topMargin;
            } else {
                paddingTop = ((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin;
            }
            view.layout(paddingLeft2, paddingTop, measuredWidth + paddingLeft2, measuredHeight + paddingTop);
            int i22 = this.H * i16;
            float f12 = 1.0f - (this.K * i16);
            float f13 = ((100 - (this.L * i16)) * 1.0f) / 100.0f;
            view.offsetTopAndBottom(i22);
            view.setScaleX(f12);
            view.setScaleY(f12);
            view.setAlpha(f13);
        }
        this.f22200c = ((View) arrayList.get(0)).getLeft();
        this.f22202d = ((View) arrayList.get(0)).getTop();
        this.f22212t = ((View) arrayList.get(0)).getMeasuredWidth();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i11, int i12) {
        measureChildren(i11, i12);
        setMeasuredDimension(e(View.MeasureSpec.getSize(i11), i11), e(View.MeasureSpec.getSize(i12), i12));
        this.f22204e = getMeasuredWidth();
        this.f22206f = getMeasuredHeight();
    }

    public void setAdapter(a aVar) {
        if (aVar == null) {
            throw new RuntimeException("adapter==null");
        }
        this.Q = aVar;
        this.O = 0;
        removeAllViewsInLayout();
        ArrayList arrayList = this.f22196a;
        arrayList.clear();
        this.Q.getClass();
        this.N = 1;
        this.Q.getClass();
        int iMin = Math.min(1, this.N);
        for (int i11 = this.O; i11 < this.O + iMin; i11++) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            this.Q.getClass();
            if (!getContext().getResources().getResourceTypeName(R.layout.item_review_card_learn).contains("layout")) {
                throw new RuntimeException(getContext().getResources().getResourceName(R.layout.item_review_card_learn) + " is a illegal layoutid , please check your layout id first !");
            }
            View viewInflate = layoutInflaterFrom.inflate(R.layout.item_review_card_learn, (ViewGroup) this, false);
            if (viewInflate == null) {
                return;
            }
            if (i11 < this.N) {
                a(viewInflate, i11);
            } else {
                viewInflate.setVisibility(8);
            }
            arrayList.add(viewInflate);
            setOnItemClickListener(viewInflate);
            addView(viewInflate, 0);
        }
    }

    public void setCardsSlideListener(b bVar) {
        this.M = bVar;
    }

    public SwipeCardsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SwipeCardsView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f22196a = new ArrayList();
        this.f22198b = new ArrayList();
        this.f22200c = 0;
        this.f22202d = 0;
        this.f22204e = 0;
        this.f22206f = 0;
        this.f22212t = 0;
        this.H = 0;
        this.K = CropImageView.DEFAULT_ASPECT_RATIO;
        this.L = 0;
        this.O = 0;
        this.T = -1;
        this.U = -1;
        this.f22205e0 = false;
        this.f22207f0 = false;
        this.f22208g0 = false;
        this.f22209h0 = true;
        this.f22211j0 = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vh.c.f54064e);
        this.H = (int) typedArrayObtainStyledAttributes.getDimension(2, 0);
        this.L = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.K = typedArrayObtainStyledAttributes.getFloat(1, CropImageView.DEFAULT_ASPECT_RATIO);
        typedArrayObtainStyledAttributes.recycle();
        this.P = new l0(this, 6);
        this.R = new Scroller(getContext(), f22195k0);
        this.S = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f22201c0 = ViewConfiguration.get(getContext()).getScaledMaximumFlingVelocity();
        this.f22203d0 = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
    }
}
