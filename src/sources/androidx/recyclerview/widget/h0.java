package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import android.view.animation.Interpolator;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {
    private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
    public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
    public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
    private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
    static final int RELATIVE_DIR_FLAGS = 3158064;
    private static final Interpolator sDragScrollInterpolator = new g0(0);
    private static final Interpolator sDragViewScrollCapInterpolator = new g0(1);
    private int mCachedMaxScrollSpeed = -1;

    public static int convertToRelativeDirection(int i11, int i12) {
        int i13;
        int i14 = i11 & ABS_HORIZONTAL_DIR_FLAGS;
        if (i14 == 0) {
            return i11;
        }
        int i15 = i11 & (~i14);
        if (i12 == 0) {
            i13 = i14 << 2;
        } else {
            int i16 = i14 << 1;
            i15 |= (-789517) & i16;
            i13 = (i16 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
        }
        return i15 | i13;
    }

    public static j0 getDefaultUIUtil() {
        return k0.f2498a;
    }

    public static int makeFlag(int i11, int i12) {
        return i12 << (i11 * 8);
    }

    public static int makeMovementFlags(int i11, int i12) {
        return makeFlag(2, i11) | makeFlag(1, i12) | makeFlag(0, i12 | i11);
    }

    public boolean canDropOver(RecyclerView recyclerView, g2 g2Var, g2 g2Var2) {
        return true;
    }

    public g2 chooseDropTarget(g2 g2Var, List<g2> list, int i11, int i12) {
        int bottom;
        int iAbs;
        int top;
        int iAbs2;
        int left;
        int iAbs3;
        int right;
        int iAbs4;
        int width = g2Var.itemView.getWidth() + i11;
        int height = g2Var.itemView.getHeight() + i12;
        int left2 = i11 - g2Var.itemView.getLeft();
        int top2 = i12 - g2Var.itemView.getTop();
        int size = list.size();
        g2 g2Var2 = null;
        int i13 = -1;
        for (int i14 = 0; i14 < size; i14++) {
            g2 g2Var3 = list.get(i14);
            if (left2 > 0 && (right = g2Var3.itemView.getRight() - width) < 0 && g2Var3.itemView.getRight() > g2Var.itemView.getRight() && (iAbs4 = Math.abs(right)) > i13) {
                g2Var2 = g2Var3;
                i13 = iAbs4;
            }
            if (left2 < 0 && (left = g2Var3.itemView.getLeft() - i11) > 0 && g2Var3.itemView.getLeft() < g2Var.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i13) {
                g2Var2 = g2Var3;
                i13 = iAbs3;
            }
            if (top2 < 0 && (top = g2Var3.itemView.getTop() - i12) > 0 && g2Var3.itemView.getTop() < g2Var.itemView.getTop() && (iAbs2 = Math.abs(top)) > i13) {
                g2Var2 = g2Var3;
                i13 = iAbs2;
            }
            if (top2 > 0 && (bottom = g2Var3.itemView.getBottom() - height) < 0 && g2Var3.itemView.getBottom() > g2Var.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i13) {
                g2Var2 = g2Var3;
                i13 = iAbs;
            }
        }
        return g2Var2;
    }

    public int convertToAbsoluteDirection(int i11, int i12) {
        int i13;
        int i14 = i11 & RELATIVE_DIR_FLAGS;
        if (i14 == 0) {
            return i11;
        }
        int i15 = i11 & (~i14);
        if (i12 == 0) {
            i13 = i14 >> 2;
        } else {
            int i16 = i14 >> 1;
            i15 |= (-3158065) & i16;
            i13 = (i16 & RELATIVE_DIR_FLAGS) >> 2;
        }
        return i15 | i13;
    }

    public final int getAbsoluteMovementFlags(RecyclerView recyclerView, g2 g2Var) {
        int movementFlags = getMovementFlags(recyclerView, g2Var);
        WeakHashMap weakHashMap = z4.s0.f58893a;
        return convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection());
    }

    public long getAnimationDuration(RecyclerView recyclerView, int i11, float f5, float f11) {
        i1 itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator == null) {
            return i11 == 8 ? 200L : 250L;
        }
        return i11 == 8 ? itemAnimator.f2481e : itemAnimator.f2480d;
    }

    public int getBoundingBoxMargin() {
        return 0;
    }

    public abstract int getMovementFlags(RecyclerView recyclerView, g2 g2Var);

    public boolean hasDragFlag(RecyclerView recyclerView, g2 g2Var) {
        return (getAbsoluteMovementFlags(recyclerView, g2Var) & 16711680) != 0;
    }

    public boolean hasSwipeFlag(RecyclerView recyclerView, g2 g2Var) {
        return (getAbsoluteMovementFlags(recyclerView, g2Var) & 65280) != 0;
    }

    public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i11, int i12, int i13, long j11) {
        if (this.mCachedMaxScrollSpeed == -1) {
            this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
        }
        int interpolation = (int) (sDragScrollInterpolator.getInterpolation(j11 <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS ? j11 / 2000.0f : 1.0f) * ((int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (Math.abs(i12) * 1.0f) / i11)) * ((int) Math.signum(i12)) * this.mCachedMaxScrollSpeed)));
        if (interpolation == 0) {
            return i12 > 0 ? 1 : -1;
        }
        return interpolation;
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, g2 g2Var, float f5, float f11, int i11, boolean z11) {
        View view = g2Var.itemView;
        if (z11 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            WeakHashMap weakHashMap = z4.s0.f58893a;
            Float fValueOf = Float.valueOf(z4.j0.e(view));
            int childCount = recyclerView.getChildCount();
            float f12 = CropImageView.DEFAULT_ASPECT_RATIO;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                if (childAt != view) {
                    WeakHashMap weakHashMap2 = z4.s0.f58893a;
                    float fE = z4.j0.e(childAt);
                    if (fE > f12) {
                        f12 = fE;
                    }
                }
            }
            z4.j0.k(view, f12 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f5);
        view.setTranslationY(f11);
    }

    public abstract void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, g2 g2Var, float f5, float f11, int i11, boolean z11);

    public void onDraw(Canvas canvas, RecyclerView recyclerView, g2 g2Var, List<Object> list, int i11, float f5, float f11) {
        if (list.size() > 0) {
            list.get(0).getClass();
            throw new ClassCastException();
        }
        if (g2Var != null) {
            int iSave = canvas.save();
            onChildDraw(canvas, recyclerView, g2Var, f5, f11, i11, true);
            canvas.restoreToCount(iSave);
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, g2 g2Var, List<Object> list, int i11, float f5, float f11) {
        int size = list.size();
        if (size > 0) {
            if (list.get(0) != null) {
                throw new ClassCastException();
            }
            canvas.save();
            throw null;
        }
        if (g2Var != null) {
            int iSave = canvas.save();
            onChildDrawOver(canvas, recyclerView, g2Var, f5, f11, i11, true);
            canvas.restoreToCount(iSave);
        }
        int i12 = size - 1;
        if (i12 < 0) {
            return;
        }
        list.get(i12).getClass();
        throw new ClassCastException();
    }

    public float getSwipeEscapeVelocity(float f5) {
        return f5;
    }

    public float getSwipeVelocityThreshold(float f5) {
        return f5;
    }
}
