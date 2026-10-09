package androidx.preference;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import p9.b;
import p9.r;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class PreferenceDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    public int H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DialogPreference f2341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CharSequence f2342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f2343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f2344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f2345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2346f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public BitmapDrawable f2347t;

    public final DialogPreference a() {
        if (this.f2341a == null) {
            this.f2341a = (DialogPreference) ((b) getTargetFragment()).b(getArguments().getString("key"));
        }
        return this.f2341a;
    }

    public void b(View view) {
        int i11;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.f2345e;
            if (TextUtils.isEmpty(charSequence)) {
                i11 = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i11 = 0;
            }
            if (viewFindViewById.getVisibility() != i11) {
                viewFindViewById.setVisibility(i11);
            }
        }
    }

    public abstract void c(boolean z11);

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.H = i11;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof b)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        b bVar = (b) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.f2342b = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f2343c = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.f2344d = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.f2345e = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.f2346f = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.f2347t = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) bVar.b(string);
        this.f2341a = dialogPreference;
        this.f2342b = dialogPreference.f2304p0;
        this.f2343c = dialogPreference.f2307s0;
        this.f2344d = dialogPreference.f2308t0;
        this.f2345e = dialogPreference.f2305q0;
        this.f2346f = dialogPreference.f2309u0;
        Drawable drawable = dialogPreference.f2306r0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.f2347t = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.f2347t = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.H = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.f2342b).setIcon(this.f2347t).setPositiveButton(this.f2343c, this).setNegativeButton(this.f2344d, this);
        int i11 = this.f2346f;
        View viewInflate = i11 != 0 ? LayoutInflater.from(activity).inflate(i11, (ViewGroup) null) : null;
        if (viewInflate != null) {
            b(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.f2345e);
        }
        d(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (this instanceof EditTextPreferenceDialogFragment) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                r.a(window);
                return alertDialogCreate;
            }
            window.setSoftInputMode(5);
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        c(this.H == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.f2342b);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f2343c);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.f2344d);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.f2345e);
        bundle.putInt("PreferenceDialogFragment.layout", this.f2346f);
        BitmapDrawable bitmapDrawable = this.f2347t;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    public void d(AlertDialog.Builder builder) {
    }
}
