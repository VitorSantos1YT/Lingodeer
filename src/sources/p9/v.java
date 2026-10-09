package p9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c1;
import androidx.fragment.app.k1;
import androidx.preference.DialogPreference;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingodeer.R;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v extends androidx.fragment.app.k0 implements c0, a0, b0, b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d0 f46705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RecyclerView f46706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f46707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f46708e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f46704a = new u(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f46709f = R.layout.preference_list_fragment;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l.g f46710t = new l.g(this, Looper.getMainLooper(), 3);
    public final aj.i H = new aj.i(this, 27);

    @Override // p9.b0
    public final void a() {
        for (androidx.fragment.app.k0 parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
        }
        getContext();
        getActivity();
    }

    @Override // p9.b
    public final Preference b(String str) {
        PreferenceScreen preferenceScreen;
        d0 d0Var = this.f46705b;
        if (d0Var == null || (preferenceScreen = d0Var.f46649g) == null) {
            return null;
        }
        return preferenceScreen.E(str);
    }

    @Override // p9.c0
    public final boolean i(Preference preference) {
        String str = preference.P;
        if (str == null) {
            return false;
        }
        for (androidx.fragment.app.k0 parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
        }
        getContext();
        getActivity();
        k1 parentFragmentManager = getParentFragmentManager();
        if (preference.Q == null) {
            preference.Q = new Bundle();
        }
        Bundle bundle = preference.Q;
        c1 c1VarJ = parentFragmentManager.J();
        requireActivity().getClassLoader();
        androidx.fragment.app.k0 k0VarA = c1VarJ.a(str);
        k0VarA.setArguments(bundle);
        k0VarA.setTargetFragment(this, 0);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
        aVar.e(((View) requireView().getParent()).getId(), k0VarA, null);
        if (!aVar.f1898h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        aVar.f1897g = true;
        aVar.f1899i = null;
        aVar.h();
        return true;
    }

    @Override // p9.a0
    public final void j(DialogPreference dialogPreference) {
        androidx.fragment.app.y lVar;
        for (androidx.fragment.app.k0 parentFragment = this; parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
        }
        getContext();
        getActivity();
        if (getParentFragmentManager().D("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (dialogPreference instanceof EditTextPreference) {
            String str = dialogPreference.N;
            lVar = new e();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            lVar.setArguments(bundle);
        } else if (dialogPreference instanceof ListPreference) {
            String str2 = dialogPreference.N;
            lVar = new i();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", str2);
            lVar.setArguments(bundle2);
        } else {
            if (!(dialogPreference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + dialogPreference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            String str3 = dialogPreference.N;
            lVar = new l();
            Bundle bundle3 = new Bundle(1);
            bundle3.putString("key", str3);
            lVar.setArguments(bundle3);
        }
        lVar.setTargetFragment(this, 0);
        lVar.u(getParentFragmentManager(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    @Override // androidx.fragment.app.k0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i11 = typedValue.resourceId;
        if (i11 == 0) {
            i11 = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i11, false);
        d0 d0Var = new d0(requireContext());
        this.f46705b = d0Var;
        d0Var.f46652j = this;
        if (getArguments() != null) {
            getArguments().getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT");
        }
        r();
    }

    @Override // androidx.fragment.app.k0
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        TypedArray typedArrayObtainStyledAttributes = requireContext().obtainStyledAttributes(null, h0.f46678i, R.attr.preferenceFragmentCompatStyle, 0);
        this.f46709f = typedArrayObtainStyledAttributes.getResourceId(0, this.f46709f);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(requireContext());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.f46709f, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        if (!requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) layoutInflaterCloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            requireContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            recyclerView.setAccessibilityDelegateCompat(new f0(recyclerView));
        }
        this.f46706c = recyclerView;
        u uVar = this.f46704a;
        recyclerView.addItemDecoration(uVar);
        if (drawable != null) {
            uVar.getClass();
            uVar.f46701b = drawable.getIntrinsicHeight();
        } else {
            uVar.f46701b = 0;
        }
        uVar.f46700a = drawable;
        v vVar = uVar.f46703d;
        vVar.f46706c.invalidateItemDecorations();
        if (dimensionPixelSize != -1) {
            uVar.f46701b = dimensionPixelSize;
            vVar.f46706c.invalidateItemDecorations();
        }
        uVar.f46702c = z11;
        if (this.f46706c.getParent() == null) {
            viewGroup2.addView(this.f46706c);
        }
        this.f46710t.post(this.H);
        return viewInflate;
    }

    @Override // androidx.fragment.app.k0
    public final void onDestroyView() {
        aj.i iVar = this.H;
        l.g gVar = this.f46710t;
        gVar.removeCallbacks(iVar);
        gVar.removeMessages(1);
        if (this.f46707d) {
            this.f46706c.setAdapter(null);
            PreferenceScreen preferenceScreen = this.f46705b.f46649g;
            if (preferenceScreen != null) {
                preferenceScreen.p();
            }
        }
        this.f46706c = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.k0
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        PreferenceScreen preferenceScreen = this.f46705b.f46649g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.k0
    public final void onStart() {
        super.onStart();
        d0 d0Var = this.f46705b;
        d0Var.f46650h = this;
        d0Var.f46651i = this;
    }

    @Override // androidx.fragment.app.k0
    public final void onStop() {
        super.onStop();
        d0 d0Var = this.f46705b;
        d0Var.f46650h = null;
        d0Var.f46651i = null;
    }

    @Override // androidx.fragment.app.k0
    public final void onViewCreated(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        super.onViewCreated(view, bundle);
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.f46705b.f46649g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.f46707d && (preferenceScreen = this.f46705b.f46649g) != null) {
            this.f46706c.setAdapter(new y(preferenceScreen));
            preferenceScreen.l();
        }
        this.f46708e = true;
    }

    public final void q(int i11) {
        d0 d0Var = this.f46705b;
        if (d0Var == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextRequireContext = requireContext();
        PreferenceScreen preferenceScreen = this.f46705b.f46649g;
        d0Var.f46647e = true;
        z zVar = new z(contextRequireContext, d0Var);
        XmlResourceParser xml = contextRequireContext.getResources().getXml(i11);
        try {
            PreferenceGroup preferenceGroupC = zVar.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) preferenceGroupC;
            preferenceScreen2.m(d0Var);
            SharedPreferences.Editor editor = d0Var.f46646d;
            if (editor != null) {
                editor.apply();
            }
            d0Var.f46647e = false;
            d0 d0Var2 = this.f46705b;
            PreferenceScreen preferenceScreen3 = d0Var2.f46649g;
            if (preferenceScreen2 != preferenceScreen3) {
                if (preferenceScreen3 != null) {
                    preferenceScreen3.p();
                }
                d0Var2.f46649g = preferenceScreen2;
                this.f46707d = true;
                if (this.f46708e) {
                    l.g gVar = this.f46710t;
                    if (gVar.hasMessages(1)) {
                        return;
                    }
                    gVar.obtainMessage(1).sendToTarget();
                }
            }
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }

    public abstract void r();
}
