package com.google.firebase.inappmessaging.display.internal;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Application;
import android.graphics.Point;
import android.view.ViewGroup;
import com.yalantis.ucrop.view.CropImageView;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class FiamAnimator {

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.FiamAnimator$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    class AnonymousClass2 extends AnimatorListenerAdapter {
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.google.firebase.inappmessaging.display.internal.FiamAnimator$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static /* synthetic */ class AnonymousClass3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19760a;

        static {
            int[] iArr = new int[Position.values().length];
            f19760a = iArr;
            try {
                iArr[Position.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19760a[Position.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19760a[Position.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19760a[Position.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface AnimationCompleteListener {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class Position {
        private static final /* synthetic */ Position[] $VALUES;
        public static final Position BOTTOM;
        public static final Position LEFT;
        public static final Position RIGHT;
        public static final Position TOP;

        static {
            Position position = new Position("LEFT", 0);
            LEFT = position;
            Position position2 = new Position("RIGHT", 1);
            RIGHT = position2;
            Position position3 = new Position("TOP", 2);
            TOP = position3;
            Position position4 = new Position("BOTTOM", 3);
            BOTTOM = position4;
            $VALUES = new Position[]{position, position2, position3, position4};
        }

        public static Position valueOf(String str) {
            return (Position) Enum.valueOf(Position.class, str);
        }

        public static Position[] values() {
            return (Position[]) $VALUES.clone();
        }
    }

    public static void a(final Application application, final ViewGroup viewGroup, Position position) {
        Point point;
        viewGroup.setAlpha(CropImageView.DEFAULT_ASPECT_RATIO);
        viewGroup.measure(-2, -2);
        int i11 = AnonymousClass3.f19760a[position.ordinal()];
        if (i11 == 1) {
            point = new Point(viewGroup.getMeasuredWidth() * (-1), 0);
        } else if (i11 != 2) {
            point = (i11 == 3 || i11 != 4) ? new Point(0, viewGroup.getMeasuredHeight() * (-1)) : new Point(0, viewGroup.getMeasuredHeight());
        } else {
            point = new Point(viewGroup.getMeasuredWidth(), 0);
        }
        viewGroup.animate().translationX(point.x).translationY(point.y).setDuration(1L).setListener(new AnimatorListenerAdapter() { // from class: com.google.firebase.inappmessaging.display.internal.FiamAnimator.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                viewGroup.animate().translationX(CropImageView.DEFAULT_ASPECT_RATIO).translationY(CropImageView.DEFAULT_ASPECT_RATIO).alpha(1.0f).setDuration(application.getResources().getInteger(R.integer.config_longAnimTime)).setListener(null);
            }
        });
    }
}
