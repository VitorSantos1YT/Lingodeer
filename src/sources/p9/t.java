package p9;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.preference.DialogPreference;
import i0.pKy.shrCcjmOhAmRC;

/* JADX INFO: compiled from: r8-map-id-0efd32d2926a16d016bd865e978a6a9d42a5302dcd598811e995dd081929f0a8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t extends androidx.fragment.app.y implements DialogInterface.OnClickListener {
    public DialogPreference S;
    public CharSequence T;
    public CharSequence U;
    public CharSequence V;
    public CharSequence W;
    public int X;
    public BitmapDrawable Y;
    public int Z;

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i11) {
        this.Z = i11;
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LifecycleOwner targetFragment = getTargetFragment();
        if (!(targetFragment instanceof b)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        b bVar = (b) targetFragment;
        String string = requireArguments().getString("key");
        if (bundle != null) {
            this.T = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.U = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.V = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.W = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.X = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.Y = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) bVar.b(string);
        this.S = dialogPreference;
        this.T = dialogPreference.f2304p0;
        this.U = dialogPreference.f2307s0;
        this.V = dialogPreference.f2308t0;
        this.W = dialogPreference.f2305q0;
        this.X = dialogPreference.f2309u0;
        Drawable drawable = dialogPreference.f2306r0;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.Y = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.Y = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // androidx.fragment.app.y, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        x(this.Z == -1);
    }

    @Override // androidx.fragment.app.y
    public final Dialog r(Bundle bundle) {
        this.Z = -2;
        l.j jVarC = new l.j(requireContext()).setTitle(this.T).a(this.Y).d(this.U, this).c(this.V, this);
        requireContext();
        int i11 = this.X;
        View viewInflate = i11 != 0 ? getLayoutInflater().inflate(i11, (ViewGroup) null) : null;
        if (viewInflate != null) {
            w(viewInflate);
            jVarC.setView(viewInflate);
        } else {
            jVarC.b(this.W);
        }
        y(jVarC);
        l.k kVarCreate = jVarC.create();
        if (this instanceof e) {
            Window window = kVarCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                s.a(window);
                return kVarCreate;
            }
            e eVar = (e) this;
            eVar.f46656d0 = SystemClock.currentThreadTimeMillis();
            eVar.z();
        }
        return kVarCreate;
    }

    public final DialogPreference v() {
        if (this.S == null) {
            this.S = (DialogPreference) ((b) getTargetFragment()).b(requireArguments().getString("key"));
        }
        return this.S;
    }

    public void w(View view) {
        int i11;
        View viewFindViewById = view.findViewById(R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.W;
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

    public abstract void x(boolean z11);

    public void y(l.j jVar) {
    }

    @Override // androidx.fragment.app.y, androidx.fragment.app.k0
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.T);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.U);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.V);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.W);
        bundle.putInt("PreferenceDialogFragment.layout", this.X);
        BitmapDrawable bitmapDrawable = this.Y;
        if (bitmapDrawable != null) {
            bundle.putParcelable(shrCcjmOhAmRC.wRRppayJMvMfJ, bitmapDrawable.getBitmap());
        }
    }
}
