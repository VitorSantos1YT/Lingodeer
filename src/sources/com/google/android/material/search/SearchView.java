package com.google.android.material.search;

import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.internal.FadeThroughDrawable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ToolbarUtils;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MaterialBackHandler;
import com.google.android.material.motion.MaterialBackOrchestrator;
import com.google.android.material.motion.MaterialMainContainerBackHelper;
import com.google.android.material.shape.MaterialShapeUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.lingodeer.R;
import com.yalantis.ucrop.view.CropImageView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import r.q2;
import z4.j0;
import z4.s0;
import z4.u;
import z4.v1;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes3.dex */
public class SearchView extends FrameLayout implements l4.a, MaterialBackHandler {

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final /* synthetic */ int f15117j0 = 0;
    public final Toolbar H;
    public final TextView K;
    public final LinearLayout L;
    public final EditText M;
    public final ImageButton N;
    public final View O;
    public final TouchObserverFrameLayout P;
    public final boolean Q;
    public final SearchViewAnimationHelper R;
    public final MaterialBackOrchestrator S;
    public final boolean T;
    public final ElevationOverlayProvider U;
    public final LinkedHashSet V;
    public SearchBar W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f15118a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f15119a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ClippableRoundedCornerLayout f15120b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f15121b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f15122c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f15123c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f15124d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f15125d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FrameLayout f15126e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final int f15127e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final FrameLayout f15128f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f15129f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f15130g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public TransitionState f15131h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public HashMap f15132i0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final MaterialToolbar f15133t;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class Behavior extends l4.b {
        public Behavior() {
        }

        @Override // l4.b
        public final boolean j(CoordinatorLayout coordinatorLayout, View view, View view2) {
            SearchView searchView = (SearchView) view;
            if (searchView.W != null || !(view2 instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view2);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SavedState extends k5.b {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchView.SavedState.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i11) {
                return new SavedState[i11];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        };

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f15135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15136d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15135c = parcel.readString();
            this.f15136d = parcel.readInt();
        }

        @Override // k5.b, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeString(this.f15135c);
            parcel.writeInt(this.f15136d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public interface TransitionListener {
        void a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static final class TransitionState {
        private static final /* synthetic */ TransitionState[] $VALUES;
        public static final TransitionState HIDDEN;
        public static final TransitionState HIDING;
        public static final TransitionState SHOWING;
        public static final TransitionState SHOWN;

        static {
            TransitionState transitionState = new TransitionState("HIDING", 0);
            HIDING = transitionState;
            TransitionState transitionState2 = new TransitionState("HIDDEN", 1);
            HIDDEN = transitionState2;
            TransitionState transitionState3 = new TransitionState("SHOWING", 2);
            SHOWING = transitionState3;
            TransitionState transitionState4 = new TransitionState("SHOWN", 3);
            SHOWN = transitionState4;
            $VALUES = new TransitionState[]{transitionState, transitionState2, transitionState3, transitionState4};
        }

        public static TransitionState valueOf(String str) {
            return (TransitionState) Enum.valueOf(TransitionState.class, str);
        }

        public static TransitionState[] values() {
            return (TransitionState[]) $VALUES.clone();
        }
    }

    public SearchView(Context context) {
        this(context, null);
    }

    public static void g(SearchView searchView, v1 v1Var) {
        int i11 = v1Var.f58905a.g(647).f48794b;
        searchView.setUpStatusBarSpacer(i11);
        if (searchView.f15130g0) {
            return;
        }
        searchView.setStatusBarSpacerEnabledInternal(i11 > 0);
    }

    private Window getActivityWindow() {
        Activity activityA = ContextUtils.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.W;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(R.dimen.m3_searchview_elevation);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z11) {
        this.f15124d.setVisibility(z11 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f5) {
        View view;
        ElevationOverlayProvider elevationOverlayProvider = this.U;
        if (elevationOverlayProvider == null || (view = this.f15122c) == null) {
            return;
        }
        view.setBackgroundColor(elevationOverlayProvider.a(this.f15127e0, f5));
    }

    private void setUpHeaderLayout(int i11) {
        if (i11 != -1) {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
            FrameLayout frameLayout = this.f15126e;
            frameLayout.addView(layoutInflaterFrom.inflate(i11, (ViewGroup) frameLayout, false));
            frameLayout.setVisibility(0);
        }
    }

    private void setUpStatusBarSpacer(int i11) {
        View view = this.f15124d;
        if (view.getLayoutParams().height != i11) {
            view.getLayoutParams().height = i11;
            view.requestLayout();
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void a(f.a aVar) {
        SearchBar searchBar;
        if (k() || (searchBar = this.W) == null) {
            return;
        }
        searchBar.setPlaceholderText(this.M.getText().toString());
        SearchViewAnimationHelper searchViewAnimationHelper = this.R;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.f15149n;
        SearchBar searchBar2 = searchViewAnimationHelper.f15151p;
        materialMainContainerBackHelper.f14795f = aVar;
        float f5 = aVar.f26116b;
        View view = materialMainContainerBackHelper.f14791b;
        materialMainContainerBackHelper.f14808j = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        if (searchBar2 != null) {
            materialMainContainerBackHelper.f14809k = ViewUtils.a(view, searchBar2);
        }
        materialMainContainerBackHelper.f14807i = f5;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (this.Q) {
            this.P.addView(view, i11, layoutParams);
        } else {
            super.addView(view, i11, layoutParams);
        }
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void c() {
        if (k()) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.R;
        MaterialMainContainerBackHelper materialMainContainerBackHelper = searchViewAnimationHelper.f15149n;
        f.a aVar = materialMainContainerBackHelper.f14795f;
        materialMainContainerBackHelper.f14795f = null;
        if (Build.VERSION.SDK_INT < 34 || this.W == null || aVar == null) {
            i();
            return;
        }
        long totalDuration = searchViewAnimationHelper.m().getTotalDuration();
        MaterialMainContainerBackHelper materialMainContainerBackHelper2 = searchViewAnimationHelper.f15149n;
        AnimatorSet animatorSetA = materialMainContainerBackHelper2.a(searchViewAnimationHelper.f15151p);
        animatorSetA.setDuration(totalDuration);
        animatorSetA.start();
        materialMainContainerBackHelper2.f14807i = CropImageView.DEFAULT_ASPECT_RATIO;
        materialMainContainerBackHelper2.f14808j = null;
        materialMainContainerBackHelper2.f14809k = null;
        if (searchViewAnimationHelper.f15150o != null) {
            searchViewAnimationHelper.d(false).start();
            searchViewAnimationHelper.f15150o.resume();
        }
        searchViewAnimationHelper.f15150o = null;
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void d(f.a aVar) {
        if (k() || this.W == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.R.n(aVar);
    }

    @Override // com.google.android.material.motion.MaterialBackHandler
    public final void f() {
        if (k() || this.W == null || Build.VERSION.SDK_INT < 34) {
            return;
        }
        this.R.c();
    }

    public MaterialMainContainerBackHelper getBackHelper() {
        return this.R.f15149n;
    }

    @Override // l4.a
    public l4.b getBehavior() {
        return new Behavior();
    }

    public TransitionState getCurrentTransitionState() {
        return this.f15131h0;
    }

    public int getDefaultNavigationIconResource() {
        return R.drawable.ic_arrow_back_black_24;
    }

    public EditText getEditText() {
        return this.M;
    }

    public CharSequence getHint() {
        return this.M.getHint();
    }

    public TextView getSearchPrefix() {
        return this.K;
    }

    public CharSequence getSearchPrefixText() {
        return this.K.getText();
    }

    public int getSoftInputMode() {
        return this.f15119a0;
    }

    public Editable getText() {
        return this.M.getText();
    }

    public Toolbar getToolbar() {
        return this.f15133t;
    }

    public final void h() {
        this.M.post(new d(this, 2));
    }

    public final void i() {
        if (this.f15131h0.equals(TransitionState.HIDDEN) || this.f15131h0.equals(TransitionState.HIDING)) {
            return;
        }
        SearchBar searchBar = this.W;
        SearchViewAnimationHelper searchViewAnimationHelper = this.R;
        if (searchBar == null || !searchBar.isAttachedToWindow()) {
            searchViewAnimationHelper.m();
            return;
        }
        this.W.setPlaceholderText(this.M.getText().toString());
        SearchBar searchBar2 = this.W;
        Objects.requireNonNull(searchViewAnimationHelper);
        searchBar2.post(new b(searchViewAnimationHelper, 0));
    }

    public final boolean j() {
        return this.f15119a0 == 48;
    }

    public final boolean k() {
        return this.f15131h0.equals(TransitionState.HIDDEN) || this.f15131h0.equals(TransitionState.HIDING);
    }

    public final void l() {
        if (this.f15125d0) {
            this.M.postDelayed(new d(this, 0), 100L);
        }
    }

    public final void m(TransitionState transitionState, boolean z11) {
        if (this.f15131h0.equals(transitionState)) {
            return;
        }
        if (z11) {
            if (transitionState == TransitionState.SHOWN) {
                setModalForAccessibility(true);
            } else if (transitionState == TransitionState.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        this.f15131h0 = transitionState;
        Iterator it = new LinkedHashSet(this.V).iterator();
        while (it.hasNext()) {
            ((TransitionListener) it.next()).a();
        }
        p(transitionState);
        SearchBar searchBar = this.W;
        if (searchBar == null || transitionState != TransitionState.HIDDEN) {
            return;
        }
        searchBar.sendAccessibilityEvent(8);
    }

    public final void n() {
        if (this.f15131h0.equals(TransitionState.SHOWN)) {
            return;
        }
        TransitionState transitionState = this.f15131h0;
        TransitionState transitionState2 = TransitionState.SHOWING;
        if (transitionState.equals(transitionState2)) {
            return;
        }
        SearchViewAnimationHelper searchViewAnimationHelper = this.R;
        SearchView searchView = searchViewAnimationHelper.f15137a;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchViewAnimationHelper.f15139c;
        if (searchViewAnimationHelper.f15151p == null) {
            if (searchView.j()) {
                searchView.postDelayed(new d(searchView, 3), 150L);
            }
            clippableRoundedCornerLayout.setVisibility(4);
            clippableRoundedCornerLayout.post(new b(searchViewAnimationHelper, 2));
            return;
        }
        EditText editText = searchViewAnimationHelper.f15146j;
        if (searchView.j()) {
            searchView.l();
        }
        searchView.setTransitionState(transitionState2);
        Toolbar toolbar = searchViewAnimationHelper.f15143g;
        Menu menu = toolbar.getMenu();
        if (menu != null) {
            menu.clear();
        }
        if (searchViewAnimationHelper.f15151p.getMenuResId() == -1 || !searchView.f15123c0) {
            toolbar.setVisibility(8);
        } else {
            toolbar.m(searchViewAnimationHelper.f15151p.getMenuResId());
            ActionMenuView actionMenuViewA = ToolbarUtils.a(toolbar);
            if (actionMenuViewA != null) {
                for (int i11 = 0; i11 < actionMenuViewA.getChildCount(); i11++) {
                    View childAt = actionMenuViewA.getChildAt(i11);
                    childAt.setClickable(false);
                    childAt.setFocusable(false);
                    childAt.setFocusableInTouchMode(false);
                }
            }
            toolbar.setVisibility(0);
        }
        editText.setText(searchViewAnimationHelper.f15151p.getText());
        editText.setSelection(editText.getText().length());
        clippableRoundedCornerLayout.setVisibility(4);
        clippableRoundedCornerLayout.post(new b(searchViewAnimationHelper, 1));
    }

    public final void o(ViewGroup viewGroup, boolean z11) {
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt != this) {
                if (childAt.findViewById(this.f15120b.getId()) != null) {
                    o((ViewGroup) childAt, z11);
                } else if (z11) {
                    this.f15132i0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    childAt.setImportantForAccessibility(4);
                } else {
                    HashMap map = this.f15132i0;
                    if (map != null && map.containsKey(childAt)) {
                        childAt.setImportantForAccessibility(((Integer) this.f15132i0.get(childAt)).intValue());
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialShapeUtils.d(this);
        TransitionState currentTransitionState = getCurrentTransitionState();
        if (currentTransitionState == TransitionState.SHOWN) {
            setModalForAccessibility(true);
        } else if (currentTransitionState == TransitionState.HIDDEN) {
            setModalForAccessibility(false);
        }
        p(currentTransitionState);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setModalForAccessibility(false);
        this.S.b();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f15119a0 = activityWindow.getAttributes().softInputMode;
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f37910a);
        setText(savedState.f15135c);
        setVisible(savedState.f15136d == 0);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f15135c = text == null ? null : text.toString();
        savedState.f15136d = this.f15120b.getVisibility();
        return savedState;
    }

    public final void p(TransitionState transitionState) {
        if (this.W == null || !this.T) {
            return;
        }
        boolean zEquals = transitionState.equals(TransitionState.SHOWN);
        MaterialBackOrchestrator materialBackOrchestrator = this.S;
        if (zEquals) {
            materialBackOrchestrator.a(false);
        } else if (transitionState.equals(TransitionState.HIDDEN)) {
            materialBackOrchestrator.b();
        }
    }

    public final void q() {
        ImageButton imageButtonB = ToolbarUtils.b(this.f15133t);
        if (imageButtonB == null) {
            return;
        }
        int i11 = this.f15120b.getVisibility() == 0 ? 1 : 0;
        Drawable drawableI0 = ub.a.i0(imageButtonB.getDrawable());
        if (drawableI0 instanceof n.b) {
            n.b bVar = (n.b) drawableI0;
            float f5 = i11;
            if (bVar.f42907i != f5) {
                bVar.f42907i = f5;
                bVar.invalidateSelf();
            }
        }
        if (drawableI0 instanceof FadeThroughDrawable) {
            ((FadeThroughDrawable) drawableI0).a(i11);
        }
    }

    public void setAnimatedNavigationIcon(boolean z11) {
        this.f15121b0 = z11;
    }

    public void setAutoShowKeyboard(boolean z11) {
        this.f15125d0 = z11;
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        setUpBackgroundViewElevationOverlay(f5);
    }

    public void setHint(CharSequence charSequence) {
        this.M.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z11) {
        this.f15123c0 = z11;
    }

    public void setModalForAccessibility(boolean z11) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z11) {
            this.f15132i0 = new HashMap(viewGroup.getChildCount());
        }
        o(viewGroup, z11);
        if (z11) {
            return;
        }
        this.f15132i0 = null;
    }

    public void setOnMenuItemClickListener(q2 q2Var) {
        this.f15133t.setOnMenuItemClickListener(q2Var);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        TextView textView = this.K;
        textView.setText(charSequence);
        textView.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z11) {
        this.f15130g0 = true;
        setStatusBarSpacerEnabledInternal(z11);
    }

    public void setText(CharSequence charSequence) {
        this.M.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z11) {
        this.f15133t.setTouchscreenBlocksFocus(z11);
    }

    public void setTransitionState(TransitionState transitionState) {
        m(transitionState, true);
    }

    public void setUseWindowInsetsController(boolean z11) {
        this.f15129f0 = z11;
    }

    public void setVisible(boolean z11) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = this.f15120b;
        boolean z12 = clippableRoundedCornerLayout.getVisibility() == 0;
        clippableRoundedCornerLayout.setVisibility(z11 ? 0 : 8);
        q();
        m(z11 ? TransitionState.SHOWN : TransitionState.HIDDEN, z12 != z11);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.W = searchBar;
        this.R.f15151p = searchBar;
        if (searchBar != null) {
            searchBar.setOnClickListener(new c(this, 1));
            if (Build.VERSION.SDK_INT >= 34) {
                try {
                    searchBar.setHandwritingDelegatorCallback(new d(this, 1));
                    this.M.setIsHandwritingDelegate(true);
                } catch (LinkageError unused) {
                }
            }
        }
        MaterialToolbar materialToolbar = this.f15133t;
        if (materialToolbar != null && !(ub.a.i0(materialToolbar.getNavigationIcon()) instanceof n.b)) {
            int defaultNavigationIconResource = getDefaultNavigationIconResource();
            if (this.W == null) {
                materialToolbar.setNavigationIcon(defaultNavigationIconResource);
            } else {
                Drawable drawableMutate = jh.h.k(getContext(), defaultNavigationIconResource).mutate();
                if (materialToolbar.getNavigationIconTint() != null) {
                    drawableMutate.setTint(materialToolbar.getNavigationIconTint().intValue());
                }
                drawableMutate.setLayoutDirection(getLayoutDirection());
                materialToolbar.setNavigationIcon(new FadeThroughDrawable(this.W.getNavigationIcon(), drawableMutate));
                q();
            }
        }
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        p(getCurrentTransitionState());
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSearchViewStyle);
    }

    public void setHint(int i11) {
        this.M.setHint(i11);
    }

    public void setText(int i11) {
        this.M.setText(i11);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i11) {
        super(MaterialThemeOverlay.a(context, attributeSet, i11, R.style.Widget_Material3_SearchView), attributeSet, i11);
        this.S = new MaterialBackOrchestrator(this, this);
        this.V = new LinkedHashSet();
        this.f15119a0 = 16;
        this.f15131h0 = TransitionState.HIDDEN;
        Context context2 = getContext();
        TypedArray typedArrayD = ThemeEnforcement.d(context2, attributeSet, com.google.android.material.R.styleable.f13730a0, i11, R.style.Widget_Material3_SearchView, new int[0]);
        this.f15127e0 = typedArrayD.getColor(11, 0);
        int resourceId = typedArrayD.getResourceId(16, -1);
        int resourceId2 = typedArrayD.getResourceId(0, -1);
        String string = typedArrayD.getString(3);
        String string2 = typedArrayD.getString(4);
        String string3 = typedArrayD.getString(24);
        boolean z11 = typedArrayD.getBoolean(27, false);
        this.f15121b0 = typedArrayD.getBoolean(8, true);
        this.f15123c0 = typedArrayD.getBoolean(7, true);
        boolean z12 = typedArrayD.getBoolean(17, false);
        this.f15125d0 = typedArrayD.getBoolean(9, true);
        this.T = typedArrayD.getBoolean(10, true);
        typedArrayD.recycle();
        LayoutInflater.from(context2).inflate(R.layout.mtrl_search_view, this);
        this.Q = true;
        this.f15118a = findViewById(R.id.open_search_view_scrim);
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = (ClippableRoundedCornerLayout) findViewById(R.id.open_search_view_root);
        this.f15120b = clippableRoundedCornerLayout;
        this.f15122c = findViewById(R.id.open_search_view_background);
        View viewFindViewById = findViewById(R.id.open_search_view_status_bar_spacer);
        this.f15124d = viewFindViewById;
        this.f15126e = (FrameLayout) findViewById(R.id.open_search_view_header_container);
        this.f15128f = (FrameLayout) findViewById(R.id.open_search_view_toolbar_container);
        MaterialToolbar materialToolbar = (MaterialToolbar) findViewById(R.id.open_search_view_toolbar);
        this.f15133t = materialToolbar;
        this.H = (Toolbar) findViewById(R.id.open_search_view_dummy_toolbar);
        this.K = (TextView) findViewById(R.id.open_search_view_search_prefix);
        this.L = (LinearLayout) findViewById(R.id.open_search_view_text_container);
        EditText editText = (EditText) findViewById(R.id.open_search_view_edit_text);
        this.M = editText;
        ImageButton imageButton = (ImageButton) findViewById(R.id.open_search_view_clear_button);
        this.N = imageButton;
        View viewFindViewById2 = findViewById(R.id.open_search_view_divider);
        this.O = viewFindViewById2;
        TouchObserverFrameLayout touchObserverFrameLayout = (TouchObserverFrameLayout) findViewById(R.id.open_search_view_content_container);
        this.P = touchObserverFrameLayout;
        this.R = new SearchViewAnimationHelper(this);
        this.U = new ElevationOverlayProvider(context2);
        clippableRoundedCornerLayout.setOnTouchListener(new f(0));
        setUpBackgroundViewElevationOverlay(getOverlayElevation());
        setUpHeaderLayout(resourceId);
        setSearchPrefixText(string3);
        if (resourceId2 != -1) {
            editText.setTextAppearance(resourceId2);
        }
        editText.setText(string);
        editText.setHint(string2);
        if (z12) {
            materialToolbar.setNavigationIcon((Drawable) null);
        } else {
            materialToolbar.setNavigationOnClickListener(new c(this, 2));
            if (z11) {
                n.b bVar = new n.b(getContext());
                int iC = MaterialColors.c(this, R.attr.colorOnSurface);
                Paint paint = bVar.f42899a;
                if (iC != paint.getColor()) {
                    paint.setColor(iC);
                    bVar.invalidateSelf();
                }
                materialToolbar.setNavigationIcon(bVar);
            }
        }
        imageButton.setOnClickListener(new c(this, 0));
        editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.search.SearchView.1
            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                SearchView.this.N.setVisibility(charSequence.length() > 0 ? 0 : 8);
            }

            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }
        });
        touchObserverFrameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.search.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                int i12 = SearchView.f15117j0;
                SearchView searchView = this.f15169a;
                if (!searchView.j()) {
                    return false;
                }
                searchView.h();
                return false;
            }
        });
        ViewUtils.b(materialToolbar, new e(this));
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById2.getLayoutParams();
        final int i12 = marginLayoutParams.leftMargin;
        final int i13 = marginLayoutParams.rightMargin;
        u uVar = new u() { // from class: com.google.android.material.search.a
            @Override // z4.u
            public final v1 e(View view, v1 v1Var) {
                int i14 = SearchView.f15117j0;
                r4.d dVarG = v1Var.f58905a.g(647);
                int i15 = i12 + dVarG.f48793a;
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i15;
                marginLayoutParams2.rightMargin = i13 + dVarG.f48795c;
                return v1Var;
            }
        };
        WeakHashMap weakHashMap = s0.f58893a;
        j0.m(viewFindViewById2, uVar);
        setUpStatusBarSpacer(getStatusBarHeight());
        j0.m(viewFindViewById, new e(this));
    }
}
