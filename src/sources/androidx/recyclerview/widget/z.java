package androidx.recyclerview.widget;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import com.lingodeer.data.model.AchievementLevelType;
import com.yalantis.ucrop.view.CropImageView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends j1 implements q1 {
    public static final int[] C = {R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final v B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2655b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateListDrawable f2656c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Drawable f2657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateListDrawable f2660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Drawable f2661h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f2662i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f2663j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f2664k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f2665l;
    public float m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f2666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f2668p;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final RecyclerView f2671s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ValueAnimator f2678z;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f2669q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2670r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f2672t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f2673u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2674v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2675w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int[] f2676x = new int[2];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int[] f2677y = new int[2];

    public z(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i11, int i12, int i13) {
        int i14 = 0;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(CropImageView.DEFAULT_ASPECT_RATIO, 1.0f);
        this.f2678z = valueAnimatorOfFloat;
        this.A = 0;
        v vVar = new v(this, 0);
        this.B = vVar;
        w wVar = new w(this, i14);
        this.f2656c = stateListDrawable;
        this.f2657d = drawable;
        this.f2660g = stateListDrawable2;
        this.f2661h = drawable2;
        this.f2658e = Math.max(i11, stateListDrawable.getIntrinsicWidth());
        this.f2659f = Math.max(i11, drawable.getIntrinsicWidth());
        this.f2662i = Math.max(i11, stateListDrawable2.getIntrinsicWidth());
        this.f2663j = Math.max(i11, drawable2.getIntrinsicWidth());
        this.f2654a = i12;
        this.f2655b = i13;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new x(this, i14));
        valueAnimatorOfFloat.addUpdateListener(new y(this));
        RecyclerView recyclerView2 = this.f2671s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.removeItemDecoration(this);
            this.f2671s.removeOnItemTouchListener(this);
            this.f2671s.removeOnScrollListener(wVar);
            this.f2671s.removeCallbacks(vVar);
        }
        this.f2671s = recyclerView;
        recyclerView.addItemDecoration(this);
        this.f2671s.addOnItemTouchListener(this);
        this.f2671s.addOnScrollListener(wVar);
    }

    public static int c(float f5, float f11, int[] iArr, int i11, int i12, int i13) {
        int i14 = iArr[1] - iArr[0];
        if (i14 != 0) {
            int i15 = i11 - i13;
            int i16 = (int) (((f11 - f5) / i14) * i15);
            int i17 = i12 + i16;
            if (i17 < i15 && i17 >= 0) {
                return i16;
            }
        }
        return 0;
    }

    public final boolean a(float f5, float f11) {
        if (f11 < this.f2670r - this.f2662i) {
            return false;
        }
        int i11 = this.f2667o;
        int i12 = this.f2666n;
        return f5 >= ((float) (i11 - (i12 / 2))) && f5 <= ((float) ((i12 / 2) + i11));
    }

    public final boolean b(float f5, float f11) {
        WeakHashMap weakHashMap = z4.s0.f58893a;
        int layoutDirection = this.f2671s.getLayoutDirection();
        int i11 = this.f2658e;
        if (layoutDirection == 1) {
            if (f5 > i11) {
                return false;
            }
        } else if (f5 < this.f2669q - i11) {
            return false;
        }
        int i12 = this.f2665l;
        int i13 = this.f2664k / 2;
        return f11 >= ((float) (i12 - i13)) && f11 <= ((float) (i13 + i12));
    }

    public final void d(int i11) {
        v vVar = this.B;
        StateListDrawable stateListDrawable = this.f2656c;
        if (i11 == 2 && this.f2674v != 2) {
            stateListDrawable.setState(C);
            this.f2671s.removeCallbacks(vVar);
        }
        if (i11 == 0) {
            this.f2671s.invalidate();
        } else {
            e();
        }
        if (this.f2674v == 2 && i11 != 2) {
            stateListDrawable.setState(D);
            this.f2671s.removeCallbacks(vVar);
            this.f2671s.postDelayed(vVar, 1200);
        } else if (i11 == 1) {
            this.f2671s.removeCallbacks(vVar);
            this.f2671s.postDelayed(vVar, AchievementLevelType.KNOWLEDGE_POINT_LV_9);
        }
        this.f2674v = i11;
    }

    public final void e() {
        int i11 = this.A;
        ValueAnimator valueAnimator = this.f2678z;
        if (i11 != 0) {
            if (i11 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }

    @Override // androidx.recyclerview.widget.j1
    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, c2 c2Var) {
        int i11 = this.f2669q;
        RecyclerView recyclerView2 = this.f2671s;
        if (i11 != recyclerView2.getWidth() || this.f2670r != recyclerView2.getHeight()) {
            this.f2669q = recyclerView2.getWidth();
            this.f2670r = recyclerView2.getHeight();
            d(0);
            return;
        }
        if (this.A != 0) {
            if (this.f2672t) {
                int i12 = this.f2669q;
                int i13 = this.f2658e;
                int i14 = i12 - i13;
                int i15 = this.f2665l;
                int i16 = this.f2664k;
                int i17 = i15 - (i16 / 2);
                StateListDrawable stateListDrawable = this.f2656c;
                stateListDrawable.setBounds(0, 0, i13, i16);
                int i18 = this.f2659f;
                int i19 = this.f2670r;
                Drawable drawable = this.f2657d;
                drawable.setBounds(0, 0, i18, i19);
                WeakHashMap weakHashMap = z4.s0.f58893a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i13, i17);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i13, -i17);
                } else {
                    canvas.translate(i14, CropImageView.DEFAULT_ASPECT_RATIO);
                    drawable.draw(canvas);
                    canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, i17);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i14, -i17);
                }
            }
            if (this.f2673u) {
                int i21 = this.f2670r;
                int i22 = this.f2662i;
                int i23 = i21 - i22;
                int i24 = this.f2667o;
                int i25 = this.f2666n;
                int i26 = i24 - (i25 / 2);
                StateListDrawable stateListDrawable2 = this.f2660g;
                stateListDrawable2.setBounds(0, 0, i25, i22);
                int i27 = this.f2669q;
                int i28 = this.f2663j;
                Drawable drawable2 = this.f2661h;
                drawable2.setBounds(0, 0, i27, i28);
                canvas.translate(CropImageView.DEFAULT_ASPECT_RATIO, i23);
                drawable2.draw(canvas);
                canvas.translate(i26, CropImageView.DEFAULT_ASPECT_RATIO);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i26, -i23);
            }
        }
    }

    @Override // androidx.recyclerview.widget.q1
    public final boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i11 = this.f2674v;
        if (i11 != 1) {
            return i11 == 2;
        }
        boolean zB = b(motionEvent.getX(), motionEvent.getY());
        boolean zA = a(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!zB && !zA) {
            return false;
        }
        if (zA) {
            this.f2675w = 1;
            this.f2668p = (int) motionEvent.getX();
        } else if (zB) {
            this.f2675w = 2;
            this.m = (int) motionEvent.getY();
        }
        d(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.q1
    public final void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f2674v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zB = b(motionEvent.getX(), motionEvent.getY());
            boolean zA = a(motionEvent.getX(), motionEvent.getY());
            if (zB || zA) {
                if (zA) {
                    this.f2675w = 1;
                    this.f2668p = (int) motionEvent.getX();
                } else if (zB) {
                    this.f2675w = 2;
                    this.m = (int) motionEvent.getY();
                }
                d(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f2674v == 2) {
            this.m = CropImageView.DEFAULT_ASPECT_RATIO;
            this.f2668p = CropImageView.DEFAULT_ASPECT_RATIO;
            d(1);
            this.f2675w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f2674v == 2) {
            e();
            int i11 = this.f2675w;
            int i12 = this.f2655b;
            if (i11 == 1) {
                float x11 = motionEvent.getX();
                int[] iArr = this.f2677y;
                iArr[0] = i12;
                int i13 = this.f2669q - i12;
                iArr[1] = i13;
                float fMax = Math.max(i12, Math.min(i13, x11));
                if (Math.abs(this.f2667o - fMax) >= 2.0f) {
                    int iC = c(this.f2668p, fMax, iArr, this.f2671s.computeHorizontalScrollRange(), this.f2671s.computeHorizontalScrollOffset(), this.f2669q);
                    if (iC != 0) {
                        this.f2671s.scrollBy(iC, 0);
                    }
                    this.f2668p = fMax;
                }
            }
            if (this.f2675w == 2) {
                float y10 = motionEvent.getY();
                int[] iArr2 = this.f2676x;
                iArr2[0] = i12;
                int i14 = this.f2670r - i12;
                iArr2[1] = i14;
                float fMax2 = Math.max(i12, Math.min(i14, y10));
                if (Math.abs(this.f2665l - fMax2) < 2.0f) {
                    return;
                }
                int iC2 = c(this.m, fMax2, iArr2, this.f2671s.computeVerticalScrollRange(), this.f2671s.computeVerticalScrollOffset(), this.f2670r);
                if (iC2 != 0) {
                    this.f2671s.scrollBy(0, iC2);
                }
                this.m = fMax2;
            }
        }
    }

    @Override // androidx.recyclerview.widget.q1
    public final void onRequestDisallowInterceptTouchEvent(boolean z11) {
    }
}
