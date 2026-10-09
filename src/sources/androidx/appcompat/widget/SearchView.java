package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.lingodeer.R;
import com.tbruyelle.rxpermissions3.BuildConfig;
import fb.g0;
import hh.s;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import qp.m3;
import qp.m4;
import r.a2;
import r.b2;
import r.c2;
import r.d2;
import r.e0;
import r.e2;
import r.g2;
import r.w1;
import r.x1;
import r.y1;
import r.z1;
import z4.s0;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements p.d {
    public static final m3 I0;
    public CharSequence A0;
    public boolean B0;
    public int C0;
    public SearchableInfo D0;
    public Bundle E0;
    public final w1 F0;
    public final w1 G0;
    public final WeakHashMap H0;
    public final SearchAutoComplete R;
    public final View S;
    public final View T;
    public final View U;
    public final ImageView V;
    public final ImageView W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final ImageView f968a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ImageView f969b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final View f970c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public e2 f971d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final Rect f972e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final Rect f973f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final int[] f974g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final int[] f975h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ImageView f976i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Drawable f977j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final int f978k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final int f979l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Intent f980m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Intent f981n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final CharSequence f982o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View.OnFocusChangeListener f983p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View.OnClickListener f984q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f985r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f986s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public i5.c f987t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f988u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public CharSequence f989v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f990w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f991x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f992y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f993z0;

    /* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public final n H;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public SearchView f995f;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f996t;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i11 = configuration.screenWidthDp;
            int i12 = configuration.screenHeightDp;
            if (i11 >= 960 && i12 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i11 < 600) {
                return (i11 < 640 || i12 < 480) ? 160 : 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                m.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            m3 m3Var = SearchView.I0;
            m3Var.getClass();
            m3.h();
            Method method = (Method) m3Var.f48058c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.f994e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f996t) {
                n nVar = this.H;
                removeCallbacks(nVar);
                post(nVar);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z11, int i11, Rect rect) {
            super.onFocusChanged(z11, i11, rect);
            SearchView searchView = this.f995f;
            searchView.w(searchView.f986s0);
            searchView.post(searchView.F0);
            if (searchView.R.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i11, KeyEvent keyEvent) {
            if (i11 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f995f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i11, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z11) {
            super.onWindowFocusChanged(z11);
            if (z11 && this.f995f.hasFocus() && getVisibility() == 0) {
                this.f996t = true;
                Context context = getContext();
                m3 m3Var = SearchView.I0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z11) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            n nVar = this.H;
            if (!z11) {
                this.f996t = false;
                removeCallbacks(nVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f996t = true;
                    return;
                }
                this.f996t = false;
                removeCallbacks(nVar);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f995f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i11) {
            super.setThreshold(i11);
            this.f994e = i11;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.H = new n(this);
            this.f994e = getThreshold();
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    static {
        m3 m3Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            m3 m3Var2 = new m3();
            m3Var2.f48056a = null;
            m3Var2.f48057b = null;
            m3Var2.f48058c = null;
            m3.h();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                m3Var2.f48056a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                m3Var2.f48057b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                m3Var2.f48058c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            m3Var = m3Var2;
        }
        I0 = m3Var;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.R;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f991x0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.R;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f991x0 = false;
    }

    public int getImeOptions() {
        return this.R.getImeOptions();
    }

    public int getInputType() {
        return this.R.getInputType();
    }

    public int getMaxWidth() {
        return this.f992y0;
    }

    public CharSequence getQuery() {
        return this.R.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f989v0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.D0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.f982o0 : getContext().getText(this.D0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.f979l0;
    }

    public int getSuggestionRowLayout() {
        return this.f978k0;
    }

    public i5.c getSuggestionsAdapter() {
        return this.f987t0;
    }

    public final Intent j(String str, String str2, Uri uri, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.A0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.E0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.D0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.E0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i11 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.R;
        if (i11 >= 29) {
            m.a(searchAutoComplete);
            return;
        }
        m3 m3Var = I0;
        m3Var.getClass();
        m3.h();
        Method method = (Method) m3Var.f48056a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        m3Var.getClass();
        m3.h();
        Method method2 = (Method) m3Var.f48057b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.R;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText(BuildConfig.VERSION_NAME);
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.f985r0) {
            clearFocus();
            w(true);
        }
    }

    public final void n(int i11) {
        String strH;
        Cursor cursor = this.f987t0.f34153c;
        if (cursor != null && cursor.moveToPosition(i11)) {
            Intent intentJ = null;
            try {
                try {
                    int i12 = g2.Z;
                    String strH2 = g2.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (strH2 == null) {
                        strH2 = this.D0.getSuggestIntentAction();
                    }
                    if (strH2 == null) {
                        strH2 = "android.intent.action.SEARCH";
                    }
                    String strH3 = g2.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (strH3 == null) {
                        strH3 = this.D0.getSuggestIntentData();
                    }
                    if (strH3 != null && (strH = g2.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        strH3 = strH3 + "/" + Uri.encode(strH);
                    }
                    intentJ = j(strH2, g2.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), strH3 == null ? null : Uri.parse(strH3), g2.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                }
            } catch (RuntimeException unused2) {
                cursor.getPosition();
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException unused3) {
                    intentJ.toString();
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.R;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i11) {
        Editable text = this.R.getText();
        Cursor cursor = this.f987t0.f34153c;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i11)) {
            setQuery(text);
            return;
        }
        String strC = this.f987t0.c(cursor);
        if (strC != null) {
            setQuery(strC);
        } else {
            setQuery(text);
        }
    }

    @Override // p.d
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.R;
        searchAutoComplete.setText(BuildConfig.VERSION_NAME);
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.A0 = BuildConfig.VERSION_NAME;
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.C0);
        this.B0 = false;
    }

    @Override // p.d
    public final void onActionViewExpanded() {
        if (this.B0) {
            return;
        }
        this.B0 = true;
        SearchAutoComplete searchAutoComplete = this.R;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.C0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText(BuildConfig.VERSION_NAME);
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.F0);
        post(this.G0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            SearchAutoComplete searchAutoComplete = this.R;
            int[] iArr = this.f974g0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f975h0;
            getLocationInWindow(iArr2);
            int i15 = iArr[1] - iArr2[1];
            int i16 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i16;
            int height = searchAutoComplete.getHeight() + i15;
            Rect rect = this.f972e0;
            rect.set(i16, i15, width, height);
            int i17 = rect.left;
            int i18 = rect.right;
            int i19 = i14 - i12;
            Rect rect2 = this.f973f0;
            rect2.set(i17, 0, i18, i19);
            e2 e2Var = this.f971d0;
            if (e2Var == null) {
                e2 e2Var2 = new e2(searchAutoComplete, rect2, rect);
                this.f971d0 = e2Var2;
                setTouchDelegate(e2Var2);
            } else {
                e2Var.f48552b.set(rect2);
                Rect rect3 = e2Var.f48554d;
                rect3.set(rect2);
                int i21 = -e2Var.f48555e;
                rect3.inset(i21, i21);
                e2Var.f48553c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i11, int i12) {
        int i13;
        if (this.f986s0) {
            super.onMeasure(i11, i12);
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        if (mode == Integer.MIN_VALUE) {
            int i14 = this.f992y0;
            size = i14 > 0 ? Math.min(i14, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f992y0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i13 = this.f992y0) > 0) {
            size = Math.min(i13, size);
        }
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d2 d2Var = (d2) parcelable;
        super.onRestoreInstanceState(d2Var.f37910a);
        w(d2Var.f48543c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        d2 d2Var = new d2(super.onSaveInstanceState());
        d2Var.f48543c = this.f986s0;
        return d2Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z11) {
        super.onWindowFocusChanged(z11);
        post(this.F0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.R;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.D0 != null) {
            getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
        }
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void r() {
        boolean zIsEmpty = TextUtils.isEmpty(this.R.getText());
        int i11 = (!zIsEmpty || (this.f985r0 && !this.B0)) ? 0 : 8;
        ImageView imageView = this.f968a0;
        imageView.setVisibility(i11);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i11, Rect rect) {
        if (this.f991x0 || !isFocusable()) {
            return false;
        }
        if (this.f986s0) {
            return super.requestFocus(i11, rect);
        }
        boolean zRequestFocus = this.R.requestFocus(i11, rect);
        if (zRequestFocus) {
            w(false);
        }
        return zRequestFocus;
    }

    public final void s() {
        int[] iArr = this.R.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.T.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.U.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.E0 = bundle;
    }

    public void setIconified(boolean z11) {
        if (z11) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.R;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f984q0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z11) {
        if (this.f985r0 == z11) {
            return;
        }
        this.f985r0 = z11;
        w(z11);
        t();
    }

    public void setImeOptions(int i11) {
        this.R.setImeOptions(i11);
    }

    public void setInputType(int i11) {
        this.R.setInputType(i11);
    }

    public void setMaxWidth(int i11) {
        this.f992y0 = i11;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f983p0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f984q0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f989v0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z11) {
        this.f990w0 = z11;
        i5.c cVar = this.f987t0;
        if (cVar instanceof g2) {
            ((g2) cVar).R = z11 ? 2 : 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        boolean z11;
        this.D0 = searchableInfo;
        Intent intent = null;
        SearchAutoComplete searchAutoComplete = this.R;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.D0.getImeOptions());
            int inputType = this.D0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.D0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            i5.c cVar = this.f987t0;
            if (cVar != null) {
                cVar.b(null);
            }
            if (this.D0.getSuggestAuthority() != null) {
                g2 g2Var = new g2(getContext(), this, this.D0, this.H0);
                this.f987t0 = g2Var;
                searchAutoComplete.setAdapter(g2Var);
                ((g2) this.f987t0).R = this.f990w0 ? 2 : 1;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.D0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.D0.getVoiceSearchLaunchWebSearch()) {
                intent = this.f980m0;
            } else if (this.D0.getVoiceSearchLaunchRecognizer()) {
                intent = this.f981n0;
            }
            z11 = (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
        }
        this.f993z0 = z11;
        if (z11) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.f986s0);
    }

    public void setSubmitButtonEnabled(boolean z11) {
        this.f988u0 = z11;
        w(this.f986s0);
    }

    public void setSuggestionsAdapter(i5.c cVar) {
        this.f987t0 = cVar;
        this.R.setAdapter(cVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void t() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = BuildConfig.VERSION_NAME;
        }
        boolean z11 = this.f985r0;
        SearchAutoComplete searchAutoComplete = this.R;
        CharSequence charSequence2 = charSequence;
        if (z11 && (drawable = this.f977j0) != null) {
            charSequence2 = charSequence;
            int textSize = (int) (((double) searchAutoComplete.getTextSize()) * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            charSequence2 = spannableStringBuilder;
        }
        charSequence2 = charSequence;
        searchAutoComplete.setHint(charSequence2);
    }

    public final void u() {
        this.U.setVisibility(((this.f988u0 || this.f993z0) && !this.f986s0 && (this.W.getVisibility() == 0 || this.f969b0.getVisibility() == 0)) ? 0 : 8);
    }

    public final void v(boolean z11) {
        boolean z12 = this.f988u0;
        this.W.setVisibility((!z12 || !(z12 || this.f993z0) || this.f986s0 || !hasFocus() || (!z11 && this.f993z0)) ? 8 : 0);
    }

    public final void w(boolean z11) {
        this.f986s0 = z11;
        int i11 = 8;
        int i12 = z11 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.R.getText());
        this.V.setVisibility(i12);
        v(!zIsEmpty);
        this.S.setVisibility(z11 ? 8 : 0);
        ImageView imageView = this.f976i0;
        imageView.setVisibility((imageView.getDrawable() == null || this.f985r0) ? 8 : 0);
        r();
        if (this.f993z0 && !this.f986s0 && zIsEmpty) {
            this.W.setVisibility(8);
            i11 = 0;
        }
        this.f969b0.setVisibility(i11);
        u();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f972e0 = new Rect();
        this.f973f0 = new Rect();
        this.f974g0 = new int[2];
        this.f975h0 = new int[2];
        this.F0 = new w1(this, 0);
        this.G0 = new w1(this, 1);
        this.H0 = new WeakHashMap();
        k kVar = new k(this);
        l lVar = new l(this);
        z1 z1Var = new z1(this);
        int i12 = 1;
        e0 e0Var = new e0(this, i12);
        p9.c cVar = new p9.c(this, i12);
        s sVar = new s(this, 7);
        int[] iArr = k.a.f37420w;
        m4 m4VarK = m4.k(context, attributeSet, iArr, i11);
        s0.p(this, context, iArr, attributeSet, (TypedArray) m4VarK.f48061c, i11);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = (TypedArray) m4VarK.f48061c;
        layoutInflaterFrom.inflate(typedArray.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.R = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.S = findViewById(R.id.search_edit_frame);
        View viewFindViewById = findViewById(R.id.search_plate);
        this.T = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.submit_area);
        this.U = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.V = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.W = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f968a0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f969b0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f976i0 = imageView5;
        viewFindViewById.setBackground(m4VarK.g(20));
        viewFindViewById2.setBackground(m4VarK.g(25));
        imageView.setImageDrawable(m4VarK.g(23));
        imageView2.setImageDrawable(m4VarK.g(15));
        imageView3.setImageDrawable(m4VarK.g(12));
        imageView4.setImageDrawable(m4VarK.g(28));
        imageView5.setImageDrawable(m4VarK.g(23));
        this.f977j0 = m4VarK.g(22);
        g0.C(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f978k0 = typedArray.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f979l0 = typedArray.getResourceId(13, 0);
        imageView.setOnClickListener(kVar);
        imageView3.setOnClickListener(kVar);
        imageView2.setOnClickListener(kVar);
        imageView4.setOnClickListener(kVar);
        searchAutoComplete.setOnClickListener(kVar);
        searchAutoComplete.addTextChangedListener(sVar);
        searchAutoComplete.setOnEditorActionListener(z1Var);
        searchAutoComplete.setOnItemClickListener(e0Var);
        searchAutoComplete.setOnItemSelectedListener(cVar);
        searchAutoComplete.setOnKeyListener(lVar);
        searchAutoComplete.setOnFocusChangeListener(new x1(this));
        setIconifiedByDefault(typedArray.getBoolean(18, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.f982o0 = typedArray.getText(14);
        this.f989v0 = typedArray.getText(21);
        int i13 = typedArray.getInt(6, -1);
        if (i13 != -1) {
            setImeOptions(i13);
        }
        int i14 = typedArray.getInt(5, -1);
        if (i14 != -1) {
            setInputType(i14);
        }
        setFocusable(typedArray.getBoolean(1, true));
        m4VarK.l();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f980m0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f981n0 = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f970c0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new y1(this, 0));
        }
        w(this.f985r0);
        t();
    }

    public void setOnCloseListener(a2 a2Var) {
    }

    public void setOnQueryTextListener(b2 b2Var) {
    }

    public void setOnSuggestionListener(c2 c2Var) {
    }
}
