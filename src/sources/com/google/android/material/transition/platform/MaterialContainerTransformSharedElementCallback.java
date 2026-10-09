package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import c3.c;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.lingodeer.R;
import ff.h;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static WeakReference f16064e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Rect f16067c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16065a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f16066b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ShapeableViewShapeProvider f16068d = new ShapeableViewShapeProvider();

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface ShapeProvider {
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class ShapeableViewShapeProvider implements ShapeProvider {
    }

    @Override // android.app.SharedElementCallback
    public final Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        f16064e = new WeakReference(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    public final View onCreateSnapshotView(Context context, Parcelable parcelable) {
        WeakReference weakReference;
        KeyEvent.Callback callback;
        View viewOnCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (viewOnCreateSnapshotView != null && (weakReference = f16064e) != null && this.f16068d != null && (callback = (View) weakReference.get()) != null) {
            ShapeAppearanceModel shapeAppearanceModel = callback instanceof Shapeable ? ((Shapeable) callback).getShapeAppearanceModel() : null;
            if (shapeAppearanceModel != null) {
                viewOnCreateSnapshotView.setTag(R.id.mtrl_motion_snapshot_view, shapeAppearanceModel);
            }
        }
        return viewOnCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public final void onMapSharedElements(List list, Map map) {
        View view;
        final Activity activityA;
        if (list.isEmpty() || map.isEmpty() || (view = (View) map.get(list.get(0))) == null || (activityA = ContextUtils.a(view.getContext())) == null) {
            return;
        }
        final Window window = activityA.getWindow();
        boolean z11 = this.f16065a;
        boolean z12 = this.f16066b;
        if (z11) {
            Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
            if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
                MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
                window.setSharedElementReenterTransition(null);
                if (z12) {
                    if (materialContainerTransform.getDuration() >= 0) {
                        window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
                    }
                    materialContainerTransform.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.1
                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public final void onTransitionEnd(Transition transition) {
                            WeakReference weakReference = MaterialContainerTransformSharedElementCallback.f16064e;
                            Drawable background = window.getDecorView().getBackground();
                            if (background == null) {
                                return;
                            }
                            background.mutate().clearColorFilter();
                        }

                        /* JADX WARN: Code duplicated, block: B:13:0x0034  */
                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public final void onTransitionStart(Transition transition) {
                            ColorFilter porterDuffColorFilter;
                            WeakReference weakReference = MaterialContainerTransformSharedElementCallback.f16064e;
                            Drawable background = window.getDecorView().getBackground();
                            if (background == null) {
                                return;
                            }
                            Drawable drawableMutate = background.mutate();
                            r4.a aVar = r4.a.CLEAR;
                            if (Build.VERSION.SDK_INT >= 29) {
                                Object objG = c.g(aVar);
                                if (objG != null) {
                                    porterDuffColorFilter = c.b(0, objG);
                                } else {
                                    porterDuffColorFilter = null;
                                }
                            } else {
                                PorterDuff.Mode modeF = h.F(aVar);
                                if (modeF != null) {
                                    porterDuffColorFilter = new PorterDuffColorFilter(0, modeF);
                                } else {
                                    porterDuffColorFilter = null;
                                }
                            }
                            drawableMutate.setColorFilter(porterDuffColorFilter);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform2 = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform2.f16018a = true;
            materialContainerTransform2.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.2
                @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                public final void onTransitionEnd(Transition transition) {
                    View view2;
                    WeakReference weakReference = MaterialContainerTransformSharedElementCallback.f16064e;
                    if (weakReference != null && (view2 = (View) weakReference.get()) != null) {
                        view2.setAlpha(1.0f);
                        MaterialContainerTransformSharedElementCallback.f16064e = null;
                    }
                    Activity activity = activityA;
                    activity.finish();
                    activity.overridePendingTransition(0, 0);
                }
            });
            if (z12) {
                if (materialContainerTransform2.getDuration() >= 0) {
                    window.setTransitionBackgroundFadeDuration(materialContainerTransform2.getDuration());
                }
                materialContainerTransform2.addListener(new TransitionListenerAdapter() { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.3
                    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public final void onTransitionStart(Transition transition) {
                        ColorFilter porterDuffColorFilter;
                        WeakReference weakReference = MaterialContainerTransformSharedElementCallback.f16064e;
                        Drawable background = window.getDecorView().getBackground();
                        if (background == null) {
                            return;
                        }
                        Drawable drawableMutate = background.mutate();
                        r4.a aVar = r4.a.CLEAR;
                        if (Build.VERSION.SDK_INT >= 29) {
                            Object objG = c.g(aVar);
                            if (objG != null) {
                                porterDuffColorFilter = c.b(0, objG);
                            } else {
                                porterDuffColorFilter = null;
                            }
                        } else {
                            PorterDuff.Mode modeF = h.F(aVar);
                            if (modeF != null) {
                                porterDuffColorFilter = new PorterDuffColorFilter(0, modeF);
                            } else {
                                porterDuffColorFilter = null;
                            }
                        }
                        drawableMutate.setColorFilter(porterDuffColorFilter);
                    }
                });
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementEnd(List list, List list2, List list3) {
        if (!list2.isEmpty() && (((View) list2.get(0)).getTag(R.id.mtrl_motion_snapshot_view) instanceof View)) {
            ((View) list2.get(0)).setTag(R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.f16065a && !list2.isEmpty()) {
            View view = (View) list2.get(0);
            RectF rectF = TransitionUtils.f16080a;
            this.f16067c = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        this.f16065a = false;
    }

    @Override // android.app.SharedElementCallback
    public final void onSharedElementStart(List list, List list2, List list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            ((View) list2.get(0)).setTag(R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f16065a || list2.isEmpty() || this.f16067c == null) {
            return;
        }
        View view = (View) list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f16067c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f16067c.height(), 1073741824));
        Rect rect = this.f16067c;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}
